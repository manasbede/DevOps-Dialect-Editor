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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CancelInProgress", "Workflow_dispatch", "WorkingDirectory", "BranchesIgnore", "Workflow_call", "PathsIgnore", "Repositories", "Workflow_run", "Concurrency", "DisplayName", "TagsIgnore", "AutoCancel", "Containers", "Parameters", "Permission", "Executors", "Pipelines", "Resources", "Schedules", "Variables", "Branches", "Commands", "Defaults", "Excluded", "Included", "Packages", "Readonly", "RunName", "Schedule", "Template", "Webhooks", "WriteAll", "Default", "Demands", "Extends", "Include", "ReadAll", "Version", "VmImage", "Always", "Builds", "Drafts", "Batch", "Group", "Paths", "Shell", "Tags", "Types", "Value", "Cron", "Name", "Orbs", "Pool", "Write", "Env", "Job", "None", "Read", "Run", "On", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_COMPLEX_EXPRESSION", "RULE_HEX_INT", "RULE_INT", "RULE_FLOAT_LITERAL", "RULE_VERSION", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
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
    // InternalPipelineParser.g:65:1: rulePipeline returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) ) )+ {...}?) ) ) ;
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
        Token otherlv_33=null;
        Token this_BEGIN_35=null;
        Token otherlv_36=null;
        Token lv_vmName_37_0=null;
        Token otherlv_38=null;
        Token lv_vmImage_39_1=null;
        Token lv_vmImage_39_2=null;
        Token otherlv_40=null;
        Token this_END_42=null;
        Token otherlv_43=null;
        Token this_BEGIN_44=null;
        Token this_END_46=null;
        Token otherlv_47=null;
        Token lv_version_48_0=null;
        Token otherlv_49=null;
        Token otherlv_53=null;
        Token this_BEGIN_54=null;
        Token this_END_56=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_runName_4_0 = null;

        AntlrDatatypeRuleToken lv_env_19_0 = null;

        Enumerator lv_allPermission_22_0 = null;

        AntlrDatatypeRuleToken lv_indPermissions_24_0 = null;

        AntlrDatatypeRuleToken lv_vmDemands_41_1 = null;

        AntlrDatatypeRuleToken lv_vmDemands_41_2 = null;

        EObject lv_resources_45_0 = null;

        EObject lv_variables_50_0 = null;

        EObject lv_extendedParameter_51_0 = null;

        EObject lv_pipelineParameters_52_0 = null;

        EObject lv_triggers_55_0 = null;

        EObject lv_triggers_57_0 = null;

        EObject lv_triggers_59_0 = null;

        EObject lv_triggers_61_0 = null;

        EObject lv_triggers_63_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:71:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) ) )+ {...}?) ) ) )
            // InternalPipelineParser.g:72:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) ) )+ {...}?) ) )
            {
            // InternalPipelineParser.g:72:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) ) )+ {...}?) ) )
            // InternalPipelineParser.g:73:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) ) )+ {...}?) )
            {
            // InternalPipelineParser.g:73:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) ) )+ {...}?) )
            // InternalPipelineParser.g:74:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup());
            			
            // InternalPipelineParser.g:77:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) ) )+ {...}?)
            // InternalPipelineParser.g:78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) ) )+ {...}?
            {
            // InternalPipelineParser.g:78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=13;
                alt24 = dfa24.predict(input);
                switch (alt24) {
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
            	    // InternalPipelineParser.g:315:3: ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:315:3: ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) )
            	    // InternalPipelineParser.g:316:4: {...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalPipelineParser.g:316:102: ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) )
            	    // InternalPipelineParser.g:317:5: ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalPipelineParser.g:320:8: ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:320:9: {...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:320:18: (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) )
            	    // InternalPipelineParser.g:320:19: otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) )
            	    {
            	    otherlv_21=(Token)match(input,Permission,FOLLOW_12); 

            	    								newLeafNode(otherlv_21, grammarAccess.getPipelineAccess().getPermissionKeyword_4_0());
            	    							
            	    // InternalPipelineParser.g:324:8: ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==WriteAll||LA7_0==ReadAll||LA7_0==Write||(LA7_0>=None && LA7_0<=Read)) ) {
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
            	            // InternalPipelineParser.g:325:9: ( (lv_allPermission_22_0= rulePermission ) )
            	            {
            	            // InternalPipelineParser.g:325:9: ( (lv_allPermission_22_0= rulePermission ) )
            	            // InternalPipelineParser.g:326:10: (lv_allPermission_22_0= rulePermission )
            	            {
            	            // InternalPipelineParser.g:326:10: (lv_allPermission_22_0= rulePermission )
            	            // InternalPipelineParser.g:327:11: lv_allPermission_22_0= rulePermission
            	            {

            	            											newCompositeNode(grammarAccess.getPipelineAccess().getAllPermissionPermissionEnumRuleCall_4_1_0_0());
            	            										
            	            pushFollow(FOLLOW_4);
            	            lv_allPermission_22_0=rulePermission();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getPipelineRule());
            	            											}
            	            											set(
            	            												current,
            	            												"allPermission",
            	            												lv_allPermission_22_0,
            	            												"ca.mcgill.devops.pipeline.Pipeline.Permission");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:345:9: (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END )
            	            {
            	            // InternalPipelineParser.g:345:9: (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END )
            	            // InternalPipelineParser.g:346:10: this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END
            	            {
            	            this_BEGIN_23=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            	            										newLeafNode(this_BEGIN_23, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_4_1_1_0());
            	            									
            	            // InternalPipelineParser.g:350:10: ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )*
            	            loop6:
            	            do {
            	                int alt6=2;
            	                int LA6_0 = input.LA(1);

            	                if ( (LA6_0==RULE_ID) ) {
            	                    alt6=1;
            	                }


            	                switch (alt6) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:351:11: (lv_indPermissions_24_0= ruleIndPermissionValue )
            	            	    {
            	            	    // InternalPipelineParser.g:351:11: (lv_indPermissions_24_0= ruleIndPermissionValue )
            	            	    // InternalPipelineParser.g:352:12: lv_indPermissions_24_0= ruleIndPermissionValue
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
            	    // InternalPipelineParser.g:381:3: ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:381:3: ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) )
            	    // InternalPipelineParser.g:382:4: {...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalPipelineParser.g:382:102: ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:383:5: ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalPipelineParser.g:386:8: ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) )
            	    // InternalPipelineParser.g:386:9: {...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:386:18: (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) )
            	    // InternalPipelineParser.g:386:19: otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END )
            	    {
            	    otherlv_26=(Token)match(input,Concurrency,FOLLOW_5); 

            	    								newLeafNode(otherlv_26, grammarAccess.getPipelineAccess().getConcurrencyKeyword_5_0());
            	    							
            	    // InternalPipelineParser.g:390:8: (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END )
            	    // InternalPipelineParser.g:391:9: this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END
            	    {
            	    this_BEGIN_27=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_27, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_5_1_0());
            	    								
            	    // InternalPipelineParser.g:395:9: (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) )
            	    // InternalPipelineParser.g:396:10: otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) )
            	    {
            	    otherlv_28=(Token)match(input,Group,FOLLOW_15); 

            	    										newLeafNode(otherlv_28, grammarAccess.getPipelineAccess().getGroupKeyword_5_1_1_0());
            	    									
            	    // InternalPipelineParser.g:400:10: ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) )
            	    // InternalPipelineParser.g:401:11: ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) )
            	    {
            	    // InternalPipelineParser.g:401:11: ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) )
            	    // InternalPipelineParser.g:402:12: (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION )
            	    {
            	    // InternalPipelineParser.g:402:12: (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION )
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
            	            // InternalPipelineParser.g:403:13: lv_group_29_1= RULE_ID
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
            	            // InternalPipelineParser.g:418:13: lv_group_29_2= RULE_COMPLEX_EXPRESSION
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

            	    // InternalPipelineParser.g:436:9: (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) )
            	    // InternalPipelineParser.g:437:10: otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) )
            	    {
            	    otherlv_30=(Token)match(input,CancelInProgress,FOLLOW_15); 

            	    										newLeafNode(otherlv_30, grammarAccess.getPipelineAccess().getCancelInProgressKeyword_5_1_2_0());
            	    									
            	    // InternalPipelineParser.g:441:10: ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) )
            	    // InternalPipelineParser.g:442:11: ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) )
            	    {
            	    // InternalPipelineParser.g:442:11: ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) )
            	    // InternalPipelineParser.g:443:12: (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION )
            	    {
            	    // InternalPipelineParser.g:443:12: (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION )
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
            	            // InternalPipelineParser.g:444:13: lv_cancelConcurrence_31_1= RULE_ID
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
            	            // InternalPipelineParser.g:459:13: lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION
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
            	    // InternalPipelineParser.g:488:3: ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:488:3: ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
            	    // InternalPipelineParser.g:489:4: {...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalPipelineParser.g:489:102: ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // InternalPipelineParser.g:490:5: ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalPipelineParser.g:493:8: ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            	    // InternalPipelineParser.g:493:9: {...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:493:18: (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) )
            	    // InternalPipelineParser.g:493:19: otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) )
            	    {
            	    otherlv_33=(Token)match(input,Pool,FOLLOW_17); 

            	    								newLeafNode(otherlv_33, grammarAccess.getPipelineAccess().getPoolKeyword_6_0());
            	    							
            	    // InternalPipelineParser.g:497:8: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) )
            	    // InternalPipelineParser.g:498:9: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) )
            	    {
            	    // InternalPipelineParser.g:498:9: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) )
            	    // InternalPipelineParser.g:499:10: ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?)
            	    {
            	     
            	    									  getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1());
            	    									
            	    // InternalPipelineParser.g:502:10: ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?)
            	    // InternalPipelineParser.g:503:11: ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?
            	    {
            	    // InternalPipelineParser.g:503:11: ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=3;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==RULE_END) ) {
            	            int LA14_2 = input.LA(2);

            	            if ( ( LA14_2 == EOF || LA14_2 >= Workflow_dispatch && LA14_2 <= WorkingDirectory || LA14_2 == Workflow_call || LA14_2 >= Workflow_run && LA14_2 <= Concurrency || LA14_2 >= Parameters && LA14_2 <= Executors || LA14_2 >= Resources && LA14_2 <= Variables || LA14_2 >= Commands && LA14_2 <= Defaults || LA14_2 >= RunName && LA14_2 <= Schedule || LA14_2 >= Default && LA14_2 <= Include || LA14_2 == Version || LA14_2 >= Name && LA14_2 <= Pool || LA14_2 >= Env && LA14_2 <= Job || LA14_2 == On || LA14_2 == RULE_BEGIN || LA14_2 == RULE_ID ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1(), 1) ) {
            	                alt14=2;
            	            }
            	            else if ( (LA14_2==RULE_END) ) {
            	                int LA14_5 = input.LA(3);

            	                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1(), 1) ) {
            	                    alt14=2;
            	                }


            	            }


            	        }
            	        else if ( LA14_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1(), 0) ) {
            	            alt14=1;
            	        }
            	        else if ( LA14_0 == Demands && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1(), 1) ) {
            	            alt14=2;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:504:9: ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:504:9: ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) )
            	    	    // InternalPipelineParser.g:505:10: {...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1(), 0) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1(), 0)");
            	    	    }
            	    	    // InternalPipelineParser.g:505:112: ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) )
            	    	    // InternalPipelineParser.g:506:11: ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1(), 0);
            	    	    										
            	    	    // InternalPipelineParser.g:509:14: ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) )
            	    	    // InternalPipelineParser.g:509:15: {...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:509:24: (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? )
            	    	    // InternalPipelineParser.g:509:25: this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )?
            	    	    {
            	    	    this_BEGIN_35=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            	    	    														newLeafNode(this_BEGIN_35, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_6_1_0_0());
            	    	    													
            	    	    // InternalPipelineParser.g:513:14: (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) )
            	    	    // InternalPipelineParser.g:514:15: otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_36=(Token)match(input,Name,FOLLOW_3); 

            	    	    															newLeafNode(otherlv_36, grammarAccess.getPipelineAccess().getNameKeyword_6_1_0_1_0());
            	    	    														
            	    	    // InternalPipelineParser.g:518:15: ( (lv_vmName_37_0= RULE_ID ) )
            	    	    // InternalPipelineParser.g:519:16: (lv_vmName_37_0= RULE_ID )
            	    	    {
            	    	    // InternalPipelineParser.g:519:16: (lv_vmName_37_0= RULE_ID )
            	    	    // InternalPipelineParser.g:520:17: lv_vmName_37_0= RULE_ID
            	    	    {
            	    	    lv_vmName_37_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    	    																	newLeafNode(lv_vmName_37_0, grammarAccess.getPipelineAccess().getVmNameIDTerminalRuleCall_6_1_0_1_1_0());
            	    	    																

            	    	    																	if (current==null) {
            	    	    																		current = createModelElement(grammarAccess.getPipelineRule());
            	    	    																	}
            	    	    																	setWithLastConsumed(
            	    	    																		current,
            	    	    																		"vmName",
            	    	    																		lv_vmName_37_0,
            	    	    																		"ca.mcgill.devops.pipeline.Pipeline.ID");
            	    	    																

            	    	    }


            	    	    }


            	    	    }

            	    	    // InternalPipelineParser.g:537:14: (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )?
            	    	    int alt11=2;
            	    	    int LA11_0 = input.LA(1);

            	    	    if ( (LA11_0==VmImage) ) {
            	    	        alt11=1;
            	    	    }
            	    	    switch (alt11) {
            	    	        case 1 :
            	    	            // InternalPipelineParser.g:538:15: otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) )
            	    	            {
            	    	            otherlv_38=(Token)match(input,VmImage,FOLLOW_20); 

            	    	            															newLeafNode(otherlv_38, grammarAccess.getPipelineAccess().getVmImageKeyword_6_1_0_2_0());
            	    	            														
            	    	            // InternalPipelineParser.g:542:15: ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) )
            	    	            // InternalPipelineParser.g:543:16: ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) )
            	    	            {
            	    	            // InternalPipelineParser.g:543:16: ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) )
            	    	            // InternalPipelineParser.g:544:17: (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING )
            	    	            {
            	    	            // InternalPipelineParser.g:544:17: (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING )
            	    	            int alt10=2;
            	    	            int LA10_0 = input.LA(1);

            	    	            if ( (LA10_0==RULE_ID) ) {
            	    	                alt10=1;
            	    	            }
            	    	            else if ( (LA10_0==RULE_STRING) ) {
            	    	                alt10=2;
            	    	            }
            	    	            else {
            	    	                NoViableAltException nvae =
            	    	                    new NoViableAltException("", 10, 0, input);

            	    	                throw nvae;
            	    	            }
            	    	            switch (alt10) {
            	    	                case 1 :
            	    	                    // InternalPipelineParser.g:545:18: lv_vmImage_39_1= RULE_ID
            	    	                    {
            	    	                    lv_vmImage_39_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    	                    																		newLeafNode(lv_vmImage_39_1, grammarAccess.getPipelineAccess().getVmImageIDTerminalRuleCall_6_1_0_2_1_0_0());
            	    	                    																	

            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElement(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		setWithLastConsumed(
            	    	                    																			current,
            	    	                    																			"vmImage",
            	    	                    																			lv_vmImage_39_1,
            	    	                    																			"ca.mcgill.devops.pipeline.Pipeline.ID");
            	    	                    																	

            	    	                    }
            	    	                    break;
            	    	                case 2 :
            	    	                    // InternalPipelineParser.g:560:18: lv_vmImage_39_2= RULE_STRING
            	    	                    {
            	    	                    lv_vmImage_39_2=(Token)match(input,RULE_STRING,FOLLOW_21); 

            	    	                    																		newLeafNode(lv_vmImage_39_2, grammarAccess.getPipelineAccess().getVmImageSTRINGTerminalRuleCall_6_1_0_2_1_0_1());
            	    	                    																	

            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElement(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		setWithLastConsumed(
            	    	                    																			current,
            	    	                    																			"vmImage",
            	    	                    																			lv_vmImage_39_2,
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

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalPipelineParser.g:584:9: ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:584:9: ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) )
            	    	    // InternalPipelineParser.g:585:10: {...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1(), 1) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1(), 1)");
            	    	    }
            	    	    // InternalPipelineParser.g:585:112: ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) )
            	    	    // InternalPipelineParser.g:586:11: ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1(), 1);
            	    	    										
            	    	    // InternalPipelineParser.g:589:14: ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) )
            	    	    // InternalPipelineParser.g:589:15: {...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:589:24: ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END )
            	    	    // InternalPipelineParser.g:589:25: (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END
            	    	    {
            	    	    // InternalPipelineParser.g:589:25: (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )?
            	    	    int alt13=2;
            	    	    int LA13_0 = input.LA(1);

            	    	    if ( (LA13_0==Demands) ) {
            	    	        alt13=1;
            	    	    }
            	    	    switch (alt13) {
            	    	        case 1 :
            	    	            // InternalPipelineParser.g:590:15: otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) )
            	    	            {
            	    	            otherlv_40=(Token)match(input,Demands,FOLLOW_22); 

            	    	            															newLeafNode(otherlv_40, grammarAccess.getPipelineAccess().getDemandsKeyword_6_1_1_0_0());
            	    	            														
            	    	            // InternalPipelineParser.g:594:15: ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) )
            	    	            // InternalPipelineParser.g:595:16: ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) )
            	    	            {
            	    	            // InternalPipelineParser.g:595:16: ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) )
            	    	            // InternalPipelineParser.g:596:17: (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues )
            	    	            {
            	    	            // InternalPipelineParser.g:596:17: (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues )
            	    	            int alt12=2;
            	    	            int LA12_0 = input.LA(1);

            	    	            if ( ((LA12_0>=RULE_COMPLEX_EXPRESSION && LA12_0<=RULE_VERSION)||LA12_0==RULE_ID||LA12_0==RULE_STRING) ) {
            	    	                alt12=1;
            	    	            }
            	    	            else if ( (LA12_0==HyphenMinus||LA12_0==RULE_BEGIN) ) {
            	    	                alt12=2;
            	    	            }
            	    	            else {
            	    	                NoViableAltException nvae =
            	    	                    new NoViableAltException("", 12, 0, input);

            	    	                throw nvae;
            	    	            }
            	    	            switch (alt12) {
            	    	                case 1 :
            	    	                    // InternalPipelineParser.g:597:18: lv_vmDemands_41_1= ruleAnyData
            	    	                    {

            	    	                    																		newCompositeNode(grammarAccess.getPipelineAccess().getVmDemandsAnyDataParserRuleCall_6_1_1_0_1_0_0());
            	    	                    																	
            	    	                    pushFollow(FOLLOW_9);
            	    	                    lv_vmDemands_41_1=ruleAnyData();

            	    	                    state._fsp--;


            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		set(
            	    	                    																			current,
            	    	                    																			"vmDemands",
            	    	                    																			lv_vmDemands_41_1,
            	    	                    																			"ca.mcgill.devops.pipeline.Pipeline.AnyData");
            	    	                    																		afterParserOrEnumRuleCall();
            	    	                    																	

            	    	                    }
            	    	                    break;
            	    	                case 2 :
            	    	                    // InternalPipelineParser.g:613:18: lv_vmDemands_41_2= ruleHyphenValues
            	    	                    {

            	    	                    																		newCompositeNode(grammarAccess.getPipelineAccess().getVmDemandsHyphenValuesParserRuleCall_6_1_1_0_1_0_1());
            	    	                    																	
            	    	                    pushFollow(FOLLOW_9);
            	    	                    lv_vmDemands_41_2=ruleHyphenValues();

            	    	                    state._fsp--;


            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		set(
            	    	                    																			current,
            	    	                    																			"vmDemands",
            	    	                    																			lv_vmDemands_41_2,
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

            	    	    this_END_42=(Token)match(input,RULE_END,FOLLOW_21); 

            	    	    														newLeafNode(this_END_42, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_6_1_1_1());
            	    	    													

            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1());
            	    	    										

            	    	    }


            	    	    }


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

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1()) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1())");
            	    }

            	    }


            	    }

            	     
            	    									  getUnorderedGroupHelper().leave(grammarAccess.getPipelineAccess().getUnorderedGroup_6_1());
            	    									

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalPipelineParser.g:656:3: ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:656:3: ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) )
            	    // InternalPipelineParser.g:657:4: {...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalPipelineParser.g:657:102: ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:658:5: ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalPipelineParser.g:661:8: ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) )
            	    // InternalPipelineParser.g:661:9: {...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:661:18: (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) )
            	    // InternalPipelineParser.g:661:19: otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END )
            	    {
            	    otherlv_43=(Token)match(input,Resources,FOLLOW_5); 

            	    								newLeafNode(otherlv_43, grammarAccess.getPipelineAccess().getResourcesKeyword_7_0());
            	    							
            	    // InternalPipelineParser.g:665:8: (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END )
            	    // InternalPipelineParser.g:666:9: this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END
            	    {
            	    this_BEGIN_44=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            	    									newLeafNode(this_BEGIN_44, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_7_1_0());
            	    								
            	    // InternalPipelineParser.g:670:9: ( (lv_resources_45_0= ruleResource ) )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==Repositories||LA15_0==Containers||LA15_0==Pipelines||LA15_0==Packages||LA15_0==Webhooks||LA15_0==Builds) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:671:10: (lv_resources_45_0= ruleResource )
            	    	    {
            	    	    // InternalPipelineParser.g:671:10: (lv_resources_45_0= ruleResource )
            	    	    // InternalPipelineParser.g:672:11: lv_resources_45_0= ruleResource
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPipelineAccess().getResourcesResourceParserRuleCall_7_1_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_23);
            	    	    lv_resources_45_0=ruleResource();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"resources",
            	    	    												lv_resources_45_0,
            	    	    												"ca.mcgill.devops.pipeline.Pipeline.Resource");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);

            	    this_END_46=(Token)match(input,RULE_END,FOLLOW_4); 

            	    									newLeafNode(this_END_46, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_7_1_2());
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalPipelineParser.g:700:3: ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:700:3: ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) )
            	    // InternalPipelineParser.g:701:4: {...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalPipelineParser.g:701:102: ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) )
            	    // InternalPipelineParser.g:702:5: ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalPipelineParser.g:705:8: ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) )
            	    // InternalPipelineParser.g:705:9: {...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:705:18: (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) )
            	    // InternalPipelineParser.g:705:19: otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) )
            	    {
            	    otherlv_47=(Token)match(input,Version,FOLLOW_24); 

            	    								newLeafNode(otherlv_47, grammarAccess.getPipelineAccess().getVersionKeyword_8_0());
            	    							
            	    // InternalPipelineParser.g:709:8: ( (lv_version_48_0= RULE_VERSION ) )
            	    // InternalPipelineParser.g:710:9: (lv_version_48_0= RULE_VERSION )
            	    {
            	    // InternalPipelineParser.g:710:9: (lv_version_48_0= RULE_VERSION )
            	    // InternalPipelineParser.g:711:10: lv_version_48_0= RULE_VERSION
            	    {
            	    lv_version_48_0=(Token)match(input,RULE_VERSION,FOLLOW_4); 

            	    										newLeafNode(lv_version_48_0, grammarAccess.getPipelineAccess().getVersionVERSIONTerminalRuleCall_8_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPipelineRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"version",
            	    											lv_version_48_0,
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
            	case 10 :
            	    // InternalPipelineParser.g:733:3: ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) )
            	    {
            	    // InternalPipelineParser.g:733:3: ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) )
            	    // InternalPipelineParser.g:734:4: {...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalPipelineParser.g:734:102: ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) )
            	    // InternalPipelineParser.g:735:5: ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalPipelineParser.g:738:8: ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) )
            	    // InternalPipelineParser.g:738:9: {...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:738:18: (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* )
            	    // InternalPipelineParser.g:738:19: otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )*
            	    {
            	    otherlv_49=(Token)match(input,Variables,FOLLOW_25); 

            	    								newLeafNode(otherlv_49, grammarAccess.getPipelineAccess().getVariablesKeyword_9_0());
            	    							
            	    // InternalPipelineParser.g:742:8: ( (lv_variables_50_0= ruleVariable ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==HyphenMinus||LA16_0==RULE_BEGIN) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:743:9: (lv_variables_50_0= ruleVariable )
            	    	    {
            	    	    // InternalPipelineParser.g:743:9: (lv_variables_50_0= ruleVariable )
            	    	    // InternalPipelineParser.g:744:10: lv_variables_50_0= ruleVariable
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPipelineAccess().getVariablesVariableParserRuleCall_9_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_variables_50_0=ruleVariable();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"variables",
            	    	    											lv_variables_50_0,
            	    	    											"ca.mcgill.devops.pipeline.Pipeline.Variable");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalPipelineParser.g:767:3: ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:767:3: ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) )
            	    // InternalPipelineParser.g:768:4: {...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalPipelineParser.g:768:103: ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) )
            	    // InternalPipelineParser.g:769:5: ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10);
            	    				
            	    // InternalPipelineParser.g:772:8: ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) )
            	    // InternalPipelineParser.g:772:9: {...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:772:18: ( (lv_extendedParameter_51_0= ruleExtendedParameter ) )
            	    // InternalPipelineParser.g:772:19: (lv_extendedParameter_51_0= ruleExtendedParameter )
            	    {
            	    // InternalPipelineParser.g:772:19: (lv_extendedParameter_51_0= ruleExtendedParameter )
            	    // InternalPipelineParser.g:773:9: lv_extendedParameter_51_0= ruleExtendedParameter
            	    {

            	    									newCompositeNode(grammarAccess.getPipelineAccess().getExtendedParameterExtendedParameterParserRuleCall_10_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_extendedParameter_51_0=ruleExtendedParameter();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    									}
            	    									set(
            	    										current,
            	    										"extendedParameter",
            	    										lv_extendedParameter_51_0,
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
            	case 12 :
            	    // InternalPipelineParser.g:795:3: ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) )
            	    {
            	    // InternalPipelineParser.g:795:3: ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) )
            	    // InternalPipelineParser.g:796:4: {...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11)");
            	    }
            	    // InternalPipelineParser.g:796:103: ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) )
            	    // InternalPipelineParser.g:797:5: ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11);
            	    				
            	    // InternalPipelineParser.g:800:8: ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) )
            	    // InternalPipelineParser.g:800:9: {...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:800:18: ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job )
            	    // InternalPipelineParser.g:800:19: ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job
            	    {
            	    // InternalPipelineParser.g:800:19: ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==Parameters||LA17_0==Executors||LA17_0==Commands||LA17_0==Default||LA17_0==Orbs) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:801:9: (lv_pipelineParameters_52_0= rulePipelineParameter )
            	    	    {
            	    	    // InternalPipelineParser.g:801:9: (lv_pipelineParameters_52_0= rulePipelineParameter )
            	    	    // InternalPipelineParser.g:802:10: lv_pipelineParameters_52_0= rulePipelineParameter
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPipelineAccess().getPipelineParametersPipelineParameterParserRuleCall_11_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_pipelineParameters_52_0=rulePipelineParameter();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"pipelineParameters",
            	    	    											lv_pipelineParameters_52_0,
            	    	    											"ca.mcgill.devops.pipeline.Pipeline.PipelineParameter");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    // InternalPipelineParser.g:819:8: ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==On) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==Workflow_dispatch||LA23_0==Workflow_call||LA23_0==Workflow_run||LA23_0==Schedules||LA23_0==Schedule||LA23_0==Job||LA23_0==RULE_ID) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalPipelineParser.g:820:9: (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? )
            	            {
            	            // InternalPipelineParser.g:820:9: (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? )
            	            // InternalPipelineParser.g:821:10: otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )?
            	            {
            	            otherlv_53=(Token)match(input,On,FOLLOW_27); 

            	            										newLeafNode(otherlv_53, grammarAccess.getPipelineAccess().getOnKeyword_11_1_0_0());
            	            									
            	            // InternalPipelineParser.g:825:10: (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )?
            	            int alt19=2;
            	            int LA19_0 = input.LA(1);

            	            if ( (LA19_0==RULE_BEGIN) ) {
            	                alt19=1;
            	            }
            	            switch (alt19) {
            	                case 1 :
            	                    // InternalPipelineParser.g:826:11: this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END
            	                    {
            	                    this_BEGIN_54=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            	                    											newLeafNode(this_BEGIN_54, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_11_1_0_1_0());
            	                    										
            	                    // InternalPipelineParser.g:830:11: ( (lv_triggers_55_0= ruleEvent ) )+
            	                    int cnt18=0;
            	                    loop18:
            	                    do {
            	                        int alt18=2;
            	                        int LA18_0 = input.LA(1);

            	                        if ( (LA18_0==Workflow_dispatch||LA18_0==Workflow_call||LA18_0==Workflow_run||LA18_0==Schedules||LA18_0==Schedule||LA18_0==RULE_ID) ) {
            	                            alt18=1;
            	                        }


            	                        switch (alt18) {
            	                    	case 1 :
            	                    	    // InternalPipelineParser.g:831:12: (lv_triggers_55_0= ruleEvent )
            	                    	    {
            	                    	    // InternalPipelineParser.g:831:12: (lv_triggers_55_0= ruleEvent )
            	                    	    // InternalPipelineParser.g:832:13: lv_triggers_55_0= ruleEvent
            	                    	    {

            	                    	    													newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_11_1_0_1_1_0());
            	                    	    												
            	                    	    pushFollow(FOLLOW_29);
            	                    	    lv_triggers_55_0=ruleEvent();

            	                    	    state._fsp--;


            	                    	    													if (current==null) {
            	                    	    														current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    	    													}
            	                    	    													add(
            	                    	    														current,
            	                    	    														"triggers",
            	                    	    														lv_triggers_55_0,
            	                    	    														"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    	    													afterParserOrEnumRuleCall();
            	                    	    												

            	                    	    }


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

            	                    this_END_56=(Token)match(input,RULE_END,FOLLOW_30); 

            	                    											newLeafNode(this_END_56, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_11_1_0_1_2());
            	                    										

            	                    }
            	                    break;

            	            }

            	            // InternalPipelineParser.g:854:10: ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )?
            	            int alt21=3;
            	            int LA21_0 = input.LA(1);

            	            if ( (LA21_0==Workflow_dispatch||LA21_0==Workflow_call||LA21_0==Workflow_run||LA21_0==Schedules||LA21_0==Schedule||LA21_0==RULE_ID) ) {
            	                alt21=1;
            	            }
            	            else if ( (LA21_0==LeftSquareBracket) ) {
            	                alt21=2;
            	            }
            	            switch (alt21) {
            	                case 1 :
            	                    // InternalPipelineParser.g:855:11: ( (lv_triggers_57_0= ruleEvent ) )
            	                    {
            	                    // InternalPipelineParser.g:855:11: ( (lv_triggers_57_0= ruleEvent ) )
            	                    // InternalPipelineParser.g:856:12: (lv_triggers_57_0= ruleEvent )
            	                    {
            	                    // InternalPipelineParser.g:856:12: (lv_triggers_57_0= ruleEvent )
            	                    // InternalPipelineParser.g:857:13: lv_triggers_57_0= ruleEvent
            	                    {

            	                    													newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_11_1_0_2_0_0());
            	                    												
            	                    pushFollow(FOLLOW_31);
            	                    lv_triggers_57_0=ruleEvent();

            	                    state._fsp--;


            	                    													if (current==null) {
            	                    														current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    													}
            	                    													add(
            	                    														current,
            	                    														"triggers",
            	                    														lv_triggers_57_0,
            	                    														"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    													afterParserOrEnumRuleCall();
            	                    												

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalPipelineParser.g:875:11: (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket )
            	                    {
            	                    // InternalPipelineParser.g:875:11: (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket )
            	                    // InternalPipelineParser.g:876:12: otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket
            	                    {
            	                    otherlv_58=(Token)match(input,LeftSquareBracket,FOLLOW_28); 

            	                    												newLeafNode(otherlv_58, grammarAccess.getPipelineAccess().getLeftSquareBracketKeyword_11_1_0_2_1_0());
            	                    											
            	                    // InternalPipelineParser.g:880:12: ( (lv_triggers_59_0= ruleEvent ) )
            	                    // InternalPipelineParser.g:881:13: (lv_triggers_59_0= ruleEvent )
            	                    {
            	                    // InternalPipelineParser.g:881:13: (lv_triggers_59_0= ruleEvent )
            	                    // InternalPipelineParser.g:882:14: lv_triggers_59_0= ruleEvent
            	                    {

            	                    														newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_11_1_0_2_1_1_0());
            	                    													
            	                    pushFollow(FOLLOW_32);
            	                    lv_triggers_59_0=ruleEvent();

            	                    state._fsp--;


            	                    														if (current==null) {
            	                    															current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    														}
            	                    														add(
            	                    															current,
            	                    															"triggers",
            	                    															lv_triggers_59_0,
            	                    															"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    														afterParserOrEnumRuleCall();
            	                    													

            	                    }


            	                    }

            	                    // InternalPipelineParser.g:899:12: (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )*
            	                    loop20:
            	                    do {
            	                        int alt20=2;
            	                        int LA20_0 = input.LA(1);

            	                        if ( (LA20_0==Comma) ) {
            	                            alt20=1;
            	                        }


            	                        switch (alt20) {
            	                    	case 1 :
            	                    	    // InternalPipelineParser.g:900:13: otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) )
            	                    	    {
            	                    	    otherlv_60=(Token)match(input,Comma,FOLLOW_28); 

            	                    	    													newLeafNode(otherlv_60, grammarAccess.getPipelineAccess().getCommaKeyword_11_1_0_2_1_2_0());
            	                    	    												
            	                    	    // InternalPipelineParser.g:904:13: ( (lv_triggers_61_0= ruleEvent ) )
            	                    	    // InternalPipelineParser.g:905:14: (lv_triggers_61_0= ruleEvent )
            	                    	    {
            	                    	    // InternalPipelineParser.g:905:14: (lv_triggers_61_0= ruleEvent )
            	                    	    // InternalPipelineParser.g:906:15: lv_triggers_61_0= ruleEvent
            	                    	    {

            	                    	    															newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_11_1_0_2_1_2_1_0());
            	                    	    														
            	                    	    pushFollow(FOLLOW_32);
            	                    	    lv_triggers_61_0=ruleEvent();

            	                    	    state._fsp--;


            	                    	    															if (current==null) {
            	                    	    																current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    	    															}
            	                    	    															add(
            	                    	    																current,
            	                    	    																"triggers",
            	                    	    																lv_triggers_61_0,
            	                    	    																"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    	    															afterParserOrEnumRuleCall();
            	                    	    														

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop20;
            	                        }
            	                    } while (true);

            	                    otherlv_62=(Token)match(input,RightSquareBracket,FOLLOW_31); 

            	                    												newLeafNode(otherlv_62, grammarAccess.getPipelineAccess().getRightSquareBracketKeyword_11_1_0_2_1_3());
            	                    											

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:932:9: ( (lv_triggers_63_0= ruleEvent ) )*
            	            {
            	            // InternalPipelineParser.g:932:9: ( (lv_triggers_63_0= ruleEvent ) )*
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==Workflow_dispatch||LA22_0==Workflow_call||LA22_0==Workflow_run||LA22_0==Schedules||LA22_0==Schedule||LA22_0==RULE_ID) ) {
            	                    alt22=1;
            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:933:10: (lv_triggers_63_0= ruleEvent )
            	            	    {
            	            	    // InternalPipelineParser.g:933:10: (lv_triggers_63_0= ruleEvent )
            	            	    // InternalPipelineParser.g:934:11: lv_triggers_63_0= ruleEvent
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_11_1_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_33);
            	            	    lv_triggers_63_0=ruleEvent();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getPipelineRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"triggers",
            	            	    												lv_triggers_63_0,
            	            	    												"ca.mcgill.devops.pipeline.Pipeline.Event");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop22;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_64=(Token)match(input,Job,FOLLOW_4); 

            	    								newLeafNode(otherlv_64, grammarAccess.getPipelineAccess().getJobKeyword_11_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

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


    // $ANTLR start "entryRuleEvent"
    // InternalPipelineParser.g:973:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalPipelineParser.g:973:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalPipelineParser.g:974:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalPipelineParser.g:980:1: ruleEvent returns [EObject current=null] : ( ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) ) ) this_END_53= RULE_END )? ) | ( ( ( ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) ) ) ( (lv_triggerSchedules_55_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_57_0= ruleParameterValue ) )* ) ) ) ;
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
        Token this_BEGIN_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token this_END_24=null;
        Token otherlv_25=null;
        Token this_BEGIN_26=null;
        Token this_END_28=null;
        Token otherlv_29=null;
        Token this_BEGIN_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token this_END_36=null;
        Token otherlv_37=null;
        Token this_BEGIN_38=null;
        Token this_END_40=null;
        Token otherlv_41=null;
        Token this_BEGIN_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token this_END_48=null;
        Token otherlv_49=null;
        Token this_BEGIN_50=null;
        Token this_END_52=null;
        Token this_END_53=null;
        Token lv_name_54_1=null;
        Token lv_name_54_2=null;
        Token lv_name_56_1=null;
        Token lv_name_56_2=null;
        Token lv_name_56_3=null;
        EObject lv_includedBranches_2_0 = null;

        EObject lv_activities_5_0 = null;

        EObject lv_activities_7_0 = null;

        EObject lv_includedBranches_17_0 = null;

        EObject lv_includedBranches_19_0 = null;

        EObject lv_includedBranches_21_0 = null;

        EObject lv_excludedBranches_23_0 = null;

        EObject lv_excludedBranches_27_0 = null;

        AntlrDatatypeRuleToken lv_includedPaths_31_0 = null;

        AntlrDatatypeRuleToken lv_includedPaths_33_0 = null;

        AntlrDatatypeRuleToken lv_excludedPaths_35_0 = null;

        AntlrDatatypeRuleToken lv_excludedPaths_39_0 = null;

        AntlrDatatypeRuleToken lv_includedTags_43_0 = null;

        AntlrDatatypeRuleToken lv_includedTags_45_0 = null;

        AntlrDatatypeRuleToken lv_excludedTags_47_0 = null;

        AntlrDatatypeRuleToken lv_excludedTags_51_0 = null;

        EObject lv_triggerSchedules_55_0 = null;

        EObject lv_otherEventParameterValues_57_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:986:2: ( ( ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) ) ) this_END_53= RULE_END )? ) | ( ( ( ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) ) ) ( (lv_triggerSchedules_55_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_57_0= ruleParameterValue ) )* ) ) ) )
            // InternalPipelineParser.g:987:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) ) ) this_END_53= RULE_END )? ) | ( ( ( ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) ) ) ( (lv_triggerSchedules_55_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_57_0= ruleParameterValue ) )* ) ) )
            {
            // InternalPipelineParser.g:987:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) ) ) this_END_53= RULE_END )? ) | ( ( ( ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) ) ) ( (lv_triggerSchedules_55_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_57_0= ruleParameterValue ) )* ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==Workflow_dispatch||LA49_0==Workflow_call||LA49_0==Workflow_run||LA49_0==Schedules||LA49_0==Schedule) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalPipelineParser.g:988:3: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) ) ) this_END_53= RULE_END )? )
                    {
                    // InternalPipelineParser.g:988:3: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) ) ) this_END_53= RULE_END )? )
                    // InternalPipelineParser.g:989:4: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) ) ) this_END_53= RULE_END )?
                    {
                    // InternalPipelineParser.g:989:4: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? )
                    // InternalPipelineParser.g:990:5: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )?
                    {
                    // InternalPipelineParser.g:990:5: ( (lv_name_0_0= RULE_ID ) )
                    // InternalPipelineParser.g:991:6: (lv_name_0_0= RULE_ID )
                    {
                    // InternalPipelineParser.g:991:6: (lv_name_0_0= RULE_ID )
                    // InternalPipelineParser.g:992:7: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

                    // InternalPipelineParser.g:1008:5: (otherlv_1= Colon )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==Colon) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalPipelineParser.g:1009:6: otherlv_1= Colon
                            {
                            otherlv_1=(Token)match(input,Colon,FOLLOW_35); 

                            						newLeafNode(otherlv_1, grammarAccess.getEventAccess().getColonKeyword_0_0_1());
                            					

                            }
                            break;

                    }


                    }

                    // InternalPipelineParser.g:1015:4: ( (lv_includedBranches_2_0= ruleBranch ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==HyphenMinus||LA26_0==RULE_ID||LA26_0==RULE_STRING) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1016:5: (lv_includedBranches_2_0= ruleBranch )
                    	    {
                    	    // InternalPipelineParser.g:1016:5: (lv_includedBranches_2_0= ruleBranch )
                    	    // InternalPipelineParser.g:1017:6: lv_includedBranches_2_0= ruleBranch
                    	    {

                    	    						newCompositeNode(grammarAccess.getEventAccess().getIncludedBranchesBranchParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_35);
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
                    	    break loop26;
                        }
                    } while (true);

                    // InternalPipelineParser.g:1034:4: (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) ) ) this_END_53= RULE_END )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_BEGIN) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalPipelineParser.g:1035:5: this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) ) ) this_END_53= RULE_END
                            {
                            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

                            					newLeafNode(this_BEGIN_3, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_0());
                            				
                            // InternalPipelineParser.g:1039:5: ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )?
                            int alt27=3;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==Types) ) {
                                alt27=1;
                            }
                            else if ( (LA27_0==RULE_BEGIN) ) {
                                alt27=2;
                            }
                            switch (alt27) {
                                case 1 :
                                    // InternalPipelineParser.g:1040:6: (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) )
                                    {
                                    // InternalPipelineParser.g:1040:6: (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) )
                                    // InternalPipelineParser.g:1041:7: otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) )
                                    {
                                    otherlv_4=(Token)match(input,Types,FOLLOW_37); 

                                    							newLeafNode(otherlv_4, grammarAccess.getEventAccess().getTypesKeyword_0_2_1_0_0());
                                    						
                                    // InternalPipelineParser.g:1045:7: ( (lv_activities_5_0= ruleActivity ) )
                                    // InternalPipelineParser.g:1046:8: (lv_activities_5_0= ruleActivity )
                                    {
                                    // InternalPipelineParser.g:1046:8: (lv_activities_5_0= ruleActivity )
                                    // InternalPipelineParser.g:1047:9: lv_activities_5_0= ruleActivity
                                    {

                                    									newCompositeNode(grammarAccess.getEventAccess().getActivitiesActivityParserRuleCall_0_2_1_0_1_0());
                                    								
                                    pushFollow(FOLLOW_38);
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
                                    // InternalPipelineParser.g:1066:6: (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END )
                                    {
                                    // InternalPipelineParser.g:1066:6: (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END )
                                    // InternalPipelineParser.g:1067:7: this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END
                                    {
                                    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

                                    							newLeafNode(this_BEGIN_6, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_1_1_0());
                                    						
                                    // InternalPipelineParser.g:1071:7: ( (lv_activities_7_0= ruleActivity ) )
                                    // InternalPipelineParser.g:1072:8: (lv_activities_7_0= ruleActivity )
                                    {
                                    // InternalPipelineParser.g:1072:8: (lv_activities_7_0= ruleActivity )
                                    // InternalPipelineParser.g:1073:9: lv_activities_7_0= ruleActivity
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

                                    this_END_8=(Token)match(input,RULE_END,FOLLOW_38); 

                                    							newLeafNode(this_END_8, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_1_1_2());
                                    						

                                    }


                                    }
                                    break;

                            }

                            // InternalPipelineParser.g:1096:5: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) ) )
                            // InternalPipelineParser.g:1097:6: ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) )
                            {
                            // InternalPipelineParser.g:1097:6: ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* ) )
                            // InternalPipelineParser.g:1098:7: ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* )
                            {
                             
                            						  getUnorderedGroupHelper().enter(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            						
                            // InternalPipelineParser.g:1101:7: ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )* )
                            // InternalPipelineParser.g:1102:8: ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )*
                            {
                            // InternalPipelineParser.g:1102:8: ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )*
                            loop42:
                            do {
                                int alt42=10;
                                alt42 = dfa42.predict(input);
                                switch (alt42) {
                            	case 1 :
                            	    // InternalPipelineParser.g:1103:6: ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1103:6: ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) )
                            	    // InternalPipelineParser.g:1104:7: {...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 0) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 0)");
                            	    }
                            	    // InternalPipelineParser.g:1104:108: ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) )
                            	    // InternalPipelineParser.g:1105:8: ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 0);
                            	    							
                            	    // InternalPipelineParser.g:1108:11: ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) )
                            	    // InternalPipelineParser.g:1108:12: {...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1108:21: (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) )
                            	    // InternalPipelineParser.g:1108:22: otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) )
                            	    {
                            	    otherlv_10=(Token)match(input,Batch,FOLLOW_3); 

                            	    											newLeafNode(otherlv_10, grammarAccess.getEventAccess().getBatchKeyword_0_2_2_0_0());
                            	    										
                            	    // InternalPipelineParser.g:1112:11: ( (lv_batch_11_0= RULE_ID ) )
                            	    // InternalPipelineParser.g:1113:12: (lv_batch_11_0= RULE_ID )
                            	    {
                            	    // InternalPipelineParser.g:1113:12: (lv_batch_11_0= RULE_ID )
                            	    // InternalPipelineParser.g:1114:13: lv_batch_11_0= RULE_ID
                            	    {
                            	    lv_batch_11_0=(Token)match(input,RULE_ID,FOLLOW_38); 

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
                            	    // InternalPipelineParser.g:1136:6: ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1136:6: ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) )
                            	    // InternalPipelineParser.g:1137:7: {...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 1) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 1)");
                            	    }
                            	    // InternalPipelineParser.g:1137:108: ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) )
                            	    // InternalPipelineParser.g:1138:8: ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 1);
                            	    							
                            	    // InternalPipelineParser.g:1141:11: ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) )
                            	    // InternalPipelineParser.g:1141:12: {...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1141:21: (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) )
                            	    // InternalPipelineParser.g:1141:22: otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) )
                            	    {
                            	    otherlv_12=(Token)match(input,AutoCancel,FOLLOW_3); 

                            	    											newLeafNode(otherlv_12, grammarAccess.getEventAccess().getAutoCancelKeyword_0_2_2_1_0());
                            	    										
                            	    // InternalPipelineParser.g:1145:11: ( (lv_autoCancel_13_0= RULE_ID ) )
                            	    // InternalPipelineParser.g:1146:12: (lv_autoCancel_13_0= RULE_ID )
                            	    {
                            	    // InternalPipelineParser.g:1146:12: (lv_autoCancel_13_0= RULE_ID )
                            	    // InternalPipelineParser.g:1147:13: lv_autoCancel_13_0= RULE_ID
                            	    {
                            	    lv_autoCancel_13_0=(Token)match(input,RULE_ID,FOLLOW_38); 

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
                            	    // InternalPipelineParser.g:1169:6: ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1169:6: ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) )
                            	    // InternalPipelineParser.g:1170:7: {...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 2) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 2)");
                            	    }
                            	    // InternalPipelineParser.g:1170:108: ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) )
                            	    // InternalPipelineParser.g:1171:8: ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 2);
                            	    							
                            	    // InternalPipelineParser.g:1174:11: ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) )
                            	    // InternalPipelineParser.g:1174:12: {...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1174:21: (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) )
                            	    // InternalPipelineParser.g:1174:22: otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) )
                            	    {
                            	    otherlv_14=(Token)match(input,Drafts,FOLLOW_3); 

                            	    											newLeafNode(otherlv_14, grammarAccess.getEventAccess().getDraftsKeyword_0_2_2_2_0());
                            	    										
                            	    // InternalPipelineParser.g:1178:11: ( (lv_drafts_15_0= RULE_ID ) )
                            	    // InternalPipelineParser.g:1179:12: (lv_drafts_15_0= RULE_ID )
                            	    {
                            	    // InternalPipelineParser.g:1179:12: (lv_drafts_15_0= RULE_ID )
                            	    // InternalPipelineParser.g:1180:13: lv_drafts_15_0= RULE_ID
                            	    {
                            	    lv_drafts_15_0=(Token)match(input,RULE_ID,FOLLOW_38); 

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
                            	    // InternalPipelineParser.g:1202:6: ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1202:6: ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) )
                            	    // InternalPipelineParser.g:1203:7: {...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 3) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 3)");
                            	    }
                            	    // InternalPipelineParser.g:1203:108: ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:1204:8: ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 3);
                            	    							
                            	    // InternalPipelineParser.g:1207:11: ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:1207:12: {...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1207:21: (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) )
                            	    // InternalPipelineParser.g:1207:22: otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) )
                            	    {
                            	    otherlv_16=(Token)match(input,Branches,FOLLOW_39); 

                            	    											newLeafNode(otherlv_16, grammarAccess.getEventAccess().getBranchesKeyword_0_2_2_3_0());
                            	    										
                            	    // InternalPipelineParser.g:1211:11: ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) )
                            	    int alt34=2;
                            	    int LA34_0 = input.LA(1);

                            	    if ( (LA34_0==BranchesIgnore||LA34_0==PathsIgnore||(LA34_0>=TagsIgnore && LA34_0<=AutoCancel)||LA34_0==Branches||(LA34_0>=Drafts && LA34_0<=Batch)||LA34_0==Paths||LA34_0==Tags||LA34_0==HyphenMinus||(LA34_0>=RULE_END && LA34_0<=RULE_ID)||LA34_0==RULE_STRING) ) {
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
                            	            // InternalPipelineParser.g:1212:12: ( (lv_includedBranches_17_0= ruleBranch ) )*
                            	            {
                            	            // InternalPipelineParser.g:1212:12: ( (lv_includedBranches_17_0= ruleBranch ) )*
                            	            loop28:
                            	            do {
                            	                int alt28=2;
                            	                int LA28_0 = input.LA(1);

                            	                if ( (LA28_0==HyphenMinus||LA28_0==RULE_ID||LA28_0==RULE_STRING) ) {
                            	                    alt28=1;
                            	                }


                            	                switch (alt28) {
                            	            	case 1 :
                            	            	    // InternalPipelineParser.g:1213:13: (lv_includedBranches_17_0= ruleBranch )
                            	            	    {
                            	            	    // InternalPipelineParser.g:1213:13: (lv_includedBranches_17_0= ruleBranch )
                            	            	    // InternalPipelineParser.g:1214:14: lv_includedBranches_17_0= ruleBranch
                            	            	    {

                            	            	    														newCompositeNode(grammarAccess.getEventAccess().getIncludedBranchesBranchParserRuleCall_0_2_2_3_1_0_0());
                            	            	    													
                            	            	    pushFollow(FOLLOW_40);
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
                            	            	    break loop28;
                            	                }
                            	            } while (true);


                            	            }
                            	            break;
                            	        case 2 :
                            	            // InternalPipelineParser.g:1232:12: (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END )
                            	            {
                            	            // InternalPipelineParser.g:1232:12: (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END )
                            	            // InternalPipelineParser.g:1233:13: this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END
                            	            {
                            	            this_BEGIN_18=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

                            	            													newLeafNode(this_BEGIN_18, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_3_1_1_0());
                            	            												
                            	            // InternalPipelineParser.g:1237:13: ( (lv_includedBranches_19_0= ruleBranch ) )*
                            	            loop29:
                            	            do {
                            	                int alt29=2;
                            	                int LA29_0 = input.LA(1);

                            	                if ( (LA29_0==HyphenMinus||LA29_0==RULE_ID||LA29_0==RULE_STRING) ) {
                            	                    alt29=1;
                            	                }


                            	                switch (alt29) {
                            	            	case 1 :
                            	            	    // InternalPipelineParser.g:1238:14: (lv_includedBranches_19_0= ruleBranch )
                            	            	    {
                            	            	    // InternalPipelineParser.g:1238:14: (lv_includedBranches_19_0= ruleBranch )
                            	            	    // InternalPipelineParser.g:1239:15: lv_includedBranches_19_0= ruleBranch
                            	            	    {

                            	            	    															newCompositeNode(grammarAccess.getEventAccess().getIncludedBranchesBranchParserRuleCall_0_2_2_3_1_1_1_0());
                            	            	    														
                            	            	    pushFollow(FOLLOW_41);
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
                            	            	    break;

                            	            	default :
                            	            	    break loop29;
                            	                }
                            	            } while (true);

                            	            // InternalPipelineParser.g:1256:13: (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )?
                            	            int alt31=2;
                            	            int LA31_0 = input.LA(1);

                            	            if ( (LA31_0==Included) ) {
                            	                alt31=1;
                            	            }
                            	            switch (alt31) {
                            	                case 1 :
                            	                    // InternalPipelineParser.g:1257:14: otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )*
                            	                    {
                            	                    otherlv_20=(Token)match(input,Included,FOLLOW_42); 

                            	                    														newLeafNode(otherlv_20, grammarAccess.getEventAccess().getIncludedKeyword_0_2_2_3_1_1_2_0());
                            	                    													
                            	                    // InternalPipelineParser.g:1261:14: ( (lv_includedBranches_21_0= ruleBranch ) )*
                            	                    loop30:
                            	                    do {
                            	                        int alt30=2;
                            	                        int LA30_0 = input.LA(1);

                            	                        if ( (LA30_0==HyphenMinus||LA30_0==RULE_ID||LA30_0==RULE_STRING) ) {
                            	                            alt30=1;
                            	                        }


                            	                        switch (alt30) {
                            	                    	case 1 :
                            	                    	    // InternalPipelineParser.g:1262:15: (lv_includedBranches_21_0= ruleBranch )
                            	                    	    {
                            	                    	    // InternalPipelineParser.g:1262:15: (lv_includedBranches_21_0= ruleBranch )
                            	                    	    // InternalPipelineParser.g:1263:16: lv_includedBranches_21_0= ruleBranch
                            	                    	    {

                            	                    	    																newCompositeNode(grammarAccess.getEventAccess().getIncludedBranchesBranchParserRuleCall_0_2_2_3_1_1_2_1_0());
                            	                    	    															
                            	                    	    pushFollow(FOLLOW_42);
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
                            	                    	    break;

                            	                    	default :
                            	                    	    break loop30;
                            	                        }
                            	                    } while (true);


                            	                    }
                            	                    break;

                            	            }

                            	            // InternalPipelineParser.g:1281:13: (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )?
                            	            int alt33=2;
                            	            int LA33_0 = input.LA(1);

                            	            if ( (LA33_0==Excluded) ) {
                            	                alt33=1;
                            	            }
                            	            switch (alt33) {
                            	                case 1 :
                            	                    // InternalPipelineParser.g:1282:14: otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )*
                            	                    {
                            	                    otherlv_22=(Token)match(input,Excluded,FOLLOW_43); 

                            	                    														newLeafNode(otherlv_22, grammarAccess.getEventAccess().getExcludedKeyword_0_2_2_3_1_1_3_0());
                            	                    													
                            	                    // InternalPipelineParser.g:1286:14: ( (lv_excludedBranches_23_0= ruleBranch ) )*
                            	                    loop32:
                            	                    do {
                            	                        int alt32=2;
                            	                        int LA32_0 = input.LA(1);

                            	                        if ( (LA32_0==HyphenMinus||LA32_0==RULE_ID||LA32_0==RULE_STRING) ) {
                            	                            alt32=1;
                            	                        }


                            	                        switch (alt32) {
                            	                    	case 1 :
                            	                    	    // InternalPipelineParser.g:1287:15: (lv_excludedBranches_23_0= ruleBranch )
                            	                    	    {
                            	                    	    // InternalPipelineParser.g:1287:15: (lv_excludedBranches_23_0= ruleBranch )
                            	                    	    // InternalPipelineParser.g:1288:16: lv_excludedBranches_23_0= ruleBranch
                            	                    	    {

                            	                    	    																newCompositeNode(grammarAccess.getEventAccess().getExcludedBranchesBranchParserRuleCall_0_2_2_3_1_1_3_1_0());
                            	                    	    															
                            	                    	    pushFollow(FOLLOW_43);
                            	                    	    lv_excludedBranches_23_0=ruleBranch();

                            	                    	    state._fsp--;


                            	                    	    																if (current==null) {
                            	                    	    																	current = createModelElementForParent(grammarAccess.getEventRule());
                            	                    	    																}
                            	                    	    																add(
                            	                    	    																	current,
                            	                    	    																	"excludedBranches",
                            	                    	    																	lv_excludedBranches_23_0,
                            	                    	    																	"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	                    	    																afterParserOrEnumRuleCall();
                            	                    	    															

                            	                    	    }


                            	                    	    }
                            	                    	    break;

                            	                    	default :
                            	                    	    break loop32;
                            	                        }
                            	                    } while (true);


                            	                    }
                            	                    break;

                            	            }

                            	            this_END_24=(Token)match(input,RULE_END,FOLLOW_38); 

                            	            													newLeafNode(this_END_24, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_3_1_1_4());
                            	            												

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
                            	    // InternalPipelineParser.g:1318:6: ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1318:6: ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:1319:7: {...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 4) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 4)");
                            	    }
                            	    // InternalPipelineParser.g:1319:108: ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:1320:8: ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 4);
                            	    							
                            	    // InternalPipelineParser.g:1323:11: ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) )
                            	    // InternalPipelineParser.g:1323:12: {...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1323:21: (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) )
                            	    // InternalPipelineParser.g:1323:22: otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END )
                            	    {
                            	    otherlv_25=(Token)match(input,BranchesIgnore,FOLLOW_5); 

                            	    											newLeafNode(otherlv_25, grammarAccess.getEventAccess().getBranchesIgnoreKeyword_0_2_2_4_0());
                            	    										
                            	    // InternalPipelineParser.g:1327:11: (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END )
                            	    // InternalPipelineParser.g:1328:12: this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END
                            	    {
                            	    this_BEGIN_26=(Token)match(input,RULE_BEGIN,FOLLOW_43); 

                            	    												newLeafNode(this_BEGIN_26, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_4_1_0());
                            	    											
                            	    // InternalPipelineParser.g:1332:12: ( (lv_excludedBranches_27_0= ruleBranch ) )*
                            	    loop35:
                            	    do {
                            	        int alt35=2;
                            	        int LA35_0 = input.LA(1);

                            	        if ( (LA35_0==HyphenMinus||LA35_0==RULE_ID||LA35_0==RULE_STRING) ) {
                            	            alt35=1;
                            	        }


                            	        switch (alt35) {
                            	    	case 1 :
                            	    	    // InternalPipelineParser.g:1333:13: (lv_excludedBranches_27_0= ruleBranch )
                            	    	    {
                            	    	    // InternalPipelineParser.g:1333:13: (lv_excludedBranches_27_0= ruleBranch )
                            	    	    // InternalPipelineParser.g:1334:14: lv_excludedBranches_27_0= ruleBranch
                            	    	    {

                            	    	    														newCompositeNode(grammarAccess.getEventAccess().getExcludedBranchesBranchParserRuleCall_0_2_2_4_1_1_0());
                            	    	    													
                            	    	    pushFollow(FOLLOW_43);
                            	    	    lv_excludedBranches_27_0=ruleBranch();

                            	    	    state._fsp--;


                            	    	    														if (current==null) {
                            	    	    															current = createModelElementForParent(grammarAccess.getEventRule());
                            	    	    														}
                            	    	    														add(
                            	    	    															current,
                            	    	    															"excludedBranches",
                            	    	    															lv_excludedBranches_27_0,
                            	    	    															"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	    	    														afterParserOrEnumRuleCall();
                            	    	    													

                            	    	    }


                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop35;
                            	        }
                            	    } while (true);

                            	    this_END_28=(Token)match(input,RULE_END,FOLLOW_38); 

                            	    												newLeafNode(this_END_28, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_4_1_2());
                            	    											

                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 6 :
                            	    // InternalPipelineParser.g:1362:6: ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1362:6: ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:1363:7: {...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 5) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 5)");
                            	    }
                            	    // InternalPipelineParser.g:1363:108: ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:1364:8: ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 5);
                            	    							
                            	    // InternalPipelineParser.g:1367:11: ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) )
                            	    // InternalPipelineParser.g:1367:12: {...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1367:21: (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) )
                            	    // InternalPipelineParser.g:1367:22: otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END )
                            	    {
                            	    otherlv_29=(Token)match(input,Paths,FOLLOW_5); 

                            	    											newLeafNode(otherlv_29, grammarAccess.getEventAccess().getPathsKeyword_0_2_2_5_0());
                            	    										
                            	    // InternalPipelineParser.g:1371:11: (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END )
                            	    // InternalPipelineParser.g:1372:12: this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END
                            	    {
                            	    this_BEGIN_30=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

                            	    												newLeafNode(this_BEGIN_30, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_5_1_0());
                            	    											
                            	    // InternalPipelineParser.g:1376:12: ( (lv_includedPaths_31_0= ruleHyphenValues ) )?
                            	    int alt36=2;
                            	    int LA36_0 = input.LA(1);

                            	    if ( (LA36_0==HyphenMinus||LA36_0==RULE_BEGIN) ) {
                            	        alt36=1;
                            	    }
                            	    switch (alt36) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:1377:13: (lv_includedPaths_31_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:1377:13: (lv_includedPaths_31_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:1378:14: lv_includedPaths_31_0= ruleHyphenValues
                            	            {

                            	            														newCompositeNode(grammarAccess.getEventAccess().getIncludedPathsHyphenValuesParserRuleCall_0_2_2_5_1_1_0());
                            	            													
                            	            pushFollow(FOLLOW_45);
                            	            lv_includedPaths_31_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            														if (current==null) {
                            	            															current = createModelElementForParent(grammarAccess.getEventRule());
                            	            														}
                            	            														add(
                            	            															current,
                            	            															"includedPaths",
                            	            															lv_includedPaths_31_0,
                            	            															"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            														afterParserOrEnumRuleCall();
                            	            													

                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:1395:12: (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )?
                            	    int alt37=2;
                            	    int LA37_0 = input.LA(1);

                            	    if ( (LA37_0==Included) ) {
                            	        alt37=1;
                            	    }
                            	    switch (alt37) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:1396:13: otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) )
                            	            {
                            	            otherlv_32=(Token)match(input,Included,FOLLOW_22); 

                            	            													newLeafNode(otherlv_32, grammarAccess.getEventAccess().getIncludedKeyword_0_2_2_5_1_2_0());
                            	            												
                            	            // InternalPipelineParser.g:1400:13: ( (lv_includedPaths_33_0= ruleHyphenValues ) )
                            	            // InternalPipelineParser.g:1401:14: (lv_includedPaths_33_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:1401:14: (lv_includedPaths_33_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:1402:15: lv_includedPaths_33_0= ruleHyphenValues
                            	            {

                            	            															newCompositeNode(grammarAccess.getEventAccess().getIncludedPathsHyphenValuesParserRuleCall_0_2_2_5_1_2_1_0());
                            	            														
                            	            pushFollow(FOLLOW_46);
                            	            lv_includedPaths_33_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            															if (current==null) {
                            	            																current = createModelElementForParent(grammarAccess.getEventRule());
                            	            															}
                            	            															add(
                            	            																current,
                            	            																"includedPaths",
                            	            																lv_includedPaths_33_0,
                            	            																"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            															afterParserOrEnumRuleCall();
                            	            														

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:1420:12: (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )?
                            	    int alt38=2;
                            	    int LA38_0 = input.LA(1);

                            	    if ( (LA38_0==Excluded) ) {
                            	        alt38=1;
                            	    }
                            	    switch (alt38) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:1421:13: otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) )
                            	            {
                            	            otherlv_34=(Token)match(input,Excluded,FOLLOW_22); 

                            	            													newLeafNode(otherlv_34, grammarAccess.getEventAccess().getExcludedKeyword_0_2_2_5_1_3_0());
                            	            												
                            	            // InternalPipelineParser.g:1425:13: ( (lv_excludedPaths_35_0= ruleHyphenValues ) )
                            	            // InternalPipelineParser.g:1426:14: (lv_excludedPaths_35_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:1426:14: (lv_excludedPaths_35_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:1427:15: lv_excludedPaths_35_0= ruleHyphenValues
                            	            {

                            	            															newCompositeNode(grammarAccess.getEventAccess().getExcludedPathsHyphenValuesParserRuleCall_0_2_2_5_1_3_1_0());
                            	            														
                            	            pushFollow(FOLLOW_9);
                            	            lv_excludedPaths_35_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            															if (current==null) {
                            	            																current = createModelElementForParent(grammarAccess.getEventRule());
                            	            															}
                            	            															add(
                            	            																current,
                            	            																"excludedPaths",
                            	            																lv_excludedPaths_35_0,
                            	            																"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            															afterParserOrEnumRuleCall();
                            	            														

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }

                            	    this_END_36=(Token)match(input,RULE_END,FOLLOW_38); 

                            	    												newLeafNode(this_END_36, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_5_1_4());
                            	    											

                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 7 :
                            	    // InternalPipelineParser.g:1456:6: ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1456:6: ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:1457:7: {...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 6) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 6)");
                            	    }
                            	    // InternalPipelineParser.g:1457:108: ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:1458:8: ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 6);
                            	    							
                            	    // InternalPipelineParser.g:1461:11: ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) )
                            	    // InternalPipelineParser.g:1461:12: {...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1461:21: (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) )
                            	    // InternalPipelineParser.g:1461:22: otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END )
                            	    {
                            	    otherlv_37=(Token)match(input,PathsIgnore,FOLLOW_5); 

                            	    											newLeafNode(otherlv_37, grammarAccess.getEventAccess().getPathsIgnoreKeyword_0_2_2_6_0());
                            	    										
                            	    // InternalPipelineParser.g:1465:11: (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END )
                            	    // InternalPipelineParser.g:1466:12: this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END
                            	    {
                            	    this_BEGIN_38=(Token)match(input,RULE_BEGIN,FOLLOW_22); 

                            	    												newLeafNode(this_BEGIN_38, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_6_1_0());
                            	    											
                            	    // InternalPipelineParser.g:1470:12: ( (lv_excludedPaths_39_0= ruleHyphenValues ) )
                            	    // InternalPipelineParser.g:1471:13: (lv_excludedPaths_39_0= ruleHyphenValues )
                            	    {
                            	    // InternalPipelineParser.g:1471:13: (lv_excludedPaths_39_0= ruleHyphenValues )
                            	    // InternalPipelineParser.g:1472:14: lv_excludedPaths_39_0= ruleHyphenValues
                            	    {

                            	    														newCompositeNode(grammarAccess.getEventAccess().getExcludedPathsHyphenValuesParserRuleCall_0_2_2_6_1_1_0());
                            	    													
                            	    pushFollow(FOLLOW_9);
                            	    lv_excludedPaths_39_0=ruleHyphenValues();

                            	    state._fsp--;


                            	    														if (current==null) {
                            	    															current = createModelElementForParent(grammarAccess.getEventRule());
                            	    														}
                            	    														add(
                            	    															current,
                            	    															"excludedPaths",
                            	    															lv_excludedPaths_39_0,
                            	    															"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	    														afterParserOrEnumRuleCall();
                            	    													

                            	    }


                            	    }

                            	    this_END_40=(Token)match(input,RULE_END,FOLLOW_38); 

                            	    												newLeafNode(this_END_40, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_6_1_2());
                            	    											

                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 8 :
                            	    // InternalPipelineParser.g:1500:6: ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1500:6: ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:1501:7: {...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 7) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 7)");
                            	    }
                            	    // InternalPipelineParser.g:1501:108: ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:1502:8: ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 7);
                            	    							
                            	    // InternalPipelineParser.g:1505:11: ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) )
                            	    // InternalPipelineParser.g:1505:12: {...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1505:21: (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) )
                            	    // InternalPipelineParser.g:1505:22: otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END )
                            	    {
                            	    otherlv_41=(Token)match(input,Tags,FOLLOW_5); 

                            	    											newLeafNode(otherlv_41, grammarAccess.getEventAccess().getTagsKeyword_0_2_2_7_0());
                            	    										
                            	    // InternalPipelineParser.g:1509:11: (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END )
                            	    // InternalPipelineParser.g:1510:12: this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END
                            	    {
                            	    this_BEGIN_42=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

                            	    												newLeafNode(this_BEGIN_42, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_7_1_0());
                            	    											
                            	    // InternalPipelineParser.g:1514:12: ( (lv_includedTags_43_0= ruleHyphenValues ) )?
                            	    int alt39=2;
                            	    int LA39_0 = input.LA(1);

                            	    if ( (LA39_0==HyphenMinus||LA39_0==RULE_BEGIN) ) {
                            	        alt39=1;
                            	    }
                            	    switch (alt39) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:1515:13: (lv_includedTags_43_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:1515:13: (lv_includedTags_43_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:1516:14: lv_includedTags_43_0= ruleHyphenValues
                            	            {

                            	            														newCompositeNode(grammarAccess.getEventAccess().getIncludedTagsHyphenValuesParserRuleCall_0_2_2_7_1_1_0());
                            	            													
                            	            pushFollow(FOLLOW_45);
                            	            lv_includedTags_43_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            														if (current==null) {
                            	            															current = createModelElementForParent(grammarAccess.getEventRule());
                            	            														}
                            	            														add(
                            	            															current,
                            	            															"includedTags",
                            	            															lv_includedTags_43_0,
                            	            															"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            														afterParserOrEnumRuleCall();
                            	            													

                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:1533:12: (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )?
                            	    int alt40=2;
                            	    int LA40_0 = input.LA(1);

                            	    if ( (LA40_0==Included) ) {
                            	        alt40=1;
                            	    }
                            	    switch (alt40) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:1534:13: otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) )
                            	            {
                            	            otherlv_44=(Token)match(input,Included,FOLLOW_22); 

                            	            													newLeafNode(otherlv_44, grammarAccess.getEventAccess().getIncludedKeyword_0_2_2_7_1_2_0());
                            	            												
                            	            // InternalPipelineParser.g:1538:13: ( (lv_includedTags_45_0= ruleHyphenValues ) )
                            	            // InternalPipelineParser.g:1539:14: (lv_includedTags_45_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:1539:14: (lv_includedTags_45_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:1540:15: lv_includedTags_45_0= ruleHyphenValues
                            	            {

                            	            															newCompositeNode(grammarAccess.getEventAccess().getIncludedTagsHyphenValuesParserRuleCall_0_2_2_7_1_2_1_0());
                            	            														
                            	            pushFollow(FOLLOW_46);
                            	            lv_includedTags_45_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            															if (current==null) {
                            	            																current = createModelElementForParent(grammarAccess.getEventRule());
                            	            															}
                            	            															add(
                            	            																current,
                            	            																"includedTags",
                            	            																lv_includedTags_45_0,
                            	            																"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            															afterParserOrEnumRuleCall();
                            	            														

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:1558:12: (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )?
                            	    int alt41=2;
                            	    int LA41_0 = input.LA(1);

                            	    if ( (LA41_0==Excluded) ) {
                            	        alt41=1;
                            	    }
                            	    switch (alt41) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:1559:13: otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) )
                            	            {
                            	            otherlv_46=(Token)match(input,Excluded,FOLLOW_22); 

                            	            													newLeafNode(otherlv_46, grammarAccess.getEventAccess().getExcludedKeyword_0_2_2_7_1_3_0());
                            	            												
                            	            // InternalPipelineParser.g:1563:13: ( (lv_excludedTags_47_0= ruleHyphenValues ) )
                            	            // InternalPipelineParser.g:1564:14: (lv_excludedTags_47_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:1564:14: (lv_excludedTags_47_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:1565:15: lv_excludedTags_47_0= ruleHyphenValues
                            	            {

                            	            															newCompositeNode(grammarAccess.getEventAccess().getExcludedTagsHyphenValuesParserRuleCall_0_2_2_7_1_3_1_0());
                            	            														
                            	            pushFollow(FOLLOW_9);
                            	            lv_excludedTags_47_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            															if (current==null) {
                            	            																current = createModelElementForParent(grammarAccess.getEventRule());
                            	            															}
                            	            															add(
                            	            																current,
                            	            																"excludedTags",
                            	            																lv_excludedTags_47_0,
                            	            																"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            															afterParserOrEnumRuleCall();
                            	            														

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }

                            	    this_END_48=(Token)match(input,RULE_END,FOLLOW_38); 

                            	    												newLeafNode(this_END_48, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_7_1_4());
                            	    											

                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 9 :
                            	    // InternalPipelineParser.g:1594:6: ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1594:6: ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:1595:7: {...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 8) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 8)");
                            	    }
                            	    // InternalPipelineParser.g:1595:108: ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:1596:8: ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 8);
                            	    							
                            	    // InternalPipelineParser.g:1599:11: ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) )
                            	    // InternalPipelineParser.g:1599:12: {...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1599:21: (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) )
                            	    // InternalPipelineParser.g:1599:22: otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END )
                            	    {
                            	    otherlv_49=(Token)match(input,TagsIgnore,FOLLOW_5); 

                            	    											newLeafNode(otherlv_49, grammarAccess.getEventAccess().getTagsIgnoreKeyword_0_2_2_8_0());
                            	    										
                            	    // InternalPipelineParser.g:1603:11: (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END )
                            	    // InternalPipelineParser.g:1604:12: this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END
                            	    {
                            	    this_BEGIN_50=(Token)match(input,RULE_BEGIN,FOLLOW_22); 

                            	    												newLeafNode(this_BEGIN_50, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_8_1_0());
                            	    											
                            	    // InternalPipelineParser.g:1608:12: ( (lv_excludedTags_51_0= ruleHyphenValues ) )
                            	    // InternalPipelineParser.g:1609:13: (lv_excludedTags_51_0= ruleHyphenValues )
                            	    {
                            	    // InternalPipelineParser.g:1609:13: (lv_excludedTags_51_0= ruleHyphenValues )
                            	    // InternalPipelineParser.g:1610:14: lv_excludedTags_51_0= ruleHyphenValues
                            	    {

                            	    														newCompositeNode(grammarAccess.getEventAccess().getExcludedTagsHyphenValuesParserRuleCall_0_2_2_8_1_1_0());
                            	    													
                            	    pushFollow(FOLLOW_9);
                            	    lv_excludedTags_51_0=ruleHyphenValues();

                            	    state._fsp--;


                            	    														if (current==null) {
                            	    															current = createModelElementForParent(grammarAccess.getEventRule());
                            	    														}
                            	    														add(
                            	    															current,
                            	    															"excludedTags",
                            	    															lv_excludedTags_51_0,
                            	    															"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	    														afterParserOrEnumRuleCall();
                            	    													

                            	    }


                            	    }

                            	    this_END_52=(Token)match(input,RULE_END,FOLLOW_38); 

                            	    												newLeafNode(this_END_52, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_8_1_2());
                            	    											

                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);


                            }


                            }

                             
                            						  getUnorderedGroupHelper().leave(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            						

                            }

                            this_END_53=(Token)match(input,RULE_END,FOLLOW_2); 

                            					newLeafNode(this_END_53, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1652:3: ( ( ( ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) ) ) ( (lv_triggerSchedules_55_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_57_0= ruleParameterValue ) )* ) )
                    {
                    // InternalPipelineParser.g:1652:3: ( ( ( ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) ) ) ( (lv_triggerSchedules_55_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_57_0= ruleParameterValue ) )* ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==Schedules||LA48_0==Schedule) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==Workflow_dispatch||LA48_0==Workflow_call||LA48_0==Workflow_run) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalPipelineParser.g:1653:4: ( ( ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) ) ) ( (lv_triggerSchedules_55_0= ruleTriggerSchedule ) )* )
                            {
                            // InternalPipelineParser.g:1653:4: ( ( ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) ) ) ( (lv_triggerSchedules_55_0= ruleTriggerSchedule ) )* )
                            // InternalPipelineParser.g:1654:5: ( ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) ) ) ( (lv_triggerSchedules_55_0= ruleTriggerSchedule ) )*
                            {
                            // InternalPipelineParser.g:1654:5: ( ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) ) )
                            // InternalPipelineParser.g:1655:6: ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) )
                            {
                            // InternalPipelineParser.g:1655:6: ( (lv_name_54_1= Schedules | lv_name_54_2= Schedule ) )
                            // InternalPipelineParser.g:1656:7: (lv_name_54_1= Schedules | lv_name_54_2= Schedule )
                            {
                            // InternalPipelineParser.g:1656:7: (lv_name_54_1= Schedules | lv_name_54_2= Schedule )
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==Schedules) ) {
                                alt44=1;
                            }
                            else if ( (LA44_0==Schedule) ) {
                                alt44=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 44, 0, input);

                                throw nvae;
                            }
                            switch (alt44) {
                                case 1 :
                                    // InternalPipelineParser.g:1657:8: lv_name_54_1= Schedules
                                    {
                                    lv_name_54_1=(Token)match(input,Schedules,FOLLOW_47); 

                                    								newLeafNode(lv_name_54_1, grammarAccess.getEventAccess().getNameSchedulesKeyword_1_0_0_0_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEventRule());
                                    								}
                                    								setWithLastConsumed(current, "name", lv_name_54_1, null);
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalPipelineParser.g:1668:8: lv_name_54_2= Schedule
                                    {
                                    lv_name_54_2=(Token)match(input,Schedule,FOLLOW_47); 

                                    								newLeafNode(lv_name_54_2, grammarAccess.getEventAccess().getNameScheduleKeyword_1_0_0_0_1());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEventRule());
                                    								}
                                    								setWithLastConsumed(current, "name", lv_name_54_2, null);
                                    							

                                    }
                                    break;

                            }


                            }


                            }

                            // InternalPipelineParser.g:1681:5: ( (lv_triggerSchedules_55_0= ruleTriggerSchedule ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==HyphenMinus||LA45_0==RULE_BEGIN) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalPipelineParser.g:1682:6: (lv_triggerSchedules_55_0= ruleTriggerSchedule )
                            	    {
                            	    // InternalPipelineParser.g:1682:6: (lv_triggerSchedules_55_0= ruleTriggerSchedule )
                            	    // InternalPipelineParser.g:1683:7: lv_triggerSchedules_55_0= ruleTriggerSchedule
                            	    {

                            	    							newCompositeNode(grammarAccess.getEventAccess().getTriggerSchedulesTriggerScheduleParserRuleCall_1_0_1_0());
                            	    						
                            	    pushFollow(FOLLOW_47);
                            	    lv_triggerSchedules_55_0=ruleTriggerSchedule();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getEventRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"triggerSchedules",
                            	    								lv_triggerSchedules_55_0,
                            	    								"ca.mcgill.devops.pipeline.Pipeline.TriggerSchedule");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:1702:4: ( ( ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_57_0= ruleParameterValue ) )* )
                            {
                            // InternalPipelineParser.g:1702:4: ( ( ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_57_0= ruleParameterValue ) )* )
                            // InternalPipelineParser.g:1703:5: ( ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_57_0= ruleParameterValue ) )*
                            {
                            // InternalPipelineParser.g:1703:5: ( ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) ) )
                            // InternalPipelineParser.g:1704:6: ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) )
                            {
                            // InternalPipelineParser.g:1704:6: ( (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch ) )
                            // InternalPipelineParser.g:1705:7: (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch )
                            {
                            // InternalPipelineParser.g:1705:7: (lv_name_56_1= Workflow_call | lv_name_56_2= Workflow_run | lv_name_56_3= Workflow_dispatch )
                            int alt46=3;
                            switch ( input.LA(1) ) {
                            case Workflow_call:
                                {
                                alt46=1;
                                }
                                break;
                            case Workflow_run:
                                {
                                alt46=2;
                                }
                                break;
                            case Workflow_dispatch:
                                {
                                alt46=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 46, 0, input);

                                throw nvae;
                            }

                            switch (alt46) {
                                case 1 :
                                    // InternalPipelineParser.g:1706:8: lv_name_56_1= Workflow_call
                                    {
                                    lv_name_56_1=(Token)match(input,Workflow_call,FOLLOW_48); 

                                    								newLeafNode(lv_name_56_1, grammarAccess.getEventAccess().getNameWorkflow_callKeyword_1_1_0_0_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEventRule());
                                    								}
                                    								setWithLastConsumed(current, "name", lv_name_56_1, null);
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalPipelineParser.g:1717:8: lv_name_56_2= Workflow_run
                                    {
                                    lv_name_56_2=(Token)match(input,Workflow_run,FOLLOW_48); 

                                    								newLeafNode(lv_name_56_2, grammarAccess.getEventAccess().getNameWorkflow_runKeyword_1_1_0_0_1());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEventRule());
                                    								}
                                    								setWithLastConsumed(current, "name", lv_name_56_2, null);
                                    							

                                    }
                                    break;
                                case 3 :
                                    // InternalPipelineParser.g:1728:8: lv_name_56_3= Workflow_dispatch
                                    {
                                    lv_name_56_3=(Token)match(input,Workflow_dispatch,FOLLOW_48); 

                                    								newLeafNode(lv_name_56_3, grammarAccess.getEventAccess().getNameWorkflow_dispatchKeyword_1_1_0_0_2());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEventRule());
                                    								}
                                    								setWithLastConsumed(current, "name", lv_name_56_3, null);
                                    							

                                    }
                                    break;

                            }


                            }


                            }

                            // InternalPipelineParser.g:1741:5: ( (lv_otherEventParameterValues_57_0= ruleParameterValue ) )*
                            loop47:
                            do {
                                int alt47=2;
                                alt47 = dfa47.predict(input);
                                switch (alt47) {
                            	case 1 :
                            	    // InternalPipelineParser.g:1742:6: (lv_otherEventParameterValues_57_0= ruleParameterValue )
                            	    {
                            	    // InternalPipelineParser.g:1742:6: (lv_otherEventParameterValues_57_0= ruleParameterValue )
                            	    // InternalPipelineParser.g:1743:7: lv_otherEventParameterValues_57_0= ruleParameterValue
                            	    {

                            	    							newCompositeNode(grammarAccess.getEventAccess().getOtherEventParameterValuesParameterValueParserRuleCall_1_1_1_0());
                            	    						
                            	    pushFollow(FOLLOW_48);
                            	    lv_otherEventParameterValues_57_0=ruleParameterValue();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getEventRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"otherEventParameterValues",
                            	    								lv_otherEventParameterValues_57_0,
                            	    								"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop47;
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
    // InternalPipelineParser.g:1766:1: entryRuleTriggerSchedule returns [EObject current=null] : iv_ruleTriggerSchedule= ruleTriggerSchedule EOF ;
    public final EObject entryRuleTriggerSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerSchedule = null;


        try {
            // InternalPipelineParser.g:1766:56: (iv_ruleTriggerSchedule= ruleTriggerSchedule EOF )
            // InternalPipelineParser.g:1767:2: iv_ruleTriggerSchedule= ruleTriggerSchedule EOF
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
    // InternalPipelineParser.g:1773:1: ruleTriggerSchedule returns [EObject current=null] : ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? ) ;
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
            // InternalPipelineParser.g:1779:2: ( ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? ) )
            // InternalPipelineParser.g:1780:2: ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? )
            {
            // InternalPipelineParser.g:1780:2: ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? )
            // InternalPipelineParser.g:1781:3: ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )?
            {
            // InternalPipelineParser.g:1781:3: ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==HyphenMinus) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_BEGIN) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalPipelineParser.g:1782:4: (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) )
                    {
                    // InternalPipelineParser.g:1782:4: (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) )
                    // InternalPipelineParser.g:1783:5: otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_49); 

                    					newLeafNode(otherlv_0, grammarAccess.getTriggerScheduleAccess().getHyphenMinusKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,Cron,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getTriggerScheduleAccess().getCronKeyword_0_0_1());
                    				
                    // InternalPipelineParser.g:1791:5: ( (lv_cronValue_2_0= RULE_STRING ) )
                    // InternalPipelineParser.g:1792:6: (lv_cronValue_2_0= RULE_STRING )
                    {
                    // InternalPipelineParser.g:1792:6: (lv_cronValue_2_0= RULE_STRING )
                    // InternalPipelineParser.g:1793:7: lv_cronValue_2_0= RULE_STRING
                    {
                    lv_cronValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

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
                    // InternalPipelineParser.g:1811:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END )
                    {
                    // InternalPipelineParser.g:1811:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END )
                    // InternalPipelineParser.g:1812:5: this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

                    					newLeafNode(this_BEGIN_3, grammarAccess.getTriggerScheduleAccess().getBEGINTerminalRuleCall_0_1_0());
                    				
                    // InternalPipelineParser.g:1816:5: (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) )
                    // InternalPipelineParser.g:1817:6: otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_49); 

                    						newLeafNode(otherlv_4, grammarAccess.getTriggerScheduleAccess().getHyphenMinusKeyword_0_1_1_0());
                    					
                    otherlv_5=(Token)match(input,Cron,FOLLOW_8); 

                    						newLeafNode(otherlv_5, grammarAccess.getTriggerScheduleAccess().getCronKeyword_0_1_1_1());
                    					
                    // InternalPipelineParser.g:1825:6: ( (lv_cronValue_6_0= RULE_STRING ) )
                    // InternalPipelineParser.g:1826:7: (lv_cronValue_6_0= RULE_STRING )
                    {
                    // InternalPipelineParser.g:1826:7: (lv_cronValue_6_0= RULE_STRING )
                    // InternalPipelineParser.g:1827:8: lv_cronValue_6_0= RULE_STRING
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

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_50); 

                    					newLeafNode(this_END_7, grammarAccess.getTriggerScheduleAccess().getENDTerminalRuleCall_0_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalPipelineParser.g:1850:3: (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_BEGIN) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==DisplayName||LA57_1==Branches) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // InternalPipelineParser.g:1851:4: this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END
                    {
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_52); 

                    				newLeafNode(this_BEGIN_8, grammarAccess.getTriggerScheduleAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:1855:4: (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==DisplayName) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalPipelineParser.g:1856:5: otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) )
                            {
                            otherlv_9=(Token)match(input,DisplayName,FOLLOW_3); 

                            					newLeafNode(otherlv_9, grammarAccess.getTriggerScheduleAccess().getDisplayNameKeyword_1_1_0());
                            				
                            // InternalPipelineParser.g:1860:5: ( (lv_displayName_10_0= ruleUnquotedString ) )
                            // InternalPipelineParser.g:1861:6: (lv_displayName_10_0= ruleUnquotedString )
                            {
                            // InternalPipelineParser.g:1861:6: (lv_displayName_10_0= ruleUnquotedString )
                            // InternalPipelineParser.g:1862:7: lv_displayName_10_0= ruleUnquotedString
                            {

                            							newCompositeNode(grammarAccess.getTriggerScheduleAccess().getDisplayNameUnquotedStringParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_53);
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

                    // InternalPipelineParser.g:1880:4: (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) )
                    // InternalPipelineParser.g:1881:5: otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END )
                    {
                    otherlv_11=(Token)match(input,Branches,FOLLOW_5); 

                    					newLeafNode(otherlv_11, grammarAccess.getTriggerScheduleAccess().getBranchesKeyword_1_2_0());
                    				
                    // InternalPipelineParser.g:1885:5: (this_BEGIN_12= RULE_BEGIN (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END )
                    // InternalPipelineParser.g:1886:6: this_BEGIN_12= RULE_BEGIN (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END
                    {
                    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_45); 

                    						newLeafNode(this_BEGIN_12, grammarAccess.getTriggerScheduleAccess().getBEGINTerminalRuleCall_1_2_1_0());
                    					
                    // InternalPipelineParser.g:1890:6: (otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )* )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==Included) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalPipelineParser.g:1891:7: otherlv_13= Included ( (lv_includedBranches_14_0= ruleBranch ) )*
                            {
                            otherlv_13=(Token)match(input,Included,FOLLOW_42); 

                            							newLeafNode(otherlv_13, grammarAccess.getTriggerScheduleAccess().getIncludedKeyword_1_2_1_1_0());
                            						
                            // InternalPipelineParser.g:1895:7: ( (lv_includedBranches_14_0= ruleBranch ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==HyphenMinus||LA52_0==RULE_ID||LA52_0==RULE_STRING) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalPipelineParser.g:1896:8: (lv_includedBranches_14_0= ruleBranch )
                            	    {
                            	    // InternalPipelineParser.g:1896:8: (lv_includedBranches_14_0= ruleBranch )
                            	    // InternalPipelineParser.g:1897:9: lv_includedBranches_14_0= ruleBranch
                            	    {

                            	    									newCompositeNode(grammarAccess.getTriggerScheduleAccess().getIncludedBranchesBranchParserRuleCall_1_2_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_42);
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
                            	    break loop52;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalPipelineParser.g:1915:6: (otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==Excluded) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalPipelineParser.g:1916:7: otherlv_15= Excluded ( (lv_excludedBranches_16_0= ruleBranch ) )*
                            {
                            otherlv_15=(Token)match(input,Excluded,FOLLOW_43); 

                            							newLeafNode(otherlv_15, grammarAccess.getTriggerScheduleAccess().getExcludedKeyword_1_2_1_2_0());
                            						
                            // InternalPipelineParser.g:1920:7: ( (lv_excludedBranches_16_0= ruleBranch ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==HyphenMinus||LA54_0==RULE_ID||LA54_0==RULE_STRING) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalPipelineParser.g:1921:8: (lv_excludedBranches_16_0= ruleBranch )
                            	    {
                            	    // InternalPipelineParser.g:1921:8: (lv_excludedBranches_16_0= ruleBranch )
                            	    // InternalPipelineParser.g:1922:9: lv_excludedBranches_16_0= ruleBranch
                            	    {

                            	    									newCompositeNode(grammarAccess.getTriggerScheduleAccess().getExcludedBranchesBranchParserRuleCall_1_2_1_2_1_0());
                            	    								
                            	    pushFollow(FOLLOW_43);
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
                            	    break loop54;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_END_17=(Token)match(input,RULE_END,FOLLOW_54); 

                    						newLeafNode(this_END_17, grammarAccess.getTriggerScheduleAccess().getENDTerminalRuleCall_1_2_1_3());
                    					

                    }


                    }

                    // InternalPipelineParser.g:1946:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) )
                    // InternalPipelineParser.g:1947:5: ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) )
                    {
                    // InternalPipelineParser.g:1947:5: ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) )
                    // InternalPipelineParser.g:1948:6: ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3());
                    					
                    // InternalPipelineParser.g:1951:6: ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* )
                    // InternalPipelineParser.g:1952:7: ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )*
                    {
                    // InternalPipelineParser.g:1952:7: ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )*
                    loop56:
                    do {
                        int alt56=3;
                        int LA56_0 = input.LA(1);

                        if ( LA56_0 == Batch && getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0) ) {
                            alt56=1;
                        }
                        else if ( LA56_0 == Always && getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1) ) {
                            alt56=2;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1953:5: ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1953:5: ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) )
                    	    // InternalPipelineParser.g:1954:6: {...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0)");
                    	    }
                    	    // InternalPipelineParser.g:1954:115: ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) )
                    	    // InternalPipelineParser.g:1955:7: ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0);
                    	    						
                    	    // InternalPipelineParser.g:1958:10: ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) )
                    	    // InternalPipelineParser.g:1958:11: {...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "true");
                    	    }
                    	    // InternalPipelineParser.g:1958:20: (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) )
                    	    // InternalPipelineParser.g:1958:21: otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) )
                    	    {
                    	    otherlv_19=(Token)match(input,Batch,FOLLOW_3); 

                    	    										newLeafNode(otherlv_19, grammarAccess.getTriggerScheduleAccess().getBatchKeyword_1_3_0_0());
                    	    									
                    	    // InternalPipelineParser.g:1962:10: ( (lv_batch_20_0= RULE_ID ) )
                    	    // InternalPipelineParser.g:1963:11: (lv_batch_20_0= RULE_ID )
                    	    {
                    	    // InternalPipelineParser.g:1963:11: (lv_batch_20_0= RULE_ID )
                    	    // InternalPipelineParser.g:1964:12: lv_batch_20_0= RULE_ID
                    	    {
                    	    lv_batch_20_0=(Token)match(input,RULE_ID,FOLLOW_54); 

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
                    	    // InternalPipelineParser.g:1986:5: ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1986:5: ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) )
                    	    // InternalPipelineParser.g:1987:6: {...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1)");
                    	    }
                    	    // InternalPipelineParser.g:1987:115: ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) )
                    	    // InternalPipelineParser.g:1988:7: ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1);
                    	    						
                    	    // InternalPipelineParser.g:1991:10: ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) )
                    	    // InternalPipelineParser.g:1991:11: {...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "true");
                    	    }
                    	    // InternalPipelineParser.g:1991:20: (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) )
                    	    // InternalPipelineParser.g:1991:21: otherlv_21= Always ( (lv_always_22_0= RULE_ID ) )
                    	    {
                    	    otherlv_21=(Token)match(input,Always,FOLLOW_3); 

                    	    										newLeafNode(otherlv_21, grammarAccess.getTriggerScheduleAccess().getAlwaysKeyword_1_3_1_0());
                    	    									
                    	    // InternalPipelineParser.g:1995:10: ( (lv_always_22_0= RULE_ID ) )
                    	    // InternalPipelineParser.g:1996:11: (lv_always_22_0= RULE_ID )
                    	    {
                    	    // InternalPipelineParser.g:1996:11: (lv_always_22_0= RULE_ID )
                    	    // InternalPipelineParser.g:1997:12: lv_always_22_0= RULE_ID
                    	    {
                    	    lv_always_22_0=(Token)match(input,RULE_ID,FOLLOW_54); 

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
                    	    break loop56;
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
    // InternalPipelineParser.g:2035:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalPipelineParser.g:2035:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalPipelineParser.g:2036:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalPipelineParser.g:2042:1: ruleBranch returns [EObject current=null] : ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:2048:2: ( ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) ) )
            // InternalPipelineParser.g:2049:2: ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) )
            {
            // InternalPipelineParser.g:2049:2: ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) )
            // InternalPipelineParser.g:2050:3: (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) )
            {
            // InternalPipelineParser.g:2050:3: (otherlv_0= HyphenMinus )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==HyphenMinus) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPipelineParser.g:2051:4: otherlv_0= HyphenMinus
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalPipelineParser.g:2056:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) )
            // InternalPipelineParser.g:2057:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            {
            // InternalPipelineParser.g:2057:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            // InternalPipelineParser.g:2058:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
            {
            // InternalPipelineParser.g:2058:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_STRING) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalPipelineParser.g:2059:6: lv_name_1_1= RULE_ID
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
                    // InternalPipelineParser.g:2074:6: lv_name_1_2= RULE_STRING
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
    // InternalPipelineParser.g:2095:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalPipelineParser.g:2095:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalPipelineParser.g:2096:2: iv_ruleActivity= ruleActivity EOF
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
    // InternalPipelineParser.g:2102:1: ruleActivity returns [EObject current=null] : ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_1 = null;

        AntlrDatatypeRuleToken lv_name_0_2 = null;

        AntlrDatatypeRuleToken lv_name_0_3 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:2108:2: ( ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) ) )
            // InternalPipelineParser.g:2109:2: ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) )
            {
            // InternalPipelineParser.g:2109:2: ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) )
            // InternalPipelineParser.g:2110:3: ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) )
            {
            // InternalPipelineParser.g:2110:3: ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) )
            // InternalPipelineParser.g:2111:4: (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues )
            {
            // InternalPipelineParser.g:2111:4: (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues )
            int alt60=3;
            switch ( input.LA(1) ) {
            case RULE_COMPLEX_EXPRESSION:
            case RULE_HEX_INT:
            case RULE_INT:
            case RULE_FLOAT_LITERAL:
            case RULE_VERSION:
            case RULE_ID:
            case RULE_STRING:
                {
                alt60=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt60=2;
                }
                break;
            case HyphenMinus:
            case RULE_BEGIN:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalPipelineParser.g:2112:5: lv_name_0_1= ruleAnyData
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
                    // InternalPipelineParser.g:2128:5: lv_name_0_2= ruleArrayList
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
                    // InternalPipelineParser.g:2144:5: lv_name_0_3= ruleHyphenValues
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


    // $ANTLR start "entryRuleExtendedParameter"
    // InternalPipelineParser.g:2165:1: entryRuleExtendedParameter returns [EObject current=null] : iv_ruleExtendedParameter= ruleExtendedParameter EOF ;
    public final EObject entryRuleExtendedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedParameter = null;


        try {
            // InternalPipelineParser.g:2165:58: (iv_ruleExtendedParameter= ruleExtendedParameter EOF )
            // InternalPipelineParser.g:2166:2: iv_ruleExtendedParameter= ruleExtendedParameter EOF
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
    // InternalPipelineParser.g:2172:1: ruleExtendedParameter returns [EObject current=null] : ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) ) ;
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
            // InternalPipelineParser.g:2178:2: ( ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) ) )
            // InternalPipelineParser.g:2179:2: ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) )
            {
            // InternalPipelineParser.g:2179:2: ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Extends) ) {
                alt63=1;
            }
            else if ( (LA63_0==Include) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalPipelineParser.g:2180:3: (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) )
                    {
                    // InternalPipelineParser.g:2180:3: (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) )
                    // InternalPipelineParser.g:2181:4: otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END )
                    {
                    otherlv_0=(Token)match(input,Extends,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getExtendedParameterAccess().getExtendsKeyword_0_0());
                    			
                    // InternalPipelineParser.g:2185:4: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END )
                    // InternalPipelineParser.g:2186:5: this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END
                    {
                    this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_55); 

                    					newLeafNode(this_BEGIN_1, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_0());
                    				
                    // InternalPipelineParser.g:2190:5: (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) )
                    // InternalPipelineParser.g:2191:6: otherlv_2= Template ( (lv_template_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,Template,FOLLOW_3); 

                    						newLeafNode(otherlv_2, grammarAccess.getExtendedParameterAccess().getTemplateKeyword_0_1_1_0());
                    					
                    // InternalPipelineParser.g:2195:6: ( (lv_template_3_0= RULE_ID ) )
                    // InternalPipelineParser.g:2196:7: (lv_template_3_0= RULE_ID )
                    {
                    // InternalPipelineParser.g:2196:7: (lv_template_3_0= RULE_ID )
                    // InternalPipelineParser.g:2197:8: lv_template_3_0= RULE_ID
                    {
                    lv_template_3_0=(Token)match(input,RULE_ID,FOLLOW_56); 

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

                    // InternalPipelineParser.g:2214:5: (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) )
                    // InternalPipelineParser.g:2215:6: otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    {
                    otherlv_4=(Token)match(input,Parameters,FOLLOW_5); 

                    						newLeafNode(otherlv_4, grammarAccess.getExtendedParameterAccess().getParametersKeyword_0_1_2_0());
                    					
                    // InternalPipelineParser.g:2219:6: (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    // InternalPipelineParser.g:2220:7: this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_57); 

                    							newLeafNode(this_BEGIN_5, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_2_1_0());
                    						
                    // InternalPipelineParser.g:2224:7: ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==WriteAll||LA61_0==ReadAll||LA61_0==Write||(LA61_0>=None && LA61_0<=Read)||LA61_0==HyphenMinus||LA61_0==RULE_COMPLEX_EXPRESSION||LA61_0==RULE_ID) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2225:8: (lv_extendedParameterValues_6_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:2225:8: (lv_extendedParameterValues_6_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:2226:9: lv_extendedParameterValues_6_0= ruleParameterValue
                    	    {

                    	    									newCompositeNode(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_0_1_2_1_1_0());
                    	    								
                    	    pushFollow(FOLLOW_57);
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
                    	    break loop61;
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
                    // InternalPipelineParser.g:2256:3: (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) )
                    {
                    // InternalPipelineParser.g:2256:3: (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) )
                    // InternalPipelineParser.g:2257:4: otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END )
                    {
                    otherlv_9=(Token)match(input,Include,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getExtendedParameterAccess().getIncludeKeyword_1_0());
                    			
                    // InternalPipelineParser.g:2261:4: (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END )
                    // InternalPipelineParser.g:2262:5: this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END
                    {
                    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_58); 

                    					newLeafNode(this_BEGIN_10, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:2266:5: ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==WriteAll||LA62_0==ReadAll||LA62_0==Write||(LA62_0>=None && LA62_0<=Read)||LA62_0==HyphenMinus||LA62_0==RULE_COMPLEX_EXPRESSION||LA62_0==RULE_ID) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2267:6: (lv_extendedParameterValues_11_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:2267:6: (lv_extendedParameterValues_11_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:2268:7: lv_extendedParameterValues_11_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_57);
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
                    	    if ( cnt62 >= 1 ) break loop62;
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
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
    // InternalPipelineParser.g:2295:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPipelineParser.g:2295:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPipelineParser.g:2296:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalPipelineParser.g:2302:1: ruleVariable returns [EObject current=null] : ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) ) ;
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
            // InternalPipelineParser.g:2308:2: ( ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) ) )
            // InternalPipelineParser.g:2309:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) )
            {
            // InternalPipelineParser.g:2309:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_BEGIN) ) {
                alt67=1;
            }
            else if ( (LA67_0==HyphenMinus) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalPipelineParser.g:2310:3: (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END )
                    {
                    // InternalPipelineParser.g:2310:3: (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END )
                    // InternalPipelineParser.g:2311:4: this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END
                    {
                    this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_58); 

                    				newLeafNode(this_BEGIN_0, grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_0_0());
                    			
                    // InternalPipelineParser.g:2315:4: ( (lv_variableValues_1_0= ruleParameterValue ) )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==WriteAll||LA64_0==ReadAll||LA64_0==Write||(LA64_0>=None && LA64_0<=Read)||LA64_0==HyphenMinus||LA64_0==RULE_COMPLEX_EXPRESSION||LA64_0==RULE_ID) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2316:5: (lv_variableValues_1_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:2316:5: (lv_variableValues_1_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:2317:6: lv_variableValues_1_0= ruleParameterValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getVariableAccess().getVariableValuesParameterValueParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_57);
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
                    	    if ( cnt64 >= 1 ) break loop64;
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);

                    this_END_2=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_2, grammarAccess.getVariableAccess().getENDTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2340:3: ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) )
                    {
                    // InternalPipelineParser.g:2340:3: ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) )
                    // InternalPipelineParser.g:2341:4: (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) )
                    {
                    // InternalPipelineParser.g:2341:4: (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==HyphenMinus) ) {
                        int LA65_1 = input.LA(2);

                        if ( (LA65_1==Group) ) {
                            alt65=1;
                        }
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalPipelineParser.g:2342:5: otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) )
                            {
                            otherlv_3=(Token)match(input,HyphenMinus,FOLLOW_14); 

                            					newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_0_0());
                            				
                            otherlv_4=(Token)match(input,Group,FOLLOW_59); 

                            					newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getGroupKeyword_1_0_1());
                            				
                            // InternalPipelineParser.g:2350:5: ( (lv_group_5_0= ruleAnyData ) )
                            // InternalPipelineParser.g:2351:6: (lv_group_5_0= ruleAnyData )
                            {
                            // InternalPipelineParser.g:2351:6: (lv_group_5_0= ruleAnyData )
                            // InternalPipelineParser.g:2352:7: lv_group_5_0= ruleAnyData
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getGroupAnyDataParserRuleCall_1_0_2_0());
                            						
                            pushFollow(FOLLOW_51);
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

                    // InternalPipelineParser.g:2370:4: ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) )
                    // InternalPipelineParser.g:2371:5: (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END )
                    {
                    // InternalPipelineParser.g:2371:5: (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) )
                    // InternalPipelineParser.g:2372:6: otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) )
                    {
                    otherlv_6=(Token)match(input,HyphenMinus,FOLLOW_18); 

                    						newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_1_0_0());
                    					
                    otherlv_7=(Token)match(input,Name,FOLLOW_59); 

                    						newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getNameKeyword_1_1_0_1());
                    					
                    // InternalPipelineParser.g:2380:6: ( (lv_name_8_0= ruleAnyData ) )
                    // InternalPipelineParser.g:2381:7: (lv_name_8_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:2381:7: (lv_name_8_0= ruleAnyData )
                    // InternalPipelineParser.g:2382:8: lv_name_8_0= ruleAnyData
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

                    // InternalPipelineParser.g:2400:5: (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END )
                    // InternalPipelineParser.g:2401:6: this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END
                    {
                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_60); 

                    						newLeafNode(this_BEGIN_9, grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_1_1_1_0());
                    					
                    // InternalPipelineParser.g:2405:6: (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) )
                    // InternalPipelineParser.g:2406:7: otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) )
                    {
                    otherlv_10=(Token)match(input,Value,FOLLOW_59); 

                    							newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getValueKeyword_1_1_1_1_0());
                    						
                    // InternalPipelineParser.g:2410:7: ( (lv_value_11_0= ruleAnyData ) )
                    // InternalPipelineParser.g:2411:8: (lv_value_11_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:2411:8: (lv_value_11_0= ruleAnyData )
                    // InternalPipelineParser.g:2412:9: lv_value_11_0= ruleAnyData
                    {

                    									newCompositeNode(grammarAccess.getVariableAccess().getValueAnyDataParserRuleCall_1_1_1_1_1_0());
                    								
                    pushFollow(FOLLOW_61);
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

                    // InternalPipelineParser.g:2430:6: (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==Readonly) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalPipelineParser.g:2431:7: otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) )
                            {
                            otherlv_12=(Token)match(input,Readonly,FOLLOW_3); 

                            							newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getReadonlyKeyword_1_1_1_2_0());
                            						
                            // InternalPipelineParser.g:2435:7: ( (lv_readonly_13_0= RULE_ID ) )
                            // InternalPipelineParser.g:2436:8: (lv_readonly_13_0= RULE_ID )
                            {
                            // InternalPipelineParser.g:2436:8: (lv_readonly_13_0= RULE_ID )
                            // InternalPipelineParser.g:2437:9: lv_readonly_13_0= RULE_ID
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
    // InternalPipelineParser.g:2465:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalPipelineParser.g:2465:49: (iv_ruleResource= ruleResource EOF )
            // InternalPipelineParser.g:2466:2: iv_ruleResource= ruleResource EOF
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
    // InternalPipelineParser.g:2472:1: ruleResource returns [EObject current=null] : ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) ) ;
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
            // InternalPipelineParser.g:2478:2: ( ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) ) )
            // InternalPipelineParser.g:2479:2: ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) )
            {
            // InternalPipelineParser.g:2479:2: ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) )
            // InternalPipelineParser.g:2480:3: ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) )
            {
            // InternalPipelineParser.g:2480:3: ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) )
            // InternalPipelineParser.g:2481:4: ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) )
            {
            // InternalPipelineParser.g:2481:4: ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) )
            // InternalPipelineParser.g:2482:5: (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages )
            {
            // InternalPipelineParser.g:2482:5: (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages )
            int alt68=6;
            switch ( input.LA(1) ) {
            case Builds:
                {
                alt68=1;
                }
                break;
            case Containers:
                {
                alt68=2;
                }
                break;
            case Pipelines:
                {
                alt68=3;
                }
                break;
            case Repositories:
                {
                alt68=4;
                }
                break;
            case Webhooks:
                {
                alt68=5;
                }
                break;
            case Packages:
                {
                alt68=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalPipelineParser.g:2483:6: lv_resourceName_0_1= Builds
                    {
                    lv_resourceName_0_1=(Token)match(input,Builds,FOLLOW_47); 

                    						newLeafNode(lv_resourceName_0_1, grammarAccess.getResourceAccess().getResourceNameBuildsKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2494:6: lv_resourceName_0_2= Containers
                    {
                    lv_resourceName_0_2=(Token)match(input,Containers,FOLLOW_47); 

                    						newLeafNode(lv_resourceName_0_2, grammarAccess.getResourceAccess().getResourceNameContainersKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:2505:6: lv_resourceName_0_3= Pipelines
                    {
                    lv_resourceName_0_3=(Token)match(input,Pipelines,FOLLOW_47); 

                    						newLeafNode(lv_resourceName_0_3, grammarAccess.getResourceAccess().getResourceNamePipelinesKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:2516:6: lv_resourceName_0_4= Repositories
                    {
                    lv_resourceName_0_4=(Token)match(input,Repositories,FOLLOW_47); 

                    						newLeafNode(lv_resourceName_0_4, grammarAccess.getResourceAccess().getResourceNameRepositoriesKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:2527:6: lv_resourceName_0_5= Webhooks
                    {
                    lv_resourceName_0_5=(Token)match(input,Webhooks,FOLLOW_47); 

                    						newLeafNode(lv_resourceName_0_5, grammarAccess.getResourceAccess().getResourceNameWebhooksKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:2538:6: lv_resourceName_0_6= Packages
                    {
                    lv_resourceName_0_6=(Token)match(input,Packages,FOLLOW_47); 

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

            // InternalPipelineParser.g:2551:3: ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==EOF||LA71_0==Repositories||LA71_0==Containers||LA71_0==Pipelines||LA71_0==Packages||LA71_0==Webhooks||LA71_0==Builds||LA71_0==HyphenMinus||LA71_0==RULE_END) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_BEGIN) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalPipelineParser.g:2552:4: (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )*
                    {
                    // InternalPipelineParser.g:2552:4: (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==HyphenMinus) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2553:5: otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_58); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_0_0());
                    	    				
                    	    // InternalPipelineParser.g:2557:5: ( (lv_resourceValues_2_0= ruleParameterValue ) )
                    	    // InternalPipelineParser.g:2558:6: (lv_resourceValues_2_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:2558:6: (lv_resourceValues_2_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:2559:7: lv_resourceValues_2_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_62);
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
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2578:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END )
                    {
                    // InternalPipelineParser.g:2578:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END )
                    // InternalPipelineParser.g:2579:5: this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_63); 

                    					newLeafNode(this_BEGIN_3, grammarAccess.getResourceAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:2583:5: (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==HyphenMinus) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2584:6: otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_58); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_1_1_0());
                    	    					
                    	    // InternalPipelineParser.g:2588:6: ( (lv_resourceValues_5_0= ruleParameterValue ) )
                    	    // InternalPipelineParser.g:2589:7: (lv_resourceValues_5_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:2589:7: (lv_resourceValues_5_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:2590:8: lv_resourceValues_5_0= ruleParameterValue
                    	    {

                    	    								newCompositeNode(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_63);
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
                    	    break loop70;
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
    // InternalPipelineParser.g:2618:1: entryRulePipelineParameter returns [EObject current=null] : iv_rulePipelineParameter= rulePipelineParameter EOF ;
    public final EObject entryRulePipelineParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipelineParameter = null;


        try {
            // InternalPipelineParser.g:2618:58: (iv_rulePipelineParameter= rulePipelineParameter EOF )
            // InternalPipelineParser.g:2619:2: iv_rulePipelineParameter= rulePipelineParameter EOF
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
    // InternalPipelineParser.g:2625:1: rulePipelineParameter returns [EObject current=null] : ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) ) ;
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
            // InternalPipelineParser.g:2631:2: ( ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) ) )
            // InternalPipelineParser.g:2632:2: ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) )
            {
            // InternalPipelineParser.g:2632:2: ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Parameters) ) {
                alt75=1;
            }
            else if ( (LA75_0==Executors||LA75_0==Commands||LA75_0==Default||LA75_0==Orbs) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalPipelineParser.g:2633:3: ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ )
                    {
                    // InternalPipelineParser.g:2633:3: ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ )
                    // InternalPipelineParser.g:2634:4: ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+
                    {
                    // InternalPipelineParser.g:2634:4: ( (lv_name_0_0= Parameters ) )
                    // InternalPipelineParser.g:2635:5: (lv_name_0_0= Parameters )
                    {
                    // InternalPipelineParser.g:2635:5: (lv_name_0_0= Parameters )
                    // InternalPipelineParser.g:2636:6: lv_name_0_0= Parameters
                    {
                    lv_name_0_0=(Token)match(input,Parameters,FOLLOW_58); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getPipelineParameterAccess().getNameParametersKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPipelineParameterRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_0, "parameters:");
                    					

                    }


                    }

                    // InternalPipelineParser.g:2648:4: ( (lv_parameterValues_1_0= ruleParameterValue ) )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        alt72 = dfa72.predict(input);
                        switch (alt72) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2649:5: (lv_parameterValues_1_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:2649:5: (lv_parameterValues_1_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:2650:6: lv_parameterValues_1_0= ruleParameterValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineParameterAccess().getParameterValuesParameterValueParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_48);
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
                    	    if ( cnt72 >= 1 ) break loop72;
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2669:3: ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) )
                    {
                    // InternalPipelineParser.g:2669:3: ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) )
                    // InternalPipelineParser.g:2670:4: ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END )
                    {
                    // InternalPipelineParser.g:2670:4: ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) )
                    // InternalPipelineParser.g:2671:5: ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) )
                    {
                    // InternalPipelineParser.g:2671:5: ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) )
                    // InternalPipelineParser.g:2672:6: (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands )
                    {
                    // InternalPipelineParser.g:2672:6: (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands )
                    int alt73=4;
                    switch ( input.LA(1) ) {
                    case Default:
                        {
                        alt73=1;
                        }
                        break;
                    case Executors:
                        {
                        alt73=2;
                        }
                        break;
                    case Orbs:
                        {
                        alt73=3;
                        }
                        break;
                    case Commands:
                        {
                        alt73=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }

                    switch (alt73) {
                        case 1 :
                            // InternalPipelineParser.g:2673:7: lv_name_2_1= Default
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
                            // InternalPipelineParser.g:2684:7: lv_name_2_2= Executors
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
                            // InternalPipelineParser.g:2695:7: lv_name_2_3= Orbs
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
                            // InternalPipelineParser.g:2706:7: lv_name_2_4= Commands
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

                    // InternalPipelineParser.g:2719:4: (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END )
                    // InternalPipelineParser.g:2720:5: this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_58); 

                    					newLeafNode(this_BEGIN_3, grammarAccess.getPipelineParameterAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:2724:5: ( (lv_parameterValues_4_0= ruleParameterValue ) )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==WriteAll||LA74_0==ReadAll||LA74_0==Write||(LA74_0>=None && LA74_0<=Read)||LA74_0==HyphenMinus||LA74_0==RULE_COMPLEX_EXPRESSION||LA74_0==RULE_ID) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2725:6: (lv_parameterValues_4_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:2725:6: (lv_parameterValues_4_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:2726:7: lv_parameterValues_4_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getPipelineParameterAccess().getParameterValuesParameterValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_57);
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
                    	    if ( cnt74 >= 1 ) break loop74;
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
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


    // $ANTLR start "entryRuleParameterValue"
    // InternalPipelineParser.g:2753:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalPipelineParser.g:2753:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalPipelineParser.g:2754:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalPipelineParser.g:2760:1: ruleParameterValue returns [EObject current=null] : ( (otherlv_0= HyphenMinus )? ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) ) otherlv_3= Colon (this_WS_4= RULE_WS )* ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) ) ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_3=null;
        Token this_WS_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        Enumerator lv_preDefinedKeyword_2_0 = null;

        EObject lv_subParameterValues_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_1 = null;

        AntlrDatatypeRuleToken lv_value_8_2 = null;

        AntlrDatatypeRuleToken lv_value_8_3 = null;

        EObject lv_subParameterValues_10_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:2766:2: ( ( (otherlv_0= HyphenMinus )? ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) ) otherlv_3= Colon (this_WS_4= RULE_WS )* ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) ) ) )
            // InternalPipelineParser.g:2767:2: ( (otherlv_0= HyphenMinus )? ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) ) otherlv_3= Colon (this_WS_4= RULE_WS )* ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) ) )
            {
            // InternalPipelineParser.g:2767:2: ( (otherlv_0= HyphenMinus )? ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) ) otherlv_3= Colon (this_WS_4= RULE_WS )* ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) ) )
            // InternalPipelineParser.g:2768:3: (otherlv_0= HyphenMinus )? ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) ) otherlv_3= Colon (this_WS_4= RULE_WS )* ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) )
            {
            // InternalPipelineParser.g:2768:3: (otherlv_0= HyphenMinus )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==HyphenMinus) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalPipelineParser.g:2769:4: otherlv_0= HyphenMinus
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_64); 

                    				newLeafNode(otherlv_0, grammarAccess.getParameterValueAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalPipelineParser.g:2774:3: ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_COMPLEX_EXPRESSION||LA78_0==RULE_ID) ) {
                alt78=1;
            }
            else if ( (LA78_0==WriteAll||LA78_0==ReadAll||LA78_0==Write||(LA78_0>=None && LA78_0<=Read)) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalPipelineParser.g:2775:4: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) )
                    {
                    // InternalPipelineParser.g:2775:4: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) )
                    // InternalPipelineParser.g:2776:5: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) )
                    {
                    // InternalPipelineParser.g:2776:5: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) )
                    // InternalPipelineParser.g:2777:6: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION )
                    {
                    // InternalPipelineParser.g:2777:6: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_ID) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==RULE_COMPLEX_EXPRESSION) ) {
                        alt77=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalPipelineParser.g:2778:7: lv_name_1_1= RULE_ID
                            {
                            lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_65); 

                            							newLeafNode(lv_name_1_1, grammarAccess.getParameterValueAccess().getNameIDTerminalRuleCall_1_0_0_0());
                            						

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
                            // InternalPipelineParser.g:2793:7: lv_name_1_2= RULE_COMPLEX_EXPRESSION
                            {
                            lv_name_1_2=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_65); 

                            							newLeafNode(lv_name_1_2, grammarAccess.getParameterValueAccess().getNameCOMPLEX_EXPRESSIONTerminalRuleCall_1_0_0_1());
                            						

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


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2811:4: ( (lv_preDefinedKeyword_2_0= rulePermission ) )
                    {
                    // InternalPipelineParser.g:2811:4: ( (lv_preDefinedKeyword_2_0= rulePermission ) )
                    // InternalPipelineParser.g:2812:5: (lv_preDefinedKeyword_2_0= rulePermission )
                    {
                    // InternalPipelineParser.g:2812:5: (lv_preDefinedKeyword_2_0= rulePermission )
                    // InternalPipelineParser.g:2813:6: lv_preDefinedKeyword_2_0= rulePermission
                    {

                    						newCompositeNode(grammarAccess.getParameterValueAccess().getPreDefinedKeywordPermissionEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_preDefinedKeyword_2_0=rulePermission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterValueRule());
                    						}
                    						set(
                    							current,
                    							"preDefinedKeyword",
                    							lv_preDefinedKeyword_2_0,
                    							"ca.mcgill.devops.pipeline.Pipeline.Permission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterValueAccess().getColonKeyword_2());
            		
            // InternalPipelineParser.g:2835:3: (this_WS_4= RULE_WS )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_WS) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalPipelineParser.g:2836:4: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_66); 

            	    				newLeafNode(this_WS_4, grammarAccess.getParameterValueAccess().getWSTerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // InternalPipelineParser.g:2841:3: ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_BEGIN) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==HyphenMinus) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA84_5 = input.LA(4);

                        if ( (LA84_5==HyphenMinus||LA84_5==RULE_END) ) {
                            alt84=2;
                        }
                        else if ( (LA84_5==Colon) ) {
                            alt84=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 84, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_COMPLEX_EXPRESSION:
                        {
                        int LA84_6 = input.LA(4);

                        if ( (LA84_6==HyphenMinus||LA84_6==RULE_END) ) {
                            alt84=2;
                        }
                        else if ( (LA84_6==Colon) ) {
                            alt84=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 84, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WriteAll:
                    case ReadAll:
                    case Write:
                    case None:
                    case Read:
                        {
                        alt84=1;
                        }
                        break;
                    case RULE_HEX_INT:
                    case RULE_INT:
                    case RULE_FLOAT_LITERAL:
                    case RULE_VERSION:
                    case RULE_STRING:
                        {
                        alt84=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA84_1==WriteAll||LA84_1==ReadAll||LA84_1==Write||(LA84_1>=None && LA84_1<=Read)||LA84_1==RULE_COMPLEX_EXPRESSION||(LA84_1>=RULE_END && LA84_1<=RULE_ID)) ) {
                    alt84=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA84_0==HyphenMinus||LA84_0==LeftSquareBracket||(LA84_0>=RULE_COMPLEX_EXPRESSION && LA84_0<=RULE_VERSION)||LA84_0==RULE_ID||LA84_0==RULE_STRING) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalPipelineParser.g:2842:4: (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    {
                    // InternalPipelineParser.g:2842:4: (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    // InternalPipelineParser.g:2843:5: this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_57); 

                    					newLeafNode(this_BEGIN_5, grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_0_0());
                    				
                    // InternalPipelineParser.g:2847:5: ( (lv_subParameterValues_6_0= ruleParameterValue ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==WriteAll||LA80_0==ReadAll||LA80_0==Write||(LA80_0>=None && LA80_0<=Read)||LA80_0==HyphenMinus||LA80_0==RULE_COMPLEX_EXPRESSION||LA80_0==RULE_ID) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2848:6: (lv_subParameterValues_6_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:2848:6: (lv_subParameterValues_6_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:2849:7: lv_subParameterValues_6_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_57);
                    	    lv_subParameterValues_6_0=ruleParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subParameterValues",
                    	    								lv_subParameterValues_6_0,
                    	    								"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_7, grammarAccess.getParameterValueAccess().getENDTerminalRuleCall_4_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2872:4: ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? )
                    {
                    // InternalPipelineParser.g:2872:4: ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? )
                    // InternalPipelineParser.g:2873:5: ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )?
                    {
                    // InternalPipelineParser.g:2873:5: ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) )
                    // InternalPipelineParser.g:2874:6: ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) )
                    {
                    // InternalPipelineParser.g:2874:6: ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) )
                    // InternalPipelineParser.g:2875:7: (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues )
                    {
                    // InternalPipelineParser.g:2875:7: (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues )
                    int alt81=3;
                    switch ( input.LA(1) ) {
                    case RULE_COMPLEX_EXPRESSION:
                    case RULE_HEX_INT:
                    case RULE_INT:
                    case RULE_FLOAT_LITERAL:
                    case RULE_VERSION:
                    case RULE_ID:
                    case RULE_STRING:
                        {
                        alt81=1;
                        }
                        break;
                    case LeftSquareBracket:
                        {
                        alt81=2;
                        }
                        break;
                    case HyphenMinus:
                    case RULE_BEGIN:
                        {
                        alt81=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }

                    switch (alt81) {
                        case 1 :
                            // InternalPipelineParser.g:2876:8: lv_value_8_1= ruleAnyData
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueAnyDataParserRuleCall_4_1_0_0_0());
                            							
                            pushFollow(FOLLOW_50);
                            lv_value_8_1=ruleAnyData();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getParameterValueRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_8_1,
                            									"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                            								afterParserOrEnumRuleCall();
                            							

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:2892:8: lv_value_8_2= ruleArrayList
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueArrayListParserRuleCall_4_1_0_0_1());
                            							
                            pushFollow(FOLLOW_50);
                            lv_value_8_2=ruleArrayList();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getParameterValueRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_8_2,
                            									"ca.mcgill.devops.pipeline.Pipeline.ArrayList");
                            								afterParserOrEnumRuleCall();
                            							

                            }
                            break;
                        case 3 :
                            // InternalPipelineParser.g:2908:8: lv_value_8_3= ruleHyphenValues
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueHyphenValuesParserRuleCall_4_1_0_0_2());
                            							
                            pushFollow(FOLLOW_50);
                            lv_value_8_3=ruleHyphenValues();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getParameterValueRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_8_3,
                            									"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            								afterParserOrEnumRuleCall();
                            							

                            }
                            break;

                    }


                    }


                    }

                    // InternalPipelineParser.g:2926:5: (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_BEGIN) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalPipelineParser.g:2927:6: this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END
                            {
                            this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_57); 

                            						newLeafNode(this_BEGIN_9, grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_1_1_0());
                            					
                            // InternalPipelineParser.g:2931:6: ( (lv_subParameterValues_10_0= ruleParameterValue ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==WriteAll||LA82_0==ReadAll||LA82_0==Write||(LA82_0>=None && LA82_0<=Read)||LA82_0==HyphenMinus||LA82_0==RULE_COMPLEX_EXPRESSION||LA82_0==RULE_ID) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // InternalPipelineParser.g:2932:7: (lv_subParameterValues_10_0= ruleParameterValue )
                            	    {
                            	    // InternalPipelineParser.g:2932:7: (lv_subParameterValues_10_0= ruleParameterValue )
                            	    // InternalPipelineParser.g:2933:8: lv_subParameterValues_10_0= ruleParameterValue
                            	    {

                            	    								newCompositeNode(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_57);
                            	    lv_subParameterValues_10_0=ruleParameterValue();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getParameterValueRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"subParameterValues",
                            	    									lv_subParameterValues_10_0,
                            	    									"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop82;
                                }
                            } while (true);

                            this_END_11=(Token)match(input,RULE_END,FOLLOW_2); 

                            						newLeafNode(this_END_11, grammarAccess.getParameterValueAccess().getENDTerminalRuleCall_4_1_1_2());
                            					

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
    // InternalPipelineParser.g:2961:1: entryRuleAnyData returns [String current=null] : iv_ruleAnyData= ruleAnyData EOF ;
    public final String entryRuleAnyData() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyData = null;


        try {
            // InternalPipelineParser.g:2961:47: (iv_ruleAnyData= ruleAnyData EOF )
            // InternalPipelineParser.g:2962:2: iv_ruleAnyData= ruleAnyData EOF
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
    // InternalPipelineParser.g:2968:1: ruleAnyData returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT ) ;
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
            // InternalPipelineParser.g:2974:2: ( (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT ) )
            // InternalPipelineParser.g:2975:2: (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT )
            {
            // InternalPipelineParser.g:2975:2: (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT )
            int alt85=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt85=1;
                }
                break;
            case RULE_INT:
                {
                alt85=2;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt85=3;
                }
                break;
            case RULE_ID:
                {
                alt85=4;
                }
                break;
            case RULE_COMPLEX_EXPRESSION:
                {
                alt85=5;
                }
                break;
            case RULE_VERSION:
                {
                alt85=6;
                }
                break;
            case RULE_HEX_INT:
                {
                alt85=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalPipelineParser.g:2976:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getAnyDataAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2984:3: this_Number_1= ruleNumber
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
                    // InternalPipelineParser.g:2995:3: this_FloatingPoint_2= ruleFloatingPoint
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
                    // InternalPipelineParser.g:3006:3: this_SimpleWord_3= ruleSimpleWord
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
                    // InternalPipelineParser.g:3017:3: this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION
                    {
                    this_COMPLEX_EXPRESSION_4=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_2); 

                    			current.merge(this_COMPLEX_EXPRESSION_4);
                    		

                    			newLeafNode(this_COMPLEX_EXPRESSION_4, grammarAccess.getAnyDataAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:3025:3: this_VERSION_5= RULE_VERSION
                    {
                    this_VERSION_5=(Token)match(input,RULE_VERSION,FOLLOW_2); 

                    			current.merge(this_VERSION_5);
                    		

                    			newLeafNode(this_VERSION_5, grammarAccess.getAnyDataAccess().getVERSIONTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:3033:3: this_HEX_INT_6= RULE_HEX_INT
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
    // InternalPipelineParser.g:3044:1: entryRuleKeyValue returns [String current=null] : iv_ruleKeyValue= ruleKeyValue EOF ;
    public final String entryRuleKeyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyValue = null;


        try {
            // InternalPipelineParser.g:3044:48: (iv_ruleKeyValue= ruleKeyValue EOF )
            // InternalPipelineParser.g:3045:2: iv_ruleKeyValue= ruleKeyValue EOF
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
    // InternalPipelineParser.g:3051:1: ruleKeyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData ) ;
    public final AntlrDatatypeRuleToken ruleKeyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_AnyData_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3057:2: ( (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData ) )
            // InternalPipelineParser.g:3058:2: (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData )
            {
            // InternalPipelineParser.g:3058:2: (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData )
            // InternalPipelineParser.g:3059:3: this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_65); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getKeyValueAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_59); 

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
    // InternalPipelineParser.g:3085:1: entryRuleIndPermissionValue returns [String current=null] : iv_ruleIndPermissionValue= ruleIndPermissionValue EOF ;
    public final String entryRuleIndPermissionValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndPermissionValue = null;


        try {
            // InternalPipelineParser.g:3085:58: (iv_ruleIndPermissionValue= ruleIndPermissionValue EOF )
            // InternalPipelineParser.g:3086:2: iv_ruleIndPermissionValue= ruleIndPermissionValue EOF
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
    // InternalPipelineParser.g:3092:1: ruleIndPermissionValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) ) ;
    public final AntlrDatatypeRuleToken ruleIndPermissionValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3098:2: ( (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) ) )
            // InternalPipelineParser.g:3099:2: (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) )
            {
            // InternalPipelineParser.g:3099:2: (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) )
            // InternalPipelineParser.g:3100:3: this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_65); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getIndPermissionValueAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_67); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getColonKeyword_1());
            		
            // InternalPipelineParser.g:3112:3: (kw= Read | kw= Write | kw= None )
            int alt86=3;
            switch ( input.LA(1) ) {
            case Read:
                {
                alt86=1;
                }
                break;
            case Write:
                {
                alt86=2;
                }
                break;
            case None:
                {
                alt86=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalPipelineParser.g:3113:4: kw= Read
                    {
                    kw=(Token)match(input,Read,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getReadKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3119:4: kw= Write
                    {
                    kw=(Token)match(input,Write,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getWriteKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:3125:4: kw= None
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
    // InternalPipelineParser.g:3135:1: entryRuleUnquotedString returns [String current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final String entryRuleUnquotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnquotedString = null;


        try {
            // InternalPipelineParser.g:3135:54: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // InternalPipelineParser.g:3136:2: iv_ruleUnquotedString= ruleUnquotedString EOF
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
    // InternalPipelineParser.g:3142:1: ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* ) ;
    public final AntlrDatatypeRuleToken ruleUnquotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_COMPLEX_EXPRESSION_3=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3148:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* ) )
            // InternalPipelineParser.g:3149:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* )
            {
            // InternalPipelineParser.g:3149:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* )
            // InternalPipelineParser.g:3150:3: this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_68); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_0());
            		
            // InternalPipelineParser.g:3157:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )*
            loop87:
            do {
                int alt87=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt87=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt87=2;
                    }
                    break;
                case RULE_COMPLEX_EXPRESSION:
                    {
                    alt87=3;
                    }
                    break;

                }

                switch (alt87) {
            	case 1 :
            	    // InternalPipelineParser.g:3158:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_68); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:3166:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_68); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalPipelineParser.g:3174:4: this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION
            	    {
            	    this_COMPLEX_EXPRESSION_3=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_68); 

            	    				current.merge(this_COMPLEX_EXPRESSION_3);
            	    			

            	    				newLeafNode(this_COMPLEX_EXPRESSION_3, grammarAccess.getUnquotedStringAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop87;
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
    // InternalPipelineParser.g:3186:1: entryRuleHyphenValues returns [String current=null] : iv_ruleHyphenValues= ruleHyphenValues EOF ;
    public final String entryRuleHyphenValues() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHyphenValues = null;


        try {
            // InternalPipelineParser.g:3186:52: (iv_ruleHyphenValues= ruleHyphenValues EOF )
            // InternalPipelineParser.g:3187:2: iv_ruleHyphenValues= ruleHyphenValues EOF
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
    // InternalPipelineParser.g:3193:1: ruleHyphenValues returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) ) ;
    public final AntlrDatatypeRuleToken ruleHyphenValues() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BEGIN_2=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken this_AnyData_1 = null;

        AntlrDatatypeRuleToken this_AnyData_4 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3199:2: ( ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) ) )
            // InternalPipelineParser.g:3200:2: ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) )
            {
            // InternalPipelineParser.g:3200:2: ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==HyphenMinus) ) {
                alt90=1;
            }
            else if ( (LA90_0==RULE_BEGIN) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalPipelineParser.g:3201:3: (kw= HyphenMinus this_AnyData_1= ruleAnyData )+
                    {
                    // InternalPipelineParser.g:3201:3: (kw= HyphenMinus this_AnyData_1= ruleAnyData )+
                    int cnt88=0;
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==HyphenMinus) ) {
                            switch ( input.LA(2) ) {
                            case RULE_ID:
                                {
                                int LA88_3 = input.LA(3);

                                if ( (LA88_3==EOF||LA88_3==Workflow_dispatch||(LA88_3>=BranchesIgnore && LA88_3<=Workflow_run)||(LA88_3>=TagsIgnore && LA88_3<=Parameters)||(LA88_3>=Executors && LA88_3<=Pipelines)||LA88_3==Schedules||(LA88_3>=Branches && LA88_3<=Commands)||(LA88_3>=Excluded && LA88_3<=Packages)||LA88_3==Schedule||(LA88_3>=Webhooks && LA88_3<=Default)||LA88_3==ReadAll||(LA88_3>=Builds && LA88_3<=Batch)||LA88_3==Paths||LA88_3==Tags||LA88_3==Orbs||LA88_3==Write||(LA88_3>=Job && LA88_3<=Read)||(LA88_3>=On && LA88_3<=HyphenMinus)||(LA88_3>=RightSquareBracket && LA88_3<=RULE_COMPLEX_EXPRESSION)||(LA88_3>=RULE_BEGIN && LA88_3<=RULE_ID)) ) {
                                    alt88=1;
                                }


                                }
                                break;
                            case RULE_COMPLEX_EXPRESSION:
                                {
                                int LA88_4 = input.LA(3);

                                if ( (LA88_4==EOF||LA88_4==Workflow_dispatch||(LA88_4>=BranchesIgnore && LA88_4<=Workflow_run)||(LA88_4>=TagsIgnore && LA88_4<=Parameters)||(LA88_4>=Executors && LA88_4<=Pipelines)||LA88_4==Schedules||(LA88_4>=Branches && LA88_4<=Commands)||(LA88_4>=Excluded && LA88_4<=Packages)||LA88_4==Schedule||(LA88_4>=Webhooks && LA88_4<=Default)||LA88_4==ReadAll||(LA88_4>=Builds && LA88_4<=Batch)||LA88_4==Paths||LA88_4==Tags||LA88_4==Orbs||LA88_4==Write||(LA88_4>=Job && LA88_4<=Read)||(LA88_4>=On && LA88_4<=HyphenMinus)||(LA88_4>=RightSquareBracket && LA88_4<=RULE_COMPLEX_EXPRESSION)||(LA88_4>=RULE_BEGIN && LA88_4<=RULE_ID)) ) {
                                    alt88=1;
                                }


                                }
                                break;
                            case RULE_HEX_INT:
                            case RULE_INT:
                            case RULE_FLOAT_LITERAL:
                            case RULE_VERSION:
                            case RULE_STRING:
                                {
                                alt88=1;
                                }
                                break;

                            }

                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalPipelineParser.g:3202:4: kw= HyphenMinus this_AnyData_1= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,HyphenMinus,FOLLOW_59); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_0_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_0_1());
                    	    			
                    	    pushFollow(FOLLOW_62);
                    	    this_AnyData_1=ruleAnyData();

                    	    state._fsp--;


                    	    				current.merge(this_AnyData_1);
                    	    			

                    	    				afterParserOrEnumRuleCall();
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt88 >= 1 ) break loop88;
                                EarlyExitException eee =
                                    new EarlyExitException(88, input);
                                throw eee;
                        }
                        cnt88++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3219:3: (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END )
                    {
                    // InternalPipelineParser.g:3219:3: (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END )
                    // InternalPipelineParser.g:3220:4: this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

                    				current.merge(this_BEGIN_2);
                    			

                    				newLeafNode(this_BEGIN_2, grammarAccess.getHyphenValuesAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:3227:4: (kw= HyphenMinus this_AnyData_4= ruleAnyData )+
                    int cnt89=0;
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==HyphenMinus) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalPipelineParser.g:3228:5: kw= HyphenMinus this_AnyData_4= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,HyphenMinus,FOLLOW_59); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_1_1_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_1_1_1());
                    	    				
                    	    pushFollow(FOLLOW_63);
                    	    this_AnyData_4=ruleAnyData();

                    	    state._fsp--;


                    	    					current.merge(this_AnyData_4);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt89 >= 1 ) break loop89;
                                EarlyExitException eee =
                                    new EarlyExitException(89, input);
                                throw eee;
                        }
                        cnt89++;
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
    // InternalPipelineParser.g:3256:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalPipelineParser.g:3256:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalPipelineParser.g:3257:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalPipelineParser.g:3263:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3269:2: (this_INT_0= RULE_INT )
            // InternalPipelineParser.g:3270:2: this_INT_0= RULE_INT
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
    // InternalPipelineParser.g:3280:1: entryRuleFloatingPoint returns [String current=null] : iv_ruleFloatingPoint= ruleFloatingPoint EOF ;
    public final String entryRuleFloatingPoint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPoint = null;


        try {
            // InternalPipelineParser.g:3280:53: (iv_ruleFloatingPoint= ruleFloatingPoint EOF )
            // InternalPipelineParser.g:3281:2: iv_ruleFloatingPoint= ruleFloatingPoint EOF
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
    // InternalPipelineParser.g:3287:1: ruleFloatingPoint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL ;
    public final AntlrDatatypeRuleToken ruleFloatingPoint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_LITERAL_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3293:2: (this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL )
            // InternalPipelineParser.g:3294:2: this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL
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
    // InternalPipelineParser.g:3304:1: entryRuleSimpleWord returns [String current=null] : iv_ruleSimpleWord= ruleSimpleWord EOF ;
    public final String entryRuleSimpleWord() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleWord = null;


        try {
            // InternalPipelineParser.g:3304:50: (iv_ruleSimpleWord= ruleSimpleWord EOF )
            // InternalPipelineParser.g:3305:2: iv_ruleSimpleWord= ruleSimpleWord EOF
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
    // InternalPipelineParser.g:3311:1: ruleSimpleWord returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSimpleWord() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3317:2: (this_ID_0= RULE_ID )
            // InternalPipelineParser.g:3318:2: this_ID_0= RULE_ID
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
    // InternalPipelineParser.g:3328:1: entryRuleArrayList returns [String current=null] : iv_ruleArrayList= ruleArrayList EOF ;
    public final String entryRuleArrayList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayList = null;


        try {
            // InternalPipelineParser.g:3328:49: (iv_ruleArrayList= ruleArrayList EOF )
            // InternalPipelineParser.g:3329:2: iv_ruleArrayList= ruleArrayList EOF
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
    // InternalPipelineParser.g:3335:1: ruleArrayList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleArrayList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AnyData_1 = null;

        AntlrDatatypeRuleToken this_AnyData_3 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3341:2: ( (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket ) )
            // InternalPipelineParser.g:3342:2: (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket )
            {
            // InternalPipelineParser.g:3342:2: (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket )
            // InternalPipelineParser.g:3343:3: kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_69); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArrayListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPipelineParser.g:3348:3: (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=RULE_COMPLEX_EXPRESSION && LA92_0<=RULE_VERSION)||LA92_0==RULE_ID||LA92_0==RULE_STRING) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalPipelineParser.g:3349:4: this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )*
                    {

                    				newCompositeNode(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_32);
                    this_AnyData_1=ruleAnyData();

                    state._fsp--;


                    				current.merge(this_AnyData_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPipelineParser.g:3359:4: (kw= Comma this_AnyData_3= ruleAnyData )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==Comma) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalPipelineParser.g:3360:5: kw= Comma this_AnyData_3= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,Comma,FOLLOW_59); 

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
                    	    break loop91;
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


    // $ANTLR start "rulePermission"
    // InternalPipelineParser.g:3386:1: rulePermission returns [Enumerator current=null] : ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) | (enumLiteral_2= Read ) | (enumLiteral_3= Write ) | (enumLiteral_4= None ) ) ;
    public final Enumerator rulePermission() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3392:2: ( ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) | (enumLiteral_2= Read ) | (enumLiteral_3= Write ) | (enumLiteral_4= None ) ) )
            // InternalPipelineParser.g:3393:2: ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) | (enumLiteral_2= Read ) | (enumLiteral_3= Write ) | (enumLiteral_4= None ) )
            {
            // InternalPipelineParser.g:3393:2: ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) | (enumLiteral_2= Read ) | (enumLiteral_3= Write ) | (enumLiteral_4= None ) )
            int alt93=5;
            switch ( input.LA(1) ) {
            case ReadAll:
                {
                alt93=1;
                }
                break;
            case WriteAll:
                {
                alt93=2;
                }
                break;
            case Read:
                {
                alt93=3;
                }
                break;
            case Write:
                {
                alt93=4;
                }
                break;
            case None:
                {
                alt93=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalPipelineParser.g:3394:3: (enumLiteral_0= ReadAll )
                    {
                    // InternalPipelineParser.g:3394:3: (enumLiteral_0= ReadAll )
                    // InternalPipelineParser.g:3395:4: enumLiteral_0= ReadAll
                    {
                    enumLiteral_0=(Token)match(input,ReadAll,FOLLOW_2); 

                    				current = grammarAccess.getPermissionAccess().getREAD_ALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPermissionAccess().getREAD_ALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3402:3: (enumLiteral_1= WriteAll )
                    {
                    // InternalPipelineParser.g:3402:3: (enumLiteral_1= WriteAll )
                    // InternalPipelineParser.g:3403:4: enumLiteral_1= WriteAll
                    {
                    enumLiteral_1=(Token)match(input,WriteAll,FOLLOW_2); 

                    				current = grammarAccess.getPermissionAccess().getWRITE_ALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPermissionAccess().getWRITE_ALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:3410:3: (enumLiteral_2= Read )
                    {
                    // InternalPipelineParser.g:3410:3: (enumLiteral_2= Read )
                    // InternalPipelineParser.g:3411:4: enumLiteral_2= Read
                    {
                    enumLiteral_2=(Token)match(input,Read,FOLLOW_2); 

                    				current = grammarAccess.getPermissionAccess().getREADEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPermissionAccess().getREADEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:3418:3: (enumLiteral_3= Write )
                    {
                    // InternalPipelineParser.g:3418:3: (enumLiteral_3= Write )
                    // InternalPipelineParser.g:3419:4: enumLiteral_3= Write
                    {
                    enumLiteral_3=(Token)match(input,Write,FOLLOW_2); 

                    				current = grammarAccess.getPermissionAccess().getWRITEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPermissionAccess().getWRITEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:3426:3: (enumLiteral_4= None )
                    {
                    // InternalPipelineParser.g:3426:3: (enumLiteral_4= None )
                    // InternalPipelineParser.g:3427:4: enumLiteral_4= None
                    {
                    enumLiteral_4=(Token)match(input,None,FOLLOW_2); 

                    				current = grammarAccess.getPermissionAccess().getNONEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPermissionAccess().getNONEEnumLiteralDeclaration_4());
                    			

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


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\5\15\uffff";
    static final String dfa_4s = "\1\114\15\uffff";
    static final String dfa_5s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_6s = "\1\0\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\15\1\4\1\uffff\1\15\2\uffff\1\15\1\7\4\uffff\1\15\1\6\1\15\1\uffff\1\11\1\15\1\13\1\uffff\1\15\1\4\4\uffff\1\3\1\15\3\uffff\1\15\1\uffff\2\14\1\uffff\1\12\14\uffff\1\2\1\15\1\10\1\uffff\1\5\1\15\3\uffff\1\15\13\uffff\1\4\1\15",
            "",
            "",
            "",
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

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_35= RULE_BEGIN (otherlv_36= Name ( (lv_vmName_37_0= RULE_ID ) ) ) (otherlv_38= VmImage ( ( (lv_vmImage_39_1= RULE_ID | lv_vmImage_39_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_40= Demands ( ( (lv_vmDemands_41_1= ruleAnyData | lv_vmDemands_41_2= ruleHyphenValues ) ) ) )? this_END_42= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Resources (this_BEGIN_44= RULE_BEGIN ( (lv_resources_45_0= ruleResource ) )* this_END_46= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= Version ( (lv_version_48_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= Variables ( (lv_variables_50_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_51_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_52_0= rulePipelineParameter ) )* ( (otherlv_53= On (this_BEGIN_54= RULE_BEGIN ( (lv_triggers_55_0= ruleEvent ) )+ this_END_56= RULE_END )? ( ( (lv_triggers_57_0= ruleEvent ) ) | (otherlv_58= LeftSquareBracket ( (lv_triggers_59_0= ruleEvent ) ) (otherlv_60= Comma ( (lv_triggers_61_0= ruleEvent ) ) )* otherlv_62= RightSquareBracket ) )? ) | ( (lv_triggers_63_0= ruleEvent ) )* ) otherlv_64= Job ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_0==EOF) ) {s = 1;}

                        else if ( LA24_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA24_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( ( LA24_0 == WorkingDirectory || LA24_0 == Defaults || LA24_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA24_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA24_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA24_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA24_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA24_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA24_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA24_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA24_0 >= Extends && LA24_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 12;}

                        else if ( ( LA24_0 == Workflow_dispatch || LA24_0 == Workflow_call || LA24_0 == Workflow_run || LA24_0 == Parameters || LA24_0 == Executors || LA24_0 == Schedules || LA24_0 == Commands || LA24_0 == Schedule || LA24_0 == Default || LA24_0 == Orbs || LA24_0 == Job || LA24_0 == On || LA24_0 == RULE_ID ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 13;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\7\12\uffff";
    static final String dfa_10s = "\1\113\12\uffff";
    static final String dfa_11s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_12s = "\1\0\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\1\uffff\1\10\4\uffff\1\12\1\3\10\uffff\1\5\24\uffff\1\4\1\2\1\uffff\1\7\1\uffff\1\11\30\uffff\1\1",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1102:8: ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (this_BEGIN_18= RULE_BEGIN ( (lv_includedBranches_19_0= ruleBranch ) )* (otherlv_20= Included ( (lv_includedBranches_21_0= ruleBranch ) )* )? (otherlv_22= Excluded ( (lv_excludedBranches_23_0= ruleBranch ) )* )? this_END_24= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= BranchesIgnore (this_BEGIN_26= RULE_BEGIN ( (lv_excludedBranches_27_0= ruleBranch ) )* this_END_28= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Paths (this_BEGIN_30= RULE_BEGIN ( (lv_includedPaths_31_0= ruleHyphenValues ) )? (otherlv_32= Included ( (lv_includedPaths_33_0= ruleHyphenValues ) ) )? (otherlv_34= Excluded ( (lv_excludedPaths_35_0= ruleHyphenValues ) ) )? this_END_36= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= PathsIgnore (this_BEGIN_38= RULE_BEGIN ( (lv_excludedPaths_39_0= ruleHyphenValues ) ) this_END_40= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Tags (this_BEGIN_42= RULE_BEGIN ( (lv_includedTags_43_0= ruleHyphenValues ) )? (otherlv_44= Included ( (lv_includedTags_45_0= ruleHyphenValues ) ) )? (otherlv_46= Excluded ( (lv_excludedTags_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= TagsIgnore (this_BEGIN_50= RULE_BEGIN ( (lv_excludedTags_51_0= ruleHyphenValues ) ) this_END_52= RULE_END ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_0 = input.LA(1);

                         
                        int index42_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA42_0==RULE_END) ) {s = 1;}

                        else if ( LA42_0 == Batch && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 0) ) {s = 2;}

                        else if ( LA42_0 == AutoCancel && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 1) ) {s = 3;}

                        else if ( LA42_0 == Drafts && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 2) ) {s = 4;}

                        else if ( LA42_0 == Branches && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 3) ) {s = 5;}

                        else if ( LA42_0 == BranchesIgnore && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 4) ) {s = 6;}

                        else if ( LA42_0 == Paths && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 5) ) {s = 7;}

                        else if ( LA42_0 == PathsIgnore && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 6) ) {s = 8;}

                        else if ( LA42_0 == Tags && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 7) ) {s = 9;}

                        else if ( LA42_0 == TagsIgnore && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 8) ) {s = 10;}

                         
                        input.seek(index42_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\14\uffff";
    static final String dfa_15s = "\1\1\13\uffff";
    static final String dfa_16s = "\1\5\1\uffff\1\5\1\uffff\1\5\1\105\2\uffff\1\7\3\uffff";
    static final String dfa_17s = "\1\114\1\uffff\1\117\1\uffff\1\120\1\117\2\uffff\1\114\3\uffff";
    static final String dfa_18s = "\1\uffff\1\2\1\uffff\1\1\2\uffff\2\1\1\uffff\3\1";
    static final String dfa_19s = "\14\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\2\uffff\1\1\2\uffff\1\1\12\uffff\1\1\11\uffff\1\1\2\uffff\1\3\4\uffff\1\3\20\uffff\1\3\1\uffff\1\1\2\3\2\uffff\1\1\1\3\2\uffff\1\1\1\3\5\uffff\1\1\1\2",
            "",
            "\1\1\2\uffff\1\1\2\uffff\1\1\12\uffff\1\1\11\uffff\1\1\32\uffff\1\1\5\uffff\1\1\1\4\7\uffff\3\1\2\uffff\1\1",
            "",
            "\1\1\2\uffff\1\1\2\uffff\1\1\12\uffff\1\1\11\uffff\1\1\32\uffff\1\1\5\uffff\1\5\1\uffff\1\7\1\uffff\5\7\1\10\1\1\1\6\2\uffff\2\7",
            "\5\12\2\uffff\1\11\2\uffff\1\12",
            "",
            "",
            "\1\1\1\uffff\1\1\4\uffff\2\1\10\uffff\1\1\12\uffff\1\13\4\uffff\1\13\4\uffff\2\1\1\uffff\1\1\1\uffff\2\1\5\uffff\1\13\2\uffff\2\13\3\uffff\1\13\3\uffff\1\13\4\uffff\1\1\2\13",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 1741:5: ( (lv_otherEventParameterValues_57_0= ruleParameterValue ) )*";
        }
    }
    static final String dfa_21s = "\1\5\1\uffff\1\5\1\uffff\1\5\1\7\2\uffff\1\105\3\uffff";
    static final String dfa_22s = "\1\114\1\uffff\1\117\1\uffff\1\120\1\114\2\uffff\1\117\3\uffff";
    static final String[] dfa_23s = {
            "\1\1\2\uffff\1\1\2\uffff\1\1\5\uffff\1\1\1\uffff\1\1\2\uffff\1\1\2\uffff\1\1\6\uffff\1\1\2\uffff\1\3\1\1\3\uffff\1\3\16\uffff\1\1\1\uffff\1\3\1\uffff\1\1\2\3\1\uffff\1\1\1\uffff\1\3\3\uffff\1\3\6\uffff\1\2",
            "",
            "\1\1\2\uffff\1\1\2\uffff\1\1\12\uffff\1\1\11\uffff\1\1\32\uffff\1\1\5\uffff\1\1\1\4\7\uffff\1\1\1\uffff\1\1\2\uffff\1\1",
            "",
            "\1\1\2\uffff\1\1\2\uffff\1\1\12\uffff\1\1\11\uffff\1\1\32\uffff\1\1\5\uffff\1\10\1\uffff\1\7\1\uffff\2\7\2\6\1\7\1\5\1\uffff\1\7\2\uffff\1\6\1\3",
            "\1\1\1\uffff\1\1\4\uffff\2\1\10\uffff\1\1\12\uffff\1\11\4\uffff\1\11\4\uffff\2\1\1\uffff\1\1\1\uffff\2\1\5\uffff\1\11\2\uffff\2\11\3\uffff\1\7\3\uffff\1\11\4\uffff\1\1\2\11",
            "",
            "",
            "\2\13\2\12\1\13\2\uffff\1\13\2\uffff\1\12",
            "",
            "",
            ""
    };
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "()+ loopback of 2648:4: ( (lv_parameterValues_1_0= ruleParameterValue ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8DC002D186EE1962L,0x0000000000001800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x8DC202D186EE1962L,0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x3200010800000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8DC006F186EE1962L,0x0000000000001C00L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x8DC002F186EE1962L,0x0000000000001C00L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x00000000000097E2L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100420110400L,0x0000000000000800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x8DC002D186EE1962L,0x0000000000001C02L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x88800011024A0920L,0x0000000000001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0800000100400920L,0x0000000000001408L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100400920L,0x0000000000001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100400920L,0x0000000000001800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000100400920L,0x0000000000001008L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0800000100400920L,0x0000000000001000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000000000009406L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000002L,0x0000000000009402L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000D60000100C280L,0x0000000000000C00L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x00000000000097EAL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000560000100C280L,0x0000000000000800L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000560000100C280L,0x0000000000009C02L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000560000100C280L,0x0000000000009802L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000018000000L,0x0000000000009802L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000008000000L,0x0000000000009802L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009802L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000018000000L,0x0000000000009FE2L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000018000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000402L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x3200010800000002L,0x0000000000001022L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000480000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x3200010800000000L,0x0000000000001822L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x3200010800000000L,0x0000000000001022L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x00000000000093E0L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x3200010800000000L,0x0000000000001020L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x00000000000197EAL});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x3200000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x00000000000010A0L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x00000000000093F0L});

}
