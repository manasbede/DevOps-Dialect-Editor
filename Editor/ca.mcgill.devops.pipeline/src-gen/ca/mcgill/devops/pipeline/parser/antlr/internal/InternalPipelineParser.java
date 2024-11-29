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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CancelInProgress", "ContinueOnError", "SettableVariables", "WorkingDirectory", "BranchesIgnore", "TimeoutMinutes", "DownloadBuild", "MaxParallel", "PathsIgnore", "Pull_request", "Repositories", "Workflow_run", "Concurrency", "Credentials", "DisplayName", "Environment", "Permissions", "TagsIgnore", "AutoCancel", "Containers", "Deployment", "Entrypoint", "GetPackage", "Parameters", "Powershell", "Container", "DependsOn", "FailFast", "Pipelines", "Resources", "ReviewApp", "Schedules", "Variables", "Branches", "Checkout", "Defaults", "Download", "Excludes", "Includes", "MaxTime", "Packages", "Pipeline", "Required", "RunName", "Schedule", "Strategy", "Template", "Webhooks", "WriteAll", "Default", "Demands", "Exclude", "Extends", "Filters", "Include", "Inherit", "Options", "Outputs", "Publish", "ReadAll", "Rolling", "RunOnce", "RunsOn", "Secrets", "Trigger", "VmImage", "Builds", "Canary", "Docker", "Drafts", "Inputs", "Matrix", "Script", "Stages", "Target", "Values", "Build", "Group", "Image", "Needs", "Paths", "Ports", "Shell", "Stage", "Steps", "Types", "Args", "Bash", "Cron", "Jobs", "Name", "Path", "Pool", "Push", "Pwsh", "Size", "Tags", "Task", "Type", "Uses", "With", "Env", "Job", "Run", "Id", "If", "On", "Pr", "GreaterThanSignHyphenMinus", "ExclamationMark", "Asterisk", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "KW__", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "RULE_SINGLE_CHAR", "RULE_ID", "RULE_STRING", "RULE_HEX_INT", "RULE_FLOAT_LITERAL", "RULE_EXPRESSION", "RULE_INTV", "RULE_INT", "RULE_VERSION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "RULE_UNCLOSED_STRING", "RULE_BEGIN", "RULE_END"
    };
    public static final int Secrets=67;
    public static final int Pipelines=32;
    public static final int Size=99;
    public static final int Needs=83;
    public static final int Values=79;
    public static final int Image=82;
    public static final int RunName=47;
    public static final int Checkout=38;
    public static final int Matrix=75;
    public static final int RULE_VERSION=132;
    public static final int Docker=72;
    public static final int Concurrency=16;
    public static final int RunOnce=65;
    public static final int TagsIgnore=21;
    public static final int Stage=87;
    public static final int Pool=96;
    public static final int Extends=56;
    public static final int Push=97;
    public static final int Tags=100;
    public static final int ExclamationMark=113;
    public static final int Pr=111;
    public static final int Parameters=27;
    public static final int RULE_ID=125;
    public static final int SettableVariables=6;
    public static final int Defaults=39;
    public static final int MaxParallel=11;
    public static final int VerticalLine=122;
    public static final int RULE_INT=131;
    public static final int Outputs=61;
    public static final int RULE_ML_COMMENT=133;
    public static final int LeftSquareBracket=118;
    public static final int Resources=33;
    public static final int Id=108;
    public static final int ContinueOnError=5;
    public static final int If=109;
    public static final int Repositories=14;
    public static final int Schedules=35;
    public static final int Group=81;
    public static final int Powershell=28;
    public static final int Containers=23;
    public static final int DownloadBuild=10;
    public static final int VmImage=69;
    public static final int Excludes=41;
    public static final int Comma=115;
    public static final int Target=78;
    public static final int HyphenMinus=116;
    public static final int Jobs=93;
    public static final int RULE_SINGLE_CHAR=124;
    public static final int Paths=84;
    public static final int RightCurlyBracket=123;
    public static final int ReviewApp=34;
    public static final int Download=40;
    public static final int Path=95;
    public static final int RULE_HEX_INT=127;
    public static final int TimeoutMinutes=9;
    public static final int Canary=71;
    public static final int Stages=77;
    public static final int Rolling=64;
    public static final int Ports=85;
    public static final int Run=107;
    public static final int Default=53;
    public static final int Pipeline=45;
    public static final int Drafts=73;
    public static final int KW__=120;
    public static final int Type=102;
    public static final int Pull_request=13;
    public static final int Webhooks=51;
    public static final int Credentials=17;
    public static final int Types=89;
    public static final int Task=101;
    public static final int RULE_BEGIN=138;
    public static final int Deployment=24;
    public static final int Include=58;
    public static final int AutoCancel=22;
    public static final int Cron=92;
    public static final int Template=50;
    public static final int Name=94;
    public static final int Container=29;
    public static final int Filters=57;
    public static final int Trigger=68;
    public static final int Packages=44;
    public static final int ReadAll=63;
    public static final int Build=80;
    public static final int Permissions=20;
    public static final int Pwsh=98;
    public static final int Job=106;
    public static final int RULE_UNCLOSED_STRING=137;
    public static final int Inherit=59;
    public static final int RightSquareBracket=119;
    public static final int WorkingDirectory=7;
    public static final int Script=76;
    public static final int Builds=70;
    public static final int Branches=37;
    public static final int WriteAll=52;
    public static final int GetPackage=26;
    public static final int FailFast=31;
    public static final int GreaterThanSignHyphenMinus=112;
    public static final int Environment=19;
    public static final int MaxTime=43;
    public static final int Steps=88;
    public static final int Options=60;
    public static final int RULE_END=139;
    public static final int Exclude=55;
    public static final int Uses=103;
    public static final int Demands=54;
    public static final int RULE_STRING=126;
    public static final int Env=105;
    public static final int RULE_EXPRESSION=129;
    public static final int CancelInProgress=4;
    public static final int With=104;
    public static final int RULE_SL_COMMENT=134;
    public static final int Variables=36;
    public static final int Includes=42;
    public static final int RULE_FLOAT_LITERAL=128;
    public static final int Shell=86;
    public static final int Required=46;
    public static final int DisplayName=18;
    public static final int Colon=117;
    public static final int EOF=-1;
    public static final int Inputs=74;
    public static final int Asterisk=114;
    public static final int Publish=62;
    public static final int BranchesIgnore=8;
    public static final int Args=90;
    public static final int Entrypoint=25;
    public static final int PathsIgnore=12;
    public static final int RULE_WS=135;
    public static final int LeftCurlyBracket=121;
    public static final int Bash=91;
    public static final int RULE_ANY_OTHER=136;
    public static final int RULE_INTV=130;
    public static final int DependsOn=30;
    public static final int RunsOn=66;
    public static final int Schedule=48;
    public static final int Strategy=49;
    public static final int Workflow_run=15;
    public static final int On=110;

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
    // InternalPipelineParser.g:65:1: rulePipeline returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+ {...}?) ) ) ( ( ( (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs ) ) ) this_BEGIN_37= RULE_BEGIN ( ( (lv_stages_38_0= ruleStage ) )* | ( (lv_jobs_39_0= ruleJob ) )* ) this_END_40= RULE_END ) ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token this_END_15=null;
        Token this_END_16=null;
        Token otherlv_18=null;
        Token this_BEGIN_19=null;
        Token otherlv_20=null;
        Token lv_group_21_2=null;
        Token otherlv_22=null;
        Token lv_cancelProgress_23_1=null;
        Token lv_cancelProgress_23_3=null;
        Token this_END_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token this_BEGIN_32=null;
        Token this_END_34=null;
        Token lv_jobOrStage_36_1=null;
        Token lv_jobOrStage_36_2=null;
        Token this_BEGIN_37=null;
        Token this_END_40=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_pipelineConfigurations_3_0 = null;

        AntlrDatatypeRuleToken lv_run_name_5_0 = null;

        AntlrDatatypeRuleToken lv_default_shell_for_all_jobs_12_0 = null;

        AntlrDatatypeRuleToken lv_default_wd_for_all_jobs_14_0 = null;

        AntlrDatatypeRuleToken lv_group_21_1 = null;

        AntlrDatatypeRuleToken lv_cancelProgress_23_2 = null;

        EObject lv_triggers_26_0 = null;

        EObject lv_triggers_28_0 = null;

        EObject lv_triggers_30_0 = null;

        EObject lv_triggers_33_0 = null;

        EObject lv_triggers_35_0 = null;

        EObject lv_stages_38_0 = null;

        EObject lv_jobs_39_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:71:2: ( ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+ {...}?) ) ) ( ( ( (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs ) ) ) this_BEGIN_37= RULE_BEGIN ( ( (lv_stages_38_0= ruleStage ) )* | ( (lv_jobs_39_0= ruleJob ) )* ) this_END_40= RULE_END ) ) )
            // InternalPipelineParser.g:72:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+ {...}?) ) ) ( ( ( (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs ) ) ) this_BEGIN_37= RULE_BEGIN ( ( (lv_stages_38_0= ruleStage ) )* | ( (lv_jobs_39_0= ruleJob ) )* ) this_END_40= RULE_END ) )
            {
            // InternalPipelineParser.g:72:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+ {...}?) ) ) ( ( ( (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs ) ) ) this_BEGIN_37= RULE_BEGIN ( ( (lv_stages_38_0= ruleStage ) )* | ( (lv_jobs_39_0= ruleJob ) )* ) this_END_40= RULE_END ) )
            // InternalPipelineParser.g:73:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+ {...}?) ) ) ( ( ( (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs ) ) ) this_BEGIN_37= RULE_BEGIN ( ( (lv_stages_38_0= ruleStage ) )* | ( (lv_jobs_39_0= ruleJob ) )* ) this_END_40= RULE_END )
            {
            // InternalPipelineParser.g:73:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+ {...}?) ) )
            // InternalPipelineParser.g:74:4: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalPipelineParser.g:74:4: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+ {...}?) )
            // InternalPipelineParser.g:75:5: ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup_0());
            				
            // InternalPipelineParser.g:78:5: ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+ {...}?)
            // InternalPipelineParser.g:79:6: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+ {...}?
            {
            // InternalPipelineParser.g:79:6: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=7;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalPipelineParser.g:80:4: ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:80:4: ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) )
            	    // InternalPipelineParser.g:81:5: {...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalPipelineParser.g:81:105: ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) )
            	    // InternalPipelineParser.g:82:6: ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalPipelineParser.g:85:9: ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) )
            	    // InternalPipelineParser.g:85:10: {...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:85:19: (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) )
            	    // InternalPipelineParser.g:85:20: otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) )
            	    {
            	    otherlv_1=(Token)match(input,Name,FOLLOW_3); 

            	    									newLeafNode(otherlv_1, grammarAccess.getPipelineAccess().getNameKeyword_0_0_0());
            	    								
            	    // InternalPipelineParser.g:89:9: ( (lv_name_2_0= ruleStringValue ) )
            	    // InternalPipelineParser.g:90:10: (lv_name_2_0= ruleStringValue )
            	    {
            	    // InternalPipelineParser.g:90:10: (lv_name_2_0= ruleStringValue )
            	    // InternalPipelineParser.g:91:11: lv_name_2_0= ruleStringValue
            	    {

            	    											newCompositeNode(grammarAccess.getPipelineAccess().getNameStringValueParserRuleCall_0_0_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_name_2_0=ruleStringValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_2_0,
            	    												"ca.mcgill.devops.pipeline.Pipeline.StringValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:114:4: ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) )
            	    {
            	    // InternalPipelineParser.g:114:4: ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) )
            	    // InternalPipelineParser.g:115:5: {...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalPipelineParser.g:115:105: ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ )
            	    // InternalPipelineParser.g:116:6: ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalPipelineParser.g:119:9: ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        alt1 = dfa1.predict(input);
            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:119:10: {...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:119:19: ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) )
            	    	    // InternalPipelineParser.g:119:20: (lv_pipelineConfigurations_3_0= ruleConfiguration )
            	    	    {
            	    	    // InternalPipelineParser.g:119:20: (lv_pipelineConfigurations_3_0= ruleConfiguration )
            	    	    // InternalPipelineParser.g:120:10: lv_pipelineConfigurations_3_0= ruleConfiguration
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPipelineAccess().getPipelineConfigurationsConfigurationParserRuleCall_0_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_pipelineConfigurations_3_0=ruleConfiguration();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"pipelineConfigurations",
            	    	    											lv_pipelineConfigurations_3_0,
            	    	    											"ca.mcgill.devops.pipeline.Pipeline.Configuration");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPipelineParser.g:142:4: ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:142:4: ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) )
            	    // InternalPipelineParser.g:143:5: {...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalPipelineParser.g:143:105: ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) )
            	    // InternalPipelineParser.g:144:6: ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalPipelineParser.g:147:9: ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) )
            	    // InternalPipelineParser.g:147:10: {...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:147:19: (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) )
            	    // InternalPipelineParser.g:147:20: otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) )
            	    {
            	    otherlv_4=(Token)match(input,RunName,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPipelineAccess().getRunNameKeyword_0_2_0());
            	    								
            	    // InternalPipelineParser.g:151:9: ( (lv_run_name_5_0= ruleStringValue ) )
            	    // InternalPipelineParser.g:152:10: (lv_run_name_5_0= ruleStringValue )
            	    {
            	    // InternalPipelineParser.g:152:10: (lv_run_name_5_0= ruleStringValue )
            	    // InternalPipelineParser.g:153:11: lv_run_name_5_0= ruleStringValue
            	    {

            	    											newCompositeNode(grammarAccess.getPipelineAccess().getRun_nameStringValueParserRuleCall_0_2_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_run_name_5_0=ruleStringValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    											}
            	    											set(
            	    												current,
            	    												"run_name",
            	    												lv_run_name_5_0,
            	    												"ca.mcgill.devops.pipeline.Pipeline.StringValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPipelineParser.g:176:4: ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) )
            	    {
            	    // InternalPipelineParser.g:176:4: ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:177:5: {...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalPipelineParser.g:177:105: ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) )
            	    // InternalPipelineParser.g:178:6: ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 3);
            	    					
            	    // InternalPipelineParser.g:181:9: ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) )
            	    // InternalPipelineParser.g:181:10: {...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:181:19: (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END )
            	    // InternalPipelineParser.g:181:20: otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Defaults,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getPipelineAccess().getDefaultsKeyword_0_3_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_0_3_1());
            	    								
            	    otherlv_8=(Token)match(input,Run,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getPipelineAccess().getRunKeyword_0_3_2());
            	    								
            	    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    									newLeafNode(this_BEGIN_9, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_0_3_3());
            	    								
            	    // InternalPipelineParser.g:197:9: ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) )
            	    // InternalPipelineParser.g:198:10: ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) )
            	    {
            	    // InternalPipelineParser.g:198:10: ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) )
            	    // InternalPipelineParser.g:199:11: ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* )
            	    {
            	     
            	    										  getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4());
            	    										
            	    // InternalPipelineParser.g:202:11: ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* )
            	    // InternalPipelineParser.g:203:12: ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )*
            	    {
            	    // InternalPipelineParser.g:203:12: ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )*
            	    loop2:
            	    do {
            	        int alt2=3;
            	        int LA2_0 = input.LA(1);

            	        if ( LA2_0 == Shell && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4(), 0) ) {
            	            alt2=1;
            	        }
            	        else if ( LA2_0 == WorkingDirectory && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4(), 1) ) {
            	            alt2=2;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:204:10: ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:204:10: ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) )
            	    	    // InternalPipelineParser.g:205:11: {...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4(), 0) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4(), 0)");
            	    	    }
            	    	    // InternalPipelineParser.g:205:115: ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) )
            	    	    // InternalPipelineParser.g:206:12: ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) )
            	    	    {

            	    	    												getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4(), 0);
            	    	    											
            	    	    // InternalPipelineParser.g:209:15: ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) )
            	    	    // InternalPipelineParser.g:209:16: {...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:209:25: (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) )
            	    	    // InternalPipelineParser.g:209:26: otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,Shell,FOLLOW_3); 

            	    	    															newLeafNode(otherlv_11, grammarAccess.getPipelineAccess().getShellKeyword_0_3_4_0_0());
            	    	    														
            	    	    // InternalPipelineParser.g:213:15: ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) )
            	    	    // InternalPipelineParser.g:214:16: (lv_default_shell_for_all_jobs_12_0= ruleStringValue )
            	    	    {
            	    	    // InternalPipelineParser.g:214:16: (lv_default_shell_for_all_jobs_12_0= ruleStringValue )
            	    	    // InternalPipelineParser.g:215:17: lv_default_shell_for_all_jobs_12_0= ruleStringValue
            	    	    {

            	    	    																	newCompositeNode(grammarAccess.getPipelineAccess().getDefault_shell_for_all_jobsStringValueParserRuleCall_0_3_4_0_1_0());
            	    	    																
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_default_shell_for_all_jobs_12_0=ruleStringValue();

            	    	    state._fsp--;


            	    	    																	if (current==null) {
            	    	    																		current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    																	}
            	    	    																	set(
            	    	    																		current,
            	    	    																		"default_shell_for_all_jobs",
            	    	    																		lv_default_shell_for_all_jobs_12_0,
            	    	    																		"ca.mcgill.devops.pipeline.Pipeline.StringValue");
            	    	    																	afterParserOrEnumRuleCall();
            	    	    																

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4());
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalPipelineParser.g:238:10: ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:238:10: ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) )
            	    	    // InternalPipelineParser.g:239:11: {...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4(), 1) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4(), 1)");
            	    	    }
            	    	    // InternalPipelineParser.g:239:115: ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) )
            	    	    // InternalPipelineParser.g:240:12: ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) )
            	    	    {

            	    	    												getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4(), 1);
            	    	    											
            	    	    // InternalPipelineParser.g:243:15: ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) )
            	    	    // InternalPipelineParser.g:243:16: {...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:243:25: (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) )
            	    	    // InternalPipelineParser.g:243:26: otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,WorkingDirectory,FOLLOW_3); 

            	    	    															newLeafNode(otherlv_13, grammarAccess.getPipelineAccess().getWorkingDirectoryKeyword_0_3_4_1_0());
            	    	    														
            	    	    // InternalPipelineParser.g:247:15: ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) )
            	    	    // InternalPipelineParser.g:248:16: (lv_default_wd_for_all_jobs_14_0= ruleStringValue )
            	    	    {
            	    	    // InternalPipelineParser.g:248:16: (lv_default_wd_for_all_jobs_14_0= ruleStringValue )
            	    	    // InternalPipelineParser.g:249:17: lv_default_wd_for_all_jobs_14_0= ruleStringValue
            	    	    {

            	    	    																	newCompositeNode(grammarAccess.getPipelineAccess().getDefault_wd_for_all_jobsStringValueParserRuleCall_0_3_4_1_1_0());
            	    	    																
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_default_wd_for_all_jobs_14_0=ruleStringValue();

            	    	    state._fsp--;


            	    	    																	if (current==null) {
            	    	    																		current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    																	}
            	    	    																	set(
            	    	    																		current,
            	    	    																		"default_wd_for_all_jobs",
            	    	    																		lv_default_wd_for_all_jobs_14_0,
            	    	    																		"ca.mcgill.devops.pipeline.Pipeline.StringValue");
            	    	    																	afterParserOrEnumRuleCall();
            	    	    																

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4());
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    										  getUnorderedGroupHelper().leave(grammarAccess.getPipelineAccess().getUnorderedGroup_0_3_4());
            	    										

            	    }

            	    this_END_15=(Token)match(input,RULE_END,FOLLOW_8); 

            	    									newLeafNode(this_END_15, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_0_3_5());
            	    								
            	    this_END_16=(Token)match(input,RULE_END,FOLLOW_4); 

            	    									newLeafNode(this_END_16, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_0_3_6());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPipelineParser.g:293:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:293:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // InternalPipelineParser.g:294:5: {...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 4)");
            	    }
            	    // InternalPipelineParser.g:294:105: ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            	    // InternalPipelineParser.g:295:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 4);
            	    					
            	    // InternalPipelineParser.g:298:9: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) )
            	    // InternalPipelineParser.g:298:10: {...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:298:19: ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) )
            	    // InternalPipelineParser.g:298:20: ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) )
            	    {
            	    // InternalPipelineParser.g:298:20: ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) )
            	    // InternalPipelineParser.g:299:10: ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?)
            	    {
            	     
            	    									  getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4());
            	    									
            	    // InternalPipelineParser.g:302:10: ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?)
            	    // InternalPipelineParser.g:303:11: ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?
            	    {
            	    // InternalPipelineParser.g:303:11: ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=3;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==Concurrency) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4(), 0) ) {
            	                alt5=1;
            	            }


            	        }
            	        else if ( (LA5_0==CancelInProgress) ) {
            	            int LA5_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4(), 1) ) {
            	                alt5=2;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:304:9: ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:304:9: ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) )
            	    	    // InternalPipelineParser.g:305:10: {...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4(), 0) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4(), 0)");
            	    	    }
            	    	    // InternalPipelineParser.g:305:112: ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) )
            	    	    // InternalPipelineParser.g:306:11: ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4(), 0);
            	    	    										
            	    	    // InternalPipelineParser.g:309:14: ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) )
            	    	    // InternalPipelineParser.g:309:15: {...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:309:24: (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) )
            	    	    // InternalPipelineParser.g:309:25: otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,Concurrency,FOLLOW_5); 

            	    	    														newLeafNode(otherlv_18, grammarAccess.getPipelineAccess().getConcurrencyKeyword_0_4_0_0());
            	    	    													
            	    	    this_BEGIN_19=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

            	    	    														newLeafNode(this_BEGIN_19, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_0_4_0_1());
            	    	    													
            	    	    // InternalPipelineParser.g:317:14: (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) )
            	    	    // InternalPipelineParser.g:318:15: otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) )
            	    	    {
            	    	    otherlv_20=(Token)match(input,Group,FOLLOW_10); 

            	    	    															newLeafNode(otherlv_20, grammarAccess.getPipelineAccess().getGroupKeyword_0_4_0_2_0());
            	    	    														
            	    	    // InternalPipelineParser.g:322:15: ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) )
            	    	    // InternalPipelineParser.g:323:16: ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) )
            	    	    {
            	    	    // InternalPipelineParser.g:323:16: ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) )
            	    	    // InternalPipelineParser.g:324:17: (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION )
            	    	    {
            	    	    // InternalPipelineParser.g:324:17: (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION )
            	    	    int alt3=2;
            	    	    int LA3_0 = input.LA(1);

            	    	    if ( ((LA3_0>=RULE_SINGLE_CHAR && LA3_0<=RULE_STRING)||LA3_0==RULE_VERSION) ) {
            	    	        alt3=1;
            	    	    }
            	    	    else if ( (LA3_0==RULE_EXPRESSION) ) {
            	    	        alt3=2;
            	    	    }
            	    	    else {
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 3, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt3) {
            	    	        case 1 :
            	    	            // InternalPipelineParser.g:325:18: lv_group_21_1= ruleStringValue
            	    	            {

            	    	            																		newCompositeNode(grammarAccess.getPipelineAccess().getGroupStringValueParserRuleCall_0_4_0_2_1_0_0());
            	    	            																	
            	    	            pushFollow(FOLLOW_4);
            	    	            lv_group_21_1=ruleStringValue();

            	    	            state._fsp--;


            	    	            																		if (current==null) {
            	    	            																			current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	            																		}
            	    	            																		set(
            	    	            																			current,
            	    	            																			"group",
            	    	            																			lv_group_21_1,
            	    	            																			"ca.mcgill.devops.pipeline.Pipeline.StringValue");
            	    	            																		afterParserOrEnumRuleCall();
            	    	            																	

            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalPipelineParser.g:341:18: lv_group_21_2= RULE_EXPRESSION
            	    	            {
            	    	            lv_group_21_2=(Token)match(input,RULE_EXPRESSION,FOLLOW_4); 

            	    	            																		newLeafNode(lv_group_21_2, grammarAccess.getPipelineAccess().getGroupEXPRESSIONTerminalRuleCall_0_4_0_2_1_0_1());
            	    	            																	

            	    	            																		if (current==null) {
            	    	            																			current = createModelElement(grammarAccess.getPipelineRule());
            	    	            																		}
            	    	            																		setWithLastConsumed(
            	    	            																			current,
            	    	            																			"group",
            	    	            																			lv_group_21_2,
            	    	            																			"ca.mcgill.devops.pipeline.Pipeline.EXPRESSION");
            	    	            																	

            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalPipelineParser.g:365:9: ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:365:9: ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) )
            	    	    // InternalPipelineParser.g:366:10: {...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4(), 1) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4(), 1)");
            	    	    }
            	    	    // InternalPipelineParser.g:366:112: ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) )
            	    	    // InternalPipelineParser.g:367:11: ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4(), 1);
            	    	    										
            	    	    // InternalPipelineParser.g:370:14: ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) )
            	    	    // InternalPipelineParser.g:370:15: {...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:370:24: ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END )
            	    	    // InternalPipelineParser.g:370:25: (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END
            	    	    {
            	    	    // InternalPipelineParser.g:370:25: (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) )
            	    	    // InternalPipelineParser.g:371:15: otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) )
            	    	    {
            	    	    otherlv_22=(Token)match(input,CancelInProgress,FOLLOW_10); 

            	    	    															newLeafNode(otherlv_22, grammarAccess.getPipelineAccess().getCancelInProgressKeyword_0_4_1_0_0());
            	    	    														
            	    	    // InternalPipelineParser.g:375:15: ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) )
            	    	    // InternalPipelineParser.g:376:16: ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) )
            	    	    {
            	    	    // InternalPipelineParser.g:376:16: ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) )
            	    	    // InternalPipelineParser.g:377:17: (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION )
            	    	    {
            	    	    // InternalPipelineParser.g:377:17: (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION )
            	    	    int alt4=3;
            	    	    switch ( input.LA(1) ) {
            	    	    case RULE_ID:
            	    	        {
            	    	        alt4=1;
            	    	        }
            	    	        break;
            	    	    case RULE_SINGLE_CHAR:
            	    	    case RULE_STRING:
            	    	    case RULE_VERSION:
            	    	        {
            	    	        alt4=2;
            	    	        }
            	    	        break;
            	    	    case RULE_EXPRESSION:
            	    	        {
            	    	        alt4=3;
            	    	        }
            	    	        break;
            	    	    default:
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 4, 0, input);

            	    	        throw nvae;
            	    	    }

            	    	    switch (alt4) {
            	    	        case 1 :
            	    	            // InternalPipelineParser.g:378:18: lv_cancelProgress_23_1= RULE_ID
            	    	            {
            	    	            lv_cancelProgress_23_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    	            																		newLeafNode(lv_cancelProgress_23_1, grammarAccess.getPipelineAccess().getCancelProgressIDTerminalRuleCall_0_4_1_0_1_0_0());
            	    	            																	

            	    	            																		if (current==null) {
            	    	            																			current = createModelElement(grammarAccess.getPipelineRule());
            	    	            																		}
            	    	            																		setWithLastConsumed(
            	    	            																			current,
            	    	            																			"cancelProgress",
            	    	            																			lv_cancelProgress_23_1,
            	    	            																			"ca.mcgill.devops.pipeline.Pipeline.ID");
            	    	            																	

            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalPipelineParser.g:393:18: lv_cancelProgress_23_2= ruleStringValue
            	    	            {

            	    	            																		newCompositeNode(grammarAccess.getPipelineAccess().getCancelProgressStringValueParserRuleCall_0_4_1_0_1_0_1());
            	    	            																	
            	    	            pushFollow(FOLLOW_8);
            	    	            lv_cancelProgress_23_2=ruleStringValue();

            	    	            state._fsp--;


            	    	            																		if (current==null) {
            	    	            																			current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	            																		}
            	    	            																		set(
            	    	            																			current,
            	    	            																			"cancelProgress",
            	    	            																			lv_cancelProgress_23_2,
            	    	            																			"ca.mcgill.devops.pipeline.Pipeline.StringValue");
            	    	            																		afterParserOrEnumRuleCall();
            	    	            																	

            	    	            }
            	    	            break;
            	    	        case 3 :
            	    	            // InternalPipelineParser.g:409:18: lv_cancelProgress_23_3= RULE_EXPRESSION
            	    	            {
            	    	            lv_cancelProgress_23_3=(Token)match(input,RULE_EXPRESSION,FOLLOW_8); 

            	    	            																		newLeafNode(lv_cancelProgress_23_3, grammarAccess.getPipelineAccess().getCancelProgressEXPRESSIONTerminalRuleCall_0_4_1_0_1_0_2());
            	    	            																	

            	    	            																		if (current==null) {
            	    	            																			current = createModelElement(grammarAccess.getPipelineRule());
            	    	            																		}
            	    	            																		setWithLastConsumed(
            	    	            																			current,
            	    	            																			"cancelProgress",
            	    	            																			lv_cancelProgress_23_3,
            	    	            																			"ca.mcgill.devops.pipeline.Pipeline.EXPRESSION");
            	    	            																	

            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	    this_END_24=(Token)match(input,RULE_END,FOLLOW_4); 

            	    	    														newLeafNode(this_END_24, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_0_4_1_1());
            	    	    													

            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4());
            	    	    										

            	    	    }


            	    	    }


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

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4()) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4())");
            	    }

            	    }


            	    }

            	     
            	    									  getUnorderedGroupHelper().leave(grammarAccess.getPipelineAccess().getUnorderedGroup_0_4());
            	    									

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalPipelineParser.g:450:4: ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) )
            	    {
            	    // InternalPipelineParser.g:450:4: ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) )
            	    // InternalPipelineParser.g:451:5: {...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5)");
            	    }
            	    // InternalPipelineParser.g:451:105: ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) )
            	    // InternalPipelineParser.g:452:6: ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5);
            	    					
            	    // InternalPipelineParser.g:455:9: ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) )
            	    // InternalPipelineParser.g:455:10: {...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:455:19: ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* )
            	    // InternalPipelineParser.g:455:20: (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )*
            	    {
            	    // InternalPipelineParser.g:455:20: (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==On) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalPipelineParser.g:456:10: otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )?
            	            {
            	            otherlv_25=(Token)match(input,On,FOLLOW_11); 

            	            										newLeafNode(otherlv_25, grammarAccess.getPipelineAccess().getOnKeyword_0_5_0_0());
            	            									
            	            // InternalPipelineParser.g:460:10: ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )?
            	            int alt7=3;
            	            alt7 = dfa7.predict(input);
            	            switch (alt7) {
            	                case 1 :
            	                    // InternalPipelineParser.g:461:11: ( (lv_triggers_26_0= ruleEvent ) )
            	                    {
            	                    // InternalPipelineParser.g:461:11: ( (lv_triggers_26_0= ruleEvent ) )
            	                    // InternalPipelineParser.g:462:12: (lv_triggers_26_0= ruleEvent )
            	                    {
            	                    // InternalPipelineParser.g:462:12: (lv_triggers_26_0= ruleEvent )
            	                    // InternalPipelineParser.g:463:13: lv_triggers_26_0= ruleEvent
            	                    {

            	                    													newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_0_5_0_1_0_0());
            	                    												
            	                    pushFollow(FOLLOW_12);
            	                    lv_triggers_26_0=ruleEvent();

            	                    state._fsp--;


            	                    													if (current==null) {
            	                    														current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    													}
            	                    													add(
            	                    														current,
            	                    														"triggers",
            	                    														lv_triggers_26_0,
            	                    														"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    													afterParserOrEnumRuleCall();
            	                    												

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalPipelineParser.g:481:11: (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket )
            	                    {
            	                    // InternalPipelineParser.g:481:11: (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket )
            	                    // InternalPipelineParser.g:482:12: otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket
            	                    {
            	                    otherlv_27=(Token)match(input,LeftSquareBracket,FOLLOW_13); 

            	                    												newLeafNode(otherlv_27, grammarAccess.getPipelineAccess().getLeftSquareBracketKeyword_0_5_0_1_1_0());
            	                    											
            	                    // InternalPipelineParser.g:486:12: ( (lv_triggers_28_0= ruleEvent ) )
            	                    // InternalPipelineParser.g:487:13: (lv_triggers_28_0= ruleEvent )
            	                    {
            	                    // InternalPipelineParser.g:487:13: (lv_triggers_28_0= ruleEvent )
            	                    // InternalPipelineParser.g:488:14: lv_triggers_28_0= ruleEvent
            	                    {

            	                    														newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_0_5_0_1_1_1_0());
            	                    													
            	                    pushFollow(FOLLOW_14);
            	                    lv_triggers_28_0=ruleEvent();

            	                    state._fsp--;


            	                    														if (current==null) {
            	                    															current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    														}
            	                    														add(
            	                    															current,
            	                    															"triggers",
            	                    															lv_triggers_28_0,
            	                    															"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    														afterParserOrEnumRuleCall();
            	                    													

            	                    }


            	                    }

            	                    // InternalPipelineParser.g:505:12: (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )*
            	                    loop6:
            	                    do {
            	                        int alt6=2;
            	                        int LA6_0 = input.LA(1);

            	                        if ( (LA6_0==Comma) ) {
            	                            alt6=1;
            	                        }


            	                        switch (alt6) {
            	                    	case 1 :
            	                    	    // InternalPipelineParser.g:506:13: otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) )
            	                    	    {
            	                    	    otherlv_29=(Token)match(input,Comma,FOLLOW_13); 

            	                    	    													newLeafNode(otherlv_29, grammarAccess.getPipelineAccess().getCommaKeyword_0_5_0_1_1_2_0());
            	                    	    												
            	                    	    // InternalPipelineParser.g:510:13: ( (lv_triggers_30_0= ruleEvent ) )
            	                    	    // InternalPipelineParser.g:511:14: (lv_triggers_30_0= ruleEvent )
            	                    	    {
            	                    	    // InternalPipelineParser.g:511:14: (lv_triggers_30_0= ruleEvent )
            	                    	    // InternalPipelineParser.g:512:15: lv_triggers_30_0= ruleEvent
            	                    	    {

            	                    	    															newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_0_5_0_1_1_2_1_0());
            	                    	    														
            	                    	    pushFollow(FOLLOW_14);
            	                    	    lv_triggers_30_0=ruleEvent();

            	                    	    state._fsp--;


            	                    	    															if (current==null) {
            	                    	    																current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    	    															}
            	                    	    															add(
            	                    	    																current,
            	                    	    																"triggers",
            	                    	    																lv_triggers_30_0,
            	                    	    																"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    	    															afterParserOrEnumRuleCall();
            	                    	    														

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop6;
            	                        }
            	                    } while (true);

            	                    otherlv_31=(Token)match(input,RightSquareBracket,FOLLOW_12); 

            	                    												newLeafNode(otherlv_31, grammarAccess.getPipelineAccess().getRightSquareBracketKeyword_0_5_0_1_1_3());
            	                    											

            	                    }


            	                    }
            	                    break;

            	            }

            	            // InternalPipelineParser.g:536:10: (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )?
            	            int alt9=2;
            	            int LA9_0 = input.LA(1);

            	            if ( (LA9_0==RULE_BEGIN) ) {
            	                alt9=1;
            	            }
            	            switch (alt9) {
            	                case 1 :
            	                    // InternalPipelineParser.g:537:11: this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END
            	                    {
            	                    this_BEGIN_32=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	                    											newLeafNode(this_BEGIN_32, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_0_5_0_2_0());
            	                    										
            	                    // InternalPipelineParser.g:541:11: ( (lv_triggers_33_0= ruleEvent ) )*
            	                    loop8:
            	                    do {
            	                        int alt8=2;
            	                        int LA8_0 = input.LA(1);

            	                        if ( ((LA8_0>=ContinueOnError && LA8_0<=Credentials)||(LA8_0>=Environment && LA8_0<=TagsIgnore)||(LA8_0>=Containers && LA8_0<=Entrypoint)||LA8_0==Container||(LA8_0>=FailFast && LA8_0<=Branches)||LA8_0==Defaults||(LA8_0>=Packages && LA8_0<=Webhooks)||(LA8_0>=Exclude && LA8_0<=Inherit)||LA8_0==Outputs||(LA8_0>=Rolling && LA8_0<=Trigger)||(LA8_0>=Builds && LA8_0<=Canary)||(LA8_0>=Inputs && LA8_0<=Script)||LA8_0==Target||(LA8_0>=Build && LA8_0<=Shell)||(LA8_0>=Types && LA8_0<=Args)||LA8_0==Cron||(LA8_0>=Name && LA8_0<=Path)||LA8_0==Push||LA8_0==Tags||(LA8_0>=Type && LA8_0<=Uses)||LA8_0==Env||(LA8_0>=Id && LA8_0<=Pr)||(LA8_0>=RULE_ID && LA8_0<=RULE_STRING)) ) {
            	                            alt8=1;
            	                        }


            	                        switch (alt8) {
            	                    	case 1 :
            	                    	    // InternalPipelineParser.g:542:12: (lv_triggers_33_0= ruleEvent )
            	                    	    {
            	                    	    // InternalPipelineParser.g:542:12: (lv_triggers_33_0= ruleEvent )
            	                    	    // InternalPipelineParser.g:543:13: lv_triggers_33_0= ruleEvent
            	                    	    {

            	                    	    													newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_0_5_0_2_1_0());
            	                    	    												
            	                    	    pushFollow(FOLLOW_15);
            	                    	    lv_triggers_33_0=ruleEvent();

            	                    	    state._fsp--;


            	                    	    													if (current==null) {
            	                    	    														current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    	    													}
            	                    	    													add(
            	                    	    														current,
            	                    	    														"triggers",
            	                    	    														lv_triggers_33_0,
            	                    	    														"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    	    													afterParserOrEnumRuleCall();
            	                    	    												

            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop8;
            	                        }
            	                    } while (true);

            	                    this_END_34=(Token)match(input,RULE_END,FOLLOW_4); 

            	                    											newLeafNode(this_END_34, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_0_5_0_2_2());
            	                    										

            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    // InternalPipelineParser.g:566:9: ( (lv_triggers_35_0= ruleEvent ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        alt11 = dfa11.predict(input);
            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:567:10: (lv_triggers_35_0= ruleEvent )
            	    	    {
            	    	    // InternalPipelineParser.g:567:10: (lv_triggers_35_0= ruleEvent )
            	    	    // InternalPipelineParser.g:568:11: lv_triggers_35_0= ruleEvent
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_0_5_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_triggers_35_0=ruleEvent();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"triggers",
            	    	    												lv_triggers_35_0,
            	    	    												"ca.mcgill.devops.pipeline.Pipeline.Event");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPipelineAccess().getUnorderedGroup_0());
            				

            }

            // InternalPipelineParser.g:599:3: ( ( ( (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs ) ) ) this_BEGIN_37= RULE_BEGIN ( ( (lv_stages_38_0= ruleStage ) )* | ( (lv_jobs_39_0= ruleJob ) )* ) this_END_40= RULE_END )
            // InternalPipelineParser.g:600:4: ( ( (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs ) ) ) this_BEGIN_37= RULE_BEGIN ( ( (lv_stages_38_0= ruleStage ) )* | ( (lv_jobs_39_0= ruleJob ) )* ) this_END_40= RULE_END
            {
            // InternalPipelineParser.g:600:4: ( ( (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs ) ) )
            // InternalPipelineParser.g:601:5: ( (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs ) )
            {
            // InternalPipelineParser.g:601:5: ( (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs ) )
            // InternalPipelineParser.g:602:6: (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs )
            {
            // InternalPipelineParser.g:602:6: (lv_jobOrStage_36_1= Stages | lv_jobOrStage_36_2= Jobs )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Stages) ) {
                alt13=1;
            }
            else if ( (LA13_0==Jobs) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPipelineParser.g:603:7: lv_jobOrStage_36_1= Stages
                    {
                    lv_jobOrStage_36_1=(Token)match(input,Stages,FOLLOW_5); 

                    							newLeafNode(lv_jobOrStage_36_1, grammarAccess.getPipelineAccess().getJobOrStageStagesKeyword_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPipelineRule());
                    							}
                    							setWithLastConsumed(current, "jobOrStage", lv_jobOrStage_36_1, null);
                    						

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:614:7: lv_jobOrStage_36_2= Jobs
                    {
                    lv_jobOrStage_36_2=(Token)match(input,Jobs,FOLLOW_5); 

                    							newLeafNode(lv_jobOrStage_36_2, grammarAccess.getPipelineAccess().getJobOrStageJobsKeyword_1_0_0_1());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPipelineRule());
                    							}
                    							setWithLastConsumed(current, "jobOrStage", lv_jobOrStage_36_2, null);
                    						

                    }
                    break;

            }


            }


            }

            this_BEGIN_37=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            				newLeafNode(this_BEGIN_37, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_1_1());
            			
            // InternalPipelineParser.g:631:4: ( ( (lv_stages_38_0= ruleStage ) )* | ( (lv_jobs_39_0= ruleJob ) )* )
            int alt16=2;
            switch ( input.LA(1) ) {
            case HyphenMinus:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==Job) ) {
                    alt16=2;
                }
                else if ( (LA16_1==Stage) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_END:
                {
                alt16=1;
                }
                break;
            case RULE_SINGLE_CHAR:
            case RULE_ID:
            case RULE_STRING:
            case RULE_VERSION:
                {
                alt16=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPipelineParser.g:632:5: ( (lv_stages_38_0= ruleStage ) )*
                    {
                    // InternalPipelineParser.g:632:5: ( (lv_stages_38_0= ruleStage ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==HyphenMinus) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalPipelineParser.g:633:6: (lv_stages_38_0= ruleStage )
                    	    {
                    	    // InternalPipelineParser.g:633:6: (lv_stages_38_0= ruleStage )
                    	    // InternalPipelineParser.g:634:7: lv_stages_38_0= ruleStage
                    	    {

                    	    							newCompositeNode(grammarAccess.getPipelineAccess().getStagesStageParserRuleCall_1_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_stages_38_0=ruleStage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"stages",
                    	    								lv_stages_38_0,
                    	    								"ca.mcgill.devops.pipeline.Pipeline.Stage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:652:5: ( (lv_jobs_39_0= ruleJob ) )*
                    {
                    // InternalPipelineParser.g:652:5: ( (lv_jobs_39_0= ruleJob ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==HyphenMinus||(LA15_0>=RULE_SINGLE_CHAR && LA15_0<=RULE_STRING)||LA15_0==RULE_VERSION) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPipelineParser.g:653:6: (lv_jobs_39_0= ruleJob )
                    	    {
                    	    // InternalPipelineParser.g:653:6: (lv_jobs_39_0= ruleJob )
                    	    // InternalPipelineParser.g:654:7: lv_jobs_39_0= ruleJob
                    	    {

                    	    							newCompositeNode(grammarAccess.getPipelineAccess().getJobsJobParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_jobs_39_0=ruleJob();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"jobs",
                    	    								lv_jobs_39_0,
                    	    								"ca.mcgill.devops.pipeline.Pipeline.Job");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            this_END_40=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_40, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "rulePipeline"


    // $ANTLR start "entryRuleConfiguration"
    // InternalPipelineParser.g:681:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalPipelineParser.g:681:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalPipelineParser.g:682:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalPipelineParser.g:688:1: ruleConfiguration returns [EObject current=null] : ( ( (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* ) | (otherlv_2= Variables ( (lv_variablesValue_3_0= RULE_STRING ) ) ) | (otherlv_4= Pool ( ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) ) )? ) | (otherlv_15= Resources ( (lv_resource_16_0= RULE_STRING ) ) ) | (otherlv_17= Schedules ( (lv_schedule_18_0= RULE_STRING ) ) ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_variablesValue_3_0=null;
        Token otherlv_4=null;
        Token lv_poolID_5_1=null;
        Token lv_poolID_5_2=null;
        Token this_BEGIN_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_END_14=null;
        Token otherlv_15=null;
        Token lv_resource_16_0=null;
        Token otherlv_17=null;
        Token lv_schedule_18_0=null;
        Token otherlv_20=null;
        Token this_BEGIN_21=null;
        Token otherlv_22=null;
        Token this_INT_23=null;
        Token otherlv_24=null;
        Token this_ID_25=null;
        Token otherlv_26=null;
        Token this_ID_27=null;
        Token this_END_28=null;
        EObject lv_parameters_1_0 = null;

        AntlrDatatypeRuleToken lv_poolName_9_0 = null;

        AntlrDatatypeRuleToken lv_poolVm_11_0 = null;

        AntlrDatatypeRuleToken lv_poolDemands_13_1 = null;

        AntlrDatatypeRuleToken lv_poolDemands_13_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:694:2: ( ( ( (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* ) | (otherlv_2= Variables ( (lv_variablesValue_3_0= RULE_STRING ) ) ) | (otherlv_4= Pool ( ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) ) )? ) | (otherlv_15= Resources ( (lv_resource_16_0= RULE_STRING ) ) ) | (otherlv_17= Schedules ( (lv_schedule_18_0= RULE_STRING ) ) ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            // InternalPipelineParser.g:695:2: ( ( (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* ) | (otherlv_2= Variables ( (lv_variablesValue_3_0= RULE_STRING ) ) ) | (otherlv_4= Pool ( ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) ) )? ) | (otherlv_15= Resources ( (lv_resource_16_0= RULE_STRING ) ) ) | (otherlv_17= Schedules ( (lv_schedule_18_0= RULE_STRING ) ) ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalPipelineParser.g:695:2: ( ( (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* ) | (otherlv_2= Variables ( (lv_variablesValue_3_0= RULE_STRING ) ) ) | (otherlv_4= Pool ( ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) ) )? ) | (otherlv_15= Resources ( (lv_resource_16_0= RULE_STRING ) ) ) | (otherlv_17= Schedules ( (lv_schedule_18_0= RULE_STRING ) ) ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+ {...}?) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Parameters||LA30_0==Resources||(LA30_0>=Schedules && LA30_0<=Variables)||LA30_0==Pool) ) {
                alt30=1;
            }
            else if ( (LA30_0==Options||LA30_0==Docker||LA30_0==Size||LA30_0==RULE_END) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPipelineParser.g:696:3: ( (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* ) | (otherlv_2= Variables ( (lv_variablesValue_3_0= RULE_STRING ) ) ) | (otherlv_4= Pool ( ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) ) )? ) | (otherlv_15= Resources ( (lv_resource_16_0= RULE_STRING ) ) ) | (otherlv_17= Schedules ( (lv_schedule_18_0= RULE_STRING ) ) ) )
                    {
                    // InternalPipelineParser.g:696:3: ( (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* ) | (otherlv_2= Variables ( (lv_variablesValue_3_0= RULE_STRING ) ) ) | (otherlv_4= Pool ( ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) ) )? ) | (otherlv_15= Resources ( (lv_resource_16_0= RULE_STRING ) ) ) | (otherlv_17= Schedules ( (lv_schedule_18_0= RULE_STRING ) ) ) )
                    int alt26=5;
                    switch ( input.LA(1) ) {
                    case Parameters:
                        {
                        alt26=1;
                        }
                        break;
                    case Variables:
                        {
                        alt26=2;
                        }
                        break;
                    case Pool:
                        {
                        alt26=3;
                        }
                        break;
                    case Resources:
                        {
                        alt26=4;
                        }
                        break;
                    case Schedules:
                        {
                        alt26=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // InternalPipelineParser.g:697:4: (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* )
                            {
                            // InternalPipelineParser.g:697:4: (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* )
                            // InternalPipelineParser.g:698:5: otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )*
                            {
                            otherlv_0=(Token)match(input,Parameters,FOLLOW_18); 

                            					newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getParametersKeyword_0_0_0());
                            				
                            // InternalPipelineParser.g:702:5: ( (lv_parameters_1_0= ruleParameter ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==DisplayName||LA17_0==Default||LA17_0==Values||LA17_0==HyphenMinus||(LA17_0>=RULE_BEGIN && LA17_0<=RULE_END)) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalPipelineParser.g:703:6: (lv_parameters_1_0= ruleParameter )
                            	    {
                            	    // InternalPipelineParser.g:703:6: (lv_parameters_1_0= ruleParameter )
                            	    // InternalPipelineParser.g:704:7: lv_parameters_1_0= ruleParameter
                            	    {

                            	    							newCompositeNode(grammarAccess.getConfigurationAccess().getParametersParameterParserRuleCall_0_0_1_0());
                            	    						
                            	    pushFollow(FOLLOW_18);
                            	    lv_parameters_1_0=ruleParameter();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getConfigurationRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"parameters",
                            	    								lv_parameters_1_0,
                            	    								"ca.mcgill.devops.pipeline.Pipeline.Parameter");
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
                            break;
                        case 2 :
                            // InternalPipelineParser.g:723:4: (otherlv_2= Variables ( (lv_variablesValue_3_0= RULE_STRING ) ) )
                            {
                            // InternalPipelineParser.g:723:4: (otherlv_2= Variables ( (lv_variablesValue_3_0= RULE_STRING ) ) )
                            // InternalPipelineParser.g:724:5: otherlv_2= Variables ( (lv_variablesValue_3_0= RULE_STRING ) )
                            {
                            otherlv_2=(Token)match(input,Variables,FOLLOW_19); 

                            					newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getVariablesKeyword_0_1_0());
                            				
                            // InternalPipelineParser.g:728:5: ( (lv_variablesValue_3_0= RULE_STRING ) )
                            // InternalPipelineParser.g:729:6: (lv_variablesValue_3_0= RULE_STRING )
                            {
                            // InternalPipelineParser.g:729:6: (lv_variablesValue_3_0= RULE_STRING )
                            // InternalPipelineParser.g:730:7: lv_variablesValue_3_0= RULE_STRING
                            {
                            lv_variablesValue_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_variablesValue_3_0, grammarAccess.getConfigurationAccess().getVariablesValueSTRINGTerminalRuleCall_0_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConfigurationRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"variablesValue",
                            								lv_variablesValue_3_0,
                            								"ca.mcgill.devops.pipeline.Pipeline.STRING");
                            						

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPipelineParser.g:748:4: (otherlv_4= Pool ( ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) ) )? )
                            {
                            // InternalPipelineParser.g:748:4: (otherlv_4= Pool ( ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) ) )? )
                            // InternalPipelineParser.g:749:5: otherlv_4= Pool ( ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) ) )?
                            {
                            otherlv_4=(Token)match(input,Pool,FOLLOW_20); 

                            					newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getPoolKeyword_0_2_0());
                            				
                            // InternalPipelineParser.g:753:5: ( ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) ) )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==RULE_ID) ) {
                                alt19=1;
                            }
                            else if ( (LA19_0==RULE_STRING) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // InternalPipelineParser.g:754:6: ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) )
                                    {
                                    // InternalPipelineParser.g:754:6: ( (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING ) )
                                    // InternalPipelineParser.g:755:7: (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING )
                                    {
                                    // InternalPipelineParser.g:755:7: (lv_poolID_5_1= RULE_ID | lv_poolID_5_2= RULE_STRING )
                                    int alt18=2;
                                    int LA18_0 = input.LA(1);

                                    if ( (LA18_0==RULE_ID) ) {
                                        alt18=1;
                                    }
                                    else if ( (LA18_0==RULE_STRING) ) {
                                        alt18=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 18, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt18) {
                                        case 1 :
                                            // InternalPipelineParser.g:756:8: lv_poolID_5_1= RULE_ID
                                            {
                                            lv_poolID_5_1=(Token)match(input,RULE_ID,FOLLOW_21); 

                                            								newLeafNode(lv_poolID_5_1, grammarAccess.getConfigurationAccess().getPoolIDIDTerminalRuleCall_0_2_1_0_0());
                                            							

                                            								if (current==null) {
                                            									current = createModelElement(grammarAccess.getConfigurationRule());
                                            								}
                                            								setWithLastConsumed(
                                            									current,
                                            									"poolID",
                                            									lv_poolID_5_1,
                                            									"ca.mcgill.devops.pipeline.Pipeline.ID");
                                            							

                                            }
                                            break;
                                        case 2 :
                                            // InternalPipelineParser.g:771:8: lv_poolID_5_2= RULE_STRING
                                            {
                                            lv_poolID_5_2=(Token)match(input,RULE_STRING,FOLLOW_21); 

                                            								newLeafNode(lv_poolID_5_2, grammarAccess.getConfigurationAccess().getPoolIDSTRINGTerminalRuleCall_0_2_1_0_1());
                                            							

                                            								if (current==null) {
                                            									current = createModelElement(grammarAccess.getConfigurationRule());
                                            								}
                                            								setWithLastConsumed(
                                            									current,
                                            									"poolID",
                                            									lv_poolID_5_2,
                                            									"ca.mcgill.devops.pipeline.Pipeline.STRING");
                                            							

                                            }
                                            break;

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalPipelineParser.g:788:5: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) ) )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==Demands||LA25_0==RULE_BEGIN) ) {
                                alt25=1;
                            }
                            else if ( (LA25_0==RULE_END) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalPipelineParser.g:789:6: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) )
                                    {
                                    // InternalPipelineParser.g:789:6: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?) )
                                    // InternalPipelineParser.g:790:7: ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?)
                                    {
                                     
                                    						  getUnorderedGroupHelper().enter(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2());
                                    						
                                    // InternalPipelineParser.g:793:7: ( ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?)
                                    // InternalPipelineParser.g:794:8: ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+ {...}?
                                    {
                                    // InternalPipelineParser.g:794:8: ( ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) ) )+
                                    int cnt24=0;
                                    loop24:
                                    do {
                                        int alt24=3;
                                        int LA24_0 = input.LA(1);

                                        if ( (LA24_0==RULE_END) ) {
                                            int LA24_2 = input.LA(2);

                                            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2(), 1) ) {
                                                alt24=2;
                                            }


                                        }
                                        else if ( LA24_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2(), 0) ) {
                                            alt24=1;
                                        }
                                        else if ( LA24_0 == Demands && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2(), 1) ) {
                                            alt24=2;
                                        }


                                        switch (alt24) {
                                    	case 1 :
                                    	    // InternalPipelineParser.g:795:6: ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) )
                                    	    {
                                    	    // InternalPipelineParser.g:795:6: ({...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) ) )
                                    	    // InternalPipelineParser.g:796:7: {...}? => ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) )
                                    	    {
                                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2(), 0) ) {
                                    	        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2(), 0)");
                                    	    }
                                    	    // InternalPipelineParser.g:796:116: ( ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) ) )
                                    	    // InternalPipelineParser.g:797:8: ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) )
                                    	    {

                                    	    								getUnorderedGroupHelper().select(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2(), 0);
                                    	    							
                                    	    // InternalPipelineParser.g:800:11: ({...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? ) )
                                    	    // InternalPipelineParser.g:800:12: {...}? => (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? )
                                    	    {
                                    	    if ( !((true)) ) {
                                    	        throw new FailedPredicateException(input, "ruleConfiguration", "true");
                                    	    }
                                    	    // InternalPipelineParser.g:800:21: (this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )? )
                                    	    // InternalPipelineParser.g:800:22: this_BEGIN_7= RULE_BEGIN (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )? (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )?
                                    	    {
                                    	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_22); 

                                    	    											newLeafNode(this_BEGIN_7, grammarAccess.getConfigurationAccess().getBEGINTerminalRuleCall_0_2_2_0_0());
                                    	    										
                                    	    // InternalPipelineParser.g:804:11: (otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) ) )?
                                    	    int alt20=2;
                                    	    int LA20_0 = input.LA(1);

                                    	    if ( (LA20_0==Name) ) {
                                    	        switch ( input.LA(2) ) {
                                    	            case RULE_ID:
                                    	                {
                                    	                alt20=1;
                                    	                }
                                    	                break;
                                    	            case RULE_SINGLE_CHAR:
                                    	                {
                                    	                alt20=1;
                                    	                }
                                    	                break;
                                    	            case RULE_STRING:
                                    	                {
                                    	                alt20=1;
                                    	                }
                                    	                break;
                                    	            case RULE_VERSION:
                                    	                {
                                    	                alt20=1;
                                    	                }
                                    	                break;
                                    	        }

                                    	    }
                                    	    switch (alt20) {
                                    	        case 1 :
                                    	            // InternalPipelineParser.g:805:12: otherlv_8= Name ( (lv_poolName_9_0= ruleStringValue ) )
                                    	            {
                                    	            otherlv_8=(Token)match(input,Name,FOLLOW_3); 

                                    	            												newLeafNode(otherlv_8, grammarAccess.getConfigurationAccess().getNameKeyword_0_2_2_0_1_0());
                                    	            											
                                    	            // InternalPipelineParser.g:809:12: ( (lv_poolName_9_0= ruleStringValue ) )
                                    	            // InternalPipelineParser.g:810:13: (lv_poolName_9_0= ruleStringValue )
                                    	            {
                                    	            // InternalPipelineParser.g:810:13: (lv_poolName_9_0= ruleStringValue )
                                    	            // InternalPipelineParser.g:811:14: lv_poolName_9_0= ruleStringValue
                                    	            {

                                    	            														newCompositeNode(grammarAccess.getConfigurationAccess().getPoolNameStringValueParserRuleCall_0_2_2_0_1_1_0());
                                    	            													
                                    	            pushFollow(FOLLOW_23);
                                    	            lv_poolName_9_0=ruleStringValue();

                                    	            state._fsp--;


                                    	            														if (current==null) {
                                    	            															current = createModelElementForParent(grammarAccess.getConfigurationRule());
                                    	            														}
                                    	            														set(
                                    	            															current,
                                    	            															"poolName",
                                    	            															lv_poolName_9_0,
                                    	            															"ca.mcgill.devops.pipeline.Pipeline.StringValue");
                                    	            														afterParserOrEnumRuleCall();
                                    	            													

                                    	            }


                                    	            }


                                    	            }
                                    	            break;

                                    	    }

                                    	    // InternalPipelineParser.g:829:11: (otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) ) )?
                                    	    int alt21=2;
                                    	    int LA21_0 = input.LA(1);

                                    	    if ( (LA21_0==VmImage) ) {
                                    	        alt21=1;
                                    	    }
                                    	    switch (alt21) {
                                    	        case 1 :
                                    	            // InternalPipelineParser.g:830:12: otherlv_10= VmImage ( (lv_poolVm_11_0= ruleStringValue ) )
                                    	            {
                                    	            otherlv_10=(Token)match(input,VmImage,FOLLOW_3); 

                                    	            												newLeafNode(otherlv_10, grammarAccess.getConfigurationAccess().getVmImageKeyword_0_2_2_0_2_0());
                                    	            											
                                    	            // InternalPipelineParser.g:834:12: ( (lv_poolVm_11_0= ruleStringValue ) )
                                    	            // InternalPipelineParser.g:835:13: (lv_poolVm_11_0= ruleStringValue )
                                    	            {
                                    	            // InternalPipelineParser.g:835:13: (lv_poolVm_11_0= ruleStringValue )
                                    	            // InternalPipelineParser.g:836:14: lv_poolVm_11_0= ruleStringValue
                                    	            {

                                    	            														newCompositeNode(grammarAccess.getConfigurationAccess().getPoolVmStringValueParserRuleCall_0_2_2_0_2_1_0());
                                    	            													
                                    	            pushFollow(FOLLOW_21);
                                    	            lv_poolVm_11_0=ruleStringValue();

                                    	            state._fsp--;


                                    	            														if (current==null) {
                                    	            															current = createModelElementForParent(grammarAccess.getConfigurationRule());
                                    	            														}
                                    	            														set(
                                    	            															current,
                                    	            															"poolVm",
                                    	            															lv_poolVm_11_0,
                                    	            															"ca.mcgill.devops.pipeline.Pipeline.StringValue");
                                    	            														afterParserOrEnumRuleCall();
                                    	            													

                                    	            }


                                    	            }


                                    	            }
                                    	            break;

                                    	    }


                                    	    }


                                    	    }

                                    	     
                                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2());
                                    	    							

                                    	    }


                                    	    }


                                    	    }
                                    	    break;
                                    	case 2 :
                                    	    // InternalPipelineParser.g:860:6: ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) )
                                    	    {
                                    	    // InternalPipelineParser.g:860:6: ({...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) ) )
                                    	    // InternalPipelineParser.g:861:7: {...}? => ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) )
                                    	    {
                                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2(), 1) ) {
                                    	        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2(), 1)");
                                    	    }
                                    	    // InternalPipelineParser.g:861:116: ( ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) ) )
                                    	    // InternalPipelineParser.g:862:8: ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) )
                                    	    {

                                    	    								getUnorderedGroupHelper().select(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2(), 1);
                                    	    							
                                    	    // InternalPipelineParser.g:865:11: ({...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END ) )
                                    	    // InternalPipelineParser.g:865:12: {...}? => ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END )
                                    	    {
                                    	    if ( !((true)) ) {
                                    	        throw new FailedPredicateException(input, "ruleConfiguration", "true");
                                    	    }
                                    	    // InternalPipelineParser.g:865:21: ( (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END )
                                    	    // InternalPipelineParser.g:865:22: (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )? this_END_14= RULE_END
                                    	    {
                                    	    // InternalPipelineParser.g:865:22: (otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) ) )?
                                    	    int alt23=2;
                                    	    int LA23_0 = input.LA(1);

                                    	    if ( (LA23_0==Demands) ) {
                                    	        alt23=1;
                                    	    }
                                    	    switch (alt23) {
                                    	        case 1 :
                                    	            // InternalPipelineParser.g:866:12: otherlv_12= Demands ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) )
                                    	            {
                                    	            otherlv_12=(Token)match(input,Demands,FOLLOW_24); 

                                    	            												newLeafNode(otherlv_12, grammarAccess.getConfigurationAccess().getDemandsKeyword_0_2_2_1_0_0());
                                    	            											
                                    	            // InternalPipelineParser.g:870:12: ( ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) ) )
                                    	            // InternalPipelineParser.g:871:13: ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) )
                                    	            {
                                    	            // InternalPipelineParser.g:871:13: ( (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters ) )
                                    	            // InternalPipelineParser.g:872:14: (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters )
                                    	            {
                                    	            // InternalPipelineParser.g:872:14: (lv_poolDemands_13_1= ruleStringValue | lv_poolDemands_13_2= ruleHyphenParameters )
                                    	            int alt22=2;
                                    	            int LA22_0 = input.LA(1);

                                    	            if ( ((LA22_0>=RULE_SINGLE_CHAR && LA22_0<=RULE_STRING)||LA22_0==RULE_VERSION) ) {
                                    	                alt22=1;
                                    	            }
                                    	            else if ( (LA22_0==HyphenMinus) ) {
                                    	                alt22=2;
                                    	            }
                                    	            else {
                                    	                NoViableAltException nvae =
                                    	                    new NoViableAltException("", 22, 0, input);

                                    	                throw nvae;
                                    	            }
                                    	            switch (alt22) {
                                    	                case 1 :
                                    	                    // InternalPipelineParser.g:873:15: lv_poolDemands_13_1= ruleStringValue
                                    	                    {

                                    	                    															newCompositeNode(grammarAccess.getConfigurationAccess().getPoolDemandsStringValueParserRuleCall_0_2_2_1_0_1_0_0());
                                    	                    														
                                    	                    pushFollow(FOLLOW_8);
                                    	                    lv_poolDemands_13_1=ruleStringValue();

                                    	                    state._fsp--;


                                    	                    															if (current==null) {
                                    	                    																current = createModelElementForParent(grammarAccess.getConfigurationRule());
                                    	                    															}
                                    	                    															set(
                                    	                    																current,
                                    	                    																"poolDemands",
                                    	                    																lv_poolDemands_13_1,
                                    	                    																"ca.mcgill.devops.pipeline.Pipeline.StringValue");
                                    	                    															afterParserOrEnumRuleCall();
                                    	                    														

                                    	                    }
                                    	                    break;
                                    	                case 2 :
                                    	                    // InternalPipelineParser.g:889:15: lv_poolDemands_13_2= ruleHyphenParameters
                                    	                    {

                                    	                    															newCompositeNode(grammarAccess.getConfigurationAccess().getPoolDemandsHyphenParametersParserRuleCall_0_2_2_1_0_1_0_1());
                                    	                    														
                                    	                    pushFollow(FOLLOW_8);
                                    	                    lv_poolDemands_13_2=ruleHyphenParameters();

                                    	                    state._fsp--;


                                    	                    															if (current==null) {
                                    	                    																current = createModelElementForParent(grammarAccess.getConfigurationRule());
                                    	                    															}
                                    	                    															set(
                                    	                    																current,
                                    	                    																"poolDemands",
                                    	                    																lv_poolDemands_13_2,
                                    	                    																"ca.mcgill.devops.pipeline.Pipeline.HyphenParameters");
                                    	                    															afterParserOrEnumRuleCall();
                                    	                    														

                                    	                    }
                                    	                    break;

                                    	            }


                                    	            }


                                    	            }


                                    	            }
                                    	            break;

                                    	    }

                                    	    this_END_14=(Token)match(input,RULE_END,FOLLOW_21); 

                                    	    											newLeafNode(this_END_14, grammarAccess.getConfigurationAccess().getENDTerminalRuleCall_0_2_2_1_1());
                                    	    										

                                    	    }


                                    	    }

                                    	     
                                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2());
                                    	    							

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt24 >= 1 ) break loop24;
                                                EarlyExitException eee =
                                                    new EarlyExitException(24, input);
                                                throw eee;
                                        }
                                        cnt24++;
                                    } while (true);

                                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2()) ) {
                                        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canLeave(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2())");
                                    }

                                    }


                                    }

                                     
                                    						  getUnorderedGroupHelper().leave(grammarAccess.getConfigurationAccess().getUnorderedGroup_0_2_2());
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalPipelineParser.g:928:4: (otherlv_15= Resources ( (lv_resource_16_0= RULE_STRING ) ) )
                            {
                            // InternalPipelineParser.g:928:4: (otherlv_15= Resources ( (lv_resource_16_0= RULE_STRING ) ) )
                            // InternalPipelineParser.g:929:5: otherlv_15= Resources ( (lv_resource_16_0= RULE_STRING ) )
                            {
                            otherlv_15=(Token)match(input,Resources,FOLLOW_19); 

                            					newLeafNode(otherlv_15, grammarAccess.getConfigurationAccess().getResourcesKeyword_0_3_0());
                            				
                            // InternalPipelineParser.g:933:5: ( (lv_resource_16_0= RULE_STRING ) )
                            // InternalPipelineParser.g:934:6: (lv_resource_16_0= RULE_STRING )
                            {
                            // InternalPipelineParser.g:934:6: (lv_resource_16_0= RULE_STRING )
                            // InternalPipelineParser.g:935:7: lv_resource_16_0= RULE_STRING
                            {
                            lv_resource_16_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_resource_16_0, grammarAccess.getConfigurationAccess().getResourceSTRINGTerminalRuleCall_0_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConfigurationRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"resource",
                            								lv_resource_16_0,
                            								"ca.mcgill.devops.pipeline.Pipeline.STRING");
                            						

                            }


                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalPipelineParser.g:953:4: (otherlv_17= Schedules ( (lv_schedule_18_0= RULE_STRING ) ) )
                            {
                            // InternalPipelineParser.g:953:4: (otherlv_17= Schedules ( (lv_schedule_18_0= RULE_STRING ) ) )
                            // InternalPipelineParser.g:954:5: otherlv_17= Schedules ( (lv_schedule_18_0= RULE_STRING ) )
                            {
                            otherlv_17=(Token)match(input,Schedules,FOLLOW_19); 

                            					newLeafNode(otherlv_17, grammarAccess.getConfigurationAccess().getSchedulesKeyword_0_4_0());
                            				
                            // InternalPipelineParser.g:958:5: ( (lv_schedule_18_0= RULE_STRING ) )
                            // InternalPipelineParser.g:959:6: (lv_schedule_18_0= RULE_STRING )
                            {
                            // InternalPipelineParser.g:959:6: (lv_schedule_18_0= RULE_STRING )
                            // InternalPipelineParser.g:960:7: lv_schedule_18_0= RULE_STRING
                            {
                            lv_schedule_18_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_schedule_18_0, grammarAccess.getConfigurationAccess().getScheduleSTRINGTerminalRuleCall_0_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConfigurationRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"schedule",
                            								lv_schedule_18_0,
                            								"ca.mcgill.devops.pipeline.Pipeline.STRING");
                            						

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:979:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )
                    {
                    // InternalPipelineParser.g:979:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )
                    // InternalPipelineParser.g:980:4: ( ( ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+ {...}?) )
                    {
                    // InternalPipelineParser.g:980:4: ( ( ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+ {...}?) )
                    // InternalPipelineParser.g:981:5: ( ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getConfigurationAccess().getUnorderedGroup_1());
                    				
                    // InternalPipelineParser.g:984:5: ( ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+ {...}?)
                    // InternalPipelineParser.g:985:6: ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+ {...}?
                    {
                    // InternalPipelineParser.g:985:6: ( ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=4;
                        switch ( input.LA(1) ) {
                        case Options:
                            {
                            int LA29_2 = input.LA(2);

                            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 0) ) {
                                alt29=1;
                            }


                            }
                            break;
                        case Docker:
                            {
                            int LA29_3 = input.LA(2);

                            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 1) ) {
                                alt29=2;
                            }


                            }
                            break;
                        case Size:
                            {
                            int LA29_4 = input.LA(2);

                            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 2) ) {
                                alt29=3;
                            }


                            }
                            break;
                        case RULE_END:
                            {
                            int LA29_5 = input.LA(2);

                            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 2) ) {
                                alt29=3;
                            }


                            }
                            break;

                        }

                        switch (alt29) {
                    	case 1 :
                    	    // InternalPipelineParser.g:986:4: ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:986:4: ({...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) ) )
                    	    // InternalPipelineParser.g:987:5: {...}? => ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 0)");
                    	    }
                    	    // InternalPipelineParser.g:987:110: ( ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) ) )
                    	    // InternalPipelineParser.g:988:6: ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 0);
                    	    					
                    	    // InternalPipelineParser.g:991:9: ({...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? ) )
                    	    // InternalPipelineParser.g:991:10: {...}? => (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfiguration", "true");
                    	    }
                    	    // InternalPipelineParser.g:991:19: (otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )? )
                    	    // InternalPipelineParser.g:991:20: otherlv_20= Options this_BEGIN_21= RULE_BEGIN (otherlv_22= MaxTime this_INT_23= RULE_INT )?
                    	    {
                    	    otherlv_20=(Token)match(input,Options,FOLLOW_5); 

                    	    									newLeafNode(otherlv_20, grammarAccess.getConfigurationAccess().getOptionsKeyword_1_0_0());
                    	    								
                    	    this_BEGIN_21=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

                    	    									newLeafNode(this_BEGIN_21, grammarAccess.getConfigurationAccess().getBEGINTerminalRuleCall_1_0_1());
                    	    								
                    	    // InternalPipelineParser.g:999:9: (otherlv_22= MaxTime this_INT_23= RULE_INT )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==MaxTime) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:1000:10: otherlv_22= MaxTime this_INT_23= RULE_INT
                    	            {
                    	            otherlv_22=(Token)match(input,MaxTime,FOLLOW_26); 

                    	            										newLeafNode(otherlv_22, grammarAccess.getConfigurationAccess().getMaxTimeKeyword_1_0_2_0());
                    	            									
                    	            this_INT_23=(Token)match(input,RULE_INT,FOLLOW_27); 

                    	            										newLeafNode(this_INT_23, grammarAccess.getConfigurationAccess().getINTTerminalRuleCall_1_0_2_1());
                    	            									

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigurationAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPipelineParser.g:1015:4: ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1015:4: ({...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) ) )
                    	    // InternalPipelineParser.g:1016:5: {...}? => ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 1)");
                    	    }
                    	    // InternalPipelineParser.g:1016:110: ( ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) ) )
                    	    // InternalPipelineParser.g:1017:6: ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 1);
                    	    					
                    	    // InternalPipelineParser.g:1020:9: ({...}? => (otherlv_24= Docker this_ID_25= RULE_ID ) )
                    	    // InternalPipelineParser.g:1020:10: {...}? => (otherlv_24= Docker this_ID_25= RULE_ID )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfiguration", "true");
                    	    }
                    	    // InternalPipelineParser.g:1020:19: (otherlv_24= Docker this_ID_25= RULE_ID )
                    	    // InternalPipelineParser.g:1020:20: otherlv_24= Docker this_ID_25= RULE_ID
                    	    {
                    	    otherlv_24=(Token)match(input,Docker,FOLLOW_28); 

                    	    									newLeafNode(otherlv_24, grammarAccess.getConfigurationAccess().getDockerKeyword_1_1_0());
                    	    								
                    	    this_ID_25=(Token)match(input,RULE_ID,FOLLOW_27); 

                    	    									newLeafNode(this_ID_25, grammarAccess.getConfigurationAccess().getIDTerminalRuleCall_1_1_1());
                    	    								

                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigurationAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalPipelineParser.g:1034:4: ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1034:4: ({...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) ) )
                    	    // InternalPipelineParser.g:1035:5: {...}? => ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 2)");
                    	    }
                    	    // InternalPipelineParser.g:1035:110: ( ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) ) )
                    	    // InternalPipelineParser.g:1036:6: ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getConfigurationAccess().getUnorderedGroup_1(), 2);
                    	    					
                    	    // InternalPipelineParser.g:1039:9: ({...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END ) )
                    	    // InternalPipelineParser.g:1039:10: {...}? => ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfiguration", "true");
                    	    }
                    	    // InternalPipelineParser.g:1039:19: ( (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END )
                    	    // InternalPipelineParser.g:1039:20: (otherlv_26= Size this_ID_27= RULE_ID )? this_END_28= RULE_END
                    	    {
                    	    // InternalPipelineParser.g:1039:20: (otherlv_26= Size this_ID_27= RULE_ID )?
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==Size) ) {
                    	        alt28=1;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:1040:10: otherlv_26= Size this_ID_27= RULE_ID
                    	            {
                    	            otherlv_26=(Token)match(input,Size,FOLLOW_28); 

                    	            										newLeafNode(otherlv_26, grammarAccess.getConfigurationAccess().getSizeKeyword_1_2_0_0());
                    	            									
                    	            this_ID_27=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	            										newLeafNode(this_ID_27, grammarAccess.getConfigurationAccess().getIDTerminalRuleCall_1_2_0_1());
                    	            									

                    	            }
                    	            break;

                    	    }

                    	    this_END_28=(Token)match(input,RULE_END,FOLLOW_27); 

                    	    									newLeafNode(this_END_28, grammarAccess.getConfigurationAccess().getENDTerminalRuleCall_1_2_1());
                    	    								

                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigurationAccess().getUnorderedGroup_1());
                    	    					

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

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getConfigurationAccess().getUnorderedGroup_1()) ) {
                        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canLeave(grammarAccess.getConfigurationAccess().getUnorderedGroup_1())");
                    }

                    }


                    }

                     
                    				  getUnorderedGroupHelper().leave(grammarAccess.getConfigurationAccess().getUnorderedGroup_1());
                    				

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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleParameter"
    // InternalPipelineParser.g:1071:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalPipelineParser.g:1071:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalPipelineParser.g:1072:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalPipelineParser.g:1078:1: ruleParameter returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_defaultValue_10_2=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        Token otherlv_14=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_displayName_8_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_10_1 = null;

        AntlrDatatypeRuleToken lv_defaultValue_12_1 = null;

        AntlrDatatypeRuleToken lv_defaultValue_12_2 = null;

        AntlrDatatypeRuleToken lv_defaultValue_12_3 = null;

        AntlrDatatypeRuleToken lv_value_15_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1084:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalPipelineParser.g:1085:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalPipelineParser.g:1085:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalPipelineParser.g:1086:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalPipelineParser.g:1086:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) ) )+ {...}?) )
            // InternalPipelineParser.g:1087:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup());
            			
            // InternalPipelineParser.g:1090:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) ) )+ {...}?)
            // InternalPipelineParser.g:1091:5: ( ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalPipelineParser.g:1091:5: ( ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=5;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // InternalPipelineParser.g:1092:3: ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) )
            	    {
            	    // InternalPipelineParser.g:1092:3: ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) )
            	    // InternalPipelineParser.g:1093:4: {...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalPipelineParser.g:1093:103: ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) )
            	    // InternalPipelineParser.g:1094:5: ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalPipelineParser.g:1097:8: ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) )
            	    // InternalPipelineParser.g:1097:9: {...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalPipelineParser.g:1097:18: ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? )
            	    // InternalPipelineParser.g:1097:19: (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )?
            	    {
            	    // InternalPipelineParser.g:1097:19: (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) )
            	    // InternalPipelineParser.g:1098:9: otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_29); 

            	    									newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getHyphenMinusKeyword_0_0_0());
            	    								
            	    otherlv_2=(Token)match(input,Name,FOLLOW_28); 

            	    									newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_0_0_1());
            	    								
            	    // InternalPipelineParser.g:1106:9: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalPipelineParser.g:1107:10: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalPipelineParser.g:1107:10: (lv_name_3_0= RULE_ID )
            	    // InternalPipelineParser.g:1108:11: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    											newLeafNode(lv_name_3_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getParameterRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"name",
            	    												lv_name_3_0,
            	    												"ca.mcgill.devops.pipeline.Pipeline.ID");
            	    										

            	    }


            	    }


            	    }

            	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            	    								newLeafNode(this_BEGIN_4, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_0_1());
            	    							
            	    // InternalPipelineParser.g:1129:8: (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==Type) ) {
            	        int LA31_1 = input.LA(2);

            	        if ( (LA31_1==RULE_ID) ) {
            	            alt31=1;
            	        }
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalPipelineParser.g:1130:9: otherlv_5= Type ( (lv_type_6_0= RULE_ID ) )
            	            {
            	            otherlv_5=(Token)match(input,Type,FOLLOW_28); 

            	            									newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getTypeKeyword_0_2_0());
            	            								
            	            // InternalPipelineParser.g:1134:9: ( (lv_type_6_0= RULE_ID ) )
            	            // InternalPipelineParser.g:1135:10: (lv_type_6_0= RULE_ID )
            	            {
            	            // InternalPipelineParser.g:1135:10: (lv_type_6_0= RULE_ID )
            	            // InternalPipelineParser.g:1136:11: lv_type_6_0= RULE_ID
            	            {
            	            lv_type_6_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            	            											newLeafNode(lv_type_6_0, grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_0_2_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getParameterRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"type",
            	            												lv_type_6_0,
            	            												"ca.mcgill.devops.pipeline.Pipeline.ID");
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:1159:3: ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:1159:3: ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) )
            	    // InternalPipelineParser.g:1160:4: {...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalPipelineParser.g:1160:103: ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) )
            	    // InternalPipelineParser.g:1161:5: ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalPipelineParser.g:1164:8: ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) )
            	    // InternalPipelineParser.g:1164:9: {...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalPipelineParser.g:1164:18: (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) )
            	    // InternalPipelineParser.g:1164:19: otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) )
            	    {
            	    otherlv_7=(Token)match(input,DisplayName,FOLLOW_3); 

            	    								newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getDisplayNameKeyword_1_0());
            	    							
            	    // InternalPipelineParser.g:1168:8: ( (lv_displayName_8_0= ruleStringValue ) )
            	    // InternalPipelineParser.g:1169:9: (lv_displayName_8_0= ruleStringValue )
            	    {
            	    // InternalPipelineParser.g:1169:9: (lv_displayName_8_0= ruleStringValue )
            	    // InternalPipelineParser.g:1170:10: lv_displayName_8_0= ruleStringValue
            	    {

            	    										newCompositeNode(grammarAccess.getParameterAccess().getDisplayNameStringValueParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_18);
            	    lv_displayName_8_0=ruleStringValue();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParameterRule());
            	    										}
            	    										set(
            	    											current,
            	    											"displayName",
            	    											lv_displayName_8_0,
            	    											"ca.mcgill.devops.pipeline.Pipeline.StringValue");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPipelineParser.g:1193:3: ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:1193:3: ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) )
            	    // InternalPipelineParser.g:1194:4: {...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalPipelineParser.g:1194:103: ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:1195:5: ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalPipelineParser.g:1198:8: ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) )
            	    // InternalPipelineParser.g:1198:9: {...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalPipelineParser.g:1198:18: ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==Default) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==RULE_BEGIN) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalPipelineParser.g:1198:19: (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) )
            	            {
            	            // InternalPipelineParser.g:1198:19: (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) )
            	            // InternalPipelineParser.g:1199:9: otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) )
            	            {
            	            otherlv_9=(Token)match(input,Default,FOLLOW_31); 

            	            									newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getDefaultKeyword_2_0_0());
            	            								
            	            // InternalPipelineParser.g:1203:9: ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) )
            	            // InternalPipelineParser.g:1204:10: ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) )
            	            {
            	            // InternalPipelineParser.g:1204:10: ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) )
            	            // InternalPipelineParser.g:1205:11: (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV )
            	            {
            	            // InternalPipelineParser.g:1205:11: (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV )
            	            int alt32=2;
            	            int LA32_0 = input.LA(1);

            	            if ( ((LA32_0>=RULE_SINGLE_CHAR && LA32_0<=RULE_STRING)||LA32_0==RULE_VERSION) ) {
            	                alt32=1;
            	            }
            	            else if ( (LA32_0==RULE_INTV) ) {
            	                alt32=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 32, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt32) {
            	                case 1 :
            	                    // InternalPipelineParser.g:1206:12: lv_defaultValue_10_1= ruleStringValue
            	                    {

            	                    												newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueStringValueParserRuleCall_2_0_1_0_0());
            	                    											
            	                    pushFollow(FOLLOW_18);
            	                    lv_defaultValue_10_1=ruleStringValue();

            	                    state._fsp--;


            	                    												if (current==null) {
            	                    													current = createModelElementForParent(grammarAccess.getParameterRule());
            	                    												}
            	                    												add(
            	                    													current,
            	                    													"defaultValue",
            	                    													lv_defaultValue_10_1,
            	                    													"ca.mcgill.devops.pipeline.Pipeline.StringValue");
            	                    												afterParserOrEnumRuleCall();
            	                    											

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalPipelineParser.g:1222:12: lv_defaultValue_10_2= RULE_INTV
            	                    {
            	                    lv_defaultValue_10_2=(Token)match(input,RULE_INTV,FOLLOW_18); 

            	                    												newLeafNode(lv_defaultValue_10_2, grammarAccess.getParameterAccess().getDefaultValueINTVTerminalRuleCall_2_0_1_0_1());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getParameterRule());
            	                    												}
            	                    												addWithLastConsumed(
            	                    													current,
            	                    													"defaultValue",
            	                    													lv_defaultValue_10_2,
            	                    													"ca.mcgill.devops.pipeline.Pipeline.INTV");
            	                    											

            	                    }
            	                    break;

            	            }


            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:1241:8: (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END )
            	            {
            	            // InternalPipelineParser.g:1241:8: (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END )
            	            // InternalPipelineParser.g:1242:9: this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END
            	            {
            	            this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

            	            									newLeafNode(this_BEGIN_11, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_2_1_0());
            	            								
            	            // InternalPipelineParser.g:1246:9: ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )*
            	            loop34:
            	            do {
            	                int alt34=2;
            	                int LA34_0 = input.LA(1);

            	                if ( (LA34_0==RULE_ID) ) {
            	                    alt34=1;
            	                }


            	                switch (alt34) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:1247:10: ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) )
            	            	    {
            	            	    // InternalPipelineParser.g:1247:10: ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) )
            	            	    // InternalPipelineParser.g:1248:11: (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs )
            	            	    {
            	            	    // InternalPipelineParser.g:1248:11: (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs )
            	            	    int alt33=3;
            	            	    int LA33_0 = input.LA(1);

            	            	    if ( (LA33_0==RULE_ID) ) {
            	            	        int LA33_1 = input.LA(2);

            	            	        if ( (LA33_1==Colon) ) {
            	            	            switch ( input.LA(3) ) {
            	            	            case HyphenMinus:
            	            	                {
            	            	                alt33=2;
            	            	                }
            	            	                break;
            	            	            case RULE_SINGLE_CHAR:
            	            	            case RULE_ID:
            	            	            case RULE_STRING:
            	            	            case RULE_FLOAT_LITERAL:
            	            	            case RULE_EXPRESSION:
            	            	            case RULE_INTV:
            	            	            case RULE_VERSION:
            	            	                {
            	            	                alt33=3;
            	            	                }
            	            	                break;
            	            	            case VerticalLine:
            	            	            case RULE_BEGIN:
            	            	                {
            	            	                alt33=1;
            	            	                }
            	            	                break;
            	            	            default:
            	            	                NoViableAltException nvae =
            	            	                    new NoViableAltException("", 33, 2, input);

            	            	                throw nvae;
            	            	            }

            	            	        }
            	            	        else {
            	            	            NoViableAltException nvae =
            	            	                new NoViableAltException("", 33, 1, input);

            	            	            throw nvae;
            	            	        }
            	            	    }
            	            	    else {
            	            	        NoViableAltException nvae =
            	            	            new NoViableAltException("", 33, 0, input);

            	            	        throw nvae;
            	            	    }
            	            	    switch (alt33) {
            	            	        case 1 :
            	            	            // InternalPipelineParser.g:1249:12: lv_defaultValue_12_1= ruleIndentedKeyValues
            	            	            {

            	            	            												newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueIndentedKeyValuesParserRuleCall_2_1_1_0_0());
            	            	            											
            	            	            pushFollow(FOLLOW_32);
            	            	            lv_defaultValue_12_1=ruleIndentedKeyValues();

            	            	            state._fsp--;


            	            	            												if (current==null) {
            	            	            													current = createModelElementForParent(grammarAccess.getParameterRule());
            	            	            												}
            	            	            												add(
            	            	            													current,
            	            	            													"defaultValue",
            	            	            													lv_defaultValue_12_1,
            	            	            													"ca.mcgill.devops.pipeline.Pipeline.IndentedKeyValues");
            	            	            												afterParserOrEnumRuleCall();
            	            	            											

            	            	            }
            	            	            break;
            	            	        case 2 :
            	            	            // InternalPipelineParser.g:1265:12: lv_defaultValue_12_2= ruleHyphenKVP
            	            	            {

            	            	            												newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueHyphenKVPParserRuleCall_2_1_1_0_1());
            	            	            											
            	            	            pushFollow(FOLLOW_32);
            	            	            lv_defaultValue_12_2=ruleHyphenKVP();

            	            	            state._fsp--;


            	            	            												if (current==null) {
            	            	            													current = createModelElementForParent(grammarAccess.getParameterRule());
            	            	            												}
            	            	            												add(
            	            	            													current,
            	            	            													"defaultValue",
            	            	            													lv_defaultValue_12_2,
            	            	            													"ca.mcgill.devops.pipeline.Pipeline.HyphenKVP");
            	            	            												afterParserOrEnumRuleCall();
            	            	            											

            	            	            }
            	            	            break;
            	            	        case 3 :
            	            	            // InternalPipelineParser.g:1281:12: lv_defaultValue_12_3= ruleKeyValuePairs
            	            	            {

            	            	            												newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueKeyValuePairsParserRuleCall_2_1_1_0_2());
            	            	            											
            	            	            pushFollow(FOLLOW_32);
            	            	            lv_defaultValue_12_3=ruleKeyValuePairs();

            	            	            state._fsp--;


            	            	            												if (current==null) {
            	            	            													current = createModelElementForParent(grammarAccess.getParameterRule());
            	            	            												}
            	            	            												add(
            	            	            													current,
            	            	            													"defaultValue",
            	            	            													lv_defaultValue_12_3,
            	            	            													"ca.mcgill.devops.pipeline.Pipeline.KeyValuePairs");
            	            	            												afterParserOrEnumRuleCall();
            	            	            											

            	            	            }
            	            	            break;

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop34;
            	                }
            	            } while (true);

            	            this_END_13=(Token)match(input,RULE_END,FOLLOW_18); 

            	            									newLeafNode(this_END_13, grammarAccess.getParameterAccess().getENDTerminalRuleCall_2_1_2());
            	            								

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPipelineParser.g:1310:3: ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) )
            	    {
            	    // InternalPipelineParser.g:1310:3: ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:1311:4: {...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalPipelineParser.g:1311:103: ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) )
            	    // InternalPipelineParser.g:1312:5: ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalPipelineParser.g:1315:8: ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) )
            	    // InternalPipelineParser.g:1315:9: {...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalPipelineParser.g:1315:18: ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END )
            	    // InternalPipelineParser.g:1315:19: (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END
            	    {
            	    // InternalPipelineParser.g:1315:19: (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==Values) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalPipelineParser.g:1316:9: otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) )
            	            {
            	            otherlv_14=(Token)match(input,Values,FOLLOW_24); 

            	            									newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getValuesKeyword_3_0_0());
            	            								
            	            // InternalPipelineParser.g:1320:9: ( (lv_value_15_0= ruleHyphenParameters ) )
            	            // InternalPipelineParser.g:1321:10: (lv_value_15_0= ruleHyphenParameters )
            	            {
            	            // InternalPipelineParser.g:1321:10: (lv_value_15_0= ruleHyphenParameters )
            	            // InternalPipelineParser.g:1322:11: lv_value_15_0= ruleHyphenParameters
            	            {

            	            											newCompositeNode(grammarAccess.getParameterAccess().getValueHyphenParametersParserRuleCall_3_0_1_0());
            	            										
            	            pushFollow(FOLLOW_8);
            	            lv_value_15_0=ruleHyphenParameters();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getParameterRule());
            	            											}
            	            											set(
            	            												current,
            	            												"value",
            	            												lv_value_15_0,
            	            												"ca.mcgill.devops.pipeline.Pipeline.HyphenParameters");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    this_END_16=(Token)match(input,RULE_END,FOLLOW_18); 

            	    								newLeafNode(this_END_16, grammarAccess.getParameterAccess().getENDTerminalRuleCall_3_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getParameterAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleStage"
    // InternalPipelineParser.g:1361:1: entryRuleStage returns [EObject current=null] : iv_ruleStage= ruleStage EOF ;
    public final EObject entryRuleStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStage = null;


        try {
            // InternalPipelineParser.g:1361:46: (iv_ruleStage= ruleStage EOF )
            // InternalPipelineParser.g:1362:2: iv_ruleStage= ruleStage EOF
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
    // InternalPipelineParser.g:1368:1: ruleStage returns [EObject current=null] : ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleStringValue ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+ {...}?) ) )? ) ;
    public final EObject ruleStage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token this_END_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_displayName_6_0 = null;

        EObject lv_jobs_10_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1374:2: ( ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleStringValue ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+ {...}?) ) )? ) )
            // InternalPipelineParser.g:1375:2: ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleStringValue ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalPipelineParser.g:1375:2: ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleStringValue ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+ {...}?) ) )? )
            // InternalPipelineParser.g:1376:3: (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleStringValue ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+ {...}?) ) )?
            {
            // InternalPipelineParser.g:1376:3: (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleStringValue ) ) )
            // InternalPipelineParser.g:1377:4: otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleStringValue ) )
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_33); 

            				newLeafNode(otherlv_0, grammarAccess.getStageAccess().getHyphenMinusKeyword_0_0());
            			
            otherlv_1=(Token)match(input,Stage,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getStageAccess().getStageKeyword_0_1());
            			
            // InternalPipelineParser.g:1385:4: ( (lv_name_2_0= ruleStringValue ) )
            // InternalPipelineParser.g:1386:5: (lv_name_2_0= ruleStringValue )
            {
            // InternalPipelineParser.g:1386:5: (lv_name_2_0= ruleStringValue )
            // InternalPipelineParser.g:1387:6: lv_name_2_0= ruleStringValue
            {

            						newCompositeNode(grammarAccess.getStageAccess().getNameStringValueParserRuleCall_0_2_0());
            					
            pushFollow(FOLLOW_34);
            lv_name_2_0=ruleStringValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStageRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_2_0,
            							"ca.mcgill.devops.pipeline.Pipeline.StringValue");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPipelineParser.g:1405:3: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+ {...}?) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==DependsOn||LA42_0==Jobs||LA42_0==RULE_BEGIN) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPipelineParser.g:1406:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+ {...}?) )
                    {
                    // InternalPipelineParser.g:1406:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+ {...}?) )
                    // InternalPipelineParser.g:1407:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    				
                    // InternalPipelineParser.g:1410:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+ {...}?)
                    // InternalPipelineParser.g:1411:6: ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+ {...}?
                    {
                    // InternalPipelineParser.g:1411:6: ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=4;
                        int LA41_0 = input.LA(1);

                        if ( LA41_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0) ) {
                            alt41=1;
                        }
                        else if ( LA41_0 == DependsOn && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1) ) {
                            alt41=2;
                        }
                        else if ( LA41_0 == Jobs && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2) ) {
                            alt41=3;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1412:4: ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1412:4: ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) ) )
                    	    // InternalPipelineParser.g:1413:5: {...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0)");
                    	    }
                    	    // InternalPipelineParser.g:1413:102: ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) ) )
                    	    // InternalPipelineParser.g:1414:6: ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0);
                    	    					
                    	    // InternalPipelineParser.g:1417:9: ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? ) )
                    	    // InternalPipelineParser.g:1417:10: {...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:1417:19: (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )? )
                    	    // InternalPipelineParser.g:1417:20: this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )?
                    	    {
                    	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_35); 

                    	    									newLeafNode(this_BEGIN_4, grammarAccess.getStageAccess().getBEGINTerminalRuleCall_1_0_0());
                    	    								
                    	    // InternalPipelineParser.g:1421:9: (otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) ) )?
                    	    int alt38=2;
                    	    int LA38_0 = input.LA(1);

                    	    if ( (LA38_0==DisplayName) ) {
                    	        alt38=1;
                    	    }
                    	    switch (alt38) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:1422:10: otherlv_5= DisplayName ( (lv_displayName_6_0= ruleStringValue ) )
                    	            {
                    	            otherlv_5=(Token)match(input,DisplayName,FOLLOW_3); 

                    	            										newLeafNode(otherlv_5, grammarAccess.getStageAccess().getDisplayNameKeyword_1_0_1_0());
                    	            									
                    	            // InternalPipelineParser.g:1426:10: ( (lv_displayName_6_0= ruleStringValue ) )
                    	            // InternalPipelineParser.g:1427:11: (lv_displayName_6_0= ruleStringValue )
                    	            {
                    	            // InternalPipelineParser.g:1427:11: (lv_displayName_6_0= ruleStringValue )
                    	            // InternalPipelineParser.g:1428:12: lv_displayName_6_0= ruleStringValue
                    	            {

                    	            												newCompositeNode(grammarAccess.getStageAccess().getDisplayNameStringValueParserRuleCall_1_0_1_1_0());
                    	            											
                    	            pushFollow(FOLLOW_34);
                    	            lv_displayName_6_0=ruleStringValue();

                    	            state._fsp--;


                    	            												if (current==null) {
                    	            													current = createModelElementForParent(grammarAccess.getStageRule());
                    	            												}
                    	            												set(
                    	            													current,
                    	            													"displayName",
                    	            													lv_displayName_6_0,
                    	            													"ca.mcgill.devops.pipeline.Pipeline.StringValue");
                    	            												afterParserOrEnumRuleCall();
                    	            											

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
                    	    // InternalPipelineParser.g:1452:4: ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1452:4: ({...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) ) )
                    	    // InternalPipelineParser.g:1453:5: {...}? => ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1)");
                    	    }
                    	    // InternalPipelineParser.g:1453:102: ( ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) ) )
                    	    // InternalPipelineParser.g:1454:6: ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1);
                    	    					
                    	    // InternalPipelineParser.g:1457:9: ({...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* ) )
                    	    // InternalPipelineParser.g:1457:10: {...}? => (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:1457:19: (otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )* )
                    	    // InternalPipelineParser.g:1457:20: otherlv_7= DependsOn ( (otherlv_8= RULE_ID ) )*
                    	    {
                    	    otherlv_7=(Token)match(input,DependsOn,FOLLOW_36); 

                    	    									newLeafNode(otherlv_7, grammarAccess.getStageAccess().getDependsOnKeyword_1_1_0());
                    	    								
                    	    // InternalPipelineParser.g:1461:9: ( (otherlv_8= RULE_ID ) )*
                    	    loop39:
                    	    do {
                    	        int alt39=2;
                    	        int LA39_0 = input.LA(1);

                    	        if ( (LA39_0==RULE_ID) ) {
                    	            alt39=1;
                    	        }


                    	        switch (alt39) {
                    	    	case 1 :
                    	    	    // InternalPipelineParser.g:1462:10: (otherlv_8= RULE_ID )
                    	    	    {
                    	    	    // InternalPipelineParser.g:1462:10: (otherlv_8= RULE_ID )
                    	    	    // InternalPipelineParser.g:1463:11: otherlv_8= RULE_ID
                    	    	    {

                    	    	    											if (current==null) {
                    	    	    												current = createModelElement(grammarAccess.getStageRule());
                    	    	    											}
                    	    	    										
                    	    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_36); 

                    	    	    											newLeafNode(otherlv_8, grammarAccess.getStageAccess().getDependsOnStageCrossReference_1_1_1_0());
                    	    	    										

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop39;
                    	        }
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalPipelineParser.g:1480:4: ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1480:4: ({...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) ) )
                    	    // InternalPipelineParser.g:1481:5: {...}? => ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2)");
                    	    }
                    	    // InternalPipelineParser.g:1481:102: ( ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) ) )
                    	    // InternalPipelineParser.g:1482:6: ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2);
                    	    					
                    	    // InternalPipelineParser.g:1485:9: ({...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END ) )
                    	    // InternalPipelineParser.g:1485:10: {...}? => ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:1485:19: ( (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END )
                    	    // InternalPipelineParser.g:1485:20: (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* ) this_END_11= RULE_END
                    	    {
                    	    // InternalPipelineParser.g:1485:20: (otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )* )
                    	    // InternalPipelineParser.g:1486:10: otherlv_9= Jobs ( (lv_jobs_10_0= ruleJob ) )*
                    	    {
                    	    otherlv_9=(Token)match(input,Jobs,FOLLOW_16); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getStageAccess().getJobsKeyword_1_2_0_0());
                    	    									
                    	    // InternalPipelineParser.g:1490:10: ( (lv_jobs_10_0= ruleJob ) )*
                    	    loop40:
                    	    do {
                    	        int alt40=2;
                    	        int LA40_0 = input.LA(1);

                    	        if ( (LA40_0==HyphenMinus||(LA40_0>=RULE_SINGLE_CHAR && LA40_0<=RULE_STRING)||LA40_0==RULE_VERSION) ) {
                    	            alt40=1;
                    	        }


                    	        switch (alt40) {
                    	    	case 1 :
                    	    	    // InternalPipelineParser.g:1491:11: (lv_jobs_10_0= ruleJob )
                    	    	    {
                    	    	    // InternalPipelineParser.g:1491:11: (lv_jobs_10_0= ruleJob )
                    	    	    // InternalPipelineParser.g:1492:12: lv_jobs_10_0= ruleJob
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getStageAccess().getJobsJobParserRuleCall_1_2_0_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_16);
                    	    	    lv_jobs_10_0=ruleJob();

                    	    	    state._fsp--;


                    	    	    												if (current==null) {
                    	    	    													current = createModelElementForParent(grammarAccess.getStageRule());
                    	    	    												}
                    	    	    												add(
                    	    	    													current,
                    	    	    													"jobs",
                    	    	    													lv_jobs_10_0,
                    	    	    													"ca.mcgill.devops.pipeline.Pipeline.Job");
                    	    	    												afterParserOrEnumRuleCall();
                    	    	    											

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop40;
                    	        }
                    	    } while (true);


                    	    }

                    	    this_END_11=(Token)match(input,RULE_END,FOLLOW_34); 

                    	    									newLeafNode(this_END_11, grammarAccess.getStageAccess().getENDTerminalRuleCall_1_2_1());
                    	    								

                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    	    					

                    	    }


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
    // InternalPipelineParser.g:1532:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalPipelineParser.g:1532:44: (iv_ruleJob= ruleJob EOF )
            // InternalPipelineParser.g:1533:2: iv_ruleJob= ruleJob EOF
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
    // InternalPipelineParser.g:1539:1: ruleJob returns [EObject current=null] : ( ( (otherlv_0= HyphenMinus otherlv_1= Job )? ( (lv_name_2_0= ruleStringValue ) ) (otherlv_3= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+ {...}?) ) )? ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BEGIN_5=null;
        Token lv_nameKW_6_1=null;
        Token lv_nameKW_6_2=null;
        Token otherlv_8=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        Token lv_dependKW_13_1=null;
        Token lv_dependKW_13_2=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_runKW_20_1=null;
        Token lv_runKW_20_2=null;
        Token lv_vm_21_1=null;
        Token lv_runKW_22_0=null;
        Token this_BEGIN_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token this_END_31=null;
        Token otherlv_33=null;
        Token this_END_35=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_jobName_7_0 = null;

        Enumerator lv_permission_9_0 = null;

        AntlrDatatypeRuleToken lv_value_11_0 = null;

        AntlrDatatypeRuleToken lv_vm_21_2 = null;

        AntlrDatatypeRuleToken lv_poolName_26_0 = null;

        AntlrDatatypeRuleToken lv_poolVm_28_0 = null;

        AntlrDatatypeRuleToken lv_poolDemands_30_1 = null;

        AntlrDatatypeRuleToken lv_poolDemands_30_2 = null;

        EObject lv_jobParameters_32_0 = null;

        EObject lv_steps_34_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1545:2: ( ( ( (otherlv_0= HyphenMinus otherlv_1= Job )? ( (lv_name_2_0= ruleStringValue ) ) (otherlv_3= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+ {...}?) ) )? ) )
            // InternalPipelineParser.g:1546:2: ( ( (otherlv_0= HyphenMinus otherlv_1= Job )? ( (lv_name_2_0= ruleStringValue ) ) (otherlv_3= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalPipelineParser.g:1546:2: ( ( (otherlv_0= HyphenMinus otherlv_1= Job )? ( (lv_name_2_0= ruleStringValue ) ) (otherlv_3= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+ {...}?) ) )? )
            // InternalPipelineParser.g:1547:3: ( (otherlv_0= HyphenMinus otherlv_1= Job )? ( (lv_name_2_0= ruleStringValue ) ) (otherlv_3= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+ {...}?) ) )?
            {
            // InternalPipelineParser.g:1547:3: ( (otherlv_0= HyphenMinus otherlv_1= Job )? ( (lv_name_2_0= ruleStringValue ) ) (otherlv_3= Colon )? )
            // InternalPipelineParser.g:1548:4: (otherlv_0= HyphenMinus otherlv_1= Job )? ( (lv_name_2_0= ruleStringValue ) ) (otherlv_3= Colon )?
            {
            // InternalPipelineParser.g:1548:4: (otherlv_0= HyphenMinus otherlv_1= Job )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==HyphenMinus) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPipelineParser.g:1549:5: otherlv_0= HyphenMinus otherlv_1= Job
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_37); 

                    					newLeafNode(otherlv_0, grammarAccess.getJobAccess().getHyphenMinusKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,Job,FOLLOW_3); 

                    					newLeafNode(otherlv_1, grammarAccess.getJobAccess().getJobKeyword_0_0_1());
                    				

                    }
                    break;

            }

            // InternalPipelineParser.g:1558:4: ( (lv_name_2_0= ruleStringValue ) )
            // InternalPipelineParser.g:1559:5: (lv_name_2_0= ruleStringValue )
            {
            // InternalPipelineParser.g:1559:5: (lv_name_2_0= ruleStringValue )
            // InternalPipelineParser.g:1560:6: lv_name_2_0= ruleStringValue
            {

            						newCompositeNode(grammarAccess.getJobAccess().getNameStringValueParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_38);
            lv_name_2_0=ruleStringValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getJobRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_2_0,
            							"ca.mcgill.devops.pipeline.Pipeline.StringValue");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPipelineParser.g:1577:4: (otherlv_3= Colon )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Colon) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPipelineParser.g:1578:5: otherlv_3= Colon
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_39); 

                    					newLeafNode(otherlv_3, grammarAccess.getJobAccess().getColonKeyword_0_2());
                    				

                    }
                    break;

            }


            }

            // InternalPipelineParser.g:1584:3: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+ {...}?) ) )?
            int alt63=2;
            switch ( input.LA(1) ) {
                case Permissions:
                case DependsOn:
                case RunsOn:
                case Needs:
                case Steps:
                case Pool:
                case RULE_BEGIN:
                    {
                    alt63=1;
                    }
                    break;
                case HyphenMinus:
                    {
                    int LA63_2 = input.LA(2);

                    if ( ((LA63_2>=ContinueOnError && LA63_2<=Credentials)||(LA63_2>=Environment && LA63_2<=TagsIgnore)||(LA63_2>=Containers && LA63_2<=Entrypoint)||LA63_2==Container||(LA63_2>=FailFast && LA63_2<=Branches)||LA63_2==Defaults||(LA63_2>=Packages && LA63_2<=Webhooks)||(LA63_2>=Exclude && LA63_2<=Inherit)||LA63_2==Outputs||(LA63_2>=Rolling && LA63_2<=Trigger)||(LA63_2>=Builds && LA63_2<=Canary)||(LA63_2>=Inputs && LA63_2<=Script)||LA63_2==Target||(LA63_2>=Build && LA63_2<=Shell)||(LA63_2>=Types && LA63_2<=Args)||LA63_2==Cron||(LA63_2>=Name && LA63_2<=Path)||LA63_2==Push||LA63_2==Tags||(LA63_2>=Type && LA63_2<=Uses)||LA63_2==Env||(LA63_2>=Id && LA63_2<=Pr)||LA63_2==LeftSquareBracket||LA63_2==RULE_ID) ) {
                        alt63=1;
                    }
                    }
                    break;
                case RULE_END:
                    {
                    alt63=1;
                    }
                    break;
            }

            switch (alt63) {
                case 1 :
                    // InternalPipelineParser.g:1585:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+ {...}?) )
                    {
                    // InternalPipelineParser.g:1585:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+ {...}?) )
                    // InternalPipelineParser.g:1586:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getJobAccess().getUnorderedGroup_1());
                    				
                    // InternalPipelineParser.g:1589:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+ {...}?)
                    // InternalPipelineParser.g:1590:6: ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+ {...}?
                    {
                    // InternalPipelineParser.g:1590:6: ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=7;
                        alt62 = dfa62.predict(input);
                        switch (alt62) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1591:4: ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1591:4: ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) )
                    	    // InternalPipelineParser.g:1592:5: {...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0)");
                    	    }
                    	    // InternalPipelineParser.g:1592:100: ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) )
                    	    // InternalPipelineParser.g:1593:6: ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0);
                    	    					
                    	    // InternalPipelineParser.g:1596:9: ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) )
                    	    // InternalPipelineParser.g:1596:10: {...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleJob", "true");
                    	    }
                    	    // InternalPipelineParser.g:1596:19: (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? )
                    	    // InternalPipelineParser.g:1596:20: this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )?
                    	    {
                    	    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_40); 

                    	    									newLeafNode(this_BEGIN_5, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_1_0_0());
                    	    								
                    	    // InternalPipelineParser.g:1600:9: ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )?
                    	    int alt46=2;
                    	    int LA46_0 = input.LA(1);

                    	    if ( (LA46_0==DisplayName||LA46_0==Name) ) {
                    	        alt46=1;
                    	    }
                    	    switch (alt46) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:1601:10: ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) )
                    	            {
                    	            // InternalPipelineParser.g:1601:10: ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) )
                    	            // InternalPipelineParser.g:1602:11: ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) )
                    	            {
                    	            // InternalPipelineParser.g:1602:11: ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) )
                    	            // InternalPipelineParser.g:1603:12: (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName )
                    	            {
                    	            // InternalPipelineParser.g:1603:12: (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName )
                    	            int alt45=2;
                    	            int LA45_0 = input.LA(1);

                    	            if ( (LA45_0==Name) ) {
                    	                alt45=1;
                    	            }
                    	            else if ( (LA45_0==DisplayName) ) {
                    	                alt45=2;
                    	            }
                    	            else {
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 45, 0, input);

                    	                throw nvae;
                    	            }
                    	            switch (alt45) {
                    	                case 1 :
                    	                    // InternalPipelineParser.g:1604:13: lv_nameKW_6_1= Name
                    	                    {
                    	                    lv_nameKW_6_1=(Token)match(input,Name,FOLLOW_3); 

                    	                    													newLeafNode(lv_nameKW_6_1, grammarAccess.getJobAccess().getNameKWNameKeyword_1_0_1_0_0_0());
                    	                    												

                    	                    													if (current==null) {
                    	                    														current = createModelElement(grammarAccess.getJobRule());
                    	                    													}
                    	                    													setWithLastConsumed(current, "nameKW", lv_nameKW_6_1, null);
                    	                    												

                    	                    }
                    	                    break;
                    	                case 2 :
                    	                    // InternalPipelineParser.g:1615:13: lv_nameKW_6_2= DisplayName
                    	                    {
                    	                    lv_nameKW_6_2=(Token)match(input,DisplayName,FOLLOW_3); 

                    	                    													newLeafNode(lv_nameKW_6_2, grammarAccess.getJobAccess().getNameKWDisplayNameKeyword_1_0_1_0_0_1());
                    	                    												

                    	                    													if (current==null) {
                    	                    														current = createModelElement(grammarAccess.getJobRule());
                    	                    													}
                    	                    													setWithLastConsumed(current, "nameKW", lv_nameKW_6_2, null);
                    	                    												

                    	                    }
                    	                    break;

                    	            }


                    	            }


                    	            }

                    	            // InternalPipelineParser.g:1628:10: ( (lv_jobName_7_0= ruleStringValue ) )
                    	            // InternalPipelineParser.g:1629:11: (lv_jobName_7_0= ruleStringValue )
                    	            {
                    	            // InternalPipelineParser.g:1629:11: (lv_jobName_7_0= ruleStringValue )
                    	            // InternalPipelineParser.g:1630:12: lv_jobName_7_0= ruleStringValue
                    	            {

                    	            												newCompositeNode(grammarAccess.getJobAccess().getJobNameStringValueParserRuleCall_1_0_1_1_0());
                    	            											
                    	            pushFollow(FOLLOW_39);
                    	            lv_jobName_7_0=ruleStringValue();

                    	            state._fsp--;


                    	            												if (current==null) {
                    	            													current = createModelElementForParent(grammarAccess.getJobRule());
                    	            												}
                    	            												set(
                    	            													current,
                    	            													"jobName",
                    	            													lv_jobName_7_0,
                    	            													"ca.mcgill.devops.pipeline.Pipeline.StringValue");
                    	            												afterParserOrEnumRuleCall();
                    	            											

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
                    	    // InternalPipelineParser.g:1654:4: ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1654:4: ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) )
                    	    // InternalPipelineParser.g:1655:5: {...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1)");
                    	    }
                    	    // InternalPipelineParser.g:1655:100: ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) )
                    	    // InternalPipelineParser.g:1656:6: ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1);
                    	    					
                    	    // InternalPipelineParser.g:1659:9: ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) )
                    	    // InternalPipelineParser.g:1659:10: {...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleJob", "true");
                    	    }
                    	    // InternalPipelineParser.g:1659:19: (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) )
                    	    // InternalPipelineParser.g:1659:20: otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Permissions,FOLLOW_41); 

                    	    									newLeafNode(otherlv_8, grammarAccess.getJobAccess().getPermissionsKeyword_1_1_0());
                    	    								
                    	    // InternalPipelineParser.g:1663:9: ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) )
                    	    int alt47=2;
                    	    int LA47_0 = input.LA(1);

                    	    if ( (LA47_0==WriteAll||LA47_0==ReadAll) ) {
                    	        alt47=1;
                    	    }
                    	    else if ( (LA47_0==RULE_BEGIN) ) {
                    	        alt47=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 47, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt47) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:1664:10: ( (lv_permission_9_0= rulePermission ) )
                    	            {
                    	            // InternalPipelineParser.g:1664:10: ( (lv_permission_9_0= rulePermission ) )
                    	            // InternalPipelineParser.g:1665:11: (lv_permission_9_0= rulePermission )
                    	            {
                    	            // InternalPipelineParser.g:1665:11: (lv_permission_9_0= rulePermission )
                    	            // InternalPipelineParser.g:1666:12: lv_permission_9_0= rulePermission
                    	            {

                    	            												newCompositeNode(grammarAccess.getJobAccess().getPermissionPermissionEnumRuleCall_1_1_1_0_0());
                    	            											
                    	            pushFollow(FOLLOW_39);
                    	            lv_permission_9_0=rulePermission();

                    	            state._fsp--;


                    	            												if (current==null) {
                    	            													current = createModelElementForParent(grammarAccess.getJobRule());
                    	            												}
                    	            												set(
                    	            													current,
                    	            													"permission",
                    	            													lv_permission_9_0,
                    	            													"ca.mcgill.devops.pipeline.Pipeline.Permission");
                    	            												afterParserOrEnumRuleCall();
                    	            											

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:1684:10: (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END )
                    	            {
                    	            // InternalPipelineParser.g:1684:10: (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END )
                    	            // InternalPipelineParser.g:1685:11: this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END
                    	            {
                    	            this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

                    	            											newLeafNode(this_BEGIN_10, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_1_1_1_1_0());
                    	            										
                    	            // InternalPipelineParser.g:1689:11: ( (lv_value_11_0= ruleKeyValuePairs ) )
                    	            // InternalPipelineParser.g:1690:12: (lv_value_11_0= ruleKeyValuePairs )
                    	            {
                    	            // InternalPipelineParser.g:1690:12: (lv_value_11_0= ruleKeyValuePairs )
                    	            // InternalPipelineParser.g:1691:13: lv_value_11_0= ruleKeyValuePairs
                    	            {

                    	            													newCompositeNode(grammarAccess.getJobAccess().getValueKeyValuePairsParserRuleCall_1_1_1_1_1_0());
                    	            												
                    	            pushFollow(FOLLOW_8);
                    	            lv_value_11_0=ruleKeyValuePairs();

                    	            state._fsp--;


                    	            													if (current==null) {
                    	            														current = createModelElementForParent(grammarAccess.getJobRule());
                    	            													}
                    	            													add(
                    	            														current,
                    	            														"value",
                    	            														lv_value_11_0,
                    	            														"ca.mcgill.devops.pipeline.Pipeline.KeyValuePairs");
                    	            													afterParserOrEnumRuleCall();
                    	            												

                    	            }


                    	            }

                    	            this_END_12=(Token)match(input,RULE_END,FOLLOW_39); 

                    	            											newLeafNode(this_END_12, grammarAccess.getJobAccess().getENDTerminalRuleCall_1_1_1_1_2());
                    	            										

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
                    	    // InternalPipelineParser.g:1720:4: ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1720:4: ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) )
                    	    // InternalPipelineParser.g:1721:5: {...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2)");
                    	    }
                    	    // InternalPipelineParser.g:1721:100: ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) )
                    	    // InternalPipelineParser.g:1722:6: ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2);
                    	    					
                    	    // InternalPipelineParser.g:1725:9: ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) )
                    	    // InternalPipelineParser.g:1725:10: {...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleJob", "true");
                    	    }
                    	    // InternalPipelineParser.g:1725:19: ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) )
                    	    // InternalPipelineParser.g:1725:20: ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) )
                    	    {
                    	    // InternalPipelineParser.g:1725:20: ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) )
                    	    // InternalPipelineParser.g:1726:10: ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) )
                    	    {
                    	    // InternalPipelineParser.g:1726:10: ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) )
                    	    // InternalPipelineParser.g:1727:11: (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn )
                    	    {
                    	    // InternalPipelineParser.g:1727:11: (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn )
                    	    int alt48=2;
                    	    int LA48_0 = input.LA(1);

                    	    if ( (LA48_0==Needs) ) {
                    	        alt48=1;
                    	    }
                    	    else if ( (LA48_0==DependsOn) ) {
                    	        alt48=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 48, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt48) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:1728:12: lv_dependKW_13_1= Needs
                    	            {
                    	            lv_dependKW_13_1=(Token)match(input,Needs,FOLLOW_42); 

                    	            												newLeafNode(lv_dependKW_13_1, grammarAccess.getJobAccess().getDependKWNeedsKeyword_1_2_0_0_0());
                    	            											

                    	            												if (current==null) {
                    	            													current = createModelElement(grammarAccess.getJobRule());
                    	            												}
                    	            												setWithLastConsumed(current, "dependKW", lv_dependKW_13_1, null);
                    	            											

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:1739:12: lv_dependKW_13_2= DependsOn
                    	            {
                    	            lv_dependKW_13_2=(Token)match(input,DependsOn,FOLLOW_42); 

                    	            												newLeafNode(lv_dependKW_13_2, grammarAccess.getJobAccess().getDependKWDependsOnKeyword_1_2_0_0_1());
                    	            											

                    	            												if (current==null) {
                    	            													current = createModelElement(grammarAccess.getJobRule());
                    	            												}
                    	            												setWithLastConsumed(current, "dependKW", lv_dependKW_13_2, null);
                    	            											

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // InternalPipelineParser.g:1752:9: ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) )
                    	    int alt50=2;
                    	    int LA50_0 = input.LA(1);

                    	    if ( (LA50_0==RULE_ID) ) {
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
                    	            // InternalPipelineParser.g:1753:10: ( (otherlv_14= RULE_ID ) )
                    	            {
                    	            // InternalPipelineParser.g:1753:10: ( (otherlv_14= RULE_ID ) )
                    	            // InternalPipelineParser.g:1754:11: (otherlv_14= RULE_ID )
                    	            {
                    	            // InternalPipelineParser.g:1754:11: (otherlv_14= RULE_ID )
                    	            // InternalPipelineParser.g:1755:12: otherlv_14= RULE_ID
                    	            {

                    	            												if (current==null) {
                    	            													current = createModelElement(grammarAccess.getJobRule());
                    	            												}
                    	            											
                    	            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_39); 

                    	            												newLeafNode(otherlv_14, grammarAccess.getJobAccess().getReferencesJobCrossReference_1_2_1_0_0());
                    	            											

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:1767:10: (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket )
                    	            {
                    	            // InternalPipelineParser.g:1767:10: (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket )
                    	            // InternalPipelineParser.g:1768:11: otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket
                    	            {
                    	            otherlv_15=(Token)match(input,LeftSquareBracket,FOLLOW_28); 

                    	            											newLeafNode(otherlv_15, grammarAccess.getJobAccess().getLeftSquareBracketKeyword_1_2_1_1_0());
                    	            										
                    	            // InternalPipelineParser.g:1772:11: ( (otherlv_16= RULE_ID ) )
                    	            // InternalPipelineParser.g:1773:12: (otherlv_16= RULE_ID )
                    	            {
                    	            // InternalPipelineParser.g:1773:12: (otherlv_16= RULE_ID )
                    	            // InternalPipelineParser.g:1774:13: otherlv_16= RULE_ID
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getJobRule());
                    	            													}
                    	            												
                    	            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_14); 

                    	            													newLeafNode(otherlv_16, grammarAccess.getJobAccess().getReferencesJobCrossReference_1_2_1_1_1_0());
                    	            												

                    	            }


                    	            }

                    	            // InternalPipelineParser.g:1785:11: (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )*
                    	            loop49:
                    	            do {
                    	                int alt49=2;
                    	                int LA49_0 = input.LA(1);

                    	                if ( (LA49_0==Comma) ) {
                    	                    alt49=1;
                    	                }


                    	                switch (alt49) {
                    	            	case 1 :
                    	            	    // InternalPipelineParser.g:1786:12: otherlv_17= Comma ( (otherlv_18= RULE_ID ) )
                    	            	    {
                    	            	    otherlv_17=(Token)match(input,Comma,FOLLOW_28); 

                    	            	    												newLeafNode(otherlv_17, grammarAccess.getJobAccess().getCommaKeyword_1_2_1_1_2_0());
                    	            	    											
                    	            	    // InternalPipelineParser.g:1790:12: ( (otherlv_18= RULE_ID ) )
                    	            	    // InternalPipelineParser.g:1791:13: (otherlv_18= RULE_ID )
                    	            	    {
                    	            	    // InternalPipelineParser.g:1791:13: (otherlv_18= RULE_ID )
                    	            	    // InternalPipelineParser.g:1792:14: otherlv_18= RULE_ID
                    	            	    {

                    	            	    														if (current==null) {
                    	            	    															current = createModelElement(grammarAccess.getJobRule());
                    	            	    														}
                    	            	    													
                    	            	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_14); 

                    	            	    														newLeafNode(otherlv_18, grammarAccess.getJobAccess().getReferencesJobCrossReference_1_2_1_1_2_1_0());
                    	            	    													

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop49;
                    	                }
                    	            } while (true);

                    	            otherlv_19=(Token)match(input,RightSquareBracket,FOLLOW_39); 

                    	            											newLeafNode(otherlv_19, grammarAccess.getJobAccess().getRightSquareBracketKeyword_1_2_1_1_3());
                    	            										

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
                    	case 4 :
                    	    // InternalPipelineParser.g:1816:4: ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1816:4: ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) )
                    	    // InternalPipelineParser.g:1817:5: {...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 3)");
                    	    }
                    	    // InternalPipelineParser.g:1817:100: ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
                    	    // InternalPipelineParser.g:1818:6: ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 3);
                    	    					
                    	    // InternalPipelineParser.g:1821:9: ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
                    	    // InternalPipelineParser.g:1821:10: {...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleJob", "true");
                    	    }
                    	    // InternalPipelineParser.g:1821:19: ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
                    	    int alt58=2;
                    	    int LA58_0 = input.LA(1);

                    	    if ( (LA58_0==RunsOn) ) {
                    	        alt58=1;
                    	    }
                    	    else if ( (LA58_0==Pool) ) {
                    	        int LA58_2 = input.LA(2);

                    	        if ( (LA58_2==Demands||(LA58_2>=RULE_BEGIN && LA58_2<=RULE_END)) ) {
                    	            alt58=2;
                    	        }
                    	        else if ( (LA58_2==LeftSquareBracket||LA58_2==RULE_ID) ) {
                    	            alt58=1;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 58, 2, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 58, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt58) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:1821:20: ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) )
                    	            {
                    	            // InternalPipelineParser.g:1821:20: ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) )
                    	            // InternalPipelineParser.g:1822:10: ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) )
                    	            {
                    	            // InternalPipelineParser.g:1822:10: ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) )
                    	            // InternalPipelineParser.g:1823:11: ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) )
                    	            {
                    	            // InternalPipelineParser.g:1823:11: ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) )
                    	            // InternalPipelineParser.g:1824:12: (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool )
                    	            {
                    	            // InternalPipelineParser.g:1824:12: (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool )
                    	            int alt51=2;
                    	            int LA51_0 = input.LA(1);

                    	            if ( (LA51_0==RunsOn) ) {
                    	                alt51=1;
                    	            }
                    	            else if ( (LA51_0==Pool) ) {
                    	                alt51=2;
                    	            }
                    	            else {
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 51, 0, input);

                    	                throw nvae;
                    	            }
                    	            switch (alt51) {
                    	                case 1 :
                    	                    // InternalPipelineParser.g:1825:13: lv_runKW_20_1= RunsOn
                    	                    {
                    	                    lv_runKW_20_1=(Token)match(input,RunsOn,FOLLOW_42); 

                    	                    													newLeafNode(lv_runKW_20_1, grammarAccess.getJobAccess().getRunKWRunsOnKeyword_1_3_0_0_0_0());
                    	                    												

                    	                    													if (current==null) {
                    	                    														current = createModelElement(grammarAccess.getJobRule());
                    	                    													}
                    	                    													setWithLastConsumed(current, "runKW", lv_runKW_20_1, null);
                    	                    												

                    	                    }
                    	                    break;
                    	                case 2 :
                    	                    // InternalPipelineParser.g:1836:13: lv_runKW_20_2= Pool
                    	                    {
                    	                    lv_runKW_20_2=(Token)match(input,Pool,FOLLOW_42); 

                    	                    													newLeafNode(lv_runKW_20_2, grammarAccess.getJobAccess().getRunKWPoolKeyword_1_3_0_0_0_1());
                    	                    												

                    	                    													if (current==null) {
                    	                    														current = createModelElement(grammarAccess.getJobRule());
                    	                    													}
                    	                    													setWithLastConsumed(current, "runKW", lv_runKW_20_2, null);
                    	                    												

                    	                    }
                    	                    break;

                    	            }


                    	            }


                    	            }

                    	            // InternalPipelineParser.g:1849:10: ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) )
                    	            // InternalPipelineParser.g:1850:11: ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) )
                    	            {
                    	            // InternalPipelineParser.g:1850:11: ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) )
                    	            // InternalPipelineParser.g:1851:12: (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList )
                    	            {
                    	            // InternalPipelineParser.g:1851:12: (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList )
                    	            int alt52=2;
                    	            int LA52_0 = input.LA(1);

                    	            if ( (LA52_0==RULE_ID) ) {
                    	                alt52=1;
                    	            }
                    	            else if ( (LA52_0==LeftSquareBracket) ) {
                    	                alt52=2;
                    	            }
                    	            else {
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 52, 0, input);

                    	                throw nvae;
                    	            }
                    	            switch (alt52) {
                    	                case 1 :
                    	                    // InternalPipelineParser.g:1852:13: lv_vm_21_1= RULE_ID
                    	                    {
                    	                    lv_vm_21_1=(Token)match(input,RULE_ID,FOLLOW_39); 

                    	                    													newLeafNode(lv_vm_21_1, grammarAccess.getJobAccess().getVmIDTerminalRuleCall_1_3_0_1_0_0());
                    	                    												

                    	                    													if (current==null) {
                    	                    														current = createModelElement(grammarAccess.getJobRule());
                    	                    													}
                    	                    													setWithLastConsumed(
                    	                    														current,
                    	                    														"vm",
                    	                    														lv_vm_21_1,
                    	                    														"ca.mcgill.devops.pipeline.Pipeline.ID");
                    	                    												

                    	                    }
                    	                    break;
                    	                case 2 :
                    	                    // InternalPipelineParser.g:1867:13: lv_vm_21_2= ruleArrayList
                    	                    {

                    	                    													newCompositeNode(grammarAccess.getJobAccess().getVmArrayListParserRuleCall_1_3_0_1_0_1());
                    	                    												
                    	                    pushFollow(FOLLOW_39);
                    	                    lv_vm_21_2=ruleArrayList();

                    	                    state._fsp--;


                    	                    													if (current==null) {
                    	                    														current = createModelElementForParent(grammarAccess.getJobRule());
                    	                    													}
                    	                    													set(
                    	                    														current,
                    	                    														"vm",
                    	                    														lv_vm_21_2,
                    	                    														"ca.mcgill.devops.pipeline.Pipeline.ArrayList");
                    	                    													afterParserOrEnumRuleCall();
                    	                    												

                    	                    }
                    	                    break;

                    	            }


                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:1887:9: ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) )
                    	            {
                    	            // InternalPipelineParser.g:1887:9: ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) )
                    	            // InternalPipelineParser.g:1888:10: ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) )
                    	            {
                    	            // InternalPipelineParser.g:1888:10: ( (lv_runKW_22_0= Pool ) )
                    	            // InternalPipelineParser.g:1889:11: (lv_runKW_22_0= Pool )
                    	            {
                    	            // InternalPipelineParser.g:1889:11: (lv_runKW_22_0= Pool )
                    	            // InternalPipelineParser.g:1890:12: lv_runKW_22_0= Pool
                    	            {
                    	            lv_runKW_22_0=(Token)match(input,Pool,FOLLOW_43); 

                    	            												newLeafNode(lv_runKW_22_0, grammarAccess.getJobAccess().getRunKWPoolKeyword_1_3_1_0_0());
                    	            											

                    	            												if (current==null) {
                    	            													current = createModelElement(grammarAccess.getJobRule());
                    	            												}
                    	            												setWithLastConsumed(current, "runKW", lv_runKW_22_0, "pool:");
                    	            											

                    	            }


                    	            }

                    	            // InternalPipelineParser.g:1902:10: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) )
                    	            // InternalPipelineParser.g:1903:11: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) )
                    	            {
                    	            // InternalPipelineParser.g:1903:11: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) )
                    	            // InternalPipelineParser.g:1904:12: ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?)
                    	            {
                    	             
                    	            											  getUnorderedGroupHelper().enter(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1());
                    	            											
                    	            // InternalPipelineParser.g:1907:12: ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?)
                    	            // InternalPipelineParser.g:1908:13: ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?
                    	            {
                    	            // InternalPipelineParser.g:1908:13: ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+
                    	            int cnt57=0;
                    	            loop57:
                    	            do {
                    	                int alt57=3;
                    	                int LA57_0 = input.LA(1);

                    	                if ( (LA57_0==RULE_END) ) {
                    	                    int LA57_1 = input.LA(2);

                    	                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1(), 1) ) {
                    	                        alt57=2;
                    	                    }


                    	                }
                    	                else if ( (LA57_0==RULE_BEGIN) ) {
                    	                    int LA57_3 = input.LA(2);

                    	                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1(), 0) ) {
                    	                        alt57=1;
                    	                    }


                    	                }
                    	                else if ( LA57_0 == Demands && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1(), 1) ) {
                    	                    alt57=2;
                    	                }


                    	                switch (alt57) {
                    	            	case 1 :
                    	            	    // InternalPipelineParser.g:1909:11: ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) )
                    	            	    {
                    	            	    // InternalPipelineParser.g:1909:11: ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) )
                    	            	    // InternalPipelineParser.g:1910:12: {...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) )
                    	            	    {
                    	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1(), 0) ) {
                    	            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1(), 0)");
                    	            	    }
                    	            	    // InternalPipelineParser.g:1910:113: ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) )
                    	            	    // InternalPipelineParser.g:1911:13: ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) )
                    	            	    {

                    	            	    													getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1(), 0);
                    	            	    												
                    	            	    // InternalPipelineParser.g:1914:16: ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) )
                    	            	    // InternalPipelineParser.g:1914:17: {...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? )
                    	            	    {
                    	            	    if ( !((true)) ) {
                    	            	        throw new FailedPredicateException(input, "ruleJob", "true");
                    	            	    }
                    	            	    // InternalPipelineParser.g:1914:26: (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? )
                    	            	    // InternalPipelineParser.g:1914:27: this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )?
                    	            	    {
                    	            	    this_BEGIN_24=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

                    	            	    																newLeafNode(this_BEGIN_24, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_1_3_1_1_0_0());
                    	            	    															
                    	            	    // InternalPipelineParser.g:1918:16: (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )?
                    	            	    int alt53=2;
                    	            	    int LA53_0 = input.LA(1);

                    	            	    if ( (LA53_0==Name) ) {
                    	            	        alt53=1;
                    	            	    }
                    	            	    switch (alt53) {
                    	            	        case 1 :
                    	            	            // InternalPipelineParser.g:1919:17: otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) )
                    	            	            {
                    	            	            otherlv_25=(Token)match(input,Name,FOLLOW_3); 

                    	            	            																	newLeafNode(otherlv_25, grammarAccess.getJobAccess().getNameKeyword_1_3_1_1_0_1_0());
                    	            	            																
                    	            	            // InternalPipelineParser.g:1923:17: ( (lv_poolName_26_0= ruleStringValue ) )
                    	            	            // InternalPipelineParser.g:1924:18: (lv_poolName_26_0= ruleStringValue )
                    	            	            {
                    	            	            // InternalPipelineParser.g:1924:18: (lv_poolName_26_0= ruleStringValue )
                    	            	            // InternalPipelineParser.g:1925:19: lv_poolName_26_0= ruleStringValue
                    	            	            {

                    	            	            																			newCompositeNode(grammarAccess.getJobAccess().getPoolNameStringValueParserRuleCall_1_3_1_1_0_1_1_0());
                    	            	            																		
                    	            	            pushFollow(FOLLOW_45);
                    	            	            lv_poolName_26_0=ruleStringValue();

                    	            	            state._fsp--;


                    	            	            																			if (current==null) {
                    	            	            																				current = createModelElementForParent(grammarAccess.getJobRule());
                    	            	            																			}
                    	            	            																			set(
                    	            	            																				current,
                    	            	            																				"poolName",
                    	            	            																				lv_poolName_26_0,
                    	            	            																				"ca.mcgill.devops.pipeline.Pipeline.StringValue");
                    	            	            																			afterParserOrEnumRuleCall();
                    	            	            																		

                    	            	            }


                    	            	            }


                    	            	            }
                    	            	            break;

                    	            	    }

                    	            	    // InternalPipelineParser.g:1943:16: (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )?
                    	            	    int alt54=2;
                    	            	    int LA54_0 = input.LA(1);

                    	            	    if ( (LA54_0==VmImage) ) {
                    	            	        alt54=1;
                    	            	    }
                    	            	    switch (alt54) {
                    	            	        case 1 :
                    	            	            // InternalPipelineParser.g:1944:17: otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) )
                    	            	            {
                    	            	            otherlv_27=(Token)match(input,VmImage,FOLLOW_3); 

                    	            	            																	newLeafNode(otherlv_27, grammarAccess.getJobAccess().getVmImageKeyword_1_3_1_1_0_2_0());
                    	            	            																
                    	            	            // InternalPipelineParser.g:1948:17: ( (lv_poolVm_28_0= ruleStringValue ) )
                    	            	            // InternalPipelineParser.g:1949:18: (lv_poolVm_28_0= ruleStringValue )
                    	            	            {
                    	            	            // InternalPipelineParser.g:1949:18: (lv_poolVm_28_0= ruleStringValue )
                    	            	            // InternalPipelineParser.g:1950:19: lv_poolVm_28_0= ruleStringValue
                    	            	            {

                    	            	            																			newCompositeNode(grammarAccess.getJobAccess().getPoolVmStringValueParserRuleCall_1_3_1_1_0_2_1_0());
                    	            	            																		
                    	            	            pushFollow(FOLLOW_46);
                    	            	            lv_poolVm_28_0=ruleStringValue();

                    	            	            state._fsp--;


                    	            	            																			if (current==null) {
                    	            	            																				current = createModelElementForParent(grammarAccess.getJobRule());
                    	            	            																			}
                    	            	            																			set(
                    	            	            																				current,
                    	            	            																				"poolVm",
                    	            	            																				lv_poolVm_28_0,
                    	            	            																				"ca.mcgill.devops.pipeline.Pipeline.StringValue");
                    	            	            																			afterParserOrEnumRuleCall();
                    	            	            																		

                    	            	            }


                    	            	            }


                    	            	            }
                    	            	            break;

                    	            	    }


                    	            	    }


                    	            	    }

                    	            	     
                    	            	    													getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1());
                    	            	    												

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;
                    	            	case 2 :
                    	            	    // InternalPipelineParser.g:1974:11: ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) )
                    	            	    {
                    	            	    // InternalPipelineParser.g:1974:11: ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) )
                    	            	    // InternalPipelineParser.g:1975:12: {...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) )
                    	            	    {
                    	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1(), 1) ) {
                    	            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1(), 1)");
                    	            	    }
                    	            	    // InternalPipelineParser.g:1975:113: ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) )
                    	            	    // InternalPipelineParser.g:1976:13: ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) )
                    	            	    {

                    	            	    													getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1(), 1);
                    	            	    												
                    	            	    // InternalPipelineParser.g:1979:16: ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) )
                    	            	    // InternalPipelineParser.g:1979:17: {...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END )
                    	            	    {
                    	            	    if ( !((true)) ) {
                    	            	        throw new FailedPredicateException(input, "ruleJob", "true");
                    	            	    }
                    	            	    // InternalPipelineParser.g:1979:26: ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END )
                    	            	    // InternalPipelineParser.g:1979:27: (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END
                    	            	    {
                    	            	    // InternalPipelineParser.g:1979:27: (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )?
                    	            	    int alt56=2;
                    	            	    int LA56_0 = input.LA(1);

                    	            	    if ( (LA56_0==Demands) ) {
                    	            	        alt56=1;
                    	            	    }
                    	            	    switch (alt56) {
                    	            	        case 1 :
                    	            	            // InternalPipelineParser.g:1980:17: otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) )
                    	            	            {
                    	            	            otherlv_29=(Token)match(input,Demands,FOLLOW_24); 

                    	            	            																	newLeafNode(otherlv_29, grammarAccess.getJobAccess().getDemandsKeyword_1_3_1_1_1_0_0());
                    	            	            																
                    	            	            // InternalPipelineParser.g:1984:17: ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) )
                    	            	            // InternalPipelineParser.g:1985:18: ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) )
                    	            	            {
                    	            	            // InternalPipelineParser.g:1985:18: ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) )
                    	            	            // InternalPipelineParser.g:1986:19: (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters )
                    	            	            {
                    	            	            // InternalPipelineParser.g:1986:19: (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters )
                    	            	            int alt55=2;
                    	            	            int LA55_0 = input.LA(1);

                    	            	            if ( ((LA55_0>=RULE_SINGLE_CHAR && LA55_0<=RULE_STRING)||LA55_0==RULE_VERSION) ) {
                    	            	                alt55=1;
                    	            	            }
                    	            	            else if ( (LA55_0==HyphenMinus) ) {
                    	            	                alt55=2;
                    	            	            }
                    	            	            else {
                    	            	                NoViableAltException nvae =
                    	            	                    new NoViableAltException("", 55, 0, input);

                    	            	                throw nvae;
                    	            	            }
                    	            	            switch (alt55) {
                    	            	                case 1 :
                    	            	                    // InternalPipelineParser.g:1987:20: lv_poolDemands_30_1= ruleStringValue
                    	            	                    {

                    	            	                    																				newCompositeNode(grammarAccess.getJobAccess().getPoolDemandsStringValueParserRuleCall_1_3_1_1_1_0_1_0_0());
                    	            	                    																			
                    	            	                    pushFollow(FOLLOW_8);
                    	            	                    lv_poolDemands_30_1=ruleStringValue();

                    	            	                    state._fsp--;


                    	            	                    																				if (current==null) {
                    	            	                    																					current = createModelElementForParent(grammarAccess.getJobRule());
                    	            	                    																				}
                    	            	                    																				set(
                    	            	                    																					current,
                    	            	                    																					"poolDemands",
                    	            	                    																					lv_poolDemands_30_1,
                    	            	                    																					"ca.mcgill.devops.pipeline.Pipeline.StringValue");
                    	            	                    																				afterParserOrEnumRuleCall();
                    	            	                    																			

                    	            	                    }
                    	            	                    break;
                    	            	                case 2 :
                    	            	                    // InternalPipelineParser.g:2003:20: lv_poolDemands_30_2= ruleHyphenParameters
                    	            	                    {

                    	            	                    																				newCompositeNode(grammarAccess.getJobAccess().getPoolDemandsHyphenParametersParserRuleCall_1_3_1_1_1_0_1_0_1());
                    	            	                    																			
                    	            	                    pushFollow(FOLLOW_8);
                    	            	                    lv_poolDemands_30_2=ruleHyphenParameters();

                    	            	                    state._fsp--;


                    	            	                    																				if (current==null) {
                    	            	                    																					current = createModelElementForParent(grammarAccess.getJobRule());
                    	            	                    																				}
                    	            	                    																				set(
                    	            	                    																					current,
                    	            	                    																					"poolDemands",
                    	            	                    																					lv_poolDemands_30_2,
                    	            	                    																					"ca.mcgill.devops.pipeline.Pipeline.HyphenParameters");
                    	            	                    																				afterParserOrEnumRuleCall();
                    	            	                    																			

                    	            	                    }
                    	            	                    break;

                    	            	            }


                    	            	            }


                    	            	            }


                    	            	            }
                    	            	            break;

                    	            	    }

                    	            	    this_END_31=(Token)match(input,RULE_END,FOLLOW_46); 

                    	            	    																newLeafNode(this_END_31, grammarAccess.getJobAccess().getENDTerminalRuleCall_1_3_1_1_1_1());
                    	            	    															

                    	            	    }


                    	            	    }

                    	            	     
                    	            	    													getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1());
                    	            	    												

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt57 >= 1 ) break loop57;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(57, input);
                    	                        throw eee;
                    	                }
                    	                cnt57++;
                    	            } while (true);

                    	            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1()) ) {
                    	                throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1())");
                    	            }

                    	            }


                    	            }

                    	             
                    	            											  getUnorderedGroupHelper().leave(grammarAccess.getJobAccess().getUnorderedGroup_1_3_1_1());
                    	            											

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalPipelineParser.g:2047:4: ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) )
                    	    {
                    	    // InternalPipelineParser.g:2047:4: ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) )
                    	    // InternalPipelineParser.g:2048:5: {...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 4)");
                    	    }
                    	    // InternalPipelineParser.g:2048:100: ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ )
                    	    // InternalPipelineParser.g:2049:6: ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 4);
                    	    					
                    	    // InternalPipelineParser.g:2052:9: ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+
                    	    int cnt59=0;
                    	    loop59:
                    	    do {
                    	        int alt59=2;
                    	        int LA59_0 = input.LA(1);

                    	        if ( (LA59_0==HyphenMinus) ) {
                    	            int LA59_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt59=1;
                    	            }


                    	        }


                    	        switch (alt59) {
                    	    	case 1 :
                    	    	    // InternalPipelineParser.g:2052:10: {...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleJob", "true");
                    	    	    }
                    	    	    // InternalPipelineParser.g:2052:19: ( (lv_jobParameters_32_0= ruleJobParameter ) )
                    	    	    // InternalPipelineParser.g:2052:20: (lv_jobParameters_32_0= ruleJobParameter )
                    	    	    {
                    	    	    // InternalPipelineParser.g:2052:20: (lv_jobParameters_32_0= ruleJobParameter )
                    	    	    // InternalPipelineParser.g:2053:10: lv_jobParameters_32_0= ruleJobParameter
                    	    	    {

                    	    	    										newCompositeNode(grammarAccess.getJobAccess().getJobParametersJobParameterParserRuleCall_1_4_0());
                    	    	    									
                    	    	    pushFollow(FOLLOW_39);
                    	    	    lv_jobParameters_32_0=ruleJobParameter();

                    	    	    state._fsp--;


                    	    	    										if (current==null) {
                    	    	    											current = createModelElementForParent(grammarAccess.getJobRule());
                    	    	    										}
                    	    	    										add(
                    	    	    											current,
                    	    	    											"jobParameters",
                    	    	    											lv_jobParameters_32_0,
                    	    	    											"ca.mcgill.devops.pipeline.Pipeline.JobParameter");
                    	    	    										afterParserOrEnumRuleCall();
                    	    	    									

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt59 >= 1 ) break loop59;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(59, input);
                    	                throw eee;
                    	        }
                    	        cnt59++;
                    	    } while (true);

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalPipelineParser.g:2075:4: ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:2075:4: ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) )
                    	    // InternalPipelineParser.g:2076:5: {...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 5)");
                    	    }
                    	    // InternalPipelineParser.g:2076:100: ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) )
                    	    // InternalPipelineParser.g:2077:6: ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 5);
                    	    					
                    	    // InternalPipelineParser.g:2080:9: ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) )
                    	    // InternalPipelineParser.g:2080:10: {...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleJob", "true");
                    	    }
                    	    // InternalPipelineParser.g:2080:19: ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END )
                    	    // InternalPipelineParser.g:2080:20: (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END
                    	    {
                    	    // InternalPipelineParser.g:2080:20: (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )?
                    	    int alt61=2;
                    	    int LA61_0 = input.LA(1);

                    	    if ( (LA61_0==Steps) ) {
                    	        alt61=1;
                    	    }
                    	    switch (alt61) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:2081:10: otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )*
                    	            {
                    	            otherlv_33=(Token)match(input,Steps,FOLLOW_17); 

                    	            										newLeafNode(otherlv_33, grammarAccess.getJobAccess().getStepsKeyword_1_5_0_0());
                    	            									
                    	            // InternalPipelineParser.g:2085:10: ( (lv_steps_34_0= ruleStep ) )*
                    	            loop60:
                    	            do {
                    	                int alt60=2;
                    	                int LA60_0 = input.LA(1);

                    	                if ( (LA60_0==HyphenMinus) ) {
                    	                    alt60=1;
                    	                }


                    	                switch (alt60) {
                    	            	case 1 :
                    	            	    // InternalPipelineParser.g:2086:11: (lv_steps_34_0= ruleStep )
                    	            	    {
                    	            	    // InternalPipelineParser.g:2086:11: (lv_steps_34_0= ruleStep )
                    	            	    // InternalPipelineParser.g:2087:12: lv_steps_34_0= ruleStep
                    	            	    {

                    	            	    												newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_1_5_0_1_0());
                    	            	    											
                    	            	    pushFollow(FOLLOW_17);
                    	            	    lv_steps_34_0=ruleStep();

                    	            	    state._fsp--;


                    	            	    												if (current==null) {
                    	            	    													current = createModelElementForParent(grammarAccess.getJobRule());
                    	            	    												}
                    	            	    												add(
                    	            	    													current,
                    	            	    													"steps",
                    	            	    													lv_steps_34_0,
                    	            	    													"ca.mcgill.devops.pipeline.Pipeline.Step");
                    	            	    												afterParserOrEnumRuleCall();
                    	            	    											

                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop60;
                    	                }
                    	            } while (true);


                    	            }
                    	            break;

                    	    }

                    	    this_END_35=(Token)match(input,RULE_END,FOLLOW_39); 

                    	    									newLeafNode(this_END_35, grammarAccess.getJobAccess().getENDTerminalRuleCall_1_5_1());
                    	    								

                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt62 >= 1 ) break loop62;
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_1()) ) {
                        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_1())");
                    }

                    }


                    }

                     
                    				  getUnorderedGroupHelper().leave(grammarAccess.getJobAccess().getUnorderedGroup_1());
                    				

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
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleJobParameter"
    // InternalPipelineParser.g:2127:1: entryRuleJobParameter returns [EObject current=null] : iv_ruleJobParameter= ruleJobParameter EOF ;
    public final EObject entryRuleJobParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobParameter = null;


        try {
            // InternalPipelineParser.g:2127:53: (iv_ruleJobParameter= ruleJobParameter EOF )
            // InternalPipelineParser.g:2128:2: iv_ruleJobParameter= ruleJobParameter EOF
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
    // InternalPipelineParser.g:2134:1: ruleJobParameter returns [EObject current=null] : (otherlv_0= HyphenMinus ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList ) ) ) | ( (lv_keyword_2_0= rulePipelineKeyword ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameters_4_0= ruleParameterValue ) )* this_END_5= RULE_END )? ) ;
    public final EObject ruleJobParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_2 = null;

        Enumerator lv_keyword_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:2140:2: ( (otherlv_0= HyphenMinus ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList ) ) ) | ( (lv_keyword_2_0= rulePipelineKeyword ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameters_4_0= ruleParameterValue ) )* this_END_5= RULE_END )? ) )
            // InternalPipelineParser.g:2141:2: (otherlv_0= HyphenMinus ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList ) ) ) | ( (lv_keyword_2_0= rulePipelineKeyword ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameters_4_0= ruleParameterValue ) )* this_END_5= RULE_END )? )
            {
            // InternalPipelineParser.g:2141:2: (otherlv_0= HyphenMinus ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList ) ) ) | ( (lv_keyword_2_0= rulePipelineKeyword ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameters_4_0= ruleParameterValue ) )* this_END_5= RULE_END )? )
            // InternalPipelineParser.g:2142:3: otherlv_0= HyphenMinus ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList ) ) ) | ( (lv_keyword_2_0= rulePipelineKeyword ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameters_4_0= ruleParameterValue ) )* this_END_5= RULE_END )?
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getJobParameterAccess().getHyphenMinusKeyword_0());
            		
            // InternalPipelineParser.g:2146:3: ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList ) ) ) | ( (lv_keyword_2_0= rulePipelineKeyword ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LeftSquareBracket||LA65_0==RULE_ID) ) {
                alt65=1;
            }
            else if ( ((LA65_0>=ContinueOnError && LA65_0<=Credentials)||(LA65_0>=Environment && LA65_0<=TagsIgnore)||(LA65_0>=Containers && LA65_0<=Entrypoint)||LA65_0==Container||(LA65_0>=FailFast && LA65_0<=Branches)||LA65_0==Defaults||(LA65_0>=Packages && LA65_0<=Webhooks)||(LA65_0>=Exclude && LA65_0<=Inherit)||LA65_0==Outputs||(LA65_0>=Rolling && LA65_0<=Trigger)||(LA65_0>=Builds && LA65_0<=Canary)||(LA65_0>=Inputs && LA65_0<=Script)||LA65_0==Target||(LA65_0>=Build && LA65_0<=Shell)||(LA65_0>=Types && LA65_0<=Args)||LA65_0==Cron||(LA65_0>=Name && LA65_0<=Path)||LA65_0==Push||LA65_0==Tags||(LA65_0>=Type && LA65_0<=Uses)||LA65_0==Env||(LA65_0>=Id && LA65_0<=Pr)) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalPipelineParser.g:2147:4: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList ) ) )
                    {
                    // InternalPipelineParser.g:2147:4: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList ) ) )
                    // InternalPipelineParser.g:2148:5: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList ) )
                    {
                    // InternalPipelineParser.g:2148:5: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList ) )
                    // InternalPipelineParser.g:2149:6: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList )
                    {
                    // InternalPipelineParser.g:2149:6: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleArrayList )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_ID) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==LeftSquareBracket) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalPipelineParser.g:2150:7: lv_name_1_1= RULE_ID
                            {
                            lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_48); 

                            							newLeafNode(lv_name_1_1, grammarAccess.getJobParameterAccess().getNameIDTerminalRuleCall_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getJobParameterRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_1_1,
                            								"ca.mcgill.devops.pipeline.Pipeline.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:2165:7: lv_name_1_2= ruleArrayList
                            {

                            							newCompositeNode(grammarAccess.getJobParameterAccess().getNameArrayListParserRuleCall_1_0_0_1());
                            						
                            pushFollow(FOLLOW_48);
                            lv_name_1_2=ruleArrayList();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getJobParameterRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_1_2,
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
                    // InternalPipelineParser.g:2184:4: ( (lv_keyword_2_0= rulePipelineKeyword ) )
                    {
                    // InternalPipelineParser.g:2184:4: ( (lv_keyword_2_0= rulePipelineKeyword ) )
                    // InternalPipelineParser.g:2185:5: (lv_keyword_2_0= rulePipelineKeyword )
                    {
                    // InternalPipelineParser.g:2185:5: (lv_keyword_2_0= rulePipelineKeyword )
                    // InternalPipelineParser.g:2186:6: lv_keyword_2_0= rulePipelineKeyword
                    {

                    						newCompositeNode(grammarAccess.getJobParameterAccess().getKeywordPipelineKeywordEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_keyword_2_0=rulePipelineKeyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobParameterRule());
                    						}
                    						set(
                    							current,
                    							"keyword",
                    							lv_keyword_2_0,
                    							"ca.mcgill.devops.pipeline.Pipeline.PipelineKeyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPipelineParser.g:2204:3: (this_BEGIN_3= RULE_BEGIN ( (lv_parameters_4_0= ruleParameterValue ) )* this_END_5= RULE_END )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // InternalPipelineParser.g:2205:4: this_BEGIN_3= RULE_BEGIN ( (lv_parameters_4_0= ruleParameterValue ) )* this_END_5= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

                    				newLeafNode(this_BEGIN_3, grammarAccess.getJobParameterAccess().getBEGINTerminalRuleCall_2_0());
                    			
                    // InternalPipelineParser.g:2209:4: ( (lv_parameters_4_0= ruleParameterValue ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==RULE_ID) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2210:5: (lv_parameters_4_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:2210:5: (lv_parameters_4_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:2211:6: lv_parameters_4_0= ruleParameterValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getJobParameterAccess().getParametersParameterValueParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_parameters_4_0=ruleParameterValue();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getJobParameterRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_4_0,
                    	    							"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_5, grammarAccess.getJobParameterAccess().getENDTerminalRuleCall_2_2());
                    			

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
    // InternalPipelineParser.g:2237:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalPipelineParser.g:2237:45: (iv_ruleStep= ruleStep EOF )
            // InternalPipelineParser.g:2238:2: iv_ruleStep= ruleStep EOF
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
    // InternalPipelineParser.g:2244:1: ruleStep returns [EObject current=null] : (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Action_1 = null;

        EObject this_Script_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:2250:2: ( (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) ) )
            // InternalPipelineParser.g:2251:2: (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) )
            {
            // InternalPipelineParser.g:2251:2: (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) )
            // InternalPipelineParser.g:2252:3: otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript )
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getHyphenMinusKeyword_0());
            		
            // InternalPipelineParser.g:2256:3: (this_Action_1= ruleAction | this_Script_2= ruleScript )
            int alt68=2;
            switch ( input.LA(1) ) {
            case ContinueOnError:
            case SettableVariables:
            case WorkingDirectory:
            case BranchesIgnore:
            case TimeoutMinutes:
            case DownloadBuild:
            case MaxParallel:
            case PathsIgnore:
            case Pull_request:
            case Repositories:
            case Workflow_run:
            case Concurrency:
            case Credentials:
            case Environment:
            case Permissions:
            case TagsIgnore:
            case Containers:
            case Deployment:
            case Entrypoint:
            case Container:
            case FailFast:
            case Pipelines:
            case Resources:
            case ReviewApp:
            case Schedules:
            case Variables:
            case Branches:
            case Defaults:
            case Packages:
            case Pipeline:
            case Required:
            case RunName:
            case Schedule:
            case Strategy:
            case Template:
            case Webhooks:
            case Exclude:
            case Extends:
            case Filters:
            case Include:
            case Inherit:
            case Outputs:
            case Rolling:
            case RunOnce:
            case RunsOn:
            case Secrets:
            case Trigger:
            case Builds:
            case Canary:
            case Inputs:
            case Matrix:
            case Target:
            case Build:
            case Group:
            case Image:
            case Needs:
            case Paths:
            case Ports:
            case Shell:
            case Types:
            case Args:
            case Cron:
            case Name:
            case Path:
            case Push:
            case Tags:
            case Type:
            case Uses:
            case Env:
            case Id:
            case If:
            case On:
            case Pr:
                {
                alt68=1;
                }
                break;
            case Script:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt68=1;
                    }
                    break;
                case RULE_SINGLE_CHAR:
                    {
                    alt68=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt68=1;
                    }
                    break;
                case EOF:
                case Parameters:
                case With:
                case HyphenMinus:
                case RULE_VERSION:
                case RULE_BEGIN:
                case RULE_END:
                    {
                    alt68=1;
                    }
                    break;
                case GreaterThanSignHyphenMinus:
                case VerticalLine:
                    {
                    alt68=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 2, input);

                    throw nvae;
                }

                }
                break;
            case GetPackage:
            case Powershell:
            case Checkout:
            case Download:
            case Publish:
            case Bash:
            case Pwsh:
            case Task:
            case Run:
                {
                alt68=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalPipelineParser.g:2257:4: this_Action_1= ruleAction
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
                    // InternalPipelineParser.g:2266:4: this_Script_2= ruleScript
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
    // InternalPipelineParser.g:2279:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalPipelineParser.g:2279:47: (iv_ruleScript= ruleScript EOF )
            // InternalPipelineParser.g:2280:2: iv_ruleScript= ruleScript EOF
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
    // InternalPipelineParser.g:2286:1: ruleScript returns [EObject current=null] : ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleStringValue ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleStringValue ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? ) ;
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
            // InternalPipelineParser.g:2292:2: ( ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleStringValue ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleStringValue ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? ) )
            // InternalPipelineParser.g:2293:2: ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleStringValue ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleStringValue ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? )
            {
            // InternalPipelineParser.g:2293:2: ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleStringValue ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleStringValue ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? )
            // InternalPipelineParser.g:2294:3: ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleStringValue ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleStringValue ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )?
            {
            // InternalPipelineParser.g:2294:3: ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleStringValue ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleStringValue ) ) this_END_6= RULE_END ) ) )
            // InternalPipelineParser.g:2295:4: ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleStringValue ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleStringValue ) ) this_END_6= RULE_END ) )
            {
            // InternalPipelineParser.g:2295:4: ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) )
            // InternalPipelineParser.g:2296:5: ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) )
            {
            // InternalPipelineParser.g:2296:5: ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) )
            // InternalPipelineParser.g:2297:6: (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task )
            {
            // InternalPipelineParser.g:2297:6: (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task )
            int alt69=10;
            switch ( input.LA(1) ) {
            case Run:
                {
                alt69=1;
                }
                break;
            case Script:
                {
                alt69=2;
                }
                break;
            case Bash:
                {
                alt69=3;
                }
                break;
            case Pwsh:
                {
                alt69=4;
                }
                break;
            case Powershell:
                {
                alt69=5;
                }
                break;
            case Checkout:
                {
                alt69=6;
                }
                break;
            case Download:
                {
                alt69=7;
                }
                break;
            case GetPackage:
                {
                alt69=8;
                }
                break;
            case Publish:
                {
                alt69=9;
                }
                break;
            case Task:
                {
                alt69=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalPipelineParser.g:2298:7: lv_name_0_1= Run
                    {
                    lv_name_0_1=(Token)match(input,Run,FOLLOW_50); 

                    							newLeafNode(lv_name_0_1, grammarAccess.getScriptAccess().getNameRunKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_1, null);
                    						

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2309:7: lv_name_0_2= Script
                    {
                    lv_name_0_2=(Token)match(input,Script,FOLLOW_50); 

                    							newLeafNode(lv_name_0_2, grammarAccess.getScriptAccess().getNameScriptKeyword_0_0_0_1());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_2, null);
                    						

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:2320:7: lv_name_0_3= Bash
                    {
                    lv_name_0_3=(Token)match(input,Bash,FOLLOW_50); 

                    							newLeafNode(lv_name_0_3, grammarAccess.getScriptAccess().getNameBashKeyword_0_0_0_2());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_3, null);
                    						

                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:2331:7: lv_name_0_4= Pwsh
                    {
                    lv_name_0_4=(Token)match(input,Pwsh,FOLLOW_50); 

                    							newLeafNode(lv_name_0_4, grammarAccess.getScriptAccess().getNamePwshKeyword_0_0_0_3());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_4, null);
                    						

                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:2342:7: lv_name_0_5= Powershell
                    {
                    lv_name_0_5=(Token)match(input,Powershell,FOLLOW_50); 

                    							newLeafNode(lv_name_0_5, grammarAccess.getScriptAccess().getNamePowershellKeyword_0_0_0_4());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_5, null);
                    						

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:2353:7: lv_name_0_6= Checkout
                    {
                    lv_name_0_6=(Token)match(input,Checkout,FOLLOW_50); 

                    							newLeafNode(lv_name_0_6, grammarAccess.getScriptAccess().getNameCheckoutKeyword_0_0_0_5());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_6, null);
                    						

                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:2364:7: lv_name_0_7= Download
                    {
                    lv_name_0_7=(Token)match(input,Download,FOLLOW_50); 

                    							newLeafNode(lv_name_0_7, grammarAccess.getScriptAccess().getNameDownloadKeyword_0_0_0_6());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_7, null);
                    						

                    }
                    break;
                case 8 :
                    // InternalPipelineParser.g:2375:7: lv_name_0_8= GetPackage
                    {
                    lv_name_0_8=(Token)match(input,GetPackage,FOLLOW_50); 

                    							newLeafNode(lv_name_0_8, grammarAccess.getScriptAccess().getNameGetPackageKeyword_0_0_0_7());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_8, null);
                    						

                    }
                    break;
                case 9 :
                    // InternalPipelineParser.g:2386:7: lv_name_0_9= Publish
                    {
                    lv_name_0_9=(Token)match(input,Publish,FOLLOW_50); 

                    							newLeafNode(lv_name_0_9, grammarAccess.getScriptAccess().getNamePublishKeyword_0_0_0_8());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_9, null);
                    						

                    }
                    break;
                case 10 :
                    // InternalPipelineParser.g:2397:7: lv_name_0_10= Task
                    {
                    lv_name_0_10=(Token)match(input,Task,FOLLOW_50); 

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

            // InternalPipelineParser.g:2410:4: ( ( (lv_command_1_0= ruleStringValue ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleStringValue ) ) this_END_6= RULE_END ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_SINGLE_CHAR && LA71_0<=RULE_STRING)||LA71_0==RULE_VERSION) ) {
                alt71=1;
            }
            else if ( (LA71_0==GreaterThanSignHyphenMinus||LA71_0==VerticalLine) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalPipelineParser.g:2411:5: ( (lv_command_1_0= ruleStringValue ) )
                    {
                    // InternalPipelineParser.g:2411:5: ( (lv_command_1_0= ruleStringValue ) )
                    // InternalPipelineParser.g:2412:6: (lv_command_1_0= ruleStringValue )
                    {
                    // InternalPipelineParser.g:2412:6: (lv_command_1_0= ruleStringValue )
                    // InternalPipelineParser.g:2413:7: lv_command_1_0= ruleStringValue
                    {

                    							newCompositeNode(grammarAccess.getScriptAccess().getCommandStringValueParserRuleCall_0_1_0_0());
                    						
                    pushFollow(FOLLOW_48);
                    lv_command_1_0=ruleStringValue();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getScriptRule());
                    							}
                    							set(
                    								current,
                    								"command",
                    								lv_command_1_0,
                    								"ca.mcgill.devops.pipeline.Pipeline.StringValue");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2431:5: ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleStringValue ) ) this_END_6= RULE_END )
                    {
                    // InternalPipelineParser.g:2431:5: ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleStringValue ) ) this_END_6= RULE_END )
                    // InternalPipelineParser.g:2432:6: (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleStringValue ) ) this_END_6= RULE_END
                    {
                    // InternalPipelineParser.g:2432:6: (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==VerticalLine) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==GreaterThanSignHyphenMinus) ) {
                        alt70=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalPipelineParser.g:2433:7: otherlv_2= VerticalLine
                            {
                            otherlv_2=(Token)match(input,VerticalLine,FOLLOW_5); 

                            							newLeafNode(otherlv_2, grammarAccess.getScriptAccess().getVerticalLineKeyword_0_1_1_0_0());
                            						

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:2438:7: otherlv_3= GreaterThanSignHyphenMinus
                            {
                            otherlv_3=(Token)match(input,GreaterThanSignHyphenMinus,FOLLOW_5); 

                            							newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getGreaterThanSignHyphenMinusKeyword_0_1_1_0_1());
                            						

                            }
                            break;

                    }

                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

                    						newLeafNode(this_BEGIN_4, grammarAccess.getScriptAccess().getBEGINTerminalRuleCall_0_1_1_1());
                    					
                    // InternalPipelineParser.g:2447:6: ( (lv_command_5_0= ruleStringValue ) )
                    // InternalPipelineParser.g:2448:7: (lv_command_5_0= ruleStringValue )
                    {
                    // InternalPipelineParser.g:2448:7: (lv_command_5_0= ruleStringValue )
                    // InternalPipelineParser.g:2449:8: lv_command_5_0= ruleStringValue
                    {

                    								newCompositeNode(grammarAccess.getScriptAccess().getCommandStringValueParserRuleCall_0_1_1_2_0());
                    							
                    pushFollow(FOLLOW_8);
                    lv_command_5_0=ruleStringValue();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getScriptRule());
                    								}
                    								set(
                    									current,
                    									"command",
                    									lv_command_5_0,
                    									"ca.mcgill.devops.pipeline.Pipeline.StringValue");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_48); 

                    						newLeafNode(this_END_6, grammarAccess.getScriptAccess().getENDTerminalRuleCall_0_1_1_3());
                    					

                    }


                    }
                    break;

            }


            }

            // InternalPipelineParser.g:2473:3: (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_BEGIN) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalPipelineParser.g:2474:4: this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END
                    {
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getScriptAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:2478:4: ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( ((LA73_0>=ContinueOnError && LA73_0<=Credentials)||(LA73_0>=Environment && LA73_0<=TagsIgnore)||(LA73_0>=Containers && LA73_0<=GetPackage)||(LA73_0>=Powershell && LA73_0<=Container)||(LA73_0>=FailFast && LA73_0<=Download)||(LA73_0>=Packages && LA73_0<=Webhooks)||(LA73_0>=Exclude && LA73_0<=Inherit)||(LA73_0>=Outputs && LA73_0<=Publish)||(LA73_0>=Rolling && LA73_0<=Trigger)||(LA73_0>=Builds && LA73_0<=Canary)||(LA73_0>=Inputs && LA73_0<=Script)||LA73_0==Target||(LA73_0>=Build && LA73_0<=Shell)||(LA73_0>=Types && LA73_0<=Cron)||(LA73_0>=Name && LA73_0<=Path)||(LA73_0>=Push && LA73_0<=Pwsh)||(LA73_0>=Tags && LA73_0<=Uses)||LA73_0==Env||(LA73_0>=Run && LA73_0<=Pr)) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2479:5: ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) )
                    	    {
                    	    // InternalPipelineParser.g:2479:5: ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) )
                    	    // InternalPipelineParser.g:2480:6: (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript )
                    	    {
                    	    // InternalPipelineParser.g:2480:6: (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript )
                    	    int alt72=2;
                    	    switch ( input.LA(1) ) {
                    	    case ContinueOnError:
                    	    case SettableVariables:
                    	    case WorkingDirectory:
                    	    case BranchesIgnore:
                    	    case TimeoutMinutes:
                    	    case DownloadBuild:
                    	    case MaxParallel:
                    	    case PathsIgnore:
                    	    case Pull_request:
                    	    case Repositories:
                    	    case Workflow_run:
                    	    case Concurrency:
                    	    case Credentials:
                    	    case Environment:
                    	    case Permissions:
                    	    case TagsIgnore:
                    	    case Containers:
                    	    case Deployment:
                    	    case Entrypoint:
                    	    case Container:
                    	    case FailFast:
                    	    case Pipelines:
                    	    case Resources:
                    	    case ReviewApp:
                    	    case Schedules:
                    	    case Variables:
                    	    case Branches:
                    	    case Defaults:
                    	    case Packages:
                    	    case Pipeline:
                    	    case Required:
                    	    case RunName:
                    	    case Schedule:
                    	    case Strategy:
                    	    case Template:
                    	    case Webhooks:
                    	    case Exclude:
                    	    case Extends:
                    	    case Filters:
                    	    case Include:
                    	    case Inherit:
                    	    case Outputs:
                    	    case Rolling:
                    	    case RunOnce:
                    	    case RunsOn:
                    	    case Secrets:
                    	    case Trigger:
                    	    case Builds:
                    	    case Canary:
                    	    case Inputs:
                    	    case Matrix:
                    	    case Target:
                    	    case Build:
                    	    case Group:
                    	    case Image:
                    	    case Needs:
                    	    case Paths:
                    	    case Ports:
                    	    case Shell:
                    	    case Types:
                    	    case Args:
                    	    case Cron:
                    	    case Name:
                    	    case Path:
                    	    case Push:
                    	    case Tags:
                    	    case Type:
                    	    case Uses:
                    	    case Env:
                    	    case Id:
                    	    case If:
                    	    case On:
                    	    case Pr:
                    	        {
                    	        alt72=1;
                    	        }
                    	        break;
                    	    case Script:
                    	        {
                    	        switch ( input.LA(2) ) {
                    	        case RULE_ID:
                    	            {
                    	            alt72=1;
                    	            }
                    	            break;
                    	        case RULE_SINGLE_CHAR:
                    	            {
                    	            alt72=1;
                    	            }
                    	            break;
                    	        case RULE_STRING:
                    	            {
                    	            alt72=1;
                    	            }
                    	            break;
                    	        case ContinueOnError:
                    	        case SettableVariables:
                    	        case WorkingDirectory:
                    	        case BranchesIgnore:
                    	        case TimeoutMinutes:
                    	        case DownloadBuild:
                    	        case MaxParallel:
                    	        case PathsIgnore:
                    	        case Pull_request:
                    	        case Repositories:
                    	        case Workflow_run:
                    	        case Concurrency:
                    	        case Credentials:
                    	        case Environment:
                    	        case Permissions:
                    	        case TagsIgnore:
                    	        case Containers:
                    	        case Deployment:
                    	        case Entrypoint:
                    	        case GetPackage:
                    	        case Parameters:
                    	        case Powershell:
                    	        case Container:
                    	        case FailFast:
                    	        case Pipelines:
                    	        case Resources:
                    	        case ReviewApp:
                    	        case Schedules:
                    	        case Variables:
                    	        case Branches:
                    	        case Checkout:
                    	        case Defaults:
                    	        case Download:
                    	        case Packages:
                    	        case Pipeline:
                    	        case Required:
                    	        case RunName:
                    	        case Schedule:
                    	        case Strategy:
                    	        case Template:
                    	        case Webhooks:
                    	        case Exclude:
                    	        case Extends:
                    	        case Filters:
                    	        case Include:
                    	        case Inherit:
                    	        case Outputs:
                    	        case Publish:
                    	        case Rolling:
                    	        case RunOnce:
                    	        case RunsOn:
                    	        case Secrets:
                    	        case Trigger:
                    	        case Builds:
                    	        case Canary:
                    	        case Inputs:
                    	        case Matrix:
                    	        case Script:
                    	        case Target:
                    	        case Build:
                    	        case Group:
                    	        case Image:
                    	        case Needs:
                    	        case Paths:
                    	        case Ports:
                    	        case Shell:
                    	        case Types:
                    	        case Args:
                    	        case Bash:
                    	        case Cron:
                    	        case Path:
                    	        case Push:
                    	        case Pwsh:
                    	        case Tags:
                    	        case Task:
                    	        case Type:
                    	        case Uses:
                    	        case With:
                    	        case Env:
                    	        case Run:
                    	        case Id:
                    	        case If:
                    	        case On:
                    	        case Pr:
                    	        case RULE_VERSION:
                    	        case RULE_BEGIN:
                    	        case RULE_END:
                    	            {
                    	            alt72=1;
                    	            }
                    	            break;
                    	        case Name:
                    	            {
                    	            alt72=1;
                    	            }
                    	            break;
                    	        case GreaterThanSignHyphenMinus:
                    	        case VerticalLine:
                    	            {
                    	            alt72=2;
                    	            }
                    	            break;
                    	        default:
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 72, 2, input);

                    	            throw nvae;
                    	        }

                    	        }
                    	        break;
                    	    case GetPackage:
                    	    case Powershell:
                    	    case Checkout:
                    	    case Download:
                    	    case Publish:
                    	    case Bash:
                    	    case Pwsh:
                    	    case Task:
                    	    case Run:
                    	        {
                    	        alt72=2;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 72, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt72) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:2481:7: lv_subSteps_8_1= ruleAction
                    	            {

                    	            							newCompositeNode(grammarAccess.getScriptAccess().getSubStepsActionParserRuleCall_1_1_0_0());
                    	            						
                    	            pushFollow(FOLLOW_51);
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
                    	            // InternalPipelineParser.g:2497:7: lv_subSteps_8_2= ruleScript
                    	            {

                    	            							newCompositeNode(grammarAccess.getScriptAccess().getSubStepsScriptParserRuleCall_1_1_0_1());
                    	            						
                    	            pushFollow(FOLLOW_51);
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
                    	    break loop73;
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
    // InternalPipelineParser.g:2524:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPipelineParser.g:2524:47: (iv_ruleAction= ruleAction EOF )
            // InternalPipelineParser.g:2525:2: iv_ruleAction= ruleAction EOF
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
    // InternalPipelineParser.g:2531:1: ruleAction returns [EObject current=null] : ( ( (lv_keyword_0_0= rulePipelineKeyword ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )* ) ) ) (this_BEGIN_10= RULE_BEGIN ( ( (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript ) ) )* this_END_12= RULE_END )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_paraKW_3_1=null;
        Token lv_paraKW_3_2=null;
        Token this_BEGIN_4=null;
        Token lv_paraKW_5_1=null;
        Token lv_paraKW_5_2=null;
        Token this_END_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        Enumerator lv_keyword_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_subSteps_11_1 = null;

        EObject lv_subSteps_11_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:2537:2: ( ( ( (lv_keyword_0_0= rulePipelineKeyword ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )* ) ) ) (this_BEGIN_10= RULE_BEGIN ( ( (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript ) ) )* this_END_12= RULE_END )? ) )
            // InternalPipelineParser.g:2538:2: ( ( (lv_keyword_0_0= rulePipelineKeyword ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )* ) ) ) (this_BEGIN_10= RULE_BEGIN ( ( (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript ) ) )* this_END_12= RULE_END )? )
            {
            // InternalPipelineParser.g:2538:2: ( ( (lv_keyword_0_0= rulePipelineKeyword ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )* ) ) ) (this_BEGIN_10= RULE_BEGIN ( ( (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript ) ) )* this_END_12= RULE_END )? )
            // InternalPipelineParser.g:2539:3: ( (lv_keyword_0_0= rulePipelineKeyword ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )* ) ) ) (this_BEGIN_10= RULE_BEGIN ( ( (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript ) ) )* this_END_12= RULE_END )?
            {
            // InternalPipelineParser.g:2539:3: ( (lv_keyword_0_0= rulePipelineKeyword ) )
            // InternalPipelineParser.g:2540:4: (lv_keyword_0_0= rulePipelineKeyword )
            {
            // InternalPipelineParser.g:2540:4: (lv_keyword_0_0= rulePipelineKeyword )
            // InternalPipelineParser.g:2541:5: lv_keyword_0_0= rulePipelineKeyword
            {

            					newCompositeNode(grammarAccess.getActionAccess().getKeywordPipelineKeywordEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_52);
            lv_keyword_0_0=rulePipelineKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_0_0,
            						"ca.mcgill.devops.pipeline.Pipeline.PipelineKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPipelineParser.g:2558:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )* ) ) )
            // InternalPipelineParser.g:2559:4: ( ( ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )* ) )
            {
            // InternalPipelineParser.g:2559:4: ( ( ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )* ) )
            // InternalPipelineParser.g:2560:5: ( ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getActionAccess().getUnorderedGroup_1());
            				
            // InternalPipelineParser.g:2563:5: ( ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )* )
            // InternalPipelineParser.g:2564:6: ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )*
            {
            // InternalPipelineParser.g:2564:6: ( ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) ) )*
            loop79:
            do {
                int alt79=3;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_BEGIN) ) {
                    int LA79_1 = input.LA(2);

                    if ( ( LA79_1 == Parameters || LA79_1 == With ) && getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1(), 1) ) {
                        alt79=2;
                    }


                }
                else if ( ( LA79_0 >= RULE_SINGLE_CHAR && LA79_0 <= RULE_STRING || LA79_0 == RULE_VERSION ) && getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1(), 0) ) {
                    alt79=1;
                }
                else if ( ( LA79_0 == Parameters || LA79_0 == With ) && getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1(), 1) ) {
                    alt79=2;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalPipelineParser.g:2565:4: ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:2565:4: ({...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) ) )
            	    // InternalPipelineParser.g:2566:5: {...}? => ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalPipelineParser.g:2566:103: ( ({...}? => ( (lv_value_2_0= ruleStringValue ) ) ) )
            	    // InternalPipelineParser.g:2567:6: ({...}? => ( (lv_value_2_0= ruleStringValue ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalPipelineParser.g:2570:9: ({...}? => ( (lv_value_2_0= ruleStringValue ) ) )
            	    // InternalPipelineParser.g:2570:10: {...}? => ( (lv_value_2_0= ruleStringValue ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "true");
            	    }
            	    // InternalPipelineParser.g:2570:19: ( (lv_value_2_0= ruleStringValue ) )
            	    // InternalPipelineParser.g:2570:20: (lv_value_2_0= ruleStringValue )
            	    {
            	    // InternalPipelineParser.g:2570:20: (lv_value_2_0= ruleStringValue )
            	    // InternalPipelineParser.g:2571:10: lv_value_2_0= ruleStringValue
            	    {

            	    										newCompositeNode(grammarAccess.getActionAccess().getValueStringValueParserRuleCall_1_0_0());
            	    									
            	    pushFollow(FOLLOW_52);
            	    lv_value_2_0=ruleStringValue();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getActionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"value",
            	    											lv_value_2_0,
            	    											"ca.mcgill.devops.pipeline.Pipeline.StringValue");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActionAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:2593:4: ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalPipelineParser.g:2593:4: ({...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:2594:5: {...}? => ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalPipelineParser.g:2594:103: ( ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) ) )
            	    // InternalPipelineParser.g:2595:6: ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalPipelineParser.g:2598:9: ({...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END ) )
            	    // InternalPipelineParser.g:2598:10: {...}? => ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "true");
            	    }
            	    // InternalPipelineParser.g:2598:19: ( ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END )
            	    // InternalPipelineParser.g:2598:20: ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) ) this_BEGIN_7= RULE_BEGIN ( (lv_parameters_8_0= ruleParameterValue ) )* this_END_9= RULE_END
            	    {
            	    // InternalPipelineParser.g:2598:20: ( ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) ) | (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END ) )
            	    int alt77=2;
            	    int LA77_0 = input.LA(1);

            	    if ( (LA77_0==Parameters||LA77_0==With) ) {
            	        alt77=1;
            	    }
            	    else if ( (LA77_0==RULE_BEGIN) ) {
            	        alt77=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 77, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt77) {
            	        case 1 :
            	            // InternalPipelineParser.g:2599:10: ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) )
            	            {
            	            // InternalPipelineParser.g:2599:10: ( ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) ) )
            	            // InternalPipelineParser.g:2600:11: ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) )
            	            {
            	            // InternalPipelineParser.g:2600:11: ( (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters ) )
            	            // InternalPipelineParser.g:2601:12: (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters )
            	            {
            	            // InternalPipelineParser.g:2601:12: (lv_paraKW_3_1= With | lv_paraKW_3_2= Parameters )
            	            int alt75=2;
            	            int LA75_0 = input.LA(1);

            	            if ( (LA75_0==With) ) {
            	                alt75=1;
            	            }
            	            else if ( (LA75_0==Parameters) ) {
            	                alt75=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 75, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt75) {
            	                case 1 :
            	                    // InternalPipelineParser.g:2602:13: lv_paraKW_3_1= With
            	                    {
            	                    lv_paraKW_3_1=(Token)match(input,With,FOLLOW_5); 

            	                    													newLeafNode(lv_paraKW_3_1, grammarAccess.getActionAccess().getParaKWWithKeyword_1_1_0_0_0_0());
            	                    												

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getActionRule());
            	                    													}
            	                    													setWithLastConsumed(current, "paraKW", lv_paraKW_3_1, null);
            	                    												

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalPipelineParser.g:2613:13: lv_paraKW_3_2= Parameters
            	                    {
            	                    lv_paraKW_3_2=(Token)match(input,Parameters,FOLLOW_5); 

            	                    													newLeafNode(lv_paraKW_3_2, grammarAccess.getActionAccess().getParaKWParametersKeyword_1_1_0_0_0_1());
            	                    												

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getActionRule());
            	                    													}
            	                    													setWithLastConsumed(current, "paraKW", lv_paraKW_3_2, null);
            	                    												

            	                    }
            	                    break;

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:2627:10: (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END )
            	            {
            	            // InternalPipelineParser.g:2627:10: (this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END )
            	            // InternalPipelineParser.g:2628:11: this_BEGIN_4= RULE_BEGIN ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) ) this_END_6= RULE_END
            	            {
            	            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_53); 

            	            											newLeafNode(this_BEGIN_4, grammarAccess.getActionAccess().getBEGINTerminalRuleCall_1_1_0_1_0());
            	            										
            	            // InternalPipelineParser.g:2632:11: ( ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) ) )
            	            // InternalPipelineParser.g:2633:12: ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) )
            	            {
            	            // InternalPipelineParser.g:2633:12: ( (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters ) )
            	            // InternalPipelineParser.g:2634:13: (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters )
            	            {
            	            // InternalPipelineParser.g:2634:13: (lv_paraKW_5_1= With | lv_paraKW_5_2= Parameters )
            	            int alt76=2;
            	            int LA76_0 = input.LA(1);

            	            if ( (LA76_0==With) ) {
            	                alt76=1;
            	            }
            	            else if ( (LA76_0==Parameters) ) {
            	                alt76=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 76, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt76) {
            	                case 1 :
            	                    // InternalPipelineParser.g:2635:14: lv_paraKW_5_1= With
            	                    {
            	                    lv_paraKW_5_1=(Token)match(input,With,FOLLOW_8); 

            	                    														newLeafNode(lv_paraKW_5_1, grammarAccess.getActionAccess().getParaKWWithKeyword_1_1_0_1_1_0_0());
            	                    													

            	                    														if (current==null) {
            	                    															current = createModelElement(grammarAccess.getActionRule());
            	                    														}
            	                    														setWithLastConsumed(current, "paraKW", lv_paraKW_5_1, null);
            	                    													

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalPipelineParser.g:2646:14: lv_paraKW_5_2= Parameters
            	                    {
            	                    lv_paraKW_5_2=(Token)match(input,Parameters,FOLLOW_8); 

            	                    														newLeafNode(lv_paraKW_5_2, grammarAccess.getActionAccess().getParaKWParametersKeyword_1_1_0_1_1_0_1());
            	                    													

            	                    														if (current==null) {
            	                    															current = createModelElement(grammarAccess.getActionRule());
            	                    														}
            	                    														setWithLastConsumed(current, "paraKW", lv_paraKW_5_2, null);
            	                    													

            	                    }
            	                    break;

            	            }


            	            }


            	            }

            	            this_END_6=(Token)match(input,RULE_END,FOLLOW_5); 

            	            											newLeafNode(this_END_6, grammarAccess.getActionAccess().getENDTerminalRuleCall_1_1_0_1_2());
            	            										

            	            }


            	            }
            	            break;

            	    }

            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getActionAccess().getBEGINTerminalRuleCall_1_1_1());
            	    								
            	    // InternalPipelineParser.g:2669:9: ( (lv_parameters_8_0= ruleParameterValue ) )*
            	    loop78:
            	    do {
            	        int alt78=2;
            	        int LA78_0 = input.LA(1);

            	        if ( (LA78_0==RULE_ID) ) {
            	            alt78=1;
            	        }


            	        switch (alt78) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:2670:10: (lv_parameters_8_0= ruleParameterValue )
            	    	    {
            	    	    // InternalPipelineParser.g:2670:10: (lv_parameters_8_0= ruleParameterValue )
            	    	    // InternalPipelineParser.g:2671:11: lv_parameters_8_0= ruleParameterValue
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getActionAccess().getParametersParameterValueParserRuleCall_1_1_2_0());
            	    	    										
            	    	    pushFollow(FOLLOW_32);
            	    	    lv_parameters_8_0=ruleParameterValue();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getActionRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"parameters",
            	    	    												lv_parameters_8_0,
            	    	    												"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop78;
            	        }
            	    } while (true);

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_52); 

            	    									newLeafNode(this_END_9, grammarAccess.getActionAccess().getENDTerminalRuleCall_1_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActionAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getActionAccess().getUnorderedGroup_1());
            				

            }

            // InternalPipelineParser.g:2705:3: (this_BEGIN_10= RULE_BEGIN ( ( (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript ) ) )* this_END_12= RULE_END )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_BEGIN) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalPipelineParser.g:2706:4: this_BEGIN_10= RULE_BEGIN ( ( (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript ) ) )* this_END_12= RULE_END
                    {
                    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

                    				newLeafNode(this_BEGIN_10, grammarAccess.getActionAccess().getBEGINTerminalRuleCall_2_0());
                    			
                    // InternalPipelineParser.g:2710:4: ( ( (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( ((LA81_0>=ContinueOnError && LA81_0<=Credentials)||(LA81_0>=Environment && LA81_0<=TagsIgnore)||(LA81_0>=Containers && LA81_0<=GetPackage)||(LA81_0>=Powershell && LA81_0<=Container)||(LA81_0>=FailFast && LA81_0<=Download)||(LA81_0>=Packages && LA81_0<=Webhooks)||(LA81_0>=Exclude && LA81_0<=Inherit)||(LA81_0>=Outputs && LA81_0<=Publish)||(LA81_0>=Rolling && LA81_0<=Trigger)||(LA81_0>=Builds && LA81_0<=Canary)||(LA81_0>=Inputs && LA81_0<=Script)||LA81_0==Target||(LA81_0>=Build && LA81_0<=Shell)||(LA81_0>=Types && LA81_0<=Cron)||(LA81_0>=Name && LA81_0<=Path)||(LA81_0>=Push && LA81_0<=Pwsh)||(LA81_0>=Tags && LA81_0<=Uses)||LA81_0==Env||(LA81_0>=Run && LA81_0<=Pr)) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2711:5: ( (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript ) )
                    	    {
                    	    // InternalPipelineParser.g:2711:5: ( (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript ) )
                    	    // InternalPipelineParser.g:2712:6: (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript )
                    	    {
                    	    // InternalPipelineParser.g:2712:6: (lv_subSteps_11_1= ruleAction | lv_subSteps_11_2= ruleScript )
                    	    int alt80=2;
                    	    switch ( input.LA(1) ) {
                    	    case ContinueOnError:
                    	    case SettableVariables:
                    	    case WorkingDirectory:
                    	    case BranchesIgnore:
                    	    case TimeoutMinutes:
                    	    case DownloadBuild:
                    	    case MaxParallel:
                    	    case PathsIgnore:
                    	    case Pull_request:
                    	    case Repositories:
                    	    case Workflow_run:
                    	    case Concurrency:
                    	    case Credentials:
                    	    case Environment:
                    	    case Permissions:
                    	    case TagsIgnore:
                    	    case Containers:
                    	    case Deployment:
                    	    case Entrypoint:
                    	    case Container:
                    	    case FailFast:
                    	    case Pipelines:
                    	    case Resources:
                    	    case ReviewApp:
                    	    case Schedules:
                    	    case Variables:
                    	    case Branches:
                    	    case Defaults:
                    	    case Packages:
                    	    case Pipeline:
                    	    case Required:
                    	    case RunName:
                    	    case Schedule:
                    	    case Strategy:
                    	    case Template:
                    	    case Webhooks:
                    	    case Exclude:
                    	    case Extends:
                    	    case Filters:
                    	    case Include:
                    	    case Inherit:
                    	    case Outputs:
                    	    case Rolling:
                    	    case RunOnce:
                    	    case RunsOn:
                    	    case Secrets:
                    	    case Trigger:
                    	    case Builds:
                    	    case Canary:
                    	    case Inputs:
                    	    case Matrix:
                    	    case Target:
                    	    case Build:
                    	    case Group:
                    	    case Image:
                    	    case Needs:
                    	    case Paths:
                    	    case Ports:
                    	    case Shell:
                    	    case Types:
                    	    case Args:
                    	    case Cron:
                    	    case Name:
                    	    case Path:
                    	    case Push:
                    	    case Tags:
                    	    case Type:
                    	    case Uses:
                    	    case Env:
                    	    case Id:
                    	    case If:
                    	    case On:
                    	    case Pr:
                    	        {
                    	        alt80=1;
                    	        }
                    	        break;
                    	    case Script:
                    	        {
                    	        switch ( input.LA(2) ) {
                    	        case RULE_ID:
                    	            {
                    	            alt80=1;
                    	            }
                    	            break;
                    	        case RULE_SINGLE_CHAR:
                    	            {
                    	            alt80=1;
                    	            }
                    	            break;
                    	        case RULE_STRING:
                    	            {
                    	            alt80=1;
                    	            }
                    	            break;
                    	        case ContinueOnError:
                    	        case SettableVariables:
                    	        case WorkingDirectory:
                    	        case BranchesIgnore:
                    	        case TimeoutMinutes:
                    	        case DownloadBuild:
                    	        case MaxParallel:
                    	        case PathsIgnore:
                    	        case Pull_request:
                    	        case Repositories:
                    	        case Workflow_run:
                    	        case Concurrency:
                    	        case Credentials:
                    	        case Environment:
                    	        case Permissions:
                    	        case TagsIgnore:
                    	        case Containers:
                    	        case Deployment:
                    	        case Entrypoint:
                    	        case GetPackage:
                    	        case Parameters:
                    	        case Powershell:
                    	        case Container:
                    	        case FailFast:
                    	        case Pipelines:
                    	        case Resources:
                    	        case ReviewApp:
                    	        case Schedules:
                    	        case Variables:
                    	        case Branches:
                    	        case Checkout:
                    	        case Defaults:
                    	        case Download:
                    	        case Packages:
                    	        case Pipeline:
                    	        case Required:
                    	        case RunName:
                    	        case Schedule:
                    	        case Strategy:
                    	        case Template:
                    	        case Webhooks:
                    	        case Exclude:
                    	        case Extends:
                    	        case Filters:
                    	        case Include:
                    	        case Inherit:
                    	        case Outputs:
                    	        case Publish:
                    	        case Rolling:
                    	        case RunOnce:
                    	        case RunsOn:
                    	        case Secrets:
                    	        case Trigger:
                    	        case Builds:
                    	        case Canary:
                    	        case Inputs:
                    	        case Matrix:
                    	        case Script:
                    	        case Target:
                    	        case Build:
                    	        case Group:
                    	        case Image:
                    	        case Needs:
                    	        case Paths:
                    	        case Ports:
                    	        case Shell:
                    	        case Types:
                    	        case Args:
                    	        case Bash:
                    	        case Cron:
                    	        case Path:
                    	        case Push:
                    	        case Pwsh:
                    	        case Tags:
                    	        case Task:
                    	        case Type:
                    	        case Uses:
                    	        case With:
                    	        case Env:
                    	        case Run:
                    	        case Id:
                    	        case If:
                    	        case On:
                    	        case Pr:
                    	        case RULE_VERSION:
                    	        case RULE_BEGIN:
                    	        case RULE_END:
                    	            {
                    	            alt80=1;
                    	            }
                    	            break;
                    	        case Name:
                    	            {
                    	            alt80=1;
                    	            }
                    	            break;
                    	        case GreaterThanSignHyphenMinus:
                    	        case VerticalLine:
                    	            {
                    	            alt80=2;
                    	            }
                    	            break;
                    	        default:
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 80, 2, input);

                    	            throw nvae;
                    	        }

                    	        }
                    	        break;
                    	    case GetPackage:
                    	    case Powershell:
                    	    case Checkout:
                    	    case Download:
                    	    case Publish:
                    	    case Bash:
                    	    case Pwsh:
                    	    case Task:
                    	    case Run:
                    	        {
                    	        alt80=2;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 80, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt80) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:2713:7: lv_subSteps_11_1= ruleAction
                    	            {

                    	            							newCompositeNode(grammarAccess.getActionAccess().getSubStepsActionParserRuleCall_2_1_0_0());
                    	            						
                    	            pushFollow(FOLLOW_51);
                    	            lv_subSteps_11_1=ruleAction();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getActionRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"subSteps",
                    	            								lv_subSteps_11_1,
                    	            								"ca.mcgill.devops.pipeline.Pipeline.Action");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:2729:7: lv_subSteps_11_2= ruleScript
                    	            {

                    	            							newCompositeNode(grammarAccess.getActionAccess().getSubStepsScriptParserRuleCall_2_1_0_1());
                    	            						
                    	            pushFollow(FOLLOW_51);
                    	            lv_subSteps_11_2=ruleScript();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getActionRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"subSteps",
                    	            								lv_subSteps_11_2,
                    	            								"ca.mcgill.devops.pipeline.Pipeline.Script");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    this_END_12=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_12, grammarAccess.getActionAccess().getENDTerminalRuleCall_2_2());
                    			

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
    // InternalPipelineParser.g:2756:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalPipelineParser.g:2756:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalPipelineParser.g:2757:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalPipelineParser.g:2763:1: ruleParameterValue returns [EObject current=null] : ( ( (lv_name_0_0= ruleKeyValuePairs ) ) ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= RULE_INTV ) ) )? ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_1 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:2769:2: ( ( ( (lv_name_0_0= ruleKeyValuePairs ) ) ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= RULE_INTV ) ) )? ) )
            // InternalPipelineParser.g:2770:2: ( ( (lv_name_0_0= ruleKeyValuePairs ) ) ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= RULE_INTV ) ) )? )
            {
            // InternalPipelineParser.g:2770:2: ( ( (lv_name_0_0= ruleKeyValuePairs ) ) ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= RULE_INTV ) ) )? )
            // InternalPipelineParser.g:2771:3: ( (lv_name_0_0= ruleKeyValuePairs ) ) ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= RULE_INTV ) ) )?
            {
            // InternalPipelineParser.g:2771:3: ( (lv_name_0_0= ruleKeyValuePairs ) )
            // InternalPipelineParser.g:2772:4: (lv_name_0_0= ruleKeyValuePairs )
            {
            // InternalPipelineParser.g:2772:4: (lv_name_0_0= ruleKeyValuePairs )
            // InternalPipelineParser.g:2773:5: lv_name_0_0= ruleKeyValuePairs
            {

            					newCompositeNode(grammarAccess.getParameterValueAccess().getNameKeyValuePairsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_54);
            lv_name_0_0=ruleKeyValuePairs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ca.mcgill.devops.pipeline.Pipeline.KeyValuePairs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPipelineParser.g:2790:3: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= RULE_INTV ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==EOF||(LA84_1>=ExclamationMark && LA84_1<=Asterisk)||(LA84_1>=KW__ && LA84_1<=LeftCurlyBracket)||(LA84_1>=RightCurlyBracket && LA84_1<=RULE_STRING)||LA84_1==RULE_INTV||LA84_1==RULE_VERSION||LA84_1==RULE_END) ) {
                    alt84=1;
                }
            }
            else if ( (LA84_0==RULE_SINGLE_CHAR||LA84_0==RULE_STRING||LA84_0==RULE_INTV||LA84_0==RULE_VERSION) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalPipelineParser.g:2791:4: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= RULE_INTV ) )
                    {
                    // InternalPipelineParser.g:2791:4: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= RULE_INTV ) )
                    // InternalPipelineParser.g:2792:5: (lv_value_1_1= ruleStringValue | lv_value_1_2= RULE_INTV )
                    {
                    // InternalPipelineParser.g:2792:5: (lv_value_1_1= ruleStringValue | lv_value_1_2= RULE_INTV )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( ((LA83_0>=RULE_SINGLE_CHAR && LA83_0<=RULE_STRING)||LA83_0==RULE_VERSION) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==RULE_INTV) ) {
                        alt83=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalPipelineParser.g:2793:6: lv_value_1_1= ruleStringValue
                            {

                            						newCompositeNode(grammarAccess.getParameterValueAccess().getValueStringValueParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_value_1_1=ruleStringValue();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getParameterValueRule());
                            						}
                            						set(
                            							current,
                            							"value",
                            							lv_value_1_1,
                            							"ca.mcgill.devops.pipeline.Pipeline.StringValue");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:2809:6: lv_value_1_2= RULE_INTV
                            {
                            lv_value_1_2=(Token)match(input,RULE_INTV,FOLLOW_2); 

                            						newLeafNode(lv_value_1_2, grammarAccess.getParameterValueAccess().getValueINTVTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getParameterValueRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"value",
                            							lv_value_1_2,
                            							"ca.mcgill.devops.pipeline.Pipeline.INTV");
                            					

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


    // $ANTLR start "entryRuleEvent"
    // InternalPipelineParser.g:2830:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalPipelineParser.g:2830:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalPipelineParser.g:2831:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalPipelineParser.g:2837:1: ruleEvent returns [EObject current=null] : ( ( ( (lv_branches_0_0= ruleBranch ) ) | ( (lv_keyword_1_0= rulePipelineKeyword ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?) ) )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token otherlv_12=null;
        Token this_END_14=null;
        Token lv_branchKW_15_1=null;
        Token lv_branchKW_15_2=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token this_BEGIN_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token this_END_29=null;
        Token lv_pathKW_30_1=null;
        Token lv_pathKW_30_2=null;
        Token this_BEGIN_31=null;
        Token lv_incExcKW_33_1=null;
        Token lv_incExcKW_33_2=null;
        Token this_END_35=null;
        Token otherlv_36=null;
        Token lv_autoCancel_37_0=null;
        Token otherlv_38=null;
        Token lv_drafts_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token this_END_43=null;
        EObject lv_branches_0_0 = null;

        Enumerator lv_keyword_1_0 = null;

        EObject lv_activities_5_0 = null;

        EObject lv_activities_7_0 = null;

        EObject lv_activities_9_0 = null;

        EObject lv_activities_13_0 = null;

        EObject lv_branches_16_0 = null;

        EObject lv_branches_18_0 = null;

        EObject lv_branches_20_0 = null;

        EObject lv_branches_23_0 = null;

        EObject lv_branches_28_0 = null;

        AntlrDatatypeRuleToken lv_pathValue_32_0 = null;

        AntlrDatatypeRuleToken lv_pathValue_34_0 = null;

        EObject lv_activities_42_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:2843:2: ( ( ( ( (lv_branches_0_0= ruleBranch ) ) | ( (lv_keyword_1_0= rulePipelineKeyword ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?) ) )? ) )
            // InternalPipelineParser.g:2844:2: ( ( ( (lv_branches_0_0= ruleBranch ) ) | ( (lv_keyword_1_0= rulePipelineKeyword ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalPipelineParser.g:2844:2: ( ( ( (lv_branches_0_0= ruleBranch ) ) | ( (lv_keyword_1_0= rulePipelineKeyword ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?) ) )? )
            // InternalPipelineParser.g:2845:3: ( ( (lv_branches_0_0= ruleBranch ) ) | ( (lv_keyword_1_0= rulePipelineKeyword ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?) ) )?
            {
            // InternalPipelineParser.g:2845:3: ( ( (lv_branches_0_0= ruleBranch ) ) | ( (lv_keyword_1_0= rulePipelineKeyword ) ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_ID && LA85_0<=RULE_STRING)) ) {
                alt85=1;
            }
            else if ( ((LA85_0>=ContinueOnError && LA85_0<=Credentials)||(LA85_0>=Environment && LA85_0<=TagsIgnore)||(LA85_0>=Containers && LA85_0<=Entrypoint)||LA85_0==Container||(LA85_0>=FailFast && LA85_0<=Branches)||LA85_0==Defaults||(LA85_0>=Packages && LA85_0<=Webhooks)||(LA85_0>=Exclude && LA85_0<=Inherit)||LA85_0==Outputs||(LA85_0>=Rolling && LA85_0<=Trigger)||(LA85_0>=Builds && LA85_0<=Canary)||(LA85_0>=Inputs && LA85_0<=Script)||LA85_0==Target||(LA85_0>=Build && LA85_0<=Shell)||(LA85_0>=Types && LA85_0<=Args)||LA85_0==Cron||(LA85_0>=Name && LA85_0<=Path)||LA85_0==Push||LA85_0==Tags||(LA85_0>=Type && LA85_0<=Uses)||LA85_0==Env||(LA85_0>=Id && LA85_0<=Pr)) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalPipelineParser.g:2846:4: ( (lv_branches_0_0= ruleBranch ) )
                    {
                    // InternalPipelineParser.g:2846:4: ( (lv_branches_0_0= ruleBranch ) )
                    // InternalPipelineParser.g:2847:5: (lv_branches_0_0= ruleBranch )
                    {
                    // InternalPipelineParser.g:2847:5: (lv_branches_0_0= ruleBranch )
                    // InternalPipelineParser.g:2848:6: lv_branches_0_0= ruleBranch
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getBranchesBranchParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_branches_0_0=ruleBranch();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						add(
                    							current,
                    							"branches",
                    							lv_branches_0_0,
                    							"ca.mcgill.devops.pipeline.Pipeline.Branch");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2866:4: ( (lv_keyword_1_0= rulePipelineKeyword ) )
                    {
                    // InternalPipelineParser.g:2866:4: ( (lv_keyword_1_0= rulePipelineKeyword ) )
                    // InternalPipelineParser.g:2867:5: (lv_keyword_1_0= rulePipelineKeyword )
                    {
                    // InternalPipelineParser.g:2867:5: (lv_keyword_1_0= rulePipelineKeyword )
                    // InternalPipelineParser.g:2868:6: lv_keyword_1_0= rulePipelineKeyword
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getKeywordPipelineKeywordEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_keyword_1_0=rulePipelineKeyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"keyword",
                    							lv_keyword_1_0,
                    							"ca.mcgill.devops.pipeline.Pipeline.PipelineKeyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPipelineParser.g:2886:3: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?) ) )?
            int alt105=2;
            alt105 = dfa105.predict(input);
            switch (alt105) {
                case 1 :
                    // InternalPipelineParser.g:2887:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?) )
                    {
                    // InternalPipelineParser.g:2887:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?) )
                    // InternalPipelineParser.g:2888:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getEventAccess().getUnorderedGroup_1());
                    				
                    // InternalPipelineParser.g:2891:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?)
                    // InternalPipelineParser.g:2892:6: ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?
                    {
                    // InternalPipelineParser.g:2892:6: ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+
                    int cnt104=0;
                    loop104:
                    do {
                        int alt104=8;
                        alt104 = dfa104.predict(input);
                        switch (alt104) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2893:4: ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:2893:4: ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) )
                    	    // InternalPipelineParser.g:2894:5: {...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 0)");
                    	    }
                    	    // InternalPipelineParser.g:2894:102: ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) )
                    	    // InternalPipelineParser.g:2895:6: ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_1(), 0);
                    	    					
                    	    // InternalPipelineParser.g:2898:9: ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) )
                    	    // InternalPipelineParser.g:2898:10: {...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "true");
                    	    }
                    	    // InternalPipelineParser.g:2898:19: (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? )
                    	    // InternalPipelineParser.g:2898:20: this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )?
                    	    {
                    	    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_56); 

                    	    									newLeafNode(this_BEGIN_3, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_1_0_0());
                    	    								
                    	    // InternalPipelineParser.g:2902:9: (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )?
                    	    int alt91=2;
                    	    int LA91_0 = input.LA(1);

                    	    if ( (LA91_0==Types) ) {
                    	        alt91=1;
                    	    }
                    	    switch (alt91) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:2903:10: otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )?
                    	            {
                    	            otherlv_4=(Token)match(input,Types,FOLLOW_57); 

                    	            										newLeafNode(otherlv_4, grammarAccess.getEventAccess().getTypesKeyword_1_0_1_0());
                    	            									
                    	            // InternalPipelineParser.g:2907:10: ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )?
                    	            int alt87=3;
                    	            switch ( input.LA(1) ) {
                    	                case RULE_ID:
                    	                    {
                    	                    alt87=1;
                    	                    }
                    	                    break;
                    	                case RULE_STRING:
                    	                    {
                    	                    alt87=1;
                    	                    }
                    	                    break;
                    	                case LeftSquareBracket:
                    	                    {
                    	                    alt87=2;
                    	                    }
                    	                    break;
                    	            }

                    	            switch (alt87) {
                    	                case 1 :
                    	                    // InternalPipelineParser.g:2908:11: ( (lv_activities_5_0= ruleActivity ) )
                    	                    {
                    	                    // InternalPipelineParser.g:2908:11: ( (lv_activities_5_0= ruleActivity ) )
                    	                    // InternalPipelineParser.g:2909:12: (lv_activities_5_0= ruleActivity )
                    	                    {
                    	                    // InternalPipelineParser.g:2909:12: (lv_activities_5_0= ruleActivity )
                    	                    // InternalPipelineParser.g:2910:13: lv_activities_5_0= ruleActivity
                    	                    {

                    	                    													newCompositeNode(grammarAccess.getEventAccess().getActivitiesActivityParserRuleCall_1_0_1_1_0_0());
                    	                    												
                    	                    pushFollow(FOLLOW_55);
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
                    	                    break;
                    	                case 2 :
                    	                    // InternalPipelineParser.g:2928:11: (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket )
                    	                    {
                    	                    // InternalPipelineParser.g:2928:11: (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket )
                    	                    // InternalPipelineParser.g:2929:12: otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket
                    	                    {
                    	                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_58); 

                    	                    												newLeafNode(otherlv_6, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_1_0_1_1_1_0());
                    	                    											
                    	                    // InternalPipelineParser.g:2933:12: ( (lv_activities_7_0= ruleActivity ) )
                    	                    // InternalPipelineParser.g:2934:13: (lv_activities_7_0= ruleActivity )
                    	                    {
                    	                    // InternalPipelineParser.g:2934:13: (lv_activities_7_0= ruleActivity )
                    	                    // InternalPipelineParser.g:2935:14: lv_activities_7_0= ruleActivity
                    	                    {

                    	                    														newCompositeNode(grammarAccess.getEventAccess().getActivitiesActivityParserRuleCall_1_0_1_1_1_1_0());
                    	                    													
                    	                    pushFollow(FOLLOW_14);
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

                    	                    // InternalPipelineParser.g:2952:12: (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )*
                    	                    loop86:
                    	                    do {
                    	                        int alt86=2;
                    	                        int LA86_0 = input.LA(1);

                    	                        if ( (LA86_0==Comma) ) {
                    	                            alt86=1;
                    	                        }


                    	                        switch (alt86) {
                    	                    	case 1 :
                    	                    	    // InternalPipelineParser.g:2953:13: otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) )
                    	                    	    {
                    	                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_58); 

                    	                    	    													newLeafNode(otherlv_8, grammarAccess.getEventAccess().getCommaKeyword_1_0_1_1_1_2_0());
                    	                    	    												
                    	                    	    // InternalPipelineParser.g:2957:13: ( (lv_activities_9_0= ruleActivity ) )
                    	                    	    // InternalPipelineParser.g:2958:14: (lv_activities_9_0= ruleActivity )
                    	                    	    {
                    	                    	    // InternalPipelineParser.g:2958:14: (lv_activities_9_0= ruleActivity )
                    	                    	    // InternalPipelineParser.g:2959:15: lv_activities_9_0= ruleActivity
                    	                    	    {

                    	                    	    															newCompositeNode(grammarAccess.getEventAccess().getActivitiesActivityParserRuleCall_1_0_1_1_1_2_1_0());
                    	                    	    														
                    	                    	    pushFollow(FOLLOW_14);
                    	                    	    lv_activities_9_0=ruleActivity();

                    	                    	    state._fsp--;


                    	                    	    															if (current==null) {
                    	                    	    																current = createModelElementForParent(grammarAccess.getEventRule());
                    	                    	    															}
                    	                    	    															add(
                    	                    	    																current,
                    	                    	    																"activities",
                    	                    	    																lv_activities_9_0,
                    	                    	    																"ca.mcgill.devops.pipeline.Pipeline.Activity");
                    	                    	    															afterParserOrEnumRuleCall();
                    	                    	    														

                    	                    	    }


                    	                    	    }


                    	                    	    }
                    	                    	    break;

                    	                    	default :
                    	                    	    break loop86;
                    	                        }
                    	                    } while (true);

                    	                    otherlv_10=(Token)match(input,RightSquareBracket,FOLLOW_55); 

                    	                    												newLeafNode(otherlv_10, grammarAccess.getEventAccess().getRightSquareBracketKeyword_1_0_1_1_1_3());
                    	                    											

                    	                    }


                    	                    }
                    	                    break;

                    	            }

                    	            // InternalPipelineParser.g:2983:10: (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )?
                    	            int alt90=2;
                    	            alt90 = dfa90.predict(input);
                    	            switch (alt90) {
                    	                case 1 :
                    	                    // InternalPipelineParser.g:2984:11: this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END
                    	                    {
                    	                    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_59); 

                    	                    											newLeafNode(this_BEGIN_11, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_1_0_1_2_0());
                    	                    										
                    	                    // InternalPipelineParser.g:2988:11: ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )*
                    	                    loop89:
                    	                    do {
                    	                        int alt89=2;
                    	                        int LA89_0 = input.LA(1);

                    	                        if ( (LA89_0==HyphenMinus||(LA89_0>=RULE_ID && LA89_0<=RULE_STRING)) ) {
                    	                            alt89=1;
                    	                        }


                    	                        switch (alt89) {
                    	                    	case 1 :
                    	                    	    // InternalPipelineParser.g:2989:12: (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) )
                    	                    	    {
                    	                    	    // InternalPipelineParser.g:2989:12: (otherlv_12= HyphenMinus )?
                    	                    	    int alt88=2;
                    	                    	    int LA88_0 = input.LA(1);

                    	                    	    if ( (LA88_0==HyphenMinus) ) {
                    	                    	        alt88=1;
                    	                    	    }
                    	                    	    switch (alt88) {
                    	                    	        case 1 :
                    	                    	            // InternalPipelineParser.g:2990:13: otherlv_12= HyphenMinus
                    	                    	            {
                    	                    	            otherlv_12=(Token)match(input,HyphenMinus,FOLLOW_58); 

                    	                    	            													newLeafNode(otherlv_12, grammarAccess.getEventAccess().getHyphenMinusKeyword_1_0_1_2_1_0());
                    	                    	            												

                    	                    	            }
                    	                    	            break;

                    	                    	    }

                    	                    	    // InternalPipelineParser.g:2995:12: ( (lv_activities_13_0= ruleActivity ) )
                    	                    	    // InternalPipelineParser.g:2996:13: (lv_activities_13_0= ruleActivity )
                    	                    	    {
                    	                    	    // InternalPipelineParser.g:2996:13: (lv_activities_13_0= ruleActivity )
                    	                    	    // InternalPipelineParser.g:2997:14: lv_activities_13_0= ruleActivity
                    	                    	    {

                    	                    	    														newCompositeNode(grammarAccess.getEventAccess().getActivitiesActivityParserRuleCall_1_0_1_2_1_1_0());
                    	                    	    													
                    	                    	    pushFollow(FOLLOW_59);
                    	                    	    lv_activities_13_0=ruleActivity();

                    	                    	    state._fsp--;


                    	                    	    														if (current==null) {
                    	                    	    															current = createModelElementForParent(grammarAccess.getEventRule());
                    	                    	    														}
                    	                    	    														add(
                    	                    	    															current,
                    	                    	    															"activities",
                    	                    	    															lv_activities_13_0,
                    	                    	    															"ca.mcgill.devops.pipeline.Pipeline.Activity");
                    	                    	    														afterParserOrEnumRuleCall();
                    	                    	    													

                    	                    	    }


                    	                    	    }


                    	                    	    }
                    	                    	    break;

                    	                    	default :
                    	                    	    break loop89;
                    	                        }
                    	                    } while (true);

                    	                    this_END_14=(Token)match(input,RULE_END,FOLLOW_55); 

                    	                    											newLeafNode(this_END_14, grammarAccess.getEventAccess().getENDTerminalRuleCall_1_0_1_2_2());
                    	                    										

                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPipelineParser.g:3027:4: ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3027:4: ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) )
                    	    // InternalPipelineParser.g:3028:5: {...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 1)");
                    	    }
                    	    // InternalPipelineParser.g:3028:102: ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) )
                    	    // InternalPipelineParser.g:3029:6: ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_1(), 1);
                    	    					
                    	    // InternalPipelineParser.g:3032:9: ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) )
                    	    // InternalPipelineParser.g:3032:10: {...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "true");
                    	    }
                    	    // InternalPipelineParser.g:3032:19: ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) )
                    	    // InternalPipelineParser.g:3032:20: ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) )
                    	    {
                    	    // InternalPipelineParser.g:3032:20: ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) )
                    	    // InternalPipelineParser.g:3033:10: ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) )
                    	    {
                    	    // InternalPipelineParser.g:3033:10: ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) )
                    	    // InternalPipelineParser.g:3034:11: (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore )
                    	    {
                    	    // InternalPipelineParser.g:3034:11: (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore )
                    	    int alt92=2;
                    	    int LA92_0 = input.LA(1);

                    	    if ( (LA92_0==Branches) ) {
                    	        alt92=1;
                    	    }
                    	    else if ( (LA92_0==BranchesIgnore) ) {
                    	        alt92=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 92, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt92) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:3035:12: lv_branchKW_15_1= Branches
                    	            {
                    	            lv_branchKW_15_1=(Token)match(input,Branches,FOLLOW_57); 

                    	            												newLeafNode(lv_branchKW_15_1, grammarAccess.getEventAccess().getBranchKWBranchesKeyword_1_1_0_0_0());
                    	            											

                    	            												if (current==null) {
                    	            													current = createModelElement(grammarAccess.getEventRule());
                    	            												}
                    	            												setWithLastConsumed(current, "branchKW", lv_branchKW_15_1, null);
                    	            											

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:3046:12: lv_branchKW_15_2= BranchesIgnore
                    	            {
                    	            lv_branchKW_15_2=(Token)match(input,BranchesIgnore,FOLLOW_57); 

                    	            												newLeafNode(lv_branchKW_15_2, grammarAccess.getEventAccess().getBranchKWBranchesIgnoreKeyword_1_1_0_0_1());
                    	            											

                    	            												if (current==null) {
                    	            													current = createModelElement(grammarAccess.getEventRule());
                    	            												}
                    	            												setWithLastConsumed(current, "branchKW", lv_branchKW_15_2, null);
                    	            											

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // InternalPipelineParser.g:3059:9: ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )?
                    	    int alt94=3;
                    	    switch ( input.LA(1) ) {
                    	        case RULE_ID:
                    	            {
                    	            alt94=1;
                    	            }
                    	            break;
                    	        case RULE_STRING:
                    	            {
                    	            alt94=1;
                    	            }
                    	            break;
                    	        case LeftSquareBracket:
                    	            {
                    	            alt94=2;
                    	            }
                    	            break;
                    	    }

                    	    switch (alt94) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:3060:10: ( (lv_branches_16_0= ruleBranch ) )
                    	            {
                    	            // InternalPipelineParser.g:3060:10: ( (lv_branches_16_0= ruleBranch ) )
                    	            // InternalPipelineParser.g:3061:11: (lv_branches_16_0= ruleBranch )
                    	            {
                    	            // InternalPipelineParser.g:3061:11: (lv_branches_16_0= ruleBranch )
                    	            // InternalPipelineParser.g:3062:12: lv_branches_16_0= ruleBranch
                    	            {

                    	            												newCompositeNode(grammarAccess.getEventAccess().getBranchesBranchParserRuleCall_1_1_1_0_0());
                    	            											
                    	            pushFollow(FOLLOW_55);
                    	            lv_branches_16_0=ruleBranch();

                    	            state._fsp--;


                    	            												if (current==null) {
                    	            													current = createModelElementForParent(grammarAccess.getEventRule());
                    	            												}
                    	            												add(
                    	            													current,
                    	            													"branches",
                    	            													lv_branches_16_0,
                    	            													"ca.mcgill.devops.pipeline.Pipeline.Branch");
                    	            												afterParserOrEnumRuleCall();
                    	            											

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:3080:10: (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket )
                    	            {
                    	            // InternalPipelineParser.g:3080:10: (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket )
                    	            // InternalPipelineParser.g:3081:11: otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket
                    	            {
                    	            otherlv_17=(Token)match(input,LeftSquareBracket,FOLLOW_58); 

                    	            											newLeafNode(otherlv_17, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_1_1_1_1_0());
                    	            										
                    	            // InternalPipelineParser.g:3085:11: ( (lv_branches_18_0= ruleBranch ) )
                    	            // InternalPipelineParser.g:3086:12: (lv_branches_18_0= ruleBranch )
                    	            {
                    	            // InternalPipelineParser.g:3086:12: (lv_branches_18_0= ruleBranch )
                    	            // InternalPipelineParser.g:3087:13: lv_branches_18_0= ruleBranch
                    	            {

                    	            													newCompositeNode(grammarAccess.getEventAccess().getBranchesBranchParserRuleCall_1_1_1_1_1_0());
                    	            												
                    	            pushFollow(FOLLOW_14);
                    	            lv_branches_18_0=ruleBranch();

                    	            state._fsp--;


                    	            													if (current==null) {
                    	            														current = createModelElementForParent(grammarAccess.getEventRule());
                    	            													}
                    	            													add(
                    	            														current,
                    	            														"branches",
                    	            														lv_branches_18_0,
                    	            														"ca.mcgill.devops.pipeline.Pipeline.Branch");
                    	            													afterParserOrEnumRuleCall();
                    	            												

                    	            }


                    	            }

                    	            // InternalPipelineParser.g:3104:11: (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )*
                    	            loop93:
                    	            do {
                    	                int alt93=2;
                    	                int LA93_0 = input.LA(1);

                    	                if ( (LA93_0==Comma) ) {
                    	                    alt93=1;
                    	                }


                    	                switch (alt93) {
                    	            	case 1 :
                    	            	    // InternalPipelineParser.g:3105:12: otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) )
                    	            	    {
                    	            	    otherlv_19=(Token)match(input,Comma,FOLLOW_58); 

                    	            	    												newLeafNode(otherlv_19, grammarAccess.getEventAccess().getCommaKeyword_1_1_1_1_2_0());
                    	            	    											
                    	            	    // InternalPipelineParser.g:3109:12: ( (lv_branches_20_0= ruleBranch ) )
                    	            	    // InternalPipelineParser.g:3110:13: (lv_branches_20_0= ruleBranch )
                    	            	    {
                    	            	    // InternalPipelineParser.g:3110:13: (lv_branches_20_0= ruleBranch )
                    	            	    // InternalPipelineParser.g:3111:14: lv_branches_20_0= ruleBranch
                    	            	    {

                    	            	    														newCompositeNode(grammarAccess.getEventAccess().getBranchesBranchParserRuleCall_1_1_1_1_2_1_0());
                    	            	    													
                    	            	    pushFollow(FOLLOW_14);
                    	            	    lv_branches_20_0=ruleBranch();

                    	            	    state._fsp--;


                    	            	    														if (current==null) {
                    	            	    															current = createModelElementForParent(grammarAccess.getEventRule());
                    	            	    														}
                    	            	    														add(
                    	            	    															current,
                    	            	    															"branches",
                    	            	    															lv_branches_20_0,
                    	            	    															"ca.mcgill.devops.pipeline.Pipeline.Branch");
                    	            	    														afterParserOrEnumRuleCall();
                    	            	    													

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop93;
                    	                }
                    	            } while (true);

                    	            otherlv_21=(Token)match(input,RightSquareBracket,FOLLOW_55); 

                    	            											newLeafNode(otherlv_21, grammarAccess.getEventAccess().getRightSquareBracketKeyword_1_1_1_1_3());
                    	            										

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalPipelineParser.g:3135:9: ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) )
                    	    int alt99=2;
                    	    int LA99_0 = input.LA(1);

                    	    if ( (LA99_0==EOF||(LA99_0>=CancelInProgress && LA99_0<=Credentials)||(LA99_0>=Environment && LA99_0<=Entrypoint)||LA99_0==Parameters||LA99_0==Container||(LA99_0>=FailFast && LA99_0<=Branches)||LA99_0==Defaults||(LA99_0>=Packages && LA99_0<=Webhooks)||(LA99_0>=Exclude && LA99_0<=Outputs)||(LA99_0>=Rolling && LA99_0<=Trigger)||(LA99_0>=Builds && LA99_0<=Target)||(LA99_0>=Build && LA99_0<=Shell)||(LA99_0>=Types && LA99_0<=Args)||(LA99_0>=Cron && LA99_0<=Push)||(LA99_0>=Size && LA99_0<=Tags)||(LA99_0>=Type && LA99_0<=Uses)||LA99_0==Env||(LA99_0>=Id && LA99_0<=Pr)||(LA99_0>=Comma && LA99_0<=HyphenMinus)||LA99_0==RightSquareBracket||(LA99_0>=RULE_ID && LA99_0<=RULE_STRING)||LA99_0==RULE_END) ) {
                    	        alt99=1;
                    	    }
                    	    else if ( (LA99_0==RULE_BEGIN) ) {
                    	        int LA99_2 = input.LA(2);

                    	        if ( (LA99_2==EOF||(LA99_2>=CancelInProgress && LA99_2<=Credentials)||(LA99_2>=Environment && LA99_2<=Entrypoint)||LA99_2==Parameters||LA99_2==Container||(LA99_2>=FailFast && LA99_2<=Branches)||LA99_2==Defaults||(LA99_2>=Packages && LA99_2<=Webhooks)||(LA99_2>=Exclude && LA99_2<=Outputs)||(LA99_2>=Rolling && LA99_2<=Trigger)||(LA99_2>=Builds && LA99_2<=Target)||(LA99_2>=Build && LA99_2<=Shell)||(LA99_2>=Types && LA99_2<=Args)||(LA99_2>=Cron && LA99_2<=Push)||(LA99_2>=Size && LA99_2<=Tags)||(LA99_2>=Type && LA99_2<=Uses)||LA99_2==Env||(LA99_2>=Id && LA99_2<=Pr)||(LA99_2>=Comma && LA99_2<=HyphenMinus)||LA99_2==RightSquareBracket||(LA99_2>=RULE_ID && LA99_2<=RULE_STRING)||(LA99_2>=RULE_BEGIN && LA99_2<=RULE_END)) ) {
                    	            alt99=1;
                    	        }
                    	        else if ( ((LA99_2>=Excludes && LA99_2<=Includes)) ) {
                    	            alt99=2;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 99, 2, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 99, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt99) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:3136:10: (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )*
                    	            {
                    	            // InternalPipelineParser.g:3136:10: (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )*
                    	            loop95:
                    	            do {
                    	                int alt95=2;
                    	                int LA95_0 = input.LA(1);

                    	                if ( (LA95_0==HyphenMinus) ) {
                    	                    int LA95_2 = input.LA(2);

                    	                    if ( ((LA95_2>=RULE_ID && LA95_2<=RULE_STRING)) ) {
                    	                        alt95=1;
                    	                    }


                    	                }


                    	                switch (alt95) {
                    	            	case 1 :
                    	            	    // InternalPipelineParser.g:3137:11: otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) )
                    	            	    {
                    	            	    otherlv_22=(Token)match(input,HyphenMinus,FOLLOW_58); 

                    	            	    											newLeafNode(otherlv_22, grammarAccess.getEventAccess().getHyphenMinusKeyword_1_1_2_0_0());
                    	            	    										
                    	            	    // InternalPipelineParser.g:3141:11: ( (lv_branches_23_0= ruleBranch ) )
                    	            	    // InternalPipelineParser.g:3142:12: (lv_branches_23_0= ruleBranch )
                    	            	    {
                    	            	    // InternalPipelineParser.g:3142:12: (lv_branches_23_0= ruleBranch )
                    	            	    // InternalPipelineParser.g:3143:13: lv_branches_23_0= ruleBranch
                    	            	    {

                    	            	    													newCompositeNode(grammarAccess.getEventAccess().getBranchesBranchParserRuleCall_1_1_2_0_1_0());
                    	            	    												
                    	            	    pushFollow(FOLLOW_55);
                    	            	    lv_branches_23_0=ruleBranch();

                    	            	    state._fsp--;


                    	            	    													if (current==null) {
                    	            	    														current = createModelElementForParent(grammarAccess.getEventRule());
                    	            	    													}
                    	            	    													add(
                    	            	    														current,
                    	            	    														"branches",
                    	            	    														lv_branches_23_0,
                    	            	    														"ca.mcgill.devops.pipeline.Pipeline.Branch");
                    	            	    													afterParserOrEnumRuleCall();
                    	            	    												

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop95;
                    	                }
                    	            } while (true);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:3162:10: (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END )
                    	            {
                    	            // InternalPipelineParser.g:3162:10: (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END )
                    	            // InternalPipelineParser.g:3163:11: this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END
                    	            {
                    	            this_BEGIN_24=(Token)match(input,RULE_BEGIN,FOLLOW_60); 

                    	            											newLeafNode(this_BEGIN_24, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_1_1_2_1_0());
                    	            										
                    	            // InternalPipelineParser.g:3167:11: ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+
                    	            int cnt98=0;
                    	            loop98:
                    	            do {
                    	                int alt98=2;
                    	                int LA98_0 = input.LA(1);

                    	                if ( ((LA98_0>=Excludes && LA98_0<=Includes)) ) {
                    	                    alt98=1;
                    	                }


                    	                switch (alt98) {
                    	            	case 1 :
                    	            	    // InternalPipelineParser.g:3168:12: (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )*
                    	            	    {
                    	            	    // InternalPipelineParser.g:3168:12: (otherlv_25= Includes | otherlv_26= Excludes )
                    	            	    int alt96=2;
                    	            	    int LA96_0 = input.LA(1);

                    	            	    if ( (LA96_0==Includes) ) {
                    	            	        alt96=1;
                    	            	    }
                    	            	    else if ( (LA96_0==Excludes) ) {
                    	            	        alt96=2;
                    	            	    }
                    	            	    else {
                    	            	        NoViableAltException nvae =
                    	            	            new NoViableAltException("", 96, 0, input);

                    	            	        throw nvae;
                    	            	    }
                    	            	    switch (alt96) {
                    	            	        case 1 :
                    	            	            // InternalPipelineParser.g:3169:13: otherlv_25= Includes
                    	            	            {
                    	            	            otherlv_25=(Token)match(input,Includes,FOLLOW_61); 

                    	            	            													newLeafNode(otherlv_25, grammarAccess.getEventAccess().getIncludesKeyword_1_1_2_1_1_0_0());
                    	            	            												

                    	            	            }
                    	            	            break;
                    	            	        case 2 :
                    	            	            // InternalPipelineParser.g:3174:13: otherlv_26= Excludes
                    	            	            {
                    	            	            otherlv_26=(Token)match(input,Excludes,FOLLOW_61); 

                    	            	            													newLeafNode(otherlv_26, grammarAccess.getEventAccess().getExcludesKeyword_1_1_2_1_1_0_1());
                    	            	            												

                    	            	            }
                    	            	            break;

                    	            	    }

                    	            	    // InternalPipelineParser.g:3179:12: (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )*
                    	            	    loop97:
                    	            	    do {
                    	            	        int alt97=2;
                    	            	        int LA97_0 = input.LA(1);

                    	            	        if ( (LA97_0==HyphenMinus) ) {
                    	            	            alt97=1;
                    	            	        }


                    	            	        switch (alt97) {
                    	            	    	case 1 :
                    	            	    	    // InternalPipelineParser.g:3180:13: otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) )
                    	            	    	    {
                    	            	    	    otherlv_27=(Token)match(input,HyphenMinus,FOLLOW_58); 

                    	            	    	    													newLeafNode(otherlv_27, grammarAccess.getEventAccess().getHyphenMinusKeyword_1_1_2_1_1_1_0());
                    	            	    	    												
                    	            	    	    // InternalPipelineParser.g:3184:13: ( (lv_branches_28_0= ruleBranch ) )
                    	            	    	    // InternalPipelineParser.g:3185:14: (lv_branches_28_0= ruleBranch )
                    	            	    	    {
                    	            	    	    // InternalPipelineParser.g:3185:14: (lv_branches_28_0= ruleBranch )
                    	            	    	    // InternalPipelineParser.g:3186:15: lv_branches_28_0= ruleBranch
                    	            	    	    {

                    	            	    	    															newCompositeNode(grammarAccess.getEventAccess().getBranchesBranchParserRuleCall_1_1_2_1_1_1_1_0());
                    	            	    	    														
                    	            	    	    pushFollow(FOLLOW_61);
                    	            	    	    lv_branches_28_0=ruleBranch();

                    	            	    	    state._fsp--;


                    	            	    	    															if (current==null) {
                    	            	    	    																current = createModelElementForParent(grammarAccess.getEventRule());
                    	            	    	    															}
                    	            	    	    															add(
                    	            	    	    																current,
                    	            	    	    																"branches",
                    	            	    	    																lv_branches_28_0,
                    	            	    	    																"ca.mcgill.devops.pipeline.Pipeline.Branch");
                    	            	    	    															afterParserOrEnumRuleCall();
                    	            	    	    														

                    	            	    	    }


                    	            	    	    }


                    	            	    	    }
                    	            	    	    break;

                    	            	    	default :
                    	            	    	    break loop97;
                    	            	        }
                    	            	    } while (true);


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt98 >= 1 ) break loop98;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(98, input);
                    	                        throw eee;
                    	                }
                    	                cnt98++;
                    	            } while (true);

                    	            this_END_29=(Token)match(input,RULE_END,FOLLOW_55); 

                    	            											newLeafNode(this_END_29, grammarAccess.getEventAccess().getENDTerminalRuleCall_1_1_2_1_2());
                    	            										

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalPipelineParser.g:3217:4: ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3217:4: ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) )
                    	    // InternalPipelineParser.g:3218:5: {...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 2)");
                    	    }
                    	    // InternalPipelineParser.g:3218:102: ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) )
                    	    // InternalPipelineParser.g:3219:6: ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_1(), 2);
                    	    					
                    	    // InternalPipelineParser.g:3222:9: ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) )
                    	    // InternalPipelineParser.g:3222:10: {...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "true");
                    	    }
                    	    // InternalPipelineParser.g:3222:19: ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) )
                    	    // InternalPipelineParser.g:3222:20: ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END )
                    	    {
                    	    // InternalPipelineParser.g:3222:20: ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) )
                    	    // InternalPipelineParser.g:3223:10: ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) )
                    	    {
                    	    // InternalPipelineParser.g:3223:10: ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) )
                    	    // InternalPipelineParser.g:3224:11: (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore )
                    	    {
                    	    // InternalPipelineParser.g:3224:11: (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore )
                    	    int alt100=2;
                    	    int LA100_0 = input.LA(1);

                    	    if ( (LA100_0==Paths) ) {
                    	        alt100=1;
                    	    }
                    	    else if ( (LA100_0==PathsIgnore) ) {
                    	        alt100=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 100, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt100) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:3225:12: lv_pathKW_30_1= Paths
                    	            {
                    	            lv_pathKW_30_1=(Token)match(input,Paths,FOLLOW_5); 

                    	            												newLeafNode(lv_pathKW_30_1, grammarAccess.getEventAccess().getPathKWPathsKeyword_1_2_0_0_0());
                    	            											

                    	            												if (current==null) {
                    	            													current = createModelElement(grammarAccess.getEventRule());
                    	            												}
                    	            												setWithLastConsumed(current, "pathKW", lv_pathKW_30_1, null);
                    	            											

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:3236:12: lv_pathKW_30_2= PathsIgnore
                    	            {
                    	            lv_pathKW_30_2=(Token)match(input,PathsIgnore,FOLLOW_5); 

                    	            												newLeafNode(lv_pathKW_30_2, grammarAccess.getEventAccess().getPathKWPathsIgnoreKeyword_1_2_0_0_1());
                    	            											

                    	            												if (current==null) {
                    	            													current = createModelElement(grammarAccess.getEventRule());
                    	            												}
                    	            												setWithLastConsumed(current, "pathKW", lv_pathKW_30_2, null);
                    	            											

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // InternalPipelineParser.g:3249:9: (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END )
                    	    // InternalPipelineParser.g:3250:10: this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END
                    	    {
                    	    this_BEGIN_31=(Token)match(input,RULE_BEGIN,FOLLOW_62); 

                    	    										newLeafNode(this_BEGIN_31, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_1_2_1_0());
                    	    									
                    	    // InternalPipelineParser.g:3254:10: ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) )
                    	    int alt102=2;
                    	    int LA102_0 = input.LA(1);

                    	    if ( (LA102_0==HyphenMinus) ) {
                    	        alt102=1;
                    	    }
                    	    else if ( ((LA102_0>=Excludes && LA102_0<=Includes)) ) {
                    	        alt102=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 102, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt102) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:3255:11: ( (lv_pathValue_32_0= ruleHyphenParameters ) )
                    	            {
                    	            // InternalPipelineParser.g:3255:11: ( (lv_pathValue_32_0= ruleHyphenParameters ) )
                    	            // InternalPipelineParser.g:3256:12: (lv_pathValue_32_0= ruleHyphenParameters )
                    	            {
                    	            // InternalPipelineParser.g:3256:12: (lv_pathValue_32_0= ruleHyphenParameters )
                    	            // InternalPipelineParser.g:3257:13: lv_pathValue_32_0= ruleHyphenParameters
                    	            {

                    	            													newCompositeNode(grammarAccess.getEventAccess().getPathValueHyphenParametersParserRuleCall_1_2_1_1_0_0());
                    	            												
                    	            pushFollow(FOLLOW_8);
                    	            lv_pathValue_32_0=ruleHyphenParameters();

                    	            state._fsp--;


                    	            													if (current==null) {
                    	            														current = createModelElementForParent(grammarAccess.getEventRule());
                    	            													}
                    	            													set(
                    	            														current,
                    	            														"pathValue",
                    	            														lv_pathValue_32_0,
                    	            														"ca.mcgill.devops.pipeline.Pipeline.HyphenParameters");
                    	            													afterParserOrEnumRuleCall();
                    	            												

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:3275:11: ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) )
                    	            {
                    	            // InternalPipelineParser.g:3275:11: ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) )
                    	            // InternalPipelineParser.g:3276:12: ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) )
                    	            {
                    	            // InternalPipelineParser.g:3276:12: ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) )
                    	            // InternalPipelineParser.g:3277:13: ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) )
                    	            {
                    	            // InternalPipelineParser.g:3277:13: ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) )
                    	            // InternalPipelineParser.g:3278:14: (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes )
                    	            {
                    	            // InternalPipelineParser.g:3278:14: (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes )
                    	            int alt101=2;
                    	            int LA101_0 = input.LA(1);

                    	            if ( (LA101_0==Includes) ) {
                    	                alt101=1;
                    	            }
                    	            else if ( (LA101_0==Excludes) ) {
                    	                alt101=2;
                    	            }
                    	            else {
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 101, 0, input);

                    	                throw nvae;
                    	            }
                    	            switch (alt101) {
                    	                case 1 :
                    	                    // InternalPipelineParser.g:3279:15: lv_incExcKW_33_1= Includes
                    	                    {
                    	                    lv_incExcKW_33_1=(Token)match(input,Includes,FOLLOW_24); 

                    	                    															newLeafNode(lv_incExcKW_33_1, grammarAccess.getEventAccess().getIncExcKWIncludesKeyword_1_2_1_1_1_0_0_0());
                    	                    														

                    	                    															if (current==null) {
                    	                    																current = createModelElement(grammarAccess.getEventRule());
                    	                    															}
                    	                    															setWithLastConsumed(current, "incExcKW", lv_incExcKW_33_1, null);
                    	                    														

                    	                    }
                    	                    break;
                    	                case 2 :
                    	                    // InternalPipelineParser.g:3290:15: lv_incExcKW_33_2= Excludes
                    	                    {
                    	                    lv_incExcKW_33_2=(Token)match(input,Excludes,FOLLOW_24); 

                    	                    															newLeafNode(lv_incExcKW_33_2, grammarAccess.getEventAccess().getIncExcKWExcludesKeyword_1_2_1_1_1_0_0_1());
                    	                    														

                    	                    															if (current==null) {
                    	                    																current = createModelElement(grammarAccess.getEventRule());
                    	                    															}
                    	                    															setWithLastConsumed(current, "incExcKW", lv_incExcKW_33_2, null);
                    	                    														

                    	                    }
                    	                    break;

                    	            }


                    	            }


                    	            }

                    	            // InternalPipelineParser.g:3303:12: ( (lv_pathValue_34_0= ruleHyphenParameters ) )
                    	            // InternalPipelineParser.g:3304:13: (lv_pathValue_34_0= ruleHyphenParameters )
                    	            {
                    	            // InternalPipelineParser.g:3304:13: (lv_pathValue_34_0= ruleHyphenParameters )
                    	            // InternalPipelineParser.g:3305:14: lv_pathValue_34_0= ruleHyphenParameters
                    	            {

                    	            														newCompositeNode(grammarAccess.getEventAccess().getPathValueHyphenParametersParserRuleCall_1_2_1_1_1_1_0());
                    	            													
                    	            pushFollow(FOLLOW_8);
                    	            lv_pathValue_34_0=ruleHyphenParameters();

                    	            state._fsp--;


                    	            														if (current==null) {
                    	            															current = createModelElementForParent(grammarAccess.getEventRule());
                    	            														}
                    	            														set(
                    	            															current,
                    	            															"pathValue",
                    	            															lv_pathValue_34_0,
                    	            															"ca.mcgill.devops.pipeline.Pipeline.HyphenParameters");
                    	            														afterParserOrEnumRuleCall();
                    	            													

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    this_END_35=(Token)match(input,RULE_END,FOLLOW_55); 

                    	    										newLeafNode(this_END_35, grammarAccess.getEventAccess().getENDTerminalRuleCall_1_2_1_2());
                    	    									

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalPipelineParser.g:3335:4: ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3335:4: ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) )
                    	    // InternalPipelineParser.g:3336:5: {...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 3)");
                    	    }
                    	    // InternalPipelineParser.g:3336:102: ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) )
                    	    // InternalPipelineParser.g:3337:6: ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_1(), 3);
                    	    					
                    	    // InternalPipelineParser.g:3340:9: ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) )
                    	    // InternalPipelineParser.g:3340:10: {...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "true");
                    	    }
                    	    // InternalPipelineParser.g:3340:19: (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) )
                    	    // InternalPipelineParser.g:3340:20: otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) )
                    	    {
                    	    otherlv_36=(Token)match(input,AutoCancel,FOLLOW_28); 

                    	    									newLeafNode(otherlv_36, grammarAccess.getEventAccess().getAutoCancelKeyword_1_3_0());
                    	    								
                    	    // InternalPipelineParser.g:3344:9: ( (lv_autoCancel_37_0= RULE_ID ) )
                    	    // InternalPipelineParser.g:3345:10: (lv_autoCancel_37_0= RULE_ID )
                    	    {
                    	    // InternalPipelineParser.g:3345:10: (lv_autoCancel_37_0= RULE_ID )
                    	    // InternalPipelineParser.g:3346:11: lv_autoCancel_37_0= RULE_ID
                    	    {
                    	    lv_autoCancel_37_0=(Token)match(input,RULE_ID,FOLLOW_55); 

                    	    											newLeafNode(lv_autoCancel_37_0, grammarAccess.getEventAccess().getAutoCancelIDTerminalRuleCall_1_3_1_0());
                    	    										

                    	    											if (current==null) {
                    	    												current = createModelElement(grammarAccess.getEventRule());
                    	    											}
                    	    											setWithLastConsumed(
                    	    												current,
                    	    												"autoCancel",
                    	    												lv_autoCancel_37_0,
                    	    												"ca.mcgill.devops.pipeline.Pipeline.ID");
                    	    										

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalPipelineParser.g:3368:4: ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3368:4: ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) )
                    	    // InternalPipelineParser.g:3369:5: {...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 4)");
                    	    }
                    	    // InternalPipelineParser.g:3369:102: ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) )
                    	    // InternalPipelineParser.g:3370:6: ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_1(), 4);
                    	    					
                    	    // InternalPipelineParser.g:3373:9: ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) )
                    	    // InternalPipelineParser.g:3373:10: {...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "true");
                    	    }
                    	    // InternalPipelineParser.g:3373:19: (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) )
                    	    // InternalPipelineParser.g:3373:20: otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) )
                    	    {
                    	    otherlv_38=(Token)match(input,Drafts,FOLLOW_28); 

                    	    									newLeafNode(otherlv_38, grammarAccess.getEventAccess().getDraftsKeyword_1_4_0());
                    	    								
                    	    // InternalPipelineParser.g:3377:9: ( (lv_drafts_39_0= RULE_ID ) )
                    	    // InternalPipelineParser.g:3378:10: (lv_drafts_39_0= RULE_ID )
                    	    {
                    	    // InternalPipelineParser.g:3378:10: (lv_drafts_39_0= RULE_ID )
                    	    // InternalPipelineParser.g:3379:11: lv_drafts_39_0= RULE_ID
                    	    {
                    	    lv_drafts_39_0=(Token)match(input,RULE_ID,FOLLOW_55); 

                    	    											newLeafNode(lv_drafts_39_0, grammarAccess.getEventAccess().getDraftsIDTerminalRuleCall_1_4_1_0());
                    	    										

                    	    											if (current==null) {
                    	    												current = createModelElement(grammarAccess.getEventRule());
                    	    											}
                    	    											setWithLastConsumed(
                    	    												current,
                    	    												"drafts",
                    	    												lv_drafts_39_0,
                    	    												"ca.mcgill.devops.pipeline.Pipeline.ID");
                    	    										

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalPipelineParser.g:3401:4: ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) )
                    	    {
                    	    // InternalPipelineParser.g:3401:4: ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) )
                    	    // InternalPipelineParser.g:3402:5: {...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 5)");
                    	    }
                    	    // InternalPipelineParser.g:3402:102: ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ )
                    	    // InternalPipelineParser.g:3403:6: ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_1(), 5);
                    	    					
                    	    // InternalPipelineParser.g:3406:9: ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+
                    	    int cnt103=0;
                    	    loop103:
                    	    do {
                    	        int alt103=2;
                    	        int LA103_0 = input.LA(1);

                    	        if ( (LA103_0==HyphenMinus) ) {
                    	            int LA103_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt103=1;
                    	            }


                    	        }


                    	        switch (alt103) {
                    	    	case 1 :
                    	    	    // InternalPipelineParser.g:3406:10: {...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleEvent", "true");
                    	    	    }
                    	    	    // InternalPipelineParser.g:3406:19: (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) )
                    	    	    // InternalPipelineParser.g:3406:20: otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) )
                    	    	    {
                    	    	    otherlv_40=(Token)match(input,HyphenMinus,FOLLOW_63); 

                    	    	    									newLeafNode(otherlv_40, grammarAccess.getEventAccess().getHyphenMinusKeyword_1_5_0());
                    	    	    								
                    	    	    otherlv_41=(Token)match(input,Cron,FOLLOW_58); 

                    	    	    									newLeafNode(otherlv_41, grammarAccess.getEventAccess().getCronKeyword_1_5_1());
                    	    	    								
                    	    	    // InternalPipelineParser.g:3414:9: ( (lv_activities_42_0= ruleActivity ) )
                    	    	    // InternalPipelineParser.g:3415:10: (lv_activities_42_0= ruleActivity )
                    	    	    {
                    	    	    // InternalPipelineParser.g:3415:10: (lv_activities_42_0= ruleActivity )
                    	    	    // InternalPipelineParser.g:3416:11: lv_activities_42_0= ruleActivity
                    	    	    {

                    	    	    											newCompositeNode(grammarAccess.getEventAccess().getActivitiesActivityParserRuleCall_1_5_2_0());
                    	    	    										
                    	    	    pushFollow(FOLLOW_55);
                    	    	    lv_activities_42_0=ruleActivity();

                    	    	    state._fsp--;


                    	    	    											if (current==null) {
                    	    	    												current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	    											}
                    	    	    											add(
                    	    	    												current,
                    	    	    												"activities",
                    	    	    												lv_activities_42_0,
                    	    	    												"ca.mcgill.devops.pipeline.Pipeline.Activity");
                    	    	    											afterParserOrEnumRuleCall();
                    	    	    										

                    	    	    }


                    	    	    }


                    	    	    }


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

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalPipelineParser.g:3439:4: ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3439:4: ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) )
                    	    // InternalPipelineParser.g:3440:5: {...}? => ( ({...}? => (this_END_43= RULE_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 6)");
                    	    }
                    	    // InternalPipelineParser.g:3440:102: ( ({...}? => (this_END_43= RULE_END ) ) )
                    	    // InternalPipelineParser.g:3441:6: ({...}? => (this_END_43= RULE_END ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_1(), 6);
                    	    					
                    	    // InternalPipelineParser.g:3444:9: ({...}? => (this_END_43= RULE_END ) )
                    	    // InternalPipelineParser.g:3444:10: {...}? => (this_END_43= RULE_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvent", "true");
                    	    }
                    	    // InternalPipelineParser.g:3444:19: (this_END_43= RULE_END )
                    	    // InternalPipelineParser.g:3444:20: this_END_43= RULE_END
                    	    {
                    	    this_END_43=(Token)match(input,RULE_END,FOLLOW_55); 

                    	    									newLeafNode(this_END_43, grammarAccess.getEventAccess().getENDTerminalRuleCall_1_6());
                    	    								

                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


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

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEventAccess().getUnorderedGroup_1()) ) {
                        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canLeave(grammarAccess.getEventAccess().getUnorderedGroup_1())");
                    }

                    }


                    }

                     
                    				  getUnorderedGroupHelper().leave(grammarAccess.getEventAccess().getUnorderedGroup_1());
                    				

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleBranch"
    // InternalPipelineParser.g:3466:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalPipelineParser.g:3466:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalPipelineParser.g:3467:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalPipelineParser.g:3473:1: ruleBranch returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3479:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalPipelineParser.g:3480:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalPipelineParser.g:3480:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_name_1_0= RULE_STRING ) ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_ID) ) {
                alt106=1;
            }
            else if ( (LA106_0==RULE_STRING) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalPipelineParser.g:3481:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalPipelineParser.g:3481:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalPipelineParser.g:3482:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalPipelineParser.g:3482:4: (lv_name_0_0= RULE_ID )
                    // InternalPipelineParser.g:3483:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getBranchAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBranchRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"ca.mcgill.devops.pipeline.Pipeline.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3500:3: ( (lv_name_1_0= RULE_STRING ) )
                    {
                    // InternalPipelineParser.g:3500:3: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalPipelineParser.g:3501:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalPipelineParser.g:3501:4: (lv_name_1_0= RULE_STRING )
                    // InternalPipelineParser.g:3502:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getBranchAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBranchRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"ca.mcgill.devops.pipeline.Pipeline.STRING");
                    				

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
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleActivity"
    // InternalPipelineParser.g:3522:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalPipelineParser.g:3522:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalPipelineParser.g:3523:2: iv_ruleActivity= ruleActivity EOF
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
    // InternalPipelineParser.g:3529:1: ruleActivity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3535:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalPipelineParser.g:3536:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalPipelineParser.g:3536:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_name_1_0= RULE_STRING ) ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_ID) ) {
                alt107=1;
            }
            else if ( (LA107_0==RULE_STRING) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalPipelineParser.g:3537:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalPipelineParser.g:3537:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalPipelineParser.g:3538:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalPipelineParser.g:3538:4: (lv_name_0_0= RULE_ID )
                    // InternalPipelineParser.g:3539:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActivityRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"ca.mcgill.devops.pipeline.Pipeline.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3556:3: ( (lv_name_1_0= RULE_STRING ) )
                    {
                    // InternalPipelineParser.g:3556:3: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalPipelineParser.g:3557:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalPipelineParser.g:3557:4: (lv_name_1_0= RULE_STRING )
                    // InternalPipelineParser.g:3558:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActivityRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"ca.mcgill.devops.pipeline.Pipeline.STRING");
                    				

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleIndentedKeyValues"
    // InternalPipelineParser.g:3578:1: entryRuleIndentedKeyValues returns [String current=null] : iv_ruleIndentedKeyValues= ruleIndentedKeyValues EOF ;
    public final String entryRuleIndentedKeyValues() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndentedKeyValues = null;


        try {
            // InternalPipelineParser.g:3578:57: (iv_ruleIndentedKeyValues= ruleIndentedKeyValues EOF )
            // InternalPipelineParser.g:3579:2: iv_ruleIndentedKeyValues= ruleIndentedKeyValues EOF
            {
             newCompositeNode(grammarAccess.getIndentedKeyValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndentedKeyValues=ruleIndentedKeyValues();

            state._fsp--;

             current =iv_ruleIndentedKeyValues.getText(); 
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
    // $ANTLR end "entryRuleIndentedKeyValues"


    // $ANTLR start "ruleIndentedKeyValues"
    // InternalPipelineParser.g:3585:1: ruleIndentedKeyValues returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon (kw= VerticalLine )? (this_BEGIN_3= RULE_BEGIN (this_KeyValuePairs_4= ruleKeyValuePairs | this_EXPRESSION_5= RULE_EXPRESSION )+ this_END_6= RULE_END ) ) ;
    public final AntlrDatatypeRuleToken ruleIndentedKeyValues() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_BEGIN_3=null;
        Token this_EXPRESSION_5=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken this_KeyValuePairs_4 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3591:2: ( (this_ID_0= RULE_ID kw= Colon (kw= VerticalLine )? (this_BEGIN_3= RULE_BEGIN (this_KeyValuePairs_4= ruleKeyValuePairs | this_EXPRESSION_5= RULE_EXPRESSION )+ this_END_6= RULE_END ) ) )
            // InternalPipelineParser.g:3592:2: (this_ID_0= RULE_ID kw= Colon (kw= VerticalLine )? (this_BEGIN_3= RULE_BEGIN (this_KeyValuePairs_4= ruleKeyValuePairs | this_EXPRESSION_5= RULE_EXPRESSION )+ this_END_6= RULE_END ) )
            {
            // InternalPipelineParser.g:3592:2: (this_ID_0= RULE_ID kw= Colon (kw= VerticalLine )? (this_BEGIN_3= RULE_BEGIN (this_KeyValuePairs_4= ruleKeyValuePairs | this_EXPRESSION_5= RULE_EXPRESSION )+ this_END_6= RULE_END ) )
            // InternalPipelineParser.g:3593:3: this_ID_0= RULE_ID kw= Colon (kw= VerticalLine )? (this_BEGIN_3= RULE_BEGIN (this_KeyValuePairs_4= ruleKeyValuePairs | this_EXPRESSION_5= RULE_EXPRESSION )+ this_END_6= RULE_END )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_64); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getIndentedKeyValuesAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_65); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIndentedKeyValuesAccess().getColonKeyword_1());
            		
            // InternalPipelineParser.g:3605:3: (kw= VerticalLine )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==VerticalLine) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalPipelineParser.g:3606:4: kw= VerticalLine
                    {
                    kw=(Token)match(input,VerticalLine,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndentedKeyValuesAccess().getVerticalLineKeyword_2());
                    			

                    }
                    break;

            }

            // InternalPipelineParser.g:3612:3: (this_BEGIN_3= RULE_BEGIN (this_KeyValuePairs_4= ruleKeyValuePairs | this_EXPRESSION_5= RULE_EXPRESSION )+ this_END_6= RULE_END )
            // InternalPipelineParser.g:3613:4: this_BEGIN_3= RULE_BEGIN (this_KeyValuePairs_4= ruleKeyValuePairs | this_EXPRESSION_5= RULE_EXPRESSION )+ this_END_6= RULE_END
            {
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_66); 

            				current.merge(this_BEGIN_3);
            			

            				newLeafNode(this_BEGIN_3, grammarAccess.getIndentedKeyValuesAccess().getBEGINTerminalRuleCall_3_0());
            			
            // InternalPipelineParser.g:3620:4: (this_KeyValuePairs_4= ruleKeyValuePairs | this_EXPRESSION_5= RULE_EXPRESSION )+
            int cnt109=0;
            loop109:
            do {
                int alt109=3;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==RULE_ID) ) {
                    alt109=1;
                }
                else if ( (LA109_0==RULE_EXPRESSION) ) {
                    alt109=2;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalPipelineParser.g:3621:5: this_KeyValuePairs_4= ruleKeyValuePairs
            	    {

            	    					newCompositeNode(grammarAccess.getIndentedKeyValuesAccess().getKeyValuePairsParserRuleCall_3_1_0());
            	    				
            	    pushFollow(FOLLOW_67);
            	    this_KeyValuePairs_4=ruleKeyValuePairs();

            	    state._fsp--;


            	    					current.merge(this_KeyValuePairs_4);
            	    				

            	    					afterParserOrEnumRuleCall();
            	    				

            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:3632:5: this_EXPRESSION_5= RULE_EXPRESSION
            	    {
            	    this_EXPRESSION_5=(Token)match(input,RULE_EXPRESSION,FOLLOW_67); 

            	    					current.merge(this_EXPRESSION_5);
            	    				

            	    					newLeafNode(this_EXPRESSION_5, grammarAccess.getIndentedKeyValuesAccess().getEXPRESSIONTerminalRuleCall_3_1_1());
            	    				

            	    }
            	    break;

            	default :
            	    if ( cnt109 >= 1 ) break loop109;
                        EarlyExitException eee =
                            new EarlyExitException(109, input);
                        throw eee;
                }
                cnt109++;
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				current.merge(this_END_6);
            			

            				newLeafNode(this_END_6, grammarAccess.getIndentedKeyValuesAccess().getENDTerminalRuleCall_3_2());
            			

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
    // $ANTLR end "ruleIndentedKeyValues"


    // $ANTLR start "entryRuleKeyValuePairs"
    // InternalPipelineParser.g:3652:1: entryRuleKeyValuePairs returns [String current=null] : iv_ruleKeyValuePairs= ruleKeyValuePairs EOF ;
    public final String entryRuleKeyValuePairs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyValuePairs = null;


        try {
            // InternalPipelineParser.g:3652:53: (iv_ruleKeyValuePairs= ruleKeyValuePairs EOF )
            // InternalPipelineParser.g:3653:2: iv_ruleKeyValuePairs= ruleKeyValuePairs EOF
            {
             newCompositeNode(grammarAccess.getKeyValuePairsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyValuePairs=ruleKeyValuePairs();

            state._fsp--;

             current =iv_ruleKeyValuePairs.getText(); 
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
    // $ANTLR end "entryRuleKeyValuePairs"


    // $ANTLR start "ruleKeyValuePairs"
    // InternalPipelineParser.g:3659:1: ruleKeyValuePairs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING | this_EXPRESSION_4= RULE_EXPRESSION | this_INTV_5= RULE_INTV | this_StringValue_6= ruleStringValue | this_FLOAT_LITERAL_7= RULE_FLOAT_LITERAL ) ) ;
    public final AntlrDatatypeRuleToken ruleKeyValuePairs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_STRING_3=null;
        Token this_EXPRESSION_4=null;
        Token this_INTV_5=null;
        Token this_FLOAT_LITERAL_7=null;
        AntlrDatatypeRuleToken this_StringValue_6 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3665:2: ( (this_ID_0= RULE_ID kw= Colon (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING | this_EXPRESSION_4= RULE_EXPRESSION | this_INTV_5= RULE_INTV | this_StringValue_6= ruleStringValue | this_FLOAT_LITERAL_7= RULE_FLOAT_LITERAL ) ) )
            // InternalPipelineParser.g:3666:2: (this_ID_0= RULE_ID kw= Colon (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING | this_EXPRESSION_4= RULE_EXPRESSION | this_INTV_5= RULE_INTV | this_StringValue_6= ruleStringValue | this_FLOAT_LITERAL_7= RULE_FLOAT_LITERAL ) )
            {
            // InternalPipelineParser.g:3666:2: (this_ID_0= RULE_ID kw= Colon (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING | this_EXPRESSION_4= RULE_EXPRESSION | this_INTV_5= RULE_INTV | this_StringValue_6= ruleStringValue | this_FLOAT_LITERAL_7= RULE_FLOAT_LITERAL ) )
            // InternalPipelineParser.g:3667:3: this_ID_0= RULE_ID kw= Colon (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING | this_EXPRESSION_4= RULE_EXPRESSION | this_INTV_5= RULE_INTV | this_StringValue_6= ruleStringValue | this_FLOAT_LITERAL_7= RULE_FLOAT_LITERAL )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_64); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getKeyValuePairsAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_68); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getKeyValuePairsAccess().getColonKeyword_1());
            		
            // InternalPipelineParser.g:3679:3: (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING | this_EXPRESSION_4= RULE_EXPRESSION | this_INTV_5= RULE_INTV | this_StringValue_6= ruleStringValue | this_FLOAT_LITERAL_7= RULE_FLOAT_LITERAL )
            int alt110=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt110=1;
                }
                break;
            case RULE_STRING:
                {
                alt110=2;
                }
                break;
            case RULE_EXPRESSION:
                {
                alt110=3;
                }
                break;
            case RULE_INTV:
                {
                alt110=4;
                }
                break;
            case RULE_SINGLE_CHAR:
            case RULE_VERSION:
                {
                alt110=5;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt110=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // InternalPipelineParser.g:3680:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getKeyValuePairsAccess().getIDTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3688:4: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				current.merge(this_STRING_3);
                    			

                    				newLeafNode(this_STRING_3, grammarAccess.getKeyValuePairsAccess().getSTRINGTerminalRuleCall_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:3696:4: this_EXPRESSION_4= RULE_EXPRESSION
                    {
                    this_EXPRESSION_4=(Token)match(input,RULE_EXPRESSION,FOLLOW_2); 

                    				current.merge(this_EXPRESSION_4);
                    			

                    				newLeafNode(this_EXPRESSION_4, grammarAccess.getKeyValuePairsAccess().getEXPRESSIONTerminalRuleCall_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:3704:4: this_INTV_5= RULE_INTV
                    {
                    this_INTV_5=(Token)match(input,RULE_INTV,FOLLOW_2); 

                    				current.merge(this_INTV_5);
                    			

                    				newLeafNode(this_INTV_5, grammarAccess.getKeyValuePairsAccess().getINTVTerminalRuleCall_2_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:3712:4: this_StringValue_6= ruleStringValue
                    {

                    				newCompositeNode(grammarAccess.getKeyValuePairsAccess().getStringValueParserRuleCall_2_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_StringValue_6=ruleStringValue();

                    state._fsp--;


                    				current.merge(this_StringValue_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:3723:4: this_FLOAT_LITERAL_7= RULE_FLOAT_LITERAL
                    {
                    this_FLOAT_LITERAL_7=(Token)match(input,RULE_FLOAT_LITERAL,FOLLOW_2); 

                    				current.merge(this_FLOAT_LITERAL_7);
                    			

                    				newLeafNode(this_FLOAT_LITERAL_7, grammarAccess.getKeyValuePairsAccess().getFLOAT_LITERALTerminalRuleCall_2_5());
                    			

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
    // $ANTLR end "ruleKeyValuePairs"


    // $ANTLR start "entryRuleHyphenKVP"
    // InternalPipelineParser.g:3735:1: entryRuleHyphenKVP returns [String current=null] : iv_ruleHyphenKVP= ruleHyphenKVP EOF ;
    public final String entryRuleHyphenKVP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHyphenKVP = null;


        try {
            // InternalPipelineParser.g:3735:49: (iv_ruleHyphenKVP= ruleHyphenKVP EOF )
            // InternalPipelineParser.g:3736:2: iv_ruleHyphenKVP= ruleHyphenKVP EOF
            {
             newCompositeNode(grammarAccess.getHyphenKVPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHyphenKVP=ruleHyphenKVP();

            state._fsp--;

             current =iv_ruleHyphenKVP.getText(); 
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
    // $ANTLR end "entryRuleHyphenKVP"


    // $ANTLR start "ruleHyphenKVP"
    // InternalPipelineParser.g:3742:1: ruleHyphenKVP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon this_HyphenParameters_2= ruleHyphenParameters ) ;
    public final AntlrDatatypeRuleToken ruleHyphenKVP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_HyphenParameters_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3748:2: ( (this_ID_0= RULE_ID kw= Colon this_HyphenParameters_2= ruleHyphenParameters ) )
            // InternalPipelineParser.g:3749:2: (this_ID_0= RULE_ID kw= Colon this_HyphenParameters_2= ruleHyphenParameters )
            {
            // InternalPipelineParser.g:3749:2: (this_ID_0= RULE_ID kw= Colon this_HyphenParameters_2= ruleHyphenParameters )
            // InternalPipelineParser.g:3750:3: this_ID_0= RULE_ID kw= Colon this_HyphenParameters_2= ruleHyphenParameters
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_64); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getHyphenKVPAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_24); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getHyphenKVPAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getHyphenKVPAccess().getHyphenParametersParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_HyphenParameters_2=ruleHyphenParameters();

            state._fsp--;


            			current.merge(this_HyphenParameters_2);
            		

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
    // $ANTLR end "ruleHyphenKVP"


    // $ANTLR start "entryRuleHyphenParameters"
    // InternalPipelineParser.g:3776:1: entryRuleHyphenParameters returns [String current=null] : iv_ruleHyphenParameters= ruleHyphenParameters EOF ;
    public final String entryRuleHyphenParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHyphenParameters = null;


        try {
            // InternalPipelineParser.g:3776:56: (iv_ruleHyphenParameters= ruleHyphenParameters EOF )
            // InternalPipelineParser.g:3777:2: iv_ruleHyphenParameters= ruleHyphenParameters EOF
            {
             newCompositeNode(grammarAccess.getHyphenParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHyphenParameters=ruleHyphenParameters();

            state._fsp--;

             current =iv_ruleHyphenParameters.getText(); 
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
    // $ANTLR end "entryRuleHyphenParameters"


    // $ANTLR start "ruleHyphenParameters"
    // InternalPipelineParser.g:3783:1: ruleHyphenParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= HyphenMinus (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_StringValue_3= ruleStringValue | this_ArrayList_4= ruleArrayList | this_INT_5= RULE_INT ) )+ ;
    public final AntlrDatatypeRuleToken ruleHyphenParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token this_INT_5=null;
        AntlrDatatypeRuleToken this_StringValue_3 = null;

        AntlrDatatypeRuleToken this_ArrayList_4 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3789:2: ( (kw= HyphenMinus (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_StringValue_3= ruleStringValue | this_ArrayList_4= ruleArrayList | this_INT_5= RULE_INT ) )+ )
            // InternalPipelineParser.g:3790:2: (kw= HyphenMinus (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_StringValue_3= ruleStringValue | this_ArrayList_4= ruleArrayList | this_INT_5= RULE_INT ) )+
            {
            // InternalPipelineParser.g:3790:2: (kw= HyphenMinus (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_StringValue_3= ruleStringValue | this_ArrayList_4= ruleArrayList | this_INT_5= RULE_INT ) )+
            int cnt112=0;
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==HyphenMinus) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // InternalPipelineParser.g:3791:3: kw= HyphenMinus (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_StringValue_3= ruleStringValue | this_ArrayList_4= ruleArrayList | this_INT_5= RULE_INT )
            	    {
            	    kw=(Token)match(input,HyphenMinus,FOLLOW_69); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getHyphenParametersAccess().getHyphenMinusKeyword_0());
            	    		
            	    // InternalPipelineParser.g:3796:3: (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_StringValue_3= ruleStringValue | this_ArrayList_4= ruleArrayList | this_INT_5= RULE_INT )
            	    int alt111=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt111=1;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        alt111=2;
            	        }
            	        break;
            	    case RULE_SINGLE_CHAR:
            	    case RULE_VERSION:
            	        {
            	        alt111=3;
            	        }
            	        break;
            	    case LeftSquareBracket:
            	        {
            	        alt111=4;
            	        }
            	        break;
            	    case RULE_INT:
            	        {
            	        alt111=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 111, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt111) {
            	        case 1 :
            	            // InternalPipelineParser.g:3797:4: this_ID_1= RULE_ID
            	            {
            	            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_70); 

            	            				current.merge(this_ID_1);
            	            			

            	            				newLeafNode(this_ID_1, grammarAccess.getHyphenParametersAccess().getIDTerminalRuleCall_1_0());
            	            			

            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:3805:4: this_STRING_2= RULE_STRING
            	            {
            	            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_70); 

            	            				current.merge(this_STRING_2);
            	            			

            	            				newLeafNode(this_STRING_2, grammarAccess.getHyphenParametersAccess().getSTRINGTerminalRuleCall_1_1());
            	            			

            	            }
            	            break;
            	        case 3 :
            	            // InternalPipelineParser.g:3813:4: this_StringValue_3= ruleStringValue
            	            {

            	            				newCompositeNode(grammarAccess.getHyphenParametersAccess().getStringValueParserRuleCall_1_2());
            	            			
            	            pushFollow(FOLLOW_70);
            	            this_StringValue_3=ruleStringValue();

            	            state._fsp--;


            	            				current.merge(this_StringValue_3);
            	            			

            	            				afterParserOrEnumRuleCall();
            	            			

            	            }
            	            break;
            	        case 4 :
            	            // InternalPipelineParser.g:3824:4: this_ArrayList_4= ruleArrayList
            	            {

            	            				newCompositeNode(grammarAccess.getHyphenParametersAccess().getArrayListParserRuleCall_1_3());
            	            			
            	            pushFollow(FOLLOW_70);
            	            this_ArrayList_4=ruleArrayList();

            	            state._fsp--;


            	            				current.merge(this_ArrayList_4);
            	            			

            	            				afterParserOrEnumRuleCall();
            	            			

            	            }
            	            break;
            	        case 5 :
            	            // InternalPipelineParser.g:3835:4: this_INT_5= RULE_INT
            	            {
            	            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_70); 

            	            				current.merge(this_INT_5);
            	            			

            	            				newLeafNode(this_INT_5, grammarAccess.getHyphenParametersAccess().getINTTerminalRuleCall_1_4());
            	            			

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt112 >= 1 ) break loop112;
                        EarlyExitException eee =
                            new EarlyExitException(112, input);
                        throw eee;
                }
                cnt112++;
            } while (true);


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
    // $ANTLR end "ruleHyphenParameters"


    // $ANTLR start "entryRuleArrayList"
    // InternalPipelineParser.g:3847:1: entryRuleArrayList returns [String current=null] : iv_ruleArrayList= ruleArrayList EOF ;
    public final String entryRuleArrayList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayList = null;


        try {
            // InternalPipelineParser.g:3847:49: (iv_ruleArrayList= ruleArrayList EOF )
            // InternalPipelineParser.g:3848:2: iv_ruleArrayList= ruleArrayList EOF
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
    // InternalPipelineParser.g:3854:1: ruleArrayList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket (this_StringValue_1= ruleStringValue (kw= Comma this_StringValue_3= ruleStringValue )? )+ kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleArrayList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StringValue_1 = null;

        AntlrDatatypeRuleToken this_StringValue_3 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3860:2: ( (kw= LeftSquareBracket (this_StringValue_1= ruleStringValue (kw= Comma this_StringValue_3= ruleStringValue )? )+ kw= RightSquareBracket ) )
            // InternalPipelineParser.g:3861:2: (kw= LeftSquareBracket (this_StringValue_1= ruleStringValue (kw= Comma this_StringValue_3= ruleStringValue )? )+ kw= RightSquareBracket )
            {
            // InternalPipelineParser.g:3861:2: (kw= LeftSquareBracket (this_StringValue_1= ruleStringValue (kw= Comma this_StringValue_3= ruleStringValue )? )+ kw= RightSquareBracket )
            // InternalPipelineParser.g:3862:3: kw= LeftSquareBracket (this_StringValue_1= ruleStringValue (kw= Comma this_StringValue_3= ruleStringValue )? )+ kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_3); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArrayListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPipelineParser.g:3867:3: (this_StringValue_1= ruleStringValue (kw= Comma this_StringValue_3= ruleStringValue )? )+
            int cnt114=0;
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( ((LA114_0>=RULE_SINGLE_CHAR && LA114_0<=RULE_STRING)||LA114_0==RULE_VERSION) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalPipelineParser.g:3868:4: this_StringValue_1= ruleStringValue (kw= Comma this_StringValue_3= ruleStringValue )?
            	    {

            	    				newCompositeNode(grammarAccess.getArrayListAccess().getStringValueParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_71);
            	    this_StringValue_1=ruleStringValue();

            	    state._fsp--;


            	    				current.merge(this_StringValue_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalPipelineParser.g:3878:4: (kw= Comma this_StringValue_3= ruleStringValue )?
            	    int alt113=2;
            	    int LA113_0 = input.LA(1);

            	    if ( (LA113_0==Comma) ) {
            	        alt113=1;
            	    }
            	    switch (alt113) {
            	        case 1 :
            	            // InternalPipelineParser.g:3879:5: kw= Comma this_StringValue_3= ruleStringValue
            	            {
            	            kw=(Token)match(input,Comma,FOLLOW_3); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getArrayListAccess().getCommaKeyword_1_1_0());
            	            				

            	            					newCompositeNode(grammarAccess.getArrayListAccess().getStringValueParserRuleCall_1_1_1());
            	            				
            	            pushFollow(FOLLOW_72);
            	            this_StringValue_3=ruleStringValue();

            	            state._fsp--;


            	            					current.merge(this_StringValue_3);
            	            				

            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt114 >= 1 ) break loop114;
                        EarlyExitException eee =
                            new EarlyExitException(114, input);
                        throw eee;
                }
                cnt114++;
            } while (true);

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


    // $ANTLR start "entryRuleStringValue"
    // InternalPipelineParser.g:3905:1: entryRuleStringValue returns [String current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final String entryRuleStringValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringValue = null;


        try {
            // InternalPipelineParser.g:3905:51: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalPipelineParser.g:3906:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue.getText(); 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalPipelineParser.g:3912:1: ruleStringValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | this_SINGLE_CHAR_1= RULE_SINGLE_CHAR | this_STRING_2= RULE_STRING | this_VERSION_3= RULE_VERSION ) (this_POSSIBLE_SPECIAL_KEY_4= rulePOSSIBLE_SPECIAL_KEY )? (this_INTV_5= RULE_INTV )? (this_STRING_6= RULE_STRING )? )+ ;
    public final AntlrDatatypeRuleToken ruleStringValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_SINGLE_CHAR_1=null;
        Token this_STRING_2=null;
        Token this_VERSION_3=null;
        Token this_INTV_5=null;
        Token this_STRING_6=null;
        AntlrDatatypeRuleToken this_POSSIBLE_SPECIAL_KEY_4 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3918:2: ( ( (this_ID_0= RULE_ID | this_SINGLE_CHAR_1= RULE_SINGLE_CHAR | this_STRING_2= RULE_STRING | this_VERSION_3= RULE_VERSION ) (this_POSSIBLE_SPECIAL_KEY_4= rulePOSSIBLE_SPECIAL_KEY )? (this_INTV_5= RULE_INTV )? (this_STRING_6= RULE_STRING )? )+ )
            // InternalPipelineParser.g:3919:2: ( (this_ID_0= RULE_ID | this_SINGLE_CHAR_1= RULE_SINGLE_CHAR | this_STRING_2= RULE_STRING | this_VERSION_3= RULE_VERSION ) (this_POSSIBLE_SPECIAL_KEY_4= rulePOSSIBLE_SPECIAL_KEY )? (this_INTV_5= RULE_INTV )? (this_STRING_6= RULE_STRING )? )+
            {
            // InternalPipelineParser.g:3919:2: ( (this_ID_0= RULE_ID | this_SINGLE_CHAR_1= RULE_SINGLE_CHAR | this_STRING_2= RULE_STRING | this_VERSION_3= RULE_VERSION ) (this_POSSIBLE_SPECIAL_KEY_4= rulePOSSIBLE_SPECIAL_KEY )? (this_INTV_5= RULE_INTV )? (this_STRING_6= RULE_STRING )? )+
            int cnt119=0;
            loop119:
            do {
                int alt119=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt119=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt119=1;
                    }
                    break;
                case RULE_SINGLE_CHAR:
                    {
                    alt119=1;
                    }
                    break;
                case RULE_VERSION:
                    {
                    alt119=1;
                    }
                    break;

                }

                switch (alt119) {
            	case 1 :
            	    // InternalPipelineParser.g:3920:3: (this_ID_0= RULE_ID | this_SINGLE_CHAR_1= RULE_SINGLE_CHAR | this_STRING_2= RULE_STRING | this_VERSION_3= RULE_VERSION ) (this_POSSIBLE_SPECIAL_KEY_4= rulePOSSIBLE_SPECIAL_KEY )? (this_INTV_5= RULE_INTV )? (this_STRING_6= RULE_STRING )?
            	    {
            	    // InternalPipelineParser.g:3920:3: (this_ID_0= RULE_ID | this_SINGLE_CHAR_1= RULE_SINGLE_CHAR | this_STRING_2= RULE_STRING | this_VERSION_3= RULE_VERSION )
            	    int alt115=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt115=1;
            	        }
            	        break;
            	    case RULE_SINGLE_CHAR:
            	        {
            	        alt115=2;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        alt115=3;
            	        }
            	        break;
            	    case RULE_VERSION:
            	        {
            	        alt115=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 115, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt115) {
            	        case 1 :
            	            // InternalPipelineParser.g:3921:4: this_ID_0= RULE_ID
            	            {
            	            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_73); 

            	            				current.merge(this_ID_0);
            	            			

            	            				newLeafNode(this_ID_0, grammarAccess.getStringValueAccess().getIDTerminalRuleCall_0_0());
            	            			

            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:3929:4: this_SINGLE_CHAR_1= RULE_SINGLE_CHAR
            	            {
            	            this_SINGLE_CHAR_1=(Token)match(input,RULE_SINGLE_CHAR,FOLLOW_73); 

            	            				current.merge(this_SINGLE_CHAR_1);
            	            			

            	            				newLeafNode(this_SINGLE_CHAR_1, grammarAccess.getStringValueAccess().getSINGLE_CHARTerminalRuleCall_0_1());
            	            			

            	            }
            	            break;
            	        case 3 :
            	            // InternalPipelineParser.g:3937:4: this_STRING_2= RULE_STRING
            	            {
            	            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_73); 

            	            				current.merge(this_STRING_2);
            	            			

            	            				newLeafNode(this_STRING_2, grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall_0_2());
            	            			

            	            }
            	            break;
            	        case 4 :
            	            // InternalPipelineParser.g:3945:4: this_VERSION_3= RULE_VERSION
            	            {
            	            this_VERSION_3=(Token)match(input,RULE_VERSION,FOLLOW_73); 

            	            				current.merge(this_VERSION_3);
            	            			

            	            				newLeafNode(this_VERSION_3, grammarAccess.getStringValueAccess().getVERSIONTerminalRuleCall_0_3());
            	            			

            	            }
            	            break;

            	    }

            	    // InternalPipelineParser.g:3953:3: (this_POSSIBLE_SPECIAL_KEY_4= rulePOSSIBLE_SPECIAL_KEY )?
            	    int alt116=2;
            	    int LA116_0 = input.LA(1);

            	    if ( ((LA116_0>=ExclamationMark && LA116_0<=Asterisk)||(LA116_0>=KW__ && LA116_0<=LeftCurlyBracket)||LA116_0==RightCurlyBracket) ) {
            	        alt116=1;
            	    }
            	    switch (alt116) {
            	        case 1 :
            	            // InternalPipelineParser.g:3954:4: this_POSSIBLE_SPECIAL_KEY_4= rulePOSSIBLE_SPECIAL_KEY
            	            {

            	            				newCompositeNode(grammarAccess.getStringValueAccess().getPOSSIBLE_SPECIAL_KEYParserRuleCall_1());
            	            			
            	            pushFollow(FOLLOW_54);
            	            this_POSSIBLE_SPECIAL_KEY_4=rulePOSSIBLE_SPECIAL_KEY();

            	            state._fsp--;


            	            				current.merge(this_POSSIBLE_SPECIAL_KEY_4);
            	            			

            	            				afterParserOrEnumRuleCall();
            	            			

            	            }
            	            break;

            	    }

            	    // InternalPipelineParser.g:3965:3: (this_INTV_5= RULE_INTV )?
            	    int alt117=2;
            	    int LA117_0 = input.LA(1);

            	    if ( (LA117_0==RULE_INTV) ) {
            	        alt117=1;
            	    }
            	    switch (alt117) {
            	        case 1 :
            	            // InternalPipelineParser.g:3966:4: this_INTV_5= RULE_INTV
            	            {
            	            this_INTV_5=(Token)match(input,RULE_INTV,FOLLOW_74); 

            	            				current.merge(this_INTV_5);
            	            			

            	            				newLeafNode(this_INTV_5, grammarAccess.getStringValueAccess().getINTVTerminalRuleCall_2());
            	            			

            	            }
            	            break;

            	    }

            	    // InternalPipelineParser.g:3974:3: (this_STRING_6= RULE_STRING )?
            	    int alt118=2;
            	    int LA118_0 = input.LA(1);

            	    if ( (LA118_0==RULE_STRING) ) {
            	        alt118=1;
            	    }
            	    switch (alt118) {
            	        case 1 :
            	            // InternalPipelineParser.g:3975:4: this_STRING_6= RULE_STRING
            	            {
            	            this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_74); 

            	            				current.merge(this_STRING_6);
            	            			

            	            				newLeafNode(this_STRING_6, grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall_3());
            	            			

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt119 >= 1 ) break loop119;
                        EarlyExitException eee =
                            new EarlyExitException(119, input);
                        throw eee;
                }
                cnt119++;
            } while (true);


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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRulePOSSIBLE_SPECIAL_KEY"
    // InternalPipelineParser.g:3987:1: entryRulePOSSIBLE_SPECIAL_KEY returns [String current=null] : iv_rulePOSSIBLE_SPECIAL_KEY= rulePOSSIBLE_SPECIAL_KEY EOF ;
    public final String entryRulePOSSIBLE_SPECIAL_KEY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePOSSIBLE_SPECIAL_KEY = null;


        try {
            // InternalPipelineParser.g:3987:60: (iv_rulePOSSIBLE_SPECIAL_KEY= rulePOSSIBLE_SPECIAL_KEY EOF )
            // InternalPipelineParser.g:3988:2: iv_rulePOSSIBLE_SPECIAL_KEY= rulePOSSIBLE_SPECIAL_KEY EOF
            {
             newCompositeNode(grammarAccess.getPOSSIBLE_SPECIAL_KEYRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePOSSIBLE_SPECIAL_KEY=rulePOSSIBLE_SPECIAL_KEY();

            state._fsp--;

             current =iv_rulePOSSIBLE_SPECIAL_KEY.getText(); 
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
    // $ANTLR end "entryRulePOSSIBLE_SPECIAL_KEY"


    // $ANTLR start "rulePOSSIBLE_SPECIAL_KEY"
    // InternalPipelineParser.g:3994:1: rulePOSSIBLE_SPECIAL_KEY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KW__ | kw= LeftCurlyBracket | kw= RightCurlyBracket | kw= Asterisk | kw= ExclamationMark )+ ;
    public final AntlrDatatypeRuleToken rulePOSSIBLE_SPECIAL_KEY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:4000:2: ( (kw= KW__ | kw= LeftCurlyBracket | kw= RightCurlyBracket | kw= Asterisk | kw= ExclamationMark )+ )
            // InternalPipelineParser.g:4001:2: (kw= KW__ | kw= LeftCurlyBracket | kw= RightCurlyBracket | kw= Asterisk | kw= ExclamationMark )+
            {
            // InternalPipelineParser.g:4001:2: (kw= KW__ | kw= LeftCurlyBracket | kw= RightCurlyBracket | kw= Asterisk | kw= ExclamationMark )+
            int cnt120=0;
            loop120:
            do {
                int alt120=6;
                switch ( input.LA(1) ) {
                case KW__:
                    {
                    alt120=1;
                    }
                    break;
                case LeftCurlyBracket:
                    {
                    alt120=2;
                    }
                    break;
                case RightCurlyBracket:
                    {
                    alt120=3;
                    }
                    break;
                case Asterisk:
                    {
                    alt120=4;
                    }
                    break;
                case ExclamationMark:
                    {
                    alt120=5;
                    }
                    break;

                }

                switch (alt120) {
            	case 1 :
            	    // InternalPipelineParser.g:4002:3: kw= KW__
            	    {
            	    kw=(Token)match(input,KW__,FOLLOW_75); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getPOSSIBLE_SPECIAL_KEYAccess().get_Keyword_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:4008:3: kw= LeftCurlyBracket
            	    {
            	    kw=(Token)match(input,LeftCurlyBracket,FOLLOW_75); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getPOSSIBLE_SPECIAL_KEYAccess().getLeftCurlyBracketKeyword_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalPipelineParser.g:4014:3: kw= RightCurlyBracket
            	    {
            	    kw=(Token)match(input,RightCurlyBracket,FOLLOW_75); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getPOSSIBLE_SPECIAL_KEYAccess().getRightCurlyBracketKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalPipelineParser.g:4020:3: kw= Asterisk
            	    {
            	    kw=(Token)match(input,Asterisk,FOLLOW_75); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getPOSSIBLE_SPECIAL_KEYAccess().getAsteriskKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalPipelineParser.g:4026:3: kw= ExclamationMark
            	    {
            	    kw=(Token)match(input,ExclamationMark,FOLLOW_75); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getPOSSIBLE_SPECIAL_KEYAccess().getExclamationMarkKeyword_4());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt120 >= 1 ) break loop120;
                        EarlyExitException eee =
                            new EarlyExitException(120, input);
                        throw eee;
                }
                cnt120++;
            } while (true);


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
    // $ANTLR end "rulePOSSIBLE_SPECIAL_KEY"


    // $ANTLR start "rulePipelineKeyword"
    // InternalPipelineParser.g:4035:1: rulePipelineKeyword returns [Enumerator current=null] : ( (enumLiteral_0= Name ) | (enumLiteral_1= RunName ) | (enumLiteral_2= On ) | (enumLiteral_3= Types ) | (enumLiteral_4= Branches ) | (enumLiteral_5= BranchesIgnore ) | (enumLiteral_6= Push ) | (enumLiteral_7= Pull_request ) | (enumLiteral_8= Path ) | (enumLiteral_9= PathsIgnore ) | (enumLiteral_10= Tags ) | (enumLiteral_11= TagsIgnore ) | (enumLiteral_12= Paths ) | (enumLiteral_13= Schedule ) | (enumLiteral_14= Inputs ) | (enumLiteral_15= Type ) | (enumLiteral_16= Outputs ) | (enumLiteral_17= Secrets ) | (enumLiteral_18= Trigger ) | (enumLiteral_19= Pr ) | (enumLiteral_20= Required ) | (enumLiteral_21= Permissions ) | (enumLiteral_22= Env ) | (enumLiteral_23= Defaults ) | (enumLiteral_24= Concurrency ) | (enumLiteral_25= Needs ) | (enumLiteral_26= If ) | (enumLiteral_27= RunsOn ) | (enumLiteral_28= Environment ) | (enumLiteral_29= Id ) | (enumLiteral_30= Uses ) | (enumLiteral_31= WorkingDirectory ) | (enumLiteral_32= Shell ) | (enumLiteral_33= Args ) | (enumLiteral_34= Entrypoint ) | (enumLiteral_35= ContinueOnError ) | (enumLiteral_36= TimeoutMinutes ) | (enumLiteral_37= Strategy ) | (enumLiteral_38= Matrix ) | (enumLiteral_39= Include ) | (enumLiteral_40= Exclude ) | (enumLiteral_41= FailFast ) | (enumLiteral_42= MaxParallel ) | (enumLiteral_43= Container ) | (enumLiteral_44= Image ) | (enumLiteral_45= Credentials ) | (enumLiteral_46= Ports ) | (enumLiteral_47= Inherit ) | (enumLiteral_48= Pipeline ) | (enumLiteral_49= Extends ) | (enumLiteral_50= Deployment ) | (enumLiteral_51= Canary ) | (enumLiteral_52= Rolling ) | (enumLiteral_53= RunOnce ) | (enumLiteral_54= Template ) | (enumLiteral_55= Resources ) | (enumLiteral_56= Builds ) | (enumLiteral_57= Build ) | (enumLiteral_58= Containers ) | (enumLiteral_59= Packages ) | (enumLiteral_60= Pipelines ) | (enumLiteral_61= Repositories ) | (enumLiteral_62= Webhooks ) | (enumLiteral_63= Filters ) | (enumLiteral_64= Schedules ) | (enumLiteral_65= Cron ) | (enumLiteral_66= DownloadBuild ) | (enumLiteral_67= ReviewApp ) | (enumLiteral_68= Script ) | (enumLiteral_69= Target ) | (enumLiteral_70= SettableVariables ) | (enumLiteral_71= Variables ) | (enumLiteral_72= Group ) | (enumLiteral_73= Workflow_run ) ) ;
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


        	enterRule();

        try {
            // InternalPipelineParser.g:4041:2: ( ( (enumLiteral_0= Name ) | (enumLiteral_1= RunName ) | (enumLiteral_2= On ) | (enumLiteral_3= Types ) | (enumLiteral_4= Branches ) | (enumLiteral_5= BranchesIgnore ) | (enumLiteral_6= Push ) | (enumLiteral_7= Pull_request ) | (enumLiteral_8= Path ) | (enumLiteral_9= PathsIgnore ) | (enumLiteral_10= Tags ) | (enumLiteral_11= TagsIgnore ) | (enumLiteral_12= Paths ) | (enumLiteral_13= Schedule ) | (enumLiteral_14= Inputs ) | (enumLiteral_15= Type ) | (enumLiteral_16= Outputs ) | (enumLiteral_17= Secrets ) | (enumLiteral_18= Trigger ) | (enumLiteral_19= Pr ) | (enumLiteral_20= Required ) | (enumLiteral_21= Permissions ) | (enumLiteral_22= Env ) | (enumLiteral_23= Defaults ) | (enumLiteral_24= Concurrency ) | (enumLiteral_25= Needs ) | (enumLiteral_26= If ) | (enumLiteral_27= RunsOn ) | (enumLiteral_28= Environment ) | (enumLiteral_29= Id ) | (enumLiteral_30= Uses ) | (enumLiteral_31= WorkingDirectory ) | (enumLiteral_32= Shell ) | (enumLiteral_33= Args ) | (enumLiteral_34= Entrypoint ) | (enumLiteral_35= ContinueOnError ) | (enumLiteral_36= TimeoutMinutes ) | (enumLiteral_37= Strategy ) | (enumLiteral_38= Matrix ) | (enumLiteral_39= Include ) | (enumLiteral_40= Exclude ) | (enumLiteral_41= FailFast ) | (enumLiteral_42= MaxParallel ) | (enumLiteral_43= Container ) | (enumLiteral_44= Image ) | (enumLiteral_45= Credentials ) | (enumLiteral_46= Ports ) | (enumLiteral_47= Inherit ) | (enumLiteral_48= Pipeline ) | (enumLiteral_49= Extends ) | (enumLiteral_50= Deployment ) | (enumLiteral_51= Canary ) | (enumLiteral_52= Rolling ) | (enumLiteral_53= RunOnce ) | (enumLiteral_54= Template ) | (enumLiteral_55= Resources ) | (enumLiteral_56= Builds ) | (enumLiteral_57= Build ) | (enumLiteral_58= Containers ) | (enumLiteral_59= Packages ) | (enumLiteral_60= Pipelines ) | (enumLiteral_61= Repositories ) | (enumLiteral_62= Webhooks ) | (enumLiteral_63= Filters ) | (enumLiteral_64= Schedules ) | (enumLiteral_65= Cron ) | (enumLiteral_66= DownloadBuild ) | (enumLiteral_67= ReviewApp ) | (enumLiteral_68= Script ) | (enumLiteral_69= Target ) | (enumLiteral_70= SettableVariables ) | (enumLiteral_71= Variables ) | (enumLiteral_72= Group ) | (enumLiteral_73= Workflow_run ) ) )
            // InternalPipelineParser.g:4042:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= RunName ) | (enumLiteral_2= On ) | (enumLiteral_3= Types ) | (enumLiteral_4= Branches ) | (enumLiteral_5= BranchesIgnore ) | (enumLiteral_6= Push ) | (enumLiteral_7= Pull_request ) | (enumLiteral_8= Path ) | (enumLiteral_9= PathsIgnore ) | (enumLiteral_10= Tags ) | (enumLiteral_11= TagsIgnore ) | (enumLiteral_12= Paths ) | (enumLiteral_13= Schedule ) | (enumLiteral_14= Inputs ) | (enumLiteral_15= Type ) | (enumLiteral_16= Outputs ) | (enumLiteral_17= Secrets ) | (enumLiteral_18= Trigger ) | (enumLiteral_19= Pr ) | (enumLiteral_20= Required ) | (enumLiteral_21= Permissions ) | (enumLiteral_22= Env ) | (enumLiteral_23= Defaults ) | (enumLiteral_24= Concurrency ) | (enumLiteral_25= Needs ) | (enumLiteral_26= If ) | (enumLiteral_27= RunsOn ) | (enumLiteral_28= Environment ) | (enumLiteral_29= Id ) | (enumLiteral_30= Uses ) | (enumLiteral_31= WorkingDirectory ) | (enumLiteral_32= Shell ) | (enumLiteral_33= Args ) | (enumLiteral_34= Entrypoint ) | (enumLiteral_35= ContinueOnError ) | (enumLiteral_36= TimeoutMinutes ) | (enumLiteral_37= Strategy ) | (enumLiteral_38= Matrix ) | (enumLiteral_39= Include ) | (enumLiteral_40= Exclude ) | (enumLiteral_41= FailFast ) | (enumLiteral_42= MaxParallel ) | (enumLiteral_43= Container ) | (enumLiteral_44= Image ) | (enumLiteral_45= Credentials ) | (enumLiteral_46= Ports ) | (enumLiteral_47= Inherit ) | (enumLiteral_48= Pipeline ) | (enumLiteral_49= Extends ) | (enumLiteral_50= Deployment ) | (enumLiteral_51= Canary ) | (enumLiteral_52= Rolling ) | (enumLiteral_53= RunOnce ) | (enumLiteral_54= Template ) | (enumLiteral_55= Resources ) | (enumLiteral_56= Builds ) | (enumLiteral_57= Build ) | (enumLiteral_58= Containers ) | (enumLiteral_59= Packages ) | (enumLiteral_60= Pipelines ) | (enumLiteral_61= Repositories ) | (enumLiteral_62= Webhooks ) | (enumLiteral_63= Filters ) | (enumLiteral_64= Schedules ) | (enumLiteral_65= Cron ) | (enumLiteral_66= DownloadBuild ) | (enumLiteral_67= ReviewApp ) | (enumLiteral_68= Script ) | (enumLiteral_69= Target ) | (enumLiteral_70= SettableVariables ) | (enumLiteral_71= Variables ) | (enumLiteral_72= Group ) | (enumLiteral_73= Workflow_run ) )
            {
            // InternalPipelineParser.g:4042:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= RunName ) | (enumLiteral_2= On ) | (enumLiteral_3= Types ) | (enumLiteral_4= Branches ) | (enumLiteral_5= BranchesIgnore ) | (enumLiteral_6= Push ) | (enumLiteral_7= Pull_request ) | (enumLiteral_8= Path ) | (enumLiteral_9= PathsIgnore ) | (enumLiteral_10= Tags ) | (enumLiteral_11= TagsIgnore ) | (enumLiteral_12= Paths ) | (enumLiteral_13= Schedule ) | (enumLiteral_14= Inputs ) | (enumLiteral_15= Type ) | (enumLiteral_16= Outputs ) | (enumLiteral_17= Secrets ) | (enumLiteral_18= Trigger ) | (enumLiteral_19= Pr ) | (enumLiteral_20= Required ) | (enumLiteral_21= Permissions ) | (enumLiteral_22= Env ) | (enumLiteral_23= Defaults ) | (enumLiteral_24= Concurrency ) | (enumLiteral_25= Needs ) | (enumLiteral_26= If ) | (enumLiteral_27= RunsOn ) | (enumLiteral_28= Environment ) | (enumLiteral_29= Id ) | (enumLiteral_30= Uses ) | (enumLiteral_31= WorkingDirectory ) | (enumLiteral_32= Shell ) | (enumLiteral_33= Args ) | (enumLiteral_34= Entrypoint ) | (enumLiteral_35= ContinueOnError ) | (enumLiteral_36= TimeoutMinutes ) | (enumLiteral_37= Strategy ) | (enumLiteral_38= Matrix ) | (enumLiteral_39= Include ) | (enumLiteral_40= Exclude ) | (enumLiteral_41= FailFast ) | (enumLiteral_42= MaxParallel ) | (enumLiteral_43= Container ) | (enumLiteral_44= Image ) | (enumLiteral_45= Credentials ) | (enumLiteral_46= Ports ) | (enumLiteral_47= Inherit ) | (enumLiteral_48= Pipeline ) | (enumLiteral_49= Extends ) | (enumLiteral_50= Deployment ) | (enumLiteral_51= Canary ) | (enumLiteral_52= Rolling ) | (enumLiteral_53= RunOnce ) | (enumLiteral_54= Template ) | (enumLiteral_55= Resources ) | (enumLiteral_56= Builds ) | (enumLiteral_57= Build ) | (enumLiteral_58= Containers ) | (enumLiteral_59= Packages ) | (enumLiteral_60= Pipelines ) | (enumLiteral_61= Repositories ) | (enumLiteral_62= Webhooks ) | (enumLiteral_63= Filters ) | (enumLiteral_64= Schedules ) | (enumLiteral_65= Cron ) | (enumLiteral_66= DownloadBuild ) | (enumLiteral_67= ReviewApp ) | (enumLiteral_68= Script ) | (enumLiteral_69= Target ) | (enumLiteral_70= SettableVariables ) | (enumLiteral_71= Variables ) | (enumLiteral_72= Group ) | (enumLiteral_73= Workflow_run ) )
            int alt121=74;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt121=1;
                }
                break;
            case RunName:
                {
                alt121=2;
                }
                break;
            case On:
                {
                alt121=3;
                }
                break;
            case Types:
                {
                alt121=4;
                }
                break;
            case Branches:
                {
                alt121=5;
                }
                break;
            case BranchesIgnore:
                {
                alt121=6;
                }
                break;
            case Push:
                {
                alt121=7;
                }
                break;
            case Pull_request:
                {
                alt121=8;
                }
                break;
            case Path:
                {
                alt121=9;
                }
                break;
            case PathsIgnore:
                {
                alt121=10;
                }
                break;
            case Tags:
                {
                alt121=11;
                }
                break;
            case TagsIgnore:
                {
                alt121=12;
                }
                break;
            case Paths:
                {
                alt121=13;
                }
                break;
            case Schedule:
                {
                alt121=14;
                }
                break;
            case Inputs:
                {
                alt121=15;
                }
                break;
            case Type:
                {
                alt121=16;
                }
                break;
            case Outputs:
                {
                alt121=17;
                }
                break;
            case Secrets:
                {
                alt121=18;
                }
                break;
            case Trigger:
                {
                alt121=19;
                }
                break;
            case Pr:
                {
                alt121=20;
                }
                break;
            case Required:
                {
                alt121=21;
                }
                break;
            case Permissions:
                {
                alt121=22;
                }
                break;
            case Env:
                {
                alt121=23;
                }
                break;
            case Defaults:
                {
                alt121=24;
                }
                break;
            case Concurrency:
                {
                alt121=25;
                }
                break;
            case Needs:
                {
                alt121=26;
                }
                break;
            case If:
                {
                alt121=27;
                }
                break;
            case RunsOn:
                {
                alt121=28;
                }
                break;
            case Environment:
                {
                alt121=29;
                }
                break;
            case Id:
                {
                alt121=30;
                }
                break;
            case Uses:
                {
                alt121=31;
                }
                break;
            case WorkingDirectory:
                {
                alt121=32;
                }
                break;
            case Shell:
                {
                alt121=33;
                }
                break;
            case Args:
                {
                alt121=34;
                }
                break;
            case Entrypoint:
                {
                alt121=35;
                }
                break;
            case ContinueOnError:
                {
                alt121=36;
                }
                break;
            case TimeoutMinutes:
                {
                alt121=37;
                }
                break;
            case Strategy:
                {
                alt121=38;
                }
                break;
            case Matrix:
                {
                alt121=39;
                }
                break;
            case Include:
                {
                alt121=40;
                }
                break;
            case Exclude:
                {
                alt121=41;
                }
                break;
            case FailFast:
                {
                alt121=42;
                }
                break;
            case MaxParallel:
                {
                alt121=43;
                }
                break;
            case Container:
                {
                alt121=44;
                }
                break;
            case Image:
                {
                alt121=45;
                }
                break;
            case Credentials:
                {
                alt121=46;
                }
                break;
            case Ports:
                {
                alt121=47;
                }
                break;
            case Inherit:
                {
                alt121=48;
                }
                break;
            case Pipeline:
                {
                alt121=49;
                }
                break;
            case Extends:
                {
                alt121=50;
                }
                break;
            case Deployment:
                {
                alt121=51;
                }
                break;
            case Canary:
                {
                alt121=52;
                }
                break;
            case Rolling:
                {
                alt121=53;
                }
                break;
            case RunOnce:
                {
                alt121=54;
                }
                break;
            case Template:
                {
                alt121=55;
                }
                break;
            case Resources:
                {
                alt121=56;
                }
                break;
            case Builds:
                {
                alt121=57;
                }
                break;
            case Build:
                {
                alt121=58;
                }
                break;
            case Containers:
                {
                alt121=59;
                }
                break;
            case Packages:
                {
                alt121=60;
                }
                break;
            case Pipelines:
                {
                alt121=61;
                }
                break;
            case Repositories:
                {
                alt121=62;
                }
                break;
            case Webhooks:
                {
                alt121=63;
                }
                break;
            case Filters:
                {
                alt121=64;
                }
                break;
            case Schedules:
                {
                alt121=65;
                }
                break;
            case Cron:
                {
                alt121=66;
                }
                break;
            case DownloadBuild:
                {
                alt121=67;
                }
                break;
            case ReviewApp:
                {
                alt121=68;
                }
                break;
            case Script:
                {
                alt121=69;
                }
                break;
            case Target:
                {
                alt121=70;
                }
                break;
            case SettableVariables:
                {
                alt121=71;
                }
                break;
            case Variables:
                {
                alt121=72;
                }
                break;
            case Group:
                {
                alt121=73;
                }
                break;
            case Workflow_run:
                {
                alt121=74;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // InternalPipelineParser.g:4043:3: (enumLiteral_0= Name )
                    {
                    // InternalPipelineParser.g:4043:3: (enumLiteral_0= Name )
                    // InternalPipelineParser.g:4044:4: enumLiteral_0= Name
                    {
                    enumLiteral_0=(Token)match(input,Name,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_NAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPipelineKeywordAccess().getPPL_KW_NAMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:4051:3: (enumLiteral_1= RunName )
                    {
                    // InternalPipelineParser.g:4051:3: (enumLiteral_1= RunName )
                    // InternalPipelineParser.g:4052:4: enumLiteral_1= RunName
                    {
                    enumLiteral_1=(Token)match(input,RunName,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUN_NAMEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUN_NAMEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:4059:3: (enumLiteral_2= On )
                    {
                    // InternalPipelineParser.g:4059:3: (enumLiteral_2= On )
                    // InternalPipelineParser.g:4060:4: enumLiteral_2= On
                    {
                    enumLiteral_2=(Token)match(input,On,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:4067:3: (enumLiteral_3= Types )
                    {
                    // InternalPipelineParser.g:4067:3: (enumLiteral_3= Types )
                    // InternalPipelineParser.g:4068:4: enumLiteral_3= Types
                    {
                    enumLiteral_3=(Token)match(input,Types,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TYPESEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TYPESEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:4075:3: (enumLiteral_4= Branches )
                    {
                    // InternalPipelineParser.g:4075:3: (enumLiteral_4= Branches )
                    // InternalPipelineParser.g:4076:4: enumLiteral_4= Branches
                    {
                    enumLiteral_4=(Token)match(input,Branches,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHESEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHESEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:4083:3: (enumLiteral_5= BranchesIgnore )
                    {
                    // InternalPipelineParser.g:4083:3: (enumLiteral_5= BranchesIgnore )
                    // InternalPipelineParser.g:4084:4: enumLiteral_5= BranchesIgnore
                    {
                    enumLiteral_5=(Token)match(input,BranchesIgnore,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHES_IGNOREEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHES_IGNOREEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:4091:3: (enumLiteral_6= Push )
                    {
                    // InternalPipelineParser.g:4091:3: (enumLiteral_6= Push )
                    // InternalPipelineParser.g:4092:4: enumLiteral_6= Push
                    {
                    enumLiteral_6=(Token)match(input,Push,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PUSHEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PUSHEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalPipelineParser.g:4099:3: (enumLiteral_7= Pull_request )
                    {
                    // InternalPipelineParser.g:4099:3: (enumLiteral_7= Pull_request )
                    // InternalPipelineParser.g:4100:4: enumLiteral_7= Pull_request
                    {
                    enumLiteral_7=(Token)match(input,Pull_request,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PULL_REQEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PULL_REQEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalPipelineParser.g:4107:3: (enumLiteral_8= Path )
                    {
                    // InternalPipelineParser.g:4107:3: (enumLiteral_8= Path )
                    // InternalPipelineParser.g:4108:4: enumLiteral_8= Path
                    {
                    enumLiteral_8=(Token)match(input,Path,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalPipelineParser.g:4115:3: (enumLiteral_9= PathsIgnore )
                    {
                    // InternalPipelineParser.g:4115:3: (enumLiteral_9= PathsIgnore )
                    // InternalPipelineParser.g:4116:4: enumLiteral_9= PathsIgnore
                    {
                    enumLiteral_9=(Token)match(input,PathsIgnore,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATH_IGNEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATH_IGNEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalPipelineParser.g:4123:3: (enumLiteral_10= Tags )
                    {
                    // InternalPipelineParser.g:4123:3: (enumLiteral_10= Tags )
                    // InternalPipelineParser.g:4124:4: enumLiteral_10= Tags
                    {
                    enumLiteral_10=(Token)match(input,Tags,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGSEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGSEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalPipelineParser.g:4131:3: (enumLiteral_11= TagsIgnore )
                    {
                    // InternalPipelineParser.g:4131:3: (enumLiteral_11= TagsIgnore )
                    // InternalPipelineParser.g:4132:4: enumLiteral_11= TagsIgnore
                    {
                    enumLiteral_11=(Token)match(input,TagsIgnore,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGS_IGNOREEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGS_IGNOREEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalPipelineParser.g:4139:3: (enumLiteral_12= Paths )
                    {
                    // InternalPipelineParser.g:4139:3: (enumLiteral_12= Paths )
                    // InternalPipelineParser.g:4140:4: enumLiteral_12= Paths
                    {
                    enumLiteral_12=(Token)match(input,Paths,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHSEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHSEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalPipelineParser.g:4147:3: (enumLiteral_13= Schedule )
                    {
                    // InternalPipelineParser.g:4147:3: (enumLiteral_13= Schedule )
                    // InternalPipelineParser.g:4148:4: enumLiteral_13= Schedule
                    {
                    enumLiteral_13=(Token)match(input,Schedule,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCHEDULEEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCHEDULEEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalPipelineParser.g:4155:3: (enumLiteral_14= Inputs )
                    {
                    // InternalPipelineParser.g:4155:3: (enumLiteral_14= Inputs )
                    // InternalPipelineParser.g:4156:4: enumLiteral_14= Inputs
                    {
                    enumLiteral_14=(Token)match(input,Inputs,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_INPUTSEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getPipelineKeywordAccess().getPPL_KW_INPUTSEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalPipelineParser.g:4163:3: (enumLiteral_15= Type )
                    {
                    // InternalPipelineParser.g:4163:3: (enumLiteral_15= Type )
                    // InternalPipelineParser.g:4164:4: enumLiteral_15= Type
                    {
                    enumLiteral_15=(Token)match(input,Type,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TYPEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TYPEEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalPipelineParser.g:4171:3: (enumLiteral_16= Outputs )
                    {
                    // InternalPipelineParser.g:4171:3: (enumLiteral_16= Outputs )
                    // InternalPipelineParser.g:4172:4: enumLiteral_16= Outputs
                    {
                    enumLiteral_16=(Token)match(input,Outputs,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_OUTPUTSEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getPipelineKeywordAccess().getPPL_KW_OUTPUTSEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalPipelineParser.g:4179:3: (enumLiteral_17= Secrets )
                    {
                    // InternalPipelineParser.g:4179:3: (enumLiteral_17= Secrets )
                    // InternalPipelineParser.g:4180:4: enumLiteral_17= Secrets
                    {
                    enumLiteral_17=(Token)match(input,Secrets,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SECRETSEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SECRETSEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalPipelineParser.g:4187:3: (enumLiteral_18= Trigger )
                    {
                    // InternalPipelineParser.g:4187:3: (enumLiteral_18= Trigger )
                    // InternalPipelineParser.g:4188:4: enumLiteral_18= Trigger
                    {
                    enumLiteral_18=(Token)match(input,Trigger,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TRIGGEREnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TRIGGEREnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalPipelineParser.g:4195:3: (enumLiteral_19= Pr )
                    {
                    // InternalPipelineParser.g:4195:3: (enumLiteral_19= Pr )
                    // InternalPipelineParser.g:4196:4: enumLiteral_19= Pr
                    {
                    enumLiteral_19=(Token)match(input,Pr,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PREnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PREnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalPipelineParser.g:4203:3: (enumLiteral_20= Required )
                    {
                    // InternalPipelineParser.g:4203:3: (enumLiteral_20= Required )
                    // InternalPipelineParser.g:4204:4: enumLiteral_20= Required
                    {
                    enumLiteral_20=(Token)match(input,Required,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_REQUIREDEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getPipelineKeywordAccess().getPPL_KW_REQUIREDEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalPipelineParser.g:4211:3: (enumLiteral_21= Permissions )
                    {
                    // InternalPipelineParser.g:4211:3: (enumLiteral_21= Permissions )
                    // InternalPipelineParser.g:4212:4: enumLiteral_21= Permissions
                    {
                    enumLiteral_21=(Token)match(input,Permissions,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PERMISSIONSEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PERMISSIONSEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalPipelineParser.g:4219:3: (enumLiteral_22= Env )
                    {
                    // InternalPipelineParser.g:4219:3: (enumLiteral_22= Env )
                    // InternalPipelineParser.g:4220:4: enumLiteral_22= Env
                    {
                    enumLiteral_22=(Token)match(input,Env,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalPipelineParser.g:4227:3: (enumLiteral_23= Defaults )
                    {
                    // InternalPipelineParser.g:4227:3: (enumLiteral_23= Defaults )
                    // InternalPipelineParser.g:4228:4: enumLiteral_23= Defaults
                    {
                    enumLiteral_23=(Token)match(input,Defaults,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTSEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTSEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalPipelineParser.g:4235:3: (enumLiteral_24= Concurrency )
                    {
                    // InternalPipelineParser.g:4235:3: (enumLiteral_24= Concurrency )
                    // InternalPipelineParser.g:4236:4: enumLiteral_24= Concurrency
                    {
                    enumLiteral_24=(Token)match(input,Concurrency,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONCURRENCYEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONCURRENCYEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalPipelineParser.g:4243:3: (enumLiteral_25= Needs )
                    {
                    // InternalPipelineParser.g:4243:3: (enumLiteral_25= Needs )
                    // InternalPipelineParser.g:4244:4: enumLiteral_25= Needs
                    {
                    enumLiteral_25=(Token)match(input,Needs,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_NEEDSEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getPipelineKeywordAccess().getPPL_KW_NEEDSEnumLiteralDeclaration_25());
                    			

                    }


                    }
                    break;
                case 27 :
                    // InternalPipelineParser.g:4251:3: (enumLiteral_26= If )
                    {
                    // InternalPipelineParser.g:4251:3: (enumLiteral_26= If )
                    // InternalPipelineParser.g:4252:4: enumLiteral_26= If
                    {
                    enumLiteral_26=(Token)match(input,If,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_IFEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_26, grammarAccess.getPipelineKeywordAccess().getPPL_KW_IFEnumLiteralDeclaration_26());
                    			

                    }


                    }
                    break;
                case 28 :
                    // InternalPipelineParser.g:4259:3: (enumLiteral_27= RunsOn )
                    {
                    // InternalPipelineParser.g:4259:3: (enumLiteral_27= RunsOn )
                    // InternalPipelineParser.g:4260:4: enumLiteral_27= RunsOn
                    {
                    enumLiteral_27=(Token)match(input,RunsOn,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNS_ONEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_27, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNS_ONEnumLiteralDeclaration_27());
                    			

                    }


                    }
                    break;
                case 29 :
                    // InternalPipelineParser.g:4267:3: (enumLiteral_28= Environment )
                    {
                    // InternalPipelineParser.g:4267:3: (enumLiteral_28= Environment )
                    // InternalPipelineParser.g:4268:4: enumLiteral_28= Environment
                    {
                    enumLiteral_28=(Token)match(input,Environment,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVIRONMENTEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_28, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVIRONMENTEnumLiteralDeclaration_28());
                    			

                    }


                    }
                    break;
                case 30 :
                    // InternalPipelineParser.g:4275:3: (enumLiteral_29= Id )
                    {
                    // InternalPipelineParser.g:4275:3: (enumLiteral_29= Id )
                    // InternalPipelineParser.g:4276:4: enumLiteral_29= Id
                    {
                    enumLiteral_29=(Token)match(input,Id,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_IDEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_29, grammarAccess.getPipelineKeywordAccess().getPPL_KW_IDEnumLiteralDeclaration_29());
                    			

                    }


                    }
                    break;
                case 31 :
                    // InternalPipelineParser.g:4283:3: (enumLiteral_30= Uses )
                    {
                    // InternalPipelineParser.g:4283:3: (enumLiteral_30= Uses )
                    // InternalPipelineParser.g:4284:4: enumLiteral_30= Uses
                    {
                    enumLiteral_30=(Token)match(input,Uses,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_USESEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_30, grammarAccess.getPipelineKeywordAccess().getPPL_KW_USESEnumLiteralDeclaration_30());
                    			

                    }


                    }
                    break;
                case 32 :
                    // InternalPipelineParser.g:4291:3: (enumLiteral_31= WorkingDirectory )
                    {
                    // InternalPipelineParser.g:4291:3: (enumLiteral_31= WorkingDirectory )
                    // InternalPipelineParser.g:4292:4: enumLiteral_31= WorkingDirectory
                    {
                    enumLiteral_31=(Token)match(input,WorkingDirectory,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKING_DIRECTORYEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_31, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKING_DIRECTORYEnumLiteralDeclaration_31());
                    			

                    }


                    }
                    break;
                case 33 :
                    // InternalPipelineParser.g:4299:3: (enumLiteral_32= Shell )
                    {
                    // InternalPipelineParser.g:4299:3: (enumLiteral_32= Shell )
                    // InternalPipelineParser.g:4300:4: enumLiteral_32= Shell
                    {
                    enumLiteral_32=(Token)match(input,Shell,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SHELLEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_32, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SHELLEnumLiteralDeclaration_32());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalPipelineParser.g:4307:3: (enumLiteral_33= Args )
                    {
                    // InternalPipelineParser.g:4307:3: (enumLiteral_33= Args )
                    // InternalPipelineParser.g:4308:4: enumLiteral_33= Args
                    {
                    enumLiteral_33=(Token)match(input,Args,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ARGSEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_33, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ARGSEnumLiteralDeclaration_33());
                    			

                    }


                    }
                    break;
                case 35 :
                    // InternalPipelineParser.g:4315:3: (enumLiteral_34= Entrypoint )
                    {
                    // InternalPipelineParser.g:4315:3: (enumLiteral_34= Entrypoint )
                    // InternalPipelineParser.g:4316:4: enumLiteral_34= Entrypoint
                    {
                    enumLiteral_34=(Token)match(input,Entrypoint,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENTRYPOINTEnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_34, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENTRYPOINTEnumLiteralDeclaration_34());
                    			

                    }


                    }
                    break;
                case 36 :
                    // InternalPipelineParser.g:4323:3: (enumLiteral_35= ContinueOnError )
                    {
                    // InternalPipelineParser.g:4323:3: (enumLiteral_35= ContinueOnError )
                    // InternalPipelineParser.g:4324:4: enumLiteral_35= ContinueOnError
                    {
                    enumLiteral_35=(Token)match(input,ContinueOnError,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTINUE_ON_ERROREnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_35, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTINUE_ON_ERROREnumLiteralDeclaration_35());
                    			

                    }


                    }
                    break;
                case 37 :
                    // InternalPipelineParser.g:4331:3: (enumLiteral_36= TimeoutMinutes )
                    {
                    // InternalPipelineParser.g:4331:3: (enumLiteral_36= TimeoutMinutes )
                    // InternalPipelineParser.g:4332:4: enumLiteral_36= TimeoutMinutes
                    {
                    enumLiteral_36=(Token)match(input,TimeoutMinutes,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUT_MINUTESEnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_36, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUT_MINUTESEnumLiteralDeclaration_36());
                    			

                    }


                    }
                    break;
                case 38 :
                    // InternalPipelineParser.g:4339:3: (enumLiteral_37= Strategy )
                    {
                    // InternalPipelineParser.g:4339:3: (enumLiteral_37= Strategy )
                    // InternalPipelineParser.g:4340:4: enumLiteral_37= Strategy
                    {
                    enumLiteral_37=(Token)match(input,Strategy,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STRATEGYEnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_37, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STRATEGYEnumLiteralDeclaration_37());
                    			

                    }


                    }
                    break;
                case 39 :
                    // InternalPipelineParser.g:4347:3: (enumLiteral_38= Matrix )
                    {
                    // InternalPipelineParser.g:4347:3: (enumLiteral_38= Matrix )
                    // InternalPipelineParser.g:4348:4: enumLiteral_38= Matrix
                    {
                    enumLiteral_38=(Token)match(input,Matrix,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_MATRIXEnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_38, grammarAccess.getPipelineKeywordAccess().getPPL_KW_MATRIXEnumLiteralDeclaration_38());
                    			

                    }


                    }
                    break;
                case 40 :
                    // InternalPipelineParser.g:4355:3: (enumLiteral_39= Include )
                    {
                    // InternalPipelineParser.g:4355:3: (enumLiteral_39= Include )
                    // InternalPipelineParser.g:4356:4: enumLiteral_39= Include
                    {
                    enumLiteral_39=(Token)match(input,Include,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_INCLUDEEnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_39, grammarAccess.getPipelineKeywordAccess().getPPL_KW_INCLUDEEnumLiteralDeclaration_39());
                    			

                    }


                    }
                    break;
                case 41 :
                    // InternalPipelineParser.g:4363:3: (enumLiteral_40= Exclude )
                    {
                    // InternalPipelineParser.g:4363:3: (enumLiteral_40= Exclude )
                    // InternalPipelineParser.g:4364:4: enumLiteral_40= Exclude
                    {
                    enumLiteral_40=(Token)match(input,Exclude,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXCLUDEEnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_40, grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXCLUDEEnumLiteralDeclaration_40());
                    			

                    }


                    }
                    break;
                case 42 :
                    // InternalPipelineParser.g:4371:3: (enumLiteral_41= FailFast )
                    {
                    // InternalPipelineParser.g:4371:3: (enumLiteral_41= FailFast )
                    // InternalPipelineParser.g:4372:4: enumLiteral_41= FailFast
                    {
                    enumLiteral_41=(Token)match(input,FailFast,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_FAIL_FASTEnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_41, grammarAccess.getPipelineKeywordAccess().getPPL_KW_FAIL_FASTEnumLiteralDeclaration_41());
                    			

                    }


                    }
                    break;
                case 43 :
                    // InternalPipelineParser.g:4379:3: (enumLiteral_42= MaxParallel )
                    {
                    // InternalPipelineParser.g:4379:3: (enumLiteral_42= MaxParallel )
                    // InternalPipelineParser.g:4380:4: enumLiteral_42= MaxParallel
                    {
                    enumLiteral_42=(Token)match(input,MaxParallel,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_MAX_PARALLELEnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_42, grammarAccess.getPipelineKeywordAccess().getPPL_KW_MAX_PARALLELEnumLiteralDeclaration_42());
                    			

                    }


                    }
                    break;
                case 44 :
                    // InternalPipelineParser.g:4387:3: (enumLiteral_43= Container )
                    {
                    // InternalPipelineParser.g:4387:3: (enumLiteral_43= Container )
                    // InternalPipelineParser.g:4388:4: enumLiteral_43= Container
                    {
                    enumLiteral_43=(Token)match(input,Container,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINEREnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_43, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINEREnumLiteralDeclaration_43());
                    			

                    }


                    }
                    break;
                case 45 :
                    // InternalPipelineParser.g:4395:3: (enumLiteral_44= Image )
                    {
                    // InternalPipelineParser.g:4395:3: (enumLiteral_44= Image )
                    // InternalPipelineParser.g:4396:4: enumLiteral_44= Image
                    {
                    enumLiteral_44=(Token)match(input,Image,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_IMAGEEnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_44, grammarAccess.getPipelineKeywordAccess().getPPL_KW_IMAGEEnumLiteralDeclaration_44());
                    			

                    }


                    }
                    break;
                case 46 :
                    // InternalPipelineParser.g:4403:3: (enumLiteral_45= Credentials )
                    {
                    // InternalPipelineParser.g:4403:3: (enumLiteral_45= Credentials )
                    // InternalPipelineParser.g:4404:4: enumLiteral_45= Credentials
                    {
                    enumLiteral_45=(Token)match(input,Credentials,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CREDENTIALSEnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_45, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CREDENTIALSEnumLiteralDeclaration_45());
                    			

                    }


                    }
                    break;
                case 47 :
                    // InternalPipelineParser.g:4411:3: (enumLiteral_46= Ports )
                    {
                    // InternalPipelineParser.g:4411:3: (enumLiteral_46= Ports )
                    // InternalPipelineParser.g:4412:4: enumLiteral_46= Ports
                    {
                    enumLiteral_46=(Token)match(input,Ports,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PORTSEnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_46, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PORTSEnumLiteralDeclaration_46());
                    			

                    }


                    }
                    break;
                case 48 :
                    // InternalPipelineParser.g:4419:3: (enumLiteral_47= Inherit )
                    {
                    // InternalPipelineParser.g:4419:3: (enumLiteral_47= Inherit )
                    // InternalPipelineParser.g:4420:4: enumLiteral_47= Inherit
                    {
                    enumLiteral_47=(Token)match(input,Inherit,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_INHERITEnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_47, grammarAccess.getPipelineKeywordAccess().getPPL_KW_INHERITEnumLiteralDeclaration_47());
                    			

                    }


                    }
                    break;
                case 49 :
                    // InternalPipelineParser.g:4427:3: (enumLiteral_48= Pipeline )
                    {
                    // InternalPipelineParser.g:4427:3: (enumLiteral_48= Pipeline )
                    // InternalPipelineParser.g:4428:4: enumLiteral_48= Pipeline
                    {
                    enumLiteral_48=(Token)match(input,Pipeline,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINEEnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_48, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINEEnumLiteralDeclaration_48());
                    			

                    }


                    }
                    break;
                case 50 :
                    // InternalPipelineParser.g:4435:3: (enumLiteral_49= Extends )
                    {
                    // InternalPipelineParser.g:4435:3: (enumLiteral_49= Extends )
                    // InternalPipelineParser.g:4436:4: enumLiteral_49= Extends
                    {
                    enumLiteral_49=(Token)match(input,Extends,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXTENDSEnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_49, grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXTENDSEnumLiteralDeclaration_49());
                    			

                    }


                    }
                    break;
                case 51 :
                    // InternalPipelineParser.g:4443:3: (enumLiteral_50= Deployment )
                    {
                    // InternalPipelineParser.g:4443:3: (enumLiteral_50= Deployment )
                    // InternalPipelineParser.g:4444:4: enumLiteral_50= Deployment
                    {
                    enumLiteral_50=(Token)match(input,Deployment,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPLOYMENTEnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_50, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPLOYMENTEnumLiteralDeclaration_50());
                    			

                    }


                    }
                    break;
                case 52 :
                    // InternalPipelineParser.g:4451:3: (enumLiteral_51= Canary )
                    {
                    // InternalPipelineParser.g:4451:3: (enumLiteral_51= Canary )
                    // InternalPipelineParser.g:4452:4: enumLiteral_51= Canary
                    {
                    enumLiteral_51=(Token)match(input,Canary,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CANARYEnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_51, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CANARYEnumLiteralDeclaration_51());
                    			

                    }


                    }
                    break;
                case 53 :
                    // InternalPipelineParser.g:4459:3: (enumLiteral_52= Rolling )
                    {
                    // InternalPipelineParser.g:4459:3: (enumLiteral_52= Rolling )
                    // InternalPipelineParser.g:4460:4: enumLiteral_52= Rolling
                    {
                    enumLiteral_52=(Token)match(input,Rolling,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ROLLINGEnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_52, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ROLLINGEnumLiteralDeclaration_52());
                    			

                    }


                    }
                    break;
                case 54 :
                    // InternalPipelineParser.g:4467:3: (enumLiteral_53= RunOnce )
                    {
                    // InternalPipelineParser.g:4467:3: (enumLiteral_53= RunOnce )
                    // InternalPipelineParser.g:4468:4: enumLiteral_53= RunOnce
                    {
                    enumLiteral_53=(Token)match(input,RunOnce,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNONCEEnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_53, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNONCEEnumLiteralDeclaration_53());
                    			

                    }


                    }
                    break;
                case 55 :
                    // InternalPipelineParser.g:4475:3: (enumLiteral_54= Template )
                    {
                    // InternalPipelineParser.g:4475:3: (enumLiteral_54= Template )
                    // InternalPipelineParser.g:4476:4: enumLiteral_54= Template
                    {
                    enumLiteral_54=(Token)match(input,Template,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TEMPLATEEnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_54, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TEMPLATEEnumLiteralDeclaration_54());
                    			

                    }


                    }
                    break;
                case 56 :
                    // InternalPipelineParser.g:4483:3: (enumLiteral_55= Resources )
                    {
                    // InternalPipelineParser.g:4483:3: (enumLiteral_55= Resources )
                    // InternalPipelineParser.g:4484:4: enumLiteral_55= Resources
                    {
                    enumLiteral_55=(Token)match(input,Resources,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCESEnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_55, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCESEnumLiteralDeclaration_55());
                    			

                    }


                    }
                    break;
                case 57 :
                    // InternalPipelineParser.g:4491:3: (enumLiteral_56= Builds )
                    {
                    // InternalPipelineParser.g:4491:3: (enumLiteral_56= Builds )
                    // InternalPipelineParser.g:4492:4: enumLiteral_56= Builds
                    {
                    enumLiteral_56=(Token)match(input,Builds,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_BUILDSEnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_56, grammarAccess.getPipelineKeywordAccess().getPPL_KW_BUILDSEnumLiteralDeclaration_56());
                    			

                    }


                    }
                    break;
                case 58 :
                    // InternalPipelineParser.g:4499:3: (enumLiteral_57= Build )
                    {
                    // InternalPipelineParser.g:4499:3: (enumLiteral_57= Build )
                    // InternalPipelineParser.g:4500:4: enumLiteral_57= Build
                    {
                    enumLiteral_57=(Token)match(input,Build,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_BUILDEnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_57, grammarAccess.getPipelineKeywordAccess().getPPL_KW_BUILDEnumLiteralDeclaration_57());
                    			

                    }


                    }
                    break;
                case 59 :
                    // InternalPipelineParser.g:4507:3: (enumLiteral_58= Containers )
                    {
                    // InternalPipelineParser.g:4507:3: (enumLiteral_58= Containers )
                    // InternalPipelineParser.g:4508:4: enumLiteral_58= Containers
                    {
                    enumLiteral_58=(Token)match(input,Containers,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINERSEnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_58, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINERSEnumLiteralDeclaration_58());
                    			

                    }


                    }
                    break;
                case 60 :
                    // InternalPipelineParser.g:4515:3: (enumLiteral_59= Packages )
                    {
                    // InternalPipelineParser.g:4515:3: (enumLiteral_59= Packages )
                    // InternalPipelineParser.g:4516:4: enumLiteral_59= Packages
                    {
                    enumLiteral_59=(Token)match(input,Packages,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PACKAGESEnumLiteralDeclaration_59().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_59, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PACKAGESEnumLiteralDeclaration_59());
                    			

                    }


                    }
                    break;
                case 61 :
                    // InternalPipelineParser.g:4523:3: (enumLiteral_60= Pipelines )
                    {
                    // InternalPipelineParser.g:4523:3: (enumLiteral_60= Pipelines )
                    // InternalPipelineParser.g:4524:4: enumLiteral_60= Pipelines
                    {
                    enumLiteral_60=(Token)match(input,Pipelines,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINESEnumLiteralDeclaration_60().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_60, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINESEnumLiteralDeclaration_60());
                    			

                    }


                    }
                    break;
                case 62 :
                    // InternalPipelineParser.g:4531:3: (enumLiteral_61= Repositories )
                    {
                    // InternalPipelineParser.g:4531:3: (enumLiteral_61= Repositories )
                    // InternalPipelineParser.g:4532:4: enumLiteral_61= Repositories
                    {
                    enumLiteral_61=(Token)match(input,Repositories,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_REPOSITORIESEnumLiteralDeclaration_61().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_61, grammarAccess.getPipelineKeywordAccess().getPPL_KW_REPOSITORIESEnumLiteralDeclaration_61());
                    			

                    }


                    }
                    break;
                case 63 :
                    // InternalPipelineParser.g:4539:3: (enumLiteral_62= Webhooks )
                    {
                    // InternalPipelineParser.g:4539:3: (enumLiteral_62= Webhooks )
                    // InternalPipelineParser.g:4540:4: enumLiteral_62= Webhooks
                    {
                    enumLiteral_62=(Token)match(input,Webhooks,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WEBHOOKSEnumLiteralDeclaration_62().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_62, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WEBHOOKSEnumLiteralDeclaration_62());
                    			

                    }


                    }
                    break;
                case 64 :
                    // InternalPipelineParser.g:4547:3: (enumLiteral_63= Filters )
                    {
                    // InternalPipelineParser.g:4547:3: (enumLiteral_63= Filters )
                    // InternalPipelineParser.g:4548:4: enumLiteral_63= Filters
                    {
                    enumLiteral_63=(Token)match(input,Filters,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_FILTERSEnumLiteralDeclaration_63().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_63, grammarAccess.getPipelineKeywordAccess().getPPL_KW_FILTERSEnumLiteralDeclaration_63());
                    			

                    }


                    }
                    break;
                case 65 :
                    // InternalPipelineParser.g:4555:3: (enumLiteral_64= Schedules )
                    {
                    // InternalPipelineParser.g:4555:3: (enumLiteral_64= Schedules )
                    // InternalPipelineParser.g:4556:4: enumLiteral_64= Schedules
                    {
                    enumLiteral_64=(Token)match(input,Schedules,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCHEDULESEnumLiteralDeclaration_64().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_64, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCHEDULESEnumLiteralDeclaration_64());
                    			

                    }


                    }
                    break;
                case 66 :
                    // InternalPipelineParser.g:4563:3: (enumLiteral_65= Cron )
                    {
                    // InternalPipelineParser.g:4563:3: (enumLiteral_65= Cron )
                    // InternalPipelineParser.g:4564:4: enumLiteral_65= Cron
                    {
                    enumLiteral_65=(Token)match(input,Cron,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CRONEnumLiteralDeclaration_65().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_65, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CRONEnumLiteralDeclaration_65());
                    			

                    }


                    }
                    break;
                case 67 :
                    // InternalPipelineParser.g:4571:3: (enumLiteral_66= DownloadBuild )
                    {
                    // InternalPipelineParser.g:4571:3: (enumLiteral_66= DownloadBuild )
                    // InternalPipelineParser.g:4572:4: enumLiteral_66= DownloadBuild
                    {
                    enumLiteral_66=(Token)match(input,DownloadBuild,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DOWNLOADBUILDEnumLiteralDeclaration_66().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_66, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DOWNLOADBUILDEnumLiteralDeclaration_66());
                    			

                    }


                    }
                    break;
                case 68 :
                    // InternalPipelineParser.g:4579:3: (enumLiteral_67= ReviewApp )
                    {
                    // InternalPipelineParser.g:4579:3: (enumLiteral_67= ReviewApp )
                    // InternalPipelineParser.g:4580:4: enumLiteral_67= ReviewApp
                    {
                    enumLiteral_67=(Token)match(input,ReviewApp,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_REVIEWAPPEnumLiteralDeclaration_67().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_67, grammarAccess.getPipelineKeywordAccess().getPPL_KW_REVIEWAPPEnumLiteralDeclaration_67());
                    			

                    }


                    }
                    break;
                case 69 :
                    // InternalPipelineParser.g:4587:3: (enumLiteral_68= Script )
                    {
                    // InternalPipelineParser.g:4587:3: (enumLiteral_68= Script )
                    // InternalPipelineParser.g:4588:4: enumLiteral_68= Script
                    {
                    enumLiteral_68=(Token)match(input,Script,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCRIPTEnumLiteralDeclaration_68().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_68, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCRIPTEnumLiteralDeclaration_68());
                    			

                    }


                    }
                    break;
                case 70 :
                    // InternalPipelineParser.g:4595:3: (enumLiteral_69= Target )
                    {
                    // InternalPipelineParser.g:4595:3: (enumLiteral_69= Target )
                    // InternalPipelineParser.g:4596:4: enumLiteral_69= Target
                    {
                    enumLiteral_69=(Token)match(input,Target,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TARGETEnumLiteralDeclaration_69().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_69, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TARGETEnumLiteralDeclaration_69());
                    			

                    }


                    }
                    break;
                case 71 :
                    // InternalPipelineParser.g:4603:3: (enumLiteral_70= SettableVariables )
                    {
                    // InternalPipelineParser.g:4603:3: (enumLiteral_70= SettableVariables )
                    // InternalPipelineParser.g:4604:4: enumLiteral_70= SettableVariables
                    {
                    enumLiteral_70=(Token)match(input,SettableVariables,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SETTABLEVARIABLESEnumLiteralDeclaration_70().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_70, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SETTABLEVARIABLESEnumLiteralDeclaration_70());
                    			

                    }


                    }
                    break;
                case 72 :
                    // InternalPipelineParser.g:4611:3: (enumLiteral_71= Variables )
                    {
                    // InternalPipelineParser.g:4611:3: (enumLiteral_71= Variables )
                    // InternalPipelineParser.g:4612:4: enumLiteral_71= Variables
                    {
                    enumLiteral_71=(Token)match(input,Variables,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_VARIABLESEnumLiteralDeclaration_71().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_71, grammarAccess.getPipelineKeywordAccess().getPPL_KW_VARIABLESEnumLiteralDeclaration_71());
                    			

                    }


                    }
                    break;
                case 73 :
                    // InternalPipelineParser.g:4619:3: (enumLiteral_72= Group )
                    {
                    // InternalPipelineParser.g:4619:3: (enumLiteral_72= Group )
                    // InternalPipelineParser.g:4620:4: enumLiteral_72= Group
                    {
                    enumLiteral_72=(Token)match(input,Group,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_GROUPEnumLiteralDeclaration_72().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_72, grammarAccess.getPipelineKeywordAccess().getPPL_KW_GROUPEnumLiteralDeclaration_72());
                    			

                    }


                    }
                    break;
                case 74 :
                    // InternalPipelineParser.g:4627:3: (enumLiteral_73= Workflow_run )
                    {
                    // InternalPipelineParser.g:4627:3: (enumLiteral_73= Workflow_run )
                    // InternalPipelineParser.g:4628:4: enumLiteral_73= Workflow_run
                    {
                    enumLiteral_73=(Token)match(input,Workflow_run,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WF_RUNEnumLiteralDeclaration_73().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_73, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WF_RUNEnumLiteralDeclaration_73());
                    			

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


    // $ANTLR start "rulePermission"
    // InternalPipelineParser.g:4638:1: rulePermission returns [Enumerator current=null] : ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) ) ;
    public final Enumerator rulePermission() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:4644:2: ( ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) ) )
            // InternalPipelineParser.g:4645:2: ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) )
            {
            // InternalPipelineParser.g:4645:2: ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==ReadAll) ) {
                alt122=1;
            }
            else if ( (LA122_0==WriteAll) ) {
                alt122=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // InternalPipelineParser.g:4646:3: (enumLiteral_0= ReadAll )
                    {
                    // InternalPipelineParser.g:4646:3: (enumLiteral_0= ReadAll )
                    // InternalPipelineParser.g:4647:4: enumLiteral_0= ReadAll
                    {
                    enumLiteral_0=(Token)match(input,ReadAll,FOLLOW_2); 

                    				current = grammarAccess.getPermissionAccess().getREAD_ALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPermissionAccess().getREAD_ALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:4654:3: (enumLiteral_1= WriteAll )
                    {
                    // InternalPipelineParser.g:4654:3: (enumLiteral_1= WriteAll )
                    // InternalPipelineParser.g:4655:4: enumLiteral_1= WriteAll
                    {
                    enumLiteral_1=(Token)match(input,WriteAll,FOLLOW_2); 

                    				current = grammarAccess.getPermissionAccess().getWRITE_ALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPermissionAccess().getWRITE_ALLEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "rulePermission"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA1 dfa1 = new DFA1(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA105 dfa105 = new DFA105(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\4\20\0\7\uffff";
    static final String dfa_3s = "\1\u008b\20\0\7\uffff";
    static final String dfa_4s = "\21\uffff\1\6\1\7\1\1\1\2\1\3\1\4\1\5";
    static final String dfa_5s = "\1\7\1\13\1\15\1\1\1\16\1\12\1\10\1\17\1\5\1\3\1\0\1\11\1\4\1\6\1\20\1\2\1\14\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\20\13\21\1\17\1\21\1\uffff\3\21\1\uffff\3\21\1\uffff\1\4\1\uffff\1\21\1\uffff\2\21\1\7\1\21\1\10\1\5\1\21\1\uffff\1\16\4\uffff\3\21\1\15\4\21\3\uffff\5\21\1\11\1\21\2\uffff\5\21\1\uffff\2\21\1\12\1\uffff\3\21\1\1\1\21\1\uffff\7\21\2\uffff\2\21\1\uffff\1\21\1\2\1\3\1\21\1\6\1\21\1\uffff\1\13\1\21\1\uffff\2\21\1\uffff\1\21\2\uffff\4\21\15\uffff\2\21\14\uffff\1\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 79:6: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_4= RunName ( (lv_run_name_5_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= Shell ( (lv_default_shell_for_all_jobs_12_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= WorkingDirectory ( (lv_default_wd_for_all_jobs_14_0= ruleStringValue ) ) ) ) ) ) )* ) ) ) this_END_15= RULE_END this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_18= Concurrency this_BEGIN_19= RULE_BEGIN (otherlv_20= Group ( ( (lv_group_21_1= ruleStringValue | lv_group_21_2= RULE_EXPRESSION ) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= CancelInProgress ( ( (lv_cancelProgress_23_1= RULE_ID | lv_cancelProgress_23_2= ruleStringValue | lv_cancelProgress_23_3= RULE_EXPRESSION ) ) ) ) this_END_24= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= On ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )? (this_BEGIN_32= RULE_BEGIN ( (lv_triggers_33_0= ruleEvent ) )* this_END_34= RULE_END )? )? ( (lv_triggers_35_0= ruleEvent ) )* ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 0) ) {s = 19;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_15 = input.LA(1);

                         
                        int index12_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 4) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_12 = input.LA(1);

                         
                        int index12_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_13 = input.LA(1);

                         
                        int index12_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 2) ) {s = 21;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_13);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_0 = input.LA(1);

                         
                        int index12_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_0==Stages) ) {s = 1;}

                        else if ( (LA12_0==Jobs) ) {s = 2;}

                        else if ( LA12_0 == Name && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 3;}

                        else if ( LA12_0 == Parameters && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 4;}

                        else if ( LA12_0 == Variables && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 5;}

                        else if ( LA12_0 == Pool && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 6;}

                        else if ( LA12_0 == Resources && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 7;}

                        else if ( LA12_0 == Schedules && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 8;}

                        else if ( LA12_0 == Options && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 9;}

                        else if ( LA12_0 == Docker && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 10;}

                        else if ( LA12_0 == Size && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 11;}

                        else if ( LA12_0 == RULE_END && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 12;}

                        else if ( LA12_0 == RunName && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 13;}

                        else if ( LA12_0 == Defaults && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 14;}

                        else if ( LA12_0 == Concurrency && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 15;}

                        else if ( LA12_0 == CancelInProgress && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) ) {s = 16;}

                        else if ( ( LA12_0 >= ContinueOnError && LA12_0 <= Workflow_run || LA12_0 == Credentials || LA12_0 >= Environment && LA12_0 <= TagsIgnore || LA12_0 >= Containers && LA12_0 <= Entrypoint || LA12_0 == Container || LA12_0 >= FailFast && LA12_0 <= Pipelines || LA12_0 == ReviewApp || LA12_0 == Branches || LA12_0 >= Packages && LA12_0 <= Required || LA12_0 >= Schedule && LA12_0 <= Webhooks || LA12_0 >= Exclude && LA12_0 <= Inherit || LA12_0 == Outputs || LA12_0 >= Rolling && LA12_0 <= Trigger || LA12_0 >= Builds && LA12_0 <= Canary || LA12_0 >= Inputs && LA12_0 <= Script || LA12_0 == Target || LA12_0 >= Build && LA12_0 <= Shell || LA12_0 >= Types && LA12_0 <= Args || LA12_0 == Cron || LA12_0 == Path || LA12_0 == Push || LA12_0 == Tags || LA12_0 >= Type && LA12_0 <= Uses || LA12_0 == Env || LA12_0 >= Id && LA12_0 <= Pr || LA12_0 >= RULE_ID && LA12_0 <= RULE_STRING ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_0);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_11 = input.LA(1);

                         
                        int index12_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_0()) ) {s = 18;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_16 = input.LA(1);

                         
                        int index12_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 4) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_16);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_0()) ) {s = 18;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 1) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_14 = input.LA(1);

                         
                        int index12_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 3) ) {s = 22;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_0(), 5) ) {s = 17;}

                         
                        input.seek(index12_14);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\4\1\uffff\11\0\1\uffff";
    static final String dfa_9s = "\1\u008b\1\uffff\11\0\1\uffff";
    static final String dfa_10s = "\1\uffff\1\2\11\uffff\1\1";
    static final String dfa_11s = "\2\uffff\1\3\1\6\1\2\1\1\1\7\1\10\1\4\1\5\1\0\1\uffff}>";
    static final String[] dfa_12s = {
            "\16\1\1\uffff\3\1\1\uffff\3\1\1\uffff\1\2\1\uffff\1\1\1\uffff\2\1\1\5\1\1\1\6\1\3\1\1\1\uffff\1\1\4\uffff\10\1\3\uffff\5\1\1\7\1\1\2\uffff\5\1\1\uffff\2\1\1\10\1\uffff\5\1\1\uffff\7\1\2\uffff\2\1\1\uffff\4\1\1\4\1\1\1\uffff\1\11\1\1\1\uffff\2\1\1\uffff\1\1\2\uffff\4\1\15\uffff\2\1\14\uffff\1\12",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 119:9: ({...}? => ( (lv_pipelineConfigurations_3_0= ruleConfiguration ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\117\uffff";
    static final String dfa_14s = "\1\4\116\uffff";
    static final String dfa_15s = "\1\u008b\116\uffff";
    static final String dfa_16s = "\1\uffff\114\1\1\2\1\3";
    static final String dfa_17s = "\117\uffff}>";
    static final String[] dfa_18s = {
            "\1\116\1\46\1\111\1\42\1\10\1\47\1\105\1\55\1\14\1\12\1\100\1\114\1\33\1\60\1\uffff\1\37\1\30\1\16\1\uffff\1\75\1\65\1\45\1\uffff\1\116\1\uffff\1\56\1\uffff\1\54\1\77\1\72\1\106\1\103\1\112\1\7\1\uffff\1\32\4\uffff\1\76\1\63\1\27\1\4\1\20\1\50\1\71\1\101\3\uffff\1\53\1\64\1\102\1\52\1\62\1\116\1\23\2\uffff\1\67\1\70\1\36\1\24\1\25\1\uffff\1\73\1\66\1\116\1\uffff\1\21\1\51\1\107\1\116\1\110\1\uffff\1\74\1\113\1\57\1\34\1\17\1\61\1\43\2\uffff\1\6\1\44\1\uffff\1\104\1\116\1\3\1\13\1\116\1\11\1\uffff\1\116\1\15\1\uffff\1\22\1\41\1\uffff\1\31\2\uffff\1\40\1\35\1\5\1\26\6\uffff\1\115\6\uffff\1\1\1\2\13\uffff\2\116",
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

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "460:10: ( ( (lv_triggers_26_0= ruleEvent ) ) | (otherlv_27= LeftSquareBracket ( (lv_triggers_28_0= ruleEvent ) ) (otherlv_29= Comma ( (lv_triggers_30_0= ruleEvent ) ) )* otherlv_31= RightSquareBracket ) )?";
        }
    }
    static final String dfa_19s = "\116\uffff";
    static final String dfa_20s = "\1\4\115\uffff";
    static final String dfa_21s = "\1\u008b\115\uffff";
    static final String dfa_22s = "\1\uffff\1\2\114\1";
    static final String dfa_23s = "\116\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\1\52\1\113\1\46\1\16\1\53\1\107\1\61\1\22\1\20\1\103\1\115\1\10\1\64\1\uffff\1\43\1\36\1\24\1\uffff\1\100\1\71\1\51\1\uffff\1\1\1\uffff\1\62\1\uffff\1\60\1\102\1\4\1\110\1\5\1\3\1\15\1\uffff\1\7\4\uffff\1\101\1\67\1\35\1\6\1\26\1\54\1\75\1\104\3\uffff\1\57\1\70\1\105\1\56\1\66\1\1\1\31\2\uffff\1\73\1\74\1\42\1\32\1\33\1\uffff\1\76\1\72\1\1\1\uffff\1\27\1\55\1\111\1\1\1\112\1\uffff\1\77\1\114\1\63\1\40\1\25\1\65\1\47\2\uffff\1\14\1\50\1\uffff\1\106\1\1\1\2\1\21\1\1\1\17\1\uffff\1\1\1\23\1\uffff\1\30\1\45\1\uffff\1\37\2\uffff\1\44\1\41\1\11\1\34\15\uffff\1\12\1\13\14\uffff\1\1",
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

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 566:9: ( (lv_triggers_35_0= ruleEvent ) )*";
        }
    }
    static final String dfa_25s = "\1\1\13\uffff";
    static final String dfa_26s = "\1\4\1\uffff\6\0\4\uffff";
    static final String dfa_27s = "\1\u008b\1\uffff\6\0\4\uffff";
    static final String dfa_28s = "\1\uffff\1\5\6\uffff\1\4\1\1\1\2\1\3";
    static final String dfa_29s = "\2\uffff\1\4\1\0\1\1\1\5\1\2\1\3\4\uffff}>";
    static final String[] dfa_30s = {
            "\16\1\1\4\3\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\1\uffff\7\1\1\uffff\1\1\4\uffff\10\1\1\uffff\1\5\1\uffff\7\1\2\uffff\5\1\1\uffff\3\1\1\uffff\5\1\1\7\7\1\2\uffff\2\1\1\uffff\6\1\1\uffff\2\1\1\uffff\2\1\1\uffff\1\1\2\uffff\4\1\4\uffff\1\3\10\uffff\2\1\13\uffff\1\6\1\2",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_7;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "()+ loopback of 1091:5: ( ({...}? => ( ({...}? => ( (otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= RULE_ID ) ) ) this_BEGIN_4= RULE_BEGIN (otherlv_5= Type ( (lv_type_6_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= DisplayName ( (lv_displayName_8_0= ruleStringValue ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= Default ( ( (lv_defaultValue_10_1= ruleStringValue | lv_defaultValue_10_2= RULE_INTV ) ) ) ) | (this_BEGIN_11= RULE_BEGIN ( ( (lv_defaultValue_12_1= ruleIndentedKeyValues | lv_defaultValue_12_2= ruleHyphenKVP | lv_defaultValue_12_3= ruleKeyValuePairs ) ) )* this_END_13= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= Values ( (lv_value_15_0= ruleHyphenParameters ) ) )? this_END_16= RULE_END ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 2) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_7 = input.LA(1);

                         
                        int index37_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 3) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index37_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 3) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup(), 2) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getParameterAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_31s = "\12\uffff";
    static final String dfa_32s = "\1\3\11\uffff";
    static final String dfa_33s = "\1\24\1\0\1\5\7\uffff";
    static final String dfa_34s = "\1\u008b\1\0\1\175\7\uffff";
    static final String dfa_35s = "\3\uffff\1\7\1\1\1\2\1\3\1\4\1\6\1\5";
    static final String dfa_36s = "\1\2\1\0\1\1\7\uffff}>";
    static final String[] dfa_37s = {
            "\1\5\11\uffff\1\6\43\uffff\1\7\20\uffff\1\6\4\uffff\1\10\7\uffff\1\7\23\uffff\1\2\7\uffff\3\3\5\uffff\1\3\5\uffff\1\4\1\1",
            "\1\uffff",
            "\15\11\1\uffff\3\11\1\uffff\3\11\3\uffff\1\11\1\uffff\7\11\1\uffff\1\11\4\uffff\10\11\3\uffff\5\11\1\uffff\1\11\2\uffff\5\11\1\uffff\2\11\2\uffff\3\11\1\uffff\1\11\1\uffff\7\11\2\uffff\2\11\1\uffff\1\11\1\uffff\2\11\1\uffff\1\11\2\uffff\1\11\1\uffff\2\11\1\uffff\1\11\1\3\1\uffff\4\11\6\uffff\1\11\6\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_31;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "()+ loopback of 1590:6: ( ({...}? => ( ({...}? => (this_BEGIN_5= RULE_BEGIN ( ( ( (lv_nameKW_6_1= Name | lv_nameKW_6_2= DisplayName ) ) ) ( (lv_jobName_7_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Permissions ( ( (lv_permission_9_0= rulePermission ) ) | (this_BEGIN_10= RULE_BEGIN ( (lv_value_11_0= ruleKeyValuePairs ) ) this_END_12= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_13_1= Needs | lv_dependKW_13_2= DependsOn ) ) ) ( ( (otherlv_14= RULE_ID ) ) | (otherlv_15= LeftSquareBracket ( (otherlv_16= RULE_ID ) ) (otherlv_17= Comma ( (otherlv_18= RULE_ID ) ) )* otherlv_19= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_runKW_20_1= RunsOn | lv_runKW_20_2= Pool ) ) ) ( ( (lv_vm_21_1= RULE_ID | lv_vm_21_2= ruleArrayList ) ) ) ) | ( ( (lv_runKW_22_0= Pool ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_24= RULE_BEGIN (otherlv_25= Name ( (lv_poolName_26_0= ruleStringValue ) ) )? (otherlv_27= VmImage ( (lv_poolVm_28_0= ruleStringValue ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= Demands ( ( (lv_poolDemands_30_1= ruleStringValue | lv_poolDemands_30_2= ruleHyphenParameters ) ) ) )? this_END_31= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jobParameters_32_0= ruleJobParameter ) ) )+ ) ) | ({...}? => ( ({...}? => ( (otherlv_33= Steps ( (lv_steps_34_0= ruleStep ) )* )? this_END_35= RULE_END ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 5) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_1()) ) {s = 3;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_2 = input.LA(1);

                         
                        int index62_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_2==Job) ) {s = 3;}

                        else if ( ( LA62_2 >= ContinueOnError && LA62_2 <= Credentials || LA62_2 >= Environment && LA62_2 <= TagsIgnore || LA62_2 >= Containers && LA62_2 <= Entrypoint || LA62_2 == Container || LA62_2 >= FailFast && LA62_2 <= Branches || LA62_2 == Defaults || LA62_2 >= Packages && LA62_2 <= Webhooks || LA62_2 >= Exclude && LA62_2 <= Inherit || LA62_2 == Outputs || LA62_2 >= Rolling && LA62_2 <= Trigger || LA62_2 >= Builds && LA62_2 <= Canary || LA62_2 >= Inputs && LA62_2 <= Script || LA62_2 == Target || LA62_2 >= Build && LA62_2 <= Shell || LA62_2 >= Types && LA62_2 <= Args || LA62_2 == Cron || LA62_2 >= Name && LA62_2 <= Path || LA62_2 == Push || LA62_2 == Tags || LA62_2 >= Type && LA62_2 <= Uses || LA62_2 == Env || LA62_2 >= Id && LA62_2 <= Pr || LA62_2 == LeftSquareBracket || LA62_2 == RULE_ID ) && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 4) ) {s = 9;}

                         
                        input.seek(index62_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_0 = input.LA(1);

                         
                        int index62_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_0==RULE_END) ) {s = 1;}

                        else if ( (LA62_0==HyphenMinus) ) {s = 2;}

                        else if ( (LA62_0==EOF||(LA62_0>=RULE_SINGLE_CHAR && LA62_0<=RULE_STRING)||LA62_0==RULE_VERSION) ) {s = 3;}

                        else if ( LA62_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0) ) {s = 4;}

                        else if ( LA62_0 == Permissions && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) {s = 5;}

                        else if ( ( LA62_0 == DependsOn || LA62_0 == Needs ) && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {s = 6;}

                        else if ( ( LA62_0 == RunsOn || LA62_0 == Pool ) && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 3) ) {s = 7;}

                        else if ( LA62_0 == Steps && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 5) ) {s = 8;}

                         
                        input.seek(index62_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_38s = "\34\uffff";
    static final String dfa_39s = "\2\2\32\uffff";
    static final String dfa_40s = "\1\24\1\22\2\uffff\20\24\1\uffff\7\24";
    static final String dfa_41s = "\2\u008b\2\uffff\20\u008b\1\uffff\7\u008b";
    static final String dfa_42s = "\2\uffff\1\2\1\1\20\uffff\1\1\7\uffff";
    static final String dfa_43s = "\34\uffff}>";
    static final String[] dfa_44s = {
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\23\uffff\1\2\7\uffff\3\2\5\uffff\1\2\5\uffff\1\1\1\2",
            "\1\2\1\uffff\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\5\uffff\1\2\1\uffff\1\2\23\uffff\1\2\7\uffff\1\2\1\4\1\2\5\uffff\1\2\5\uffff\1\2\1\3",
            "",
            "",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\2\2\1\uffff\1\2\1\5\2\uffff\2\2\1\uffff\4\2\3\uffff\1\2\1\uffff\1\2\5\uffff\2\2",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\23\uffff\1\2\7\uffff\1\7\1\6\1\10\1\uffff\3\3\1\uffff\1\11\5\uffff\2\2",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\16\1\15\1\uffff\2\2\2\uffff\1\12\1\13\1\uffff\1\14\1\22\1\21\1\20\3\uffff\1\17\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\16\1\15\1\uffff\2\2\2\uffff\1\12\1\13\1\uffff\1\14\1\22\1\21\1\20\3\uffff\1\17\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\16\1\15\1\uffff\2\2\2\uffff\1\12\1\13\1\uffff\1\14\1\22\1\21\1\20\3\uffff\1\17\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\16\1\15\1\uffff\2\2\2\uffff\1\12\1\13\1\uffff\1\14\1\22\1\21\1\20\3\uffff\1\17\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\16\1\15\1\uffff\2\2\2\uffff\1\12\1\13\1\uffff\1\14\1\22\1\21\1\20\3\uffff\1\17\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\16\1\15\1\uffff\2\2\2\uffff\1\12\1\13\1\uffff\1\14\1\22\1\21\1\20\3\uffff\1\17\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\16\1\15\1\uffff\2\2\2\uffff\1\12\1\13\1\uffff\1\14\1\22\1\21\1\20\3\uffff\1\17\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\16\1\15\1\uffff\2\2\2\uffff\1\12\1\13\1\uffff\1\14\1\22\1\21\1\20\3\uffff\1\17\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\16\1\15\1\uffff\2\2\2\uffff\1\12\1\13\1\uffff\1\14\1\22\1\21\1\20\3\uffff\1\17\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\23\uffff\2\2\6\uffff\1\22\1\21\1\20\3\uffff\1\24\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\33\1\32\1\uffff\2\2\2\uffff\1\27\1\30\1\uffff\1\31\1\22\1\21\1\25\3\uffff\1\26\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\33\1\32\1\uffff\1\2\1\5\2\uffff\1\27\1\30\1\uffff\1\31\1\22\1\21\1\25\3\uffff\1\26\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\33\1\32\1\uffff\2\2\2\uffff\1\27\1\30\1\uffff\1\31\1\22\1\21\1\25\3\uffff\1\26\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\33\1\32\1\uffff\2\2\2\uffff\1\27\1\30\1\uffff\1\31\1\22\1\21\1\25\3\uffff\1\26\1\uffff\1\23\5\uffff\1\2\1\24",
            "",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\33\1\32\1\uffff\2\2\2\uffff\1\27\1\30\1\uffff\1\31\1\22\1\21\1\25\3\uffff\1\26\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\23\uffff\2\2\6\uffff\1\22\1\21\1\25\3\uffff\1\24\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\33\1\32\1\uffff\2\2\2\uffff\1\27\1\30\1\uffff\1\31\1\22\1\21\1\25\3\uffff\1\26\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\33\1\32\1\uffff\2\2\2\uffff\1\27\1\30\1\uffff\1\31\1\22\1\21\1\25\3\uffff\1\26\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\33\1\32\1\uffff\2\2\2\uffff\1\27\1\30\1\uffff\1\31\1\22\1\21\1\25\3\uffff\1\26\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\33\1\32\1\uffff\2\2\2\uffff\1\27\1\30\1\uffff\1\31\1\22\1\21\1\25\3\uffff\1\26\1\uffff\1\23\5\uffff\1\2\1\24",
            "\1\2\11\uffff\1\2\43\uffff\1\2\20\uffff\1\2\4\uffff\1\2\7\uffff\1\2\20\uffff\1\33\1\32\1\uffff\2\2\2\uffff\1\27\1\30\1\uffff\1\31\1\22\1\21\1\25\3\uffff\1\26\1\uffff\1\23\5\uffff\1\2\1\24"
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = dfa_38;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "2204:3: (this_BEGIN_3= RULE_BEGIN ( (lv_parameters_4_0= ruleParameterValue ) )* this_END_5= RULE_END )?";
        }
    }
    static final String dfa_45s = "\1\7\11\uffff";
    static final String dfa_46s = "\1\4\3\uffff\2\4\2\uffff\1\4\1\134";
    static final String dfa_47s = "\1\u008b\3\uffff\2\u008b\2\uffff\1\u008b\1\u0084";
    static final String dfa_48s = "\1\uffff\3\1\2\uffff\1\1\1\2\2\uffff";
    static final String dfa_49s = "\12\uffff}>";
    static final String[] dfa_50s = {
            "\4\7\1\3\3\7\1\5\5\7\1\uffff\3\7\1\3\3\7\1\uffff\1\7\1\uffff\1\7\1\uffff\6\7\1\2\1\uffff\1\7\4\uffff\10\7\3\uffff\7\7\2\uffff\5\7\1\uffff\3\7\1\3\5\7\1\uffff\4\7\1\4\2\7\2\uffff\2\7\1\uffff\6\7\1\uffff\2\7\1\uffff\2\7\1\uffff\1\7\2\uffff\4\7\3\uffff\1\7\1\3\2\uffff\1\7\5\uffff\2\7\13\uffff\1\1\1\6",
            "",
            "",
            "",
            "\16\7\1\uffff\7\7\1\uffff\1\7\1\uffff\1\7\1\uffff\7\7\1\uffff\1\7\4\uffff\10\7\3\uffff\7\7\2\uffff\5\7\1\uffff\11\7\1\uffff\7\7\2\uffff\2\7\1\uffff\6\7\1\uffff\2\7\1\uffff\2\7\1\uffff\1\7\2\uffff\4\7\4\uffff\1\7\10\uffff\2\7\13\uffff\1\10\1\7",
            "\16\7\1\uffff\7\7\1\uffff\1\7\1\uffff\1\7\1\uffff\7\7\1\uffff\1\7\4\uffff\10\7\3\uffff\7\7\2\uffff\5\7\1\uffff\11\7\1\uffff\7\7\2\uffff\2\7\1\uffff\6\7\1\uffff\2\7\1\uffff\2\7\1\uffff\1\7\2\uffff\4\7\4\uffff\1\7\10\uffff\2\7\13\uffff\1\10\1\7",
            "",
            "",
            "\16\7\1\uffff\7\7\1\uffff\1\7\1\uffff\1\7\1\uffff\7\7\1\uffff\1\7\1\uffff\2\6\1\uffff\10\7\3\uffff\7\7\2\uffff\5\7\1\uffff\11\7\1\uffff\7\7\2\uffff\2\7\1\uffff\6\7\1\uffff\2\7\1\uffff\2\7\1\uffff\1\7\2\uffff\4\7\4\uffff\1\11\10\uffff\2\7\13\uffff\2\7",
            "\1\7\31\uffff\1\6\5\uffff\3\6\4\uffff\2\6"
    };
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA105 extends DFA {

        public DFA105(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 105;
            this.eot = dfa_31;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "2886:3: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+ {...}?) ) )?";
        }
    }
    static final String dfa_51s = "\21\uffff";
    static final String dfa_52s = "\1\2\20\uffff";
    static final String dfa_53s = "\1\4\1\0\1\uffff\2\0\2\4\1\0\5\uffff\1\4\1\uffff\1\134\1\uffff";
    static final String dfa_54s = "\1\u008b\1\0\1\uffff\2\0\2\u008b\1\0\5\uffff\1\u008b\1\uffff\1\u0084\1\uffff";
    static final String dfa_55s = "\2\uffff\1\10\5\uffff\1\4\1\5\1\6\1\1\1\2\1\uffff\1\7\1\uffff\1\3";
    static final String dfa_56s = "\1\5\1\4\1\uffff\1\1\1\6\2\uffff\1\0\5\uffff\1\3\1\uffff\1\2\1\uffff}>";
    static final String[] dfa_57s = {
            "\4\2\1\4\3\2\1\5\5\2\1\uffff\3\2\1\10\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\6\2\1\3\1\uffff\1\2\4\uffff\10\2\3\uffff\7\2\2\uffff\5\2\1\uffff\3\2\1\11\5\2\1\uffff\4\2\1\6\2\2\2\uffff\2\2\1\uffff\6\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\2\uffff\4\2\3\uffff\1\2\1\12\2\uffff\1\2\5\uffff\2\2\13\uffff\1\1\1\7",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\16\2\1\uffff\7\2\1\uffff\1\2\1\uffff\1\2\1\uffff\7\2\1\uffff\1\2\4\uffff\10\2\3\uffff\7\2\2\uffff\5\2\1\uffff\11\2\1\uffff\7\2\2\uffff\2\2\1\uffff\6\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\2\uffff\4\2\4\uffff\1\2\10\uffff\2\2\13\uffff\1\15\1\2",
            "\16\2\1\uffff\7\2\1\uffff\1\2\1\uffff\1\2\1\uffff\7\2\1\uffff\1\2\4\uffff\10\2\3\uffff\7\2\2\uffff\5\2\1\uffff\11\2\1\uffff\7\2\2\uffff\2\2\1\uffff\6\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\2\uffff\4\2\4\uffff\1\2\10\uffff\2\2\13\uffff\1\15\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\16\2\1\uffff\7\2\1\uffff\1\2\1\uffff\1\2\1\uffff\7\2\1\uffff\1\2\1\uffff\2\20\1\uffff\10\2\3\uffff\7\2\2\uffff\5\2\1\uffff\11\2\1\uffff\7\2\2\uffff\2\2\1\uffff\6\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\2\uffff\4\2\4\uffff\1\17\10\uffff\2\2\13\uffff\2\2",
            "",
            "\1\2\31\uffff\1\20\5\uffff\3\20\4\uffff\2\20",
            ""
    };

    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = dfa_51;
            this.eof = dfa_52;
            this.min = dfa_53;
            this.max = dfa_54;
            this.accept = dfa_55;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "()+ loopback of 2892:6: ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= Types ( ( (lv_activities_5_0= ruleActivity ) ) | (otherlv_6= LeftSquareBracket ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= Comma ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= RightSquareBracket ) )? (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )? )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_branchKW_15_1= Branches | lv_branchKW_15_2= BranchesIgnore ) ) ) ( ( (lv_branches_16_0= ruleBranch ) ) | (otherlv_17= LeftSquareBracket ( (lv_branches_18_0= ruleBranch ) ) (otherlv_19= Comma ( (lv_branches_20_0= ruleBranch ) ) )* otherlv_21= RightSquareBracket ) )? ( (otherlv_22= HyphenMinus ( (lv_branches_23_0= ruleBranch ) ) )* | (this_BEGIN_24= RULE_BEGIN ( (otherlv_25= Includes | otherlv_26= Excludes ) (otherlv_27= HyphenMinus ( (lv_branches_28_0= ruleBranch ) ) )* )+ this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pathKW_30_1= Paths | lv_pathKW_30_2= PathsIgnore ) ) ) (this_BEGIN_31= RULE_BEGIN ( ( (lv_pathValue_32_0= ruleHyphenParameters ) ) | ( ( ( (lv_incExcKW_33_1= Includes | lv_incExcKW_33_2= Excludes ) ) ) ( (lv_pathValue_34_0= ruleHyphenParameters ) ) ) ) this_END_35= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= AutoCancel ( (lv_autoCancel_37_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= Drafts ( (lv_drafts_39_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= HyphenMinus otherlv_41= Cron ( (lv_activities_42_0= ruleActivity ) ) ) )+ ) ) | ({...}? => ( ({...}? => (this_END_43= RULE_END ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA104_7 = input.LA(1);

                         
                        int index104_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 6) ) {s = 14;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getEventAccess().getUnorderedGroup_1()) ) {s = 2;}

                         
                        input.seek(index104_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA104_3 = input.LA(1);

                         
                        int index104_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 1) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getEventAccess().getUnorderedGroup_1()) ) {s = 2;}

                         
                        input.seek(index104_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA104_15 = input.LA(1);

                         
                        int index104_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA104_15==Cron) ) {s = 2;}

                        else if ( ( LA104_15 == LeftSquareBracket || LA104_15 >= RULE_SINGLE_CHAR && LA104_15 <= RULE_STRING || LA104_15 >= RULE_INT && LA104_15 <= RULE_VERSION ) && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 2) ) {s = 16;}

                         
                        input.seek(index104_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA104_13 = input.LA(1);

                         
                        int index104_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA104_13>=CancelInProgress && LA104_13<=Credentials)||(LA104_13>=Environment && LA104_13<=Entrypoint)||LA104_13==Parameters||LA104_13==Container||(LA104_13>=FailFast && LA104_13<=Branches)||LA104_13==Defaults||(LA104_13>=Packages && LA104_13<=Webhooks)||(LA104_13>=Exclude && LA104_13<=Outputs)||(LA104_13>=Rolling && LA104_13<=Trigger)||(LA104_13>=Builds && LA104_13<=Target)||(LA104_13>=Build && LA104_13<=Shell)||(LA104_13>=Types && LA104_13<=Args)||(LA104_13>=Cron && LA104_13<=Push)||(LA104_13>=Size && LA104_13<=Tags)||(LA104_13>=Type && LA104_13<=Uses)||LA104_13==Env||(LA104_13>=Id && LA104_13<=Pr)||(LA104_13>=RULE_ID && LA104_13<=RULE_STRING)||(LA104_13>=RULE_BEGIN && LA104_13<=RULE_END)) ) {s = 2;}

                        else if ( (LA104_13==HyphenMinus) ) {s = 15;}

                        else if ( LA104_13 >= Excludes && LA104_13 <= Includes && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 2) ) {s = 16;}

                         
                        input.seek(index104_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA104_1 = input.LA(1);

                         
                        int index104_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 0) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getEventAccess().getUnorderedGroup_1()) ) {s = 2;}

                         
                        input.seek(index104_1);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA104_0 = input.LA(1);

                         
                        int index104_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA104_0==RULE_BEGIN) ) {s = 1;}

                        else if ( (LA104_0==EOF||(LA104_0>=CancelInProgress && LA104_0<=WorkingDirectory)||(LA104_0>=TimeoutMinutes && LA104_0<=MaxParallel)||(LA104_0>=Pull_request && LA104_0<=Credentials)||(LA104_0>=Environment && LA104_0<=TagsIgnore)||(LA104_0>=Containers && LA104_0<=Entrypoint)||LA104_0==Parameters||LA104_0==Container||(LA104_0>=FailFast && LA104_0<=Variables)||LA104_0==Defaults||(LA104_0>=Packages && LA104_0<=Webhooks)||(LA104_0>=Exclude && LA104_0<=Outputs)||(LA104_0>=Rolling && LA104_0<=Trigger)||(LA104_0>=Builds && LA104_0<=Docker)||(LA104_0>=Inputs && LA104_0<=Target)||(LA104_0>=Build && LA104_0<=Needs)||(LA104_0>=Ports && LA104_0<=Shell)||(LA104_0>=Types && LA104_0<=Args)||(LA104_0>=Cron && LA104_0<=Push)||(LA104_0>=Size && LA104_0<=Tags)||(LA104_0>=Type && LA104_0<=Uses)||LA104_0==Env||(LA104_0>=Id && LA104_0<=Pr)||LA104_0==Comma||LA104_0==RightSquareBracket||(LA104_0>=RULE_ID && LA104_0<=RULE_STRING)) ) {s = 2;}

                        else if ( (LA104_0==Branches) ) {s = 3;}

                        else if ( (LA104_0==BranchesIgnore) ) {s = 4;}

                        else if ( (LA104_0==PathsIgnore) ) {s = 5;}

                        else if ( (LA104_0==Paths) ) {s = 6;}

                        else if ( (LA104_0==RULE_END) ) {s = 7;}

                        else if ( LA104_0 == AutoCancel && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 3) ) {s = 8;}

                        else if ( LA104_0 == Drafts && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 4) ) {s = 9;}

                        else if ( LA104_0 == HyphenMinus && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 5) ) {s = 10;}

                         
                        input.seek(index104_0);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA104_4 = input.LA(1);

                         
                        int index104_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_1(), 1) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getEventAccess().getUnorderedGroup_1()) ) {s = 2;}

                         
                        input.seek(index104_4);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 104, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_58s = "\11\uffff";
    static final String dfa_59s = "\2\2\7\uffff";
    static final String dfa_60s = "\2\4\1\uffff\2\4\1\uffff\2\134\1\uffff";
    static final String dfa_61s = "\2\u008b\1\uffff\2\u008b\1\uffff\2\176\1\uffff";
    static final String dfa_62s = "\2\uffff\1\2\2\uffff\1\1\2\uffff\1\1";
    static final String dfa_63s = "\11\uffff}>";
    static final String[] dfa_64s = {
            "\16\2\1\uffff\7\2\1\uffff\1\2\1\uffff\1\2\1\uffff\7\2\1\uffff\1\2\4\uffff\10\2\3\uffff\7\2\2\uffff\5\2\1\uffff\11\2\1\uffff\7\2\2\uffff\2\2\1\uffff\6\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\2\uffff\4\2\3\uffff\2\2\2\uffff\1\2\5\uffff\2\2\13\uffff\1\1\1\2",
            "\16\2\1\uffff\7\2\1\uffff\1\2\1\uffff\1\2\1\uffff\7\2\1\uffff\1\2\4\uffff\10\2\3\uffff\7\2\2\uffff\5\2\1\uffff\11\2\1\uffff\7\2\2\uffff\2\2\1\uffff\6\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\2\uffff\4\2\3\uffff\1\2\1\6\2\uffff\1\2\5\uffff\1\3\1\4\13\uffff\1\2\1\5",
            "",
            "\16\2\1\uffff\7\2\1\uffff\1\2\1\uffff\1\2\1\uffff\7\2\1\uffff\1\2\4\uffff\10\2\3\uffff\7\2\2\uffff\5\2\1\uffff\11\2\1\uffff\7\2\2\uffff\2\2\1\uffff\6\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\2\uffff\4\2\4\uffff\1\7\10\uffff\1\3\1\4\13\uffff\1\2\1\10",
            "\16\2\1\uffff\7\2\1\uffff\1\2\1\uffff\1\2\1\uffff\7\2\1\uffff\1\2\4\uffff\10\2\3\uffff\7\2\2\uffff\5\2\1\uffff\11\2\1\uffff\7\2\2\uffff\2\2\1\uffff\6\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\2\uffff\4\2\4\uffff\1\7\10\uffff\1\3\1\4\13\uffff\1\2\1\10",
            "",
            "\1\2\40\uffff\2\10",
            "\1\2\40\uffff\2\10",
            ""
    };

    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = dfa_58;
            this.eof = dfa_59;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "2983:10: (this_BEGIN_11= RULE_BEGIN ( (otherlv_12= HyphenMinus )? ( (lv_activities_13_0= ruleActivity ) ) )* this_END_14= RULE_END )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x7000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x3F8FF0BFABBBFFF0L,0x6000F2DBF67F7DDFL,0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L,0x0000000000400000L,0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x7000000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x3F8FF0BFABBBFFF0L,0x6040F2DBF67F7DDFL,0x0000000000000C00L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x3F8FF0BFABBBFFF0L,0x6000F2DBF67F7DDFL,0x0000000000000C00L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x2F8FF0BFA3BBFFE0L,0x6000F2D2D67F5CDFL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0088000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x2F8FF0BFA3BBFFE0L,0x6000F2D2D67F5CDFL,0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x7010000000000000L,0x0000000000000810L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000000040002L,0x0010000000008000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040000000000002L,0x6000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0040000000000002L,0x0000000040000020L,0x0000000000000C00L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000020L,0x0000000000000C00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x7010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1000080000000002L,0x0000000800000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1000000000000002L,0x0000000800000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000040002L,0x0010004000008000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x7000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000002L,0x0000000020000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040040002L,0x0000000020000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000002L,0x2000000020000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000040100002L,0x0030000101080004L,0x0000000000000C00L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000040100002L,0x0010000101080004L,0x0000000000000C00L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040140002L,0x0010000141080004L,0x0000000000000C00L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8010000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000040100002L,0x0010000141080024L,0x0000000000000C00L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000040100002L,0x0010000101080024L,0x0000000000000C00L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040000040100002L,0x0010000101080004L,0x0000000000000C00L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2F8FF0BFA3BBFFE0L,0x6040F2D2D67F5CDFL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x6F8FF1FFB7BBFFE0L,0x6000FAF6DE7F5CDFL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x7401000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x6F8FF1FFB7BBFFE0L,0x6000FAF6DE7F5CDFL,0x0000000000000800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000008000002L,0x7000010000000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000008000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x7000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000002000401102L,0x0010000000100200L,0x0000000000000C00L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000002000401102L,0x0010000002100200L,0x0000000000000C00L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000002000401102L,0x6050000000100200L,0x0000000000000C00L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x6010000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000060000000000L,0x0010000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000060000000000L,0x7010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x7000000000000000L,0x0000000000000017L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x7040000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x7088000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x7080000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x7B06000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000002L,0x7000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0B06000000000000L});

}
