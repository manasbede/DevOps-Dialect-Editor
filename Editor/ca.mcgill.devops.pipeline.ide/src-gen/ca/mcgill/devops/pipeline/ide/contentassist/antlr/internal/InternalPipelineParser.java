package ca.mcgill.devops.pipeline.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ca.mcgill.devops.pipeline.services.PipelineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPipelineParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("ExclamationMark", "'!'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("KW__", "'_'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Id", "'id:'");
    		tokenNameToValue.put("If", "'if:'");
    		tokenNameToValue.put("On", "'on:'");
    		tokenNameToValue.put("Pr", "'pr:'");
    		tokenNameToValue.put("Env", "'env:'");
    		tokenNameToValue.put("Args", "'args:'");
    		tokenNameToValue.put("Cron", "'cron:'");
    		tokenNameToValue.put("Name", "'name:'");
    		tokenNameToValue.put("Path", "'path:'");
    		tokenNameToValue.put("Push", "'push:'");
    		tokenNameToValue.put("Tags", "'tags:'");
    		tokenNameToValue.put("Type", "'type:'");
    		tokenNameToValue.put("Uses", "'uses:'");
    		tokenNameToValue.put("Build", "'build:'");
    		tokenNameToValue.put("Group", "'group:'");
    		tokenNameToValue.put("Image", "'image:'");
    		tokenNameToValue.put("Needs", "'needs:'");
    		tokenNameToValue.put("Paths", "'paths:'");
    		tokenNameToValue.put("Ports", "'ports:'");
    		tokenNameToValue.put("Shell", "'shell:'");
    		tokenNameToValue.put("Types", "'types:'");
    		tokenNameToValue.put("Builds", "'builds:'");
    		tokenNameToValue.put("Canary", "'canary:'");
    		tokenNameToValue.put("Inputs", "'inputs:'");
    		tokenNameToValue.put("Matrix", "'matrix:'");
    		tokenNameToValue.put("Script", "'script:'");
    		tokenNameToValue.put("Target", "'target:'");
    		tokenNameToValue.put("Exclude", "'exclude:'");
    		tokenNameToValue.put("Extends", "'extends:'");
    		tokenNameToValue.put("Filters", "'filters:'");
    		tokenNameToValue.put("Include", "'include:'");
    		tokenNameToValue.put("Inherit", "'inherit:'");
    		tokenNameToValue.put("Outputs", "'outputs:'");
    		tokenNameToValue.put("ReadAll", "'read-all'");
    		tokenNameToValue.put("Rolling", "'rolling:'");
    		tokenNameToValue.put("RunOnce", "'runOnce:'");
    		tokenNameToValue.put("RunsOn", "'runs-on:'");
    		tokenNameToValue.put("Secrets", "'secrets:'");
    		tokenNameToValue.put("Trigger", "'trigger:'");
    		tokenNameToValue.put("Branches", "'branches:'");
    		tokenNameToValue.put("Defaults", "'defaults:'");
    		tokenNameToValue.put("Packages", "'packages:'");
    		tokenNameToValue.put("Pipeline", "'pipeline:'");
    		tokenNameToValue.put("Required", "'required:'");
    		tokenNameToValue.put("RunName", "'run-name:'");
    		tokenNameToValue.put("Schedule", "'schedule:'");
    		tokenNameToValue.put("Strategy", "'strategy:'");
    		tokenNameToValue.put("Template", "'template:'");
    		tokenNameToValue.put("Webhooks", "'webhooks:'");
    		tokenNameToValue.put("WriteAll", "'write-all'");
    		tokenNameToValue.put("Container", "'container:'");
    		tokenNameToValue.put("FailFast", "'fail-fast:'");
    		tokenNameToValue.put("Pipelines", "'pipelines:'");
    		tokenNameToValue.put("Resources", "'resources:'");
    		tokenNameToValue.put("ReviewApp", "'reviewApp:'");
    		tokenNameToValue.put("Schedules", "'schedules:'");
    		tokenNameToValue.put("Variables", "'variables:'");
    		tokenNameToValue.put("Containers", "'containers:'");
    		tokenNameToValue.put("Deployment", "'deployment:'");
    		tokenNameToValue.put("Entrypoint", "'entrypoint:'");
    		tokenNameToValue.put("Parameters", "'parameters:'");
    		tokenNameToValue.put("Concurrency", "'concurrency:'");
    		tokenNameToValue.put("Credentials", "'credentials:'");
    		tokenNameToValue.put("Environment", "'environment:'");
    		tokenNameToValue.put("Permissions", "'permissions:'");
    		tokenNameToValue.put("TagsIgnore", "'tags-ignore:'");
    		tokenNameToValue.put("MaxParallel", "'max-parallel:'");
    		tokenNameToValue.put("PathsIgnore", "'paths-ignore:'");
    		tokenNameToValue.put("Pull_request", "'pull_request:'");
    		tokenNameToValue.put("Repositories", "'repositories:'");
    		tokenNameToValue.put("Workflow_run", "'workflow_run:'");
    		tokenNameToValue.put("DownloadBuild", "'downloadBuild:'");
    		tokenNameToValue.put("BranchesIgnore", "'branches-ignore:'");
    		tokenNameToValue.put("TimeoutMinutes", "'timeout-minutes:'");
    		tokenNameToValue.put("ContinueOnError", "'continue-on-error:'");
    		tokenNameToValue.put("SettableVariables", "'settableVariables:'");
    		tokenNameToValue.put("WorkingDirectory", "'working-directory:'");
    	}

    	public void setGrammarAccess(PipelineGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRulePipeline"
    // InternalPipelineParser.g:142:1: entryRulePipeline : rulePipeline EOF ;
    public final void entryRulePipeline() throws RecognitionException {
        try {
            // InternalPipelineParser.g:143:1: ( rulePipeline EOF )
            // InternalPipelineParser.g:144:1: rulePipeline EOF
            {
             before(grammarAccess.getPipelineRule()); 
            pushFollow(FOLLOW_1);
            rulePipeline();

            state._fsp--;

             after(grammarAccess.getPipelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePipeline"


    // $ANTLR start "rulePipeline"
    // InternalPipelineParser.g:151:1: rulePipeline : ( ( rule__Pipeline__Alternatives ) ) ;
    public final void rulePipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:155:2: ( ( ( rule__Pipeline__Alternatives ) ) )
            // InternalPipelineParser.g:156:2: ( ( rule__Pipeline__Alternatives ) )
            {
            // InternalPipelineParser.g:156:2: ( ( rule__Pipeline__Alternatives ) )
            // InternalPipelineParser.g:157:3: ( rule__Pipeline__Alternatives )
            {
             before(grammarAccess.getPipelineAccess().getAlternatives()); 
            // InternalPipelineParser.g:158:3: ( rule__Pipeline__Alternatives )
            // InternalPipelineParser.g:158:4: rule__Pipeline__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePipeline"


    // $ANTLR start "entryRuleConfiguration"
    // InternalPipelineParser.g:167:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalPipelineParser.g:168:1: ( ruleConfiguration EOF )
            // InternalPipelineParser.g:169:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalPipelineParser.g:176:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:180:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // InternalPipelineParser.g:181:2: ( ( rule__Configuration__Group__0 ) )
            {
            // InternalPipelineParser.g:181:2: ( ( rule__Configuration__Group__0 ) )
            // InternalPipelineParser.g:182:3: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // InternalPipelineParser.g:183:3: ( rule__Configuration__Group__0 )
            // InternalPipelineParser.g:183:4: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleParameter"
    // InternalPipelineParser.g:192:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalPipelineParser.g:193:1: ( ruleParameter EOF )
            // InternalPipelineParser.g:194:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalPipelineParser.g:201:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:205:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalPipelineParser.g:206:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalPipelineParser.g:206:2: ( ( rule__Parameter__Group__0 ) )
            // InternalPipelineParser.g:207:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalPipelineParser.g:208:3: ( rule__Parameter__Group__0 )
            // InternalPipelineParser.g:208:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAnyData"
    // InternalPipelineParser.g:217:1: entryRuleAnyData : ruleAnyData EOF ;
    public final void entryRuleAnyData() throws RecognitionException {
        try {
            // InternalPipelineParser.g:218:1: ( ruleAnyData EOF )
            // InternalPipelineParser.g:219:1: ruleAnyData EOF
            {
             before(grammarAccess.getAnyDataRule()); 
            pushFollow(FOLLOW_1);
            ruleAnyData();

            state._fsp--;

             after(grammarAccess.getAnyDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnyData"


    // $ANTLR start "ruleAnyData"
    // InternalPipelineParser.g:226:1: ruleAnyData : ( ( rule__AnyData__Alternatives ) ) ;
    public final void ruleAnyData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:230:2: ( ( ( rule__AnyData__Alternatives ) ) )
            // InternalPipelineParser.g:231:2: ( ( rule__AnyData__Alternatives ) )
            {
            // InternalPipelineParser.g:231:2: ( ( rule__AnyData__Alternatives ) )
            // InternalPipelineParser.g:232:3: ( rule__AnyData__Alternatives )
            {
             before(grammarAccess.getAnyDataAccess().getAlternatives()); 
            // InternalPipelineParser.g:233:3: ( rule__AnyData__Alternatives )
            // InternalPipelineParser.g:233:4: rule__AnyData__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AnyData__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnyDataAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyData"


    // $ANTLR start "entryRuleUnquotedString"
    // InternalPipelineParser.g:242:1: entryRuleUnquotedString : ruleUnquotedString EOF ;
    public final void entryRuleUnquotedString() throws RecognitionException {
        try {
            // InternalPipelineParser.g:243:1: ( ruleUnquotedString EOF )
            // InternalPipelineParser.g:244:1: ruleUnquotedString EOF
            {
             before(grammarAccess.getUnquotedStringRule()); 
            pushFollow(FOLLOW_1);
            ruleUnquotedString();

            state._fsp--;

             after(grammarAccess.getUnquotedStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnquotedString"


    // $ANTLR start "ruleUnquotedString"
    // InternalPipelineParser.g:251:1: ruleUnquotedString : ( ( rule__UnquotedString__Group__0 ) ) ;
    public final void ruleUnquotedString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:255:2: ( ( ( rule__UnquotedString__Group__0 ) ) )
            // InternalPipelineParser.g:256:2: ( ( rule__UnquotedString__Group__0 ) )
            {
            // InternalPipelineParser.g:256:2: ( ( rule__UnquotedString__Group__0 ) )
            // InternalPipelineParser.g:257:3: ( rule__UnquotedString__Group__0 )
            {
             before(grammarAccess.getUnquotedStringAccess().getGroup()); 
            // InternalPipelineParser.g:258:3: ( rule__UnquotedString__Group__0 )
            // InternalPipelineParser.g:258:4: rule__UnquotedString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnquotedString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnquotedStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnquotedString"


    // $ANTLR start "entryRuleNumber"
    // InternalPipelineParser.g:267:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalPipelineParser.g:268:1: ( ruleNumber EOF )
            // InternalPipelineParser.g:269:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalPipelineParser.g:276:1: ruleNumber : ( RULE_INT ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:280:2: ( ( RULE_INT ) )
            // InternalPipelineParser.g:281:2: ( RULE_INT )
            {
            // InternalPipelineParser.g:281:2: ( RULE_INT )
            // InternalPipelineParser.g:282:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleFloatingPoint"
    // InternalPipelineParser.g:292:1: entryRuleFloatingPoint : ruleFloatingPoint EOF ;
    public final void entryRuleFloatingPoint() throws RecognitionException {
        try {
            // InternalPipelineParser.g:293:1: ( ruleFloatingPoint EOF )
            // InternalPipelineParser.g:294:1: ruleFloatingPoint EOF
            {
             before(grammarAccess.getFloatingPointRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatingPoint();

            state._fsp--;

             after(grammarAccess.getFloatingPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatingPoint"


    // $ANTLR start "ruleFloatingPoint"
    // InternalPipelineParser.g:301:1: ruleFloatingPoint : ( RULE_FLOAT_LITERAL ) ;
    public final void ruleFloatingPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:305:2: ( ( RULE_FLOAT_LITERAL ) )
            // InternalPipelineParser.g:306:2: ( RULE_FLOAT_LITERAL )
            {
            // InternalPipelineParser.g:306:2: ( RULE_FLOAT_LITERAL )
            // InternalPipelineParser.g:307:3: RULE_FLOAT_LITERAL
            {
             before(grammarAccess.getFloatingPointAccess().getFLOAT_LITERALTerminalRuleCall()); 
            match(input,RULE_FLOAT_LITERAL,FOLLOW_2); 
             after(grammarAccess.getFloatingPointAccess().getFLOAT_LITERALTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatingPoint"


    // $ANTLR start "entryRuleSimpleWord"
    // InternalPipelineParser.g:317:1: entryRuleSimpleWord : ruleSimpleWord EOF ;
    public final void entryRuleSimpleWord() throws RecognitionException {
        try {
            // InternalPipelineParser.g:318:1: ( ruleSimpleWord EOF )
            // InternalPipelineParser.g:319:1: ruleSimpleWord EOF
            {
             before(grammarAccess.getSimpleWordRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleWord();

            state._fsp--;

             after(grammarAccess.getSimpleWordRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleWord"


    // $ANTLR start "ruleSimpleWord"
    // InternalPipelineParser.g:326:1: ruleSimpleWord : ( RULE_ID ) ;
    public final void ruleSimpleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:330:2: ( ( RULE_ID ) )
            // InternalPipelineParser.g:331:2: ( RULE_ID )
            {
            // InternalPipelineParser.g:331:2: ( RULE_ID )
            // InternalPipelineParser.g:332:3: RULE_ID
            {
             before(grammarAccess.getSimpleWordAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleWordAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleWord"


    // $ANTLR start "entryRuleArrayList"
    // InternalPipelineParser.g:342:1: entryRuleArrayList : ruleArrayList EOF ;
    public final void entryRuleArrayList() throws RecognitionException {
        try {
            // InternalPipelineParser.g:343:1: ( ruleArrayList EOF )
            // InternalPipelineParser.g:344:1: ruleArrayList EOF
            {
             before(grammarAccess.getArrayListRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayList();

            state._fsp--;

             after(grammarAccess.getArrayListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayList"


    // $ANTLR start "ruleArrayList"
    // InternalPipelineParser.g:351:1: ruleArrayList : ( ( rule__ArrayList__Group__0 ) ) ;
    public final void ruleArrayList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:355:2: ( ( ( rule__ArrayList__Group__0 ) ) )
            // InternalPipelineParser.g:356:2: ( ( rule__ArrayList__Group__0 ) )
            {
            // InternalPipelineParser.g:356:2: ( ( rule__ArrayList__Group__0 ) )
            // InternalPipelineParser.g:357:3: ( rule__ArrayList__Group__0 )
            {
             before(grammarAccess.getArrayListAccess().getGroup()); 
            // InternalPipelineParser.g:358:3: ( rule__ArrayList__Group__0 )
            // InternalPipelineParser.g:358:4: rule__ArrayList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayList"


    // $ANTLR start "rule__Pipeline__Alternatives"
    // InternalPipelineParser.g:366:1: rule__Pipeline__Alternatives : ( ( ( rule__Pipeline__Group_0__0 ) ) | ( ( rule__Pipeline__PipelineConfigurationAssignment_1 )* ) );
    public final void rule__Pipeline__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:370:1: ( ( ( rule__Pipeline__Group_0__0 ) ) | ( ( rule__Pipeline__PipelineConfigurationAssignment_1 )* ) )
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
                    // InternalPipelineParser.g:371:2: ( ( rule__Pipeline__Group_0__0 ) )
                    {
                    // InternalPipelineParser.g:371:2: ( ( rule__Pipeline__Group_0__0 ) )
                    // InternalPipelineParser.g:372:3: ( rule__Pipeline__Group_0__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_0()); 
                    // InternalPipelineParser.g:373:3: ( rule__Pipeline__Group_0__0 )
                    // InternalPipelineParser.g:373:4: rule__Pipeline__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:377:2: ( ( rule__Pipeline__PipelineConfigurationAssignment_1 )* )
                    {
                    // InternalPipelineParser.g:377:2: ( ( rule__Pipeline__PipelineConfigurationAssignment_1 )* )
                    // InternalPipelineParser.g:378:3: ( rule__Pipeline__PipelineConfigurationAssignment_1 )*
                    {
                     before(grammarAccess.getPipelineAccess().getPipelineConfigurationAssignment_1()); 
                    // InternalPipelineParser.g:379:3: ( rule__Pipeline__PipelineConfigurationAssignment_1 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Parameters) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalPipelineParser.g:379:4: rule__Pipeline__PipelineConfigurationAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Pipeline__PipelineConfigurationAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getPipelineAccess().getPipelineConfigurationAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Alternatives"


    // $ANTLR start "rule__Parameter__Alternatives_2"
    // InternalPipelineParser.g:387:1: rule__Parameter__Alternatives_2 : ( ( ( rule__Parameter__Group_2_0__0 ) ) | ( ( rule__Parameter__ValueAssignment_2_1 ) ) );
    public final void rule__Parameter__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:391:1: ( ( ( rule__Parameter__Group_2_0__0 ) ) | ( ( rule__Parameter__ValueAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_BEGIN) ) {
                alt3=1;
            }
            else if ( (LA3_0==LeftSquareBracket||(LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPipelineParser.g:392:2: ( ( rule__Parameter__Group_2_0__0 ) )
                    {
                    // InternalPipelineParser.g:392:2: ( ( rule__Parameter__Group_2_0__0 ) )
                    // InternalPipelineParser.g:393:3: ( rule__Parameter__Group_2_0__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_2_0()); 
                    // InternalPipelineParser.g:394:3: ( rule__Parameter__Group_2_0__0 )
                    // InternalPipelineParser.g:394:4: rule__Parameter__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:398:2: ( ( rule__Parameter__ValueAssignment_2_1 ) )
                    {
                    // InternalPipelineParser.g:398:2: ( ( rule__Parameter__ValueAssignment_2_1 ) )
                    // InternalPipelineParser.g:399:3: ( rule__Parameter__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getParameterAccess().getValueAssignment_2_1()); 
                    // InternalPipelineParser.g:400:3: ( rule__Parameter__ValueAssignment_2_1 )
                    // InternalPipelineParser.g:400:4: rule__Parameter__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__ValueAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getValueAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Alternatives_2"


    // $ANTLR start "rule__Parameter__ValueAlternatives_2_1_0"
    // InternalPipelineParser.g:408:1: rule__Parameter__ValueAlternatives_2_1_0 : ( ( ruleAnyData ) | ( ruleArrayList ) );
    public final void rule__Parameter__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:412:1: ( ( ruleAnyData ) | ( ruleArrayList ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                alt4=1;
            }
            else if ( (LA4_0==LeftSquareBracket) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPipelineParser.g:413:2: ( ruleAnyData )
                    {
                    // InternalPipelineParser.g:413:2: ( ruleAnyData )
                    // InternalPipelineParser.g:414:3: ruleAnyData
                    {
                     before(grammarAccess.getParameterAccess().getValueAnyDataParserRuleCall_2_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAnyData();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getValueAnyDataParserRuleCall_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:419:2: ( ruleArrayList )
                    {
                    // InternalPipelineParser.g:419:2: ( ruleArrayList )
                    // InternalPipelineParser.g:420:3: ruleArrayList
                    {
                     before(grammarAccess.getParameterAccess().getValueArrayListParserRuleCall_2_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayList();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getValueArrayListParserRuleCall_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__AnyData__Alternatives"
    // InternalPipelineParser.g:429:1: rule__AnyData__Alternatives : ( ( RULE_STRING ) | ( ruleNumber ) | ( ruleFloatingPoint ) | ( ruleSimpleWord ) | ( RULE_COMPLEX_EXPRESSION ) | ( RULE_HEX_INT ) | ( RULE_VERSION ) );
    public final void rule__AnyData__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:433:1: ( ( RULE_STRING ) | ( ruleNumber ) | ( ruleFloatingPoint ) | ( ruleSimpleWord ) | ( RULE_COMPLEX_EXPRESSION ) | ( RULE_HEX_INT ) | ( RULE_VERSION ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                alt5=4;
                }
                break;
            case RULE_COMPLEX_EXPRESSION:
                {
                alt5=5;
                }
                break;
            case RULE_HEX_INT:
                {
                alt5=6;
                }
                break;
            case RULE_VERSION:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPipelineParser.g:434:2: ( RULE_STRING )
                    {
                    // InternalPipelineParser.g:434:2: ( RULE_STRING )
                    // InternalPipelineParser.g:435:3: RULE_STRING
                    {
                     before(grammarAccess.getAnyDataAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAnyDataAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:440:2: ( ruleNumber )
                    {
                    // InternalPipelineParser.g:440:2: ( ruleNumber )
                    // InternalPipelineParser.g:441:3: ruleNumber
                    {
                     before(grammarAccess.getAnyDataAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getAnyDataAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:446:2: ( ruleFloatingPoint )
                    {
                    // InternalPipelineParser.g:446:2: ( ruleFloatingPoint )
                    // InternalPipelineParser.g:447:3: ruleFloatingPoint
                    {
                     before(grammarAccess.getAnyDataAccess().getFloatingPointParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatingPoint();

                    state._fsp--;

                     after(grammarAccess.getAnyDataAccess().getFloatingPointParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:452:2: ( ruleSimpleWord )
                    {
                    // InternalPipelineParser.g:452:2: ( ruleSimpleWord )
                    // InternalPipelineParser.g:453:3: ruleSimpleWord
                    {
                     before(grammarAccess.getAnyDataAccess().getSimpleWordParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleWord();

                    state._fsp--;

                     after(grammarAccess.getAnyDataAccess().getSimpleWordParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:458:2: ( RULE_COMPLEX_EXPRESSION )
                    {
                    // InternalPipelineParser.g:458:2: ( RULE_COMPLEX_EXPRESSION )
                    // InternalPipelineParser.g:459:3: RULE_COMPLEX_EXPRESSION
                    {
                     before(grammarAccess.getAnyDataAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_4()); 
                    match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_2); 
                     after(grammarAccess.getAnyDataAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:464:2: ( RULE_HEX_INT )
                    {
                    // InternalPipelineParser.g:464:2: ( RULE_HEX_INT )
                    // InternalPipelineParser.g:465:3: RULE_HEX_INT
                    {
                     before(grammarAccess.getAnyDataAccess().getHEX_INTTerminalRuleCall_5()); 
                    match(input,RULE_HEX_INT,FOLLOW_2); 
                     after(grammarAccess.getAnyDataAccess().getHEX_INTTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:470:2: ( RULE_VERSION )
                    {
                    // InternalPipelineParser.g:470:2: ( RULE_VERSION )
                    // InternalPipelineParser.g:471:3: RULE_VERSION
                    {
                     before(grammarAccess.getAnyDataAccess().getVERSIONTerminalRuleCall_6()); 
                    match(input,RULE_VERSION,FOLLOW_2); 
                     after(grammarAccess.getAnyDataAccess().getVERSIONTerminalRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyData__Alternatives"


    // $ANTLR start "rule__UnquotedString__Alternatives_1"
    // InternalPipelineParser.g:480:1: rule__UnquotedString__Alternatives_1 : ( ( ( rule__UnquotedString__Group_1_0__0 ) ) | ( RULE_INT ) | ( RULE_VERSION ) );
    public final void rule__UnquotedString__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:484:1: ( ( ( rule__UnquotedString__Group_1_0__0 ) ) | ( RULE_INT ) | ( RULE_VERSION ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_VERSION:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPipelineParser.g:485:2: ( ( rule__UnquotedString__Group_1_0__0 ) )
                    {
                    // InternalPipelineParser.g:485:2: ( ( rule__UnquotedString__Group_1_0__0 ) )
                    // InternalPipelineParser.g:486:3: ( rule__UnquotedString__Group_1_0__0 )
                    {
                     before(grammarAccess.getUnquotedStringAccess().getGroup_1_0()); 
                    // InternalPipelineParser.g:487:3: ( rule__UnquotedString__Group_1_0__0 )
                    // InternalPipelineParser.g:487:4: rule__UnquotedString__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnquotedString__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnquotedStringAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:491:2: ( RULE_INT )
                    {
                    // InternalPipelineParser.g:491:2: ( RULE_INT )
                    // InternalPipelineParser.g:492:3: RULE_INT
                    {
                     before(grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:497:2: ( RULE_VERSION )
                    {
                    // InternalPipelineParser.g:497:2: ( RULE_VERSION )
                    // InternalPipelineParser.g:498:3: RULE_VERSION
                    {
                     before(grammarAccess.getUnquotedStringAccess().getVERSIONTerminalRuleCall_1_2()); 
                    match(input,RULE_VERSION,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getVERSIONTerminalRuleCall_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Alternatives_1"


    // $ANTLR start "rule__Pipeline__Group_0__0"
    // InternalPipelineParser.g:507:1: rule__Pipeline__Group_0__0 : rule__Pipeline__Group_0__0__Impl rule__Pipeline__Group_0__1 ;
    public final void rule__Pipeline__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:511:1: ( rule__Pipeline__Group_0__0__Impl rule__Pipeline__Group_0__1 )
            // InternalPipelineParser.g:512:2: rule__Pipeline__Group_0__0__Impl rule__Pipeline__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Pipeline__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_0__0"


    // $ANTLR start "rule__Pipeline__Group_0__0__Impl"
    // InternalPipelineParser.g:519:1: rule__Pipeline__Group_0__0__Impl : ( Name ) ;
    public final void rule__Pipeline__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:523:1: ( ( Name ) )
            // InternalPipelineParser.g:524:1: ( Name )
            {
            // InternalPipelineParser.g:524:1: ( Name )
            // InternalPipelineParser.g:525:2: Name
            {
             before(grammarAccess.getPipelineAccess().getNameKeyword_0_0()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getNameKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_0__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_0__1"
    // InternalPipelineParser.g:534:1: rule__Pipeline__Group_0__1 : rule__Pipeline__Group_0__1__Impl ;
    public final void rule__Pipeline__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:538:1: ( rule__Pipeline__Group_0__1__Impl )
            // InternalPipelineParser.g:539:2: rule__Pipeline__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_0__1"


    // $ANTLR start "rule__Pipeline__Group_0__1__Impl"
    // InternalPipelineParser.g:545:1: rule__Pipeline__Group_0__1__Impl : ( ( rule__Pipeline__NameAssignment_0_1 ) ) ;
    public final void rule__Pipeline__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:549:1: ( ( ( rule__Pipeline__NameAssignment_0_1 ) ) )
            // InternalPipelineParser.g:550:1: ( ( rule__Pipeline__NameAssignment_0_1 ) )
            {
            // InternalPipelineParser.g:550:1: ( ( rule__Pipeline__NameAssignment_0_1 ) )
            // InternalPipelineParser.g:551:2: ( rule__Pipeline__NameAssignment_0_1 )
            {
             before(grammarAccess.getPipelineAccess().getNameAssignment_0_1()); 
            // InternalPipelineParser.g:552:2: ( rule__Pipeline__NameAssignment_0_1 )
            // InternalPipelineParser.g:552:3: rule__Pipeline__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_0__1__Impl"


    // $ANTLR start "rule__Configuration__Group__0"
    // InternalPipelineParser.g:561:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:565:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalPipelineParser.g:566:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // InternalPipelineParser.g:573:1: rule__Configuration__Group__0__Impl : ( Parameters ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:577:1: ( ( Parameters ) )
            // InternalPipelineParser.g:578:1: ( Parameters )
            {
            // InternalPipelineParser.g:578:1: ( Parameters )
            // InternalPipelineParser.g:579:2: Parameters
            {
             before(grammarAccess.getConfigurationAccess().getParametersKeyword_0()); 
            match(input,Parameters,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getParametersKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // InternalPipelineParser.g:588:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:592:1: ( rule__Configuration__Group__1__Impl )
            // InternalPipelineParser.g:593:2: rule__Configuration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // InternalPipelineParser.g:599:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__ParametersAssignment_1 )* ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:603:1: ( ( ( rule__Configuration__ParametersAssignment_1 )* ) )
            // InternalPipelineParser.g:604:1: ( ( rule__Configuration__ParametersAssignment_1 )* )
            {
            // InternalPipelineParser.g:604:1: ( ( rule__Configuration__ParametersAssignment_1 )* )
            // InternalPipelineParser.g:605:2: ( rule__Configuration__ParametersAssignment_1 )*
            {
             before(grammarAccess.getConfigurationAccess().getParametersAssignment_1()); 
            // InternalPipelineParser.g:606:2: ( rule__Configuration__ParametersAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPipelineParser.g:606:3: rule__Configuration__ParametersAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Configuration__ParametersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getParametersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalPipelineParser.g:615:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:619:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalPipelineParser.g:620:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalPipelineParser.g:627:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:631:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalPipelineParser.g:632:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalPipelineParser.g:632:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalPipelineParser.g:633:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalPipelineParser.g:634:2: ( rule__Parameter__NameAssignment_0 )
            // InternalPipelineParser.g:634:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalPipelineParser.g:642:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:646:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalPipelineParser.g:647:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalPipelineParser.g:654:1: rule__Parameter__Group__1__Impl : ( Colon ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:658:1: ( ( Colon ) )
            // InternalPipelineParser.g:659:1: ( Colon )
            {
            // InternalPipelineParser.g:659:1: ( Colon )
            // InternalPipelineParser.g:660:2: Colon
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalPipelineParser.g:669:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:673:1: ( rule__Parameter__Group__2__Impl )
            // InternalPipelineParser.g:674:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalPipelineParser.g:680:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Alternatives_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:684:1: ( ( ( rule__Parameter__Alternatives_2 ) ) )
            // InternalPipelineParser.g:685:1: ( ( rule__Parameter__Alternatives_2 ) )
            {
            // InternalPipelineParser.g:685:1: ( ( rule__Parameter__Alternatives_2 ) )
            // InternalPipelineParser.g:686:2: ( rule__Parameter__Alternatives_2 )
            {
             before(grammarAccess.getParameterAccess().getAlternatives_2()); 
            // InternalPipelineParser.g:687:2: ( rule__Parameter__Alternatives_2 )
            // InternalPipelineParser.g:687:3: rule__Parameter__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group_2_0__0"
    // InternalPipelineParser.g:696:1: rule__Parameter__Group_2_0__0 : rule__Parameter__Group_2_0__0__Impl rule__Parameter__Group_2_0__1 ;
    public final void rule__Parameter__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:700:1: ( rule__Parameter__Group_2_0__0__Impl rule__Parameter__Group_2_0__1 )
            // InternalPipelineParser.g:701:2: rule__Parameter__Group_2_0__0__Impl rule__Parameter__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Parameter__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__0"


    // $ANTLR start "rule__Parameter__Group_2_0__0__Impl"
    // InternalPipelineParser.g:708:1: rule__Parameter__Group_2_0__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Parameter__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:712:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:713:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:713:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:714:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_2_0_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__0__Impl"


    // $ANTLR start "rule__Parameter__Group_2_0__1"
    // InternalPipelineParser.g:723:1: rule__Parameter__Group_2_0__1 : rule__Parameter__Group_2_0__1__Impl rule__Parameter__Group_2_0__2 ;
    public final void rule__Parameter__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:727:1: ( rule__Parameter__Group_2_0__1__Impl rule__Parameter__Group_2_0__2 )
            // InternalPipelineParser.g:728:2: rule__Parameter__Group_2_0__1__Impl rule__Parameter__Group_2_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Parameter__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__1"


    // $ANTLR start "rule__Parameter__Group_2_0__1__Impl"
    // InternalPipelineParser.g:735:1: rule__Parameter__Group_2_0__1__Impl : ( ( rule__Parameter__ParametersAssignment_2_0_1 )* ) ;
    public final void rule__Parameter__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:739:1: ( ( ( rule__Parameter__ParametersAssignment_2_0_1 )* ) )
            // InternalPipelineParser.g:740:1: ( ( rule__Parameter__ParametersAssignment_2_0_1 )* )
            {
            // InternalPipelineParser.g:740:1: ( ( rule__Parameter__ParametersAssignment_2_0_1 )* )
            // InternalPipelineParser.g:741:2: ( rule__Parameter__ParametersAssignment_2_0_1 )*
            {
             before(grammarAccess.getParameterAccess().getParametersAssignment_2_0_1()); 
            // InternalPipelineParser.g:742:2: ( rule__Parameter__ParametersAssignment_2_0_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPipelineParser.g:742:3: rule__Parameter__ParametersAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Parameter__ParametersAssignment_2_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getParameterAccess().getParametersAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__1__Impl"


    // $ANTLR start "rule__Parameter__Group_2_0__2"
    // InternalPipelineParser.g:750:1: rule__Parameter__Group_2_0__2 : rule__Parameter__Group_2_0__2__Impl ;
    public final void rule__Parameter__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:754:1: ( rule__Parameter__Group_2_0__2__Impl )
            // InternalPipelineParser.g:755:2: rule__Parameter__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__2"


    // $ANTLR start "rule__Parameter__Group_2_0__2__Impl"
    // InternalPipelineParser.g:761:1: rule__Parameter__Group_2_0__2__Impl : ( RULE_END ) ;
    public final void rule__Parameter__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:765:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:766:1: ( RULE_END )
            {
            // InternalPipelineParser.g:766:1: ( RULE_END )
            // InternalPipelineParser.g:767:2: RULE_END
            {
             before(grammarAccess.getParameterAccess().getENDTerminalRuleCall_2_0_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getENDTerminalRuleCall_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__2__Impl"


    // $ANTLR start "rule__UnquotedString__Group__0"
    // InternalPipelineParser.g:777:1: rule__UnquotedString__Group__0 : rule__UnquotedString__Group__0__Impl rule__UnquotedString__Group__1 ;
    public final void rule__UnquotedString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:781:1: ( rule__UnquotedString__Group__0__Impl rule__UnquotedString__Group__1 )
            // InternalPipelineParser.g:782:2: rule__UnquotedString__Group__0__Impl rule__UnquotedString__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__UnquotedString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnquotedString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group__0"


    // $ANTLR start "rule__UnquotedString__Group__0__Impl"
    // InternalPipelineParser.g:789:1: rule__UnquotedString__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__UnquotedString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:793:1: ( ( RULE_ID ) )
            // InternalPipelineParser.g:794:1: ( RULE_ID )
            {
            // InternalPipelineParser.g:794:1: ( RULE_ID )
            // InternalPipelineParser.g:795:2: RULE_ID
            {
             before(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group__0__Impl"


    // $ANTLR start "rule__UnquotedString__Group__1"
    // InternalPipelineParser.g:804:1: rule__UnquotedString__Group__1 : rule__UnquotedString__Group__1__Impl ;
    public final void rule__UnquotedString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:808:1: ( rule__UnquotedString__Group__1__Impl )
            // InternalPipelineParser.g:809:2: rule__UnquotedString__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnquotedString__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group__1"


    // $ANTLR start "rule__UnquotedString__Group__1__Impl"
    // InternalPipelineParser.g:815:1: rule__UnquotedString__Group__1__Impl : ( ( rule__UnquotedString__Alternatives_1 )* ) ;
    public final void rule__UnquotedString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:819:1: ( ( ( rule__UnquotedString__Alternatives_1 )* ) )
            // InternalPipelineParser.g:820:1: ( ( rule__UnquotedString__Alternatives_1 )* )
            {
            // InternalPipelineParser.g:820:1: ( ( rule__UnquotedString__Alternatives_1 )* )
            // InternalPipelineParser.g:821:2: ( rule__UnquotedString__Alternatives_1 )*
            {
             before(grammarAccess.getUnquotedStringAccess().getAlternatives_1()); 
            // InternalPipelineParser.g:822:2: ( rule__UnquotedString__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||LA9_0==RULE_VERSION||LA9_0==RULE_WS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPipelineParser.g:822:3: rule__UnquotedString__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UnquotedString__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getUnquotedStringAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group__1__Impl"


    // $ANTLR start "rule__UnquotedString__Group_1_0__0"
    // InternalPipelineParser.g:831:1: rule__UnquotedString__Group_1_0__0 : rule__UnquotedString__Group_1_0__0__Impl rule__UnquotedString__Group_1_0__1 ;
    public final void rule__UnquotedString__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:835:1: ( rule__UnquotedString__Group_1_0__0__Impl rule__UnquotedString__Group_1_0__1 )
            // InternalPipelineParser.g:836:2: rule__UnquotedString__Group_1_0__0__Impl rule__UnquotedString__Group_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__UnquotedString__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnquotedString__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group_1_0__0"


    // $ANTLR start "rule__UnquotedString__Group_1_0__0__Impl"
    // InternalPipelineParser.g:843:1: rule__UnquotedString__Group_1_0__0__Impl : ( RULE_WS ) ;
    public final void rule__UnquotedString__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:847:1: ( ( RULE_WS ) )
            // InternalPipelineParser.g:848:1: ( RULE_WS )
            {
            // InternalPipelineParser.g:848:1: ( RULE_WS )
            // InternalPipelineParser.g:849:2: RULE_WS
            {
             before(grammarAccess.getUnquotedStringAccess().getWSTerminalRuleCall_1_0_0()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getUnquotedStringAccess().getWSTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group_1_0__0__Impl"


    // $ANTLR start "rule__UnquotedString__Group_1_0__1"
    // InternalPipelineParser.g:858:1: rule__UnquotedString__Group_1_0__1 : rule__UnquotedString__Group_1_0__1__Impl ;
    public final void rule__UnquotedString__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:862:1: ( rule__UnquotedString__Group_1_0__1__Impl )
            // InternalPipelineParser.g:863:2: rule__UnquotedString__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnquotedString__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group_1_0__1"


    // $ANTLR start "rule__UnquotedString__Group_1_0__1__Impl"
    // InternalPipelineParser.g:869:1: rule__UnquotedString__Group_1_0__1__Impl : ( RULE_ID ) ;
    public final void rule__UnquotedString__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:873:1: ( ( RULE_ID ) )
            // InternalPipelineParser.g:874:1: ( RULE_ID )
            {
            // InternalPipelineParser.g:874:1: ( RULE_ID )
            // InternalPipelineParser.g:875:2: RULE_ID
            {
             before(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedString__Group_1_0__1__Impl"


    // $ANTLR start "rule__ArrayList__Group__0"
    // InternalPipelineParser.g:885:1: rule__ArrayList__Group__0 : rule__ArrayList__Group__0__Impl rule__ArrayList__Group__1 ;
    public final void rule__ArrayList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:889:1: ( rule__ArrayList__Group__0__Impl rule__ArrayList__Group__1 )
            // InternalPipelineParser.g:890:2: rule__ArrayList__Group__0__Impl rule__ArrayList__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ArrayList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group__0"


    // $ANTLR start "rule__ArrayList__Group__0__Impl"
    // InternalPipelineParser.g:897:1: rule__ArrayList__Group__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:901:1: ( ( LeftSquareBracket ) )
            // InternalPipelineParser.g:902:1: ( LeftSquareBracket )
            {
            // InternalPipelineParser.g:902:1: ( LeftSquareBracket )
            // InternalPipelineParser.g:903:2: LeftSquareBracket
            {
             before(grammarAccess.getArrayListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getArrayListAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group__0__Impl"


    // $ANTLR start "rule__ArrayList__Group__1"
    // InternalPipelineParser.g:912:1: rule__ArrayList__Group__1 : rule__ArrayList__Group__1__Impl rule__ArrayList__Group__2 ;
    public final void rule__ArrayList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:916:1: ( rule__ArrayList__Group__1__Impl rule__ArrayList__Group__2 )
            // InternalPipelineParser.g:917:2: rule__ArrayList__Group__1__Impl rule__ArrayList__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ArrayList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group__1"


    // $ANTLR start "rule__ArrayList__Group__1__Impl"
    // InternalPipelineParser.g:924:1: rule__ArrayList__Group__1__Impl : ( ( rule__ArrayList__Group_1__0 )? ) ;
    public final void rule__ArrayList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:928:1: ( ( ( rule__ArrayList__Group_1__0 )? ) )
            // InternalPipelineParser.g:929:1: ( ( rule__ArrayList__Group_1__0 )? )
            {
            // InternalPipelineParser.g:929:1: ( ( rule__ArrayList__Group_1__0 )? )
            // InternalPipelineParser.g:930:2: ( rule__ArrayList__Group_1__0 )?
            {
             before(grammarAccess.getArrayListAccess().getGroup_1()); 
            // InternalPipelineParser.g:931:2: ( rule__ArrayList__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPipelineParser.g:931:3: rule__ArrayList__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayList__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group__1__Impl"


    // $ANTLR start "rule__ArrayList__Group__2"
    // InternalPipelineParser.g:939:1: rule__ArrayList__Group__2 : rule__ArrayList__Group__2__Impl ;
    public final void rule__ArrayList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:943:1: ( rule__ArrayList__Group__2__Impl )
            // InternalPipelineParser.g:944:2: rule__ArrayList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group__2"


    // $ANTLR start "rule__ArrayList__Group__2__Impl"
    // InternalPipelineParser.g:950:1: rule__ArrayList__Group__2__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:954:1: ( ( RightSquareBracket ) )
            // InternalPipelineParser.g:955:1: ( RightSquareBracket )
            {
            // InternalPipelineParser.g:955:1: ( RightSquareBracket )
            // InternalPipelineParser.g:956:2: RightSquareBracket
            {
             before(grammarAccess.getArrayListAccess().getRightSquareBracketKeyword_2()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getArrayListAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group__2__Impl"


    // $ANTLR start "rule__ArrayList__Group_1__0"
    // InternalPipelineParser.g:966:1: rule__ArrayList__Group_1__0 : rule__ArrayList__Group_1__0__Impl rule__ArrayList__Group_1__1 ;
    public final void rule__ArrayList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:970:1: ( rule__ArrayList__Group_1__0__Impl rule__ArrayList__Group_1__1 )
            // InternalPipelineParser.g:971:2: rule__ArrayList__Group_1__0__Impl rule__ArrayList__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ArrayList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group_1__0"


    // $ANTLR start "rule__ArrayList__Group_1__0__Impl"
    // InternalPipelineParser.g:978:1: rule__ArrayList__Group_1__0__Impl : ( ruleAnyData ) ;
    public final void rule__ArrayList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:982:1: ( ( ruleAnyData ) )
            // InternalPipelineParser.g:983:1: ( ruleAnyData )
            {
            // InternalPipelineParser.g:983:1: ( ruleAnyData )
            // InternalPipelineParser.g:984:2: ruleAnyData
            {
             before(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnyData();

            state._fsp--;

             after(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group_1__0__Impl"


    // $ANTLR start "rule__ArrayList__Group_1__1"
    // InternalPipelineParser.g:993:1: rule__ArrayList__Group_1__1 : rule__ArrayList__Group_1__1__Impl ;
    public final void rule__ArrayList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:997:1: ( rule__ArrayList__Group_1__1__Impl )
            // InternalPipelineParser.g:998:2: rule__ArrayList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group_1__1"


    // $ANTLR start "rule__ArrayList__Group_1__1__Impl"
    // InternalPipelineParser.g:1004:1: rule__ArrayList__Group_1__1__Impl : ( ( rule__ArrayList__Group_1_1__0 )* ) ;
    public final void rule__ArrayList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1008:1: ( ( ( rule__ArrayList__Group_1_1__0 )* ) )
            // InternalPipelineParser.g:1009:1: ( ( rule__ArrayList__Group_1_1__0 )* )
            {
            // InternalPipelineParser.g:1009:1: ( ( rule__ArrayList__Group_1_1__0 )* )
            // InternalPipelineParser.g:1010:2: ( rule__ArrayList__Group_1_1__0 )*
            {
             before(grammarAccess.getArrayListAccess().getGroup_1_1()); 
            // InternalPipelineParser.g:1011:2: ( rule__ArrayList__Group_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPipelineParser.g:1011:3: rule__ArrayList__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ArrayList__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getArrayListAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group_1__1__Impl"


    // $ANTLR start "rule__ArrayList__Group_1_1__0"
    // InternalPipelineParser.g:1020:1: rule__ArrayList__Group_1_1__0 : rule__ArrayList__Group_1_1__0__Impl rule__ArrayList__Group_1_1__1 ;
    public final void rule__ArrayList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1024:1: ( rule__ArrayList__Group_1_1__0__Impl rule__ArrayList__Group_1_1__1 )
            // InternalPipelineParser.g:1025:2: rule__ArrayList__Group_1_1__0__Impl rule__ArrayList__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ArrayList__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayList__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group_1_1__0"


    // $ANTLR start "rule__ArrayList__Group_1_1__0__Impl"
    // InternalPipelineParser.g:1032:1: rule__ArrayList__Group_1_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayList__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1036:1: ( ( Comma ) )
            // InternalPipelineParser.g:1037:1: ( Comma )
            {
            // InternalPipelineParser.g:1037:1: ( Comma )
            // InternalPipelineParser.g:1038:2: Comma
            {
             before(grammarAccess.getArrayListAccess().getCommaKeyword_1_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getArrayListAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group_1_1__0__Impl"


    // $ANTLR start "rule__ArrayList__Group_1_1__1"
    // InternalPipelineParser.g:1047:1: rule__ArrayList__Group_1_1__1 : rule__ArrayList__Group_1_1__1__Impl ;
    public final void rule__ArrayList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1051:1: ( rule__ArrayList__Group_1_1__1__Impl )
            // InternalPipelineParser.g:1052:2: rule__ArrayList__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayList__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group_1_1__1"


    // $ANTLR start "rule__ArrayList__Group_1_1__1__Impl"
    // InternalPipelineParser.g:1058:1: rule__ArrayList__Group_1_1__1__Impl : ( ruleAnyData ) ;
    public final void rule__ArrayList__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1062:1: ( ( ruleAnyData ) )
            // InternalPipelineParser.g:1063:1: ( ruleAnyData )
            {
            // InternalPipelineParser.g:1063:1: ( ruleAnyData )
            // InternalPipelineParser.g:1064:2: ruleAnyData
            {
             before(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_1_1()); 
            pushFollow(FOLLOW_2);
            ruleAnyData();

            state._fsp--;

             after(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayList__Group_1_1__1__Impl"


    // $ANTLR start "rule__Pipeline__NameAssignment_0_1"
    // InternalPipelineParser.g:1074:1: rule__Pipeline__NameAssignment_0_1 : ( ruleUnquotedString ) ;
    public final void rule__Pipeline__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1078:1: ( ( ruleUnquotedString ) )
            // InternalPipelineParser.g:1079:2: ( ruleUnquotedString )
            {
            // InternalPipelineParser.g:1079:2: ( ruleUnquotedString )
            // InternalPipelineParser.g:1080:3: ruleUnquotedString
            {
             before(grammarAccess.getPipelineAccess().getNameUnquotedStringParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnquotedString();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getNameUnquotedStringParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__NameAssignment_0_1"


    // $ANTLR start "rule__Pipeline__PipelineConfigurationAssignment_1"
    // InternalPipelineParser.g:1089:1: rule__Pipeline__PipelineConfigurationAssignment_1 : ( ruleConfiguration ) ;
    public final void rule__Pipeline__PipelineConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1093:1: ( ( ruleConfiguration ) )
            // InternalPipelineParser.g:1094:2: ( ruleConfiguration )
            {
            // InternalPipelineParser.g:1094:2: ( ruleConfiguration )
            // InternalPipelineParser.g:1095:3: ruleConfiguration
            {
             before(grammarAccess.getPipelineAccess().getPipelineConfigurationConfigurationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getPipelineConfigurationConfigurationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__PipelineConfigurationAssignment_1"


    // $ANTLR start "rule__Configuration__ParametersAssignment_1"
    // InternalPipelineParser.g:1104:1: rule__Configuration__ParametersAssignment_1 : ( ruleParameter ) ;
    public final void rule__Configuration__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1108:1: ( ( ruleParameter ) )
            // InternalPipelineParser.g:1109:2: ( ruleParameter )
            {
            // InternalPipelineParser.g:1109:2: ( ruleParameter )
            // InternalPipelineParser.g:1110:3: ruleParameter
            {
             before(grammarAccess.getConfigurationAccess().getParametersParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getParametersParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__ParametersAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalPipelineParser.g:1119:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1123:1: ( ( RULE_ID ) )
            // InternalPipelineParser.g:1124:2: ( RULE_ID )
            {
            // InternalPipelineParser.g:1124:2: ( RULE_ID )
            // InternalPipelineParser.g:1125:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__ParametersAssignment_2_0_1"
    // InternalPipelineParser.g:1134:1: rule__Parameter__ParametersAssignment_2_0_1 : ( ruleParameter ) ;
    public final void rule__Parameter__ParametersAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1138:1: ( ( ruleParameter ) )
            // InternalPipelineParser.g:1139:2: ( ruleParameter )
            {
            // InternalPipelineParser.g:1139:2: ( ruleParameter )
            // InternalPipelineParser.g:1140:3: ruleParameter
            {
             before(grammarAccess.getParameterAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getParametersParameterParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ParametersAssignment_2_0_1"


    // $ANTLR start "rule__Parameter__ValueAssignment_2_1"
    // InternalPipelineParser.g:1149:1: rule__Parameter__ValueAssignment_2_1 : ( ( rule__Parameter__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Parameter__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1153:1: ( ( ( rule__Parameter__ValueAlternatives_2_1_0 ) ) )
            // InternalPipelineParser.g:1154:2: ( ( rule__Parameter__ValueAlternatives_2_1_0 ) )
            {
            // InternalPipelineParser.g:1154:2: ( ( rule__Parameter__ValueAlternatives_2_1_0 ) )
            // InternalPipelineParser.g:1155:3: ( rule__Parameter__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getParameterAccess().getValueAlternatives_2_1_0()); 
            // InternalPipelineParser.g:1156:3: ( rule__Parameter__ValueAlternatives_2_1_0 )
            // InternalPipelineParser.g:1156:4: rule__Parameter__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x00000083F8400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000010008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000001140000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000001140000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x00000003F8800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x00000003F8000000L});

}