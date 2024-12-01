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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CancelInProgress", "WorkingDirectory", "Repositories", "Concurrency", "DisplayName", "Containers", "Parameters", "Permission", "Pipelines", "Resources", "Variables", "Defaults", "Packages", "Readonly", "RunName", "Template", "Webhooks", "WriteAll", "Default", "Demands", "Extends", "Include", "ReadAll", "VmImage", "Builds", "Group", "Shell", "Value", "Name", "Pool", "Write", "Env", "None", "Read", "Run", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_COMPLEX_EXPRESSION", "RULE_HEX_INT", "RULE_INT", "RULE_FLOAT_LITERAL", "RULE_VERSION", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
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
    // InternalPipelineParser.g:65:1: rulePipeline returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) ) )* ) ) ) ;
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
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token this_BEGIN_38=null;
        Token otherlv_39=null;
        Token lv_vmName_40_0=null;
        Token otherlv_41=null;
        Token lv_vmImage_42_1=null;
        Token lv_vmImage_42_2=null;
        Token otherlv_43=null;
        Token this_END_45=null;
        Token otherlv_46=null;
        Token this_BEGIN_47=null;
        Token this_END_49=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_runName_4_0 = null;

        AntlrDatatypeRuleToken lv_env_19_0 = null;

        Enumerator lv_allPermission_22_0 = null;

        AntlrDatatypeRuleToken lv_indPermissions_24_0 = null;

        EObject lv_pipelineParameters_35_0 = null;

        AntlrDatatypeRuleToken lv_vmDemands_44_1 = null;

        AntlrDatatypeRuleToken lv_vmDemands_44_2 = null;

        EObject lv_resources_48_0 = null;

        EObject lv_pipelineParameters_51_0 = null;

        EObject lv_variables_53_0 = null;

        EObject lv_extendedParameter_54_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:71:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) ) )* ) ) ) )
            // InternalPipelineParser.g:72:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) ) )* ) ) )
            {
            // InternalPipelineParser.g:72:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) ) )* ) ) )
            // InternalPipelineParser.g:73:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) ) )* ) )
            {
            // InternalPipelineParser.g:73:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) ) )* ) )
            // InternalPipelineParser.g:74:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup());
            			
            // InternalPipelineParser.g:77:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) ) )* )
            // InternalPipelineParser.g:78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) ) )*
            {
            // InternalPipelineParser.g:78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) ) )*
            loop18:
            do {
                int alt18=13;
                alt18 = dfa18.predict(input);
                switch (alt18) {
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
            	    // InternalPipelineParser.g:488:3: ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) )
            	    {
            	    // InternalPipelineParser.g:488:3: ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) )
            	    // InternalPipelineParser.g:489:4: {...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalPipelineParser.g:489:102: ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) )
            	    // InternalPipelineParser.g:490:5: ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalPipelineParser.g:493:8: ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) )
            	    // InternalPipelineParser.g:493:9: {...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:493:18: (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* )
            	    // InternalPipelineParser.g:493:19: otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )*
            	    {
            	    otherlv_33=(Token)match(input,Parameters,FOLLOW_17); 

            	    								newLeafNode(otherlv_33, grammarAccess.getPipelineAccess().getParametersKeyword_6_0());
            	    							
            	    // InternalPipelineParser.g:497:8: (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==HyphenMinus) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:498:9: otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) )
            	    	    {
            	    	    otherlv_34=(Token)match(input,HyphenMinus,FOLLOW_18); 

            	    	    									newLeafNode(otherlv_34, grammarAccess.getPipelineAccess().getHyphenMinusKeyword_6_1_0());
            	    	    								
            	    	    // InternalPipelineParser.g:502:9: ( (lv_pipelineParameters_35_0= rulePipelineParameter ) )
            	    	    // InternalPipelineParser.g:503:10: (lv_pipelineParameters_35_0= rulePipelineParameter )
            	    	    {
            	    	    // InternalPipelineParser.g:503:10: (lv_pipelineParameters_35_0= rulePipelineParameter )
            	    	    // InternalPipelineParser.g:504:11: lv_pipelineParameters_35_0= rulePipelineParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPipelineAccess().getPipelineParametersPipelineParameterParserRuleCall_6_1_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_pipelineParameters_35_0=rulePipelineParameter();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"pipelineParameters",
            	    	    												lv_pipelineParameters_35_0,
            	    	    												"ca.mcgill.devops.pipeline.Pipeline.PipelineParameter");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalPipelineParser.g:528:3: ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:528:3: ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
            	    // InternalPipelineParser.g:529:4: {...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalPipelineParser.g:529:102: ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // InternalPipelineParser.g:530:5: ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalPipelineParser.g:533:8: ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            	    // InternalPipelineParser.g:533:9: {...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:533:18: (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) )
            	    // InternalPipelineParser.g:533:19: otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) )
            	    {
            	    otherlv_36=(Token)match(input,Pool,FOLLOW_19); 

            	    								newLeafNode(otherlv_36, grammarAccess.getPipelineAccess().getPoolKeyword_7_0());
            	    							
            	    // InternalPipelineParser.g:537:8: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) )
            	    // InternalPipelineParser.g:538:9: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) )
            	    {
            	    // InternalPipelineParser.g:538:9: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) )
            	    // InternalPipelineParser.g:539:10: ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?)
            	    {
            	     
            	    									  getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1());
            	    									
            	    // InternalPipelineParser.g:542:10: ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?)
            	    // InternalPipelineParser.g:543:11: ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?
            	    {
            	    // InternalPipelineParser.g:543:11: ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=3;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==RULE_END) ) {
            	            int LA15_2 = input.LA(2);

            	            if ( ( LA15_2 == EOF || LA15_2 == WorkingDirectory || LA15_2 == Concurrency || LA15_2 >= Parameters && LA15_2 <= Permission || LA15_2 >= Resources && LA15_2 <= Defaults || LA15_2 == RunName || LA15_2 >= Default && LA15_2 <= Include || LA15_2 >= Name && LA15_2 <= Pool || LA15_2 == Env || LA15_2 == RULE_BEGIN ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {
            	                alt15=2;
            	            }
            	            else if ( (LA15_2==RULE_END) ) {
            	                int LA15_5 = input.LA(3);

            	                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {
            	                    alt15=2;
            	                }


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
            	    	    // InternalPipelineParser.g:544:9: ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:544:9: ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) )
            	    	    // InternalPipelineParser.g:545:10: {...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0)");
            	    	    }
            	    	    // InternalPipelineParser.g:545:112: ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) )
            	    	    // InternalPipelineParser.g:546:11: ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0);
            	    	    										
            	    	    // InternalPipelineParser.g:549:14: ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) )
            	    	    // InternalPipelineParser.g:549:15: {...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:549:24: (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? )
            	    	    // InternalPipelineParser.g:549:25: this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )?
            	    	    {
            	    	    this_BEGIN_38=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            	    	    														newLeafNode(this_BEGIN_38, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_7_1_0_0());
            	    	    													
            	    	    // InternalPipelineParser.g:553:14: (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) )
            	    	    // InternalPipelineParser.g:554:15: otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,Name,FOLLOW_3); 

            	    	    															newLeafNode(otherlv_39, grammarAccess.getPipelineAccess().getNameKeyword_7_1_0_1_0());
            	    	    														
            	    	    // InternalPipelineParser.g:558:15: ( (lv_vmName_40_0= RULE_ID ) )
            	    	    // InternalPipelineParser.g:559:16: (lv_vmName_40_0= RULE_ID )
            	    	    {
            	    	    // InternalPipelineParser.g:559:16: (lv_vmName_40_0= RULE_ID )
            	    	    // InternalPipelineParser.g:560:17: lv_vmName_40_0= RULE_ID
            	    	    {
            	    	    lv_vmName_40_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    	    																	newLeafNode(lv_vmName_40_0, grammarAccess.getPipelineAccess().getVmNameIDTerminalRuleCall_7_1_0_1_1_0());
            	    	    																

            	    	    																	if (current==null) {
            	    	    																		current = createModelElement(grammarAccess.getPipelineRule());
            	    	    																	}
            	    	    																	setWithLastConsumed(
            	    	    																		current,
            	    	    																		"vmName",
            	    	    																		lv_vmName_40_0,
            	    	    																		"ca.mcgill.devops.pipeline.Pipeline.ID");
            	    	    																

            	    	    }


            	    	    }


            	    	    }

            	    	    // InternalPipelineParser.g:577:14: (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )?
            	    	    int alt12=2;
            	    	    int LA12_0 = input.LA(1);

            	    	    if ( (LA12_0==VmImage) ) {
            	    	        alt12=1;
            	    	    }
            	    	    switch (alt12) {
            	    	        case 1 :
            	    	            // InternalPipelineParser.g:578:15: otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) )
            	    	            {
            	    	            otherlv_41=(Token)match(input,VmImage,FOLLOW_22); 

            	    	            															newLeafNode(otherlv_41, grammarAccess.getPipelineAccess().getVmImageKeyword_7_1_0_2_0());
            	    	            														
            	    	            // InternalPipelineParser.g:582:15: ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) )
            	    	            // InternalPipelineParser.g:583:16: ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) )
            	    	            {
            	    	            // InternalPipelineParser.g:583:16: ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) )
            	    	            // InternalPipelineParser.g:584:17: (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING )
            	    	            {
            	    	            // InternalPipelineParser.g:584:17: (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING )
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
            	    	                    // InternalPipelineParser.g:585:18: lv_vmImage_42_1= RULE_ID
            	    	                    {
            	    	                    lv_vmImage_42_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    	                    																		newLeafNode(lv_vmImage_42_1, grammarAccess.getPipelineAccess().getVmImageIDTerminalRuleCall_7_1_0_2_1_0_0());
            	    	                    																	

            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElement(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		setWithLastConsumed(
            	    	                    																			current,
            	    	                    																			"vmImage",
            	    	                    																			lv_vmImage_42_1,
            	    	                    																			"ca.mcgill.devops.pipeline.Pipeline.ID");
            	    	                    																	

            	    	                    }
            	    	                    break;
            	    	                case 2 :
            	    	                    // InternalPipelineParser.g:600:18: lv_vmImage_42_2= RULE_STRING
            	    	                    {
            	    	                    lv_vmImage_42_2=(Token)match(input,RULE_STRING,FOLLOW_23); 

            	    	                    																		newLeafNode(lv_vmImage_42_2, grammarAccess.getPipelineAccess().getVmImageSTRINGTerminalRuleCall_7_1_0_2_1_0_1());
            	    	                    																	

            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElement(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		setWithLastConsumed(
            	    	                    																			current,
            	    	                    																			"vmImage",
            	    	                    																			lv_vmImage_42_2,
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
            	    	    // InternalPipelineParser.g:624:9: ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:624:9: ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) )
            	    	    // InternalPipelineParser.g:625:10: {...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1)");
            	    	    }
            	    	    // InternalPipelineParser.g:625:112: ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) )
            	    	    // InternalPipelineParser.g:626:11: ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1);
            	    	    										
            	    	    // InternalPipelineParser.g:629:14: ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) )
            	    	    // InternalPipelineParser.g:629:15: {...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:629:24: ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END )
            	    	    // InternalPipelineParser.g:629:25: (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END
            	    	    {
            	    	    // InternalPipelineParser.g:629:25: (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )?
            	    	    int alt14=2;
            	    	    int LA14_0 = input.LA(1);

            	    	    if ( (LA14_0==Demands) ) {
            	    	        alt14=1;
            	    	    }
            	    	    switch (alt14) {
            	    	        case 1 :
            	    	            // InternalPipelineParser.g:630:15: otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) )
            	    	            {
            	    	            otherlv_43=(Token)match(input,Demands,FOLLOW_24); 

            	    	            															newLeafNode(otherlv_43, grammarAccess.getPipelineAccess().getDemandsKeyword_7_1_1_0_0());
            	    	            														
            	    	            // InternalPipelineParser.g:634:15: ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) )
            	    	            // InternalPipelineParser.g:635:16: ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) )
            	    	            {
            	    	            // InternalPipelineParser.g:635:16: ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) )
            	    	            // InternalPipelineParser.g:636:17: (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues )
            	    	            {
            	    	            // InternalPipelineParser.g:636:17: (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues )
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
            	    	                    // InternalPipelineParser.g:637:18: lv_vmDemands_44_1= ruleAnyData
            	    	                    {

            	    	                    																		newCompositeNode(grammarAccess.getPipelineAccess().getVmDemandsAnyDataParserRuleCall_7_1_1_0_1_0_0());
            	    	                    																	
            	    	                    pushFollow(FOLLOW_9);
            	    	                    lv_vmDemands_44_1=ruleAnyData();

            	    	                    state._fsp--;


            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		set(
            	    	                    																			current,
            	    	                    																			"vmDemands",
            	    	                    																			lv_vmDemands_44_1,
            	    	                    																			"ca.mcgill.devops.pipeline.Pipeline.AnyData");
            	    	                    																		afterParserOrEnumRuleCall();
            	    	                    																	

            	    	                    }
            	    	                    break;
            	    	                case 2 :
            	    	                    // InternalPipelineParser.g:653:18: lv_vmDemands_44_2= ruleHyphenValues
            	    	                    {

            	    	                    																		newCompositeNode(grammarAccess.getPipelineAccess().getVmDemandsHyphenValuesParserRuleCall_7_1_1_0_1_0_1());
            	    	                    																	
            	    	                    pushFollow(FOLLOW_9);
            	    	                    lv_vmDemands_44_2=ruleHyphenValues();

            	    	                    state._fsp--;


            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		set(
            	    	                    																			current,
            	    	                    																			"vmDemands",
            	    	                    																			lv_vmDemands_44_2,
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

            	    	    this_END_45=(Token)match(input,RULE_END,FOLLOW_23); 

            	    	    														newLeafNode(this_END_45, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_7_1_1_1());
            	    	    													

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
            	    // InternalPipelineParser.g:696:3: ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:696:3: ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) )
            	    // InternalPipelineParser.g:697:4: {...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalPipelineParser.g:697:102: ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:698:5: ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalPipelineParser.g:701:8: ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) )
            	    // InternalPipelineParser.g:701:9: {...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:701:18: (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) )
            	    // InternalPipelineParser.g:701:19: otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END )
            	    {
            	    otherlv_46=(Token)match(input,Resources,FOLLOW_5); 

            	    								newLeafNode(otherlv_46, grammarAccess.getPipelineAccess().getResourcesKeyword_8_0());
            	    							
            	    // InternalPipelineParser.g:705:8: (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END )
            	    // InternalPipelineParser.g:706:9: this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END
            	    {
            	    this_BEGIN_47=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

            	    									newLeafNode(this_BEGIN_47, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_8_1_0());
            	    								
            	    // InternalPipelineParser.g:710:9: ( (lv_resources_48_0= ruleResource ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==Repositories||LA16_0==Containers||LA16_0==Pipelines||LA16_0==Packages||LA16_0==Webhooks||LA16_0==Builds) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:711:10: (lv_resources_48_0= ruleResource )
            	    	    {
            	    	    // InternalPipelineParser.g:711:10: (lv_resources_48_0= ruleResource )
            	    	    // InternalPipelineParser.g:712:11: lv_resources_48_0= ruleResource
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPipelineAccess().getResourcesResourceParserRuleCall_8_1_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_resources_48_0=ruleResource();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"resources",
            	    	    												lv_resources_48_0,
            	    	    												"ca.mcgill.devops.pipeline.Pipeline.Resource");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);

            	    this_END_49=(Token)match(input,RULE_END,FOLLOW_4); 

            	    									newLeafNode(this_END_49, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_8_1_2());
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalPipelineParser.g:740:3: ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:740:3: ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) )
            	    // InternalPipelineParser.g:741:4: {...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalPipelineParser.g:741:102: ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) )
            	    // InternalPipelineParser.g:742:5: ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalPipelineParser.g:745:8: ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) )
            	    // InternalPipelineParser.g:745:9: {...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:745:18: (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) )
            	    // InternalPipelineParser.g:745:19: otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) )
            	    {
            	    otherlv_50=(Token)match(input,Default,FOLLOW_18); 

            	    								newLeafNode(otherlv_50, grammarAccess.getPipelineAccess().getDefaultKeyword_9_0());
            	    							
            	    // InternalPipelineParser.g:749:8: ( (lv_pipelineParameters_51_0= rulePipelineParameter ) )
            	    // InternalPipelineParser.g:750:9: (lv_pipelineParameters_51_0= rulePipelineParameter )
            	    {
            	    // InternalPipelineParser.g:750:9: (lv_pipelineParameters_51_0= rulePipelineParameter )
            	    // InternalPipelineParser.g:751:10: lv_pipelineParameters_51_0= rulePipelineParameter
            	    {

            	    										newCompositeNode(grammarAccess.getPipelineAccess().getPipelineParametersPipelineParameterParserRuleCall_9_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_pipelineParameters_51_0=rulePipelineParameter();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    										}
            	    										add(
            	    											current,
            	    											"pipelineParameters",
            	    											lv_pipelineParameters_51_0,
            	    											"ca.mcgill.devops.pipeline.Pipeline.PipelineParameter");
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
            	case 11 :
            	    // InternalPipelineParser.g:774:3: ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) )
            	    {
            	    // InternalPipelineParser.g:774:3: ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) )
            	    // InternalPipelineParser.g:775:4: {...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalPipelineParser.g:775:103: ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) )
            	    // InternalPipelineParser.g:776:5: ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10);
            	    				
            	    // InternalPipelineParser.g:779:8: ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) )
            	    // InternalPipelineParser.g:779:9: {...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:779:18: (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* )
            	    // InternalPipelineParser.g:779:19: otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )*
            	    {
            	    otherlv_52=(Token)match(input,Variables,FOLLOW_26); 

            	    								newLeafNode(otherlv_52, grammarAccess.getPipelineAccess().getVariablesKeyword_10_0());
            	    							
            	    // InternalPipelineParser.g:783:8: ( (lv_variables_53_0= ruleVariable ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==HyphenMinus||LA17_0==RULE_BEGIN) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:784:9: (lv_variables_53_0= ruleVariable )
            	    	    {
            	    	    // InternalPipelineParser.g:784:9: (lv_variables_53_0= ruleVariable )
            	    	    // InternalPipelineParser.g:785:10: lv_variables_53_0= ruleVariable
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPipelineAccess().getVariablesVariableParserRuleCall_10_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_variables_53_0=ruleVariable();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"variables",
            	    	    											lv_variables_53_0,
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
            	    // InternalPipelineParser.g:808:3: ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:808:3: ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) )
            	    // InternalPipelineParser.g:809:4: {...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11)");
            	    }
            	    // InternalPipelineParser.g:809:103: ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) )
            	    // InternalPipelineParser.g:810:5: ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11);
            	    				
            	    // InternalPipelineParser.g:813:8: ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) )
            	    // InternalPipelineParser.g:813:9: {...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:813:18: ( (lv_extendedParameter_54_0= ruleExtendedParameter ) )
            	    // InternalPipelineParser.g:813:19: (lv_extendedParameter_54_0= ruleExtendedParameter )
            	    {
            	    // InternalPipelineParser.g:813:19: (lv_extendedParameter_54_0= ruleExtendedParameter )
            	    // InternalPipelineParser.g:814:9: lv_extendedParameter_54_0= ruleExtendedParameter
            	    {

            	    									newCompositeNode(grammarAccess.getPipelineAccess().getExtendedParameterExtendedParameterParserRuleCall_11_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_extendedParameter_54_0=ruleExtendedParameter();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    									}
            	    									set(
            	    										current,
            	    										"extendedParameter",
            	    										lv_extendedParameter_54_0,
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

            	default :
            	    break loop18;
                }
            } while (true);


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
    // InternalPipelineParser.g:846:1: entryRuleExtendedParameter returns [EObject current=null] : iv_ruleExtendedParameter= ruleExtendedParameter EOF ;
    public final EObject entryRuleExtendedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedParameter = null;


        try {
            // InternalPipelineParser.g:846:58: (iv_ruleExtendedParameter= ruleExtendedParameter EOF )
            // InternalPipelineParser.g:847:2: iv_ruleExtendedParameter= ruleExtendedParameter EOF
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
    // InternalPipelineParser.g:853:1: ruleExtendedParameter returns [EObject current=null] : ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) ) ;
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
            // InternalPipelineParser.g:859:2: ( ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) ) )
            // InternalPipelineParser.g:860:2: ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) )
            {
            // InternalPipelineParser.g:860:2: ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Extends) ) {
                alt21=1;
            }
            else if ( (LA21_0==Include) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPipelineParser.g:861:3: (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) )
                    {
                    // InternalPipelineParser.g:861:3: (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) )
                    // InternalPipelineParser.g:862:4: otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END )
                    {
                    otherlv_0=(Token)match(input,Extends,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getExtendedParameterAccess().getExtendsKeyword_0_0());
                    			
                    // InternalPipelineParser.g:866:4: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END )
                    // InternalPipelineParser.g:867:5: this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END
                    {
                    this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_27); 

                    					newLeafNode(this_BEGIN_1, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_0());
                    				
                    // InternalPipelineParser.g:871:5: (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) )
                    // InternalPipelineParser.g:872:6: otherlv_2= Template ( (lv_template_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,Template,FOLLOW_3); 

                    						newLeafNode(otherlv_2, grammarAccess.getExtendedParameterAccess().getTemplateKeyword_0_1_1_0());
                    					
                    // InternalPipelineParser.g:876:6: ( (lv_template_3_0= RULE_ID ) )
                    // InternalPipelineParser.g:877:7: (lv_template_3_0= RULE_ID )
                    {
                    // InternalPipelineParser.g:877:7: (lv_template_3_0= RULE_ID )
                    // InternalPipelineParser.g:878:8: lv_template_3_0= RULE_ID
                    {
                    lv_template_3_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

                    // InternalPipelineParser.g:895:5: (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) )
                    // InternalPipelineParser.g:896:6: otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    {
                    otherlv_4=(Token)match(input,Parameters,FOLLOW_5); 

                    						newLeafNode(otherlv_4, grammarAccess.getExtendedParameterAccess().getParametersKeyword_0_1_2_0());
                    					
                    // InternalPipelineParser.g:900:6: (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    // InternalPipelineParser.g:901:7: this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

                    							newLeafNode(this_BEGIN_5, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_2_1_0());
                    						
                    // InternalPipelineParser.g:905:7: ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==WriteAll||LA19_0==ReadAll||LA19_0==Write||(LA19_0>=None && LA19_0<=Read)||LA19_0==HyphenMinus||LA19_0==RULE_COMPLEX_EXPRESSION||LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalPipelineParser.g:906:8: (lv_extendedParameterValues_6_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:906:8: (lv_extendedParameterValues_6_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:907:9: lv_extendedParameterValues_6_0= ruleParameterValue
                    	    {

                    	    									newCompositeNode(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_0_1_2_1_1_0());
                    	    								
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop19;
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
                    // InternalPipelineParser.g:937:3: (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) )
                    {
                    // InternalPipelineParser.g:937:3: (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) )
                    // InternalPipelineParser.g:938:4: otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END )
                    {
                    otherlv_9=(Token)match(input,Include,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getExtendedParameterAccess().getIncludeKeyword_1_0());
                    			
                    // InternalPipelineParser.g:942:4: (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END )
                    // InternalPipelineParser.g:943:5: this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END
                    {
                    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

                    					newLeafNode(this_BEGIN_10, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:947:5: ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==WriteAll||LA20_0==ReadAll||LA20_0==Write||(LA20_0>=None && LA20_0<=Read)||LA20_0==HyphenMinus||LA20_0==RULE_COMPLEX_EXPRESSION||LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalPipelineParser.g:948:6: (lv_extendedParameterValues_11_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:948:6: (lv_extendedParameterValues_11_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:949:7: lv_extendedParameterValues_11_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
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
    // InternalPipelineParser.g:976:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPipelineParser.g:976:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPipelineParser.g:977:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalPipelineParser.g:983:1: ruleVariable returns [EObject current=null] : ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) ) ;
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
            // InternalPipelineParser.g:989:2: ( ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) ) )
            // InternalPipelineParser.g:990:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) )
            {
            // InternalPipelineParser.g:990:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_BEGIN) ) {
                alt25=1;
            }
            else if ( (LA25_0==HyphenMinus) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPipelineParser.g:991:3: (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END )
                    {
                    // InternalPipelineParser.g:991:3: (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END )
                    // InternalPipelineParser.g:992:4: this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END
                    {
                    this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

                    				newLeafNode(this_BEGIN_0, grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_0_0());
                    			
                    // InternalPipelineParser.g:996:4: ( (lv_variableValues_1_0= ruleParameterValue ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==WriteAll||LA22_0==ReadAll||LA22_0==Write||(LA22_0>=None && LA22_0<=Read)||LA22_0==HyphenMinus||LA22_0==RULE_COMPLEX_EXPRESSION||LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalPipelineParser.g:997:5: (lv_variableValues_1_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:997:5: (lv_variableValues_1_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:998:6: lv_variableValues_1_0= ruleParameterValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getVariableAccess().getVariableValuesParameterValueParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
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
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    this_END_2=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_2, grammarAccess.getVariableAccess().getENDTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1021:3: ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) )
                    {
                    // InternalPipelineParser.g:1021:3: ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) )
                    // InternalPipelineParser.g:1022:4: (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) )
                    {
                    // InternalPipelineParser.g:1022:4: (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==HyphenMinus) ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==Group) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalPipelineParser.g:1023:5: otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) )
                            {
                            otherlv_3=(Token)match(input,HyphenMinus,FOLLOW_14); 

                            					newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_0_0());
                            				
                            otherlv_4=(Token)match(input,Group,FOLLOW_31); 

                            					newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getGroupKeyword_1_0_1());
                            				
                            // InternalPipelineParser.g:1031:5: ( (lv_group_5_0= ruleAnyData ) )
                            // InternalPipelineParser.g:1032:6: (lv_group_5_0= ruleAnyData )
                            {
                            // InternalPipelineParser.g:1032:6: (lv_group_5_0= ruleAnyData )
                            // InternalPipelineParser.g:1033:7: lv_group_5_0= ruleAnyData
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getGroupAnyDataParserRuleCall_1_0_2_0());
                            						
                            pushFollow(FOLLOW_32);
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

                    // InternalPipelineParser.g:1051:4: ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) )
                    // InternalPipelineParser.g:1052:5: (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END )
                    {
                    // InternalPipelineParser.g:1052:5: (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) )
                    // InternalPipelineParser.g:1053:6: otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) )
                    {
                    otherlv_6=(Token)match(input,HyphenMinus,FOLLOW_20); 

                    						newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_1_0_0());
                    					
                    otherlv_7=(Token)match(input,Name,FOLLOW_31); 

                    						newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getNameKeyword_1_1_0_1());
                    					
                    // InternalPipelineParser.g:1061:6: ( (lv_name_8_0= ruleAnyData ) )
                    // InternalPipelineParser.g:1062:7: (lv_name_8_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:1062:7: (lv_name_8_0= ruleAnyData )
                    // InternalPipelineParser.g:1063:8: lv_name_8_0= ruleAnyData
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

                    // InternalPipelineParser.g:1081:5: (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END )
                    // InternalPipelineParser.g:1082:6: this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END
                    {
                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_33); 

                    						newLeafNode(this_BEGIN_9, grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_1_1_1_0());
                    					
                    // InternalPipelineParser.g:1086:6: (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) )
                    // InternalPipelineParser.g:1087:7: otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) )
                    {
                    otherlv_10=(Token)match(input,Value,FOLLOW_31); 

                    							newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getValueKeyword_1_1_1_1_0());
                    						
                    // InternalPipelineParser.g:1091:7: ( (lv_value_11_0= ruleAnyData ) )
                    // InternalPipelineParser.g:1092:8: (lv_value_11_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:1092:8: (lv_value_11_0= ruleAnyData )
                    // InternalPipelineParser.g:1093:9: lv_value_11_0= ruleAnyData
                    {

                    									newCompositeNode(grammarAccess.getVariableAccess().getValueAnyDataParserRuleCall_1_1_1_1_1_0());
                    								
                    pushFollow(FOLLOW_34);
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

                    // InternalPipelineParser.g:1111:6: (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==Readonly) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalPipelineParser.g:1112:7: otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) )
                            {
                            otherlv_12=(Token)match(input,Readonly,FOLLOW_3); 

                            							newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getReadonlyKeyword_1_1_1_2_0());
                            						
                            // InternalPipelineParser.g:1116:7: ( (lv_readonly_13_0= RULE_ID ) )
                            // InternalPipelineParser.g:1117:8: (lv_readonly_13_0= RULE_ID )
                            {
                            // InternalPipelineParser.g:1117:8: (lv_readonly_13_0= RULE_ID )
                            // InternalPipelineParser.g:1118:9: lv_readonly_13_0= RULE_ID
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
    // InternalPipelineParser.g:1146:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalPipelineParser.g:1146:49: (iv_ruleResource= ruleResource EOF )
            // InternalPipelineParser.g:1147:2: iv_ruleResource= ruleResource EOF
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
    // InternalPipelineParser.g:1153:1: ruleResource returns [EObject current=null] : ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) ) ;
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
            // InternalPipelineParser.g:1159:2: ( ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) ) )
            // InternalPipelineParser.g:1160:2: ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) )
            {
            // InternalPipelineParser.g:1160:2: ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) )
            // InternalPipelineParser.g:1161:3: ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) )
            {
            // InternalPipelineParser.g:1161:3: ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) )
            // InternalPipelineParser.g:1162:4: ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) )
            {
            // InternalPipelineParser.g:1162:4: ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) )
            // InternalPipelineParser.g:1163:5: (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages )
            {
            // InternalPipelineParser.g:1163:5: (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages )
            int alt26=6;
            switch ( input.LA(1) ) {
            case Builds:
                {
                alt26=1;
                }
                break;
            case Containers:
                {
                alt26=2;
                }
                break;
            case Pipelines:
                {
                alt26=3;
                }
                break;
            case Repositories:
                {
                alt26=4;
                }
                break;
            case Webhooks:
                {
                alt26=5;
                }
                break;
            case Packages:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalPipelineParser.g:1164:6: lv_resourceName_0_1= Builds
                    {
                    lv_resourceName_0_1=(Token)match(input,Builds,FOLLOW_35); 

                    						newLeafNode(lv_resourceName_0_1, grammarAccess.getResourceAccess().getResourceNameBuildsKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1175:6: lv_resourceName_0_2= Containers
                    {
                    lv_resourceName_0_2=(Token)match(input,Containers,FOLLOW_35); 

                    						newLeafNode(lv_resourceName_0_2, grammarAccess.getResourceAccess().getResourceNameContainersKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:1186:6: lv_resourceName_0_3= Pipelines
                    {
                    lv_resourceName_0_3=(Token)match(input,Pipelines,FOLLOW_35); 

                    						newLeafNode(lv_resourceName_0_3, grammarAccess.getResourceAccess().getResourceNamePipelinesKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:1197:6: lv_resourceName_0_4= Repositories
                    {
                    lv_resourceName_0_4=(Token)match(input,Repositories,FOLLOW_35); 

                    						newLeafNode(lv_resourceName_0_4, grammarAccess.getResourceAccess().getResourceNameRepositoriesKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:1208:6: lv_resourceName_0_5= Webhooks
                    {
                    lv_resourceName_0_5=(Token)match(input,Webhooks,FOLLOW_35); 

                    						newLeafNode(lv_resourceName_0_5, grammarAccess.getResourceAccess().getResourceNameWebhooksKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:1219:6: lv_resourceName_0_6= Packages
                    {
                    lv_resourceName_0_6=(Token)match(input,Packages,FOLLOW_35); 

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

            // InternalPipelineParser.g:1232:3: ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==EOF||LA29_0==Repositories||LA29_0==Containers||LA29_0==Pipelines||LA29_0==Packages||LA29_0==Webhooks||LA29_0==Builds||LA29_0==HyphenMinus||LA29_0==RULE_END) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_BEGIN) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalPipelineParser.g:1233:4: (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )*
                    {
                    // InternalPipelineParser.g:1233:4: (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==HyphenMinus) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1234:5: otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_30); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_0_0());
                    	    				
                    	    // InternalPipelineParser.g:1238:5: ( (lv_resourceValues_2_0= ruleParameterValue ) )
                    	    // InternalPipelineParser.g:1239:6: (lv_resourceValues_2_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1239:6: (lv_resourceValues_2_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1240:7: lv_resourceValues_2_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1259:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END )
                    {
                    // InternalPipelineParser.g:1259:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END )
                    // InternalPipelineParser.g:1260:5: this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

                    					newLeafNode(this_BEGIN_3, grammarAccess.getResourceAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:1264:5: (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==HyphenMinus) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1265:6: otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_30); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_1_1_0());
                    	    					
                    	    // InternalPipelineParser.g:1269:6: ( (lv_resourceValues_5_0= ruleParameterValue ) )
                    	    // InternalPipelineParser.g:1270:7: (lv_resourceValues_5_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1270:7: (lv_resourceValues_5_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1271:8: lv_resourceValues_5_0= ruleParameterValue
                    	    {

                    	    								newCompositeNode(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_37);
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
                    	    break loop28;
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
    // InternalPipelineParser.g:1299:1: entryRulePipelineParameter returns [EObject current=null] : iv_rulePipelineParameter= rulePipelineParameter EOF ;
    public final EObject entryRulePipelineParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipelineParameter = null;


        try {
            // InternalPipelineParser.g:1299:58: (iv_rulePipelineParameter= rulePipelineParameter EOF )
            // InternalPipelineParser.g:1300:2: iv_rulePipelineParameter= rulePipelineParameter EOF
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
    // InternalPipelineParser.g:1306:1: rulePipelineParameter returns [EObject current=null] : ( (otherlv_0= Name ( (lv_name_1_0= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject rulePipelineParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_displayName_5_0 = null;

        EObject lv_parameterValues_6_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1312:2: ( ( (otherlv_0= Name ( (lv_name_1_0= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            // InternalPipelineParser.g:1313:2: ( (otherlv_0= Name ( (lv_name_1_0= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalPipelineParser.g:1313:2: ( (otherlv_0= Name ( (lv_name_1_0= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalPipelineParser.g:1314:3: (otherlv_0= Name ( (lv_name_1_0= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalPipelineParser.g:1314:3: (otherlv_0= Name ( (lv_name_1_0= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Name) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPipelineParser.g:1315:4: otherlv_0= Name ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,Name,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getPipelineParameterAccess().getNameKeyword_0_0());
                    			
                    // InternalPipelineParser.g:1319:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalPipelineParser.g:1320:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalPipelineParser.g:1320:5: (lv_name_1_0= RULE_ID )
                    // InternalPipelineParser.g:1321:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getPipelineParameterAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPipelineParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"ca.mcgill.devops.pipeline.Pipeline.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPipelineParser.g:1338:3: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalPipelineParser.g:1339:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalPipelineParser.g:1339:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+ {...}?) )
            // InternalPipelineParser.g:1340:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1());
            				
            // InternalPipelineParser.g:1343:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+ {...}?)
            // InternalPipelineParser.g:1344:6: ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalPipelineParser.g:1344:6: ( ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_END) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==RULE_END) ) {
                        int LA33_6 = input.LA(3);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1) ) {
                            alt33=2;
                        }


                    }
                    else if ( ( LA33_2 == EOF || LA33_2 == WorkingDirectory || LA33_2 == Concurrency || LA33_2 >= Parameters && LA33_2 <= Permission || LA33_2 >= Resources && LA33_2 <= Defaults || LA33_2 == RunName || LA33_2 >= WriteAll && LA33_2 <= Default || LA33_2 >= Extends && LA33_2 <= ReadAll || LA33_2 >= Name && LA33_2 <= Read || LA33_2 == HyphenMinus || LA33_2 == RULE_COMPLEX_EXPRESSION || LA33_2 == RULE_BEGIN || LA33_2 == RULE_ID ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1) ) {
                        alt33=2;
                    }


                }
                else if ( (LA33_0==HyphenMinus) ) {
                    int LA33_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1) ) {
                        alt33=2;
                    }


                }
                else if ( LA33_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 0) ) {
                    alt33=1;
                }
                else if ( ( LA33_0 == WriteAll || LA33_0 == ReadAll || LA33_0 == Write || LA33_0 >= None && LA33_0 <= Read || LA33_0 == RULE_COMPLEX_EXPRESSION || LA33_0 == RULE_ID ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPipelineParser.g:1345:4: ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) )
            	    {
            	    // InternalPipelineParser.g:1345:4: ({...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) ) )
            	    // InternalPipelineParser.g:1346:5: {...}? => ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePipelineParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalPipelineParser.g:1346:114: ( ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) ) )
            	    // InternalPipelineParser.g:1347:6: ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalPipelineParser.g:1350:9: ({...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? ) )
            	    // InternalPipelineParser.g:1350:10: {...}? => (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipelineParameter", "true");
            	    }
            	    // InternalPipelineParser.g:1350:19: (this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )? )
            	    // InternalPipelineParser.g:1350:20: this_BEGIN_3= RULE_BEGIN (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )?
            	    {
            	    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

            	    									newLeafNode(this_BEGIN_3, grammarAccess.getPipelineParameterAccess().getBEGINTerminalRuleCall_1_0_0());
            	    								
            	    // InternalPipelineParser.g:1354:9: (otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==DisplayName) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalPipelineParser.g:1355:10: otherlv_4= DisplayName ( (lv_displayName_5_0= ruleUnquotedString ) )
            	            {
            	            otherlv_4=(Token)match(input,DisplayName,FOLLOW_3); 

            	            										newLeafNode(otherlv_4, grammarAccess.getPipelineParameterAccess().getDisplayNameKeyword_1_0_1_0());
            	            									
            	            // InternalPipelineParser.g:1359:10: ( (lv_displayName_5_0= ruleUnquotedString ) )
            	            // InternalPipelineParser.g:1360:11: (lv_displayName_5_0= ruleUnquotedString )
            	            {
            	            // InternalPipelineParser.g:1360:11: (lv_displayName_5_0= ruleUnquotedString )
            	            // InternalPipelineParser.g:1361:12: lv_displayName_5_0= ruleUnquotedString
            	            {

            	            												newCompositeNode(grammarAccess.getPipelineParameterAccess().getDisplayNameUnquotedStringParserRuleCall_1_0_1_1_0());
            	            											
            	            pushFollow(FOLLOW_40);
            	            lv_displayName_5_0=ruleUnquotedString();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getPipelineParameterRule());
            	            												}
            	            												set(
            	            													current,
            	            													"displayName",
            	            													lv_displayName_5_0,
            	            													"ca.mcgill.devops.pipeline.Pipeline.UnquotedString");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:1385:4: ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) )
            	    {
            	    // InternalPipelineParser.g:1385:4: ({...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:1386:5: {...}? => ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePipelineParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalPipelineParser.g:1386:114: ( ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) )
            	    // InternalPipelineParser.g:1387:6: ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalPipelineParser.g:1390:9: ({...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) )
            	    // InternalPipelineParser.g:1390:10: {...}? => ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipelineParameter", "true");
            	    }
            	    // InternalPipelineParser.g:1390:19: ( ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
            	    // InternalPipelineParser.g:1390:20: ( (lv_parameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END
            	    {
            	    // InternalPipelineParser.g:1390:20: ( (lv_parameterValues_6_0= ruleParameterValue ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==WriteAll||LA32_0==ReadAll||LA32_0==Write||(LA32_0>=None && LA32_0<=Read)||LA32_0==HyphenMinus||LA32_0==RULE_COMPLEX_EXPRESSION||LA32_0==RULE_ID) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:1391:10: (lv_parameterValues_6_0= ruleParameterValue )
            	    	    {
            	    	    // InternalPipelineParser.g:1391:10: (lv_parameterValues_6_0= ruleParameterValue )
            	    	    // InternalPipelineParser.g:1392:11: lv_parameterValues_6_0= ruleParameterValue
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPipelineParameterAccess().getParameterValuesParameterValueParserRuleCall_1_1_0_0());
            	    	    										
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_parameterValues_6_0=ruleParameterValue();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPipelineParameterRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"parameterValues",
            	    	    												lv_parameterValues_6_0,
            	    	    												"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);

            	    this_END_7=(Token)match(input,RULE_END,FOLLOW_40); 

            	    									newLeafNode(this_END_7, grammarAccess.getPipelineParameterAccess().getENDTerminalRuleCall_1_1_1());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1());
            	    					

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "rulePipelineParameter", "getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "rulePipelineParameter"


    // $ANTLR start "entryRuleParameterValue"
    // InternalPipelineParser.g:1431:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalPipelineParser.g:1431:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalPipelineParser.g:1432:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalPipelineParser.g:1438:1: ruleParameterValue returns [EObject current=null] : ( (otherlv_0= HyphenMinus )? ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) ) otherlv_3= Colon (this_WS_4= RULE_WS )* ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) ) ) ;
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
            // InternalPipelineParser.g:1444:2: ( ( (otherlv_0= HyphenMinus )? ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) ) otherlv_3= Colon (this_WS_4= RULE_WS )* ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) ) ) )
            // InternalPipelineParser.g:1445:2: ( (otherlv_0= HyphenMinus )? ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) ) otherlv_3= Colon (this_WS_4= RULE_WS )* ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) ) )
            {
            // InternalPipelineParser.g:1445:2: ( (otherlv_0= HyphenMinus )? ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) ) otherlv_3= Colon (this_WS_4= RULE_WS )* ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) ) )
            // InternalPipelineParser.g:1446:3: (otherlv_0= HyphenMinus )? ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) ) otherlv_3= Colon (this_WS_4= RULE_WS )* ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) )
            {
            // InternalPipelineParser.g:1446:3: (otherlv_0= HyphenMinus )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==HyphenMinus) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPipelineParser.g:1447:4: otherlv_0= HyphenMinus
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_41); 

                    				newLeafNode(otherlv_0, grammarAccess.getParameterValueAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalPipelineParser.g:1452:3: ( ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) | ( (lv_preDefinedKeyword_2_0= rulePermission ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_COMPLEX_EXPRESSION||LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==WriteAll||LA36_0==ReadAll||LA36_0==Write||(LA36_0>=None && LA36_0<=Read)) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalPipelineParser.g:1453:4: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) )
                    {
                    // InternalPipelineParser.g:1453:4: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) )
                    // InternalPipelineParser.g:1454:5: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) )
                    {
                    // InternalPipelineParser.g:1454:5: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) )
                    // InternalPipelineParser.g:1455:6: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION )
                    {
                    // InternalPipelineParser.g:1455:6: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==RULE_COMPLEX_EXPRESSION) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalPipelineParser.g:1456:7: lv_name_1_1= RULE_ID
                            {
                            lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_42); 

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
                            // InternalPipelineParser.g:1471:7: lv_name_1_2= RULE_COMPLEX_EXPRESSION
                            {
                            lv_name_1_2=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_42); 

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
                    // InternalPipelineParser.g:1489:4: ( (lv_preDefinedKeyword_2_0= rulePermission ) )
                    {
                    // InternalPipelineParser.g:1489:4: ( (lv_preDefinedKeyword_2_0= rulePermission ) )
                    // InternalPipelineParser.g:1490:5: (lv_preDefinedKeyword_2_0= rulePermission )
                    {
                    // InternalPipelineParser.g:1490:5: (lv_preDefinedKeyword_2_0= rulePermission )
                    // InternalPipelineParser.g:1491:6: lv_preDefinedKeyword_2_0= rulePermission
                    {

                    						newCompositeNode(grammarAccess.getParameterValueAccess().getPreDefinedKeywordPermissionEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            otherlv_3=(Token)match(input,Colon,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterValueAccess().getColonKeyword_2());
            		
            // InternalPipelineParser.g:1513:3: (this_WS_4= RULE_WS )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_WS) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPipelineParser.g:1514:4: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_43); 

            	    				newLeafNode(this_WS_4, grammarAccess.getParameterValueAccess().getWSTerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalPipelineParser.g:1519:3: ( (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) | ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_BEGIN) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==HyphenMinus) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA42_5 = input.LA(4);

                        if ( (LA42_5==HyphenMinus||LA42_5==RULE_END) ) {
                            alt42=2;
                        }
                        else if ( (LA42_5==Colon) ) {
                            alt42=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_COMPLEX_EXPRESSION:
                        {
                        int LA42_6 = input.LA(4);

                        if ( (LA42_6==HyphenMinus||LA42_6==RULE_END) ) {
                            alt42=2;
                        }
                        else if ( (LA42_6==Colon) ) {
                            alt42=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 6, input);

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
                        alt42=1;
                        }
                        break;
                    case RULE_HEX_INT:
                    case RULE_INT:
                    case RULE_FLOAT_LITERAL:
                    case RULE_VERSION:
                    case RULE_STRING:
                        {
                        alt42=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA42_1==WriteAll||LA42_1==ReadAll||LA42_1==Write||(LA42_1>=None && LA42_1<=Read)||LA42_1==RULE_COMPLEX_EXPRESSION||(LA42_1>=RULE_END && LA42_1<=RULE_ID)) ) {
                    alt42=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA42_0==HyphenMinus||LA42_0==LeftSquareBracket||(LA42_0>=RULE_COMPLEX_EXPRESSION && LA42_0<=RULE_VERSION)||LA42_0==RULE_ID||LA42_0==RULE_STRING) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalPipelineParser.g:1520:4: (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    {
                    // InternalPipelineParser.g:1520:4: (this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    // InternalPipelineParser.g:1521:5: this_BEGIN_5= RULE_BEGIN ( (lv_subParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

                    					newLeafNode(this_BEGIN_5, grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_0_0());
                    				
                    // InternalPipelineParser.g:1525:5: ( (lv_subParameterValues_6_0= ruleParameterValue ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==WriteAll||LA38_0==ReadAll||LA38_0==Write||(LA38_0>=None && LA38_0<=Read)||LA38_0==HyphenMinus||LA38_0==RULE_COMPLEX_EXPRESSION||LA38_0==RULE_ID) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1526:6: (lv_subParameterValues_6_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1526:6: (lv_subParameterValues_6_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1527:7: lv_subParameterValues_6_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop38;
                        }
                    } while (true);

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_7, grammarAccess.getParameterValueAccess().getENDTerminalRuleCall_4_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1550:4: ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? )
                    {
                    // InternalPipelineParser.g:1550:4: ( ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )? )
                    // InternalPipelineParser.g:1551:5: ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) ) (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )?
                    {
                    // InternalPipelineParser.g:1551:5: ( ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) ) )
                    // InternalPipelineParser.g:1552:6: ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) )
                    {
                    // InternalPipelineParser.g:1552:6: ( (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues ) )
                    // InternalPipelineParser.g:1553:7: (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues )
                    {
                    // InternalPipelineParser.g:1553:7: (lv_value_8_1= ruleAnyData | lv_value_8_2= ruleArrayList | lv_value_8_3= ruleHyphenValues )
                    int alt39=3;
                    switch ( input.LA(1) ) {
                    case RULE_COMPLEX_EXPRESSION:
                    case RULE_HEX_INT:
                    case RULE_INT:
                    case RULE_FLOAT_LITERAL:
                    case RULE_VERSION:
                    case RULE_ID:
                    case RULE_STRING:
                        {
                        alt39=1;
                        }
                        break;
                    case LeftSquareBracket:
                        {
                        alt39=2;
                        }
                        break;
                    case HyphenMinus:
                    case RULE_BEGIN:
                        {
                        alt39=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }

                    switch (alt39) {
                        case 1 :
                            // InternalPipelineParser.g:1554:8: lv_value_8_1= ruleAnyData
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueAnyDataParserRuleCall_4_1_0_0_0());
                            							
                            pushFollow(FOLLOW_44);
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
                            // InternalPipelineParser.g:1570:8: lv_value_8_2= ruleArrayList
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueArrayListParserRuleCall_4_1_0_0_1());
                            							
                            pushFollow(FOLLOW_44);
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
                            // InternalPipelineParser.g:1586:8: lv_value_8_3= ruleHyphenValues
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueHyphenValuesParserRuleCall_4_1_0_0_2());
                            							
                            pushFollow(FOLLOW_44);
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

                    // InternalPipelineParser.g:1604:5: (this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_BEGIN) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalPipelineParser.g:1605:6: this_BEGIN_9= RULE_BEGIN ( (lv_subParameterValues_10_0= ruleParameterValue ) )* this_END_11= RULE_END
                            {
                            this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

                            						newLeafNode(this_BEGIN_9, grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_1_1_0());
                            					
                            // InternalPipelineParser.g:1609:6: ( (lv_subParameterValues_10_0= ruleParameterValue ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==WriteAll||LA40_0==ReadAll||LA40_0==Write||(LA40_0>=None && LA40_0<=Read)||LA40_0==HyphenMinus||LA40_0==RULE_COMPLEX_EXPRESSION||LA40_0==RULE_ID) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // InternalPipelineParser.g:1610:7: (lv_subParameterValues_10_0= ruleParameterValue )
                            	    {
                            	    // InternalPipelineParser.g:1610:7: (lv_subParameterValues_10_0= ruleParameterValue )
                            	    // InternalPipelineParser.g:1611:8: lv_subParameterValues_10_0= ruleParameterValue
                            	    {

                            	    								newCompositeNode(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_29);
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
                            	    break loop40;
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
    // InternalPipelineParser.g:1639:1: entryRuleAnyData returns [String current=null] : iv_ruleAnyData= ruleAnyData EOF ;
    public final String entryRuleAnyData() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyData = null;


        try {
            // InternalPipelineParser.g:1639:47: (iv_ruleAnyData= ruleAnyData EOF )
            // InternalPipelineParser.g:1640:2: iv_ruleAnyData= ruleAnyData EOF
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
    // InternalPipelineParser.g:1646:1: ruleAnyData returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT ) ;
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
            // InternalPipelineParser.g:1652:2: ( (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT ) )
            // InternalPipelineParser.g:1653:2: (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT )
            {
            // InternalPipelineParser.g:1653:2: (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT )
            int alt43=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt43=1;
                }
                break;
            case RULE_INT:
                {
                alt43=2;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt43=3;
                }
                break;
            case RULE_ID:
                {
                alt43=4;
                }
                break;
            case RULE_COMPLEX_EXPRESSION:
                {
                alt43=5;
                }
                break;
            case RULE_VERSION:
                {
                alt43=6;
                }
                break;
            case RULE_HEX_INT:
                {
                alt43=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalPipelineParser.g:1654:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getAnyDataAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1662:3: this_Number_1= ruleNumber
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
                    // InternalPipelineParser.g:1673:3: this_FloatingPoint_2= ruleFloatingPoint
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
                    // InternalPipelineParser.g:1684:3: this_SimpleWord_3= ruleSimpleWord
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
                    // InternalPipelineParser.g:1695:3: this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION
                    {
                    this_COMPLEX_EXPRESSION_4=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_2); 

                    			current.merge(this_COMPLEX_EXPRESSION_4);
                    		

                    			newLeafNode(this_COMPLEX_EXPRESSION_4, grammarAccess.getAnyDataAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:1703:3: this_VERSION_5= RULE_VERSION
                    {
                    this_VERSION_5=(Token)match(input,RULE_VERSION,FOLLOW_2); 

                    			current.merge(this_VERSION_5);
                    		

                    			newLeafNode(this_VERSION_5, grammarAccess.getAnyDataAccess().getVERSIONTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:1711:3: this_HEX_INT_6= RULE_HEX_INT
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
    // InternalPipelineParser.g:1722:1: entryRuleKeyValue returns [String current=null] : iv_ruleKeyValue= ruleKeyValue EOF ;
    public final String entryRuleKeyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyValue = null;


        try {
            // InternalPipelineParser.g:1722:48: (iv_ruleKeyValue= ruleKeyValue EOF )
            // InternalPipelineParser.g:1723:2: iv_ruleKeyValue= ruleKeyValue EOF
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
    // InternalPipelineParser.g:1729:1: ruleKeyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData ) ;
    public final AntlrDatatypeRuleToken ruleKeyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_AnyData_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1735:2: ( (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData ) )
            // InternalPipelineParser.g:1736:2: (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData )
            {
            // InternalPipelineParser.g:1736:2: (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData )
            // InternalPipelineParser.g:1737:3: this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getKeyValueAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_31); 

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
    // InternalPipelineParser.g:1763:1: entryRuleIndPermissionValue returns [String current=null] : iv_ruleIndPermissionValue= ruleIndPermissionValue EOF ;
    public final String entryRuleIndPermissionValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndPermissionValue = null;


        try {
            // InternalPipelineParser.g:1763:58: (iv_ruleIndPermissionValue= ruleIndPermissionValue EOF )
            // InternalPipelineParser.g:1764:2: iv_ruleIndPermissionValue= ruleIndPermissionValue EOF
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
    // InternalPipelineParser.g:1770:1: ruleIndPermissionValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) ) ;
    public final AntlrDatatypeRuleToken ruleIndPermissionValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:1776:2: ( (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) ) )
            // InternalPipelineParser.g:1777:2: (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) )
            {
            // InternalPipelineParser.g:1777:2: (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) )
            // InternalPipelineParser.g:1778:3: this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getIndPermissionValueAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_45); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getColonKeyword_1());
            		
            // InternalPipelineParser.g:1790:3: (kw= Read | kw= Write | kw= None )
            int alt44=3;
            switch ( input.LA(1) ) {
            case Read:
                {
                alt44=1;
                }
                break;
            case Write:
                {
                alt44=2;
                }
                break;
            case None:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalPipelineParser.g:1791:4: kw= Read
                    {
                    kw=(Token)match(input,Read,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getReadKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1797:4: kw= Write
                    {
                    kw=(Token)match(input,Write,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getWriteKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:1803:4: kw= None
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
    // InternalPipelineParser.g:1813:1: entryRuleUnquotedString returns [String current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final String entryRuleUnquotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnquotedString = null;


        try {
            // InternalPipelineParser.g:1813:54: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // InternalPipelineParser.g:1814:2: iv_ruleUnquotedString= ruleUnquotedString EOF
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
    // InternalPipelineParser.g:1820:1: ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* ) ;
    public final AntlrDatatypeRuleToken ruleUnquotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_COMPLEX_EXPRESSION_3=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:1826:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* ) )
            // InternalPipelineParser.g:1827:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* )
            {
            // InternalPipelineParser.g:1827:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* )
            // InternalPipelineParser.g:1828:3: this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_0());
            		
            // InternalPipelineParser.g:1835:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )*
            loop45:
            do {
                int alt45=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA45_2 = input.LA(2);

                    if ( (LA45_2==EOF||LA45_2==WorkingDirectory||LA45_2==Concurrency||(LA45_2>=Parameters && LA45_2<=Permission)||(LA45_2>=Resources && LA45_2<=Defaults)||LA45_2==RunName||(LA45_2>=WriteAll && LA45_2<=Default)||(LA45_2>=Extends && LA45_2<=ReadAll)||(LA45_2>=Name && LA45_2<=Read)||LA45_2==HyphenMinus||LA45_2==RULE_COMPLEX_EXPRESSION||LA45_2==RULE_INT||(LA45_2>=RULE_BEGIN && LA45_2<=RULE_ID)) ) {
                        alt45=1;
                    }


                    }
                    break;
                case RULE_COMPLEX_EXPRESSION:
                    {
                    int LA45_3 = input.LA(2);

                    if ( (LA45_3==EOF||LA45_3==WorkingDirectory||LA45_3==Concurrency||(LA45_3>=Parameters && LA45_3<=Permission)||(LA45_3>=Resources && LA45_3<=Defaults)||LA45_3==RunName||(LA45_3>=WriteAll && LA45_3<=Default)||(LA45_3>=Extends && LA45_3<=ReadAll)||(LA45_3>=Name && LA45_3<=Read)||LA45_3==HyphenMinus||LA45_3==RULE_COMPLEX_EXPRESSION||LA45_3==RULE_INT||(LA45_3>=RULE_BEGIN && LA45_3<=RULE_ID)) ) {
                        alt45=3;
                    }


                    }
                    break;
                case RULE_INT:
                    {
                    alt45=2;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // InternalPipelineParser.g:1836:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_46); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:1844:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_46); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalPipelineParser.g:1852:4: this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION
            	    {
            	    this_COMPLEX_EXPRESSION_3=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_46); 

            	    				current.merge(this_COMPLEX_EXPRESSION_3);
            	    			

            	    				newLeafNode(this_COMPLEX_EXPRESSION_3, grammarAccess.getUnquotedStringAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalPipelineParser.g:1864:1: entryRuleHyphenValues returns [String current=null] : iv_ruleHyphenValues= ruleHyphenValues EOF ;
    public final String entryRuleHyphenValues() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHyphenValues = null;


        try {
            // InternalPipelineParser.g:1864:52: (iv_ruleHyphenValues= ruleHyphenValues EOF )
            // InternalPipelineParser.g:1865:2: iv_ruleHyphenValues= ruleHyphenValues EOF
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
    // InternalPipelineParser.g:1871:1: ruleHyphenValues returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) ) ;
    public final AntlrDatatypeRuleToken ruleHyphenValues() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BEGIN_2=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken this_AnyData_1 = null;

        AntlrDatatypeRuleToken this_AnyData_4 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1877:2: ( ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) ) )
            // InternalPipelineParser.g:1878:2: ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) )
            {
            // InternalPipelineParser.g:1878:2: ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==HyphenMinus) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_BEGIN) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalPipelineParser.g:1879:3: (kw= HyphenMinus this_AnyData_1= ruleAnyData )+
                    {
                    // InternalPipelineParser.g:1879:3: (kw= HyphenMinus this_AnyData_1= ruleAnyData )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==HyphenMinus) ) {
                            switch ( input.LA(2) ) {
                            case RULE_ID:
                                {
                                int LA46_3 = input.LA(3);

                                if ( (LA46_3==EOF||LA46_3==Repositories||LA46_3==Containers||LA46_3==Pipelines||LA46_3==Packages||(LA46_3>=Webhooks && LA46_3<=WriteAll)||LA46_3==ReadAll||LA46_3==Builds||LA46_3==Write||(LA46_3>=None && LA46_3<=Read)||LA46_3==HyphenMinus||LA46_3==RULE_COMPLEX_EXPRESSION||(LA46_3>=RULE_BEGIN && LA46_3<=RULE_ID)) ) {
                                    alt46=1;
                                }


                                }
                                break;
                            case RULE_COMPLEX_EXPRESSION:
                                {
                                int LA46_4 = input.LA(3);

                                if ( (LA46_4==EOF||LA46_4==Repositories||LA46_4==Containers||LA46_4==Pipelines||LA46_4==Packages||(LA46_4>=Webhooks && LA46_4<=WriteAll)||LA46_4==ReadAll||LA46_4==Builds||LA46_4==Write||(LA46_4>=None && LA46_4<=Read)||LA46_4==HyphenMinus||LA46_4==RULE_COMPLEX_EXPRESSION||(LA46_4>=RULE_BEGIN && LA46_4<=RULE_ID)) ) {
                                    alt46=1;
                                }


                                }
                                break;
                            case RULE_HEX_INT:
                            case RULE_INT:
                            case RULE_FLOAT_LITERAL:
                            case RULE_VERSION:
                            case RULE_STRING:
                                {
                                alt46=1;
                                }
                                break;

                            }

                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1880:4: kw= HyphenMinus this_AnyData_1= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,HyphenMinus,FOLLOW_31); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_0_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_0_1());
                    	    			
                    	    pushFollow(FOLLOW_36);
                    	    this_AnyData_1=ruleAnyData();

                    	    state._fsp--;


                    	    				current.merge(this_AnyData_1);
                    	    			

                    	    				afterParserOrEnumRuleCall();
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1897:3: (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END )
                    {
                    // InternalPipelineParser.g:1897:3: (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END )
                    // InternalPipelineParser.g:1898:4: this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

                    				current.merge(this_BEGIN_2);
                    			

                    				newLeafNode(this_BEGIN_2, grammarAccess.getHyphenValuesAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:1905:4: (kw= HyphenMinus this_AnyData_4= ruleAnyData )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==HyphenMinus) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1906:5: kw= HyphenMinus this_AnyData_4= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,HyphenMinus,FOLLOW_31); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_1_1_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_1_1_1());
                    	    				
                    	    pushFollow(FOLLOW_37);
                    	    this_AnyData_4=ruleAnyData();

                    	    state._fsp--;


                    	    					current.merge(this_AnyData_4);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
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
    // InternalPipelineParser.g:1934:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalPipelineParser.g:1934:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalPipelineParser.g:1935:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalPipelineParser.g:1941:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:1947:2: (this_INT_0= RULE_INT )
            // InternalPipelineParser.g:1948:2: this_INT_0= RULE_INT
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
    // InternalPipelineParser.g:1958:1: entryRuleFloatingPoint returns [String current=null] : iv_ruleFloatingPoint= ruleFloatingPoint EOF ;
    public final String entryRuleFloatingPoint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPoint = null;


        try {
            // InternalPipelineParser.g:1958:53: (iv_ruleFloatingPoint= ruleFloatingPoint EOF )
            // InternalPipelineParser.g:1959:2: iv_ruleFloatingPoint= ruleFloatingPoint EOF
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
    // InternalPipelineParser.g:1965:1: ruleFloatingPoint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL ;
    public final AntlrDatatypeRuleToken ruleFloatingPoint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_LITERAL_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:1971:2: (this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL )
            // InternalPipelineParser.g:1972:2: this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL
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
    // InternalPipelineParser.g:1982:1: entryRuleSimpleWord returns [String current=null] : iv_ruleSimpleWord= ruleSimpleWord EOF ;
    public final String entryRuleSimpleWord() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleWord = null;


        try {
            // InternalPipelineParser.g:1982:50: (iv_ruleSimpleWord= ruleSimpleWord EOF )
            // InternalPipelineParser.g:1983:2: iv_ruleSimpleWord= ruleSimpleWord EOF
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
    // InternalPipelineParser.g:1989:1: ruleSimpleWord returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSimpleWord() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:1995:2: (this_ID_0= RULE_ID )
            // InternalPipelineParser.g:1996:2: this_ID_0= RULE_ID
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
    // InternalPipelineParser.g:2006:1: entryRuleArrayList returns [String current=null] : iv_ruleArrayList= ruleArrayList EOF ;
    public final String entryRuleArrayList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayList = null;


        try {
            // InternalPipelineParser.g:2006:49: (iv_ruleArrayList= ruleArrayList EOF )
            // InternalPipelineParser.g:2007:2: iv_ruleArrayList= ruleArrayList EOF
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
    // InternalPipelineParser.g:2013:1: ruleArrayList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleArrayList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AnyData_1 = null;

        AntlrDatatypeRuleToken this_AnyData_3 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:2019:2: ( (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket ) )
            // InternalPipelineParser.g:2020:2: (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket )
            {
            // InternalPipelineParser.g:2020:2: (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket )
            // InternalPipelineParser.g:2021:3: kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_47); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArrayListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPipelineParser.g:2026:3: (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_COMPLEX_EXPRESSION && LA50_0<=RULE_VERSION)||LA50_0==RULE_ID||LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPipelineParser.g:2027:4: this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )*
                    {

                    				newCompositeNode(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_48);
                    this_AnyData_1=ruleAnyData();

                    state._fsp--;


                    				current.merge(this_AnyData_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPipelineParser.g:2037:4: (kw= Comma this_AnyData_3= ruleAnyData )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==Comma) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2038:5: kw= Comma this_AnyData_3= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,Comma,FOLLOW_31); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getArrayListAccess().getCommaKeyword_1_1_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_1_1());
                    	    				
                    	    pushFollow(FOLLOW_48);
                    	    this_AnyData_3=ruleAnyData();

                    	    state._fsp--;


                    	    					current.merge(this_AnyData_3);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
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
    // InternalPipelineParser.g:2064:1: rulePermission returns [Enumerator current=null] : ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) | (enumLiteral_2= Read ) | (enumLiteral_3= Write ) | (enumLiteral_4= None ) ) ;
    public final Enumerator rulePermission() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:2070:2: ( ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) | (enumLiteral_2= Read ) | (enumLiteral_3= Write ) | (enumLiteral_4= None ) ) )
            // InternalPipelineParser.g:2071:2: ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) | (enumLiteral_2= Read ) | (enumLiteral_3= Write ) | (enumLiteral_4= None ) )
            {
            // InternalPipelineParser.g:2071:2: ( (enumLiteral_0= ReadAll ) | (enumLiteral_1= WriteAll ) | (enumLiteral_2= Read ) | (enumLiteral_3= Write ) | (enumLiteral_4= None ) )
            int alt51=5;
            switch ( input.LA(1) ) {
            case ReadAll:
                {
                alt51=1;
                }
                break;
            case WriteAll:
                {
                alt51=2;
                }
                break;
            case Read:
                {
                alt51=3;
                }
                break;
            case Write:
                {
                alt51=4;
                }
                break;
            case None:
                {
                alt51=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalPipelineParser.g:2072:3: (enumLiteral_0= ReadAll )
                    {
                    // InternalPipelineParser.g:2072:3: (enumLiteral_0= ReadAll )
                    // InternalPipelineParser.g:2073:4: enumLiteral_0= ReadAll
                    {
                    enumLiteral_0=(Token)match(input,ReadAll,FOLLOW_2); 

                    				current = grammarAccess.getPermissionAccess().getREAD_ALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPermissionAccess().getREAD_ALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2080:3: (enumLiteral_1= WriteAll )
                    {
                    // InternalPipelineParser.g:2080:3: (enumLiteral_1= WriteAll )
                    // InternalPipelineParser.g:2081:4: enumLiteral_1= WriteAll
                    {
                    enumLiteral_1=(Token)match(input,WriteAll,FOLLOW_2); 

                    				current = grammarAccess.getPermissionAccess().getWRITE_ALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPermissionAccess().getWRITE_ALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:2088:3: (enumLiteral_2= Read )
                    {
                    // InternalPipelineParser.g:2088:3: (enumLiteral_2= Read )
                    // InternalPipelineParser.g:2089:4: enumLiteral_2= Read
                    {
                    enumLiteral_2=(Token)match(input,Read,FOLLOW_2); 

                    				current = grammarAccess.getPermissionAccess().getREADEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPermissionAccess().getREADEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:2096:3: (enumLiteral_3= Write )
                    {
                    // InternalPipelineParser.g:2096:3: (enumLiteral_3= Write )
                    // InternalPipelineParser.g:2097:4: enumLiteral_3= Write
                    {
                    enumLiteral_3=(Token)match(input,Write,FOLLOW_2); 

                    				current = grammarAccess.getPermissionAccess().getWRITEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPermissionAccess().getWRITEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:2104:3: (enumLiteral_4= None )
                    {
                    // InternalPipelineParser.g:2104:3: (enumLiteral_4= None )
                    // InternalPipelineParser.g:2105:4: enumLiteral_4= None
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


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\5\15\uffff";
    static final String dfa_4s = "\1\62\15\uffff";
    static final String dfa_5s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_6s = "\1\0\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\1\uffff\1\7\2\uffff\1\10\1\6\1\uffff\1\12\1\14\1\4\2\uffff\1\3\3\uffff\1\13\1\uffff\2\15\6\uffff\1\2\1\11\1\uffff\1\5\16\uffff\1\4",
            "",
            "",
            "",
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

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= rulePermission ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Parameters (otherlv_34= HyphenMinus ( (lv_pipelineParameters_35_0= rulePipelineParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_38= RULE_BEGIN (otherlv_39= Name ( (lv_vmName_40_0= RULE_ID ) ) ) (otherlv_41= VmImage ( ( (lv_vmImage_42_1= RULE_ID | lv_vmImage_42_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_43= Demands ( ( (lv_vmDemands_44_1= ruleAnyData | lv_vmDemands_44_2= ruleHyphenValues ) ) ) )? this_END_45= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= Resources (this_BEGIN_47= RULE_BEGIN ( (lv_resources_48_0= ruleResource ) )* this_END_49= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Default ( (lv_pipelineParameters_51_0= rulePipelineParameter ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= Variables ( (lv_variables_53_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_54_0= ruleExtendedParameter ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_0==EOF) ) {s = 1;}

                        else if ( LA18_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA18_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( ( LA18_0 == WorkingDirectory || LA18_0 == Defaults || LA18_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA18_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA18_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA18_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA18_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA18_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA18_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA18_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA18_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 12;}

                        else if ( LA18_0 >= Extends && LA18_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 13;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0004000B0344ECA2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0004000B4344ECA2L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000C010000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0008010000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0002003404200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004010B0344ECA2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000E113504200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0006000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0006000B0BC4ECA2L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0006000B03C4ECA2L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x004BF10000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000010111240L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0006010B0344ECA2L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000C113404200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008113404200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0049F00000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002010000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000E113404200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000E113404200102L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000E113404200002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008103404200000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00CBF50000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000003400000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008500000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0049F80000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000088000000000L});

}
