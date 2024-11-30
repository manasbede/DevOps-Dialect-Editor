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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ContinueOnError", "SettableVariables", "WorkingDirectory", "BranchesIgnore", "TimeoutMinutes", "DownloadBuild", "MaxParallel", "PathsIgnore", "Pull_request", "Repositories", "Workflow_run", "Concurrency", "Credentials", "Environment", "Permissions", "TagsIgnore", "Containers", "Deployment", "Entrypoint", "Parameters", "Container", "FailFast", "Pipelines", "Resources", "ReviewApp", "Schedules", "Variables", "Branches", "Defaults", "Packages", "Pipeline", "Required", "RunName", "Schedule", "Strategy", "Template", "Webhooks", "WriteAll", "Exclude", "Extends", "Filters", "Include", "Inherit", "Outputs", "ReadAll", "Rolling", "RunOnce", "RunsOn", "Secrets", "Trigger", "Builds", "Canary", "Inputs", "Matrix", "Script", "Target", "Build", "Group", "Image", "Needs", "Paths", "Ports", "Shell", "Types", "Args", "Cron", "Name", "Path", "Push", "Tags", "Type", "Uses", "Env", "Id", "If", "On", "Pr", "ExclamationMark", "Asterisk", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "KW__", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_COMPLEX_EXPRESSION", "RULE_HEX_INT", "RULE_INT", "RULE_FLOAT_LITERAL", "RULE_VERSION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "RULE_UNCLOSED_STRING", "RULE_BEGIN", "RULE_END"
    };
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
    // InternalPipelineParser.g:65:1: rulePipeline returns [EObject current=null] : ( (otherlv_0= Name ( (lv_name_1_0= ruleUnquotedString ) ) ) | ( (lv_pipelineConfiguration_2_0= ruleConfiguration ) )* ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_pipelineConfiguration_2_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:71:2: ( ( (otherlv_0= Name ( (lv_name_1_0= ruleUnquotedString ) ) ) | ( (lv_pipelineConfiguration_2_0= ruleConfiguration ) )* ) )
            // InternalPipelineParser.g:72:2: ( (otherlv_0= Name ( (lv_name_1_0= ruleUnquotedString ) ) ) | ( (lv_pipelineConfiguration_2_0= ruleConfiguration ) )* )
            {
            // InternalPipelineParser.g:72:2: ( (otherlv_0= Name ( (lv_name_1_0= ruleUnquotedString ) ) ) | ( (lv_pipelineConfiguration_2_0= ruleConfiguration ) )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Name) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==Parameters) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPipelineParser.g:73:3: (otherlv_0= Name ( (lv_name_1_0= ruleUnquotedString ) ) )
                    {
                    // InternalPipelineParser.g:73:3: (otherlv_0= Name ( (lv_name_1_0= ruleUnquotedString ) ) )
                    // InternalPipelineParser.g:74:4: otherlv_0= Name ( (lv_name_1_0= ruleUnquotedString ) )
                    {
                    otherlv_0=(Token)match(input,Name,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getNameKeyword_0_0());
                    			
                    // InternalPipelineParser.g:78:4: ( (lv_name_1_0= ruleUnquotedString ) )
                    // InternalPipelineParser.g:79:5: (lv_name_1_0= ruleUnquotedString )
                    {
                    // InternalPipelineParser.g:79:5: (lv_name_1_0= ruleUnquotedString )
                    // InternalPipelineParser.g:80:6: lv_name_1_0= ruleUnquotedString
                    {

                    						newCompositeNode(grammarAccess.getPipelineAccess().getNameUnquotedStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_1_0=ruleUnquotedString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"ca.mcgill.devops.pipeline.Pipeline.UnquotedString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:99:3: ( (lv_pipelineConfiguration_2_0= ruleConfiguration ) )*
                    {
                    // InternalPipelineParser.g:99:3: ( (lv_pipelineConfiguration_2_0= ruleConfiguration ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Parameters) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalPipelineParser.g:100:4: (lv_pipelineConfiguration_2_0= ruleConfiguration )
                    	    {
                    	    // InternalPipelineParser.g:100:4: (lv_pipelineConfiguration_2_0= ruleConfiguration )
                    	    // InternalPipelineParser.g:101:5: lv_pipelineConfiguration_2_0= ruleConfiguration
                    	    {

                    	    					newCompositeNode(grammarAccess.getPipelineAccess().getPipelineConfigurationConfigurationParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_4);
                    	    lv_pipelineConfiguration_2_0=ruleConfiguration();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"pipelineConfiguration",
                    	    						lv_pipelineConfiguration_2_0,
                    	    						"ca.mcgill.devops.pipeline.Pipeline.Configuration");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


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
    // $ANTLR end "rulePipeline"


    // $ANTLR start "entryRuleConfiguration"
    // InternalPipelineParser.g:122:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalPipelineParser.g:122:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalPipelineParser.g:123:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // InternalPipelineParser.g:129:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_parameters_1_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:135:2: ( (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* ) )
            // InternalPipelineParser.g:136:2: (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* )
            {
            // InternalPipelineParser.g:136:2: (otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )* )
            // InternalPipelineParser.g:137:3: otherlv_0= Parameters ( (lv_parameters_1_0= ruleParameter ) )*
            {
            otherlv_0=(Token)match(input,Parameters,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getParametersKeyword_0());
            		
            // InternalPipelineParser.g:141:3: ( (lv_parameters_1_0= ruleParameter ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPipelineParser.g:142:4: (lv_parameters_1_0= ruleParameter )
            	    {
            	    // InternalPipelineParser.g:142:4: (lv_parameters_1_0= ruleParameter )
            	    // InternalPipelineParser.g:143:5: lv_parameters_1_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getParametersParameterParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
            	    break loop3;
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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleParameter"
    // InternalPipelineParser.g:164:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalPipelineParser.g:164:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalPipelineParser.g:165:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalPipelineParser.g:171:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (this_BEGIN_2= RULE_BEGIN ( (lv_parameters_3_0= ruleParameter ) )* this_END_4= RULE_END ) | ( ( (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList ) ) ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_parameters_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_1 = null;

        AntlrDatatypeRuleToken lv_value_5_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:177:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (this_BEGIN_2= RULE_BEGIN ( (lv_parameters_3_0= ruleParameter ) )* this_END_4= RULE_END ) | ( ( (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList ) ) ) ) ) )
            // InternalPipelineParser.g:178:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (this_BEGIN_2= RULE_BEGIN ( (lv_parameters_3_0= ruleParameter ) )* this_END_4= RULE_END ) | ( ( (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList ) ) ) ) )
            {
            // InternalPipelineParser.g:178:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (this_BEGIN_2= RULE_BEGIN ( (lv_parameters_3_0= ruleParameter ) )* this_END_4= RULE_END ) | ( ( (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList ) ) ) ) )
            // InternalPipelineParser.g:179:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (this_BEGIN_2= RULE_BEGIN ( (lv_parameters_3_0= ruleParameter ) )* this_END_4= RULE_END ) | ( ( (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList ) ) ) )
            {
            // InternalPipelineParser.g:179:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPipelineParser.g:180:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPipelineParser.g:180:4: (lv_name_0_0= RULE_ID )
            // InternalPipelineParser.g:181:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"ca.mcgill.devops.pipeline.Pipeline.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalPipelineParser.g:201:3: ( (this_BEGIN_2= RULE_BEGIN ( (lv_parameters_3_0= ruleParameter ) )* this_END_4= RULE_END ) | ( ( (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_BEGIN) ) {
                alt6=1;
            }
            else if ( (LA6_0==LeftSquareBracket||(LA6_0>=RULE_ID && LA6_0<=RULE_STRING)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPipelineParser.g:202:4: (this_BEGIN_2= RULE_BEGIN ( (lv_parameters_3_0= ruleParameter ) )* this_END_4= RULE_END )
                    {
                    // InternalPipelineParser.g:202:4: (this_BEGIN_2= RULE_BEGIN ( (lv_parameters_3_0= ruleParameter ) )* this_END_4= RULE_END )
                    // InternalPipelineParser.g:203:5: this_BEGIN_2= RULE_BEGIN ( (lv_parameters_3_0= ruleParameter ) )* this_END_4= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

                    					newLeafNode(this_BEGIN_2, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_2_0_0());
                    				
                    // InternalPipelineParser.g:207:5: ( (lv_parameters_3_0= ruleParameter ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPipelineParser.g:208:6: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalPipelineParser.g:208:6: (lv_parameters_3_0= ruleParameter )
                    	    // InternalPipelineParser.g:209:7: lv_parameters_3_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getParametersParameterParserRuleCall_2_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_3_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_3_0,
                    	    								"ca.mcgill.devops.pipeline.Pipeline.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_4, grammarAccess.getParameterAccess().getENDTerminalRuleCall_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:232:4: ( ( (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList ) ) )
                    {
                    // InternalPipelineParser.g:232:4: ( ( (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList ) ) )
                    // InternalPipelineParser.g:233:5: ( (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList ) )
                    {
                    // InternalPipelineParser.g:233:5: ( (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList ) )
                    // InternalPipelineParser.g:234:6: (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList )
                    {
                    // InternalPipelineParser.g:234:6: (lv_value_5_1= ruleAnyData | lv_value_5_2= ruleArrayList )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==LeftSquareBracket) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalPipelineParser.g:235:7: lv_value_5_1= ruleAnyData
                            {

                            							newCompositeNode(grammarAccess.getParameterAccess().getValueAnyDataParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_5_1=ruleAnyData();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getParameterRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_5_1,
                            								"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:251:7: lv_value_5_2= ruleArrayList
                            {

                            							newCompositeNode(grammarAccess.getParameterAccess().getValueArrayListParserRuleCall_2_1_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_5_2=ruleArrayList();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getParameterRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_5_2,
                            								"ca.mcgill.devops.pipeline.Pipeline.ArrayList");
                            							afterParserOrEnumRuleCall();
                            						

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


    // $ANTLR start "entryRuleAnyData"
    // InternalPipelineParser.g:274:1: entryRuleAnyData returns [String current=null] : iv_ruleAnyData= ruleAnyData EOF ;
    public final String entryRuleAnyData() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyData = null;


        try {
            // InternalPipelineParser.g:274:47: (iv_ruleAnyData= ruleAnyData EOF )
            // InternalPipelineParser.g:275:2: iv_ruleAnyData= ruleAnyData EOF
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
    // InternalPipelineParser.g:281:1: ruleAnyData returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_HEX_INT_5= RULE_HEX_INT | this_VERSION_6= RULE_VERSION ) ;
    public final AntlrDatatypeRuleToken ruleAnyData() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_COMPLEX_EXPRESSION_4=null;
        Token this_HEX_INT_5=null;
        Token this_VERSION_6=null;
        AntlrDatatypeRuleToken this_Number_1 = null;

        AntlrDatatypeRuleToken this_FloatingPoint_2 = null;

        AntlrDatatypeRuleToken this_SimpleWord_3 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:287:2: ( (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_HEX_INT_5= RULE_HEX_INT | this_VERSION_6= RULE_VERSION ) )
            // InternalPipelineParser.g:288:2: (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_HEX_INT_5= RULE_HEX_INT | this_VERSION_6= RULE_VERSION )
            {
            // InternalPipelineParser.g:288:2: (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_HEX_INT_5= RULE_HEX_INT | this_VERSION_6= RULE_VERSION )
            int alt7=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            case RULE_COMPLEX_EXPRESSION:
                {
                alt7=5;
                }
                break;
            case RULE_HEX_INT:
                {
                alt7=6;
                }
                break;
            case RULE_VERSION:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPipelineParser.g:289:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getAnyDataAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:297:3: this_Number_1= ruleNumber
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
                    // InternalPipelineParser.g:308:3: this_FloatingPoint_2= ruleFloatingPoint
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
                    // InternalPipelineParser.g:319:3: this_SimpleWord_3= ruleSimpleWord
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
                    // InternalPipelineParser.g:330:3: this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION
                    {
                    this_COMPLEX_EXPRESSION_4=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_2); 

                    			current.merge(this_COMPLEX_EXPRESSION_4);
                    		

                    			newLeafNode(this_COMPLEX_EXPRESSION_4, grammarAccess.getAnyDataAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:338:3: this_HEX_INT_5= RULE_HEX_INT
                    {
                    this_HEX_INT_5=(Token)match(input,RULE_HEX_INT,FOLLOW_2); 

                    			current.merge(this_HEX_INT_5);
                    		

                    			newLeafNode(this_HEX_INT_5, grammarAccess.getAnyDataAccess().getHEX_INTTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:346:3: this_VERSION_6= RULE_VERSION
                    {
                    this_VERSION_6=(Token)match(input,RULE_VERSION,FOLLOW_2); 

                    			current.merge(this_VERSION_6);
                    		

                    			newLeafNode(this_VERSION_6, grammarAccess.getAnyDataAccess().getVERSIONTerminalRuleCall_6());
                    		

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


    // $ANTLR start "entryRuleUnquotedString"
    // InternalPipelineParser.g:357:1: entryRuleUnquotedString returns [String current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final String entryRuleUnquotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnquotedString = null;


        try {
            // InternalPipelineParser.g:357:54: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // InternalPipelineParser.g:358:2: iv_ruleUnquotedString= ruleUnquotedString EOF
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
    // InternalPipelineParser.g:364:1: ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (this_WS_1= RULE_WS this_ID_2= RULE_ID ) | this_INT_3= RULE_INT | this_VERSION_4= RULE_VERSION )* ) ;
    public final AntlrDatatypeRuleToken ruleUnquotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_ID_2=null;
        Token this_INT_3=null;
        Token this_VERSION_4=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:370:2: ( (this_ID_0= RULE_ID ( (this_WS_1= RULE_WS this_ID_2= RULE_ID ) | this_INT_3= RULE_INT | this_VERSION_4= RULE_VERSION )* ) )
            // InternalPipelineParser.g:371:2: (this_ID_0= RULE_ID ( (this_WS_1= RULE_WS this_ID_2= RULE_ID ) | this_INT_3= RULE_INT | this_VERSION_4= RULE_VERSION )* )
            {
            // InternalPipelineParser.g:371:2: (this_ID_0= RULE_ID ( (this_WS_1= RULE_WS this_ID_2= RULE_ID ) | this_INT_3= RULE_INT | this_VERSION_4= RULE_VERSION )* )
            // InternalPipelineParser.g:372:3: this_ID_0= RULE_ID ( (this_WS_1= RULE_WS this_ID_2= RULE_ID ) | this_INT_3= RULE_INT | this_VERSION_4= RULE_VERSION )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_0());
            		
            // InternalPipelineParser.g:379:3: ( (this_WS_1= RULE_WS this_ID_2= RULE_ID ) | this_INT_3= RULE_INT | this_VERSION_4= RULE_VERSION )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case RULE_WS:
                    {
                    alt8=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt8=2;
                    }
                    break;
                case RULE_VERSION:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalPipelineParser.g:380:4: (this_WS_1= RULE_WS this_ID_2= RULE_ID )
            	    {
            	    // InternalPipelineParser.g:380:4: (this_WS_1= RULE_WS this_ID_2= RULE_ID )
            	    // InternalPipelineParser.g:381:5: this_WS_1= RULE_WS this_ID_2= RULE_ID
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_3); 

            	    					current.merge(this_WS_1);
            	    				

            	    					newLeafNode(this_WS_1, grammarAccess.getUnquotedStringAccess().getWSTerminalRuleCall_1_0_0());
            	    				
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					current.merge(this_ID_2);
            	    				

            	    					newLeafNode(this_ID_2, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0_1());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:397:4: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_9); 

            	    				current.merge(this_INT_3);
            	    			

            	    				newLeafNode(this_INT_3, grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalPipelineParser.g:405:4: this_VERSION_4= RULE_VERSION
            	    {
            	    this_VERSION_4=(Token)match(input,RULE_VERSION,FOLLOW_9); 

            	    				current.merge(this_VERSION_4);
            	    			

            	    				newLeafNode(this_VERSION_4, grammarAccess.getUnquotedStringAccess().getVERSIONTerminalRuleCall_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "entryRuleNumber"
    // InternalPipelineParser.g:417:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalPipelineParser.g:417:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalPipelineParser.g:418:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalPipelineParser.g:424:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:430:2: (this_INT_0= RULE_INT )
            // InternalPipelineParser.g:431:2: this_INT_0= RULE_INT
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
    // InternalPipelineParser.g:441:1: entryRuleFloatingPoint returns [String current=null] : iv_ruleFloatingPoint= ruleFloatingPoint EOF ;
    public final String entryRuleFloatingPoint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPoint = null;


        try {
            // InternalPipelineParser.g:441:53: (iv_ruleFloatingPoint= ruleFloatingPoint EOF )
            // InternalPipelineParser.g:442:2: iv_ruleFloatingPoint= ruleFloatingPoint EOF
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
    // InternalPipelineParser.g:448:1: ruleFloatingPoint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL ;
    public final AntlrDatatypeRuleToken ruleFloatingPoint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_LITERAL_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:454:2: (this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL )
            // InternalPipelineParser.g:455:2: this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL
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
    // InternalPipelineParser.g:465:1: entryRuleSimpleWord returns [String current=null] : iv_ruleSimpleWord= ruleSimpleWord EOF ;
    public final String entryRuleSimpleWord() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleWord = null;


        try {
            // InternalPipelineParser.g:465:50: (iv_ruleSimpleWord= ruleSimpleWord EOF )
            // InternalPipelineParser.g:466:2: iv_ruleSimpleWord= ruleSimpleWord EOF
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
    // InternalPipelineParser.g:472:1: ruleSimpleWord returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSimpleWord() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:478:2: (this_ID_0= RULE_ID )
            // InternalPipelineParser.g:479:2: this_ID_0= RULE_ID
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
    // InternalPipelineParser.g:489:1: entryRuleArrayList returns [String current=null] : iv_ruleArrayList= ruleArrayList EOF ;
    public final String entryRuleArrayList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayList = null;


        try {
            // InternalPipelineParser.g:489:49: (iv_ruleArrayList= ruleArrayList EOF )
            // InternalPipelineParser.g:490:2: iv_ruleArrayList= ruleArrayList EOF
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
    // InternalPipelineParser.g:496:1: ruleArrayList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleArrayList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AnyData_1 = null;

        AntlrDatatypeRuleToken this_AnyData_3 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:502:2: ( (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket ) )
            // InternalPipelineParser.g:503:2: (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket )
            {
            // InternalPipelineParser.g:503:2: (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket )
            // InternalPipelineParser.g:504:3: kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArrayListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPipelineParser.g:509:3: (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPipelineParser.g:510:4: this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )*
                    {

                    				newCompositeNode(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_AnyData_1=ruleAnyData();

                    state._fsp--;


                    				current.merge(this_AnyData_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPipelineParser.g:520:4: (kw= Comma this_AnyData_3= ruleAnyData )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Comma) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPipelineParser.g:521:5: kw= Comma this_AnyData_3= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,Comma,FOLLOW_12); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getArrayListAccess().getCommaKeyword_1_1_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_1_1());
                    	    				
                    	    pushFollow(FOLLOW_11);
                    	    this_AnyData_3=ruleAnyData();

                    	    state._fsp--;


                    	    					current.merge(this_AnyData_3);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x00000083F8400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000010008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000001140000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x00000003F8800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x00000003F8000000L});

}