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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("Env", "'env:'");
    		tokenNameToValue.put("None", "'none'");
    		tokenNameToValue.put("Read", "'read'");
    		tokenNameToValue.put("Run", "'run:'");
    		tokenNameToValue.put("Name", "'name:'");
    		tokenNameToValue.put("Pool", "'pool:'");
    		tokenNameToValue.put("Write", "'write'");
    		tokenNameToValue.put("Group", "'group:'");
    		tokenNameToValue.put("Shell", "'shell:'");
    		tokenNameToValue.put("Value", "'value:'");
    		tokenNameToValue.put("Builds", "'builds:'");
    		tokenNameToValue.put("Default", "'default:'");
    		tokenNameToValue.put("Demands", "'demands:'");
    		tokenNameToValue.put("Extends", "'extends:'");
    		tokenNameToValue.put("Include", "'include:'");
    		tokenNameToValue.put("ReadAll", "'read-all'");
    		tokenNameToValue.put("VmImage", "'vmImage:'");
    		tokenNameToValue.put("Defaults", "'defaults:'");
    		tokenNameToValue.put("Packages", "'packages:'");
    		tokenNameToValue.put("Readonly", "'readonly:'");
    		tokenNameToValue.put("RunName", "'run-name:'");
    		tokenNameToValue.put("Template", "'template:'");
    		tokenNameToValue.put("Webhooks", "'webhooks:'");
    		tokenNameToValue.put("WriteAll", "'write-all'");
    		tokenNameToValue.put("Pipelines", "'pipelines:'");
    		tokenNameToValue.put("Resources", "'resources:'");
    		tokenNameToValue.put("Variables", "'variables:'");
    		tokenNameToValue.put("Containers", "'containers:'");
    		tokenNameToValue.put("Parameters", "'parameters:'");
    		tokenNameToValue.put("Permission", "'permission:'");
    		tokenNameToValue.put("Concurrency", "'concurrency:'");
    		tokenNameToValue.put("DisplayName", "'displayName:'");
    		tokenNameToValue.put("Repositories", "'repositories:'");
    		tokenNameToValue.put("WorkingDirectory", "'working-directory:'");
    		tokenNameToValue.put("CancelInProgress", "'cancel-in-progress:'");
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
    // InternalPipelineParser.g:95:1: entryRulePipeline : rulePipeline EOF ;
    public final void entryRulePipeline() throws RecognitionException {
        try {
            // InternalPipelineParser.g:96:1: ( rulePipeline EOF )
            // InternalPipelineParser.g:97:1: rulePipeline EOF
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
    // InternalPipelineParser.g:104:1: rulePipeline : ( ( rule__Pipeline__UnorderedGroup ) ) ;
    public final void rulePipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:108:2: ( ( ( rule__Pipeline__UnorderedGroup ) ) )
            // InternalPipelineParser.g:109:2: ( ( rule__Pipeline__UnorderedGroup ) )
            {
            // InternalPipelineParser.g:109:2: ( ( rule__Pipeline__UnorderedGroup ) )
            // InternalPipelineParser.g:110:3: ( rule__Pipeline__UnorderedGroup )
            {
             before(grammarAccess.getPipelineAccess().getUnorderedGroup()); 
            // InternalPipelineParser.g:111:3: ( rule__Pipeline__UnorderedGroup )
            // InternalPipelineParser.g:111:4: rule__Pipeline__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getUnorderedGroup()); 

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


    // $ANTLR start "entryRuleExtendedParameter"
    // InternalPipelineParser.g:120:1: entryRuleExtendedParameter : ruleExtendedParameter EOF ;
    public final void entryRuleExtendedParameter() throws RecognitionException {
        try {
            // InternalPipelineParser.g:121:1: ( ruleExtendedParameter EOF )
            // InternalPipelineParser.g:122:1: ruleExtendedParameter EOF
            {
             before(grammarAccess.getExtendedParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleExtendedParameter();

            state._fsp--;

             after(grammarAccess.getExtendedParameterRule()); 
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
    // $ANTLR end "entryRuleExtendedParameter"


    // $ANTLR start "ruleExtendedParameter"
    // InternalPipelineParser.g:129:1: ruleExtendedParameter : ( ( rule__ExtendedParameter__Alternatives ) ) ;
    public final void ruleExtendedParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:133:2: ( ( ( rule__ExtendedParameter__Alternatives ) ) )
            // InternalPipelineParser.g:134:2: ( ( rule__ExtendedParameter__Alternatives ) )
            {
            // InternalPipelineParser.g:134:2: ( ( rule__ExtendedParameter__Alternatives ) )
            // InternalPipelineParser.g:135:3: ( rule__ExtendedParameter__Alternatives )
            {
             before(grammarAccess.getExtendedParameterAccess().getAlternatives()); 
            // InternalPipelineParser.g:136:3: ( rule__ExtendedParameter__Alternatives )
            // InternalPipelineParser.g:136:4: rule__ExtendedParameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExtendedParameterAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExtendedParameter"


    // $ANTLR start "entryRuleVariable"
    // InternalPipelineParser.g:145:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalPipelineParser.g:146:1: ( ruleVariable EOF )
            // InternalPipelineParser.g:147:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalPipelineParser.g:154:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:158:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalPipelineParser.g:159:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalPipelineParser.g:159:2: ( ( rule__Variable__Alternatives ) )
            // InternalPipelineParser.g:160:3: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // InternalPipelineParser.g:161:3: ( rule__Variable__Alternatives )
            // InternalPipelineParser.g:161:4: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleResource"
    // InternalPipelineParser.g:170:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalPipelineParser.g:171:1: ( ruleResource EOF )
            // InternalPipelineParser.g:172:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalPipelineParser.g:179:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:183:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalPipelineParser.g:184:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalPipelineParser.g:184:2: ( ( rule__Resource__Group__0 ) )
            // InternalPipelineParser.g:185:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalPipelineParser.g:186:3: ( rule__Resource__Group__0 )
            // InternalPipelineParser.g:186:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRulePipelineParameter"
    // InternalPipelineParser.g:195:1: entryRulePipelineParameter : rulePipelineParameter EOF ;
    public final void entryRulePipelineParameter() throws RecognitionException {
        try {
            // InternalPipelineParser.g:196:1: ( rulePipelineParameter EOF )
            // InternalPipelineParser.g:197:1: rulePipelineParameter EOF
            {
             before(grammarAccess.getPipelineParameterRule()); 
            pushFollow(FOLLOW_1);
            rulePipelineParameter();

            state._fsp--;

             after(grammarAccess.getPipelineParameterRule()); 
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
    // $ANTLR end "entryRulePipelineParameter"


    // $ANTLR start "rulePipelineParameter"
    // InternalPipelineParser.g:204:1: rulePipelineParameter : ( ( rule__PipelineParameter__Group__0 ) ) ;
    public final void rulePipelineParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:208:2: ( ( ( rule__PipelineParameter__Group__0 ) ) )
            // InternalPipelineParser.g:209:2: ( ( rule__PipelineParameter__Group__0 ) )
            {
            // InternalPipelineParser.g:209:2: ( ( rule__PipelineParameter__Group__0 ) )
            // InternalPipelineParser.g:210:3: ( rule__PipelineParameter__Group__0 )
            {
             before(grammarAccess.getPipelineParameterAccess().getGroup()); 
            // InternalPipelineParser.g:211:3: ( rule__PipelineParameter__Group__0 )
            // InternalPipelineParser.g:211:4: rule__PipelineParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PipelineParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineParameterAccess().getGroup()); 

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
    // $ANTLR end "rulePipelineParameter"


    // $ANTLR start "entryRuleParameterValue"
    // InternalPipelineParser.g:220:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalPipelineParser.g:221:1: ( ruleParameterValue EOF )
            // InternalPipelineParser.g:222:1: ruleParameterValue EOF
            {
             before(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterValueRule()); 
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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalPipelineParser.g:229:1: ruleParameterValue : ( ( rule__ParameterValue__Group__0 ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:233:2: ( ( ( rule__ParameterValue__Group__0 ) ) )
            // InternalPipelineParser.g:234:2: ( ( rule__ParameterValue__Group__0 ) )
            {
            // InternalPipelineParser.g:234:2: ( ( rule__ParameterValue__Group__0 ) )
            // InternalPipelineParser.g:235:3: ( rule__ParameterValue__Group__0 )
            {
             before(grammarAccess.getParameterValueAccess().getGroup()); 
            // InternalPipelineParser.g:236:3: ( rule__ParameterValue__Group__0 )
            // InternalPipelineParser.g:236:4: rule__ParameterValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getGroup()); 

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
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleAnyData"
    // InternalPipelineParser.g:245:1: entryRuleAnyData : ruleAnyData EOF ;
    public final void entryRuleAnyData() throws RecognitionException {
        try {
            // InternalPipelineParser.g:246:1: ( ruleAnyData EOF )
            // InternalPipelineParser.g:247:1: ruleAnyData EOF
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
    // InternalPipelineParser.g:254:1: ruleAnyData : ( ( rule__AnyData__Alternatives ) ) ;
    public final void ruleAnyData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:258:2: ( ( ( rule__AnyData__Alternatives ) ) )
            // InternalPipelineParser.g:259:2: ( ( rule__AnyData__Alternatives ) )
            {
            // InternalPipelineParser.g:259:2: ( ( rule__AnyData__Alternatives ) )
            // InternalPipelineParser.g:260:3: ( rule__AnyData__Alternatives )
            {
             before(grammarAccess.getAnyDataAccess().getAlternatives()); 
            // InternalPipelineParser.g:261:3: ( rule__AnyData__Alternatives )
            // InternalPipelineParser.g:261:4: rule__AnyData__Alternatives
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


    // $ANTLR start "entryRuleKeyValue"
    // InternalPipelineParser.g:270:1: entryRuleKeyValue : ruleKeyValue EOF ;
    public final void entryRuleKeyValue() throws RecognitionException {
        try {
            // InternalPipelineParser.g:271:1: ( ruleKeyValue EOF )
            // InternalPipelineParser.g:272:1: ruleKeyValue EOF
            {
             before(grammarAccess.getKeyValueRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyValue();

            state._fsp--;

             after(grammarAccess.getKeyValueRule()); 
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
    // $ANTLR end "entryRuleKeyValue"


    // $ANTLR start "ruleKeyValue"
    // InternalPipelineParser.g:279:1: ruleKeyValue : ( ( rule__KeyValue__Group__0 ) ) ;
    public final void ruleKeyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:283:2: ( ( ( rule__KeyValue__Group__0 ) ) )
            // InternalPipelineParser.g:284:2: ( ( rule__KeyValue__Group__0 ) )
            {
            // InternalPipelineParser.g:284:2: ( ( rule__KeyValue__Group__0 ) )
            // InternalPipelineParser.g:285:3: ( rule__KeyValue__Group__0 )
            {
             before(grammarAccess.getKeyValueAccess().getGroup()); 
            // InternalPipelineParser.g:286:3: ( rule__KeyValue__Group__0 )
            // InternalPipelineParser.g:286:4: rule__KeyValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueAccess().getGroup()); 

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
    // $ANTLR end "ruleKeyValue"


    // $ANTLR start "entryRuleIndPermissionValue"
    // InternalPipelineParser.g:295:1: entryRuleIndPermissionValue : ruleIndPermissionValue EOF ;
    public final void entryRuleIndPermissionValue() throws RecognitionException {
        try {
            // InternalPipelineParser.g:296:1: ( ruleIndPermissionValue EOF )
            // InternalPipelineParser.g:297:1: ruleIndPermissionValue EOF
            {
             before(grammarAccess.getIndPermissionValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIndPermissionValue();

            state._fsp--;

             after(grammarAccess.getIndPermissionValueRule()); 
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
    // $ANTLR end "entryRuleIndPermissionValue"


    // $ANTLR start "ruleIndPermissionValue"
    // InternalPipelineParser.g:304:1: ruleIndPermissionValue : ( ( rule__IndPermissionValue__Group__0 ) ) ;
    public final void ruleIndPermissionValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:308:2: ( ( ( rule__IndPermissionValue__Group__0 ) ) )
            // InternalPipelineParser.g:309:2: ( ( rule__IndPermissionValue__Group__0 ) )
            {
            // InternalPipelineParser.g:309:2: ( ( rule__IndPermissionValue__Group__0 ) )
            // InternalPipelineParser.g:310:3: ( rule__IndPermissionValue__Group__0 )
            {
             before(grammarAccess.getIndPermissionValueAccess().getGroup()); 
            // InternalPipelineParser.g:311:3: ( rule__IndPermissionValue__Group__0 )
            // InternalPipelineParser.g:311:4: rule__IndPermissionValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndPermissionValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndPermissionValueAccess().getGroup()); 

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
    // $ANTLR end "ruleIndPermissionValue"


    // $ANTLR start "entryRuleUnquotedString"
    // InternalPipelineParser.g:320:1: entryRuleUnquotedString : ruleUnquotedString EOF ;
    public final void entryRuleUnquotedString() throws RecognitionException {
        try {
            // InternalPipelineParser.g:321:1: ( ruleUnquotedString EOF )
            // InternalPipelineParser.g:322:1: ruleUnquotedString EOF
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
    // InternalPipelineParser.g:329:1: ruleUnquotedString : ( ( rule__UnquotedString__Group__0 ) ) ;
    public final void ruleUnquotedString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:333:2: ( ( ( rule__UnquotedString__Group__0 ) ) )
            // InternalPipelineParser.g:334:2: ( ( rule__UnquotedString__Group__0 ) )
            {
            // InternalPipelineParser.g:334:2: ( ( rule__UnquotedString__Group__0 ) )
            // InternalPipelineParser.g:335:3: ( rule__UnquotedString__Group__0 )
            {
             before(grammarAccess.getUnquotedStringAccess().getGroup()); 
            // InternalPipelineParser.g:336:3: ( rule__UnquotedString__Group__0 )
            // InternalPipelineParser.g:336:4: rule__UnquotedString__Group__0
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


    // $ANTLR start "entryRuleHyphenValues"
    // InternalPipelineParser.g:345:1: entryRuleHyphenValues : ruleHyphenValues EOF ;
    public final void entryRuleHyphenValues() throws RecognitionException {
        try {
            // InternalPipelineParser.g:346:1: ( ruleHyphenValues EOF )
            // InternalPipelineParser.g:347:1: ruleHyphenValues EOF
            {
             before(grammarAccess.getHyphenValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleHyphenValues();

            state._fsp--;

             after(grammarAccess.getHyphenValuesRule()); 
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
    // $ANTLR end "entryRuleHyphenValues"


    // $ANTLR start "ruleHyphenValues"
    // InternalPipelineParser.g:354:1: ruleHyphenValues : ( ( rule__HyphenValues__Alternatives ) ) ;
    public final void ruleHyphenValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:358:2: ( ( ( rule__HyphenValues__Alternatives ) ) )
            // InternalPipelineParser.g:359:2: ( ( rule__HyphenValues__Alternatives ) )
            {
            // InternalPipelineParser.g:359:2: ( ( rule__HyphenValues__Alternatives ) )
            // InternalPipelineParser.g:360:3: ( rule__HyphenValues__Alternatives )
            {
             before(grammarAccess.getHyphenValuesAccess().getAlternatives()); 
            // InternalPipelineParser.g:361:3: ( rule__HyphenValues__Alternatives )
            // InternalPipelineParser.g:361:4: rule__HyphenValues__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HyphenValues__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHyphenValuesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHyphenValues"


    // $ANTLR start "entryRuleNumber"
    // InternalPipelineParser.g:370:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalPipelineParser.g:371:1: ( ruleNumber EOF )
            // InternalPipelineParser.g:372:1: ruleNumber EOF
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
    // InternalPipelineParser.g:379:1: ruleNumber : ( RULE_INT ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:383:2: ( ( RULE_INT ) )
            // InternalPipelineParser.g:384:2: ( RULE_INT )
            {
            // InternalPipelineParser.g:384:2: ( RULE_INT )
            // InternalPipelineParser.g:385:3: RULE_INT
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
    // InternalPipelineParser.g:395:1: entryRuleFloatingPoint : ruleFloatingPoint EOF ;
    public final void entryRuleFloatingPoint() throws RecognitionException {
        try {
            // InternalPipelineParser.g:396:1: ( ruleFloatingPoint EOF )
            // InternalPipelineParser.g:397:1: ruleFloatingPoint EOF
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
    // InternalPipelineParser.g:404:1: ruleFloatingPoint : ( RULE_FLOAT_LITERAL ) ;
    public final void ruleFloatingPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:408:2: ( ( RULE_FLOAT_LITERAL ) )
            // InternalPipelineParser.g:409:2: ( RULE_FLOAT_LITERAL )
            {
            // InternalPipelineParser.g:409:2: ( RULE_FLOAT_LITERAL )
            // InternalPipelineParser.g:410:3: RULE_FLOAT_LITERAL
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
    // InternalPipelineParser.g:420:1: entryRuleSimpleWord : ruleSimpleWord EOF ;
    public final void entryRuleSimpleWord() throws RecognitionException {
        try {
            // InternalPipelineParser.g:421:1: ( ruleSimpleWord EOF )
            // InternalPipelineParser.g:422:1: ruleSimpleWord EOF
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
    // InternalPipelineParser.g:429:1: ruleSimpleWord : ( RULE_ID ) ;
    public final void ruleSimpleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:433:2: ( ( RULE_ID ) )
            // InternalPipelineParser.g:434:2: ( RULE_ID )
            {
            // InternalPipelineParser.g:434:2: ( RULE_ID )
            // InternalPipelineParser.g:435:3: RULE_ID
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
    // InternalPipelineParser.g:445:1: entryRuleArrayList : ruleArrayList EOF ;
    public final void entryRuleArrayList() throws RecognitionException {
        try {
            // InternalPipelineParser.g:446:1: ( ruleArrayList EOF )
            // InternalPipelineParser.g:447:1: ruleArrayList EOF
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
    // InternalPipelineParser.g:454:1: ruleArrayList : ( ( rule__ArrayList__Group__0 ) ) ;
    public final void ruleArrayList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:458:2: ( ( ( rule__ArrayList__Group__0 ) ) )
            // InternalPipelineParser.g:459:2: ( ( rule__ArrayList__Group__0 ) )
            {
            // InternalPipelineParser.g:459:2: ( ( rule__ArrayList__Group__0 ) )
            // InternalPipelineParser.g:460:3: ( rule__ArrayList__Group__0 )
            {
             before(grammarAccess.getArrayListAccess().getGroup()); 
            // InternalPipelineParser.g:461:3: ( rule__ArrayList__Group__0 )
            // InternalPipelineParser.g:461:4: rule__ArrayList__Group__0
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


    // $ANTLR start "rulePermission"
    // InternalPipelineParser.g:470:1: rulePermission : ( ( rule__Permission__Alternatives ) ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:474:1: ( ( ( rule__Permission__Alternatives ) ) )
            // InternalPipelineParser.g:475:2: ( ( rule__Permission__Alternatives ) )
            {
            // InternalPipelineParser.g:475:2: ( ( rule__Permission__Alternatives ) )
            // InternalPipelineParser.g:476:3: ( rule__Permission__Alternatives )
            {
             before(grammarAccess.getPermissionAccess().getAlternatives()); 
            // InternalPipelineParser.g:477:3: ( rule__Permission__Alternatives )
            // InternalPipelineParser.g:477:4: rule__Permission__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Permission__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePermission"


    // $ANTLR start "rule__Pipeline__Alternatives_4_1"
    // InternalPipelineParser.g:485:1: rule__Pipeline__Alternatives_4_1 : ( ( ( rule__Pipeline__AllPermissionAssignment_4_1_0 ) ) | ( ( rule__Pipeline__Group_4_1_1__0 ) ) );
    public final void rule__Pipeline__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:489:1: ( ( ( rule__Pipeline__AllPermissionAssignment_4_1_0 ) ) | ( ( rule__Pipeline__Group_4_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==WriteAll||LA1_0==ReadAll||LA1_0==Write||(LA1_0>=None && LA1_0<=Read)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_BEGIN) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPipelineParser.g:490:2: ( ( rule__Pipeline__AllPermissionAssignment_4_1_0 ) )
                    {
                    // InternalPipelineParser.g:490:2: ( ( rule__Pipeline__AllPermissionAssignment_4_1_0 ) )
                    // InternalPipelineParser.g:491:3: ( rule__Pipeline__AllPermissionAssignment_4_1_0 )
                    {
                     before(grammarAccess.getPipelineAccess().getAllPermissionAssignment_4_1_0()); 
                    // InternalPipelineParser.g:492:3: ( rule__Pipeline__AllPermissionAssignment_4_1_0 )
                    // InternalPipelineParser.g:492:4: rule__Pipeline__AllPermissionAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__AllPermissionAssignment_4_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getAllPermissionAssignment_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:496:2: ( ( rule__Pipeline__Group_4_1_1__0 ) )
                    {
                    // InternalPipelineParser.g:496:2: ( ( rule__Pipeline__Group_4_1_1__0 ) )
                    // InternalPipelineParser.g:497:3: ( rule__Pipeline__Group_4_1_1__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_4_1_1()); 
                    // InternalPipelineParser.g:498:3: ( rule__Pipeline__Group_4_1_1__0 )
                    // InternalPipelineParser.g:498:4: rule__Pipeline__Group_4_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_4_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_4_1_1()); 

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
    // $ANTLR end "rule__Pipeline__Alternatives_4_1"


    // $ANTLR start "rule__Pipeline__GroupAlternatives_5_1_1_1_0"
    // InternalPipelineParser.g:506:1: rule__Pipeline__GroupAlternatives_5_1_1_1_0 : ( ( RULE_ID ) | ( RULE_COMPLEX_EXPRESSION ) );
    public final void rule__Pipeline__GroupAlternatives_5_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:510:1: ( ( RULE_ID ) | ( RULE_COMPLEX_EXPRESSION ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_COMPLEX_EXPRESSION) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPipelineParser.g:511:2: ( RULE_ID )
                    {
                    // InternalPipelineParser.g:511:2: ( RULE_ID )
                    // InternalPipelineParser.g:512:3: RULE_ID
                    {
                     before(grammarAccess.getPipelineAccess().getGroupIDTerminalRuleCall_5_1_1_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getPipelineAccess().getGroupIDTerminalRuleCall_5_1_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:517:2: ( RULE_COMPLEX_EXPRESSION )
                    {
                    // InternalPipelineParser.g:517:2: ( RULE_COMPLEX_EXPRESSION )
                    // InternalPipelineParser.g:518:3: RULE_COMPLEX_EXPRESSION
                    {
                     before(grammarAccess.getPipelineAccess().getGroupCOMPLEX_EXPRESSIONTerminalRuleCall_5_1_1_1_0_1()); 
                    match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_2); 
                     after(grammarAccess.getPipelineAccess().getGroupCOMPLEX_EXPRESSIONTerminalRuleCall_5_1_1_1_0_1()); 

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
    // $ANTLR end "rule__Pipeline__GroupAlternatives_5_1_1_1_0"


    // $ANTLR start "rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0"
    // InternalPipelineParser.g:527:1: rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0 : ( ( RULE_ID ) | ( RULE_COMPLEX_EXPRESSION ) );
    public final void rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:531:1: ( ( RULE_ID ) | ( RULE_COMPLEX_EXPRESSION ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_COMPLEX_EXPRESSION) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPipelineParser.g:532:2: ( RULE_ID )
                    {
                    // InternalPipelineParser.g:532:2: ( RULE_ID )
                    // InternalPipelineParser.g:533:3: RULE_ID
                    {
                     before(grammarAccess.getPipelineAccess().getCancelConcurrenceIDTerminalRuleCall_5_1_2_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getPipelineAccess().getCancelConcurrenceIDTerminalRuleCall_5_1_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:538:2: ( RULE_COMPLEX_EXPRESSION )
                    {
                    // InternalPipelineParser.g:538:2: ( RULE_COMPLEX_EXPRESSION )
                    // InternalPipelineParser.g:539:3: RULE_COMPLEX_EXPRESSION
                    {
                     before(grammarAccess.getPipelineAccess().getCancelConcurrenceCOMPLEX_EXPRESSIONTerminalRuleCall_5_1_2_1_0_1()); 
                    match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_2); 
                     after(grammarAccess.getPipelineAccess().getCancelConcurrenceCOMPLEX_EXPRESSIONTerminalRuleCall_5_1_2_1_0_1()); 

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
    // $ANTLR end "rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0"


    // $ANTLR start "rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0"
    // InternalPipelineParser.g:548:1: rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:552:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPipelineParser.g:553:2: ( RULE_ID )
                    {
                    // InternalPipelineParser.g:553:2: ( RULE_ID )
                    // InternalPipelineParser.g:554:3: RULE_ID
                    {
                     before(grammarAccess.getPipelineAccess().getVmImageIDTerminalRuleCall_7_1_0_2_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getPipelineAccess().getVmImageIDTerminalRuleCall_7_1_0_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:559:2: ( RULE_STRING )
                    {
                    // InternalPipelineParser.g:559:2: ( RULE_STRING )
                    // InternalPipelineParser.g:560:3: RULE_STRING
                    {
                     before(grammarAccess.getPipelineAccess().getVmImageSTRINGTerminalRuleCall_7_1_0_2_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getPipelineAccess().getVmImageSTRINGTerminalRuleCall_7_1_0_2_1_0_1()); 

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
    // $ANTLR end "rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0"


    // $ANTLR start "rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0"
    // InternalPipelineParser.g:569:1: rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0 : ( ( ruleAnyData ) | ( ruleHyphenValues ) );
    public final void rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:573:1: ( ( ruleAnyData ) | ( ruleHyphenValues ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_COMPLEX_EXPRESSION && LA5_0<=RULE_VERSION)||LA5_0==RULE_ID||LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==HyphenMinus||LA5_0==RULE_BEGIN) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPipelineParser.g:574:2: ( ruleAnyData )
                    {
                    // InternalPipelineParser.g:574:2: ( ruleAnyData )
                    // InternalPipelineParser.g:575:3: ruleAnyData
                    {
                     before(grammarAccess.getPipelineAccess().getVmDemandsAnyDataParserRuleCall_7_1_1_0_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAnyData();

                    state._fsp--;

                     after(grammarAccess.getPipelineAccess().getVmDemandsAnyDataParserRuleCall_7_1_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:580:2: ( ruleHyphenValues )
                    {
                    // InternalPipelineParser.g:580:2: ( ruleHyphenValues )
                    // InternalPipelineParser.g:581:3: ruleHyphenValues
                    {
                     before(grammarAccess.getPipelineAccess().getVmDemandsHyphenValuesParserRuleCall_7_1_1_0_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHyphenValues();

                    state._fsp--;

                     after(grammarAccess.getPipelineAccess().getVmDemandsHyphenValuesParserRuleCall_7_1_1_0_1_0_1()); 

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
    // $ANTLR end "rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0"


    // $ANTLR start "rule__ExtendedParameter__Alternatives"
    // InternalPipelineParser.g:590:1: rule__ExtendedParameter__Alternatives : ( ( ( rule__ExtendedParameter__Group_0__0 ) ) | ( ( rule__ExtendedParameter__Group_1__0 ) ) );
    public final void rule__ExtendedParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:594:1: ( ( ( rule__ExtendedParameter__Group_0__0 ) ) | ( ( rule__ExtendedParameter__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Extends) ) {
                alt6=1;
            }
            else if ( (LA6_0==Include) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPipelineParser.g:595:2: ( ( rule__ExtendedParameter__Group_0__0 ) )
                    {
                    // InternalPipelineParser.g:595:2: ( ( rule__ExtendedParameter__Group_0__0 ) )
                    // InternalPipelineParser.g:596:3: ( rule__ExtendedParameter__Group_0__0 )
                    {
                     before(grammarAccess.getExtendedParameterAccess().getGroup_0()); 
                    // InternalPipelineParser.g:597:3: ( rule__ExtendedParameter__Group_0__0 )
                    // InternalPipelineParser.g:597:4: rule__ExtendedParameter__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtendedParameter__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendedParameterAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:601:2: ( ( rule__ExtendedParameter__Group_1__0 ) )
                    {
                    // InternalPipelineParser.g:601:2: ( ( rule__ExtendedParameter__Group_1__0 ) )
                    // InternalPipelineParser.g:602:3: ( rule__ExtendedParameter__Group_1__0 )
                    {
                     before(grammarAccess.getExtendedParameterAccess().getGroup_1()); 
                    // InternalPipelineParser.g:603:3: ( rule__ExtendedParameter__Group_1__0 )
                    // InternalPipelineParser.g:603:4: rule__ExtendedParameter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtendedParameter__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendedParameterAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExtendedParameter__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalPipelineParser.g:611:1: rule__Variable__Alternatives : ( ( ( rule__Variable__Group_0__0 ) ) | ( ( rule__Variable__Group_1__0 ) ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:615:1: ( ( ( rule__Variable__Group_0__0 ) ) | ( ( rule__Variable__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BEGIN) ) {
                alt7=1;
            }
            else if ( (LA7_0==HyphenMinus) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPipelineParser.g:616:2: ( ( rule__Variable__Group_0__0 ) )
                    {
                    // InternalPipelineParser.g:616:2: ( ( rule__Variable__Group_0__0 ) )
                    // InternalPipelineParser.g:617:3: ( rule__Variable__Group_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_0()); 
                    // InternalPipelineParser.g:618:3: ( rule__Variable__Group_0__0 )
                    // InternalPipelineParser.g:618:4: rule__Variable__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:622:2: ( ( rule__Variable__Group_1__0 ) )
                    {
                    // InternalPipelineParser.g:622:2: ( ( rule__Variable__Group_1__0 ) )
                    // InternalPipelineParser.g:623:3: ( rule__Variable__Group_1__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1()); 
                    // InternalPipelineParser.g:624:3: ( rule__Variable__Group_1__0 )
                    // InternalPipelineParser.g:624:4: rule__Variable__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__Resource__ResourceNameAlternatives_0_0"
    // InternalPipelineParser.g:632:1: rule__Resource__ResourceNameAlternatives_0_0 : ( ( Builds ) | ( Containers ) | ( Pipelines ) | ( Repositories ) | ( Webhooks ) | ( Packages ) );
    public final void rule__Resource__ResourceNameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:636:1: ( ( Builds ) | ( Containers ) | ( Pipelines ) | ( Repositories ) | ( Webhooks ) | ( Packages ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case Builds:
                {
                alt8=1;
                }
                break;
            case Containers:
                {
                alt8=2;
                }
                break;
            case Pipelines:
                {
                alt8=3;
                }
                break;
            case Repositories:
                {
                alt8=4;
                }
                break;
            case Webhooks:
                {
                alt8=5;
                }
                break;
            case Packages:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPipelineParser.g:637:2: ( Builds )
                    {
                    // InternalPipelineParser.g:637:2: ( Builds )
                    // InternalPipelineParser.g:638:3: Builds
                    {
                     before(grammarAccess.getResourceAccess().getResourceNameBuildsKeyword_0_0_0()); 
                    match(input,Builds,FOLLOW_2); 
                     after(grammarAccess.getResourceAccess().getResourceNameBuildsKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:643:2: ( Containers )
                    {
                    // InternalPipelineParser.g:643:2: ( Containers )
                    // InternalPipelineParser.g:644:3: Containers
                    {
                     before(grammarAccess.getResourceAccess().getResourceNameContainersKeyword_0_0_1()); 
                    match(input,Containers,FOLLOW_2); 
                     after(grammarAccess.getResourceAccess().getResourceNameContainersKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:649:2: ( Pipelines )
                    {
                    // InternalPipelineParser.g:649:2: ( Pipelines )
                    // InternalPipelineParser.g:650:3: Pipelines
                    {
                     before(grammarAccess.getResourceAccess().getResourceNamePipelinesKeyword_0_0_2()); 
                    match(input,Pipelines,FOLLOW_2); 
                     after(grammarAccess.getResourceAccess().getResourceNamePipelinesKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:655:2: ( Repositories )
                    {
                    // InternalPipelineParser.g:655:2: ( Repositories )
                    // InternalPipelineParser.g:656:3: Repositories
                    {
                     before(grammarAccess.getResourceAccess().getResourceNameRepositoriesKeyword_0_0_3()); 
                    match(input,Repositories,FOLLOW_2); 
                     after(grammarAccess.getResourceAccess().getResourceNameRepositoriesKeyword_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:661:2: ( Webhooks )
                    {
                    // InternalPipelineParser.g:661:2: ( Webhooks )
                    // InternalPipelineParser.g:662:3: Webhooks
                    {
                     before(grammarAccess.getResourceAccess().getResourceNameWebhooksKeyword_0_0_4()); 
                    match(input,Webhooks,FOLLOW_2); 
                     after(grammarAccess.getResourceAccess().getResourceNameWebhooksKeyword_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:667:2: ( Packages )
                    {
                    // InternalPipelineParser.g:667:2: ( Packages )
                    // InternalPipelineParser.g:668:3: Packages
                    {
                     before(grammarAccess.getResourceAccess().getResourceNamePackagesKeyword_0_0_5()); 
                    match(input,Packages,FOLLOW_2); 
                     after(grammarAccess.getResourceAccess().getResourceNamePackagesKeyword_0_0_5()); 

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
    // $ANTLR end "rule__Resource__ResourceNameAlternatives_0_0"


    // $ANTLR start "rule__Resource__Alternatives_1"
    // InternalPipelineParser.g:677:1: rule__Resource__Alternatives_1 : ( ( ( rule__Resource__Group_1_0__0 )* ) | ( ( rule__Resource__Group_1_1__0 ) ) );
    public final void rule__Resource__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:681:1: ( ( ( rule__Resource__Group_1_0__0 )* ) | ( ( rule__Resource__Group_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EOF||LA10_0==Repositories||LA10_0==Containers||LA10_0==Pipelines||LA10_0==Packages||LA10_0==Webhooks||LA10_0==Builds||LA10_0==HyphenMinus||LA10_0==RULE_END) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_BEGIN) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPipelineParser.g:682:2: ( ( rule__Resource__Group_1_0__0 )* )
                    {
                    // InternalPipelineParser.g:682:2: ( ( rule__Resource__Group_1_0__0 )* )
                    // InternalPipelineParser.g:683:3: ( rule__Resource__Group_1_0__0 )*
                    {
                     before(grammarAccess.getResourceAccess().getGroup_1_0()); 
                    // InternalPipelineParser.g:684:3: ( rule__Resource__Group_1_0__0 )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==HyphenMinus) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPipelineParser.g:684:4: rule__Resource__Group_1_0__0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Resource__Group_1_0__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                     after(grammarAccess.getResourceAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:688:2: ( ( rule__Resource__Group_1_1__0 ) )
                    {
                    // InternalPipelineParser.g:688:2: ( ( rule__Resource__Group_1_1__0 ) )
                    // InternalPipelineParser.g:689:3: ( rule__Resource__Group_1_1__0 )
                    {
                     before(grammarAccess.getResourceAccess().getGroup_1_1()); 
                    // InternalPipelineParser.g:690:3: ( rule__Resource__Group_1_1__0 )
                    // InternalPipelineParser.g:690:4: rule__Resource__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResourceAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Resource__Alternatives_1"


    // $ANTLR start "rule__ParameterValue__Alternatives_1"
    // InternalPipelineParser.g:698:1: rule__ParameterValue__Alternatives_1 : ( ( ( rule__ParameterValue__NameAssignment_1_0 ) ) | ( ( rule__ParameterValue__PreDefinedKeywordAssignment_1_1 ) ) );
    public final void rule__ParameterValue__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:702:1: ( ( ( rule__ParameterValue__NameAssignment_1_0 ) ) | ( ( rule__ParameterValue__PreDefinedKeywordAssignment_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMPLEX_EXPRESSION||LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==WriteAll||LA11_0==ReadAll||LA11_0==Write||(LA11_0>=None && LA11_0<=Read)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPipelineParser.g:703:2: ( ( rule__ParameterValue__NameAssignment_1_0 ) )
                    {
                    // InternalPipelineParser.g:703:2: ( ( rule__ParameterValue__NameAssignment_1_0 ) )
                    // InternalPipelineParser.g:704:3: ( rule__ParameterValue__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getNameAssignment_1_0()); 
                    // InternalPipelineParser.g:705:3: ( rule__ParameterValue__NameAssignment_1_0 )
                    // InternalPipelineParser.g:705:4: rule__ParameterValue__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:709:2: ( ( rule__ParameterValue__PreDefinedKeywordAssignment_1_1 ) )
                    {
                    // InternalPipelineParser.g:709:2: ( ( rule__ParameterValue__PreDefinedKeywordAssignment_1_1 ) )
                    // InternalPipelineParser.g:710:3: ( rule__ParameterValue__PreDefinedKeywordAssignment_1_1 )
                    {
                     before(grammarAccess.getParameterValueAccess().getPreDefinedKeywordAssignment_1_1()); 
                    // InternalPipelineParser.g:711:3: ( rule__ParameterValue__PreDefinedKeywordAssignment_1_1 )
                    // InternalPipelineParser.g:711:4: rule__ParameterValue__PreDefinedKeywordAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__PreDefinedKeywordAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getPreDefinedKeywordAssignment_1_1()); 

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
    // $ANTLR end "rule__ParameterValue__Alternatives_1"


    // $ANTLR start "rule__ParameterValue__NameAlternatives_1_0_0"
    // InternalPipelineParser.g:719:1: rule__ParameterValue__NameAlternatives_1_0_0 : ( ( RULE_ID ) | ( RULE_COMPLEX_EXPRESSION ) );
    public final void rule__ParameterValue__NameAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:723:1: ( ( RULE_ID ) | ( RULE_COMPLEX_EXPRESSION ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_COMPLEX_EXPRESSION) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPipelineParser.g:724:2: ( RULE_ID )
                    {
                    // InternalPipelineParser.g:724:2: ( RULE_ID )
                    // InternalPipelineParser.g:725:3: RULE_ID
                    {
                     before(grammarAccess.getParameterValueAccess().getNameIDTerminalRuleCall_1_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getParameterValueAccess().getNameIDTerminalRuleCall_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:730:2: ( RULE_COMPLEX_EXPRESSION )
                    {
                    // InternalPipelineParser.g:730:2: ( RULE_COMPLEX_EXPRESSION )
                    // InternalPipelineParser.g:731:3: RULE_COMPLEX_EXPRESSION
                    {
                     before(grammarAccess.getParameterValueAccess().getNameCOMPLEX_EXPRESSIONTerminalRuleCall_1_0_0_1()); 
                    match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_2); 
                     after(grammarAccess.getParameterValueAccess().getNameCOMPLEX_EXPRESSIONTerminalRuleCall_1_0_0_1()); 

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
    // $ANTLR end "rule__ParameterValue__NameAlternatives_1_0_0"


    // $ANTLR start "rule__ParameterValue__Alternatives_4"
    // InternalPipelineParser.g:740:1: rule__ParameterValue__Alternatives_4 : ( ( ( rule__ParameterValue__Group_4_0__0 ) ) | ( ( rule__ParameterValue__Group_4_1__0 ) ) );
    public final void rule__ParameterValue__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:744:1: ( ( ( rule__ParameterValue__Group_4_0__0 ) ) | ( ( rule__ParameterValue__Group_4_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_BEGIN) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==HyphenMinus) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA13_5 = input.LA(4);

                        if ( (LA13_5==Colon) ) {
                            alt13=1;
                        }
                        else if ( (LA13_5==HyphenMinus||LA13_5==RULE_END) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_COMPLEX_EXPRESSION:
                        {
                        int LA13_6 = input.LA(4);

                        if ( (LA13_6==HyphenMinus||LA13_6==RULE_END) ) {
                            alt13=2;
                        }
                        else if ( (LA13_6==Colon) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 6, input);

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
                        alt13=1;
                        }
                        break;
                    case RULE_HEX_INT:
                    case RULE_INT:
                    case RULE_FLOAT_LITERAL:
                    case RULE_VERSION:
                    case RULE_STRING:
                        {
                        alt13=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA13_1==WriteAll||LA13_1==ReadAll||LA13_1==Write||(LA13_1>=None && LA13_1<=Read)||LA13_1==RULE_COMPLEX_EXPRESSION||(LA13_1>=RULE_END && LA13_1<=RULE_ID)) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==HyphenMinus||LA13_0==LeftSquareBracket||(LA13_0>=RULE_COMPLEX_EXPRESSION && LA13_0<=RULE_VERSION)||LA13_0==RULE_ID||LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPipelineParser.g:745:2: ( ( rule__ParameterValue__Group_4_0__0 ) )
                    {
                    // InternalPipelineParser.g:745:2: ( ( rule__ParameterValue__Group_4_0__0 ) )
                    // InternalPipelineParser.g:746:3: ( rule__ParameterValue__Group_4_0__0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getGroup_4_0()); 
                    // InternalPipelineParser.g:747:3: ( rule__ParameterValue__Group_4_0__0 )
                    // InternalPipelineParser.g:747:4: rule__ParameterValue__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:751:2: ( ( rule__ParameterValue__Group_4_1__0 ) )
                    {
                    // InternalPipelineParser.g:751:2: ( ( rule__ParameterValue__Group_4_1__0 ) )
                    // InternalPipelineParser.g:752:3: ( rule__ParameterValue__Group_4_1__0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getGroup_4_1()); 
                    // InternalPipelineParser.g:753:3: ( rule__ParameterValue__Group_4_1__0 )
                    // InternalPipelineParser.g:753:4: rule__ParameterValue__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__ParameterValue__Alternatives_4"


    // $ANTLR start "rule__ParameterValue__ValueAlternatives_4_1_0_0"
    // InternalPipelineParser.g:761:1: rule__ParameterValue__ValueAlternatives_4_1_0_0 : ( ( ruleAnyData ) | ( ruleArrayList ) | ( ruleHyphenValues ) );
    public final void rule__ParameterValue__ValueAlternatives_4_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:765:1: ( ( ruleAnyData ) | ( ruleArrayList ) | ( ruleHyphenValues ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_COMPLEX_EXPRESSION:
            case RULE_HEX_INT:
            case RULE_INT:
            case RULE_FLOAT_LITERAL:
            case RULE_VERSION:
            case RULE_ID:
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt14=2;
                }
                break;
            case HyphenMinus:
            case RULE_BEGIN:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalPipelineParser.g:766:2: ( ruleAnyData )
                    {
                    // InternalPipelineParser.g:766:2: ( ruleAnyData )
                    // InternalPipelineParser.g:767:3: ruleAnyData
                    {
                     before(grammarAccess.getParameterValueAccess().getValueAnyDataParserRuleCall_4_1_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAnyData();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getValueAnyDataParserRuleCall_4_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:772:2: ( ruleArrayList )
                    {
                    // InternalPipelineParser.g:772:2: ( ruleArrayList )
                    // InternalPipelineParser.g:773:3: ruleArrayList
                    {
                     before(grammarAccess.getParameterValueAccess().getValueArrayListParserRuleCall_4_1_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayList();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getValueArrayListParserRuleCall_4_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:778:2: ( ruleHyphenValues )
                    {
                    // InternalPipelineParser.g:778:2: ( ruleHyphenValues )
                    // InternalPipelineParser.g:779:3: ruleHyphenValues
                    {
                     before(grammarAccess.getParameterValueAccess().getValueHyphenValuesParserRuleCall_4_1_0_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHyphenValues();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getValueHyphenValuesParserRuleCall_4_1_0_0_2()); 

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
    // $ANTLR end "rule__ParameterValue__ValueAlternatives_4_1_0_0"


    // $ANTLR start "rule__AnyData__Alternatives"
    // InternalPipelineParser.g:788:1: rule__AnyData__Alternatives : ( ( RULE_STRING ) | ( ruleNumber ) | ( ruleFloatingPoint ) | ( ruleSimpleWord ) | ( RULE_COMPLEX_EXPRESSION ) | ( RULE_VERSION ) | ( RULE_HEX_INT ) );
    public final void rule__AnyData__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:792:1: ( ( RULE_STRING ) | ( ruleNumber ) | ( ruleFloatingPoint ) | ( ruleSimpleWord ) | ( RULE_COMPLEX_EXPRESSION ) | ( RULE_VERSION ) | ( RULE_HEX_INT ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case RULE_INT:
                {
                alt15=2;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt15=3;
                }
                break;
            case RULE_ID:
                {
                alt15=4;
                }
                break;
            case RULE_COMPLEX_EXPRESSION:
                {
                alt15=5;
                }
                break;
            case RULE_VERSION:
                {
                alt15=6;
                }
                break;
            case RULE_HEX_INT:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPipelineParser.g:793:2: ( RULE_STRING )
                    {
                    // InternalPipelineParser.g:793:2: ( RULE_STRING )
                    // InternalPipelineParser.g:794:3: RULE_STRING
                    {
                     before(grammarAccess.getAnyDataAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAnyDataAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:799:2: ( ruleNumber )
                    {
                    // InternalPipelineParser.g:799:2: ( ruleNumber )
                    // InternalPipelineParser.g:800:3: ruleNumber
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
                    // InternalPipelineParser.g:805:2: ( ruleFloatingPoint )
                    {
                    // InternalPipelineParser.g:805:2: ( ruleFloatingPoint )
                    // InternalPipelineParser.g:806:3: ruleFloatingPoint
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
                    // InternalPipelineParser.g:811:2: ( ruleSimpleWord )
                    {
                    // InternalPipelineParser.g:811:2: ( ruleSimpleWord )
                    // InternalPipelineParser.g:812:3: ruleSimpleWord
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
                    // InternalPipelineParser.g:817:2: ( RULE_COMPLEX_EXPRESSION )
                    {
                    // InternalPipelineParser.g:817:2: ( RULE_COMPLEX_EXPRESSION )
                    // InternalPipelineParser.g:818:3: RULE_COMPLEX_EXPRESSION
                    {
                     before(grammarAccess.getAnyDataAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_4()); 
                    match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_2); 
                     after(grammarAccess.getAnyDataAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:823:2: ( RULE_VERSION )
                    {
                    // InternalPipelineParser.g:823:2: ( RULE_VERSION )
                    // InternalPipelineParser.g:824:3: RULE_VERSION
                    {
                     before(grammarAccess.getAnyDataAccess().getVERSIONTerminalRuleCall_5()); 
                    match(input,RULE_VERSION,FOLLOW_2); 
                     after(grammarAccess.getAnyDataAccess().getVERSIONTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:829:2: ( RULE_HEX_INT )
                    {
                    // InternalPipelineParser.g:829:2: ( RULE_HEX_INT )
                    // InternalPipelineParser.g:830:3: RULE_HEX_INT
                    {
                     before(grammarAccess.getAnyDataAccess().getHEX_INTTerminalRuleCall_6()); 
                    match(input,RULE_HEX_INT,FOLLOW_2); 
                     after(grammarAccess.getAnyDataAccess().getHEX_INTTerminalRuleCall_6()); 

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


    // $ANTLR start "rule__IndPermissionValue__Alternatives_2"
    // InternalPipelineParser.g:839:1: rule__IndPermissionValue__Alternatives_2 : ( ( Read ) | ( Write ) | ( None ) );
    public final void rule__IndPermissionValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:843:1: ( ( Read ) | ( Write ) | ( None ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case Read:
                {
                alt16=1;
                }
                break;
            case Write:
                {
                alt16=2;
                }
                break;
            case None:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPipelineParser.g:844:2: ( Read )
                    {
                    // InternalPipelineParser.g:844:2: ( Read )
                    // InternalPipelineParser.g:845:3: Read
                    {
                     before(grammarAccess.getIndPermissionValueAccess().getReadKeyword_2_0()); 
                    match(input,Read,FOLLOW_2); 
                     after(grammarAccess.getIndPermissionValueAccess().getReadKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:850:2: ( Write )
                    {
                    // InternalPipelineParser.g:850:2: ( Write )
                    // InternalPipelineParser.g:851:3: Write
                    {
                     before(grammarAccess.getIndPermissionValueAccess().getWriteKeyword_2_1()); 
                    match(input,Write,FOLLOW_2); 
                     after(grammarAccess.getIndPermissionValueAccess().getWriteKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:856:2: ( None )
                    {
                    // InternalPipelineParser.g:856:2: ( None )
                    // InternalPipelineParser.g:857:3: None
                    {
                     before(grammarAccess.getIndPermissionValueAccess().getNoneKeyword_2_2()); 
                    match(input,None,FOLLOW_2); 
                     after(grammarAccess.getIndPermissionValueAccess().getNoneKeyword_2_2()); 

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
    // $ANTLR end "rule__IndPermissionValue__Alternatives_2"


    // $ANTLR start "rule__UnquotedString__Alternatives_1"
    // InternalPipelineParser.g:866:1: rule__UnquotedString__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_COMPLEX_EXPRESSION ) );
    public final void rule__UnquotedString__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:870:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_COMPLEX_EXPRESSION ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case RULE_INT:
                {
                alt17=2;
                }
                break;
            case RULE_COMPLEX_EXPRESSION:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPipelineParser.g:871:2: ( RULE_ID )
                    {
                    // InternalPipelineParser.g:871:2: ( RULE_ID )
                    // InternalPipelineParser.g:872:3: RULE_ID
                    {
                     before(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:877:2: ( RULE_INT )
                    {
                    // InternalPipelineParser.g:877:2: ( RULE_INT )
                    // InternalPipelineParser.g:878:3: RULE_INT
                    {
                     before(grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:883:2: ( RULE_COMPLEX_EXPRESSION )
                    {
                    // InternalPipelineParser.g:883:2: ( RULE_COMPLEX_EXPRESSION )
                    // InternalPipelineParser.g:884:3: RULE_COMPLEX_EXPRESSION
                    {
                     before(grammarAccess.getUnquotedStringAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_1_2()); 
                    match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_2); 
                     after(grammarAccess.getUnquotedStringAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_1_2()); 

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


    // $ANTLR start "rule__HyphenValues__Alternatives"
    // InternalPipelineParser.g:893:1: rule__HyphenValues__Alternatives : ( ( ( ( rule__HyphenValues__Group_0__0 ) ) ( ( rule__HyphenValues__Group_0__0 )* ) ) | ( ( rule__HyphenValues__Group_1__0 ) ) );
    public final void rule__HyphenValues__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:897:1: ( ( ( ( rule__HyphenValues__Group_0__0 ) ) ( ( rule__HyphenValues__Group_0__0 )* ) ) | ( ( rule__HyphenValues__Group_1__0 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==HyphenMinus) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_BEGIN) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPipelineParser.g:898:2: ( ( ( rule__HyphenValues__Group_0__0 ) ) ( ( rule__HyphenValues__Group_0__0 )* ) )
                    {
                    // InternalPipelineParser.g:898:2: ( ( ( rule__HyphenValues__Group_0__0 ) ) ( ( rule__HyphenValues__Group_0__0 )* ) )
                    // InternalPipelineParser.g:899:3: ( ( rule__HyphenValues__Group_0__0 ) ) ( ( rule__HyphenValues__Group_0__0 )* )
                    {
                    // InternalPipelineParser.g:899:3: ( ( rule__HyphenValues__Group_0__0 ) )
                    // InternalPipelineParser.g:900:4: ( rule__HyphenValues__Group_0__0 )
                    {
                     before(grammarAccess.getHyphenValuesAccess().getGroup_0()); 
                    // InternalPipelineParser.g:901:4: ( rule__HyphenValues__Group_0__0 )
                    // InternalPipelineParser.g:901:5: rule__HyphenValues__Group_0__0
                    {
                    pushFollow(FOLLOW_3);
                    rule__HyphenValues__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHyphenValuesAccess().getGroup_0()); 

                    }

                    // InternalPipelineParser.g:904:3: ( ( rule__HyphenValues__Group_0__0 )* )
                    // InternalPipelineParser.g:905:4: ( rule__HyphenValues__Group_0__0 )*
                    {
                     before(grammarAccess.getHyphenValuesAccess().getGroup_0()); 
                    // InternalPipelineParser.g:906:4: ( rule__HyphenValues__Group_0__0 )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==HyphenMinus) ) {
                            switch ( input.LA(2) ) {
                            case RULE_ID:
                                {
                                int LA18_3 = input.LA(3);

                                if ( (LA18_3==EOF||LA18_3==Repositories||LA18_3==Containers||LA18_3==Pipelines||LA18_3==Packages||(LA18_3>=Webhooks && LA18_3<=WriteAll)||LA18_3==ReadAll||LA18_3==Builds||LA18_3==Write||(LA18_3>=None && LA18_3<=Read)||LA18_3==HyphenMinus||LA18_3==RULE_COMPLEX_EXPRESSION||(LA18_3>=RULE_BEGIN && LA18_3<=RULE_ID)) ) {
                                    alt18=1;
                                }


                                }
                                break;
                            case RULE_COMPLEX_EXPRESSION:
                                {
                                int LA18_4 = input.LA(3);

                                if ( (LA18_4==EOF||LA18_4==Repositories||LA18_4==Containers||LA18_4==Pipelines||LA18_4==Packages||(LA18_4>=Webhooks && LA18_4<=WriteAll)||LA18_4==ReadAll||LA18_4==Builds||LA18_4==Write||(LA18_4>=None && LA18_4<=Read)||LA18_4==HyphenMinus||LA18_4==RULE_COMPLEX_EXPRESSION||(LA18_4>=RULE_BEGIN && LA18_4<=RULE_ID)) ) {
                                    alt18=1;
                                }


                                }
                                break;
                            case RULE_HEX_INT:
                            case RULE_INT:
                            case RULE_FLOAT_LITERAL:
                            case RULE_VERSION:
                            case RULE_STRING:
                                {
                                alt18=1;
                                }
                                break;

                            }

                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalPipelineParser.g:906:5: rule__HyphenValues__Group_0__0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__HyphenValues__Group_0__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                     after(grammarAccess.getHyphenValuesAccess().getGroup_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:911:2: ( ( rule__HyphenValues__Group_1__0 ) )
                    {
                    // InternalPipelineParser.g:911:2: ( ( rule__HyphenValues__Group_1__0 ) )
                    // InternalPipelineParser.g:912:3: ( rule__HyphenValues__Group_1__0 )
                    {
                     before(grammarAccess.getHyphenValuesAccess().getGroup_1()); 
                    // InternalPipelineParser.g:913:3: ( rule__HyphenValues__Group_1__0 )
                    // InternalPipelineParser.g:913:4: rule__HyphenValues__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HyphenValues__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHyphenValuesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__HyphenValues__Alternatives"


    // $ANTLR start "rule__Permission__Alternatives"
    // InternalPipelineParser.g:921:1: rule__Permission__Alternatives : ( ( ( ReadAll ) ) | ( ( WriteAll ) ) | ( ( Read ) ) | ( ( Write ) ) | ( ( None ) ) );
    public final void rule__Permission__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:925:1: ( ( ( ReadAll ) ) | ( ( WriteAll ) ) | ( ( Read ) ) | ( ( Write ) ) | ( ( None ) ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case ReadAll:
                {
                alt20=1;
                }
                break;
            case WriteAll:
                {
                alt20=2;
                }
                break;
            case Read:
                {
                alt20=3;
                }
                break;
            case Write:
                {
                alt20=4;
                }
                break;
            case None:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPipelineParser.g:926:2: ( ( ReadAll ) )
                    {
                    // InternalPipelineParser.g:926:2: ( ( ReadAll ) )
                    // InternalPipelineParser.g:927:3: ( ReadAll )
                    {
                     before(grammarAccess.getPermissionAccess().getREAD_ALLEnumLiteralDeclaration_0()); 
                    // InternalPipelineParser.g:928:3: ( ReadAll )
                    // InternalPipelineParser.g:928:4: ReadAll
                    {
                    match(input,ReadAll,FOLLOW_2); 

                    }

                     after(grammarAccess.getPermissionAccess().getREAD_ALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:932:2: ( ( WriteAll ) )
                    {
                    // InternalPipelineParser.g:932:2: ( ( WriteAll ) )
                    // InternalPipelineParser.g:933:3: ( WriteAll )
                    {
                     before(grammarAccess.getPermissionAccess().getWRITE_ALLEnumLiteralDeclaration_1()); 
                    // InternalPipelineParser.g:934:3: ( WriteAll )
                    // InternalPipelineParser.g:934:4: WriteAll
                    {
                    match(input,WriteAll,FOLLOW_2); 

                    }

                     after(grammarAccess.getPermissionAccess().getWRITE_ALLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:938:2: ( ( Read ) )
                    {
                    // InternalPipelineParser.g:938:2: ( ( Read ) )
                    // InternalPipelineParser.g:939:3: ( Read )
                    {
                     before(grammarAccess.getPermissionAccess().getREADEnumLiteralDeclaration_2()); 
                    // InternalPipelineParser.g:940:3: ( Read )
                    // InternalPipelineParser.g:940:4: Read
                    {
                    match(input,Read,FOLLOW_2); 

                    }

                     after(grammarAccess.getPermissionAccess().getREADEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:944:2: ( ( Write ) )
                    {
                    // InternalPipelineParser.g:944:2: ( ( Write ) )
                    // InternalPipelineParser.g:945:3: ( Write )
                    {
                     before(grammarAccess.getPermissionAccess().getWRITEEnumLiteralDeclaration_3()); 
                    // InternalPipelineParser.g:946:3: ( Write )
                    // InternalPipelineParser.g:946:4: Write
                    {
                    match(input,Write,FOLLOW_2); 

                    }

                     after(grammarAccess.getPermissionAccess().getWRITEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:950:2: ( ( None ) )
                    {
                    // InternalPipelineParser.g:950:2: ( ( None ) )
                    // InternalPipelineParser.g:951:3: ( None )
                    {
                     before(grammarAccess.getPermissionAccess().getNONEEnumLiteralDeclaration_4()); 
                    // InternalPipelineParser.g:952:3: ( None )
                    // InternalPipelineParser.g:952:4: None
                    {
                    match(input,None,FOLLOW_2); 

                    }

                     after(grammarAccess.getPermissionAccess().getNONEEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Permission__Alternatives"


    // $ANTLR start "rule__Pipeline__Group_0__0"
    // InternalPipelineParser.g:960:1: rule__Pipeline__Group_0__0 : rule__Pipeline__Group_0__0__Impl rule__Pipeline__Group_0__1 ;
    public final void rule__Pipeline__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:964:1: ( rule__Pipeline__Group_0__0__Impl rule__Pipeline__Group_0__1 )
            // InternalPipelineParser.g:965:2: rule__Pipeline__Group_0__0__Impl rule__Pipeline__Group_0__1
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
    // InternalPipelineParser.g:972:1: rule__Pipeline__Group_0__0__Impl : ( Name ) ;
    public final void rule__Pipeline__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:976:1: ( ( Name ) )
            // InternalPipelineParser.g:977:1: ( Name )
            {
            // InternalPipelineParser.g:977:1: ( Name )
            // InternalPipelineParser.g:978:2: Name
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
    // InternalPipelineParser.g:987:1: rule__Pipeline__Group_0__1 : rule__Pipeline__Group_0__1__Impl ;
    public final void rule__Pipeline__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:991:1: ( rule__Pipeline__Group_0__1__Impl )
            // InternalPipelineParser.g:992:2: rule__Pipeline__Group_0__1__Impl
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
    // InternalPipelineParser.g:998:1: rule__Pipeline__Group_0__1__Impl : ( ( rule__Pipeline__NameAssignment_0_1 ) ) ;
    public final void rule__Pipeline__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1002:1: ( ( ( rule__Pipeline__NameAssignment_0_1 ) ) )
            // InternalPipelineParser.g:1003:1: ( ( rule__Pipeline__NameAssignment_0_1 ) )
            {
            // InternalPipelineParser.g:1003:1: ( ( rule__Pipeline__NameAssignment_0_1 ) )
            // InternalPipelineParser.g:1004:2: ( rule__Pipeline__NameAssignment_0_1 )
            {
             before(grammarAccess.getPipelineAccess().getNameAssignment_0_1()); 
            // InternalPipelineParser.g:1005:2: ( rule__Pipeline__NameAssignment_0_1 )
            // InternalPipelineParser.g:1005:3: rule__Pipeline__NameAssignment_0_1
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


    // $ANTLR start "rule__Pipeline__Group_1__0"
    // InternalPipelineParser.g:1014:1: rule__Pipeline__Group_1__0 : rule__Pipeline__Group_1__0__Impl rule__Pipeline__Group_1__1 ;
    public final void rule__Pipeline__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1018:1: ( rule__Pipeline__Group_1__0__Impl rule__Pipeline__Group_1__1 )
            // InternalPipelineParser.g:1019:2: rule__Pipeline__Group_1__0__Impl rule__Pipeline__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Pipeline__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_1__1();

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
    // $ANTLR end "rule__Pipeline__Group_1__0"


    // $ANTLR start "rule__Pipeline__Group_1__0__Impl"
    // InternalPipelineParser.g:1026:1: rule__Pipeline__Group_1__0__Impl : ( RunName ) ;
    public final void rule__Pipeline__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1030:1: ( ( RunName ) )
            // InternalPipelineParser.g:1031:1: ( RunName )
            {
            // InternalPipelineParser.g:1031:1: ( RunName )
            // InternalPipelineParser.g:1032:2: RunName
            {
             before(grammarAccess.getPipelineAccess().getRunNameKeyword_1_0()); 
            match(input,RunName,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getRunNameKeyword_1_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_1__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_1__1"
    // InternalPipelineParser.g:1041:1: rule__Pipeline__Group_1__1 : rule__Pipeline__Group_1__1__Impl ;
    public final void rule__Pipeline__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1045:1: ( rule__Pipeline__Group_1__1__Impl )
            // InternalPipelineParser.g:1046:2: rule__Pipeline__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_1__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_1__1"


    // $ANTLR start "rule__Pipeline__Group_1__1__Impl"
    // InternalPipelineParser.g:1052:1: rule__Pipeline__Group_1__1__Impl : ( ( rule__Pipeline__RunNameAssignment_1_1 ) ) ;
    public final void rule__Pipeline__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1056:1: ( ( ( rule__Pipeline__RunNameAssignment_1_1 ) ) )
            // InternalPipelineParser.g:1057:1: ( ( rule__Pipeline__RunNameAssignment_1_1 ) )
            {
            // InternalPipelineParser.g:1057:1: ( ( rule__Pipeline__RunNameAssignment_1_1 ) )
            // InternalPipelineParser.g:1058:2: ( rule__Pipeline__RunNameAssignment_1_1 )
            {
             before(grammarAccess.getPipelineAccess().getRunNameAssignment_1_1()); 
            // InternalPipelineParser.g:1059:2: ( rule__Pipeline__RunNameAssignment_1_1 )
            // InternalPipelineParser.g:1059:3: rule__Pipeline__RunNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__RunNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getRunNameAssignment_1_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_1__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_0__0"
    // InternalPipelineParser.g:1068:1: rule__Pipeline__Group_2_0__0 : rule__Pipeline__Group_2_0__0__Impl rule__Pipeline__Group_2_0__1 ;
    public final void rule__Pipeline__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1072:1: ( rule__Pipeline__Group_2_0__0__Impl rule__Pipeline__Group_2_0__1 )
            // InternalPipelineParser.g:1073:2: rule__Pipeline__Group_2_0__0__Impl rule__Pipeline__Group_2_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Pipeline__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_0__1();

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
    // $ANTLR end "rule__Pipeline__Group_2_0__0"


    // $ANTLR start "rule__Pipeline__Group_2_0__0__Impl"
    // InternalPipelineParser.g:1080:1: rule__Pipeline__Group_2_0__0__Impl : ( Defaults ) ;
    public final void rule__Pipeline__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1084:1: ( ( Defaults ) )
            // InternalPipelineParser.g:1085:1: ( Defaults )
            {
            // InternalPipelineParser.g:1085:1: ( Defaults )
            // InternalPipelineParser.g:1086:2: Defaults
            {
             before(grammarAccess.getPipelineAccess().getDefaultsKeyword_2_0_0()); 
            match(input,Defaults,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getDefaultsKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_0__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_0__1"
    // InternalPipelineParser.g:1095:1: rule__Pipeline__Group_2_0__1 : rule__Pipeline__Group_2_0__1__Impl rule__Pipeline__Group_2_0__2 ;
    public final void rule__Pipeline__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1099:1: ( rule__Pipeline__Group_2_0__1__Impl rule__Pipeline__Group_2_0__2 )
            // InternalPipelineParser.g:1100:2: rule__Pipeline__Group_2_0__1__Impl rule__Pipeline__Group_2_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Pipeline__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_0__2();

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
    // $ANTLR end "rule__Pipeline__Group_2_0__1"


    // $ANTLR start "rule__Pipeline__Group_2_0__1__Impl"
    // InternalPipelineParser.g:1107:1: rule__Pipeline__Group_2_0__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Pipeline__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1111:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:1112:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:1112:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:1113:2: RULE_BEGIN
            {
             before(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_2_0_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_0__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_0__2"
    // InternalPipelineParser.g:1122:1: rule__Pipeline__Group_2_0__2 : rule__Pipeline__Group_2_0__2__Impl rule__Pipeline__Group_2_0__3 ;
    public final void rule__Pipeline__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1126:1: ( rule__Pipeline__Group_2_0__2__Impl rule__Pipeline__Group_2_0__3 )
            // InternalPipelineParser.g:1127:2: rule__Pipeline__Group_2_0__2__Impl rule__Pipeline__Group_2_0__3
            {
            pushFollow(FOLLOW_5);
            rule__Pipeline__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_0__3();

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
    // $ANTLR end "rule__Pipeline__Group_2_0__2"


    // $ANTLR start "rule__Pipeline__Group_2_0__2__Impl"
    // InternalPipelineParser.g:1134:1: rule__Pipeline__Group_2_0__2__Impl : ( Run ) ;
    public final void rule__Pipeline__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1138:1: ( ( Run ) )
            // InternalPipelineParser.g:1139:1: ( Run )
            {
            // InternalPipelineParser.g:1139:1: ( Run )
            // InternalPipelineParser.g:1140:2: Run
            {
             before(grammarAccess.getPipelineAccess().getRunKeyword_2_0_2()); 
            match(input,Run,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getRunKeyword_2_0_2()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_0__2__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_0__3"
    // InternalPipelineParser.g:1149:1: rule__Pipeline__Group_2_0__3 : rule__Pipeline__Group_2_0__3__Impl rule__Pipeline__Group_2_0__4 ;
    public final void rule__Pipeline__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1153:1: ( rule__Pipeline__Group_2_0__3__Impl rule__Pipeline__Group_2_0__4 )
            // InternalPipelineParser.g:1154:2: rule__Pipeline__Group_2_0__3__Impl rule__Pipeline__Group_2_0__4
            {
            pushFollow(FOLLOW_7);
            rule__Pipeline__Group_2_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_0__4();

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
    // $ANTLR end "rule__Pipeline__Group_2_0__3"


    // $ANTLR start "rule__Pipeline__Group_2_0__3__Impl"
    // InternalPipelineParser.g:1161:1: rule__Pipeline__Group_2_0__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Pipeline__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1165:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:1166:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:1166:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:1167:2: RULE_BEGIN
            {
             before(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_2_0_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_2_0_3()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_0__3__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_0__4"
    // InternalPipelineParser.g:1176:1: rule__Pipeline__Group_2_0__4 : rule__Pipeline__Group_2_0__4__Impl ;
    public final void rule__Pipeline__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1180:1: ( rule__Pipeline__Group_2_0__4__Impl )
            // InternalPipelineParser.g:1181:2: rule__Pipeline__Group_2_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_0__4__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_2_0__4"


    // $ANTLR start "rule__Pipeline__Group_2_0__4__Impl"
    // InternalPipelineParser.g:1187:1: rule__Pipeline__Group_2_0__4__Impl : ( ( rule__Pipeline__Group_2_0_4__0 )? ) ;
    public final void rule__Pipeline__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1191:1: ( ( ( rule__Pipeline__Group_2_0_4__0 )? ) )
            // InternalPipelineParser.g:1192:1: ( ( rule__Pipeline__Group_2_0_4__0 )? )
            {
            // InternalPipelineParser.g:1192:1: ( ( rule__Pipeline__Group_2_0_4__0 )? )
            // InternalPipelineParser.g:1193:2: ( rule__Pipeline__Group_2_0_4__0 )?
            {
             before(grammarAccess.getPipelineAccess().getGroup_2_0_4()); 
            // InternalPipelineParser.g:1194:2: ( rule__Pipeline__Group_2_0_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Shell) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPipelineParser.g:1194:3: rule__Pipeline__Group_2_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_2_0_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPipelineAccess().getGroup_2_0_4()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_0__4__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_0_4__0"
    // InternalPipelineParser.g:1203:1: rule__Pipeline__Group_2_0_4__0 : rule__Pipeline__Group_2_0_4__0__Impl rule__Pipeline__Group_2_0_4__1 ;
    public final void rule__Pipeline__Group_2_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1207:1: ( rule__Pipeline__Group_2_0_4__0__Impl rule__Pipeline__Group_2_0_4__1 )
            // InternalPipelineParser.g:1208:2: rule__Pipeline__Group_2_0_4__0__Impl rule__Pipeline__Group_2_0_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Pipeline__Group_2_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_0_4__1();

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
    // $ANTLR end "rule__Pipeline__Group_2_0_4__0"


    // $ANTLR start "rule__Pipeline__Group_2_0_4__0__Impl"
    // InternalPipelineParser.g:1215:1: rule__Pipeline__Group_2_0_4__0__Impl : ( Shell ) ;
    public final void rule__Pipeline__Group_2_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1219:1: ( ( Shell ) )
            // InternalPipelineParser.g:1220:1: ( Shell )
            {
            // InternalPipelineParser.g:1220:1: ( Shell )
            // InternalPipelineParser.g:1221:2: Shell
            {
             before(grammarAccess.getPipelineAccess().getShellKeyword_2_0_4_0()); 
            match(input,Shell,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getShellKeyword_2_0_4_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_0_4__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_0_4__1"
    // InternalPipelineParser.g:1230:1: rule__Pipeline__Group_2_0_4__1 : rule__Pipeline__Group_2_0_4__1__Impl ;
    public final void rule__Pipeline__Group_2_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1234:1: ( rule__Pipeline__Group_2_0_4__1__Impl )
            // InternalPipelineParser.g:1235:2: rule__Pipeline__Group_2_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_0_4__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_2_0_4__1"


    // $ANTLR start "rule__Pipeline__Group_2_0_4__1__Impl"
    // InternalPipelineParser.g:1241:1: rule__Pipeline__Group_2_0_4__1__Impl : ( ( rule__Pipeline__DefaultShellValueAssignment_2_0_4_1 ) ) ;
    public final void rule__Pipeline__Group_2_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1245:1: ( ( ( rule__Pipeline__DefaultShellValueAssignment_2_0_4_1 ) ) )
            // InternalPipelineParser.g:1246:1: ( ( rule__Pipeline__DefaultShellValueAssignment_2_0_4_1 ) )
            {
            // InternalPipelineParser.g:1246:1: ( ( rule__Pipeline__DefaultShellValueAssignment_2_0_4_1 ) )
            // InternalPipelineParser.g:1247:2: ( rule__Pipeline__DefaultShellValueAssignment_2_0_4_1 )
            {
             before(grammarAccess.getPipelineAccess().getDefaultShellValueAssignment_2_0_4_1()); 
            // InternalPipelineParser.g:1248:2: ( rule__Pipeline__DefaultShellValueAssignment_2_0_4_1 )
            // InternalPipelineParser.g:1248:3: rule__Pipeline__DefaultShellValueAssignment_2_0_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__DefaultShellValueAssignment_2_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getDefaultShellValueAssignment_2_0_4_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_0_4__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_1__0"
    // InternalPipelineParser.g:1257:1: rule__Pipeline__Group_2_1__0 : rule__Pipeline__Group_2_1__0__Impl rule__Pipeline__Group_2_1__1 ;
    public final void rule__Pipeline__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1261:1: ( rule__Pipeline__Group_2_1__0__Impl rule__Pipeline__Group_2_1__1 )
            // InternalPipelineParser.g:1262:2: rule__Pipeline__Group_2_1__0__Impl rule__Pipeline__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Pipeline__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_1__1();

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
    // $ANTLR end "rule__Pipeline__Group_2_1__0"


    // $ANTLR start "rule__Pipeline__Group_2_1__0__Impl"
    // InternalPipelineParser.g:1269:1: rule__Pipeline__Group_2_1__0__Impl : ( ( rule__Pipeline__Group_2_1_0__0 )? ) ;
    public final void rule__Pipeline__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1273:1: ( ( ( rule__Pipeline__Group_2_1_0__0 )? ) )
            // InternalPipelineParser.g:1274:1: ( ( rule__Pipeline__Group_2_1_0__0 )? )
            {
            // InternalPipelineParser.g:1274:1: ( ( rule__Pipeline__Group_2_1_0__0 )? )
            // InternalPipelineParser.g:1275:2: ( rule__Pipeline__Group_2_1_0__0 )?
            {
             before(grammarAccess.getPipelineAccess().getGroup_2_1_0()); 
            // InternalPipelineParser.g:1276:2: ( rule__Pipeline__Group_2_1_0__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==WorkingDirectory) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPipelineParser.g:1276:3: rule__Pipeline__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_2_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPipelineAccess().getGroup_2_1_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_1__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_1__1"
    // InternalPipelineParser.g:1284:1: rule__Pipeline__Group_2_1__1 : rule__Pipeline__Group_2_1__1__Impl rule__Pipeline__Group_2_1__2 ;
    public final void rule__Pipeline__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1288:1: ( rule__Pipeline__Group_2_1__1__Impl rule__Pipeline__Group_2_1__2 )
            // InternalPipelineParser.g:1289:2: rule__Pipeline__Group_2_1__1__Impl rule__Pipeline__Group_2_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Pipeline__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_1__2();

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
    // $ANTLR end "rule__Pipeline__Group_2_1__1"


    // $ANTLR start "rule__Pipeline__Group_2_1__1__Impl"
    // InternalPipelineParser.g:1296:1: rule__Pipeline__Group_2_1__1__Impl : ( RULE_END ) ;
    public final void rule__Pipeline__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1300:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:1301:1: ( RULE_END )
            {
            // InternalPipelineParser.g:1301:1: ( RULE_END )
            // InternalPipelineParser.g:1302:2: RULE_END
            {
             before(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_2_1_1()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_2_1_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_1__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_1__2"
    // InternalPipelineParser.g:1311:1: rule__Pipeline__Group_2_1__2 : rule__Pipeline__Group_2_1__2__Impl ;
    public final void rule__Pipeline__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1315:1: ( rule__Pipeline__Group_2_1__2__Impl )
            // InternalPipelineParser.g:1316:2: rule__Pipeline__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_2_1__2"


    // $ANTLR start "rule__Pipeline__Group_2_1__2__Impl"
    // InternalPipelineParser.g:1322:1: rule__Pipeline__Group_2_1__2__Impl : ( RULE_END ) ;
    public final void rule__Pipeline__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1326:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:1327:1: ( RULE_END )
            {
            // InternalPipelineParser.g:1327:1: ( RULE_END )
            // InternalPipelineParser.g:1328:2: RULE_END
            {
             before(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_2_1_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_2_1_2()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_1__2__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_1_0__0"
    // InternalPipelineParser.g:1338:1: rule__Pipeline__Group_2_1_0__0 : rule__Pipeline__Group_2_1_0__0__Impl rule__Pipeline__Group_2_1_0__1 ;
    public final void rule__Pipeline__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1342:1: ( rule__Pipeline__Group_2_1_0__0__Impl rule__Pipeline__Group_2_1_0__1 )
            // InternalPipelineParser.g:1343:2: rule__Pipeline__Group_2_1_0__0__Impl rule__Pipeline__Group_2_1_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Pipeline__Group_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_1_0__1();

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
    // $ANTLR end "rule__Pipeline__Group_2_1_0__0"


    // $ANTLR start "rule__Pipeline__Group_2_1_0__0__Impl"
    // InternalPipelineParser.g:1350:1: rule__Pipeline__Group_2_1_0__0__Impl : ( WorkingDirectory ) ;
    public final void rule__Pipeline__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1354:1: ( ( WorkingDirectory ) )
            // InternalPipelineParser.g:1355:1: ( WorkingDirectory )
            {
            // InternalPipelineParser.g:1355:1: ( WorkingDirectory )
            // InternalPipelineParser.g:1356:2: WorkingDirectory
            {
             before(grammarAccess.getPipelineAccess().getWorkingDirectoryKeyword_2_1_0_0()); 
            match(input,WorkingDirectory,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getWorkingDirectoryKeyword_2_1_0_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_1_0__1"
    // InternalPipelineParser.g:1365:1: rule__Pipeline__Group_2_1_0__1 : rule__Pipeline__Group_2_1_0__1__Impl ;
    public final void rule__Pipeline__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1369:1: ( rule__Pipeline__Group_2_1_0__1__Impl )
            // InternalPipelineParser.g:1370:2: rule__Pipeline__Group_2_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_1_0__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_2_1_0__1"


    // $ANTLR start "rule__Pipeline__Group_2_1_0__1__Impl"
    // InternalPipelineParser.g:1376:1: rule__Pipeline__Group_2_1_0__1__Impl : ( ( rule__Pipeline__DefaultWDValueAssignment_2_1_0_1 ) ) ;
    public final void rule__Pipeline__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1380:1: ( ( ( rule__Pipeline__DefaultWDValueAssignment_2_1_0_1 ) ) )
            // InternalPipelineParser.g:1381:1: ( ( rule__Pipeline__DefaultWDValueAssignment_2_1_0_1 ) )
            {
            // InternalPipelineParser.g:1381:1: ( ( rule__Pipeline__DefaultWDValueAssignment_2_1_0_1 ) )
            // InternalPipelineParser.g:1382:2: ( rule__Pipeline__DefaultWDValueAssignment_2_1_0_1 )
            {
             before(grammarAccess.getPipelineAccess().getDefaultWDValueAssignment_2_1_0_1()); 
            // InternalPipelineParser.g:1383:2: ( rule__Pipeline__DefaultWDValueAssignment_2_1_0_1 )
            // InternalPipelineParser.g:1383:3: rule__Pipeline__DefaultWDValueAssignment_2_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__DefaultWDValueAssignment_2_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getDefaultWDValueAssignment_2_1_0_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_3__0"
    // InternalPipelineParser.g:1392:1: rule__Pipeline__Group_3__0 : rule__Pipeline__Group_3__0__Impl rule__Pipeline__Group_3__1 ;
    public final void rule__Pipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1396:1: ( rule__Pipeline__Group_3__0__Impl rule__Pipeline__Group_3__1 )
            // InternalPipelineParser.g:1397:2: rule__Pipeline__Group_3__0__Impl rule__Pipeline__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Pipeline__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_3__1();

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
    // $ANTLR end "rule__Pipeline__Group_3__0"


    // $ANTLR start "rule__Pipeline__Group_3__0__Impl"
    // InternalPipelineParser.g:1404:1: rule__Pipeline__Group_3__0__Impl : ( Env ) ;
    public final void rule__Pipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1408:1: ( ( Env ) )
            // InternalPipelineParser.g:1409:1: ( Env )
            {
            // InternalPipelineParser.g:1409:1: ( Env )
            // InternalPipelineParser.g:1410:2: Env
            {
             before(grammarAccess.getPipelineAccess().getEnvKeyword_3_0()); 
            match(input,Env,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getEnvKeyword_3_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_3__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_3__1"
    // InternalPipelineParser.g:1419:1: rule__Pipeline__Group_3__1 : rule__Pipeline__Group_3__1__Impl rule__Pipeline__Group_3__2 ;
    public final void rule__Pipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1423:1: ( rule__Pipeline__Group_3__1__Impl rule__Pipeline__Group_3__2 )
            // InternalPipelineParser.g:1424:2: rule__Pipeline__Group_3__1__Impl rule__Pipeline__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Pipeline__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_3__2();

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
    // $ANTLR end "rule__Pipeline__Group_3__1"


    // $ANTLR start "rule__Pipeline__Group_3__1__Impl"
    // InternalPipelineParser.g:1431:1: rule__Pipeline__Group_3__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Pipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1435:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:1436:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:1436:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:1437:2: RULE_BEGIN
            {
             before(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_3_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_3_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_3__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_3__2"
    // InternalPipelineParser.g:1446:1: rule__Pipeline__Group_3__2 : rule__Pipeline__Group_3__2__Impl rule__Pipeline__Group_3__3 ;
    public final void rule__Pipeline__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1450:1: ( rule__Pipeline__Group_3__2__Impl rule__Pipeline__Group_3__3 )
            // InternalPipelineParser.g:1451:2: rule__Pipeline__Group_3__2__Impl rule__Pipeline__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__Pipeline__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_3__3();

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
    // $ANTLR end "rule__Pipeline__Group_3__2"


    // $ANTLR start "rule__Pipeline__Group_3__2__Impl"
    // InternalPipelineParser.g:1458:1: rule__Pipeline__Group_3__2__Impl : ( ( rule__Pipeline__Group_3_2__0 )* ) ;
    public final void rule__Pipeline__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1462:1: ( ( ( rule__Pipeline__Group_3_2__0 )* ) )
            // InternalPipelineParser.g:1463:1: ( ( rule__Pipeline__Group_3_2__0 )* )
            {
            // InternalPipelineParser.g:1463:1: ( ( rule__Pipeline__Group_3_2__0 )* )
            // InternalPipelineParser.g:1464:2: ( rule__Pipeline__Group_3_2__0 )*
            {
             before(grammarAccess.getPipelineAccess().getGroup_3_2()); 
            // InternalPipelineParser.g:1465:2: ( rule__Pipeline__Group_3_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==HyphenMinus||LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPipelineParser.g:1465:3: rule__Pipeline__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Pipeline__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getPipelineAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Pipeline__Group_3__2__Impl"


    // $ANTLR start "rule__Pipeline__Group_3__3"
    // InternalPipelineParser.g:1473:1: rule__Pipeline__Group_3__3 : rule__Pipeline__Group_3__3__Impl ;
    public final void rule__Pipeline__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1477:1: ( rule__Pipeline__Group_3__3__Impl )
            // InternalPipelineParser.g:1478:2: rule__Pipeline__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_3__3__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_3__3"


    // $ANTLR start "rule__Pipeline__Group_3__3__Impl"
    // InternalPipelineParser.g:1484:1: rule__Pipeline__Group_3__3__Impl : ( RULE_END ) ;
    public final void rule__Pipeline__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1488:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:1489:1: ( RULE_END )
            {
            // InternalPipelineParser.g:1489:1: ( RULE_END )
            // InternalPipelineParser.g:1490:2: RULE_END
            {
             before(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_3_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_3_3()); 

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
    // $ANTLR end "rule__Pipeline__Group_3__3__Impl"


    // $ANTLR start "rule__Pipeline__Group_3_2__0"
    // InternalPipelineParser.g:1500:1: rule__Pipeline__Group_3_2__0 : rule__Pipeline__Group_3_2__0__Impl rule__Pipeline__Group_3_2__1 ;
    public final void rule__Pipeline__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1504:1: ( rule__Pipeline__Group_3_2__0__Impl rule__Pipeline__Group_3_2__1 )
            // InternalPipelineParser.g:1505:2: rule__Pipeline__Group_3_2__0__Impl rule__Pipeline__Group_3_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Pipeline__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_3_2__1();

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
    // $ANTLR end "rule__Pipeline__Group_3_2__0"


    // $ANTLR start "rule__Pipeline__Group_3_2__0__Impl"
    // InternalPipelineParser.g:1512:1: rule__Pipeline__Group_3_2__0__Impl : ( ( HyphenMinus )? ) ;
    public final void rule__Pipeline__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1516:1: ( ( ( HyphenMinus )? ) )
            // InternalPipelineParser.g:1517:1: ( ( HyphenMinus )? )
            {
            // InternalPipelineParser.g:1517:1: ( ( HyphenMinus )? )
            // InternalPipelineParser.g:1518:2: ( HyphenMinus )?
            {
             before(grammarAccess.getPipelineAccess().getHyphenMinusKeyword_3_2_0()); 
            // InternalPipelineParser.g:1519:2: ( HyphenMinus )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==HyphenMinus) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPipelineParser.g:1519:3: HyphenMinus
                    {
                    match(input,HyphenMinus,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPipelineAccess().getHyphenMinusKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_3_2__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_3_2__1"
    // InternalPipelineParser.g:1527:1: rule__Pipeline__Group_3_2__1 : rule__Pipeline__Group_3_2__1__Impl ;
    public final void rule__Pipeline__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1531:1: ( rule__Pipeline__Group_3_2__1__Impl )
            // InternalPipelineParser.g:1532:2: rule__Pipeline__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_3_2__1"


    // $ANTLR start "rule__Pipeline__Group_3_2__1__Impl"
    // InternalPipelineParser.g:1538:1: rule__Pipeline__Group_3_2__1__Impl : ( ( rule__Pipeline__EnvAssignment_3_2_1 ) ) ;
    public final void rule__Pipeline__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1542:1: ( ( ( rule__Pipeline__EnvAssignment_3_2_1 ) ) )
            // InternalPipelineParser.g:1543:1: ( ( rule__Pipeline__EnvAssignment_3_2_1 ) )
            {
            // InternalPipelineParser.g:1543:1: ( ( rule__Pipeline__EnvAssignment_3_2_1 ) )
            // InternalPipelineParser.g:1544:2: ( rule__Pipeline__EnvAssignment_3_2_1 )
            {
             before(grammarAccess.getPipelineAccess().getEnvAssignment_3_2_1()); 
            // InternalPipelineParser.g:1545:2: ( rule__Pipeline__EnvAssignment_3_2_1 )
            // InternalPipelineParser.g:1545:3: rule__Pipeline__EnvAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__EnvAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getEnvAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_3_2__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_4__0"
    // InternalPipelineParser.g:1554:1: rule__Pipeline__Group_4__0 : rule__Pipeline__Group_4__0__Impl rule__Pipeline__Group_4__1 ;
    public final void rule__Pipeline__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1558:1: ( rule__Pipeline__Group_4__0__Impl rule__Pipeline__Group_4__1 )
            // InternalPipelineParser.g:1559:2: rule__Pipeline__Group_4__0__Impl rule__Pipeline__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Pipeline__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_4__1();

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
    // $ANTLR end "rule__Pipeline__Group_4__0"


    // $ANTLR start "rule__Pipeline__Group_4__0__Impl"
    // InternalPipelineParser.g:1566:1: rule__Pipeline__Group_4__0__Impl : ( Permission ) ;
    public final void rule__Pipeline__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1570:1: ( ( Permission ) )
            // InternalPipelineParser.g:1571:1: ( Permission )
            {
            // InternalPipelineParser.g:1571:1: ( Permission )
            // InternalPipelineParser.g:1572:2: Permission
            {
             before(grammarAccess.getPipelineAccess().getPermissionKeyword_4_0()); 
            match(input,Permission,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getPermissionKeyword_4_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_4__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_4__1"
    // InternalPipelineParser.g:1581:1: rule__Pipeline__Group_4__1 : rule__Pipeline__Group_4__1__Impl ;
    public final void rule__Pipeline__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1585:1: ( rule__Pipeline__Group_4__1__Impl )
            // InternalPipelineParser.g:1586:2: rule__Pipeline__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_4__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_4__1"


    // $ANTLR start "rule__Pipeline__Group_4__1__Impl"
    // InternalPipelineParser.g:1592:1: rule__Pipeline__Group_4__1__Impl : ( ( rule__Pipeline__Alternatives_4_1 ) ) ;
    public final void rule__Pipeline__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1596:1: ( ( ( rule__Pipeline__Alternatives_4_1 ) ) )
            // InternalPipelineParser.g:1597:1: ( ( rule__Pipeline__Alternatives_4_1 ) )
            {
            // InternalPipelineParser.g:1597:1: ( ( rule__Pipeline__Alternatives_4_1 ) )
            // InternalPipelineParser.g:1598:2: ( rule__Pipeline__Alternatives_4_1 )
            {
             before(grammarAccess.getPipelineAccess().getAlternatives_4_1()); 
            // InternalPipelineParser.g:1599:2: ( rule__Pipeline__Alternatives_4_1 )
            // InternalPipelineParser.g:1599:3: rule__Pipeline__Alternatives_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Alternatives_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getAlternatives_4_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_4__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_4_1_1__0"
    // InternalPipelineParser.g:1608:1: rule__Pipeline__Group_4_1_1__0 : rule__Pipeline__Group_4_1_1__0__Impl rule__Pipeline__Group_4_1_1__1 ;
    public final void rule__Pipeline__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1612:1: ( rule__Pipeline__Group_4_1_1__0__Impl rule__Pipeline__Group_4_1_1__1 )
            // InternalPipelineParser.g:1613:2: rule__Pipeline__Group_4_1_1__0__Impl rule__Pipeline__Group_4_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Pipeline__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_4_1_1__1();

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
    // $ANTLR end "rule__Pipeline__Group_4_1_1__0"


    // $ANTLR start "rule__Pipeline__Group_4_1_1__0__Impl"
    // InternalPipelineParser.g:1620:1: rule__Pipeline__Group_4_1_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Pipeline__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1624:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:1625:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:1625:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:1626:2: RULE_BEGIN
            {
             before(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_4_1_1__1"
    // InternalPipelineParser.g:1635:1: rule__Pipeline__Group_4_1_1__1 : rule__Pipeline__Group_4_1_1__1__Impl rule__Pipeline__Group_4_1_1__2 ;
    public final void rule__Pipeline__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1639:1: ( rule__Pipeline__Group_4_1_1__1__Impl rule__Pipeline__Group_4_1_1__2 )
            // InternalPipelineParser.g:1640:2: rule__Pipeline__Group_4_1_1__1__Impl rule__Pipeline__Group_4_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Pipeline__Group_4_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_4_1_1__2();

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
    // $ANTLR end "rule__Pipeline__Group_4_1_1__1"


    // $ANTLR start "rule__Pipeline__Group_4_1_1__1__Impl"
    // InternalPipelineParser.g:1647:1: rule__Pipeline__Group_4_1_1__1__Impl : ( ( rule__Pipeline__IndPermissionsAssignment_4_1_1_1 )* ) ;
    public final void rule__Pipeline__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1651:1: ( ( ( rule__Pipeline__IndPermissionsAssignment_4_1_1_1 )* ) )
            // InternalPipelineParser.g:1652:1: ( ( rule__Pipeline__IndPermissionsAssignment_4_1_1_1 )* )
            {
            // InternalPipelineParser.g:1652:1: ( ( rule__Pipeline__IndPermissionsAssignment_4_1_1_1 )* )
            // InternalPipelineParser.g:1653:2: ( rule__Pipeline__IndPermissionsAssignment_4_1_1_1 )*
            {
             before(grammarAccess.getPipelineAccess().getIndPermissionsAssignment_4_1_1_1()); 
            // InternalPipelineParser.g:1654:2: ( rule__Pipeline__IndPermissionsAssignment_4_1_1_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPipelineParser.g:1654:3: rule__Pipeline__IndPermissionsAssignment_4_1_1_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Pipeline__IndPermissionsAssignment_4_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getPipelineAccess().getIndPermissionsAssignment_4_1_1_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_4_1_1__2"
    // InternalPipelineParser.g:1662:1: rule__Pipeline__Group_4_1_1__2 : rule__Pipeline__Group_4_1_1__2__Impl ;
    public final void rule__Pipeline__Group_4_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1666:1: ( rule__Pipeline__Group_4_1_1__2__Impl )
            // InternalPipelineParser.g:1667:2: rule__Pipeline__Group_4_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_4_1_1__2__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_4_1_1__2"


    // $ANTLR start "rule__Pipeline__Group_4_1_1__2__Impl"
    // InternalPipelineParser.g:1673:1: rule__Pipeline__Group_4_1_1__2__Impl : ( RULE_END ) ;
    public final void rule__Pipeline__Group_4_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1677:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:1678:1: ( RULE_END )
            {
            // InternalPipelineParser.g:1678:1: ( RULE_END )
            // InternalPipelineParser.g:1679:2: RULE_END
            {
             before(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_4_1_1_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_4_1_1_2()); 

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
    // $ANTLR end "rule__Pipeline__Group_4_1_1__2__Impl"


    // $ANTLR start "rule__Pipeline__Group_5__0"
    // InternalPipelineParser.g:1689:1: rule__Pipeline__Group_5__0 : rule__Pipeline__Group_5__0__Impl rule__Pipeline__Group_5__1 ;
    public final void rule__Pipeline__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1693:1: ( rule__Pipeline__Group_5__0__Impl rule__Pipeline__Group_5__1 )
            // InternalPipelineParser.g:1694:2: rule__Pipeline__Group_5__0__Impl rule__Pipeline__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Pipeline__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5__1();

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
    // $ANTLR end "rule__Pipeline__Group_5__0"


    // $ANTLR start "rule__Pipeline__Group_5__0__Impl"
    // InternalPipelineParser.g:1701:1: rule__Pipeline__Group_5__0__Impl : ( Concurrency ) ;
    public final void rule__Pipeline__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1705:1: ( ( Concurrency ) )
            // InternalPipelineParser.g:1706:1: ( Concurrency )
            {
            // InternalPipelineParser.g:1706:1: ( Concurrency )
            // InternalPipelineParser.g:1707:2: Concurrency
            {
             before(grammarAccess.getPipelineAccess().getConcurrencyKeyword_5_0()); 
            match(input,Concurrency,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getConcurrencyKeyword_5_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_5__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_5__1"
    // InternalPipelineParser.g:1716:1: rule__Pipeline__Group_5__1 : rule__Pipeline__Group_5__1__Impl ;
    public final void rule__Pipeline__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1720:1: ( rule__Pipeline__Group_5__1__Impl )
            // InternalPipelineParser.g:1721:2: rule__Pipeline__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_5__1"


    // $ANTLR start "rule__Pipeline__Group_5__1__Impl"
    // InternalPipelineParser.g:1727:1: rule__Pipeline__Group_5__1__Impl : ( ( rule__Pipeline__Group_5_1__0 ) ) ;
    public final void rule__Pipeline__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1731:1: ( ( ( rule__Pipeline__Group_5_1__0 ) ) )
            // InternalPipelineParser.g:1732:1: ( ( rule__Pipeline__Group_5_1__0 ) )
            {
            // InternalPipelineParser.g:1732:1: ( ( rule__Pipeline__Group_5_1__0 ) )
            // InternalPipelineParser.g:1733:2: ( rule__Pipeline__Group_5_1__0 )
            {
             before(grammarAccess.getPipelineAccess().getGroup_5_1()); 
            // InternalPipelineParser.g:1734:2: ( rule__Pipeline__Group_5_1__0 )
            // InternalPipelineParser.g:1734:3: rule__Pipeline__Group_5_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_5__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_5_1__0"
    // InternalPipelineParser.g:1743:1: rule__Pipeline__Group_5_1__0 : rule__Pipeline__Group_5_1__0__Impl rule__Pipeline__Group_5_1__1 ;
    public final void rule__Pipeline__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1747:1: ( rule__Pipeline__Group_5_1__0__Impl rule__Pipeline__Group_5_1__1 )
            // InternalPipelineParser.g:1748:2: rule__Pipeline__Group_5_1__0__Impl rule__Pipeline__Group_5_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Pipeline__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5_1__1();

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
    // $ANTLR end "rule__Pipeline__Group_5_1__0"


    // $ANTLR start "rule__Pipeline__Group_5_1__0__Impl"
    // InternalPipelineParser.g:1755:1: rule__Pipeline__Group_5_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Pipeline__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1759:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:1760:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:1760:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:1761:2: RULE_BEGIN
            {
             before(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_5_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_5_1__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_5_1__1"
    // InternalPipelineParser.g:1770:1: rule__Pipeline__Group_5_1__1 : rule__Pipeline__Group_5_1__1__Impl rule__Pipeline__Group_5_1__2 ;
    public final void rule__Pipeline__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1774:1: ( rule__Pipeline__Group_5_1__1__Impl rule__Pipeline__Group_5_1__2 )
            // InternalPipelineParser.g:1775:2: rule__Pipeline__Group_5_1__1__Impl rule__Pipeline__Group_5_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Pipeline__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5_1__2();

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
    // $ANTLR end "rule__Pipeline__Group_5_1__1"


    // $ANTLR start "rule__Pipeline__Group_5_1__1__Impl"
    // InternalPipelineParser.g:1782:1: rule__Pipeline__Group_5_1__1__Impl : ( ( rule__Pipeline__Group_5_1_1__0 ) ) ;
    public final void rule__Pipeline__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1786:1: ( ( ( rule__Pipeline__Group_5_1_1__0 ) ) )
            // InternalPipelineParser.g:1787:1: ( ( rule__Pipeline__Group_5_1_1__0 ) )
            {
            // InternalPipelineParser.g:1787:1: ( ( rule__Pipeline__Group_5_1_1__0 ) )
            // InternalPipelineParser.g:1788:2: ( rule__Pipeline__Group_5_1_1__0 )
            {
             before(grammarAccess.getPipelineAccess().getGroup_5_1_1()); 
            // InternalPipelineParser.g:1789:2: ( rule__Pipeline__Group_5_1_1__0 )
            // InternalPipelineParser.g:1789:3: rule__Pipeline__Group_5_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getGroup_5_1_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_5_1__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_5_1__2"
    // InternalPipelineParser.g:1797:1: rule__Pipeline__Group_5_1__2 : rule__Pipeline__Group_5_1__2__Impl rule__Pipeline__Group_5_1__3 ;
    public final void rule__Pipeline__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1801:1: ( rule__Pipeline__Group_5_1__2__Impl rule__Pipeline__Group_5_1__3 )
            // InternalPipelineParser.g:1802:2: rule__Pipeline__Group_5_1__2__Impl rule__Pipeline__Group_5_1__3
            {
            pushFollow(FOLLOW_9);
            rule__Pipeline__Group_5_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5_1__3();

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
    // $ANTLR end "rule__Pipeline__Group_5_1__2"


    // $ANTLR start "rule__Pipeline__Group_5_1__2__Impl"
    // InternalPipelineParser.g:1809:1: rule__Pipeline__Group_5_1__2__Impl : ( ( rule__Pipeline__Group_5_1_2__0 ) ) ;
    public final void rule__Pipeline__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1813:1: ( ( ( rule__Pipeline__Group_5_1_2__0 ) ) )
            // InternalPipelineParser.g:1814:1: ( ( rule__Pipeline__Group_5_1_2__0 ) )
            {
            // InternalPipelineParser.g:1814:1: ( ( rule__Pipeline__Group_5_1_2__0 ) )
            // InternalPipelineParser.g:1815:2: ( rule__Pipeline__Group_5_1_2__0 )
            {
             before(grammarAccess.getPipelineAccess().getGroup_5_1_2()); 
            // InternalPipelineParser.g:1816:2: ( rule__Pipeline__Group_5_1_2__0 )
            // InternalPipelineParser.g:1816:3: rule__Pipeline__Group_5_1_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getGroup_5_1_2()); 

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
    // $ANTLR end "rule__Pipeline__Group_5_1__2__Impl"


    // $ANTLR start "rule__Pipeline__Group_5_1__3"
    // InternalPipelineParser.g:1824:1: rule__Pipeline__Group_5_1__3 : rule__Pipeline__Group_5_1__3__Impl ;
    public final void rule__Pipeline__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1828:1: ( rule__Pipeline__Group_5_1__3__Impl )
            // InternalPipelineParser.g:1829:2: rule__Pipeline__Group_5_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5_1__3__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_5_1__3"


    // $ANTLR start "rule__Pipeline__Group_5_1__3__Impl"
    // InternalPipelineParser.g:1835:1: rule__Pipeline__Group_5_1__3__Impl : ( RULE_END ) ;
    public final void rule__Pipeline__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1839:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:1840:1: ( RULE_END )
            {
            // InternalPipelineParser.g:1840:1: ( RULE_END )
            // InternalPipelineParser.g:1841:2: RULE_END
            {
             before(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_5_1_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_5_1_3()); 

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
    // $ANTLR end "rule__Pipeline__Group_5_1__3__Impl"


    // $ANTLR start "rule__Pipeline__Group_5_1_1__0"
    // InternalPipelineParser.g:1851:1: rule__Pipeline__Group_5_1_1__0 : rule__Pipeline__Group_5_1_1__0__Impl rule__Pipeline__Group_5_1_1__1 ;
    public final void rule__Pipeline__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1855:1: ( rule__Pipeline__Group_5_1_1__0__Impl rule__Pipeline__Group_5_1_1__1 )
            // InternalPipelineParser.g:1856:2: rule__Pipeline__Group_5_1_1__0__Impl rule__Pipeline__Group_5_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Pipeline__Group_5_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5_1_1__1();

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
    // $ANTLR end "rule__Pipeline__Group_5_1_1__0"


    // $ANTLR start "rule__Pipeline__Group_5_1_1__0__Impl"
    // InternalPipelineParser.g:1863:1: rule__Pipeline__Group_5_1_1__0__Impl : ( Group ) ;
    public final void rule__Pipeline__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1867:1: ( ( Group ) )
            // InternalPipelineParser.g:1868:1: ( Group )
            {
            // InternalPipelineParser.g:1868:1: ( Group )
            // InternalPipelineParser.g:1869:2: Group
            {
             before(grammarAccess.getPipelineAccess().getGroupKeyword_5_1_1_0()); 
            match(input,Group,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getGroupKeyword_5_1_1_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_5_1_1__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_5_1_1__1"
    // InternalPipelineParser.g:1878:1: rule__Pipeline__Group_5_1_1__1 : rule__Pipeline__Group_5_1_1__1__Impl ;
    public final void rule__Pipeline__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1882:1: ( rule__Pipeline__Group_5_1_1__1__Impl )
            // InternalPipelineParser.g:1883:2: rule__Pipeline__Group_5_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5_1_1__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_5_1_1__1"


    // $ANTLR start "rule__Pipeline__Group_5_1_1__1__Impl"
    // InternalPipelineParser.g:1889:1: rule__Pipeline__Group_5_1_1__1__Impl : ( ( rule__Pipeline__GroupAssignment_5_1_1_1 ) ) ;
    public final void rule__Pipeline__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1893:1: ( ( ( rule__Pipeline__GroupAssignment_5_1_1_1 ) ) )
            // InternalPipelineParser.g:1894:1: ( ( rule__Pipeline__GroupAssignment_5_1_1_1 ) )
            {
            // InternalPipelineParser.g:1894:1: ( ( rule__Pipeline__GroupAssignment_5_1_1_1 ) )
            // InternalPipelineParser.g:1895:2: ( rule__Pipeline__GroupAssignment_5_1_1_1 )
            {
             before(grammarAccess.getPipelineAccess().getGroupAssignment_5_1_1_1()); 
            // InternalPipelineParser.g:1896:2: ( rule__Pipeline__GroupAssignment_5_1_1_1 )
            // InternalPipelineParser.g:1896:3: rule__Pipeline__GroupAssignment_5_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__GroupAssignment_5_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getGroupAssignment_5_1_1_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_5_1_1__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_5_1_2__0"
    // InternalPipelineParser.g:1905:1: rule__Pipeline__Group_5_1_2__0 : rule__Pipeline__Group_5_1_2__0__Impl rule__Pipeline__Group_5_1_2__1 ;
    public final void rule__Pipeline__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1909:1: ( rule__Pipeline__Group_5_1_2__0__Impl rule__Pipeline__Group_5_1_2__1 )
            // InternalPipelineParser.g:1910:2: rule__Pipeline__Group_5_1_2__0__Impl rule__Pipeline__Group_5_1_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Pipeline__Group_5_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5_1_2__1();

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
    // $ANTLR end "rule__Pipeline__Group_5_1_2__0"


    // $ANTLR start "rule__Pipeline__Group_5_1_2__0__Impl"
    // InternalPipelineParser.g:1917:1: rule__Pipeline__Group_5_1_2__0__Impl : ( CancelInProgress ) ;
    public final void rule__Pipeline__Group_5_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1921:1: ( ( CancelInProgress ) )
            // InternalPipelineParser.g:1922:1: ( CancelInProgress )
            {
            // InternalPipelineParser.g:1922:1: ( CancelInProgress )
            // InternalPipelineParser.g:1923:2: CancelInProgress
            {
             before(grammarAccess.getPipelineAccess().getCancelInProgressKeyword_5_1_2_0()); 
            match(input,CancelInProgress,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getCancelInProgressKeyword_5_1_2_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_5_1_2__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_5_1_2__1"
    // InternalPipelineParser.g:1932:1: rule__Pipeline__Group_5_1_2__1 : rule__Pipeline__Group_5_1_2__1__Impl ;
    public final void rule__Pipeline__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1936:1: ( rule__Pipeline__Group_5_1_2__1__Impl )
            // InternalPipelineParser.g:1937:2: rule__Pipeline__Group_5_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_5_1_2__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_5_1_2__1"


    // $ANTLR start "rule__Pipeline__Group_5_1_2__1__Impl"
    // InternalPipelineParser.g:1943:1: rule__Pipeline__Group_5_1_2__1__Impl : ( ( rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1 ) ) ;
    public final void rule__Pipeline__Group_5_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1947:1: ( ( ( rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1 ) ) )
            // InternalPipelineParser.g:1948:1: ( ( rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1 ) )
            {
            // InternalPipelineParser.g:1948:1: ( ( rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1 ) )
            // InternalPipelineParser.g:1949:2: ( rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1 )
            {
             before(grammarAccess.getPipelineAccess().getCancelConcurrenceAssignment_5_1_2_1()); 
            // InternalPipelineParser.g:1950:2: ( rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1 )
            // InternalPipelineParser.g:1950:3: rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getCancelConcurrenceAssignment_5_1_2_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_5_1_2__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_6__0"
    // InternalPipelineParser.g:1959:1: rule__Pipeline__Group_6__0 : rule__Pipeline__Group_6__0__Impl rule__Pipeline__Group_6__1 ;
    public final void rule__Pipeline__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1963:1: ( rule__Pipeline__Group_6__0__Impl rule__Pipeline__Group_6__1 )
            // InternalPipelineParser.g:1964:2: rule__Pipeline__Group_6__0__Impl rule__Pipeline__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__Pipeline__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_6__1();

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
    // $ANTLR end "rule__Pipeline__Group_6__0"


    // $ANTLR start "rule__Pipeline__Group_6__0__Impl"
    // InternalPipelineParser.g:1971:1: rule__Pipeline__Group_6__0__Impl : ( Parameters ) ;
    public final void rule__Pipeline__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1975:1: ( ( Parameters ) )
            // InternalPipelineParser.g:1976:1: ( Parameters )
            {
            // InternalPipelineParser.g:1976:1: ( Parameters )
            // InternalPipelineParser.g:1977:2: Parameters
            {
             before(grammarAccess.getPipelineAccess().getParametersKeyword_6_0()); 
            match(input,Parameters,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getParametersKeyword_6_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_6__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_6__1"
    // InternalPipelineParser.g:1986:1: rule__Pipeline__Group_6__1 : rule__Pipeline__Group_6__1__Impl ;
    public final void rule__Pipeline__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:1990:1: ( rule__Pipeline__Group_6__1__Impl )
            // InternalPipelineParser.g:1991:2: rule__Pipeline__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_6__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_6__1"


    // $ANTLR start "rule__Pipeline__Group_6__1__Impl"
    // InternalPipelineParser.g:1997:1: rule__Pipeline__Group_6__1__Impl : ( ( rule__Pipeline__Group_6_1__0 )* ) ;
    public final void rule__Pipeline__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2001:1: ( ( ( rule__Pipeline__Group_6_1__0 )* ) )
            // InternalPipelineParser.g:2002:1: ( ( rule__Pipeline__Group_6_1__0 )* )
            {
            // InternalPipelineParser.g:2002:1: ( ( rule__Pipeline__Group_6_1__0 )* )
            // InternalPipelineParser.g:2003:2: ( rule__Pipeline__Group_6_1__0 )*
            {
             before(grammarAccess.getPipelineAccess().getGroup_6_1()); 
            // InternalPipelineParser.g:2004:2: ( rule__Pipeline__Group_6_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==HyphenMinus) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPipelineParser.g:2004:3: rule__Pipeline__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Pipeline__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getPipelineAccess().getGroup_6_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_6__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_6_1__0"
    // InternalPipelineParser.g:2013:1: rule__Pipeline__Group_6_1__0 : rule__Pipeline__Group_6_1__0__Impl rule__Pipeline__Group_6_1__1 ;
    public final void rule__Pipeline__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2017:1: ( rule__Pipeline__Group_6_1__0__Impl rule__Pipeline__Group_6_1__1 )
            // InternalPipelineParser.g:2018:2: rule__Pipeline__Group_6_1__0__Impl rule__Pipeline__Group_6_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Pipeline__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_6_1__1();

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
    // $ANTLR end "rule__Pipeline__Group_6_1__0"


    // $ANTLR start "rule__Pipeline__Group_6_1__0__Impl"
    // InternalPipelineParser.g:2025:1: rule__Pipeline__Group_6_1__0__Impl : ( HyphenMinus ) ;
    public final void rule__Pipeline__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2029:1: ( ( HyphenMinus ) )
            // InternalPipelineParser.g:2030:1: ( HyphenMinus )
            {
            // InternalPipelineParser.g:2030:1: ( HyphenMinus )
            // InternalPipelineParser.g:2031:2: HyphenMinus
            {
             before(grammarAccess.getPipelineAccess().getHyphenMinusKeyword_6_1_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getHyphenMinusKeyword_6_1_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_6_1__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_6_1__1"
    // InternalPipelineParser.g:2040:1: rule__Pipeline__Group_6_1__1 : rule__Pipeline__Group_6_1__1__Impl ;
    public final void rule__Pipeline__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2044:1: ( rule__Pipeline__Group_6_1__1__Impl )
            // InternalPipelineParser.g:2045:2: rule__Pipeline__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_6_1__1"


    // $ANTLR start "rule__Pipeline__Group_6_1__1__Impl"
    // InternalPipelineParser.g:2051:1: rule__Pipeline__Group_6_1__1__Impl : ( ( rule__Pipeline__PipelineParametersAssignment_6_1_1 ) ) ;
    public final void rule__Pipeline__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2055:1: ( ( ( rule__Pipeline__PipelineParametersAssignment_6_1_1 ) ) )
            // InternalPipelineParser.g:2056:1: ( ( rule__Pipeline__PipelineParametersAssignment_6_1_1 ) )
            {
            // InternalPipelineParser.g:2056:1: ( ( rule__Pipeline__PipelineParametersAssignment_6_1_1 ) )
            // InternalPipelineParser.g:2057:2: ( rule__Pipeline__PipelineParametersAssignment_6_1_1 )
            {
             before(grammarAccess.getPipelineAccess().getPipelineParametersAssignment_6_1_1()); 
            // InternalPipelineParser.g:2058:2: ( rule__Pipeline__PipelineParametersAssignment_6_1_1 )
            // InternalPipelineParser.g:2058:3: rule__Pipeline__PipelineParametersAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__PipelineParametersAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getPipelineParametersAssignment_6_1_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_6_1__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_7__0"
    // InternalPipelineParser.g:2067:1: rule__Pipeline__Group_7__0 : rule__Pipeline__Group_7__0__Impl rule__Pipeline__Group_7__1 ;
    public final void rule__Pipeline__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2071:1: ( rule__Pipeline__Group_7__0__Impl rule__Pipeline__Group_7__1 )
            // InternalPipelineParser.g:2072:2: rule__Pipeline__Group_7__0__Impl rule__Pipeline__Group_7__1
            {
            pushFollow(FOLLOW_21);
            rule__Pipeline__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7__1();

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
    // $ANTLR end "rule__Pipeline__Group_7__0"


    // $ANTLR start "rule__Pipeline__Group_7__0__Impl"
    // InternalPipelineParser.g:2079:1: rule__Pipeline__Group_7__0__Impl : ( Pool ) ;
    public final void rule__Pipeline__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2083:1: ( ( Pool ) )
            // InternalPipelineParser.g:2084:1: ( Pool )
            {
            // InternalPipelineParser.g:2084:1: ( Pool )
            // InternalPipelineParser.g:2085:2: Pool
            {
             before(grammarAccess.getPipelineAccess().getPoolKeyword_7_0()); 
            match(input,Pool,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getPoolKeyword_7_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_7__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_7__1"
    // InternalPipelineParser.g:2094:1: rule__Pipeline__Group_7__1 : rule__Pipeline__Group_7__1__Impl ;
    public final void rule__Pipeline__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2098:1: ( rule__Pipeline__Group_7__1__Impl )
            // InternalPipelineParser.g:2099:2: rule__Pipeline__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_7__1"


    // $ANTLR start "rule__Pipeline__Group_7__1__Impl"
    // InternalPipelineParser.g:2105:1: rule__Pipeline__Group_7__1__Impl : ( ( rule__Pipeline__UnorderedGroup_7_1 ) ) ;
    public final void rule__Pipeline__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2109:1: ( ( ( rule__Pipeline__UnorderedGroup_7_1 ) ) )
            // InternalPipelineParser.g:2110:1: ( ( rule__Pipeline__UnorderedGroup_7_1 ) )
            {
            // InternalPipelineParser.g:2110:1: ( ( rule__Pipeline__UnorderedGroup_7_1 ) )
            // InternalPipelineParser.g:2111:2: ( rule__Pipeline__UnorderedGroup_7_1 )
            {
             before(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1()); 
            // InternalPipelineParser.g:2112:2: ( rule__Pipeline__UnorderedGroup_7_1 )
            // InternalPipelineParser.g:2112:3: rule__Pipeline__UnorderedGroup_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__UnorderedGroup_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_7__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_7_1_0__0"
    // InternalPipelineParser.g:2121:1: rule__Pipeline__Group_7_1_0__0 : rule__Pipeline__Group_7_1_0__0__Impl rule__Pipeline__Group_7_1_0__1 ;
    public final void rule__Pipeline__Group_7_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2125:1: ( rule__Pipeline__Group_7_1_0__0__Impl rule__Pipeline__Group_7_1_0__1 )
            // InternalPipelineParser.g:2126:2: rule__Pipeline__Group_7_1_0__0__Impl rule__Pipeline__Group_7_1_0__1
            {
            pushFollow(FOLLOW_22);
            rule__Pipeline__Group_7_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_0__1();

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0__0"


    // $ANTLR start "rule__Pipeline__Group_7_1_0__0__Impl"
    // InternalPipelineParser.g:2133:1: rule__Pipeline__Group_7_1_0__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Pipeline__Group_7_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2137:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:2138:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:2138:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:2139:2: RULE_BEGIN
            {
             before(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_7_1_0_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_7_1_0_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_7_1_0__1"
    // InternalPipelineParser.g:2148:1: rule__Pipeline__Group_7_1_0__1 : rule__Pipeline__Group_7_1_0__1__Impl rule__Pipeline__Group_7_1_0__2 ;
    public final void rule__Pipeline__Group_7_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2152:1: ( rule__Pipeline__Group_7_1_0__1__Impl rule__Pipeline__Group_7_1_0__2 )
            // InternalPipelineParser.g:2153:2: rule__Pipeline__Group_7_1_0__1__Impl rule__Pipeline__Group_7_1_0__2
            {
            pushFollow(FOLLOW_23);
            rule__Pipeline__Group_7_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_0__2();

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0__1"


    // $ANTLR start "rule__Pipeline__Group_7_1_0__1__Impl"
    // InternalPipelineParser.g:2160:1: rule__Pipeline__Group_7_1_0__1__Impl : ( ( rule__Pipeline__Group_7_1_0_1__0 ) ) ;
    public final void rule__Pipeline__Group_7_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2164:1: ( ( ( rule__Pipeline__Group_7_1_0_1__0 ) ) )
            // InternalPipelineParser.g:2165:1: ( ( rule__Pipeline__Group_7_1_0_1__0 ) )
            {
            // InternalPipelineParser.g:2165:1: ( ( rule__Pipeline__Group_7_1_0_1__0 ) )
            // InternalPipelineParser.g:2166:2: ( rule__Pipeline__Group_7_1_0_1__0 )
            {
             before(grammarAccess.getPipelineAccess().getGroup_7_1_0_1()); 
            // InternalPipelineParser.g:2167:2: ( rule__Pipeline__Group_7_1_0_1__0 )
            // InternalPipelineParser.g:2167:3: rule__Pipeline__Group_7_1_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getGroup_7_1_0_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_7_1_0__2"
    // InternalPipelineParser.g:2175:1: rule__Pipeline__Group_7_1_0__2 : rule__Pipeline__Group_7_1_0__2__Impl ;
    public final void rule__Pipeline__Group_7_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2179:1: ( rule__Pipeline__Group_7_1_0__2__Impl )
            // InternalPipelineParser.g:2180:2: rule__Pipeline__Group_7_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_0__2__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0__2"


    // $ANTLR start "rule__Pipeline__Group_7_1_0__2__Impl"
    // InternalPipelineParser.g:2186:1: rule__Pipeline__Group_7_1_0__2__Impl : ( ( rule__Pipeline__Group_7_1_0_2__0 )? ) ;
    public final void rule__Pipeline__Group_7_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2190:1: ( ( ( rule__Pipeline__Group_7_1_0_2__0 )? ) )
            // InternalPipelineParser.g:2191:1: ( ( rule__Pipeline__Group_7_1_0_2__0 )? )
            {
            // InternalPipelineParser.g:2191:1: ( ( rule__Pipeline__Group_7_1_0_2__0 )? )
            // InternalPipelineParser.g:2192:2: ( rule__Pipeline__Group_7_1_0_2__0 )?
            {
             before(grammarAccess.getPipelineAccess().getGroup_7_1_0_2()); 
            // InternalPipelineParser.g:2193:2: ( rule__Pipeline__Group_7_1_0_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==VmImage) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPipelineParser.g:2193:3: rule__Pipeline__Group_7_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_7_1_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPipelineAccess().getGroup_7_1_0_2()); 

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0__2__Impl"


    // $ANTLR start "rule__Pipeline__Group_7_1_0_1__0"
    // InternalPipelineParser.g:2202:1: rule__Pipeline__Group_7_1_0_1__0 : rule__Pipeline__Group_7_1_0_1__0__Impl rule__Pipeline__Group_7_1_0_1__1 ;
    public final void rule__Pipeline__Group_7_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2206:1: ( rule__Pipeline__Group_7_1_0_1__0__Impl rule__Pipeline__Group_7_1_0_1__1 )
            // InternalPipelineParser.g:2207:2: rule__Pipeline__Group_7_1_0_1__0__Impl rule__Pipeline__Group_7_1_0_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Pipeline__Group_7_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_0_1__1();

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0_1__0"


    // $ANTLR start "rule__Pipeline__Group_7_1_0_1__0__Impl"
    // InternalPipelineParser.g:2214:1: rule__Pipeline__Group_7_1_0_1__0__Impl : ( Name ) ;
    public final void rule__Pipeline__Group_7_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2218:1: ( ( Name ) )
            // InternalPipelineParser.g:2219:1: ( Name )
            {
            // InternalPipelineParser.g:2219:1: ( Name )
            // InternalPipelineParser.g:2220:2: Name
            {
             before(grammarAccess.getPipelineAccess().getNameKeyword_7_1_0_1_0()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getNameKeyword_7_1_0_1_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0_1__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_7_1_0_1__1"
    // InternalPipelineParser.g:2229:1: rule__Pipeline__Group_7_1_0_1__1 : rule__Pipeline__Group_7_1_0_1__1__Impl ;
    public final void rule__Pipeline__Group_7_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2233:1: ( rule__Pipeline__Group_7_1_0_1__1__Impl )
            // InternalPipelineParser.g:2234:2: rule__Pipeline__Group_7_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0_1__1"


    // $ANTLR start "rule__Pipeline__Group_7_1_0_1__1__Impl"
    // InternalPipelineParser.g:2240:1: rule__Pipeline__Group_7_1_0_1__1__Impl : ( ( rule__Pipeline__VmNameAssignment_7_1_0_1_1 ) ) ;
    public final void rule__Pipeline__Group_7_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2244:1: ( ( ( rule__Pipeline__VmNameAssignment_7_1_0_1_1 ) ) )
            // InternalPipelineParser.g:2245:1: ( ( rule__Pipeline__VmNameAssignment_7_1_0_1_1 ) )
            {
            // InternalPipelineParser.g:2245:1: ( ( rule__Pipeline__VmNameAssignment_7_1_0_1_1 ) )
            // InternalPipelineParser.g:2246:2: ( rule__Pipeline__VmNameAssignment_7_1_0_1_1 )
            {
             before(grammarAccess.getPipelineAccess().getVmNameAssignment_7_1_0_1_1()); 
            // InternalPipelineParser.g:2247:2: ( rule__Pipeline__VmNameAssignment_7_1_0_1_1 )
            // InternalPipelineParser.g:2247:3: rule__Pipeline__VmNameAssignment_7_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__VmNameAssignment_7_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getVmNameAssignment_7_1_0_1_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0_1__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_7_1_0_2__0"
    // InternalPipelineParser.g:2256:1: rule__Pipeline__Group_7_1_0_2__0 : rule__Pipeline__Group_7_1_0_2__0__Impl rule__Pipeline__Group_7_1_0_2__1 ;
    public final void rule__Pipeline__Group_7_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2260:1: ( rule__Pipeline__Group_7_1_0_2__0__Impl rule__Pipeline__Group_7_1_0_2__1 )
            // InternalPipelineParser.g:2261:2: rule__Pipeline__Group_7_1_0_2__0__Impl rule__Pipeline__Group_7_1_0_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Pipeline__Group_7_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_0_2__1();

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0_2__0"


    // $ANTLR start "rule__Pipeline__Group_7_1_0_2__0__Impl"
    // InternalPipelineParser.g:2268:1: rule__Pipeline__Group_7_1_0_2__0__Impl : ( VmImage ) ;
    public final void rule__Pipeline__Group_7_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2272:1: ( ( VmImage ) )
            // InternalPipelineParser.g:2273:1: ( VmImage )
            {
            // InternalPipelineParser.g:2273:1: ( VmImage )
            // InternalPipelineParser.g:2274:2: VmImage
            {
             before(grammarAccess.getPipelineAccess().getVmImageKeyword_7_1_0_2_0()); 
            match(input,VmImage,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getVmImageKeyword_7_1_0_2_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0_2__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_7_1_0_2__1"
    // InternalPipelineParser.g:2283:1: rule__Pipeline__Group_7_1_0_2__1 : rule__Pipeline__Group_7_1_0_2__1__Impl ;
    public final void rule__Pipeline__Group_7_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2287:1: ( rule__Pipeline__Group_7_1_0_2__1__Impl )
            // InternalPipelineParser.g:2288:2: rule__Pipeline__Group_7_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_0_2__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0_2__1"


    // $ANTLR start "rule__Pipeline__Group_7_1_0_2__1__Impl"
    // InternalPipelineParser.g:2294:1: rule__Pipeline__Group_7_1_0_2__1__Impl : ( ( rule__Pipeline__VmImageAssignment_7_1_0_2_1 ) ) ;
    public final void rule__Pipeline__Group_7_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2298:1: ( ( ( rule__Pipeline__VmImageAssignment_7_1_0_2_1 ) ) )
            // InternalPipelineParser.g:2299:1: ( ( rule__Pipeline__VmImageAssignment_7_1_0_2_1 ) )
            {
            // InternalPipelineParser.g:2299:1: ( ( rule__Pipeline__VmImageAssignment_7_1_0_2_1 ) )
            // InternalPipelineParser.g:2300:2: ( rule__Pipeline__VmImageAssignment_7_1_0_2_1 )
            {
             before(grammarAccess.getPipelineAccess().getVmImageAssignment_7_1_0_2_1()); 
            // InternalPipelineParser.g:2301:2: ( rule__Pipeline__VmImageAssignment_7_1_0_2_1 )
            // InternalPipelineParser.g:2301:3: rule__Pipeline__VmImageAssignment_7_1_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__VmImageAssignment_7_1_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getVmImageAssignment_7_1_0_2_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_7_1_0_2__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_7_1_1__0"
    // InternalPipelineParser.g:2310:1: rule__Pipeline__Group_7_1_1__0 : rule__Pipeline__Group_7_1_1__0__Impl rule__Pipeline__Group_7_1_1__1 ;
    public final void rule__Pipeline__Group_7_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2314:1: ( rule__Pipeline__Group_7_1_1__0__Impl rule__Pipeline__Group_7_1_1__1 )
            // InternalPipelineParser.g:2315:2: rule__Pipeline__Group_7_1_1__0__Impl rule__Pipeline__Group_7_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Pipeline__Group_7_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_1__1();

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
    // $ANTLR end "rule__Pipeline__Group_7_1_1__0"


    // $ANTLR start "rule__Pipeline__Group_7_1_1__0__Impl"
    // InternalPipelineParser.g:2322:1: rule__Pipeline__Group_7_1_1__0__Impl : ( ( rule__Pipeline__Group_7_1_1_0__0 )? ) ;
    public final void rule__Pipeline__Group_7_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2326:1: ( ( ( rule__Pipeline__Group_7_1_1_0__0 )? ) )
            // InternalPipelineParser.g:2327:1: ( ( rule__Pipeline__Group_7_1_1_0__0 )? )
            {
            // InternalPipelineParser.g:2327:1: ( ( rule__Pipeline__Group_7_1_1_0__0 )? )
            // InternalPipelineParser.g:2328:2: ( rule__Pipeline__Group_7_1_1_0__0 )?
            {
             before(grammarAccess.getPipelineAccess().getGroup_7_1_1_0()); 
            // InternalPipelineParser.g:2329:2: ( rule__Pipeline__Group_7_1_1_0__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Demands) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPipelineParser.g:2329:3: rule__Pipeline__Group_7_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_7_1_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPipelineAccess().getGroup_7_1_1_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_7_1_1__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_7_1_1__1"
    // InternalPipelineParser.g:2337:1: rule__Pipeline__Group_7_1_1__1 : rule__Pipeline__Group_7_1_1__1__Impl ;
    public final void rule__Pipeline__Group_7_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2341:1: ( rule__Pipeline__Group_7_1_1__1__Impl )
            // InternalPipelineParser.g:2342:2: rule__Pipeline__Group_7_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_1__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_7_1_1__1"


    // $ANTLR start "rule__Pipeline__Group_7_1_1__1__Impl"
    // InternalPipelineParser.g:2348:1: rule__Pipeline__Group_7_1_1__1__Impl : ( RULE_END ) ;
    public final void rule__Pipeline__Group_7_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2352:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:2353:1: ( RULE_END )
            {
            // InternalPipelineParser.g:2353:1: ( RULE_END )
            // InternalPipelineParser.g:2354:2: RULE_END
            {
             before(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_7_1_1_1()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_7_1_1_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_7_1_1__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_7_1_1_0__0"
    // InternalPipelineParser.g:2364:1: rule__Pipeline__Group_7_1_1_0__0 : rule__Pipeline__Group_7_1_1_0__0__Impl rule__Pipeline__Group_7_1_1_0__1 ;
    public final void rule__Pipeline__Group_7_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2368:1: ( rule__Pipeline__Group_7_1_1_0__0__Impl rule__Pipeline__Group_7_1_1_0__1 )
            // InternalPipelineParser.g:2369:2: rule__Pipeline__Group_7_1_1_0__0__Impl rule__Pipeline__Group_7_1_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Pipeline__Group_7_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_1_0__1();

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
    // $ANTLR end "rule__Pipeline__Group_7_1_1_0__0"


    // $ANTLR start "rule__Pipeline__Group_7_1_1_0__0__Impl"
    // InternalPipelineParser.g:2376:1: rule__Pipeline__Group_7_1_1_0__0__Impl : ( Demands ) ;
    public final void rule__Pipeline__Group_7_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2380:1: ( ( Demands ) )
            // InternalPipelineParser.g:2381:1: ( Demands )
            {
            // InternalPipelineParser.g:2381:1: ( Demands )
            // InternalPipelineParser.g:2382:2: Demands
            {
             before(grammarAccess.getPipelineAccess().getDemandsKeyword_7_1_1_0_0()); 
            match(input,Demands,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getDemandsKeyword_7_1_1_0_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_7_1_1_0__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_7_1_1_0__1"
    // InternalPipelineParser.g:2391:1: rule__Pipeline__Group_7_1_1_0__1 : rule__Pipeline__Group_7_1_1_0__1__Impl ;
    public final void rule__Pipeline__Group_7_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2395:1: ( rule__Pipeline__Group_7_1_1_0__1__Impl )
            // InternalPipelineParser.g:2396:2: rule__Pipeline__Group_7_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_7_1_1_0__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_7_1_1_0__1"


    // $ANTLR start "rule__Pipeline__Group_7_1_1_0__1__Impl"
    // InternalPipelineParser.g:2402:1: rule__Pipeline__Group_7_1_1_0__1__Impl : ( ( rule__Pipeline__VmDemandsAssignment_7_1_1_0_1 ) ) ;
    public final void rule__Pipeline__Group_7_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2406:1: ( ( ( rule__Pipeline__VmDemandsAssignment_7_1_1_0_1 ) ) )
            // InternalPipelineParser.g:2407:1: ( ( rule__Pipeline__VmDemandsAssignment_7_1_1_0_1 ) )
            {
            // InternalPipelineParser.g:2407:1: ( ( rule__Pipeline__VmDemandsAssignment_7_1_1_0_1 ) )
            // InternalPipelineParser.g:2408:2: ( rule__Pipeline__VmDemandsAssignment_7_1_1_0_1 )
            {
             before(grammarAccess.getPipelineAccess().getVmDemandsAssignment_7_1_1_0_1()); 
            // InternalPipelineParser.g:2409:2: ( rule__Pipeline__VmDemandsAssignment_7_1_1_0_1 )
            // InternalPipelineParser.g:2409:3: rule__Pipeline__VmDemandsAssignment_7_1_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__VmDemandsAssignment_7_1_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getVmDemandsAssignment_7_1_1_0_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_7_1_1_0__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_8__0"
    // InternalPipelineParser.g:2418:1: rule__Pipeline__Group_8__0 : rule__Pipeline__Group_8__0__Impl rule__Pipeline__Group_8__1 ;
    public final void rule__Pipeline__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2422:1: ( rule__Pipeline__Group_8__0__Impl rule__Pipeline__Group_8__1 )
            // InternalPipelineParser.g:2423:2: rule__Pipeline__Group_8__0__Impl rule__Pipeline__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__Pipeline__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_8__1();

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
    // $ANTLR end "rule__Pipeline__Group_8__0"


    // $ANTLR start "rule__Pipeline__Group_8__0__Impl"
    // InternalPipelineParser.g:2430:1: rule__Pipeline__Group_8__0__Impl : ( Resources ) ;
    public final void rule__Pipeline__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2434:1: ( ( Resources ) )
            // InternalPipelineParser.g:2435:1: ( Resources )
            {
            // InternalPipelineParser.g:2435:1: ( Resources )
            // InternalPipelineParser.g:2436:2: Resources
            {
             before(grammarAccess.getPipelineAccess().getResourcesKeyword_8_0()); 
            match(input,Resources,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getResourcesKeyword_8_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_8__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_8__1"
    // InternalPipelineParser.g:2445:1: rule__Pipeline__Group_8__1 : rule__Pipeline__Group_8__1__Impl ;
    public final void rule__Pipeline__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2449:1: ( rule__Pipeline__Group_8__1__Impl )
            // InternalPipelineParser.g:2450:2: rule__Pipeline__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_8__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_8__1"


    // $ANTLR start "rule__Pipeline__Group_8__1__Impl"
    // InternalPipelineParser.g:2456:1: rule__Pipeline__Group_8__1__Impl : ( ( rule__Pipeline__Group_8_1__0 ) ) ;
    public final void rule__Pipeline__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2460:1: ( ( ( rule__Pipeline__Group_8_1__0 ) ) )
            // InternalPipelineParser.g:2461:1: ( ( rule__Pipeline__Group_8_1__0 ) )
            {
            // InternalPipelineParser.g:2461:1: ( ( rule__Pipeline__Group_8_1__0 ) )
            // InternalPipelineParser.g:2462:2: ( rule__Pipeline__Group_8_1__0 )
            {
             before(grammarAccess.getPipelineAccess().getGroup_8_1()); 
            // InternalPipelineParser.g:2463:2: ( rule__Pipeline__Group_8_1__0 )
            // InternalPipelineParser.g:2463:3: rule__Pipeline__Group_8_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_8_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getGroup_8_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_8__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_8_1__0"
    // InternalPipelineParser.g:2472:1: rule__Pipeline__Group_8_1__0 : rule__Pipeline__Group_8_1__0__Impl rule__Pipeline__Group_8_1__1 ;
    public final void rule__Pipeline__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2476:1: ( rule__Pipeline__Group_8_1__0__Impl rule__Pipeline__Group_8_1__1 )
            // InternalPipelineParser.g:2477:2: rule__Pipeline__Group_8_1__0__Impl rule__Pipeline__Group_8_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Pipeline__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_8_1__1();

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
    // $ANTLR end "rule__Pipeline__Group_8_1__0"


    // $ANTLR start "rule__Pipeline__Group_8_1__0__Impl"
    // InternalPipelineParser.g:2484:1: rule__Pipeline__Group_8_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Pipeline__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2488:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:2489:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:2489:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:2490:2: RULE_BEGIN
            {
             before(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_8_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_8_1__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_8_1__1"
    // InternalPipelineParser.g:2499:1: rule__Pipeline__Group_8_1__1 : rule__Pipeline__Group_8_1__1__Impl rule__Pipeline__Group_8_1__2 ;
    public final void rule__Pipeline__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2503:1: ( rule__Pipeline__Group_8_1__1__Impl rule__Pipeline__Group_8_1__2 )
            // InternalPipelineParser.g:2504:2: rule__Pipeline__Group_8_1__1__Impl rule__Pipeline__Group_8_1__2
            {
            pushFollow(FOLLOW_26);
            rule__Pipeline__Group_8_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_8_1__2();

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
    // $ANTLR end "rule__Pipeline__Group_8_1__1"


    // $ANTLR start "rule__Pipeline__Group_8_1__1__Impl"
    // InternalPipelineParser.g:2511:1: rule__Pipeline__Group_8_1__1__Impl : ( ( rule__Pipeline__ResourcesAssignment_8_1_1 )* ) ;
    public final void rule__Pipeline__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2515:1: ( ( ( rule__Pipeline__ResourcesAssignment_8_1_1 )* ) )
            // InternalPipelineParser.g:2516:1: ( ( rule__Pipeline__ResourcesAssignment_8_1_1 )* )
            {
            // InternalPipelineParser.g:2516:1: ( ( rule__Pipeline__ResourcesAssignment_8_1_1 )* )
            // InternalPipelineParser.g:2517:2: ( rule__Pipeline__ResourcesAssignment_8_1_1 )*
            {
             before(grammarAccess.getPipelineAccess().getResourcesAssignment_8_1_1()); 
            // InternalPipelineParser.g:2518:2: ( rule__Pipeline__ResourcesAssignment_8_1_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Repositories||LA29_0==Containers||LA29_0==Pipelines||LA29_0==Packages||LA29_0==Webhooks||LA29_0==Builds) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPipelineParser.g:2518:3: rule__Pipeline__ResourcesAssignment_8_1_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Pipeline__ResourcesAssignment_8_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getPipelineAccess().getResourcesAssignment_8_1_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_8_1__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_8_1__2"
    // InternalPipelineParser.g:2526:1: rule__Pipeline__Group_8_1__2 : rule__Pipeline__Group_8_1__2__Impl ;
    public final void rule__Pipeline__Group_8_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2530:1: ( rule__Pipeline__Group_8_1__2__Impl )
            // InternalPipelineParser.g:2531:2: rule__Pipeline__Group_8_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_8_1__2__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_8_1__2"


    // $ANTLR start "rule__Pipeline__Group_8_1__2__Impl"
    // InternalPipelineParser.g:2537:1: rule__Pipeline__Group_8_1__2__Impl : ( RULE_END ) ;
    public final void rule__Pipeline__Group_8_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2541:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:2542:1: ( RULE_END )
            {
            // InternalPipelineParser.g:2542:1: ( RULE_END )
            // InternalPipelineParser.g:2543:2: RULE_END
            {
             before(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_8_1_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getENDTerminalRuleCall_8_1_2()); 

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
    // $ANTLR end "rule__Pipeline__Group_8_1__2__Impl"


    // $ANTLR start "rule__Pipeline__Group_9__0"
    // InternalPipelineParser.g:2553:1: rule__Pipeline__Group_9__0 : rule__Pipeline__Group_9__0__Impl rule__Pipeline__Group_9__1 ;
    public final void rule__Pipeline__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2557:1: ( rule__Pipeline__Group_9__0__Impl rule__Pipeline__Group_9__1 )
            // InternalPipelineParser.g:2558:2: rule__Pipeline__Group_9__0__Impl rule__Pipeline__Group_9__1
            {
            pushFollow(FOLLOW_20);
            rule__Pipeline__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_9__1();

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
    // $ANTLR end "rule__Pipeline__Group_9__0"


    // $ANTLR start "rule__Pipeline__Group_9__0__Impl"
    // InternalPipelineParser.g:2565:1: rule__Pipeline__Group_9__0__Impl : ( Default ) ;
    public final void rule__Pipeline__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2569:1: ( ( Default ) )
            // InternalPipelineParser.g:2570:1: ( Default )
            {
            // InternalPipelineParser.g:2570:1: ( Default )
            // InternalPipelineParser.g:2571:2: Default
            {
             before(grammarAccess.getPipelineAccess().getDefaultKeyword_9_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getDefaultKeyword_9_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_9__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_9__1"
    // InternalPipelineParser.g:2580:1: rule__Pipeline__Group_9__1 : rule__Pipeline__Group_9__1__Impl ;
    public final void rule__Pipeline__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2584:1: ( rule__Pipeline__Group_9__1__Impl )
            // InternalPipelineParser.g:2585:2: rule__Pipeline__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_9__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_9__1"


    // $ANTLR start "rule__Pipeline__Group_9__1__Impl"
    // InternalPipelineParser.g:2591:1: rule__Pipeline__Group_9__1__Impl : ( ( rule__Pipeline__PipelineParametersAssignment_9_1 ) ) ;
    public final void rule__Pipeline__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2595:1: ( ( ( rule__Pipeline__PipelineParametersAssignment_9_1 ) ) )
            // InternalPipelineParser.g:2596:1: ( ( rule__Pipeline__PipelineParametersAssignment_9_1 ) )
            {
            // InternalPipelineParser.g:2596:1: ( ( rule__Pipeline__PipelineParametersAssignment_9_1 ) )
            // InternalPipelineParser.g:2597:2: ( rule__Pipeline__PipelineParametersAssignment_9_1 )
            {
             before(grammarAccess.getPipelineAccess().getPipelineParametersAssignment_9_1()); 
            // InternalPipelineParser.g:2598:2: ( rule__Pipeline__PipelineParametersAssignment_9_1 )
            // InternalPipelineParser.g:2598:3: rule__Pipeline__PipelineParametersAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__PipelineParametersAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getPipelineParametersAssignment_9_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_9__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_10__0"
    // InternalPipelineParser.g:2607:1: rule__Pipeline__Group_10__0 : rule__Pipeline__Group_10__0__Impl rule__Pipeline__Group_10__1 ;
    public final void rule__Pipeline__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2611:1: ( rule__Pipeline__Group_10__0__Impl rule__Pipeline__Group_10__1 )
            // InternalPipelineParser.g:2612:2: rule__Pipeline__Group_10__0__Impl rule__Pipeline__Group_10__1
            {
            pushFollow(FOLLOW_28);
            rule__Pipeline__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_10__1();

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
    // $ANTLR end "rule__Pipeline__Group_10__0"


    // $ANTLR start "rule__Pipeline__Group_10__0__Impl"
    // InternalPipelineParser.g:2619:1: rule__Pipeline__Group_10__0__Impl : ( Variables ) ;
    public final void rule__Pipeline__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2623:1: ( ( Variables ) )
            // InternalPipelineParser.g:2624:1: ( Variables )
            {
            // InternalPipelineParser.g:2624:1: ( Variables )
            // InternalPipelineParser.g:2625:2: Variables
            {
             before(grammarAccess.getPipelineAccess().getVariablesKeyword_10_0()); 
            match(input,Variables,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getVariablesKeyword_10_0()); 

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
    // $ANTLR end "rule__Pipeline__Group_10__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_10__1"
    // InternalPipelineParser.g:2634:1: rule__Pipeline__Group_10__1 : rule__Pipeline__Group_10__1__Impl ;
    public final void rule__Pipeline__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2638:1: ( rule__Pipeline__Group_10__1__Impl )
            // InternalPipelineParser.g:2639:2: rule__Pipeline__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_10__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_10__1"


    // $ANTLR start "rule__Pipeline__Group_10__1__Impl"
    // InternalPipelineParser.g:2645:1: rule__Pipeline__Group_10__1__Impl : ( ( rule__Pipeline__VariablesAssignment_10_1 )* ) ;
    public final void rule__Pipeline__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2649:1: ( ( ( rule__Pipeline__VariablesAssignment_10_1 )* ) )
            // InternalPipelineParser.g:2650:1: ( ( rule__Pipeline__VariablesAssignment_10_1 )* )
            {
            // InternalPipelineParser.g:2650:1: ( ( rule__Pipeline__VariablesAssignment_10_1 )* )
            // InternalPipelineParser.g:2651:2: ( rule__Pipeline__VariablesAssignment_10_1 )*
            {
             before(grammarAccess.getPipelineAccess().getVariablesAssignment_10_1()); 
            // InternalPipelineParser.g:2652:2: ( rule__Pipeline__VariablesAssignment_10_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==HyphenMinus||LA30_0==RULE_BEGIN) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPipelineParser.g:2652:3: rule__Pipeline__VariablesAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Pipeline__VariablesAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getPipelineAccess().getVariablesAssignment_10_1()); 

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
    // $ANTLR end "rule__Pipeline__Group_10__1__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0__0"
    // InternalPipelineParser.g:2661:1: rule__ExtendedParameter__Group_0__0 : rule__ExtendedParameter__Group_0__0__Impl rule__ExtendedParameter__Group_0__1 ;
    public final void rule__ExtendedParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2665:1: ( rule__ExtendedParameter__Group_0__0__Impl rule__ExtendedParameter__Group_0__1 )
            // InternalPipelineParser.g:2666:2: rule__ExtendedParameter__Group_0__0__Impl rule__ExtendedParameter__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__ExtendedParameter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0__1();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0__0"


    // $ANTLR start "rule__ExtendedParameter__Group_0__0__Impl"
    // InternalPipelineParser.g:2673:1: rule__ExtendedParameter__Group_0__0__Impl : ( Extends ) ;
    public final void rule__ExtendedParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2677:1: ( ( Extends ) )
            // InternalPipelineParser.g:2678:1: ( Extends )
            {
            // InternalPipelineParser.g:2678:1: ( Extends )
            // InternalPipelineParser.g:2679:2: Extends
            {
             before(grammarAccess.getExtendedParameterAccess().getExtendsKeyword_0_0()); 
            match(input,Extends,FOLLOW_2); 
             after(grammarAccess.getExtendedParameterAccess().getExtendsKeyword_0_0()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0__0__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0__1"
    // InternalPipelineParser.g:2688:1: rule__ExtendedParameter__Group_0__1 : rule__ExtendedParameter__Group_0__1__Impl ;
    public final void rule__ExtendedParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2692:1: ( rule__ExtendedParameter__Group_0__1__Impl )
            // InternalPipelineParser.g:2693:2: rule__ExtendedParameter__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0__1__Impl();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0__1"


    // $ANTLR start "rule__ExtendedParameter__Group_0__1__Impl"
    // InternalPipelineParser.g:2699:1: rule__ExtendedParameter__Group_0__1__Impl : ( ( rule__ExtendedParameter__Group_0_1__0 ) ) ;
    public final void rule__ExtendedParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2703:1: ( ( ( rule__ExtendedParameter__Group_0_1__0 ) ) )
            // InternalPipelineParser.g:2704:1: ( ( rule__ExtendedParameter__Group_0_1__0 ) )
            {
            // InternalPipelineParser.g:2704:1: ( ( rule__ExtendedParameter__Group_0_1__0 ) )
            // InternalPipelineParser.g:2705:2: ( rule__ExtendedParameter__Group_0_1__0 )
            {
             before(grammarAccess.getExtendedParameterAccess().getGroup_0_1()); 
            // InternalPipelineParser.g:2706:2: ( rule__ExtendedParameter__Group_0_1__0 )
            // InternalPipelineParser.g:2706:3: rule__ExtendedParameter__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedParameterAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0__1__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1__0"
    // InternalPipelineParser.g:2715:1: rule__ExtendedParameter__Group_0_1__0 : rule__ExtendedParameter__Group_0_1__0__Impl rule__ExtendedParameter__Group_0_1__1 ;
    public final void rule__ExtendedParameter__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2719:1: ( rule__ExtendedParameter__Group_0_1__0__Impl rule__ExtendedParameter__Group_0_1__1 )
            // InternalPipelineParser.g:2720:2: rule__ExtendedParameter__Group_0_1__0__Impl rule__ExtendedParameter__Group_0_1__1
            {
            pushFollow(FOLLOW_30);
            rule__ExtendedParameter__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1__1();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1__0"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1__0__Impl"
    // InternalPipelineParser.g:2727:1: rule__ExtendedParameter__Group_0_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__ExtendedParameter__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2731:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:2732:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:2732:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:2733:2: RULE_BEGIN
            {
             before(grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1__0__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1__1"
    // InternalPipelineParser.g:2742:1: rule__ExtendedParameter__Group_0_1__1 : rule__ExtendedParameter__Group_0_1__1__Impl rule__ExtendedParameter__Group_0_1__2 ;
    public final void rule__ExtendedParameter__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2746:1: ( rule__ExtendedParameter__Group_0_1__1__Impl rule__ExtendedParameter__Group_0_1__2 )
            // InternalPipelineParser.g:2747:2: rule__ExtendedParameter__Group_0_1__1__Impl rule__ExtendedParameter__Group_0_1__2
            {
            pushFollow(FOLLOW_31);
            rule__ExtendedParameter__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1__2();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1__1"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1__1__Impl"
    // InternalPipelineParser.g:2754:1: rule__ExtendedParameter__Group_0_1__1__Impl : ( ( rule__ExtendedParameter__Group_0_1_1__0 ) ) ;
    public final void rule__ExtendedParameter__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2758:1: ( ( ( rule__ExtendedParameter__Group_0_1_1__0 ) ) )
            // InternalPipelineParser.g:2759:1: ( ( rule__ExtendedParameter__Group_0_1_1__0 ) )
            {
            // InternalPipelineParser.g:2759:1: ( ( rule__ExtendedParameter__Group_0_1_1__0 ) )
            // InternalPipelineParser.g:2760:2: ( rule__ExtendedParameter__Group_0_1_1__0 )
            {
             before(grammarAccess.getExtendedParameterAccess().getGroup_0_1_1()); 
            // InternalPipelineParser.g:2761:2: ( rule__ExtendedParameter__Group_0_1_1__0 )
            // InternalPipelineParser.g:2761:3: rule__ExtendedParameter__Group_0_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedParameterAccess().getGroup_0_1_1()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1__1__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1__2"
    // InternalPipelineParser.g:2769:1: rule__ExtendedParameter__Group_0_1__2 : rule__ExtendedParameter__Group_0_1__2__Impl rule__ExtendedParameter__Group_0_1__3 ;
    public final void rule__ExtendedParameter__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2773:1: ( rule__ExtendedParameter__Group_0_1__2__Impl rule__ExtendedParameter__Group_0_1__3 )
            // InternalPipelineParser.g:2774:2: rule__ExtendedParameter__Group_0_1__2__Impl rule__ExtendedParameter__Group_0_1__3
            {
            pushFollow(FOLLOW_9);
            rule__ExtendedParameter__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1__3();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1__2"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1__2__Impl"
    // InternalPipelineParser.g:2781:1: rule__ExtendedParameter__Group_0_1__2__Impl : ( ( rule__ExtendedParameter__Group_0_1_2__0 ) ) ;
    public final void rule__ExtendedParameter__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2785:1: ( ( ( rule__ExtendedParameter__Group_0_1_2__0 ) ) )
            // InternalPipelineParser.g:2786:1: ( ( rule__ExtendedParameter__Group_0_1_2__0 ) )
            {
            // InternalPipelineParser.g:2786:1: ( ( rule__ExtendedParameter__Group_0_1_2__0 ) )
            // InternalPipelineParser.g:2787:2: ( rule__ExtendedParameter__Group_0_1_2__0 )
            {
             before(grammarAccess.getExtendedParameterAccess().getGroup_0_1_2()); 
            // InternalPipelineParser.g:2788:2: ( rule__ExtendedParameter__Group_0_1_2__0 )
            // InternalPipelineParser.g:2788:3: rule__ExtendedParameter__Group_0_1_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedParameterAccess().getGroup_0_1_2()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1__2__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1__3"
    // InternalPipelineParser.g:2796:1: rule__ExtendedParameter__Group_0_1__3 : rule__ExtendedParameter__Group_0_1__3__Impl ;
    public final void rule__ExtendedParameter__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2800:1: ( rule__ExtendedParameter__Group_0_1__3__Impl )
            // InternalPipelineParser.g:2801:2: rule__ExtendedParameter__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1__3__Impl();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1__3"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1__3__Impl"
    // InternalPipelineParser.g:2807:1: rule__ExtendedParameter__Group_0_1__3__Impl : ( RULE_END ) ;
    public final void rule__ExtendedParameter__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2811:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:2812:1: ( RULE_END )
            {
            // InternalPipelineParser.g:2812:1: ( RULE_END )
            // InternalPipelineParser.g:2813:2: RULE_END
            {
             before(grammarAccess.getExtendedParameterAccess().getENDTerminalRuleCall_0_1_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getExtendedParameterAccess().getENDTerminalRuleCall_0_1_3()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1__3__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_1__0"
    // InternalPipelineParser.g:2823:1: rule__ExtendedParameter__Group_0_1_1__0 : rule__ExtendedParameter__Group_0_1_1__0__Impl rule__ExtendedParameter__Group_0_1_1__1 ;
    public final void rule__ExtendedParameter__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2827:1: ( rule__ExtendedParameter__Group_0_1_1__0__Impl rule__ExtendedParameter__Group_0_1_1__1 )
            // InternalPipelineParser.g:2828:2: rule__ExtendedParameter__Group_0_1_1__0__Impl rule__ExtendedParameter__Group_0_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__ExtendedParameter__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1_1__1();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_1__0"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_1__0__Impl"
    // InternalPipelineParser.g:2835:1: rule__ExtendedParameter__Group_0_1_1__0__Impl : ( Template ) ;
    public final void rule__ExtendedParameter__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2839:1: ( ( Template ) )
            // InternalPipelineParser.g:2840:1: ( Template )
            {
            // InternalPipelineParser.g:2840:1: ( Template )
            // InternalPipelineParser.g:2841:2: Template
            {
             before(grammarAccess.getExtendedParameterAccess().getTemplateKeyword_0_1_1_0()); 
            match(input,Template,FOLLOW_2); 
             after(grammarAccess.getExtendedParameterAccess().getTemplateKeyword_0_1_1_0()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_1__1"
    // InternalPipelineParser.g:2850:1: rule__ExtendedParameter__Group_0_1_1__1 : rule__ExtendedParameter__Group_0_1_1__1__Impl ;
    public final void rule__ExtendedParameter__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2854:1: ( rule__ExtendedParameter__Group_0_1_1__1__Impl )
            // InternalPipelineParser.g:2855:2: rule__ExtendedParameter__Group_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1_1__1__Impl();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_1__1"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_1__1__Impl"
    // InternalPipelineParser.g:2861:1: rule__ExtendedParameter__Group_0_1_1__1__Impl : ( ( rule__ExtendedParameter__TemplateAssignment_0_1_1_1 ) ) ;
    public final void rule__ExtendedParameter__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2865:1: ( ( ( rule__ExtendedParameter__TemplateAssignment_0_1_1_1 ) ) )
            // InternalPipelineParser.g:2866:1: ( ( rule__ExtendedParameter__TemplateAssignment_0_1_1_1 ) )
            {
            // InternalPipelineParser.g:2866:1: ( ( rule__ExtendedParameter__TemplateAssignment_0_1_1_1 ) )
            // InternalPipelineParser.g:2867:2: ( rule__ExtendedParameter__TemplateAssignment_0_1_1_1 )
            {
             before(grammarAccess.getExtendedParameterAccess().getTemplateAssignment_0_1_1_1()); 
            // InternalPipelineParser.g:2868:2: ( rule__ExtendedParameter__TemplateAssignment_0_1_1_1 )
            // InternalPipelineParser.g:2868:3: rule__ExtendedParameter__TemplateAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__TemplateAssignment_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendedParameterAccess().getTemplateAssignment_0_1_1_1()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_2__0"
    // InternalPipelineParser.g:2877:1: rule__ExtendedParameter__Group_0_1_2__0 : rule__ExtendedParameter__Group_0_1_2__0__Impl rule__ExtendedParameter__Group_0_1_2__1 ;
    public final void rule__ExtendedParameter__Group_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2881:1: ( rule__ExtendedParameter__Group_0_1_2__0__Impl rule__ExtendedParameter__Group_0_1_2__1 )
            // InternalPipelineParser.g:2882:2: rule__ExtendedParameter__Group_0_1_2__0__Impl rule__ExtendedParameter__Group_0_1_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ExtendedParameter__Group_0_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1_2__1();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_2__0"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_2__0__Impl"
    // InternalPipelineParser.g:2889:1: rule__ExtendedParameter__Group_0_1_2__0__Impl : ( Parameters ) ;
    public final void rule__ExtendedParameter__Group_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2893:1: ( ( Parameters ) )
            // InternalPipelineParser.g:2894:1: ( Parameters )
            {
            // InternalPipelineParser.g:2894:1: ( Parameters )
            // InternalPipelineParser.g:2895:2: Parameters
            {
             before(grammarAccess.getExtendedParameterAccess().getParametersKeyword_0_1_2_0()); 
            match(input,Parameters,FOLLOW_2); 
             after(grammarAccess.getExtendedParameterAccess().getParametersKeyword_0_1_2_0()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_2__0__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_2__1"
    // InternalPipelineParser.g:2904:1: rule__ExtendedParameter__Group_0_1_2__1 : rule__ExtendedParameter__Group_0_1_2__1__Impl ;
    public final void rule__ExtendedParameter__Group_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2908:1: ( rule__ExtendedParameter__Group_0_1_2__1__Impl )
            // InternalPipelineParser.g:2909:2: rule__ExtendedParameter__Group_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1_2__1__Impl();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_2__1"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_2__1__Impl"
    // InternalPipelineParser.g:2915:1: rule__ExtendedParameter__Group_0_1_2__1__Impl : ( ( rule__ExtendedParameter__Group_0_1_2_1__0 ) ) ;
    public final void rule__ExtendedParameter__Group_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2919:1: ( ( ( rule__ExtendedParameter__Group_0_1_2_1__0 ) ) )
            // InternalPipelineParser.g:2920:1: ( ( rule__ExtendedParameter__Group_0_1_2_1__0 ) )
            {
            // InternalPipelineParser.g:2920:1: ( ( rule__ExtendedParameter__Group_0_1_2_1__0 ) )
            // InternalPipelineParser.g:2921:2: ( rule__ExtendedParameter__Group_0_1_2_1__0 )
            {
             before(grammarAccess.getExtendedParameterAccess().getGroup_0_1_2_1()); 
            // InternalPipelineParser.g:2922:2: ( rule__ExtendedParameter__Group_0_1_2_1__0 )
            // InternalPipelineParser.g:2922:3: rule__ExtendedParameter__Group_0_1_2_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedParameterAccess().getGroup_0_1_2_1()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_2__1__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_2_1__0"
    // InternalPipelineParser.g:2931:1: rule__ExtendedParameter__Group_0_1_2_1__0 : rule__ExtendedParameter__Group_0_1_2_1__0__Impl rule__ExtendedParameter__Group_0_1_2_1__1 ;
    public final void rule__ExtendedParameter__Group_0_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2935:1: ( rule__ExtendedParameter__Group_0_1_2_1__0__Impl rule__ExtendedParameter__Group_0_1_2_1__1 )
            // InternalPipelineParser.g:2936:2: rule__ExtendedParameter__Group_0_1_2_1__0__Impl rule__ExtendedParameter__Group_0_1_2_1__1
            {
            pushFollow(FOLLOW_32);
            rule__ExtendedParameter__Group_0_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1_2_1__1();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_2_1__0"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_2_1__0__Impl"
    // InternalPipelineParser.g:2943:1: rule__ExtendedParameter__Group_0_1_2_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__ExtendedParameter__Group_0_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2947:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:2948:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:2948:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:2949:2: RULE_BEGIN
            {
             before(grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_2_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_2_1_0()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_2_1__0__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_2_1__1"
    // InternalPipelineParser.g:2958:1: rule__ExtendedParameter__Group_0_1_2_1__1 : rule__ExtendedParameter__Group_0_1_2_1__1__Impl rule__ExtendedParameter__Group_0_1_2_1__2 ;
    public final void rule__ExtendedParameter__Group_0_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2962:1: ( rule__ExtendedParameter__Group_0_1_2_1__1__Impl rule__ExtendedParameter__Group_0_1_2_1__2 )
            // InternalPipelineParser.g:2963:2: rule__ExtendedParameter__Group_0_1_2_1__1__Impl rule__ExtendedParameter__Group_0_1_2_1__2
            {
            pushFollow(FOLLOW_32);
            rule__ExtendedParameter__Group_0_1_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1_2_1__2();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_2_1__1"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_2_1__1__Impl"
    // InternalPipelineParser.g:2970:1: rule__ExtendedParameter__Group_0_1_2_1__1__Impl : ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1 )* ) ;
    public final void rule__ExtendedParameter__Group_0_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2974:1: ( ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1 )* ) )
            // InternalPipelineParser.g:2975:1: ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1 )* )
            {
            // InternalPipelineParser.g:2975:1: ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1 )* )
            // InternalPipelineParser.g:2976:2: ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1 )*
            {
             before(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesAssignment_0_1_2_1_1()); 
            // InternalPipelineParser.g:2977:2: ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==WriteAll||LA31_0==ReadAll||LA31_0==Write||(LA31_0>=None && LA31_0<=Read)||LA31_0==HyphenMinus||LA31_0==RULE_COMPLEX_EXPRESSION||LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPipelineParser.g:2977:3: rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesAssignment_0_1_2_1_1()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_2_1__1__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_2_1__2"
    // InternalPipelineParser.g:2985:1: rule__ExtendedParameter__Group_0_1_2_1__2 : rule__ExtendedParameter__Group_0_1_2_1__2__Impl ;
    public final void rule__ExtendedParameter__Group_0_1_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:2989:1: ( rule__ExtendedParameter__Group_0_1_2_1__2__Impl )
            // InternalPipelineParser.g:2990:2: rule__ExtendedParameter__Group_0_1_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_0_1_2_1__2__Impl();

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_2_1__2"


    // $ANTLR start "rule__ExtendedParameter__Group_0_1_2_1__2__Impl"
    // InternalPipelineParser.g:2996:1: rule__ExtendedParameter__Group_0_1_2_1__2__Impl : ( RULE_END ) ;
    public final void rule__ExtendedParameter__Group_0_1_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3000:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:3001:1: ( RULE_END )
            {
            // InternalPipelineParser.g:3001:1: ( RULE_END )
            // InternalPipelineParser.g:3002:2: RULE_END
            {
             before(grammarAccess.getExtendedParameterAccess().getENDTerminalRuleCall_0_1_2_1_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getExtendedParameterAccess().getENDTerminalRuleCall_0_1_2_1_2()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_0_1_2_1__2__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_1__0"
    // InternalPipelineParser.g:3012:1: rule__ExtendedParameter__Group_1__0 : rule__ExtendedParameter__Group_1__0__Impl rule__ExtendedParameter__Group_1__1 ;
    public final void rule__ExtendedParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3016:1: ( rule__ExtendedParameter__Group_1__0__Impl rule__ExtendedParameter__Group_1__1 )
            // InternalPipelineParser.g:3017:2: rule__ExtendedParameter__Group_1__0__Impl rule__ExtendedParameter__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ExtendedParameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_1__1();

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
    // $ANTLR end "rule__ExtendedParameter__Group_1__0"


    // $ANTLR start "rule__ExtendedParameter__Group_1__0__Impl"
    // InternalPipelineParser.g:3024:1: rule__ExtendedParameter__Group_1__0__Impl : ( Include ) ;
    public final void rule__ExtendedParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3028:1: ( ( Include ) )
            // InternalPipelineParser.g:3029:1: ( Include )
            {
            // InternalPipelineParser.g:3029:1: ( Include )
            // InternalPipelineParser.g:3030:2: Include
            {
             before(grammarAccess.getExtendedParameterAccess().getIncludeKeyword_1_0()); 
            match(input,Include,FOLLOW_2); 
             after(grammarAccess.getExtendedParameterAccess().getIncludeKeyword_1_0()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_1__0__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_1__1"
    // InternalPipelineParser.g:3039:1: rule__ExtendedParameter__Group_1__1 : rule__ExtendedParameter__Group_1__1__Impl ;
    public final void rule__ExtendedParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3043:1: ( rule__ExtendedParameter__Group_1__1__Impl )
            // InternalPipelineParser.g:3044:2: rule__ExtendedParameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExtendedParameter__Group_1__1"


    // $ANTLR start "rule__ExtendedParameter__Group_1__1__Impl"
    // InternalPipelineParser.g:3050:1: rule__ExtendedParameter__Group_1__1__Impl : ( ( rule__ExtendedParameter__Group_1_1__0 ) ) ;
    public final void rule__ExtendedParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3054:1: ( ( ( rule__ExtendedParameter__Group_1_1__0 ) ) )
            // InternalPipelineParser.g:3055:1: ( ( rule__ExtendedParameter__Group_1_1__0 ) )
            {
            // InternalPipelineParser.g:3055:1: ( ( rule__ExtendedParameter__Group_1_1__0 ) )
            // InternalPipelineParser.g:3056:2: ( rule__ExtendedParameter__Group_1_1__0 )
            {
             before(grammarAccess.getExtendedParameterAccess().getGroup_1_1()); 
            // InternalPipelineParser.g:3057:2: ( rule__ExtendedParameter__Group_1_1__0 )
            // InternalPipelineParser.g:3057:3: rule__ExtendedParameter__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedParameterAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_1__1__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_1_1__0"
    // InternalPipelineParser.g:3066:1: rule__ExtendedParameter__Group_1_1__0 : rule__ExtendedParameter__Group_1_1__0__Impl rule__ExtendedParameter__Group_1_1__1 ;
    public final void rule__ExtendedParameter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3070:1: ( rule__ExtendedParameter__Group_1_1__0__Impl rule__ExtendedParameter__Group_1_1__1 )
            // InternalPipelineParser.g:3071:2: rule__ExtendedParameter__Group_1_1__0__Impl rule__ExtendedParameter__Group_1_1__1
            {
            pushFollow(FOLLOW_34);
            rule__ExtendedParameter__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_1_1__1();

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
    // $ANTLR end "rule__ExtendedParameter__Group_1_1__0"


    // $ANTLR start "rule__ExtendedParameter__Group_1_1__0__Impl"
    // InternalPipelineParser.g:3078:1: rule__ExtendedParameter__Group_1_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__ExtendedParameter__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3082:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:3083:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:3083:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:3084:2: RULE_BEGIN
            {
             before(grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_1_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_1_1__1"
    // InternalPipelineParser.g:3093:1: rule__ExtendedParameter__Group_1_1__1 : rule__ExtendedParameter__Group_1_1__1__Impl rule__ExtendedParameter__Group_1_1__2 ;
    public final void rule__ExtendedParameter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3097:1: ( rule__ExtendedParameter__Group_1_1__1__Impl rule__ExtendedParameter__Group_1_1__2 )
            // InternalPipelineParser.g:3098:2: rule__ExtendedParameter__Group_1_1__1__Impl rule__ExtendedParameter__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
            rule__ExtendedParameter__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_1_1__2();

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
    // $ANTLR end "rule__ExtendedParameter__Group_1_1__1"


    // $ANTLR start "rule__ExtendedParameter__Group_1_1__1__Impl"
    // InternalPipelineParser.g:3105:1: rule__ExtendedParameter__Group_1_1__1__Impl : ( ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 ) ) ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 )* ) ) ;
    public final void rule__ExtendedParameter__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3109:1: ( ( ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 ) ) ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 )* ) ) )
            // InternalPipelineParser.g:3110:1: ( ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 ) ) ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 )* ) )
            {
            // InternalPipelineParser.g:3110:1: ( ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 ) ) ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 )* ) )
            // InternalPipelineParser.g:3111:2: ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 ) ) ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 )* )
            {
            // InternalPipelineParser.g:3111:2: ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 ) )
            // InternalPipelineParser.g:3112:3: ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 )
            {
             before(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesAssignment_1_1_1()); 
            // InternalPipelineParser.g:3113:3: ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 )
            // InternalPipelineParser.g:3113:4: rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1
            {
            pushFollow(FOLLOW_33);
            rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesAssignment_1_1_1()); 

            }

            // InternalPipelineParser.g:3116:2: ( ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 )* )
            // InternalPipelineParser.g:3117:3: ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 )*
            {
             before(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesAssignment_1_1_1()); 
            // InternalPipelineParser.g:3118:3: ( rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==WriteAll||LA32_0==ReadAll||LA32_0==Write||(LA32_0>=None && LA32_0<=Read)||LA32_0==HyphenMinus||LA32_0==RULE_COMPLEX_EXPRESSION||LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPipelineParser.g:3118:4: rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesAssignment_1_1_1()); 

            }


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
    // $ANTLR end "rule__ExtendedParameter__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExtendedParameter__Group_1_1__2"
    // InternalPipelineParser.g:3127:1: rule__ExtendedParameter__Group_1_1__2 : rule__ExtendedParameter__Group_1_1__2__Impl ;
    public final void rule__ExtendedParameter__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3131:1: ( rule__ExtendedParameter__Group_1_1__2__Impl )
            // InternalPipelineParser.g:3132:2: rule__ExtendedParameter__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedParameter__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__ExtendedParameter__Group_1_1__2"


    // $ANTLR start "rule__ExtendedParameter__Group_1_1__2__Impl"
    // InternalPipelineParser.g:3138:1: rule__ExtendedParameter__Group_1_1__2__Impl : ( RULE_END ) ;
    public final void rule__ExtendedParameter__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3142:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:3143:1: ( RULE_END )
            {
            // InternalPipelineParser.g:3143:1: ( RULE_END )
            // InternalPipelineParser.g:3144:2: RULE_END
            {
             before(grammarAccess.getExtendedParameterAccess().getENDTerminalRuleCall_1_1_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getExtendedParameterAccess().getENDTerminalRuleCall_1_1_2()); 

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
    // $ANTLR end "rule__ExtendedParameter__Group_1_1__2__Impl"


    // $ANTLR start "rule__Variable__Group_0__0"
    // InternalPipelineParser.g:3154:1: rule__Variable__Group_0__0 : rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1 ;
    public final void rule__Variable__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3158:1: ( rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1 )
            // InternalPipelineParser.g:3159:2: rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1
            {
            pushFollow(FOLLOW_34);
            rule__Variable__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_0__1();

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
    // $ANTLR end "rule__Variable__Group_0__0"


    // $ANTLR start "rule__Variable__Group_0__0__Impl"
    // InternalPipelineParser.g:3166:1: rule__Variable__Group_0__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Variable__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3170:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:3171:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:3171:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:3172:2: RULE_BEGIN
            {
             before(grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_0_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Variable__Group_0__0__Impl"


    // $ANTLR start "rule__Variable__Group_0__1"
    // InternalPipelineParser.g:3181:1: rule__Variable__Group_0__1 : rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2 ;
    public final void rule__Variable__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3185:1: ( rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2 )
            // InternalPipelineParser.g:3186:2: rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Variable__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_0__2();

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
    // $ANTLR end "rule__Variable__Group_0__1"


    // $ANTLR start "rule__Variable__Group_0__1__Impl"
    // InternalPipelineParser.g:3193:1: rule__Variable__Group_0__1__Impl : ( ( ( rule__Variable__VariableValuesAssignment_0_1 ) ) ( ( rule__Variable__VariableValuesAssignment_0_1 )* ) ) ;
    public final void rule__Variable__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3197:1: ( ( ( ( rule__Variable__VariableValuesAssignment_0_1 ) ) ( ( rule__Variable__VariableValuesAssignment_0_1 )* ) ) )
            // InternalPipelineParser.g:3198:1: ( ( ( rule__Variable__VariableValuesAssignment_0_1 ) ) ( ( rule__Variable__VariableValuesAssignment_0_1 )* ) )
            {
            // InternalPipelineParser.g:3198:1: ( ( ( rule__Variable__VariableValuesAssignment_0_1 ) ) ( ( rule__Variable__VariableValuesAssignment_0_1 )* ) )
            // InternalPipelineParser.g:3199:2: ( ( rule__Variable__VariableValuesAssignment_0_1 ) ) ( ( rule__Variable__VariableValuesAssignment_0_1 )* )
            {
            // InternalPipelineParser.g:3199:2: ( ( rule__Variable__VariableValuesAssignment_0_1 ) )
            // InternalPipelineParser.g:3200:3: ( rule__Variable__VariableValuesAssignment_0_1 )
            {
             before(grammarAccess.getVariableAccess().getVariableValuesAssignment_0_1()); 
            // InternalPipelineParser.g:3201:3: ( rule__Variable__VariableValuesAssignment_0_1 )
            // InternalPipelineParser.g:3201:4: rule__Variable__VariableValuesAssignment_0_1
            {
            pushFollow(FOLLOW_33);
            rule__Variable__VariableValuesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVariableValuesAssignment_0_1()); 

            }

            // InternalPipelineParser.g:3204:2: ( ( rule__Variable__VariableValuesAssignment_0_1 )* )
            // InternalPipelineParser.g:3205:3: ( rule__Variable__VariableValuesAssignment_0_1 )*
            {
             before(grammarAccess.getVariableAccess().getVariableValuesAssignment_0_1()); 
            // InternalPipelineParser.g:3206:3: ( rule__Variable__VariableValuesAssignment_0_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==WriteAll||LA33_0==ReadAll||LA33_0==Write||(LA33_0>=None && LA33_0<=Read)||LA33_0==HyphenMinus||LA33_0==RULE_COMPLEX_EXPRESSION||LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPipelineParser.g:3206:4: rule__Variable__VariableValuesAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Variable__VariableValuesAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getVariableValuesAssignment_0_1()); 

            }


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
    // $ANTLR end "rule__Variable__Group_0__1__Impl"


    // $ANTLR start "rule__Variable__Group_0__2"
    // InternalPipelineParser.g:3215:1: rule__Variable__Group_0__2 : rule__Variable__Group_0__2__Impl ;
    public final void rule__Variable__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3219:1: ( rule__Variable__Group_0__2__Impl )
            // InternalPipelineParser.g:3220:2: rule__Variable__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_0__2__Impl();

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
    // $ANTLR end "rule__Variable__Group_0__2"


    // $ANTLR start "rule__Variable__Group_0__2__Impl"
    // InternalPipelineParser.g:3226:1: rule__Variable__Group_0__2__Impl : ( RULE_END ) ;
    public final void rule__Variable__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3230:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:3231:1: ( RULE_END )
            {
            // InternalPipelineParser.g:3231:1: ( RULE_END )
            // InternalPipelineParser.g:3232:2: RULE_END
            {
             before(grammarAccess.getVariableAccess().getENDTerminalRuleCall_0_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getENDTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__Variable__Group_0__2__Impl"


    // $ANTLR start "rule__Variable__Group_1__0"
    // InternalPipelineParser.g:3242:1: rule__Variable__Group_1__0 : rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 ;
    public final void rule__Variable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3246:1: ( rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 )
            // InternalPipelineParser.g:3247:2: rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Variable__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1__1();

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
    // $ANTLR end "rule__Variable__Group_1__0"


    // $ANTLR start "rule__Variable__Group_1__0__Impl"
    // InternalPipelineParser.g:3254:1: rule__Variable__Group_1__0__Impl : ( ( rule__Variable__Group_1_0__0 )? ) ;
    public final void rule__Variable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3258:1: ( ( ( rule__Variable__Group_1_0__0 )? ) )
            // InternalPipelineParser.g:3259:1: ( ( rule__Variable__Group_1_0__0 )? )
            {
            // InternalPipelineParser.g:3259:1: ( ( rule__Variable__Group_1_0__0 )? )
            // InternalPipelineParser.g:3260:2: ( rule__Variable__Group_1_0__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_1_0()); 
            // InternalPipelineParser.g:3261:2: ( rule__Variable__Group_1_0__0 )?
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
                    // InternalPipelineParser.g:3261:3: rule__Variable__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__Variable__Group_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_1__1"
    // InternalPipelineParser.g:3269:1: rule__Variable__Group_1__1 : rule__Variable__Group_1__1__Impl ;
    public final void rule__Variable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3273:1: ( rule__Variable__Group_1__1__Impl )
            // InternalPipelineParser.g:3274:2: rule__Variable__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_1__1"


    // $ANTLR start "rule__Variable__Group_1__1__Impl"
    // InternalPipelineParser.g:3280:1: rule__Variable__Group_1__1__Impl : ( ( rule__Variable__Group_1_1__0 ) ) ;
    public final void rule__Variable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3284:1: ( ( ( rule__Variable__Group_1_1__0 ) ) )
            // InternalPipelineParser.g:3285:1: ( ( rule__Variable__Group_1_1__0 ) )
            {
            // InternalPipelineParser.g:3285:1: ( ( rule__Variable__Group_1_1__0 ) )
            // InternalPipelineParser.g:3286:2: ( rule__Variable__Group_1_1__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup_1_1()); 
            // InternalPipelineParser.g:3287:2: ( rule__Variable__Group_1_1__0 )
            // InternalPipelineParser.g:3287:3: rule__Variable__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Variable__Group_1__1__Impl"


    // $ANTLR start "rule__Variable__Group_1_0__0"
    // InternalPipelineParser.g:3296:1: rule__Variable__Group_1_0__0 : rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1 ;
    public final void rule__Variable__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3300:1: ( rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1 )
            // InternalPipelineParser.g:3301:2: rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Variable__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_0__1();

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
    // $ANTLR end "rule__Variable__Group_1_0__0"


    // $ANTLR start "rule__Variable__Group_1_0__0__Impl"
    // InternalPipelineParser.g:3308:1: rule__Variable__Group_1_0__0__Impl : ( HyphenMinus ) ;
    public final void rule__Variable__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3312:1: ( ( HyphenMinus ) )
            // InternalPipelineParser.g:3313:1: ( HyphenMinus )
            {
            // InternalPipelineParser.g:3313:1: ( HyphenMinus )
            // InternalPipelineParser.g:3314:2: HyphenMinus
            {
             before(grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_0_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Variable__Group_1_0__0__Impl"


    // $ANTLR start "rule__Variable__Group_1_0__1"
    // InternalPipelineParser.g:3323:1: rule__Variable__Group_1_0__1 : rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2 ;
    public final void rule__Variable__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3327:1: ( rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2 )
            // InternalPipelineParser.g:3328:2: rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2
            {
            pushFollow(FOLLOW_35);
            rule__Variable__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_0__2();

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
    // $ANTLR end "rule__Variable__Group_1_0__1"


    // $ANTLR start "rule__Variable__Group_1_0__1__Impl"
    // InternalPipelineParser.g:3335:1: rule__Variable__Group_1_0__1__Impl : ( Group ) ;
    public final void rule__Variable__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3339:1: ( ( Group ) )
            // InternalPipelineParser.g:3340:1: ( Group )
            {
            // InternalPipelineParser.g:3340:1: ( Group )
            // InternalPipelineParser.g:3341:2: Group
            {
             before(grammarAccess.getVariableAccess().getGroupKeyword_1_0_1()); 
            match(input,Group,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getGroupKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Variable__Group_1_0__1__Impl"


    // $ANTLR start "rule__Variable__Group_1_0__2"
    // InternalPipelineParser.g:3350:1: rule__Variable__Group_1_0__2 : rule__Variable__Group_1_0__2__Impl ;
    public final void rule__Variable__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3354:1: ( rule__Variable__Group_1_0__2__Impl )
            // InternalPipelineParser.g:3355:2: rule__Variable__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Variable__Group_1_0__2"


    // $ANTLR start "rule__Variable__Group_1_0__2__Impl"
    // InternalPipelineParser.g:3361:1: rule__Variable__Group_1_0__2__Impl : ( ( rule__Variable__GroupAssignment_1_0_2 ) ) ;
    public final void rule__Variable__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3365:1: ( ( ( rule__Variable__GroupAssignment_1_0_2 ) ) )
            // InternalPipelineParser.g:3366:1: ( ( rule__Variable__GroupAssignment_1_0_2 ) )
            {
            // InternalPipelineParser.g:3366:1: ( ( rule__Variable__GroupAssignment_1_0_2 ) )
            // InternalPipelineParser.g:3367:2: ( rule__Variable__GroupAssignment_1_0_2 )
            {
             before(grammarAccess.getVariableAccess().getGroupAssignment_1_0_2()); 
            // InternalPipelineParser.g:3368:2: ( rule__Variable__GroupAssignment_1_0_2 )
            // InternalPipelineParser.g:3368:3: rule__Variable__GroupAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__GroupAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroupAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Variable__Group_1_0__2__Impl"


    // $ANTLR start "rule__Variable__Group_1_1__0"
    // InternalPipelineParser.g:3377:1: rule__Variable__Group_1_1__0 : rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1 ;
    public final void rule__Variable__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3381:1: ( rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1 )
            // InternalPipelineParser.g:3382:2: rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1__1();

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
    // $ANTLR end "rule__Variable__Group_1_1__0"


    // $ANTLR start "rule__Variable__Group_1_1__0__Impl"
    // InternalPipelineParser.g:3389:1: rule__Variable__Group_1_1__0__Impl : ( ( rule__Variable__Group_1_1_0__0 ) ) ;
    public final void rule__Variable__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3393:1: ( ( ( rule__Variable__Group_1_1_0__0 ) ) )
            // InternalPipelineParser.g:3394:1: ( ( rule__Variable__Group_1_1_0__0 ) )
            {
            // InternalPipelineParser.g:3394:1: ( ( rule__Variable__Group_1_1_0__0 ) )
            // InternalPipelineParser.g:3395:2: ( rule__Variable__Group_1_1_0__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup_1_1_0()); 
            // InternalPipelineParser.g:3396:2: ( rule__Variable__Group_1_1_0__0 )
            // InternalPipelineParser.g:3396:3: rule__Variable__Group_1_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup_1_1_0()); 

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
    // $ANTLR end "rule__Variable__Group_1_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_1_1__1"
    // InternalPipelineParser.g:3404:1: rule__Variable__Group_1_1__1 : rule__Variable__Group_1_1__1__Impl ;
    public final void rule__Variable__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3408:1: ( rule__Variable__Group_1_1__1__Impl )
            // InternalPipelineParser.g:3409:2: rule__Variable__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_1_1__1"


    // $ANTLR start "rule__Variable__Group_1_1__1__Impl"
    // InternalPipelineParser.g:3415:1: rule__Variable__Group_1_1__1__Impl : ( ( rule__Variable__Group_1_1_1__0 ) ) ;
    public final void rule__Variable__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3419:1: ( ( ( rule__Variable__Group_1_1_1__0 ) ) )
            // InternalPipelineParser.g:3420:1: ( ( rule__Variable__Group_1_1_1__0 ) )
            {
            // InternalPipelineParser.g:3420:1: ( ( rule__Variable__Group_1_1_1__0 ) )
            // InternalPipelineParser.g:3421:2: ( rule__Variable__Group_1_1_1__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup_1_1_1()); 
            // InternalPipelineParser.g:3422:2: ( rule__Variable__Group_1_1_1__0 )
            // InternalPipelineParser.g:3422:3: rule__Variable__Group_1_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__Variable__Group_1_1__1__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_0__0"
    // InternalPipelineParser.g:3431:1: rule__Variable__Group_1_1_0__0 : rule__Variable__Group_1_1_0__0__Impl rule__Variable__Group_1_1_0__1 ;
    public final void rule__Variable__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3435:1: ( rule__Variable__Group_1_1_0__0__Impl rule__Variable__Group_1_1_0__1 )
            // InternalPipelineParser.g:3436:2: rule__Variable__Group_1_1_0__0__Impl rule__Variable__Group_1_1_0__1
            {
            pushFollow(FOLLOW_22);
            rule__Variable__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_0__1();

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
    // $ANTLR end "rule__Variable__Group_1_1_0__0"


    // $ANTLR start "rule__Variable__Group_1_1_0__0__Impl"
    // InternalPipelineParser.g:3443:1: rule__Variable__Group_1_1_0__0__Impl : ( HyphenMinus ) ;
    public final void rule__Variable__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3447:1: ( ( HyphenMinus ) )
            // InternalPipelineParser.g:3448:1: ( HyphenMinus )
            {
            // InternalPipelineParser.g:3448:1: ( HyphenMinus )
            // InternalPipelineParser.g:3449:2: HyphenMinus
            {
             before(grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_1_0_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_1_0_0()); 

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
    // $ANTLR end "rule__Variable__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_0__1"
    // InternalPipelineParser.g:3458:1: rule__Variable__Group_1_1_0__1 : rule__Variable__Group_1_1_0__1__Impl rule__Variable__Group_1_1_0__2 ;
    public final void rule__Variable__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3462:1: ( rule__Variable__Group_1_1_0__1__Impl rule__Variable__Group_1_1_0__2 )
            // InternalPipelineParser.g:3463:2: rule__Variable__Group_1_1_0__1__Impl rule__Variable__Group_1_1_0__2
            {
            pushFollow(FOLLOW_35);
            rule__Variable__Group_1_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_0__2();

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
    // $ANTLR end "rule__Variable__Group_1_1_0__1"


    // $ANTLR start "rule__Variable__Group_1_1_0__1__Impl"
    // InternalPipelineParser.g:3470:1: rule__Variable__Group_1_1_0__1__Impl : ( Name ) ;
    public final void rule__Variable__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3474:1: ( ( Name ) )
            // InternalPipelineParser.g:3475:1: ( Name )
            {
            // InternalPipelineParser.g:3475:1: ( Name )
            // InternalPipelineParser.g:3476:2: Name
            {
             before(grammarAccess.getVariableAccess().getNameKeyword_1_1_0_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Variable__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_0__2"
    // InternalPipelineParser.g:3485:1: rule__Variable__Group_1_1_0__2 : rule__Variable__Group_1_1_0__2__Impl ;
    public final void rule__Variable__Group_1_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3489:1: ( rule__Variable__Group_1_1_0__2__Impl )
            // InternalPipelineParser.g:3490:2: rule__Variable__Group_1_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_0__2__Impl();

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
    // $ANTLR end "rule__Variable__Group_1_1_0__2"


    // $ANTLR start "rule__Variable__Group_1_1_0__2__Impl"
    // InternalPipelineParser.g:3496:1: rule__Variable__Group_1_1_0__2__Impl : ( ( rule__Variable__NameAssignment_1_1_0_2 ) ) ;
    public final void rule__Variable__Group_1_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3500:1: ( ( ( rule__Variable__NameAssignment_1_1_0_2 ) ) )
            // InternalPipelineParser.g:3501:1: ( ( rule__Variable__NameAssignment_1_1_0_2 ) )
            {
            // InternalPipelineParser.g:3501:1: ( ( rule__Variable__NameAssignment_1_1_0_2 ) )
            // InternalPipelineParser.g:3502:2: ( rule__Variable__NameAssignment_1_1_0_2 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1_1_0_2()); 
            // InternalPipelineParser.g:3503:2: ( rule__Variable__NameAssignment_1_1_0_2 )
            // InternalPipelineParser.g:3503:3: rule__Variable__NameAssignment_1_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1_1_0_2()); 

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
    // $ANTLR end "rule__Variable__Group_1_1_0__2__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_1__0"
    // InternalPipelineParser.g:3512:1: rule__Variable__Group_1_1_1__0 : rule__Variable__Group_1_1_1__0__Impl rule__Variable__Group_1_1_1__1 ;
    public final void rule__Variable__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3516:1: ( rule__Variable__Group_1_1_1__0__Impl rule__Variable__Group_1_1_1__1 )
            // InternalPipelineParser.g:3517:2: rule__Variable__Group_1_1_1__0__Impl rule__Variable__Group_1_1_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Variable__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_1__1();

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
    // $ANTLR end "rule__Variable__Group_1_1_1__0"


    // $ANTLR start "rule__Variable__Group_1_1_1__0__Impl"
    // InternalPipelineParser.g:3524:1: rule__Variable__Group_1_1_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Variable__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3528:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:3529:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:3529:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:3530:2: RULE_BEGIN
            {
             before(grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__Variable__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_1__1"
    // InternalPipelineParser.g:3539:1: rule__Variable__Group_1_1_1__1 : rule__Variable__Group_1_1_1__1__Impl rule__Variable__Group_1_1_1__2 ;
    public final void rule__Variable__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3543:1: ( rule__Variable__Group_1_1_1__1__Impl rule__Variable__Group_1_1_1__2 )
            // InternalPipelineParser.g:3544:2: rule__Variable__Group_1_1_1__1__Impl rule__Variable__Group_1_1_1__2
            {
            pushFollow(FOLLOW_37);
            rule__Variable__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_1__2();

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
    // $ANTLR end "rule__Variable__Group_1_1_1__1"


    // $ANTLR start "rule__Variable__Group_1_1_1__1__Impl"
    // InternalPipelineParser.g:3551:1: rule__Variable__Group_1_1_1__1__Impl : ( ( rule__Variable__Group_1_1_1_1__0 ) ) ;
    public final void rule__Variable__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3555:1: ( ( ( rule__Variable__Group_1_1_1_1__0 ) ) )
            // InternalPipelineParser.g:3556:1: ( ( rule__Variable__Group_1_1_1_1__0 ) )
            {
            // InternalPipelineParser.g:3556:1: ( ( rule__Variable__Group_1_1_1_1__0 ) )
            // InternalPipelineParser.g:3557:2: ( rule__Variable__Group_1_1_1_1__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup_1_1_1_1()); 
            // InternalPipelineParser.g:3558:2: ( rule__Variable__Group_1_1_1_1__0 )
            // InternalPipelineParser.g:3558:3: rule__Variable__Group_1_1_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup_1_1_1_1()); 

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
    // $ANTLR end "rule__Variable__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_1__2"
    // InternalPipelineParser.g:3566:1: rule__Variable__Group_1_1_1__2 : rule__Variable__Group_1_1_1__2__Impl rule__Variable__Group_1_1_1__3 ;
    public final void rule__Variable__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3570:1: ( rule__Variable__Group_1_1_1__2__Impl rule__Variable__Group_1_1_1__3 )
            // InternalPipelineParser.g:3571:2: rule__Variable__Group_1_1_1__2__Impl rule__Variable__Group_1_1_1__3
            {
            pushFollow(FOLLOW_37);
            rule__Variable__Group_1_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_1__3();

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
    // $ANTLR end "rule__Variable__Group_1_1_1__2"


    // $ANTLR start "rule__Variable__Group_1_1_1__2__Impl"
    // InternalPipelineParser.g:3578:1: rule__Variable__Group_1_1_1__2__Impl : ( ( rule__Variable__Group_1_1_1_2__0 )? ) ;
    public final void rule__Variable__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3582:1: ( ( ( rule__Variable__Group_1_1_1_2__0 )? ) )
            // InternalPipelineParser.g:3583:1: ( ( rule__Variable__Group_1_1_1_2__0 )? )
            {
            // InternalPipelineParser.g:3583:1: ( ( rule__Variable__Group_1_1_1_2__0 )? )
            // InternalPipelineParser.g:3584:2: ( rule__Variable__Group_1_1_1_2__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_1_1_1_2()); 
            // InternalPipelineParser.g:3585:2: ( rule__Variable__Group_1_1_1_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Readonly) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPipelineParser.g:3585:3: rule__Variable__Group_1_1_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_1_1_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_1_1_1_2()); 

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
    // $ANTLR end "rule__Variable__Group_1_1_1__2__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_1__3"
    // InternalPipelineParser.g:3593:1: rule__Variable__Group_1_1_1__3 : rule__Variable__Group_1_1_1__3__Impl ;
    public final void rule__Variable__Group_1_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3597:1: ( rule__Variable__Group_1_1_1__3__Impl )
            // InternalPipelineParser.g:3598:2: rule__Variable__Group_1_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_1__3__Impl();

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
    // $ANTLR end "rule__Variable__Group_1_1_1__3"


    // $ANTLR start "rule__Variable__Group_1_1_1__3__Impl"
    // InternalPipelineParser.g:3604:1: rule__Variable__Group_1_1_1__3__Impl : ( RULE_END ) ;
    public final void rule__Variable__Group_1_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3608:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:3609:1: ( RULE_END )
            {
            // InternalPipelineParser.g:3609:1: ( RULE_END )
            // InternalPipelineParser.g:3610:2: RULE_END
            {
             before(grammarAccess.getVariableAccess().getENDTerminalRuleCall_1_1_1_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getENDTerminalRuleCall_1_1_1_3()); 

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
    // $ANTLR end "rule__Variable__Group_1_1_1__3__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_1_1__0"
    // InternalPipelineParser.g:3620:1: rule__Variable__Group_1_1_1_1__0 : rule__Variable__Group_1_1_1_1__0__Impl rule__Variable__Group_1_1_1_1__1 ;
    public final void rule__Variable__Group_1_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3624:1: ( rule__Variable__Group_1_1_1_1__0__Impl rule__Variable__Group_1_1_1_1__1 )
            // InternalPipelineParser.g:3625:2: rule__Variable__Group_1_1_1_1__0__Impl rule__Variable__Group_1_1_1_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Variable__Group_1_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_1_1__1();

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
    // $ANTLR end "rule__Variable__Group_1_1_1_1__0"


    // $ANTLR start "rule__Variable__Group_1_1_1_1__0__Impl"
    // InternalPipelineParser.g:3632:1: rule__Variable__Group_1_1_1_1__0__Impl : ( Value ) ;
    public final void rule__Variable__Group_1_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3636:1: ( ( Value ) )
            // InternalPipelineParser.g:3637:1: ( Value )
            {
            // InternalPipelineParser.g:3637:1: ( Value )
            // InternalPipelineParser.g:3638:2: Value
            {
             before(grammarAccess.getVariableAccess().getValueKeyword_1_1_1_1_0()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getValueKeyword_1_1_1_1_0()); 

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
    // $ANTLR end "rule__Variable__Group_1_1_1_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_1_1__1"
    // InternalPipelineParser.g:3647:1: rule__Variable__Group_1_1_1_1__1 : rule__Variable__Group_1_1_1_1__1__Impl ;
    public final void rule__Variable__Group_1_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3651:1: ( rule__Variable__Group_1_1_1_1__1__Impl )
            // InternalPipelineParser.g:3652:2: rule__Variable__Group_1_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_1_1__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_1_1_1_1__1"


    // $ANTLR start "rule__Variable__Group_1_1_1_1__1__Impl"
    // InternalPipelineParser.g:3658:1: rule__Variable__Group_1_1_1_1__1__Impl : ( ( rule__Variable__ValueAssignment_1_1_1_1_1 ) ) ;
    public final void rule__Variable__Group_1_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3662:1: ( ( ( rule__Variable__ValueAssignment_1_1_1_1_1 ) ) )
            // InternalPipelineParser.g:3663:1: ( ( rule__Variable__ValueAssignment_1_1_1_1_1 ) )
            {
            // InternalPipelineParser.g:3663:1: ( ( rule__Variable__ValueAssignment_1_1_1_1_1 ) )
            // InternalPipelineParser.g:3664:2: ( rule__Variable__ValueAssignment_1_1_1_1_1 )
            {
             before(grammarAccess.getVariableAccess().getValueAssignment_1_1_1_1_1()); 
            // InternalPipelineParser.g:3665:2: ( rule__Variable__ValueAssignment_1_1_1_1_1 )
            // InternalPipelineParser.g:3665:3: rule__Variable__ValueAssignment_1_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValueAssignment_1_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValueAssignment_1_1_1_1_1()); 

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
    // $ANTLR end "rule__Variable__Group_1_1_1_1__1__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_1_2__0"
    // InternalPipelineParser.g:3674:1: rule__Variable__Group_1_1_1_2__0 : rule__Variable__Group_1_1_1_2__0__Impl rule__Variable__Group_1_1_1_2__1 ;
    public final void rule__Variable__Group_1_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3678:1: ( rule__Variable__Group_1_1_1_2__0__Impl rule__Variable__Group_1_1_1_2__1 )
            // InternalPipelineParser.g:3679:2: rule__Variable__Group_1_1_1_2__0__Impl rule__Variable__Group_1_1_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group_1_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_1_2__1();

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
    // $ANTLR end "rule__Variable__Group_1_1_1_2__0"


    // $ANTLR start "rule__Variable__Group_1_1_1_2__0__Impl"
    // InternalPipelineParser.g:3686:1: rule__Variable__Group_1_1_1_2__0__Impl : ( Readonly ) ;
    public final void rule__Variable__Group_1_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3690:1: ( ( Readonly ) )
            // InternalPipelineParser.g:3691:1: ( Readonly )
            {
            // InternalPipelineParser.g:3691:1: ( Readonly )
            // InternalPipelineParser.g:3692:2: Readonly
            {
             before(grammarAccess.getVariableAccess().getReadonlyKeyword_1_1_1_2_0()); 
            match(input,Readonly,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getReadonlyKeyword_1_1_1_2_0()); 

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
    // $ANTLR end "rule__Variable__Group_1_1_1_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_1_2__1"
    // InternalPipelineParser.g:3701:1: rule__Variable__Group_1_1_1_2__1 : rule__Variable__Group_1_1_1_2__1__Impl ;
    public final void rule__Variable__Group_1_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3705:1: ( rule__Variable__Group_1_1_1_2__1__Impl )
            // InternalPipelineParser.g:3706:2: rule__Variable__Group_1_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_1_2__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_1_1_1_2__1"


    // $ANTLR start "rule__Variable__Group_1_1_1_2__1__Impl"
    // InternalPipelineParser.g:3712:1: rule__Variable__Group_1_1_1_2__1__Impl : ( ( rule__Variable__ReadonlyAssignment_1_1_1_2_1 ) ) ;
    public final void rule__Variable__Group_1_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3716:1: ( ( ( rule__Variable__ReadonlyAssignment_1_1_1_2_1 ) ) )
            // InternalPipelineParser.g:3717:1: ( ( rule__Variable__ReadonlyAssignment_1_1_1_2_1 ) )
            {
            // InternalPipelineParser.g:3717:1: ( ( rule__Variable__ReadonlyAssignment_1_1_1_2_1 ) )
            // InternalPipelineParser.g:3718:2: ( rule__Variable__ReadonlyAssignment_1_1_1_2_1 )
            {
             before(grammarAccess.getVariableAccess().getReadonlyAssignment_1_1_1_2_1()); 
            // InternalPipelineParser.g:3719:2: ( rule__Variable__ReadonlyAssignment_1_1_1_2_1 )
            // InternalPipelineParser.g:3719:3: rule__Variable__ReadonlyAssignment_1_1_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ReadonlyAssignment_1_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getReadonlyAssignment_1_1_1_2_1()); 

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
    // $ANTLR end "rule__Variable__Group_1_1_1_2__1__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalPipelineParser.g:3728:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3732:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalPipelineParser.g:3733:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalPipelineParser.g:3740:1: rule__Resource__Group__0__Impl : ( ( rule__Resource__ResourceNameAssignment_0 ) ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3744:1: ( ( ( rule__Resource__ResourceNameAssignment_0 ) ) )
            // InternalPipelineParser.g:3745:1: ( ( rule__Resource__ResourceNameAssignment_0 ) )
            {
            // InternalPipelineParser.g:3745:1: ( ( rule__Resource__ResourceNameAssignment_0 ) )
            // InternalPipelineParser.g:3746:2: ( rule__Resource__ResourceNameAssignment_0 )
            {
             before(grammarAccess.getResourceAccess().getResourceNameAssignment_0()); 
            // InternalPipelineParser.g:3747:2: ( rule__Resource__ResourceNameAssignment_0 )
            // InternalPipelineParser.g:3747:3: rule__Resource__ResourceNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__ResourceNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getResourceNameAssignment_0()); 

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
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalPipelineParser.g:3755:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3759:1: ( rule__Resource__Group__1__Impl )
            // InternalPipelineParser.g:3760:2: rule__Resource__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__1__Impl();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalPipelineParser.g:3766:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__Alternatives_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3770:1: ( ( ( rule__Resource__Alternatives_1 ) ) )
            // InternalPipelineParser.g:3771:1: ( ( rule__Resource__Alternatives_1 ) )
            {
            // InternalPipelineParser.g:3771:1: ( ( rule__Resource__Alternatives_1 ) )
            // InternalPipelineParser.g:3772:2: ( rule__Resource__Alternatives_1 )
            {
             before(grammarAccess.getResourceAccess().getAlternatives_1()); 
            // InternalPipelineParser.g:3773:2: ( rule__Resource__Alternatives_1 )
            // InternalPipelineParser.g:3773:3: rule__Resource__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group_1_0__0"
    // InternalPipelineParser.g:3782:1: rule__Resource__Group_1_0__0 : rule__Resource__Group_1_0__0__Impl rule__Resource__Group_1_0__1 ;
    public final void rule__Resource__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3786:1: ( rule__Resource__Group_1_0__0__Impl rule__Resource__Group_1_0__1 )
            // InternalPipelineParser.g:3787:2: rule__Resource__Group_1_0__0__Impl rule__Resource__Group_1_0__1
            {
            pushFollow(FOLLOW_34);
            rule__Resource__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_1_0__1();

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
    // $ANTLR end "rule__Resource__Group_1_0__0"


    // $ANTLR start "rule__Resource__Group_1_0__0__Impl"
    // InternalPipelineParser.g:3794:1: rule__Resource__Group_1_0__0__Impl : ( HyphenMinus ) ;
    public final void rule__Resource__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3798:1: ( ( HyphenMinus ) )
            // InternalPipelineParser.g:3799:1: ( HyphenMinus )
            {
            // InternalPipelineParser.g:3799:1: ( HyphenMinus )
            // InternalPipelineParser.g:3800:2: HyphenMinus
            {
             before(grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_0_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Resource__Group_1_0__0__Impl"


    // $ANTLR start "rule__Resource__Group_1_0__1"
    // InternalPipelineParser.g:3809:1: rule__Resource__Group_1_0__1 : rule__Resource__Group_1_0__1__Impl ;
    public final void rule__Resource__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3813:1: ( rule__Resource__Group_1_0__1__Impl )
            // InternalPipelineParser.g:3814:2: rule__Resource__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Resource__Group_1_0__1"


    // $ANTLR start "rule__Resource__Group_1_0__1__Impl"
    // InternalPipelineParser.g:3820:1: rule__Resource__Group_1_0__1__Impl : ( ( rule__Resource__ResourceValuesAssignment_1_0_1 ) ) ;
    public final void rule__Resource__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3824:1: ( ( ( rule__Resource__ResourceValuesAssignment_1_0_1 ) ) )
            // InternalPipelineParser.g:3825:1: ( ( rule__Resource__ResourceValuesAssignment_1_0_1 ) )
            {
            // InternalPipelineParser.g:3825:1: ( ( rule__Resource__ResourceValuesAssignment_1_0_1 ) )
            // InternalPipelineParser.g:3826:2: ( rule__Resource__ResourceValuesAssignment_1_0_1 )
            {
             before(grammarAccess.getResourceAccess().getResourceValuesAssignment_1_0_1()); 
            // InternalPipelineParser.g:3827:2: ( rule__Resource__ResourceValuesAssignment_1_0_1 )
            // InternalPipelineParser.g:3827:3: rule__Resource__ResourceValuesAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__ResourceValuesAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getResourceValuesAssignment_1_0_1()); 

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
    // $ANTLR end "rule__Resource__Group_1_0__1__Impl"


    // $ANTLR start "rule__Resource__Group_1_1__0"
    // InternalPipelineParser.g:3836:1: rule__Resource__Group_1_1__0 : rule__Resource__Group_1_1__0__Impl rule__Resource__Group_1_1__1 ;
    public final void rule__Resource__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3840:1: ( rule__Resource__Group_1_1__0__Impl rule__Resource__Group_1_1__1 )
            // InternalPipelineParser.g:3841:2: rule__Resource__Group_1_1__0__Impl rule__Resource__Group_1_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Resource__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_1_1__1();

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
    // $ANTLR end "rule__Resource__Group_1_1__0"


    // $ANTLR start "rule__Resource__Group_1_1__0__Impl"
    // InternalPipelineParser.g:3848:1: rule__Resource__Group_1_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Resource__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3852:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:3853:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:3853:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:3854:2: RULE_BEGIN
            {
             before(grammarAccess.getResourceAccess().getBEGINTerminalRuleCall_1_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getBEGINTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Resource__Group_1_1__0__Impl"


    // $ANTLR start "rule__Resource__Group_1_1__1"
    // InternalPipelineParser.g:3863:1: rule__Resource__Group_1_1__1 : rule__Resource__Group_1_1__1__Impl rule__Resource__Group_1_1__2 ;
    public final void rule__Resource__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3867:1: ( rule__Resource__Group_1_1__1__Impl rule__Resource__Group_1_1__2 )
            // InternalPipelineParser.g:3868:2: rule__Resource__Group_1_1__1__Impl rule__Resource__Group_1_1__2
            {
            pushFollow(FOLLOW_38);
            rule__Resource__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_1_1__2();

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
    // $ANTLR end "rule__Resource__Group_1_1__1"


    // $ANTLR start "rule__Resource__Group_1_1__1__Impl"
    // InternalPipelineParser.g:3875:1: rule__Resource__Group_1_1__1__Impl : ( ( rule__Resource__Group_1_1_1__0 )* ) ;
    public final void rule__Resource__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3879:1: ( ( ( rule__Resource__Group_1_1_1__0 )* ) )
            // InternalPipelineParser.g:3880:1: ( ( rule__Resource__Group_1_1_1__0 )* )
            {
            // InternalPipelineParser.g:3880:1: ( ( rule__Resource__Group_1_1_1__0 )* )
            // InternalPipelineParser.g:3881:2: ( rule__Resource__Group_1_1_1__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_1_1_1()); 
            // InternalPipelineParser.g:3882:2: ( rule__Resource__Group_1_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==HyphenMinus) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPipelineParser.g:3882:3: rule__Resource__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Resource__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__Resource__Group_1_1__1__Impl"


    // $ANTLR start "rule__Resource__Group_1_1__2"
    // InternalPipelineParser.g:3890:1: rule__Resource__Group_1_1__2 : rule__Resource__Group_1_1__2__Impl ;
    public final void rule__Resource__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3894:1: ( rule__Resource__Group_1_1__2__Impl )
            // InternalPipelineParser.g:3895:2: rule__Resource__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Resource__Group_1_1__2"


    // $ANTLR start "rule__Resource__Group_1_1__2__Impl"
    // InternalPipelineParser.g:3901:1: rule__Resource__Group_1_1__2__Impl : ( RULE_END ) ;
    public final void rule__Resource__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3905:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:3906:1: ( RULE_END )
            {
            // InternalPipelineParser.g:3906:1: ( RULE_END )
            // InternalPipelineParser.g:3907:2: RULE_END
            {
             before(grammarAccess.getResourceAccess().getENDTerminalRuleCall_1_1_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getENDTerminalRuleCall_1_1_2()); 

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
    // $ANTLR end "rule__Resource__Group_1_1__2__Impl"


    // $ANTLR start "rule__Resource__Group_1_1_1__0"
    // InternalPipelineParser.g:3917:1: rule__Resource__Group_1_1_1__0 : rule__Resource__Group_1_1_1__0__Impl rule__Resource__Group_1_1_1__1 ;
    public final void rule__Resource__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3921:1: ( rule__Resource__Group_1_1_1__0__Impl rule__Resource__Group_1_1_1__1 )
            // InternalPipelineParser.g:3922:2: rule__Resource__Group_1_1_1__0__Impl rule__Resource__Group_1_1_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Resource__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_1_1_1__1();

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
    // $ANTLR end "rule__Resource__Group_1_1_1__0"


    // $ANTLR start "rule__Resource__Group_1_1_1__0__Impl"
    // InternalPipelineParser.g:3929:1: rule__Resource__Group_1_1_1__0__Impl : ( HyphenMinus ) ;
    public final void rule__Resource__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3933:1: ( ( HyphenMinus ) )
            // InternalPipelineParser.g:3934:1: ( HyphenMinus )
            {
            // InternalPipelineParser.g:3934:1: ( HyphenMinus )
            // InternalPipelineParser.g:3935:2: HyphenMinus
            {
             before(grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_1_1_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_1_1_0()); 

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
    // $ANTLR end "rule__Resource__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Resource__Group_1_1_1__1"
    // InternalPipelineParser.g:3944:1: rule__Resource__Group_1_1_1__1 : rule__Resource__Group_1_1_1__1__Impl ;
    public final void rule__Resource__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3948:1: ( rule__Resource__Group_1_1_1__1__Impl )
            // InternalPipelineParser.g:3949:2: rule__Resource__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__Resource__Group_1_1_1__1"


    // $ANTLR start "rule__Resource__Group_1_1_1__1__Impl"
    // InternalPipelineParser.g:3955:1: rule__Resource__Group_1_1_1__1__Impl : ( ( rule__Resource__ResourceValuesAssignment_1_1_1_1 ) ) ;
    public final void rule__Resource__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3959:1: ( ( ( rule__Resource__ResourceValuesAssignment_1_1_1_1 ) ) )
            // InternalPipelineParser.g:3960:1: ( ( rule__Resource__ResourceValuesAssignment_1_1_1_1 ) )
            {
            // InternalPipelineParser.g:3960:1: ( ( rule__Resource__ResourceValuesAssignment_1_1_1_1 ) )
            // InternalPipelineParser.g:3961:2: ( rule__Resource__ResourceValuesAssignment_1_1_1_1 )
            {
             before(grammarAccess.getResourceAccess().getResourceValuesAssignment_1_1_1_1()); 
            // InternalPipelineParser.g:3962:2: ( rule__Resource__ResourceValuesAssignment_1_1_1_1 )
            // InternalPipelineParser.g:3962:3: rule__Resource__ResourceValuesAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__ResourceValuesAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getResourceValuesAssignment_1_1_1_1()); 

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
    // $ANTLR end "rule__Resource__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__PipelineParameter__Group__0"
    // InternalPipelineParser.g:3971:1: rule__PipelineParameter__Group__0 : rule__PipelineParameter__Group__0__Impl rule__PipelineParameter__Group__1 ;
    public final void rule__PipelineParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3975:1: ( rule__PipelineParameter__Group__0__Impl rule__PipelineParameter__Group__1 )
            // InternalPipelineParser.g:3976:2: rule__PipelineParameter__Group__0__Impl rule__PipelineParameter__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__PipelineParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PipelineParameter__Group__1();

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
    // $ANTLR end "rule__PipelineParameter__Group__0"


    // $ANTLR start "rule__PipelineParameter__Group__0__Impl"
    // InternalPipelineParser.g:3983:1: rule__PipelineParameter__Group__0__Impl : ( ( rule__PipelineParameter__Group_0__0 )? ) ;
    public final void rule__PipelineParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:3987:1: ( ( ( rule__PipelineParameter__Group_0__0 )? ) )
            // InternalPipelineParser.g:3988:1: ( ( rule__PipelineParameter__Group_0__0 )? )
            {
            // InternalPipelineParser.g:3988:1: ( ( rule__PipelineParameter__Group_0__0 )? )
            // InternalPipelineParser.g:3989:2: ( rule__PipelineParameter__Group_0__0 )?
            {
             before(grammarAccess.getPipelineParameterAccess().getGroup_0()); 
            // InternalPipelineParser.g:3990:2: ( rule__PipelineParameter__Group_0__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Name) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPipelineParser.g:3990:3: rule__PipelineParameter__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PipelineParameter__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPipelineParameterAccess().getGroup_0()); 

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
    // $ANTLR end "rule__PipelineParameter__Group__0__Impl"


    // $ANTLR start "rule__PipelineParameter__Group__1"
    // InternalPipelineParser.g:3998:1: rule__PipelineParameter__Group__1 : rule__PipelineParameter__Group__1__Impl ;
    public final void rule__PipelineParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4002:1: ( rule__PipelineParameter__Group__1__Impl )
            // InternalPipelineParser.g:4003:2: rule__PipelineParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PipelineParameter__Group__1__Impl();

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
    // $ANTLR end "rule__PipelineParameter__Group__1"


    // $ANTLR start "rule__PipelineParameter__Group__1__Impl"
    // InternalPipelineParser.g:4009:1: rule__PipelineParameter__Group__1__Impl : ( ( rule__PipelineParameter__UnorderedGroup_1 ) ) ;
    public final void rule__PipelineParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4013:1: ( ( ( rule__PipelineParameter__UnorderedGroup_1 ) ) )
            // InternalPipelineParser.g:4014:1: ( ( rule__PipelineParameter__UnorderedGroup_1 ) )
            {
            // InternalPipelineParser.g:4014:1: ( ( rule__PipelineParameter__UnorderedGroup_1 ) )
            // InternalPipelineParser.g:4015:2: ( rule__PipelineParameter__UnorderedGroup_1 )
            {
             before(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1()); 
            // InternalPipelineParser.g:4016:2: ( rule__PipelineParameter__UnorderedGroup_1 )
            // InternalPipelineParser.g:4016:3: rule__PipelineParameter__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__PipelineParameter__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1()); 

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
    // $ANTLR end "rule__PipelineParameter__Group__1__Impl"


    // $ANTLR start "rule__PipelineParameter__Group_0__0"
    // InternalPipelineParser.g:4025:1: rule__PipelineParameter__Group_0__0 : rule__PipelineParameter__Group_0__0__Impl rule__PipelineParameter__Group_0__1 ;
    public final void rule__PipelineParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4029:1: ( rule__PipelineParameter__Group_0__0__Impl rule__PipelineParameter__Group_0__1 )
            // InternalPipelineParser.g:4030:2: rule__PipelineParameter__Group_0__0__Impl rule__PipelineParameter__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__PipelineParameter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PipelineParameter__Group_0__1();

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
    // $ANTLR end "rule__PipelineParameter__Group_0__0"


    // $ANTLR start "rule__PipelineParameter__Group_0__0__Impl"
    // InternalPipelineParser.g:4037:1: rule__PipelineParameter__Group_0__0__Impl : ( Name ) ;
    public final void rule__PipelineParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4041:1: ( ( Name ) )
            // InternalPipelineParser.g:4042:1: ( Name )
            {
            // InternalPipelineParser.g:4042:1: ( Name )
            // InternalPipelineParser.g:4043:2: Name
            {
             before(grammarAccess.getPipelineParameterAccess().getNameKeyword_0_0()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getPipelineParameterAccess().getNameKeyword_0_0()); 

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
    // $ANTLR end "rule__PipelineParameter__Group_0__0__Impl"


    // $ANTLR start "rule__PipelineParameter__Group_0__1"
    // InternalPipelineParser.g:4052:1: rule__PipelineParameter__Group_0__1 : rule__PipelineParameter__Group_0__1__Impl ;
    public final void rule__PipelineParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4056:1: ( rule__PipelineParameter__Group_0__1__Impl )
            // InternalPipelineParser.g:4057:2: rule__PipelineParameter__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PipelineParameter__Group_0__1__Impl();

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
    // $ANTLR end "rule__PipelineParameter__Group_0__1"


    // $ANTLR start "rule__PipelineParameter__Group_0__1__Impl"
    // InternalPipelineParser.g:4063:1: rule__PipelineParameter__Group_0__1__Impl : ( ( rule__PipelineParameter__NameAssignment_0_1 ) ) ;
    public final void rule__PipelineParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4067:1: ( ( ( rule__PipelineParameter__NameAssignment_0_1 ) ) )
            // InternalPipelineParser.g:4068:1: ( ( rule__PipelineParameter__NameAssignment_0_1 ) )
            {
            // InternalPipelineParser.g:4068:1: ( ( rule__PipelineParameter__NameAssignment_0_1 ) )
            // InternalPipelineParser.g:4069:2: ( rule__PipelineParameter__NameAssignment_0_1 )
            {
             before(grammarAccess.getPipelineParameterAccess().getNameAssignment_0_1()); 
            // InternalPipelineParser.g:4070:2: ( rule__PipelineParameter__NameAssignment_0_1 )
            // InternalPipelineParser.g:4070:3: rule__PipelineParameter__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PipelineParameter__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineParameterAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__PipelineParameter__Group_0__1__Impl"


    // $ANTLR start "rule__PipelineParameter__Group_1_0__0"
    // InternalPipelineParser.g:4079:1: rule__PipelineParameter__Group_1_0__0 : rule__PipelineParameter__Group_1_0__0__Impl rule__PipelineParameter__Group_1_0__1 ;
    public final void rule__PipelineParameter__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4083:1: ( rule__PipelineParameter__Group_1_0__0__Impl rule__PipelineParameter__Group_1_0__1 )
            // InternalPipelineParser.g:4084:2: rule__PipelineParameter__Group_1_0__0__Impl rule__PipelineParameter__Group_1_0__1
            {
            pushFollow(FOLLOW_39);
            rule__PipelineParameter__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PipelineParameter__Group_1_0__1();

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
    // $ANTLR end "rule__PipelineParameter__Group_1_0__0"


    // $ANTLR start "rule__PipelineParameter__Group_1_0__0__Impl"
    // InternalPipelineParser.g:4091:1: rule__PipelineParameter__Group_1_0__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__PipelineParameter__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4095:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:4096:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:4096:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:4097:2: RULE_BEGIN
            {
             before(grammarAccess.getPipelineParameterAccess().getBEGINTerminalRuleCall_1_0_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getPipelineParameterAccess().getBEGINTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__PipelineParameter__Group_1_0__0__Impl"


    // $ANTLR start "rule__PipelineParameter__Group_1_0__1"
    // InternalPipelineParser.g:4106:1: rule__PipelineParameter__Group_1_0__1 : rule__PipelineParameter__Group_1_0__1__Impl ;
    public final void rule__PipelineParameter__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4110:1: ( rule__PipelineParameter__Group_1_0__1__Impl )
            // InternalPipelineParser.g:4111:2: rule__PipelineParameter__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PipelineParameter__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__PipelineParameter__Group_1_0__1"


    // $ANTLR start "rule__PipelineParameter__Group_1_0__1__Impl"
    // InternalPipelineParser.g:4117:1: rule__PipelineParameter__Group_1_0__1__Impl : ( ( rule__PipelineParameter__Group_1_0_1__0 )? ) ;
    public final void rule__PipelineParameter__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4121:1: ( ( ( rule__PipelineParameter__Group_1_0_1__0 )? ) )
            // InternalPipelineParser.g:4122:1: ( ( rule__PipelineParameter__Group_1_0_1__0 )? )
            {
            // InternalPipelineParser.g:4122:1: ( ( rule__PipelineParameter__Group_1_0_1__0 )? )
            // InternalPipelineParser.g:4123:2: ( rule__PipelineParameter__Group_1_0_1__0 )?
            {
             before(grammarAccess.getPipelineParameterAccess().getGroup_1_0_1()); 
            // InternalPipelineParser.g:4124:2: ( rule__PipelineParameter__Group_1_0_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==DisplayName) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPipelineParser.g:4124:3: rule__PipelineParameter__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PipelineParameter__Group_1_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPipelineParameterAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PipelineParameter__Group_1_0__1__Impl"


    // $ANTLR start "rule__PipelineParameter__Group_1_0_1__0"
    // InternalPipelineParser.g:4133:1: rule__PipelineParameter__Group_1_0_1__0 : rule__PipelineParameter__Group_1_0_1__0__Impl rule__PipelineParameter__Group_1_0_1__1 ;
    public final void rule__PipelineParameter__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4137:1: ( rule__PipelineParameter__Group_1_0_1__0__Impl rule__PipelineParameter__Group_1_0_1__1 )
            // InternalPipelineParser.g:4138:2: rule__PipelineParameter__Group_1_0_1__0__Impl rule__PipelineParameter__Group_1_0_1__1
            {
            pushFollow(FOLLOW_4);
            rule__PipelineParameter__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PipelineParameter__Group_1_0_1__1();

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
    // $ANTLR end "rule__PipelineParameter__Group_1_0_1__0"


    // $ANTLR start "rule__PipelineParameter__Group_1_0_1__0__Impl"
    // InternalPipelineParser.g:4145:1: rule__PipelineParameter__Group_1_0_1__0__Impl : ( DisplayName ) ;
    public final void rule__PipelineParameter__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4149:1: ( ( DisplayName ) )
            // InternalPipelineParser.g:4150:1: ( DisplayName )
            {
            // InternalPipelineParser.g:4150:1: ( DisplayName )
            // InternalPipelineParser.g:4151:2: DisplayName
            {
             before(grammarAccess.getPipelineParameterAccess().getDisplayNameKeyword_1_0_1_0()); 
            match(input,DisplayName,FOLLOW_2); 
             after(grammarAccess.getPipelineParameterAccess().getDisplayNameKeyword_1_0_1_0()); 

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
    // $ANTLR end "rule__PipelineParameter__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PipelineParameter__Group_1_0_1__1"
    // InternalPipelineParser.g:4160:1: rule__PipelineParameter__Group_1_0_1__1 : rule__PipelineParameter__Group_1_0_1__1__Impl ;
    public final void rule__PipelineParameter__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4164:1: ( rule__PipelineParameter__Group_1_0_1__1__Impl )
            // InternalPipelineParser.g:4165:2: rule__PipelineParameter__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PipelineParameter__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PipelineParameter__Group_1_0_1__1"


    // $ANTLR start "rule__PipelineParameter__Group_1_0_1__1__Impl"
    // InternalPipelineParser.g:4171:1: rule__PipelineParameter__Group_1_0_1__1__Impl : ( ( rule__PipelineParameter__DisplayNameAssignment_1_0_1_1 ) ) ;
    public final void rule__PipelineParameter__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4175:1: ( ( ( rule__PipelineParameter__DisplayNameAssignment_1_0_1_1 ) ) )
            // InternalPipelineParser.g:4176:1: ( ( rule__PipelineParameter__DisplayNameAssignment_1_0_1_1 ) )
            {
            // InternalPipelineParser.g:4176:1: ( ( rule__PipelineParameter__DisplayNameAssignment_1_0_1_1 ) )
            // InternalPipelineParser.g:4177:2: ( rule__PipelineParameter__DisplayNameAssignment_1_0_1_1 )
            {
             before(grammarAccess.getPipelineParameterAccess().getDisplayNameAssignment_1_0_1_1()); 
            // InternalPipelineParser.g:4178:2: ( rule__PipelineParameter__DisplayNameAssignment_1_0_1_1 )
            // InternalPipelineParser.g:4178:3: rule__PipelineParameter__DisplayNameAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PipelineParameter__DisplayNameAssignment_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineParameterAccess().getDisplayNameAssignment_1_0_1_1()); 

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
    // $ANTLR end "rule__PipelineParameter__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__PipelineParameter__Group_1_1__0"
    // InternalPipelineParser.g:4187:1: rule__PipelineParameter__Group_1_1__0 : rule__PipelineParameter__Group_1_1__0__Impl rule__PipelineParameter__Group_1_1__1 ;
    public final void rule__PipelineParameter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4191:1: ( rule__PipelineParameter__Group_1_1__0__Impl rule__PipelineParameter__Group_1_1__1 )
            // InternalPipelineParser.g:4192:2: rule__PipelineParameter__Group_1_1__0__Impl rule__PipelineParameter__Group_1_1__1
            {
            pushFollow(FOLLOW_20);
            rule__PipelineParameter__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PipelineParameter__Group_1_1__1();

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
    // $ANTLR end "rule__PipelineParameter__Group_1_1__0"


    // $ANTLR start "rule__PipelineParameter__Group_1_1__0__Impl"
    // InternalPipelineParser.g:4199:1: rule__PipelineParameter__Group_1_1__0__Impl : ( ( rule__PipelineParameter__ParameterValuesAssignment_1_1_0 )* ) ;
    public final void rule__PipelineParameter__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4203:1: ( ( ( rule__PipelineParameter__ParameterValuesAssignment_1_1_0 )* ) )
            // InternalPipelineParser.g:4204:1: ( ( rule__PipelineParameter__ParameterValuesAssignment_1_1_0 )* )
            {
            // InternalPipelineParser.g:4204:1: ( ( rule__PipelineParameter__ParameterValuesAssignment_1_1_0 )* )
            // InternalPipelineParser.g:4205:2: ( rule__PipelineParameter__ParameterValuesAssignment_1_1_0 )*
            {
             before(grammarAccess.getPipelineParameterAccess().getParameterValuesAssignment_1_1_0()); 
            // InternalPipelineParser.g:4206:2: ( rule__PipelineParameter__ParameterValuesAssignment_1_1_0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==WriteAll||LA39_0==ReadAll||LA39_0==Write||(LA39_0>=None && LA39_0<=Read)||LA39_0==HyphenMinus||LA39_0==RULE_COMPLEX_EXPRESSION||LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPipelineParser.g:4206:3: rule__PipelineParameter__ParameterValuesAssignment_1_1_0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__PipelineParameter__ParameterValuesAssignment_1_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getPipelineParameterAccess().getParameterValuesAssignment_1_1_0()); 

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
    // $ANTLR end "rule__PipelineParameter__Group_1_1__0__Impl"


    // $ANTLR start "rule__PipelineParameter__Group_1_1__1"
    // InternalPipelineParser.g:4214:1: rule__PipelineParameter__Group_1_1__1 : rule__PipelineParameter__Group_1_1__1__Impl ;
    public final void rule__PipelineParameter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4218:1: ( rule__PipelineParameter__Group_1_1__1__Impl )
            // InternalPipelineParser.g:4219:2: rule__PipelineParameter__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PipelineParameter__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__PipelineParameter__Group_1_1__1"


    // $ANTLR start "rule__PipelineParameter__Group_1_1__1__Impl"
    // InternalPipelineParser.g:4225:1: rule__PipelineParameter__Group_1_1__1__Impl : ( RULE_END ) ;
    public final void rule__PipelineParameter__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4229:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:4230:1: ( RULE_END )
            {
            // InternalPipelineParser.g:4230:1: ( RULE_END )
            // InternalPipelineParser.g:4231:2: RULE_END
            {
             before(grammarAccess.getPipelineParameterAccess().getENDTerminalRuleCall_1_1_1()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getPipelineParameterAccess().getENDTerminalRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__PipelineParameter__Group_1_1__1__Impl"


    // $ANTLR start "rule__ParameterValue__Group__0"
    // InternalPipelineParser.g:4241:1: rule__ParameterValue__Group__0 : rule__ParameterValue__Group__0__Impl rule__ParameterValue__Group__1 ;
    public final void rule__ParameterValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4245:1: ( rule__ParameterValue__Group__0__Impl rule__ParameterValue__Group__1 )
            // InternalPipelineParser.g:4246:2: rule__ParameterValue__Group__0__Impl rule__ParameterValue__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ParameterValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group__1();

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
    // $ANTLR end "rule__ParameterValue__Group__0"


    // $ANTLR start "rule__ParameterValue__Group__0__Impl"
    // InternalPipelineParser.g:4253:1: rule__ParameterValue__Group__0__Impl : ( ( HyphenMinus )? ) ;
    public final void rule__ParameterValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4257:1: ( ( ( HyphenMinus )? ) )
            // InternalPipelineParser.g:4258:1: ( ( HyphenMinus )? )
            {
            // InternalPipelineParser.g:4258:1: ( ( HyphenMinus )? )
            // InternalPipelineParser.g:4259:2: ( HyphenMinus )?
            {
             before(grammarAccess.getParameterValueAccess().getHyphenMinusKeyword_0()); 
            // InternalPipelineParser.g:4260:2: ( HyphenMinus )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==HyphenMinus) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPipelineParser.g:4260:3: HyphenMinus
                    {
                    match(input,HyphenMinus,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParameterValueAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__ParameterValue__Group__0__Impl"


    // $ANTLR start "rule__ParameterValue__Group__1"
    // InternalPipelineParser.g:4268:1: rule__ParameterValue__Group__1 : rule__ParameterValue__Group__1__Impl rule__ParameterValue__Group__2 ;
    public final void rule__ParameterValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4272:1: ( rule__ParameterValue__Group__1__Impl rule__ParameterValue__Group__2 )
            // InternalPipelineParser.g:4273:2: rule__ParameterValue__Group__1__Impl rule__ParameterValue__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__ParameterValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group__2();

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
    // $ANTLR end "rule__ParameterValue__Group__1"


    // $ANTLR start "rule__ParameterValue__Group__1__Impl"
    // InternalPipelineParser.g:4280:1: rule__ParameterValue__Group__1__Impl : ( ( rule__ParameterValue__Alternatives_1 ) ) ;
    public final void rule__ParameterValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4284:1: ( ( ( rule__ParameterValue__Alternatives_1 ) ) )
            // InternalPipelineParser.g:4285:1: ( ( rule__ParameterValue__Alternatives_1 ) )
            {
            // InternalPipelineParser.g:4285:1: ( ( rule__ParameterValue__Alternatives_1 ) )
            // InternalPipelineParser.g:4286:2: ( rule__ParameterValue__Alternatives_1 )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives_1()); 
            // InternalPipelineParser.g:4287:2: ( rule__ParameterValue__Alternatives_1 )
            // InternalPipelineParser.g:4287:3: rule__ParameterValue__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__ParameterValue__Group__1__Impl"


    // $ANTLR start "rule__ParameterValue__Group__2"
    // InternalPipelineParser.g:4295:1: rule__ParameterValue__Group__2 : rule__ParameterValue__Group__2__Impl rule__ParameterValue__Group__3 ;
    public final void rule__ParameterValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4299:1: ( rule__ParameterValue__Group__2__Impl rule__ParameterValue__Group__3 )
            // InternalPipelineParser.g:4300:2: rule__ParameterValue__Group__2__Impl rule__ParameterValue__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__ParameterValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group__3();

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
    // $ANTLR end "rule__ParameterValue__Group__2"


    // $ANTLR start "rule__ParameterValue__Group__2__Impl"
    // InternalPipelineParser.g:4307:1: rule__ParameterValue__Group__2__Impl : ( Colon ) ;
    public final void rule__ParameterValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4311:1: ( ( Colon ) )
            // InternalPipelineParser.g:4312:1: ( Colon )
            {
            // InternalPipelineParser.g:4312:1: ( Colon )
            // InternalPipelineParser.g:4313:2: Colon
            {
             before(grammarAccess.getParameterValueAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParameterValueAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__ParameterValue__Group__2__Impl"


    // $ANTLR start "rule__ParameterValue__Group__3"
    // InternalPipelineParser.g:4322:1: rule__ParameterValue__Group__3 : rule__ParameterValue__Group__3__Impl rule__ParameterValue__Group__4 ;
    public final void rule__ParameterValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4326:1: ( rule__ParameterValue__Group__3__Impl rule__ParameterValue__Group__4 )
            // InternalPipelineParser.g:4327:2: rule__ParameterValue__Group__3__Impl rule__ParameterValue__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__ParameterValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group__4();

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
    // $ANTLR end "rule__ParameterValue__Group__3"


    // $ANTLR start "rule__ParameterValue__Group__3__Impl"
    // InternalPipelineParser.g:4334:1: rule__ParameterValue__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__ParameterValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4338:1: ( ( ( RULE_WS )* ) )
            // InternalPipelineParser.g:4339:1: ( ( RULE_WS )* )
            {
            // InternalPipelineParser.g:4339:1: ( ( RULE_WS )* )
            // InternalPipelineParser.g:4340:2: ( RULE_WS )*
            {
             before(grammarAccess.getParameterValueAccess().getWSTerminalRuleCall_3()); 
            // InternalPipelineParser.g:4341:2: ( RULE_WS )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_WS) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPipelineParser.g:4341:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_42); 

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getParameterValueAccess().getWSTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__ParameterValue__Group__3__Impl"


    // $ANTLR start "rule__ParameterValue__Group__4"
    // InternalPipelineParser.g:4349:1: rule__ParameterValue__Group__4 : rule__ParameterValue__Group__4__Impl ;
    public final void rule__ParameterValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4353:1: ( rule__ParameterValue__Group__4__Impl )
            // InternalPipelineParser.g:4354:2: rule__ParameterValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group__4__Impl();

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
    // $ANTLR end "rule__ParameterValue__Group__4"


    // $ANTLR start "rule__ParameterValue__Group__4__Impl"
    // InternalPipelineParser.g:4360:1: rule__ParameterValue__Group__4__Impl : ( ( rule__ParameterValue__Alternatives_4 ) ) ;
    public final void rule__ParameterValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4364:1: ( ( ( rule__ParameterValue__Alternatives_4 ) ) )
            // InternalPipelineParser.g:4365:1: ( ( rule__ParameterValue__Alternatives_4 ) )
            {
            // InternalPipelineParser.g:4365:1: ( ( rule__ParameterValue__Alternatives_4 ) )
            // InternalPipelineParser.g:4366:2: ( rule__ParameterValue__Alternatives_4 )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives_4()); 
            // InternalPipelineParser.g:4367:2: ( rule__ParameterValue__Alternatives_4 )
            // InternalPipelineParser.g:4367:3: rule__ParameterValue__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__ParameterValue__Group__4__Impl"


    // $ANTLR start "rule__ParameterValue__Group_4_0__0"
    // InternalPipelineParser.g:4376:1: rule__ParameterValue__Group_4_0__0 : rule__ParameterValue__Group_4_0__0__Impl rule__ParameterValue__Group_4_0__1 ;
    public final void rule__ParameterValue__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4380:1: ( rule__ParameterValue__Group_4_0__0__Impl rule__ParameterValue__Group_4_0__1 )
            // InternalPipelineParser.g:4381:2: rule__ParameterValue__Group_4_0__0__Impl rule__ParameterValue__Group_4_0__1
            {
            pushFollow(FOLLOW_32);
            rule__ParameterValue__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_4_0__1();

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
    // $ANTLR end "rule__ParameterValue__Group_4_0__0"


    // $ANTLR start "rule__ParameterValue__Group_4_0__0__Impl"
    // InternalPipelineParser.g:4388:1: rule__ParameterValue__Group_4_0__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterValue__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4392:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:4393:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:4393:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:4394:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_0_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__ParameterValue__Group_4_0__0__Impl"


    // $ANTLR start "rule__ParameterValue__Group_4_0__1"
    // InternalPipelineParser.g:4403:1: rule__ParameterValue__Group_4_0__1 : rule__ParameterValue__Group_4_0__1__Impl rule__ParameterValue__Group_4_0__2 ;
    public final void rule__ParameterValue__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4407:1: ( rule__ParameterValue__Group_4_0__1__Impl rule__ParameterValue__Group_4_0__2 )
            // InternalPipelineParser.g:4408:2: rule__ParameterValue__Group_4_0__1__Impl rule__ParameterValue__Group_4_0__2
            {
            pushFollow(FOLLOW_32);
            rule__ParameterValue__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_4_0__2();

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
    // $ANTLR end "rule__ParameterValue__Group_4_0__1"


    // $ANTLR start "rule__ParameterValue__Group_4_0__1__Impl"
    // InternalPipelineParser.g:4415:1: rule__ParameterValue__Group_4_0__1__Impl : ( ( rule__ParameterValue__SubParameterValuesAssignment_4_0_1 )* ) ;
    public final void rule__ParameterValue__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4419:1: ( ( ( rule__ParameterValue__SubParameterValuesAssignment_4_0_1 )* ) )
            // InternalPipelineParser.g:4420:1: ( ( rule__ParameterValue__SubParameterValuesAssignment_4_0_1 )* )
            {
            // InternalPipelineParser.g:4420:1: ( ( rule__ParameterValue__SubParameterValuesAssignment_4_0_1 )* )
            // InternalPipelineParser.g:4421:2: ( rule__ParameterValue__SubParameterValuesAssignment_4_0_1 )*
            {
             before(grammarAccess.getParameterValueAccess().getSubParameterValuesAssignment_4_0_1()); 
            // InternalPipelineParser.g:4422:2: ( rule__ParameterValue__SubParameterValuesAssignment_4_0_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==WriteAll||LA42_0==ReadAll||LA42_0==Write||(LA42_0>=None && LA42_0<=Read)||LA42_0==HyphenMinus||LA42_0==RULE_COMPLEX_EXPRESSION||LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPipelineParser.g:4422:3: rule__ParameterValue__SubParameterValuesAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ParameterValue__SubParameterValuesAssignment_4_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getParameterValueAccess().getSubParameterValuesAssignment_4_0_1()); 

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
    // $ANTLR end "rule__ParameterValue__Group_4_0__1__Impl"


    // $ANTLR start "rule__ParameterValue__Group_4_0__2"
    // InternalPipelineParser.g:4430:1: rule__ParameterValue__Group_4_0__2 : rule__ParameterValue__Group_4_0__2__Impl ;
    public final void rule__ParameterValue__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4434:1: ( rule__ParameterValue__Group_4_0__2__Impl )
            // InternalPipelineParser.g:4435:2: rule__ParameterValue__Group_4_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_4_0__2__Impl();

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
    // $ANTLR end "rule__ParameterValue__Group_4_0__2"


    // $ANTLR start "rule__ParameterValue__Group_4_0__2__Impl"
    // InternalPipelineParser.g:4441:1: rule__ParameterValue__Group_4_0__2__Impl : ( RULE_END ) ;
    public final void rule__ParameterValue__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4445:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:4446:1: ( RULE_END )
            {
            // InternalPipelineParser.g:4446:1: ( RULE_END )
            // InternalPipelineParser.g:4447:2: RULE_END
            {
             before(grammarAccess.getParameterValueAccess().getENDTerminalRuleCall_4_0_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParameterValueAccess().getENDTerminalRuleCall_4_0_2()); 

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
    // $ANTLR end "rule__ParameterValue__Group_4_0__2__Impl"


    // $ANTLR start "rule__ParameterValue__Group_4_1__0"
    // InternalPipelineParser.g:4457:1: rule__ParameterValue__Group_4_1__0 : rule__ParameterValue__Group_4_1__0__Impl rule__ParameterValue__Group_4_1__1 ;
    public final void rule__ParameterValue__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4461:1: ( rule__ParameterValue__Group_4_1__0__Impl rule__ParameterValue__Group_4_1__1 )
            // InternalPipelineParser.g:4462:2: rule__ParameterValue__Group_4_1__0__Impl rule__ParameterValue__Group_4_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ParameterValue__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_4_1__1();

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
    // $ANTLR end "rule__ParameterValue__Group_4_1__0"


    // $ANTLR start "rule__ParameterValue__Group_4_1__0__Impl"
    // InternalPipelineParser.g:4469:1: rule__ParameterValue__Group_4_1__0__Impl : ( ( rule__ParameterValue__ValueAssignment_4_1_0 ) ) ;
    public final void rule__ParameterValue__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4473:1: ( ( ( rule__ParameterValue__ValueAssignment_4_1_0 ) ) )
            // InternalPipelineParser.g:4474:1: ( ( rule__ParameterValue__ValueAssignment_4_1_0 ) )
            {
            // InternalPipelineParser.g:4474:1: ( ( rule__ParameterValue__ValueAssignment_4_1_0 ) )
            // InternalPipelineParser.g:4475:2: ( rule__ParameterValue__ValueAssignment_4_1_0 )
            {
             before(grammarAccess.getParameterValueAccess().getValueAssignment_4_1_0()); 
            // InternalPipelineParser.g:4476:2: ( rule__ParameterValue__ValueAssignment_4_1_0 )
            // InternalPipelineParser.g:4476:3: rule__ParameterValue__ValueAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__ValueAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getValueAssignment_4_1_0()); 

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
    // $ANTLR end "rule__ParameterValue__Group_4_1__0__Impl"


    // $ANTLR start "rule__ParameterValue__Group_4_1__1"
    // InternalPipelineParser.g:4484:1: rule__ParameterValue__Group_4_1__1 : rule__ParameterValue__Group_4_1__1__Impl ;
    public final void rule__ParameterValue__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4488:1: ( rule__ParameterValue__Group_4_1__1__Impl )
            // InternalPipelineParser.g:4489:2: rule__ParameterValue__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__ParameterValue__Group_4_1__1"


    // $ANTLR start "rule__ParameterValue__Group_4_1__1__Impl"
    // InternalPipelineParser.g:4495:1: rule__ParameterValue__Group_4_1__1__Impl : ( ( rule__ParameterValue__Group_4_1_1__0 )? ) ;
    public final void rule__ParameterValue__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4499:1: ( ( ( rule__ParameterValue__Group_4_1_1__0 )? ) )
            // InternalPipelineParser.g:4500:1: ( ( rule__ParameterValue__Group_4_1_1__0 )? )
            {
            // InternalPipelineParser.g:4500:1: ( ( rule__ParameterValue__Group_4_1_1__0 )? )
            // InternalPipelineParser.g:4501:2: ( rule__ParameterValue__Group_4_1_1__0 )?
            {
             before(grammarAccess.getParameterValueAccess().getGroup_4_1_1()); 
            // InternalPipelineParser.g:4502:2: ( rule__ParameterValue__Group_4_1_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_BEGIN) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPipelineParser.g:4502:3: rule__ParameterValue__Group_4_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__Group_4_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterValueAccess().getGroup_4_1_1()); 

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
    // $ANTLR end "rule__ParameterValue__Group_4_1__1__Impl"


    // $ANTLR start "rule__ParameterValue__Group_4_1_1__0"
    // InternalPipelineParser.g:4511:1: rule__ParameterValue__Group_4_1_1__0 : rule__ParameterValue__Group_4_1_1__0__Impl rule__ParameterValue__Group_4_1_1__1 ;
    public final void rule__ParameterValue__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4515:1: ( rule__ParameterValue__Group_4_1_1__0__Impl rule__ParameterValue__Group_4_1_1__1 )
            // InternalPipelineParser.g:4516:2: rule__ParameterValue__Group_4_1_1__0__Impl rule__ParameterValue__Group_4_1_1__1
            {
            pushFollow(FOLLOW_32);
            rule__ParameterValue__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_4_1_1__1();

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
    // $ANTLR end "rule__ParameterValue__Group_4_1_1__0"


    // $ANTLR start "rule__ParameterValue__Group_4_1_1__0__Impl"
    // InternalPipelineParser.g:4523:1: rule__ParameterValue__Group_4_1_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterValue__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4527:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:4528:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:4528:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:4529:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__ParameterValue__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__ParameterValue__Group_4_1_1__1"
    // InternalPipelineParser.g:4538:1: rule__ParameterValue__Group_4_1_1__1 : rule__ParameterValue__Group_4_1_1__1__Impl rule__ParameterValue__Group_4_1_1__2 ;
    public final void rule__ParameterValue__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4542:1: ( rule__ParameterValue__Group_4_1_1__1__Impl rule__ParameterValue__Group_4_1_1__2 )
            // InternalPipelineParser.g:4543:2: rule__ParameterValue__Group_4_1_1__1__Impl rule__ParameterValue__Group_4_1_1__2
            {
            pushFollow(FOLLOW_32);
            rule__ParameterValue__Group_4_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_4_1_1__2();

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
    // $ANTLR end "rule__ParameterValue__Group_4_1_1__1"


    // $ANTLR start "rule__ParameterValue__Group_4_1_1__1__Impl"
    // InternalPipelineParser.g:4550:1: rule__ParameterValue__Group_4_1_1__1__Impl : ( ( rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1 )* ) ;
    public final void rule__ParameterValue__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4554:1: ( ( ( rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1 )* ) )
            // InternalPipelineParser.g:4555:1: ( ( rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1 )* )
            {
            // InternalPipelineParser.g:4555:1: ( ( rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1 )* )
            // InternalPipelineParser.g:4556:2: ( rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1 )*
            {
             before(grammarAccess.getParameterValueAccess().getSubParameterValuesAssignment_4_1_1_1()); 
            // InternalPipelineParser.g:4557:2: ( rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==WriteAll||LA44_0==ReadAll||LA44_0==Write||(LA44_0>=None && LA44_0<=Read)||LA44_0==HyphenMinus||LA44_0==RULE_COMPLEX_EXPRESSION||LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPipelineParser.g:4557:3: rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getParameterValueAccess().getSubParameterValuesAssignment_4_1_1_1()); 

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
    // $ANTLR end "rule__ParameterValue__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__ParameterValue__Group_4_1_1__2"
    // InternalPipelineParser.g:4565:1: rule__ParameterValue__Group_4_1_1__2 : rule__ParameterValue__Group_4_1_1__2__Impl ;
    public final void rule__ParameterValue__Group_4_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4569:1: ( rule__ParameterValue__Group_4_1_1__2__Impl )
            // InternalPipelineParser.g:4570:2: rule__ParameterValue__Group_4_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_4_1_1__2__Impl();

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
    // $ANTLR end "rule__ParameterValue__Group_4_1_1__2"


    // $ANTLR start "rule__ParameterValue__Group_4_1_1__2__Impl"
    // InternalPipelineParser.g:4576:1: rule__ParameterValue__Group_4_1_1__2__Impl : ( RULE_END ) ;
    public final void rule__ParameterValue__Group_4_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4580:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:4581:1: ( RULE_END )
            {
            // InternalPipelineParser.g:4581:1: ( RULE_END )
            // InternalPipelineParser.g:4582:2: RULE_END
            {
             before(grammarAccess.getParameterValueAccess().getENDTerminalRuleCall_4_1_1_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParameterValueAccess().getENDTerminalRuleCall_4_1_1_2()); 

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
    // $ANTLR end "rule__ParameterValue__Group_4_1_1__2__Impl"


    // $ANTLR start "rule__KeyValue__Group__0"
    // InternalPipelineParser.g:4592:1: rule__KeyValue__Group__0 : rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1 ;
    public final void rule__KeyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4596:1: ( rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1 )
            // InternalPipelineParser.g:4597:2: rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__KeyValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValue__Group__1();

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
    // $ANTLR end "rule__KeyValue__Group__0"


    // $ANTLR start "rule__KeyValue__Group__0__Impl"
    // InternalPipelineParser.g:4604:1: rule__KeyValue__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__KeyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4608:1: ( ( RULE_ID ) )
            // InternalPipelineParser.g:4609:1: ( RULE_ID )
            {
            // InternalPipelineParser.g:4609:1: ( RULE_ID )
            // InternalPipelineParser.g:4610:2: RULE_ID
            {
             before(grammarAccess.getKeyValueAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKeyValueAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__KeyValue__Group__0__Impl"


    // $ANTLR start "rule__KeyValue__Group__1"
    // InternalPipelineParser.g:4619:1: rule__KeyValue__Group__1 : rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2 ;
    public final void rule__KeyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4623:1: ( rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2 )
            // InternalPipelineParser.g:4624:2: rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__KeyValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValue__Group__2();

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
    // $ANTLR end "rule__KeyValue__Group__1"


    // $ANTLR start "rule__KeyValue__Group__1__Impl"
    // InternalPipelineParser.g:4631:1: rule__KeyValue__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4635:1: ( ( Colon ) )
            // InternalPipelineParser.g:4636:1: ( Colon )
            {
            // InternalPipelineParser.g:4636:1: ( Colon )
            // InternalPipelineParser.g:4637:2: Colon
            {
             before(grammarAccess.getKeyValueAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getKeyValueAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__KeyValue__Group__1__Impl"


    // $ANTLR start "rule__KeyValue__Group__2"
    // InternalPipelineParser.g:4646:1: rule__KeyValue__Group__2 : rule__KeyValue__Group__2__Impl ;
    public final void rule__KeyValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4650:1: ( rule__KeyValue__Group__2__Impl )
            // InternalPipelineParser.g:4651:2: rule__KeyValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyValue__Group__2__Impl();

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
    // $ANTLR end "rule__KeyValue__Group__2"


    // $ANTLR start "rule__KeyValue__Group__2__Impl"
    // InternalPipelineParser.g:4657:1: rule__KeyValue__Group__2__Impl : ( ruleAnyData ) ;
    public final void rule__KeyValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4661:1: ( ( ruleAnyData ) )
            // InternalPipelineParser.g:4662:1: ( ruleAnyData )
            {
            // InternalPipelineParser.g:4662:1: ( ruleAnyData )
            // InternalPipelineParser.g:4663:2: ruleAnyData
            {
             before(grammarAccess.getKeyValueAccess().getAnyDataParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAnyData();

            state._fsp--;

             after(grammarAccess.getKeyValueAccess().getAnyDataParserRuleCall_2()); 

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
    // $ANTLR end "rule__KeyValue__Group__2__Impl"


    // $ANTLR start "rule__IndPermissionValue__Group__0"
    // InternalPipelineParser.g:4673:1: rule__IndPermissionValue__Group__0 : rule__IndPermissionValue__Group__0__Impl rule__IndPermissionValue__Group__1 ;
    public final void rule__IndPermissionValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4677:1: ( rule__IndPermissionValue__Group__0__Impl rule__IndPermissionValue__Group__1 )
            // InternalPipelineParser.g:4678:2: rule__IndPermissionValue__Group__0__Impl rule__IndPermissionValue__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__IndPermissionValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndPermissionValue__Group__1();

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
    // $ANTLR end "rule__IndPermissionValue__Group__0"


    // $ANTLR start "rule__IndPermissionValue__Group__0__Impl"
    // InternalPipelineParser.g:4685:1: rule__IndPermissionValue__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__IndPermissionValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4689:1: ( ( RULE_ID ) )
            // InternalPipelineParser.g:4690:1: ( RULE_ID )
            {
            // InternalPipelineParser.g:4690:1: ( RULE_ID )
            // InternalPipelineParser.g:4691:2: RULE_ID
            {
             before(grammarAccess.getIndPermissionValueAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndPermissionValueAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IndPermissionValue__Group__0__Impl"


    // $ANTLR start "rule__IndPermissionValue__Group__1"
    // InternalPipelineParser.g:4700:1: rule__IndPermissionValue__Group__1 : rule__IndPermissionValue__Group__1__Impl rule__IndPermissionValue__Group__2 ;
    public final void rule__IndPermissionValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4704:1: ( rule__IndPermissionValue__Group__1__Impl rule__IndPermissionValue__Group__2 )
            // InternalPipelineParser.g:4705:2: rule__IndPermissionValue__Group__1__Impl rule__IndPermissionValue__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__IndPermissionValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndPermissionValue__Group__2();

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
    // $ANTLR end "rule__IndPermissionValue__Group__1"


    // $ANTLR start "rule__IndPermissionValue__Group__1__Impl"
    // InternalPipelineParser.g:4712:1: rule__IndPermissionValue__Group__1__Impl : ( Colon ) ;
    public final void rule__IndPermissionValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4716:1: ( ( Colon ) )
            // InternalPipelineParser.g:4717:1: ( Colon )
            {
            // InternalPipelineParser.g:4717:1: ( Colon )
            // InternalPipelineParser.g:4718:2: Colon
            {
             before(grammarAccess.getIndPermissionValueAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getIndPermissionValueAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__IndPermissionValue__Group__1__Impl"


    // $ANTLR start "rule__IndPermissionValue__Group__2"
    // InternalPipelineParser.g:4727:1: rule__IndPermissionValue__Group__2 : rule__IndPermissionValue__Group__2__Impl ;
    public final void rule__IndPermissionValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4731:1: ( rule__IndPermissionValue__Group__2__Impl )
            // InternalPipelineParser.g:4732:2: rule__IndPermissionValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndPermissionValue__Group__2__Impl();

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
    // $ANTLR end "rule__IndPermissionValue__Group__2"


    // $ANTLR start "rule__IndPermissionValue__Group__2__Impl"
    // InternalPipelineParser.g:4738:1: rule__IndPermissionValue__Group__2__Impl : ( ( rule__IndPermissionValue__Alternatives_2 ) ) ;
    public final void rule__IndPermissionValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4742:1: ( ( ( rule__IndPermissionValue__Alternatives_2 ) ) )
            // InternalPipelineParser.g:4743:1: ( ( rule__IndPermissionValue__Alternatives_2 ) )
            {
            // InternalPipelineParser.g:4743:1: ( ( rule__IndPermissionValue__Alternatives_2 ) )
            // InternalPipelineParser.g:4744:2: ( rule__IndPermissionValue__Alternatives_2 )
            {
             before(grammarAccess.getIndPermissionValueAccess().getAlternatives_2()); 
            // InternalPipelineParser.g:4745:2: ( rule__IndPermissionValue__Alternatives_2 )
            // InternalPipelineParser.g:4745:3: rule__IndPermissionValue__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__IndPermissionValue__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getIndPermissionValueAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__IndPermissionValue__Group__2__Impl"


    // $ANTLR start "rule__UnquotedString__Group__0"
    // InternalPipelineParser.g:4754:1: rule__UnquotedString__Group__0 : rule__UnquotedString__Group__0__Impl rule__UnquotedString__Group__1 ;
    public final void rule__UnquotedString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4758:1: ( rule__UnquotedString__Group__0__Impl rule__UnquotedString__Group__1 )
            // InternalPipelineParser.g:4759:2: rule__UnquotedString__Group__0__Impl rule__UnquotedString__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalPipelineParser.g:4766:1: rule__UnquotedString__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__UnquotedString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4770:1: ( ( RULE_ID ) )
            // InternalPipelineParser.g:4771:1: ( RULE_ID )
            {
            // InternalPipelineParser.g:4771:1: ( RULE_ID )
            // InternalPipelineParser.g:4772:2: RULE_ID
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
    // InternalPipelineParser.g:4781:1: rule__UnquotedString__Group__1 : rule__UnquotedString__Group__1__Impl ;
    public final void rule__UnquotedString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4785:1: ( rule__UnquotedString__Group__1__Impl )
            // InternalPipelineParser.g:4786:2: rule__UnquotedString__Group__1__Impl
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
    // InternalPipelineParser.g:4792:1: rule__UnquotedString__Group__1__Impl : ( ( rule__UnquotedString__Alternatives_1 )* ) ;
    public final void rule__UnquotedString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4796:1: ( ( ( rule__UnquotedString__Alternatives_1 )* ) )
            // InternalPipelineParser.g:4797:1: ( ( rule__UnquotedString__Alternatives_1 )* )
            {
            // InternalPipelineParser.g:4797:1: ( ( rule__UnquotedString__Alternatives_1 )* )
            // InternalPipelineParser.g:4798:2: ( rule__UnquotedString__Alternatives_1 )*
            {
             before(grammarAccess.getUnquotedStringAccess().getAlternatives_1()); 
            // InternalPipelineParser.g:4799:2: ( rule__UnquotedString__Alternatives_1 )*
            loop45:
            do {
                int alt45=2;
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
                        alt45=1;
                    }


                    }
                    break;
                case RULE_INT:
                    {
                    alt45=1;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // InternalPipelineParser.g:4799:3: rule__UnquotedString__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__UnquotedString__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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


    // $ANTLR start "rule__HyphenValues__Group_0__0"
    // InternalPipelineParser.g:4808:1: rule__HyphenValues__Group_0__0 : rule__HyphenValues__Group_0__0__Impl rule__HyphenValues__Group_0__1 ;
    public final void rule__HyphenValues__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4812:1: ( rule__HyphenValues__Group_0__0__Impl rule__HyphenValues__Group_0__1 )
            // InternalPipelineParser.g:4813:2: rule__HyphenValues__Group_0__0__Impl rule__HyphenValues__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__HyphenValues__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HyphenValues__Group_0__1();

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
    // $ANTLR end "rule__HyphenValues__Group_0__0"


    // $ANTLR start "rule__HyphenValues__Group_0__0__Impl"
    // InternalPipelineParser.g:4820:1: rule__HyphenValues__Group_0__0__Impl : ( HyphenMinus ) ;
    public final void rule__HyphenValues__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4824:1: ( ( HyphenMinus ) )
            // InternalPipelineParser.g:4825:1: ( HyphenMinus )
            {
            // InternalPipelineParser.g:4825:1: ( HyphenMinus )
            // InternalPipelineParser.g:4826:2: HyphenMinus
            {
             before(grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_0_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_0_0()); 

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
    // $ANTLR end "rule__HyphenValues__Group_0__0__Impl"


    // $ANTLR start "rule__HyphenValues__Group_0__1"
    // InternalPipelineParser.g:4835:1: rule__HyphenValues__Group_0__1 : rule__HyphenValues__Group_0__1__Impl ;
    public final void rule__HyphenValues__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4839:1: ( rule__HyphenValues__Group_0__1__Impl )
            // InternalPipelineParser.g:4840:2: rule__HyphenValues__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HyphenValues__Group_0__1__Impl();

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
    // $ANTLR end "rule__HyphenValues__Group_0__1"


    // $ANTLR start "rule__HyphenValues__Group_0__1__Impl"
    // InternalPipelineParser.g:4846:1: rule__HyphenValues__Group_0__1__Impl : ( ruleAnyData ) ;
    public final void rule__HyphenValues__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4850:1: ( ( ruleAnyData ) )
            // InternalPipelineParser.g:4851:1: ( ruleAnyData )
            {
            // InternalPipelineParser.g:4851:1: ( ruleAnyData )
            // InternalPipelineParser.g:4852:2: ruleAnyData
            {
             before(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleAnyData();

            state._fsp--;

             after(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__HyphenValues__Group_0__1__Impl"


    // $ANTLR start "rule__HyphenValues__Group_1__0"
    // InternalPipelineParser.g:4862:1: rule__HyphenValues__Group_1__0 : rule__HyphenValues__Group_1__0__Impl rule__HyphenValues__Group_1__1 ;
    public final void rule__HyphenValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4866:1: ( rule__HyphenValues__Group_1__0__Impl rule__HyphenValues__Group_1__1 )
            // InternalPipelineParser.g:4867:2: rule__HyphenValues__Group_1__0__Impl rule__HyphenValues__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__HyphenValues__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HyphenValues__Group_1__1();

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
    // $ANTLR end "rule__HyphenValues__Group_1__0"


    // $ANTLR start "rule__HyphenValues__Group_1__0__Impl"
    // InternalPipelineParser.g:4874:1: rule__HyphenValues__Group_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__HyphenValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4878:1: ( ( RULE_BEGIN ) )
            // InternalPipelineParser.g:4879:1: ( RULE_BEGIN )
            {
            // InternalPipelineParser.g:4879:1: ( RULE_BEGIN )
            // InternalPipelineParser.g:4880:2: RULE_BEGIN
            {
             before(grammarAccess.getHyphenValuesAccess().getBEGINTerminalRuleCall_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getHyphenValuesAccess().getBEGINTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__HyphenValues__Group_1__0__Impl"


    // $ANTLR start "rule__HyphenValues__Group_1__1"
    // InternalPipelineParser.g:4889:1: rule__HyphenValues__Group_1__1 : rule__HyphenValues__Group_1__1__Impl rule__HyphenValues__Group_1__2 ;
    public final void rule__HyphenValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4893:1: ( rule__HyphenValues__Group_1__1__Impl rule__HyphenValues__Group_1__2 )
            // InternalPipelineParser.g:4894:2: rule__HyphenValues__Group_1__1__Impl rule__HyphenValues__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__HyphenValues__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HyphenValues__Group_1__2();

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
    // $ANTLR end "rule__HyphenValues__Group_1__1"


    // $ANTLR start "rule__HyphenValues__Group_1__1__Impl"
    // InternalPipelineParser.g:4901:1: rule__HyphenValues__Group_1__1__Impl : ( ( ( rule__HyphenValues__Group_1_1__0 ) ) ( ( rule__HyphenValues__Group_1_1__0 )* ) ) ;
    public final void rule__HyphenValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4905:1: ( ( ( ( rule__HyphenValues__Group_1_1__0 ) ) ( ( rule__HyphenValues__Group_1_1__0 )* ) ) )
            // InternalPipelineParser.g:4906:1: ( ( ( rule__HyphenValues__Group_1_1__0 ) ) ( ( rule__HyphenValues__Group_1_1__0 )* ) )
            {
            // InternalPipelineParser.g:4906:1: ( ( ( rule__HyphenValues__Group_1_1__0 ) ) ( ( rule__HyphenValues__Group_1_1__0 )* ) )
            // InternalPipelineParser.g:4907:2: ( ( rule__HyphenValues__Group_1_1__0 ) ) ( ( rule__HyphenValues__Group_1_1__0 )* )
            {
            // InternalPipelineParser.g:4907:2: ( ( rule__HyphenValues__Group_1_1__0 ) )
            // InternalPipelineParser.g:4908:3: ( rule__HyphenValues__Group_1_1__0 )
            {
             before(grammarAccess.getHyphenValuesAccess().getGroup_1_1()); 
            // InternalPipelineParser.g:4909:3: ( rule__HyphenValues__Group_1_1__0 )
            // InternalPipelineParser.g:4909:4: rule__HyphenValues__Group_1_1__0
            {
            pushFollow(FOLLOW_3);
            rule__HyphenValues__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getHyphenValuesAccess().getGroup_1_1()); 

            }

            // InternalPipelineParser.g:4912:2: ( ( rule__HyphenValues__Group_1_1__0 )* )
            // InternalPipelineParser.g:4913:3: ( rule__HyphenValues__Group_1_1__0 )*
            {
             before(grammarAccess.getHyphenValuesAccess().getGroup_1_1()); 
            // InternalPipelineParser.g:4914:3: ( rule__HyphenValues__Group_1_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==HyphenMinus) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPipelineParser.g:4914:4: rule__HyphenValues__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__HyphenValues__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getHyphenValuesAccess().getGroup_1_1()); 

            }


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
    // $ANTLR end "rule__HyphenValues__Group_1__1__Impl"


    // $ANTLR start "rule__HyphenValues__Group_1__2"
    // InternalPipelineParser.g:4923:1: rule__HyphenValues__Group_1__2 : rule__HyphenValues__Group_1__2__Impl ;
    public final void rule__HyphenValues__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4927:1: ( rule__HyphenValues__Group_1__2__Impl )
            // InternalPipelineParser.g:4928:2: rule__HyphenValues__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HyphenValues__Group_1__2__Impl();

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
    // $ANTLR end "rule__HyphenValues__Group_1__2"


    // $ANTLR start "rule__HyphenValues__Group_1__2__Impl"
    // InternalPipelineParser.g:4934:1: rule__HyphenValues__Group_1__2__Impl : ( RULE_END ) ;
    public final void rule__HyphenValues__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4938:1: ( ( RULE_END ) )
            // InternalPipelineParser.g:4939:1: ( RULE_END )
            {
            // InternalPipelineParser.g:4939:1: ( RULE_END )
            // InternalPipelineParser.g:4940:2: RULE_END
            {
             before(grammarAccess.getHyphenValuesAccess().getENDTerminalRuleCall_1_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getHyphenValuesAccess().getENDTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__HyphenValues__Group_1__2__Impl"


    // $ANTLR start "rule__HyphenValues__Group_1_1__0"
    // InternalPipelineParser.g:4950:1: rule__HyphenValues__Group_1_1__0 : rule__HyphenValues__Group_1_1__0__Impl rule__HyphenValues__Group_1_1__1 ;
    public final void rule__HyphenValues__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4954:1: ( rule__HyphenValues__Group_1_1__0__Impl rule__HyphenValues__Group_1_1__1 )
            // InternalPipelineParser.g:4955:2: rule__HyphenValues__Group_1_1__0__Impl rule__HyphenValues__Group_1_1__1
            {
            pushFollow(FOLLOW_35);
            rule__HyphenValues__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HyphenValues__Group_1_1__1();

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
    // $ANTLR end "rule__HyphenValues__Group_1_1__0"


    // $ANTLR start "rule__HyphenValues__Group_1_1__0__Impl"
    // InternalPipelineParser.g:4962:1: rule__HyphenValues__Group_1_1__0__Impl : ( HyphenMinus ) ;
    public final void rule__HyphenValues__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4966:1: ( ( HyphenMinus ) )
            // InternalPipelineParser.g:4967:1: ( HyphenMinus )
            {
            // InternalPipelineParser.g:4967:1: ( HyphenMinus )
            // InternalPipelineParser.g:4968:2: HyphenMinus
            {
             before(grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_1_1_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_1_1_0()); 

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
    // $ANTLR end "rule__HyphenValues__Group_1_1__0__Impl"


    // $ANTLR start "rule__HyphenValues__Group_1_1__1"
    // InternalPipelineParser.g:4977:1: rule__HyphenValues__Group_1_1__1 : rule__HyphenValues__Group_1_1__1__Impl ;
    public final void rule__HyphenValues__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4981:1: ( rule__HyphenValues__Group_1_1__1__Impl )
            // InternalPipelineParser.g:4982:2: rule__HyphenValues__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HyphenValues__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__HyphenValues__Group_1_1__1"


    // $ANTLR start "rule__HyphenValues__Group_1_1__1__Impl"
    // InternalPipelineParser.g:4988:1: rule__HyphenValues__Group_1_1__1__Impl : ( ruleAnyData ) ;
    public final void rule__HyphenValues__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:4992:1: ( ( ruleAnyData ) )
            // InternalPipelineParser.g:4993:1: ( ruleAnyData )
            {
            // InternalPipelineParser.g:4993:1: ( ruleAnyData )
            // InternalPipelineParser.g:4994:2: ruleAnyData
            {
             before(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_1_1_1()); 
            pushFollow(FOLLOW_2);
            ruleAnyData();

            state._fsp--;

             after(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__HyphenValues__Group_1_1__1__Impl"


    // $ANTLR start "rule__ArrayList__Group__0"
    // InternalPipelineParser.g:5004:1: rule__ArrayList__Group__0 : rule__ArrayList__Group__0__Impl rule__ArrayList__Group__1 ;
    public final void rule__ArrayList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5008:1: ( rule__ArrayList__Group__0__Impl rule__ArrayList__Group__1 )
            // InternalPipelineParser.g:5009:2: rule__ArrayList__Group__0__Impl rule__ArrayList__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalPipelineParser.g:5016:1: rule__ArrayList__Group__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5020:1: ( ( LeftSquareBracket ) )
            // InternalPipelineParser.g:5021:1: ( LeftSquareBracket )
            {
            // InternalPipelineParser.g:5021:1: ( LeftSquareBracket )
            // InternalPipelineParser.g:5022:2: LeftSquareBracket
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
    // InternalPipelineParser.g:5031:1: rule__ArrayList__Group__1 : rule__ArrayList__Group__1__Impl rule__ArrayList__Group__2 ;
    public final void rule__ArrayList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5035:1: ( rule__ArrayList__Group__1__Impl rule__ArrayList__Group__2 )
            // InternalPipelineParser.g:5036:2: rule__ArrayList__Group__1__Impl rule__ArrayList__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalPipelineParser.g:5043:1: rule__ArrayList__Group__1__Impl : ( ( rule__ArrayList__Group_1__0 )? ) ;
    public final void rule__ArrayList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5047:1: ( ( ( rule__ArrayList__Group_1__0 )? ) )
            // InternalPipelineParser.g:5048:1: ( ( rule__ArrayList__Group_1__0 )? )
            {
            // InternalPipelineParser.g:5048:1: ( ( rule__ArrayList__Group_1__0 )? )
            // InternalPipelineParser.g:5049:2: ( rule__ArrayList__Group_1__0 )?
            {
             before(grammarAccess.getArrayListAccess().getGroup_1()); 
            // InternalPipelineParser.g:5050:2: ( rule__ArrayList__Group_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_COMPLEX_EXPRESSION && LA47_0<=RULE_VERSION)||LA47_0==RULE_ID||LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPipelineParser.g:5050:3: rule__ArrayList__Group_1__0
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
    // InternalPipelineParser.g:5058:1: rule__ArrayList__Group__2 : rule__ArrayList__Group__2__Impl ;
    public final void rule__ArrayList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5062:1: ( rule__ArrayList__Group__2__Impl )
            // InternalPipelineParser.g:5063:2: rule__ArrayList__Group__2__Impl
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
    // InternalPipelineParser.g:5069:1: rule__ArrayList__Group__2__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5073:1: ( ( RightSquareBracket ) )
            // InternalPipelineParser.g:5074:1: ( RightSquareBracket )
            {
            // InternalPipelineParser.g:5074:1: ( RightSquareBracket )
            // InternalPipelineParser.g:5075:2: RightSquareBracket
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
    // InternalPipelineParser.g:5085:1: rule__ArrayList__Group_1__0 : rule__ArrayList__Group_1__0__Impl rule__ArrayList__Group_1__1 ;
    public final void rule__ArrayList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5089:1: ( rule__ArrayList__Group_1__0__Impl rule__ArrayList__Group_1__1 )
            // InternalPipelineParser.g:5090:2: rule__ArrayList__Group_1__0__Impl rule__ArrayList__Group_1__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalPipelineParser.g:5097:1: rule__ArrayList__Group_1__0__Impl : ( ruleAnyData ) ;
    public final void rule__ArrayList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5101:1: ( ( ruleAnyData ) )
            // InternalPipelineParser.g:5102:1: ( ruleAnyData )
            {
            // InternalPipelineParser.g:5102:1: ( ruleAnyData )
            // InternalPipelineParser.g:5103:2: ruleAnyData
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
    // InternalPipelineParser.g:5112:1: rule__ArrayList__Group_1__1 : rule__ArrayList__Group_1__1__Impl ;
    public final void rule__ArrayList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5116:1: ( rule__ArrayList__Group_1__1__Impl )
            // InternalPipelineParser.g:5117:2: rule__ArrayList__Group_1__1__Impl
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
    // InternalPipelineParser.g:5123:1: rule__ArrayList__Group_1__1__Impl : ( ( rule__ArrayList__Group_1_1__0 )* ) ;
    public final void rule__ArrayList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5127:1: ( ( ( rule__ArrayList__Group_1_1__0 )* ) )
            // InternalPipelineParser.g:5128:1: ( ( rule__ArrayList__Group_1_1__0 )* )
            {
            // InternalPipelineParser.g:5128:1: ( ( rule__ArrayList__Group_1_1__0 )* )
            // InternalPipelineParser.g:5129:2: ( rule__ArrayList__Group_1_1__0 )*
            {
             before(grammarAccess.getArrayListAccess().getGroup_1_1()); 
            // InternalPipelineParser.g:5130:2: ( rule__ArrayList__Group_1_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Comma) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalPipelineParser.g:5130:3: rule__ArrayList__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__ArrayList__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalPipelineParser.g:5139:1: rule__ArrayList__Group_1_1__0 : rule__ArrayList__Group_1_1__0__Impl rule__ArrayList__Group_1_1__1 ;
    public final void rule__ArrayList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5143:1: ( rule__ArrayList__Group_1_1__0__Impl rule__ArrayList__Group_1_1__1 )
            // InternalPipelineParser.g:5144:2: rule__ArrayList__Group_1_1__0__Impl rule__ArrayList__Group_1_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPipelineParser.g:5151:1: rule__ArrayList__Group_1_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayList__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5155:1: ( ( Comma ) )
            // InternalPipelineParser.g:5156:1: ( Comma )
            {
            // InternalPipelineParser.g:5156:1: ( Comma )
            // InternalPipelineParser.g:5157:2: Comma
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
    // InternalPipelineParser.g:5166:1: rule__ArrayList__Group_1_1__1 : rule__ArrayList__Group_1_1__1__Impl ;
    public final void rule__ArrayList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5170:1: ( rule__ArrayList__Group_1_1__1__Impl )
            // InternalPipelineParser.g:5171:2: rule__ArrayList__Group_1_1__1__Impl
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
    // InternalPipelineParser.g:5177:1: rule__ArrayList__Group_1_1__1__Impl : ( ruleAnyData ) ;
    public final void rule__ArrayList__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5181:1: ( ( ruleAnyData ) )
            // InternalPipelineParser.g:5182:1: ( ruleAnyData )
            {
            // InternalPipelineParser.g:5182:1: ( ruleAnyData )
            // InternalPipelineParser.g:5183:2: ruleAnyData
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


    // $ANTLR start "rule__Pipeline__UnorderedGroup"
    // InternalPipelineParser.g:5193:1: rule__Pipeline__UnorderedGroup : ( rule__Pipeline__UnorderedGroup__0 )? ;
    public final void rule__Pipeline__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup());
        	
        try {
            // InternalPipelineParser.g:5198:1: ( ( rule__Pipeline__UnorderedGroup__0 )? )
            // InternalPipelineParser.g:5199:2: ( rule__Pipeline__UnorderedGroup__0 )?
            {
            // InternalPipelineParser.g:5199:2: ( rule__Pipeline__UnorderedGroup__0 )?
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalPipelineParser.g:5199:2: rule__Pipeline__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__UnorderedGroup"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__Impl"
    // InternalPipelineParser.g:5207:1: rule__Pipeline__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Pipeline__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__UnorderedGroup_2 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__ExtendedParameterAssignment_11 ) ) ) ) ) ;
    public final void rule__Pipeline__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalPipelineParser.g:5212:1: ( ( ({...}? => ( ( ( rule__Pipeline__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__UnorderedGroup_2 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__ExtendedParameterAssignment_11 ) ) ) ) ) )
            // InternalPipelineParser.g:5213:3: ( ({...}? => ( ( ( rule__Pipeline__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__UnorderedGroup_2 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__ExtendedParameterAssignment_11 ) ) ) ) )
            {
            // InternalPipelineParser.g:5213:3: ( ({...}? => ( ( ( rule__Pipeline__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__UnorderedGroup_2 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__ExtendedParameterAssignment_11 ) ) ) ) )
            int alt50=12;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalPipelineParser.g:5214:3: ({...}? => ( ( ( rule__Pipeline__Group_0__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5214:3: ({...}? => ( ( ( rule__Pipeline__Group_0__0 ) ) ) )
                    // InternalPipelineParser.g:5215:4: {...}? => ( ( ( rule__Pipeline__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalPipelineParser.g:5215:102: ( ( ( rule__Pipeline__Group_0__0 ) ) )
                    // InternalPipelineParser.g:5216:5: ( ( rule__Pipeline__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5222:5: ( ( rule__Pipeline__Group_0__0 ) )
                    // InternalPipelineParser.g:5223:6: ( rule__Pipeline__Group_0__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_0()); 
                    // InternalPipelineParser.g:5224:6: ( rule__Pipeline__Group_0__0 )
                    // InternalPipelineParser.g:5224:7: rule__Pipeline__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:5229:3: ({...}? => ( ( ( rule__Pipeline__Group_1__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5229:3: ({...}? => ( ( ( rule__Pipeline__Group_1__0 ) ) ) )
                    // InternalPipelineParser.g:5230:4: {...}? => ( ( ( rule__Pipeline__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalPipelineParser.g:5230:102: ( ( ( rule__Pipeline__Group_1__0 ) ) )
                    // InternalPipelineParser.g:5231:5: ( ( rule__Pipeline__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5237:5: ( ( rule__Pipeline__Group_1__0 ) )
                    // InternalPipelineParser.g:5238:6: ( rule__Pipeline__Group_1__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_1()); 
                    // InternalPipelineParser.g:5239:6: ( rule__Pipeline__Group_1__0 )
                    // InternalPipelineParser.g:5239:7: rule__Pipeline__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:5244:3: ({...}? => ( ( ( rule__Pipeline__UnorderedGroup_2 ) ) ) )
                    {
                    // InternalPipelineParser.g:5244:3: ({...}? => ( ( ( rule__Pipeline__UnorderedGroup_2 ) ) ) )
                    // InternalPipelineParser.g:5245:4: {...}? => ( ( ( rule__Pipeline__UnorderedGroup_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalPipelineParser.g:5245:102: ( ( ( rule__Pipeline__UnorderedGroup_2 ) ) )
                    // InternalPipelineParser.g:5246:5: ( ( rule__Pipeline__UnorderedGroup_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5252:5: ( ( rule__Pipeline__UnorderedGroup_2 ) )
                    // InternalPipelineParser.g:5253:6: ( rule__Pipeline__UnorderedGroup_2 )
                    {
                     before(grammarAccess.getPipelineAccess().getUnorderedGroup_2()); 
                    // InternalPipelineParser.g:5254:6: ( rule__Pipeline__UnorderedGroup_2 )
                    // InternalPipelineParser.g:5254:7: rule__Pipeline__UnorderedGroup_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getUnorderedGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:5259:3: ({...}? => ( ( ( rule__Pipeline__Group_3__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5259:3: ({...}? => ( ( ( rule__Pipeline__Group_3__0 ) ) ) )
                    // InternalPipelineParser.g:5260:4: {...}? => ( ( ( rule__Pipeline__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalPipelineParser.g:5260:102: ( ( ( rule__Pipeline__Group_3__0 ) ) )
                    // InternalPipelineParser.g:5261:5: ( ( rule__Pipeline__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5267:5: ( ( rule__Pipeline__Group_3__0 ) )
                    // InternalPipelineParser.g:5268:6: ( rule__Pipeline__Group_3__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_3()); 
                    // InternalPipelineParser.g:5269:6: ( rule__Pipeline__Group_3__0 )
                    // InternalPipelineParser.g:5269:7: rule__Pipeline__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:5274:3: ({...}? => ( ( ( rule__Pipeline__Group_4__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5274:3: ({...}? => ( ( ( rule__Pipeline__Group_4__0 ) ) ) )
                    // InternalPipelineParser.g:5275:4: {...}? => ( ( ( rule__Pipeline__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalPipelineParser.g:5275:102: ( ( ( rule__Pipeline__Group_4__0 ) ) )
                    // InternalPipelineParser.g:5276:5: ( ( rule__Pipeline__Group_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5282:5: ( ( rule__Pipeline__Group_4__0 ) )
                    // InternalPipelineParser.g:5283:6: ( rule__Pipeline__Group_4__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_4()); 
                    // InternalPipelineParser.g:5284:6: ( rule__Pipeline__Group_4__0 )
                    // InternalPipelineParser.g:5284:7: rule__Pipeline__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:5289:3: ({...}? => ( ( ( rule__Pipeline__Group_5__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5289:3: ({...}? => ( ( ( rule__Pipeline__Group_5__0 ) ) ) )
                    // InternalPipelineParser.g:5290:4: {...}? => ( ( ( rule__Pipeline__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalPipelineParser.g:5290:102: ( ( ( rule__Pipeline__Group_5__0 ) ) )
                    // InternalPipelineParser.g:5291:5: ( ( rule__Pipeline__Group_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5297:5: ( ( rule__Pipeline__Group_5__0 ) )
                    // InternalPipelineParser.g:5298:6: ( rule__Pipeline__Group_5__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_5()); 
                    // InternalPipelineParser.g:5299:6: ( rule__Pipeline__Group_5__0 )
                    // InternalPipelineParser.g:5299:7: rule__Pipeline__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:5304:3: ({...}? => ( ( ( rule__Pipeline__Group_6__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5304:3: ({...}? => ( ( ( rule__Pipeline__Group_6__0 ) ) ) )
                    // InternalPipelineParser.g:5305:4: {...}? => ( ( ( rule__Pipeline__Group_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalPipelineParser.g:5305:102: ( ( ( rule__Pipeline__Group_6__0 ) ) )
                    // InternalPipelineParser.g:5306:5: ( ( rule__Pipeline__Group_6__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5312:5: ( ( rule__Pipeline__Group_6__0 ) )
                    // InternalPipelineParser.g:5313:6: ( rule__Pipeline__Group_6__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_6()); 
                    // InternalPipelineParser.g:5314:6: ( rule__Pipeline__Group_6__0 )
                    // InternalPipelineParser.g:5314:7: rule__Pipeline__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_6()); 

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalPipelineParser.g:5319:3: ({...}? => ( ( ( rule__Pipeline__Group_7__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5319:3: ({...}? => ( ( ( rule__Pipeline__Group_7__0 ) ) ) )
                    // InternalPipelineParser.g:5320:4: {...}? => ( ( ( rule__Pipeline__Group_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7)");
                    }
                    // InternalPipelineParser.g:5320:102: ( ( ( rule__Pipeline__Group_7__0 ) ) )
                    // InternalPipelineParser.g:5321:5: ( ( rule__Pipeline__Group_7__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5327:5: ( ( rule__Pipeline__Group_7__0 ) )
                    // InternalPipelineParser.g:5328:6: ( rule__Pipeline__Group_7__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_7()); 
                    // InternalPipelineParser.g:5329:6: ( rule__Pipeline__Group_7__0 )
                    // InternalPipelineParser.g:5329:7: rule__Pipeline__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_7()); 

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalPipelineParser.g:5334:3: ({...}? => ( ( ( rule__Pipeline__Group_8__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5334:3: ({...}? => ( ( ( rule__Pipeline__Group_8__0 ) ) ) )
                    // InternalPipelineParser.g:5335:4: {...}? => ( ( ( rule__Pipeline__Group_8__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8)");
                    }
                    // InternalPipelineParser.g:5335:102: ( ( ( rule__Pipeline__Group_8__0 ) ) )
                    // InternalPipelineParser.g:5336:5: ( ( rule__Pipeline__Group_8__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5342:5: ( ( rule__Pipeline__Group_8__0 ) )
                    // InternalPipelineParser.g:5343:6: ( rule__Pipeline__Group_8__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_8()); 
                    // InternalPipelineParser.g:5344:6: ( rule__Pipeline__Group_8__0 )
                    // InternalPipelineParser.g:5344:7: rule__Pipeline__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_8()); 

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalPipelineParser.g:5349:3: ({...}? => ( ( ( rule__Pipeline__Group_9__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5349:3: ({...}? => ( ( ( rule__Pipeline__Group_9__0 ) ) ) )
                    // InternalPipelineParser.g:5350:4: {...}? => ( ( ( rule__Pipeline__Group_9__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9)");
                    }
                    // InternalPipelineParser.g:5350:102: ( ( ( rule__Pipeline__Group_9__0 ) ) )
                    // InternalPipelineParser.g:5351:5: ( ( rule__Pipeline__Group_9__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5357:5: ( ( rule__Pipeline__Group_9__0 ) )
                    // InternalPipelineParser.g:5358:6: ( rule__Pipeline__Group_9__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_9()); 
                    // InternalPipelineParser.g:5359:6: ( rule__Pipeline__Group_9__0 )
                    // InternalPipelineParser.g:5359:7: rule__Pipeline__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_9()); 

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalPipelineParser.g:5364:3: ({...}? => ( ( ( rule__Pipeline__Group_10__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5364:3: ({...}? => ( ( ( rule__Pipeline__Group_10__0 ) ) ) )
                    // InternalPipelineParser.g:5365:4: {...}? => ( ( ( rule__Pipeline__Group_10__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10)");
                    }
                    // InternalPipelineParser.g:5365:103: ( ( ( rule__Pipeline__Group_10__0 ) ) )
                    // InternalPipelineParser.g:5366:5: ( ( rule__Pipeline__Group_10__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5372:5: ( ( rule__Pipeline__Group_10__0 ) )
                    // InternalPipelineParser.g:5373:6: ( rule__Pipeline__Group_10__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_10()); 
                    // InternalPipelineParser.g:5374:6: ( rule__Pipeline__Group_10__0 )
                    // InternalPipelineParser.g:5374:7: rule__Pipeline__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_10()); 

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalPipelineParser.g:5379:3: ({...}? => ( ( ( rule__Pipeline__ExtendedParameterAssignment_11 ) ) ) )
                    {
                    // InternalPipelineParser.g:5379:3: ({...}? => ( ( ( rule__Pipeline__ExtendedParameterAssignment_11 ) ) ) )
                    // InternalPipelineParser.g:5380:4: {...}? => ( ( ( rule__Pipeline__ExtendedParameterAssignment_11 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11)");
                    }
                    // InternalPipelineParser.g:5380:103: ( ( ( rule__Pipeline__ExtendedParameterAssignment_11 ) ) )
                    // InternalPipelineParser.g:5381:5: ( ( rule__Pipeline__ExtendedParameterAssignment_11 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5387:5: ( ( rule__Pipeline__ExtendedParameterAssignment_11 ) )
                    // InternalPipelineParser.g:5388:6: ( rule__Pipeline__ExtendedParameterAssignment_11 )
                    {
                     before(grammarAccess.getPipelineAccess().getExtendedParameterAssignment_11()); 
                    // InternalPipelineParser.g:5389:6: ( rule__Pipeline__ExtendedParameterAssignment_11 )
                    // InternalPipelineParser.g:5389:7: rule__Pipeline__ExtendedParameterAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__ExtendedParameterAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getExtendedParameterAssignment_11()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__UnorderedGroup__Impl"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__0"
    // InternalPipelineParser.g:5402:1: rule__Pipeline__UnorderedGroup__0 : rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__1 )? ;
    public final void rule__Pipeline__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5406:1: ( rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__1 )? )
            // InternalPipelineParser.g:5407:2: rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_49);
            rule__Pipeline__UnorderedGroup__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5408:2: ( rule__Pipeline__UnorderedGroup__1 )?
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // InternalPipelineParser.g:5408:2: rule__Pipeline__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__0"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__1"
    // InternalPipelineParser.g:5414:1: rule__Pipeline__UnorderedGroup__1 : rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__2 )? ;
    public final void rule__Pipeline__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5418:1: ( rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__2 )? )
            // InternalPipelineParser.g:5419:2: rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_49);
            rule__Pipeline__UnorderedGroup__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5420:2: ( rule__Pipeline__UnorderedGroup__2 )?
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalPipelineParser.g:5420:2: rule__Pipeline__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__1"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__2"
    // InternalPipelineParser.g:5426:1: rule__Pipeline__UnorderedGroup__2 : rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__3 )? ;
    public final void rule__Pipeline__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5430:1: ( rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__3 )? )
            // InternalPipelineParser.g:5431:2: rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_49);
            rule__Pipeline__UnorderedGroup__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5432:2: ( rule__Pipeline__UnorderedGroup__3 )?
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // InternalPipelineParser.g:5432:2: rule__Pipeline__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__2"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__3"
    // InternalPipelineParser.g:5438:1: rule__Pipeline__UnorderedGroup__3 : rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__4 )? ;
    public final void rule__Pipeline__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5442:1: ( rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__4 )? )
            // InternalPipelineParser.g:5443:2: rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_49);
            rule__Pipeline__UnorderedGroup__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5444:2: ( rule__Pipeline__UnorderedGroup__4 )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalPipelineParser.g:5444:2: rule__Pipeline__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__4();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__3"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__4"
    // InternalPipelineParser.g:5450:1: rule__Pipeline__UnorderedGroup__4 : rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__5 )? ;
    public final void rule__Pipeline__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5454:1: ( rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__5 )? )
            // InternalPipelineParser.g:5455:2: rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_49);
            rule__Pipeline__UnorderedGroup__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5456:2: ( rule__Pipeline__UnorderedGroup__5 )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalPipelineParser.g:5456:2: rule__Pipeline__UnorderedGroup__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__5();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__4"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__5"
    // InternalPipelineParser.g:5462:1: rule__Pipeline__UnorderedGroup__5 : rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__6 )? ;
    public final void rule__Pipeline__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5466:1: ( rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__6 )? )
            // InternalPipelineParser.g:5467:2: rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_49);
            rule__Pipeline__UnorderedGroup__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5468:2: ( rule__Pipeline__UnorderedGroup__6 )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalPipelineParser.g:5468:2: rule__Pipeline__UnorderedGroup__6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__6();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__5"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__6"
    // InternalPipelineParser.g:5474:1: rule__Pipeline__UnorderedGroup__6 : rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__7 )? ;
    public final void rule__Pipeline__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5478:1: ( rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__7 )? )
            // InternalPipelineParser.g:5479:2: rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__7 )?
            {
            pushFollow(FOLLOW_49);
            rule__Pipeline__UnorderedGroup__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5480:2: ( rule__Pipeline__UnorderedGroup__7 )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // InternalPipelineParser.g:5480:2: rule__Pipeline__UnorderedGroup__7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__7();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__6"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__7"
    // InternalPipelineParser.g:5486:1: rule__Pipeline__UnorderedGroup__7 : rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__8 )? ;
    public final void rule__Pipeline__UnorderedGroup__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5490:1: ( rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__8 )? )
            // InternalPipelineParser.g:5491:2: rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__8 )?
            {
            pushFollow(FOLLOW_49);
            rule__Pipeline__UnorderedGroup__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5492:2: ( rule__Pipeline__UnorderedGroup__8 )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // InternalPipelineParser.g:5492:2: rule__Pipeline__UnorderedGroup__8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__8();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__7"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__8"
    // InternalPipelineParser.g:5498:1: rule__Pipeline__UnorderedGroup__8 : rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__9 )? ;
    public final void rule__Pipeline__UnorderedGroup__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5502:1: ( rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__9 )? )
            // InternalPipelineParser.g:5503:2: rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__9 )?
            {
            pushFollow(FOLLOW_49);
            rule__Pipeline__UnorderedGroup__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5504:2: ( rule__Pipeline__UnorderedGroup__9 )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalPipelineParser.g:5504:2: rule__Pipeline__UnorderedGroup__9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__9();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__8"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__9"
    // InternalPipelineParser.g:5510:1: rule__Pipeline__UnorderedGroup__9 : rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__10 )? ;
    public final void rule__Pipeline__UnorderedGroup__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5514:1: ( rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__10 )? )
            // InternalPipelineParser.g:5515:2: rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__10 )?
            {
            pushFollow(FOLLOW_49);
            rule__Pipeline__UnorderedGroup__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5516:2: ( rule__Pipeline__UnorderedGroup__10 )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // InternalPipelineParser.g:5516:2: rule__Pipeline__UnorderedGroup__10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__10();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__9"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__10"
    // InternalPipelineParser.g:5522:1: rule__Pipeline__UnorderedGroup__10 : rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__11 )? ;
    public final void rule__Pipeline__UnorderedGroup__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5526:1: ( rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__11 )? )
            // InternalPipelineParser.g:5527:2: rule__Pipeline__UnorderedGroup__Impl ( rule__Pipeline__UnorderedGroup__11 )?
            {
            pushFollow(FOLLOW_49);
            rule__Pipeline__UnorderedGroup__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5528:2: ( rule__Pipeline__UnorderedGroup__11 )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalPipelineParser.g:5528:2: rule__Pipeline__UnorderedGroup__11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup__11();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__10"


    // $ANTLR start "rule__Pipeline__UnorderedGroup__11"
    // InternalPipelineParser.g:5534:1: rule__Pipeline__UnorderedGroup__11 : rule__Pipeline__UnorderedGroup__Impl ;
    public final void rule__Pipeline__UnorderedGroup__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5538:1: ( rule__Pipeline__UnorderedGroup__Impl )
            // InternalPipelineParser.g:5539:2: rule__Pipeline__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup__11"


    // $ANTLR start "rule__Pipeline__UnorderedGroup_2"
    // InternalPipelineParser.g:5546:1: rule__Pipeline__UnorderedGroup_2 : rule__Pipeline__UnorderedGroup_2__0 {...}?;
    public final void rule__Pipeline__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup_2());
        	
        try {
            // InternalPipelineParser.g:5551:1: ( rule__Pipeline__UnorderedGroup_2__0 {...}?)
            // InternalPipelineParser.g:5552:2: rule__Pipeline__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__UnorderedGroup_2__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPipelineAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__UnorderedGroup_2"


    // $ANTLR start "rule__Pipeline__UnorderedGroup_2__Impl"
    // InternalPipelineParser.g:5560:1: rule__Pipeline__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Pipeline__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__Pipeline__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalPipelineParser.g:5565:1: ( ( ({...}? => ( ( ( rule__Pipeline__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_2_1__0 ) ) ) ) ) )
            // InternalPipelineParser.g:5566:3: ( ({...}? => ( ( ( rule__Pipeline__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_2_1__0 ) ) ) ) )
            {
            // InternalPipelineParser.g:5566:3: ( ({...}? => ( ( ( rule__Pipeline__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_2_1__0 ) ) ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( LA62_0 == Defaults && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 0) ) {
                alt62=1;
            }
            else if ( ( LA62_0 == WorkingDirectory || LA62_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 1) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalPipelineParser.g:5567:3: ({...}? => ( ( ( rule__Pipeline__Group_2_0__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5567:3: ({...}? => ( ( ( rule__Pipeline__Group_2_0__0 ) ) ) )
                    // InternalPipelineParser.g:5568:4: {...}? => ( ( ( rule__Pipeline__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalPipelineParser.g:5568:104: ( ( ( rule__Pipeline__Group_2_0__0 ) ) )
                    // InternalPipelineParser.g:5569:5: ( ( rule__Pipeline__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5575:5: ( ( rule__Pipeline__Group_2_0__0 ) )
                    // InternalPipelineParser.g:5576:6: ( rule__Pipeline__Group_2_0__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_2_0()); 
                    // InternalPipelineParser.g:5577:6: ( rule__Pipeline__Group_2_0__0 )
                    // InternalPipelineParser.g:5577:7: rule__Pipeline__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:5582:3: ({...}? => ( ( ( rule__Pipeline__Group_2_1__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5582:3: ({...}? => ( ( ( rule__Pipeline__Group_2_1__0 ) ) ) )
                    // InternalPipelineParser.g:5583:4: {...}? => ( ( ( rule__Pipeline__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalPipelineParser.g:5583:104: ( ( ( rule__Pipeline__Group_2_1__0 ) ) )
                    // InternalPipelineParser.g:5584:5: ( ( rule__Pipeline__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5590:5: ( ( rule__Pipeline__Group_2_1__0 ) )
                    // InternalPipelineParser.g:5591:6: ( rule__Pipeline__Group_2_1__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_2_1()); 
                    // InternalPipelineParser.g:5592:6: ( rule__Pipeline__Group_2_1__0 )
                    // InternalPipelineParser.g:5592:7: rule__Pipeline__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_2_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Pipeline__UnorderedGroup_2__0"
    // InternalPipelineParser.g:5605:1: rule__Pipeline__UnorderedGroup_2__0 : rule__Pipeline__UnorderedGroup_2__Impl ( rule__Pipeline__UnorderedGroup_2__1 )? ;
    public final void rule__Pipeline__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5609:1: ( rule__Pipeline__UnorderedGroup_2__Impl ( rule__Pipeline__UnorderedGroup_2__1 )? )
            // InternalPipelineParser.g:5610:2: rule__Pipeline__UnorderedGroup_2__Impl ( rule__Pipeline__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_50);
            rule__Pipeline__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5611:2: ( rule__Pipeline__UnorderedGroup_2__1 )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // InternalPipelineParser.g:5611:2: rule__Pipeline__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup_2__0"


    // $ANTLR start "rule__Pipeline__UnorderedGroup_2__1"
    // InternalPipelineParser.g:5617:1: rule__Pipeline__UnorderedGroup_2__1 : rule__Pipeline__UnorderedGroup_2__Impl ;
    public final void rule__Pipeline__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5621:1: ( rule__Pipeline__UnorderedGroup_2__Impl )
            // InternalPipelineParser.g:5622:2: rule__Pipeline__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__UnorderedGroup_2__Impl();

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup_2__1"


    // $ANTLR start "rule__Pipeline__UnorderedGroup_7_1"
    // InternalPipelineParser.g:5629:1: rule__Pipeline__UnorderedGroup_7_1 : rule__Pipeline__UnorderedGroup_7_1__0 {...}?;
    public final void rule__Pipeline__UnorderedGroup_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1());
        	
        try {
            // InternalPipelineParser.g:5634:1: ( rule__Pipeline__UnorderedGroup_7_1__0 {...}?)
            // InternalPipelineParser.g:5635:2: rule__Pipeline__UnorderedGroup_7_1__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__UnorderedGroup_7_1__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1()) ) {
                throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup_7_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__UnorderedGroup_7_1"


    // $ANTLR start "rule__Pipeline__UnorderedGroup_7_1__Impl"
    // InternalPipelineParser.g:5643:1: rule__Pipeline__UnorderedGroup_7_1__Impl : ( ({...}? => ( ( ( rule__Pipeline__Group_7_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_7_1_1__0 ) ) ) ) ) ;
    public final void rule__Pipeline__UnorderedGroup_7_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalPipelineParser.g:5648:1: ( ( ({...}? => ( ( ( rule__Pipeline__Group_7_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_7_1_1__0 ) ) ) ) ) )
            // InternalPipelineParser.g:5649:3: ( ({...}? => ( ( ( rule__Pipeline__Group_7_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_7_1_1__0 ) ) ) ) )
            {
            // InternalPipelineParser.g:5649:3: ( ({...}? => ( ( ( rule__Pipeline__Group_7_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_7_1_1__0 ) ) ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( LA64_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0) ) {
                alt64=1;
            }
            else if ( ( LA64_0 == Demands || LA64_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalPipelineParser.g:5650:3: ({...}? => ( ( ( rule__Pipeline__Group_7_1_0__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5650:3: ({...}? => ( ( ( rule__Pipeline__Group_7_1_0__0 ) ) ) )
                    // InternalPipelineParser.g:5651:4: {...}? => ( ( ( rule__Pipeline__Group_7_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup_7_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0)");
                    }
                    // InternalPipelineParser.g:5651:106: ( ( ( rule__Pipeline__Group_7_1_0__0 ) ) )
                    // InternalPipelineParser.g:5652:5: ( ( rule__Pipeline__Group_7_1_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5658:5: ( ( rule__Pipeline__Group_7_1_0__0 ) )
                    // InternalPipelineParser.g:5659:6: ( rule__Pipeline__Group_7_1_0__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_7_1_0()); 
                    // InternalPipelineParser.g:5660:6: ( rule__Pipeline__Group_7_1_0__0 )
                    // InternalPipelineParser.g:5660:7: rule__Pipeline__Group_7_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_7_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_7_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:5665:3: ({...}? => ( ( ( rule__Pipeline__Group_7_1_1__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5665:3: ({...}? => ( ( ( rule__Pipeline__Group_7_1_1__0 ) ) ) )
                    // InternalPipelineParser.g:5666:4: {...}? => ( ( ( rule__Pipeline__Group_7_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Pipeline__UnorderedGroup_7_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1)");
                    }
                    // InternalPipelineParser.g:5666:106: ( ( ( rule__Pipeline__Group_7_1_1__0 ) ) )
                    // InternalPipelineParser.g:5667:5: ( ( rule__Pipeline__Group_7_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5673:5: ( ( rule__Pipeline__Group_7_1_1__0 ) )
                    // InternalPipelineParser.g:5674:6: ( rule__Pipeline__Group_7_1_1__0 )
                    {
                     before(grammarAccess.getPipelineAccess().getGroup_7_1_1()); 
                    // InternalPipelineParser.g:5675:6: ( rule__Pipeline__Group_7_1_1__0 )
                    // InternalPipelineParser.g:5675:7: rule__Pipeline__Group_7_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__Group_7_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineAccess().getGroup_7_1_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__UnorderedGroup_7_1__Impl"


    // $ANTLR start "rule__Pipeline__UnorderedGroup_7_1__0"
    // InternalPipelineParser.g:5688:1: rule__Pipeline__UnorderedGroup_7_1__0 : rule__Pipeline__UnorderedGroup_7_1__Impl ( rule__Pipeline__UnorderedGroup_7_1__1 )? ;
    public final void rule__Pipeline__UnorderedGroup_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5692:1: ( rule__Pipeline__UnorderedGroup_7_1__Impl ( rule__Pipeline__UnorderedGroup_7_1__1 )? )
            // InternalPipelineParser.g:5693:2: rule__Pipeline__UnorderedGroup_7_1__Impl ( rule__Pipeline__UnorderedGroup_7_1__1 )?
            {
            pushFollow(FOLLOW_51);
            rule__Pipeline__UnorderedGroup_7_1__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5694:2: ( rule__Pipeline__UnorderedGroup_7_1__1 )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalPipelineParser.g:5694:2: rule__Pipeline__UnorderedGroup_7_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__UnorderedGroup_7_1__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup_7_1__0"


    // $ANTLR start "rule__Pipeline__UnorderedGroup_7_1__1"
    // InternalPipelineParser.g:5700:1: rule__Pipeline__UnorderedGroup_7_1__1 : rule__Pipeline__UnorderedGroup_7_1__Impl ;
    public final void rule__Pipeline__UnorderedGroup_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5704:1: ( rule__Pipeline__UnorderedGroup_7_1__Impl )
            // InternalPipelineParser.g:5705:2: rule__Pipeline__UnorderedGroup_7_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__UnorderedGroup_7_1__Impl();

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
    // $ANTLR end "rule__Pipeline__UnorderedGroup_7_1__1"


    // $ANTLR start "rule__PipelineParameter__UnorderedGroup_1"
    // InternalPipelineParser.g:5712:1: rule__PipelineParameter__UnorderedGroup_1 : rule__PipelineParameter__UnorderedGroup_1__0 {...}?;
    public final void rule__PipelineParameter__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1());
        	
        try {
            // InternalPipelineParser.g:5717:1: ( rule__PipelineParameter__UnorderedGroup_1__0 {...}?)
            // InternalPipelineParser.g:5718:2: rule__PipelineParameter__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__PipelineParameter__UnorderedGroup_1__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "rule__PipelineParameter__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PipelineParameter__UnorderedGroup_1"


    // $ANTLR start "rule__PipelineParameter__UnorderedGroup_1__Impl"
    // InternalPipelineParser.g:5726:1: rule__PipelineParameter__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__PipelineParameter__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PipelineParameter__Group_1_1__0 ) ) ) ) ) ;
    public final void rule__PipelineParameter__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalPipelineParser.g:5731:1: ( ( ({...}? => ( ( ( rule__PipelineParameter__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PipelineParameter__Group_1_1__0 ) ) ) ) ) )
            // InternalPipelineParser.g:5732:3: ( ({...}? => ( ( ( rule__PipelineParameter__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PipelineParameter__Group_1_1__0 ) ) ) ) )
            {
            // InternalPipelineParser.g:5732:3: ( ({...}? => ( ( ( rule__PipelineParameter__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PipelineParameter__Group_1_1__0 ) ) ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( LA66_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 0) ) {
                alt66=1;
            }
            else if ( ( LA66_0 == WriteAll || LA66_0 == ReadAll || LA66_0 == Write || LA66_0 >= None && LA66_0 <= Read || LA66_0 == HyphenMinus || LA66_0 == RULE_COMPLEX_EXPRESSION || LA66_0 >= RULE_END && LA66_0 <= RULE_ID ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalPipelineParser.g:5733:3: ({...}? => ( ( ( rule__PipelineParameter__Group_1_0__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5733:3: ({...}? => ( ( ( rule__PipelineParameter__Group_1_0__0 ) ) ) )
                    // InternalPipelineParser.g:5734:4: {...}? => ( ( ( rule__PipelineParameter__Group_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PipelineParameter__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalPipelineParser.g:5734:113: ( ( ( rule__PipelineParameter__Group_1_0__0 ) ) )
                    // InternalPipelineParser.g:5735:5: ( ( rule__PipelineParameter__Group_1_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5741:5: ( ( rule__PipelineParameter__Group_1_0__0 ) )
                    // InternalPipelineParser.g:5742:6: ( rule__PipelineParameter__Group_1_0__0 )
                    {
                     before(grammarAccess.getPipelineParameterAccess().getGroup_1_0()); 
                    // InternalPipelineParser.g:5743:6: ( rule__PipelineParameter__Group_1_0__0 )
                    // InternalPipelineParser.g:5743:7: rule__PipelineParameter__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PipelineParameter__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineParameterAccess().getGroup_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:5748:3: ({...}? => ( ( ( rule__PipelineParameter__Group_1_1__0 ) ) ) )
                    {
                    // InternalPipelineParser.g:5748:3: ({...}? => ( ( ( rule__PipelineParameter__Group_1_1__0 ) ) ) )
                    // InternalPipelineParser.g:5749:4: {...}? => ( ( ( rule__PipelineParameter__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PipelineParameter__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalPipelineParser.g:5749:113: ( ( ( rule__PipelineParameter__Group_1_1__0 ) ) )
                    // InternalPipelineParser.g:5750:5: ( ( rule__PipelineParameter__Group_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalPipelineParser.g:5756:5: ( ( rule__PipelineParameter__Group_1_1__0 ) )
                    // InternalPipelineParser.g:5757:6: ( rule__PipelineParameter__Group_1_1__0 )
                    {
                     before(grammarAccess.getPipelineParameterAccess().getGroup_1_1()); 
                    // InternalPipelineParser.g:5758:6: ( rule__PipelineParameter__Group_1_1__0 )
                    // InternalPipelineParser.g:5758:7: rule__PipelineParameter__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PipelineParameter__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPipelineParameterAccess().getGroup_1_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PipelineParameter__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__PipelineParameter__UnorderedGroup_1__0"
    // InternalPipelineParser.g:5771:1: rule__PipelineParameter__UnorderedGroup_1__0 : rule__PipelineParameter__UnorderedGroup_1__Impl ( rule__PipelineParameter__UnorderedGroup_1__1 )? ;
    public final void rule__PipelineParameter__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5775:1: ( rule__PipelineParameter__UnorderedGroup_1__Impl ( rule__PipelineParameter__UnorderedGroup_1__1 )? )
            // InternalPipelineParser.g:5776:2: rule__PipelineParameter__UnorderedGroup_1__Impl ( rule__PipelineParameter__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_52);
            rule__PipelineParameter__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalPipelineParser.g:5777:2: ( rule__PipelineParameter__UnorderedGroup_1__1 )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // InternalPipelineParser.g:5777:2: rule__PipelineParameter__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PipelineParameter__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__PipelineParameter__UnorderedGroup_1__0"


    // $ANTLR start "rule__PipelineParameter__UnorderedGroup_1__1"
    // InternalPipelineParser.g:5783:1: rule__PipelineParameter__UnorderedGroup_1__1 : rule__PipelineParameter__UnorderedGroup_1__Impl ;
    public final void rule__PipelineParameter__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5787:1: ( rule__PipelineParameter__UnorderedGroup_1__Impl )
            // InternalPipelineParser.g:5788:2: rule__PipelineParameter__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PipelineParameter__UnorderedGroup_1__Impl();

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
    // $ANTLR end "rule__PipelineParameter__UnorderedGroup_1__1"


    // $ANTLR start "rule__Pipeline__NameAssignment_0_1"
    // InternalPipelineParser.g:5795:1: rule__Pipeline__NameAssignment_0_1 : ( ruleUnquotedString ) ;
    public final void rule__Pipeline__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5799:1: ( ( ruleUnquotedString ) )
            // InternalPipelineParser.g:5800:2: ( ruleUnquotedString )
            {
            // InternalPipelineParser.g:5800:2: ( ruleUnquotedString )
            // InternalPipelineParser.g:5801:3: ruleUnquotedString
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


    // $ANTLR start "rule__Pipeline__RunNameAssignment_1_1"
    // InternalPipelineParser.g:5810:1: rule__Pipeline__RunNameAssignment_1_1 : ( ruleUnquotedString ) ;
    public final void rule__Pipeline__RunNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5814:1: ( ( ruleUnquotedString ) )
            // InternalPipelineParser.g:5815:2: ( ruleUnquotedString )
            {
            // InternalPipelineParser.g:5815:2: ( ruleUnquotedString )
            // InternalPipelineParser.g:5816:3: ruleUnquotedString
            {
             before(grammarAccess.getPipelineAccess().getRunNameUnquotedStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnquotedString();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getRunNameUnquotedStringParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Pipeline__RunNameAssignment_1_1"


    // $ANTLR start "rule__Pipeline__DefaultShellValueAssignment_2_0_4_1"
    // InternalPipelineParser.g:5825:1: rule__Pipeline__DefaultShellValueAssignment_2_0_4_1 : ( RULE_STRING ) ;
    public final void rule__Pipeline__DefaultShellValueAssignment_2_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5829:1: ( ( RULE_STRING ) )
            // InternalPipelineParser.g:5830:2: ( RULE_STRING )
            {
            // InternalPipelineParser.g:5830:2: ( RULE_STRING )
            // InternalPipelineParser.g:5831:3: RULE_STRING
            {
             before(grammarAccess.getPipelineAccess().getDefaultShellValueSTRINGTerminalRuleCall_2_0_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getDefaultShellValueSTRINGTerminalRuleCall_2_0_4_1_0()); 

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
    // $ANTLR end "rule__Pipeline__DefaultShellValueAssignment_2_0_4_1"


    // $ANTLR start "rule__Pipeline__DefaultWDValueAssignment_2_1_0_1"
    // InternalPipelineParser.g:5840:1: rule__Pipeline__DefaultWDValueAssignment_2_1_0_1 : ( RULE_STRING ) ;
    public final void rule__Pipeline__DefaultWDValueAssignment_2_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5844:1: ( ( RULE_STRING ) )
            // InternalPipelineParser.g:5845:2: ( RULE_STRING )
            {
            // InternalPipelineParser.g:5845:2: ( RULE_STRING )
            // InternalPipelineParser.g:5846:3: RULE_STRING
            {
             before(grammarAccess.getPipelineAccess().getDefaultWDValueSTRINGTerminalRuleCall_2_1_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getDefaultWDValueSTRINGTerminalRuleCall_2_1_0_1_0()); 

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
    // $ANTLR end "rule__Pipeline__DefaultWDValueAssignment_2_1_0_1"


    // $ANTLR start "rule__Pipeline__EnvAssignment_3_2_1"
    // InternalPipelineParser.g:5855:1: rule__Pipeline__EnvAssignment_3_2_1 : ( ruleKeyValue ) ;
    public final void rule__Pipeline__EnvAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5859:1: ( ( ruleKeyValue ) )
            // InternalPipelineParser.g:5860:2: ( ruleKeyValue )
            {
            // InternalPipelineParser.g:5860:2: ( ruleKeyValue )
            // InternalPipelineParser.g:5861:3: ruleKeyValue
            {
             before(grammarAccess.getPipelineAccess().getEnvKeyValueParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyValue();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getEnvKeyValueParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__Pipeline__EnvAssignment_3_2_1"


    // $ANTLR start "rule__Pipeline__AllPermissionAssignment_4_1_0"
    // InternalPipelineParser.g:5870:1: rule__Pipeline__AllPermissionAssignment_4_1_0 : ( rulePermission ) ;
    public final void rule__Pipeline__AllPermissionAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5874:1: ( ( rulePermission ) )
            // InternalPipelineParser.g:5875:2: ( rulePermission )
            {
            // InternalPipelineParser.g:5875:2: ( rulePermission )
            // InternalPipelineParser.g:5876:3: rulePermission
            {
             before(grammarAccess.getPipelineAccess().getAllPermissionPermissionEnumRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getAllPermissionPermissionEnumRuleCall_4_1_0_0()); 

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
    // $ANTLR end "rule__Pipeline__AllPermissionAssignment_4_1_0"


    // $ANTLR start "rule__Pipeline__IndPermissionsAssignment_4_1_1_1"
    // InternalPipelineParser.g:5885:1: rule__Pipeline__IndPermissionsAssignment_4_1_1_1 : ( ruleIndPermissionValue ) ;
    public final void rule__Pipeline__IndPermissionsAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5889:1: ( ( ruleIndPermissionValue ) )
            // InternalPipelineParser.g:5890:2: ( ruleIndPermissionValue )
            {
            // InternalPipelineParser.g:5890:2: ( ruleIndPermissionValue )
            // InternalPipelineParser.g:5891:3: ruleIndPermissionValue
            {
             before(grammarAccess.getPipelineAccess().getIndPermissionsIndPermissionValueParserRuleCall_4_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIndPermissionValue();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getIndPermissionsIndPermissionValueParserRuleCall_4_1_1_1_0()); 

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
    // $ANTLR end "rule__Pipeline__IndPermissionsAssignment_4_1_1_1"


    // $ANTLR start "rule__Pipeline__GroupAssignment_5_1_1_1"
    // InternalPipelineParser.g:5900:1: rule__Pipeline__GroupAssignment_5_1_1_1 : ( ( rule__Pipeline__GroupAlternatives_5_1_1_1_0 ) ) ;
    public final void rule__Pipeline__GroupAssignment_5_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5904:1: ( ( ( rule__Pipeline__GroupAlternatives_5_1_1_1_0 ) ) )
            // InternalPipelineParser.g:5905:2: ( ( rule__Pipeline__GroupAlternatives_5_1_1_1_0 ) )
            {
            // InternalPipelineParser.g:5905:2: ( ( rule__Pipeline__GroupAlternatives_5_1_1_1_0 ) )
            // InternalPipelineParser.g:5906:3: ( rule__Pipeline__GroupAlternatives_5_1_1_1_0 )
            {
             before(grammarAccess.getPipelineAccess().getGroupAlternatives_5_1_1_1_0()); 
            // InternalPipelineParser.g:5907:3: ( rule__Pipeline__GroupAlternatives_5_1_1_1_0 )
            // InternalPipelineParser.g:5907:4: rule__Pipeline__GroupAlternatives_5_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__GroupAlternatives_5_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getGroupAlternatives_5_1_1_1_0()); 

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
    // $ANTLR end "rule__Pipeline__GroupAssignment_5_1_1_1"


    // $ANTLR start "rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1"
    // InternalPipelineParser.g:5915:1: rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1 : ( ( rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0 ) ) ;
    public final void rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5919:1: ( ( ( rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0 ) ) )
            // InternalPipelineParser.g:5920:2: ( ( rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0 ) )
            {
            // InternalPipelineParser.g:5920:2: ( ( rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0 ) )
            // InternalPipelineParser.g:5921:3: ( rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0 )
            {
             before(grammarAccess.getPipelineAccess().getCancelConcurrenceAlternatives_5_1_2_1_0()); 
            // InternalPipelineParser.g:5922:3: ( rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0 )
            // InternalPipelineParser.g:5922:4: rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__CancelConcurrenceAlternatives_5_1_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getCancelConcurrenceAlternatives_5_1_2_1_0()); 

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
    // $ANTLR end "rule__Pipeline__CancelConcurrenceAssignment_5_1_2_1"


    // $ANTLR start "rule__Pipeline__PipelineParametersAssignment_6_1_1"
    // InternalPipelineParser.g:5930:1: rule__Pipeline__PipelineParametersAssignment_6_1_1 : ( rulePipelineParameter ) ;
    public final void rule__Pipeline__PipelineParametersAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5934:1: ( ( rulePipelineParameter ) )
            // InternalPipelineParser.g:5935:2: ( rulePipelineParameter )
            {
            // InternalPipelineParser.g:5935:2: ( rulePipelineParameter )
            // InternalPipelineParser.g:5936:3: rulePipelineParameter
            {
             before(grammarAccess.getPipelineAccess().getPipelineParametersPipelineParameterParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePipelineParameter();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getPipelineParametersPipelineParameterParserRuleCall_6_1_1_0()); 

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
    // $ANTLR end "rule__Pipeline__PipelineParametersAssignment_6_1_1"


    // $ANTLR start "rule__Pipeline__VmNameAssignment_7_1_0_1_1"
    // InternalPipelineParser.g:5945:1: rule__Pipeline__VmNameAssignment_7_1_0_1_1 : ( RULE_ID ) ;
    public final void rule__Pipeline__VmNameAssignment_7_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5949:1: ( ( RULE_ID ) )
            // InternalPipelineParser.g:5950:2: ( RULE_ID )
            {
            // InternalPipelineParser.g:5950:2: ( RULE_ID )
            // InternalPipelineParser.g:5951:3: RULE_ID
            {
             before(grammarAccess.getPipelineAccess().getVmNameIDTerminalRuleCall_7_1_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getVmNameIDTerminalRuleCall_7_1_0_1_1_0()); 

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
    // $ANTLR end "rule__Pipeline__VmNameAssignment_7_1_0_1_1"


    // $ANTLR start "rule__Pipeline__VmImageAssignment_7_1_0_2_1"
    // InternalPipelineParser.g:5960:1: rule__Pipeline__VmImageAssignment_7_1_0_2_1 : ( ( rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0 ) ) ;
    public final void rule__Pipeline__VmImageAssignment_7_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5964:1: ( ( ( rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0 ) ) )
            // InternalPipelineParser.g:5965:2: ( ( rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0 ) )
            {
            // InternalPipelineParser.g:5965:2: ( ( rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0 ) )
            // InternalPipelineParser.g:5966:3: ( rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0 )
            {
             before(grammarAccess.getPipelineAccess().getVmImageAlternatives_7_1_0_2_1_0()); 
            // InternalPipelineParser.g:5967:3: ( rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0 )
            // InternalPipelineParser.g:5967:4: rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__VmImageAlternatives_7_1_0_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getVmImageAlternatives_7_1_0_2_1_0()); 

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
    // $ANTLR end "rule__Pipeline__VmImageAssignment_7_1_0_2_1"


    // $ANTLR start "rule__Pipeline__VmDemandsAssignment_7_1_1_0_1"
    // InternalPipelineParser.g:5975:1: rule__Pipeline__VmDemandsAssignment_7_1_1_0_1 : ( ( rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0 ) ) ;
    public final void rule__Pipeline__VmDemandsAssignment_7_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5979:1: ( ( ( rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0 ) ) )
            // InternalPipelineParser.g:5980:2: ( ( rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0 ) )
            {
            // InternalPipelineParser.g:5980:2: ( ( rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0 ) )
            // InternalPipelineParser.g:5981:3: ( rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0 )
            {
             before(grammarAccess.getPipelineAccess().getVmDemandsAlternatives_7_1_1_0_1_0()); 
            // InternalPipelineParser.g:5982:3: ( rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0 )
            // InternalPipelineParser.g:5982:4: rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__VmDemandsAlternatives_7_1_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getVmDemandsAlternatives_7_1_1_0_1_0()); 

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
    // $ANTLR end "rule__Pipeline__VmDemandsAssignment_7_1_1_0_1"


    // $ANTLR start "rule__Pipeline__ResourcesAssignment_8_1_1"
    // InternalPipelineParser.g:5990:1: rule__Pipeline__ResourcesAssignment_8_1_1 : ( ruleResource ) ;
    public final void rule__Pipeline__ResourcesAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:5994:1: ( ( ruleResource ) )
            // InternalPipelineParser.g:5995:2: ( ruleResource )
            {
            // InternalPipelineParser.g:5995:2: ( ruleResource )
            // InternalPipelineParser.g:5996:3: ruleResource
            {
             before(grammarAccess.getPipelineAccess().getResourcesResourceParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getResourcesResourceParserRuleCall_8_1_1_0()); 

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
    // $ANTLR end "rule__Pipeline__ResourcesAssignment_8_1_1"


    // $ANTLR start "rule__Pipeline__PipelineParametersAssignment_9_1"
    // InternalPipelineParser.g:6005:1: rule__Pipeline__PipelineParametersAssignment_9_1 : ( rulePipelineParameter ) ;
    public final void rule__Pipeline__PipelineParametersAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6009:1: ( ( rulePipelineParameter ) )
            // InternalPipelineParser.g:6010:2: ( rulePipelineParameter )
            {
            // InternalPipelineParser.g:6010:2: ( rulePipelineParameter )
            // InternalPipelineParser.g:6011:3: rulePipelineParameter
            {
             before(grammarAccess.getPipelineAccess().getPipelineParametersPipelineParameterParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            rulePipelineParameter();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getPipelineParametersPipelineParameterParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Pipeline__PipelineParametersAssignment_9_1"


    // $ANTLR start "rule__Pipeline__VariablesAssignment_10_1"
    // InternalPipelineParser.g:6020:1: rule__Pipeline__VariablesAssignment_10_1 : ( ruleVariable ) ;
    public final void rule__Pipeline__VariablesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6024:1: ( ( ruleVariable ) )
            // InternalPipelineParser.g:6025:2: ( ruleVariable )
            {
            // InternalPipelineParser.g:6025:2: ( ruleVariable )
            // InternalPipelineParser.g:6026:3: ruleVariable
            {
             before(grammarAccess.getPipelineAccess().getVariablesVariableParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getVariablesVariableParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Pipeline__VariablesAssignment_10_1"


    // $ANTLR start "rule__Pipeline__ExtendedParameterAssignment_11"
    // InternalPipelineParser.g:6035:1: rule__Pipeline__ExtendedParameterAssignment_11 : ( ruleExtendedParameter ) ;
    public final void rule__Pipeline__ExtendedParameterAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6039:1: ( ( ruleExtendedParameter ) )
            // InternalPipelineParser.g:6040:2: ( ruleExtendedParameter )
            {
            // InternalPipelineParser.g:6040:2: ( ruleExtendedParameter )
            // InternalPipelineParser.g:6041:3: ruleExtendedParameter
            {
             before(grammarAccess.getPipelineAccess().getExtendedParameterExtendedParameterParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleExtendedParameter();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getExtendedParameterExtendedParameterParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Pipeline__ExtendedParameterAssignment_11"


    // $ANTLR start "rule__ExtendedParameter__TemplateAssignment_0_1_1_1"
    // InternalPipelineParser.g:6050:1: rule__ExtendedParameter__TemplateAssignment_0_1_1_1 : ( RULE_ID ) ;
    public final void rule__ExtendedParameter__TemplateAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6054:1: ( ( RULE_ID ) )
            // InternalPipelineParser.g:6055:2: ( RULE_ID )
            {
            // InternalPipelineParser.g:6055:2: ( RULE_ID )
            // InternalPipelineParser.g:6056:3: RULE_ID
            {
             before(grammarAccess.getExtendedParameterAccess().getTemplateIDTerminalRuleCall_0_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendedParameterAccess().getTemplateIDTerminalRuleCall_0_1_1_1_0()); 

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
    // $ANTLR end "rule__ExtendedParameter__TemplateAssignment_0_1_1_1"


    // $ANTLR start "rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1"
    // InternalPipelineParser.g:6065:1: rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1 : ( ruleParameterValue ) ;
    public final void rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6069:1: ( ( ruleParameterValue ) )
            // InternalPipelineParser.g:6070:2: ( ruleParameterValue )
            {
            // InternalPipelineParser.g:6070:2: ( ruleParameterValue )
            // InternalPipelineParser.g:6071:3: ruleParameterValue
            {
             before(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_0_1_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_0_1_2_1_1_0()); 

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
    // $ANTLR end "rule__ExtendedParameter__ExtendedParameterValuesAssignment_0_1_2_1_1"


    // $ANTLR start "rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1"
    // InternalPipelineParser.g:6080:1: rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1 : ( ruleParameterValue ) ;
    public final void rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6084:1: ( ( ruleParameterValue ) )
            // InternalPipelineParser.g:6085:2: ( ruleParameterValue )
            {
            // InternalPipelineParser.g:6085:2: ( ruleParameterValue )
            // InternalPipelineParser.g:6086:3: ruleParameterValue
            {
             before(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__ExtendedParameter__ExtendedParameterValuesAssignment_1_1_1"


    // $ANTLR start "rule__Variable__VariableValuesAssignment_0_1"
    // InternalPipelineParser.g:6095:1: rule__Variable__VariableValuesAssignment_0_1 : ( ruleParameterValue ) ;
    public final void rule__Variable__VariableValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6099:1: ( ( ruleParameterValue ) )
            // InternalPipelineParser.g:6100:2: ( ruleParameterValue )
            {
            // InternalPipelineParser.g:6100:2: ( ruleParameterValue )
            // InternalPipelineParser.g:6101:3: ruleParameterValue
            {
             before(grammarAccess.getVariableAccess().getVariableValuesParameterValueParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getVariableValuesParameterValueParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Variable__VariableValuesAssignment_0_1"


    // $ANTLR start "rule__Variable__GroupAssignment_1_0_2"
    // InternalPipelineParser.g:6110:1: rule__Variable__GroupAssignment_1_0_2 : ( ruleAnyData ) ;
    public final void rule__Variable__GroupAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6114:1: ( ( ruleAnyData ) )
            // InternalPipelineParser.g:6115:2: ( ruleAnyData )
            {
            // InternalPipelineParser.g:6115:2: ( ruleAnyData )
            // InternalPipelineParser.g:6116:3: ruleAnyData
            {
             before(grammarAccess.getVariableAccess().getGroupAnyDataParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnyData();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getGroupAnyDataParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Variable__GroupAssignment_1_0_2"


    // $ANTLR start "rule__Variable__NameAssignment_1_1_0_2"
    // InternalPipelineParser.g:6125:1: rule__Variable__NameAssignment_1_1_0_2 : ( ruleAnyData ) ;
    public final void rule__Variable__NameAssignment_1_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6129:1: ( ( ruleAnyData ) )
            // InternalPipelineParser.g:6130:2: ( ruleAnyData )
            {
            // InternalPipelineParser.g:6130:2: ( ruleAnyData )
            // InternalPipelineParser.g:6131:3: ruleAnyData
            {
             before(grammarAccess.getVariableAccess().getNameAnyDataParserRuleCall_1_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnyData();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameAnyDataParserRuleCall_1_1_0_2_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_1_1_0_2"


    // $ANTLR start "rule__Variable__ValueAssignment_1_1_1_1_1"
    // InternalPipelineParser.g:6140:1: rule__Variable__ValueAssignment_1_1_1_1_1 : ( ruleAnyData ) ;
    public final void rule__Variable__ValueAssignment_1_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6144:1: ( ( ruleAnyData ) )
            // InternalPipelineParser.g:6145:2: ( ruleAnyData )
            {
            // InternalPipelineParser.g:6145:2: ( ruleAnyData )
            // InternalPipelineParser.g:6146:3: ruleAnyData
            {
             before(grammarAccess.getVariableAccess().getValueAnyDataParserRuleCall_1_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnyData();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValueAnyDataParserRuleCall_1_1_1_1_1_0()); 

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
    // $ANTLR end "rule__Variable__ValueAssignment_1_1_1_1_1"


    // $ANTLR start "rule__Variable__ReadonlyAssignment_1_1_1_2_1"
    // InternalPipelineParser.g:6155:1: rule__Variable__ReadonlyAssignment_1_1_1_2_1 : ( RULE_ID ) ;
    public final void rule__Variable__ReadonlyAssignment_1_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6159:1: ( ( RULE_ID ) )
            // InternalPipelineParser.g:6160:2: ( RULE_ID )
            {
            // InternalPipelineParser.g:6160:2: ( RULE_ID )
            // InternalPipelineParser.g:6161:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getReadonlyIDTerminalRuleCall_1_1_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getReadonlyIDTerminalRuleCall_1_1_1_2_1_0()); 

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
    // $ANTLR end "rule__Variable__ReadonlyAssignment_1_1_1_2_1"


    // $ANTLR start "rule__Resource__ResourceNameAssignment_0"
    // InternalPipelineParser.g:6170:1: rule__Resource__ResourceNameAssignment_0 : ( ( rule__Resource__ResourceNameAlternatives_0_0 ) ) ;
    public final void rule__Resource__ResourceNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6174:1: ( ( ( rule__Resource__ResourceNameAlternatives_0_0 ) ) )
            // InternalPipelineParser.g:6175:2: ( ( rule__Resource__ResourceNameAlternatives_0_0 ) )
            {
            // InternalPipelineParser.g:6175:2: ( ( rule__Resource__ResourceNameAlternatives_0_0 ) )
            // InternalPipelineParser.g:6176:3: ( rule__Resource__ResourceNameAlternatives_0_0 )
            {
             before(grammarAccess.getResourceAccess().getResourceNameAlternatives_0_0()); 
            // InternalPipelineParser.g:6177:3: ( rule__Resource__ResourceNameAlternatives_0_0 )
            // InternalPipelineParser.g:6177:4: rule__Resource__ResourceNameAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__ResourceNameAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getResourceNameAlternatives_0_0()); 

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
    // $ANTLR end "rule__Resource__ResourceNameAssignment_0"


    // $ANTLR start "rule__Resource__ResourceValuesAssignment_1_0_1"
    // InternalPipelineParser.g:6185:1: rule__Resource__ResourceValuesAssignment_1_0_1 : ( ruleParameterValue ) ;
    public final void rule__Resource__ResourceValuesAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6189:1: ( ( ruleParameterValue ) )
            // InternalPipelineParser.g:6190:2: ( ruleParameterValue )
            {
            // InternalPipelineParser.g:6190:2: ( ruleParameterValue )
            // InternalPipelineParser.g:6191:3: ruleParameterValue
            {
             before(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_0_1_0()); 

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
    // $ANTLR end "rule__Resource__ResourceValuesAssignment_1_0_1"


    // $ANTLR start "rule__Resource__ResourceValuesAssignment_1_1_1_1"
    // InternalPipelineParser.g:6200:1: rule__Resource__ResourceValuesAssignment_1_1_1_1 : ( ruleParameterValue ) ;
    public final void rule__Resource__ResourceValuesAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6204:1: ( ( ruleParameterValue ) )
            // InternalPipelineParser.g:6205:2: ( ruleParameterValue )
            {
            // InternalPipelineParser.g:6205:2: ( ruleParameterValue )
            // InternalPipelineParser.g:6206:3: ruleParameterValue
            {
             before(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_1_1_1_0()); 

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
    // $ANTLR end "rule__Resource__ResourceValuesAssignment_1_1_1_1"


    // $ANTLR start "rule__PipelineParameter__NameAssignment_0_1"
    // InternalPipelineParser.g:6215:1: rule__PipelineParameter__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__PipelineParameter__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6219:1: ( ( RULE_ID ) )
            // InternalPipelineParser.g:6220:2: ( RULE_ID )
            {
            // InternalPipelineParser.g:6220:2: ( RULE_ID )
            // InternalPipelineParser.g:6221:3: RULE_ID
            {
             before(grammarAccess.getPipelineParameterAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPipelineParameterAccess().getNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__PipelineParameter__NameAssignment_0_1"


    // $ANTLR start "rule__PipelineParameter__DisplayNameAssignment_1_0_1_1"
    // InternalPipelineParser.g:6230:1: rule__PipelineParameter__DisplayNameAssignment_1_0_1_1 : ( ruleUnquotedString ) ;
    public final void rule__PipelineParameter__DisplayNameAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6234:1: ( ( ruleUnquotedString ) )
            // InternalPipelineParser.g:6235:2: ( ruleUnquotedString )
            {
            // InternalPipelineParser.g:6235:2: ( ruleUnquotedString )
            // InternalPipelineParser.g:6236:3: ruleUnquotedString
            {
             before(grammarAccess.getPipelineParameterAccess().getDisplayNameUnquotedStringParserRuleCall_1_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnquotedString();

            state._fsp--;

             after(grammarAccess.getPipelineParameterAccess().getDisplayNameUnquotedStringParserRuleCall_1_0_1_1_0()); 

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
    // $ANTLR end "rule__PipelineParameter__DisplayNameAssignment_1_0_1_1"


    // $ANTLR start "rule__PipelineParameter__ParameterValuesAssignment_1_1_0"
    // InternalPipelineParser.g:6245:1: rule__PipelineParameter__ParameterValuesAssignment_1_1_0 : ( ruleParameterValue ) ;
    public final void rule__PipelineParameter__ParameterValuesAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6249:1: ( ( ruleParameterValue ) )
            // InternalPipelineParser.g:6250:2: ( ruleParameterValue )
            {
            // InternalPipelineParser.g:6250:2: ( ruleParameterValue )
            // InternalPipelineParser.g:6251:3: ruleParameterValue
            {
             before(grammarAccess.getPipelineParameterAccess().getParameterValuesParameterValueParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getPipelineParameterAccess().getParameterValuesParameterValueParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__PipelineParameter__ParameterValuesAssignment_1_1_0"


    // $ANTLR start "rule__ParameterValue__NameAssignment_1_0"
    // InternalPipelineParser.g:6260:1: rule__ParameterValue__NameAssignment_1_0 : ( ( rule__ParameterValue__NameAlternatives_1_0_0 ) ) ;
    public final void rule__ParameterValue__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6264:1: ( ( ( rule__ParameterValue__NameAlternatives_1_0_0 ) ) )
            // InternalPipelineParser.g:6265:2: ( ( rule__ParameterValue__NameAlternatives_1_0_0 ) )
            {
            // InternalPipelineParser.g:6265:2: ( ( rule__ParameterValue__NameAlternatives_1_0_0 ) )
            // InternalPipelineParser.g:6266:3: ( rule__ParameterValue__NameAlternatives_1_0_0 )
            {
             before(grammarAccess.getParameterValueAccess().getNameAlternatives_1_0_0()); 
            // InternalPipelineParser.g:6267:3: ( rule__ParameterValue__NameAlternatives_1_0_0 )
            // InternalPipelineParser.g:6267:4: rule__ParameterValue__NameAlternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__NameAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getNameAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__ParameterValue__NameAssignment_1_0"


    // $ANTLR start "rule__ParameterValue__PreDefinedKeywordAssignment_1_1"
    // InternalPipelineParser.g:6275:1: rule__ParameterValue__PreDefinedKeywordAssignment_1_1 : ( rulePermission ) ;
    public final void rule__ParameterValue__PreDefinedKeywordAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6279:1: ( ( rulePermission ) )
            // InternalPipelineParser.g:6280:2: ( rulePermission )
            {
            // InternalPipelineParser.g:6280:2: ( rulePermission )
            // InternalPipelineParser.g:6281:3: rulePermission
            {
             before(grammarAccess.getParameterValueAccess().getPreDefinedKeywordPermissionEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getParameterValueAccess().getPreDefinedKeywordPermissionEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ParameterValue__PreDefinedKeywordAssignment_1_1"


    // $ANTLR start "rule__ParameterValue__SubParameterValuesAssignment_4_0_1"
    // InternalPipelineParser.g:6290:1: rule__ParameterValue__SubParameterValuesAssignment_4_0_1 : ( ruleParameterValue ) ;
    public final void rule__ParameterValue__SubParameterValuesAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6294:1: ( ( ruleParameterValue ) )
            // InternalPipelineParser.g:6295:2: ( ruleParameterValue )
            {
            // InternalPipelineParser.g:6295:2: ( ruleParameterValue )
            // InternalPipelineParser.g:6296:3: ruleParameterValue
            {
             before(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_0_1_0()); 

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
    // $ANTLR end "rule__ParameterValue__SubParameterValuesAssignment_4_0_1"


    // $ANTLR start "rule__ParameterValue__ValueAssignment_4_1_0"
    // InternalPipelineParser.g:6305:1: rule__ParameterValue__ValueAssignment_4_1_0 : ( ( rule__ParameterValue__ValueAlternatives_4_1_0_0 ) ) ;
    public final void rule__ParameterValue__ValueAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6309:1: ( ( ( rule__ParameterValue__ValueAlternatives_4_1_0_0 ) ) )
            // InternalPipelineParser.g:6310:2: ( ( rule__ParameterValue__ValueAlternatives_4_1_0_0 ) )
            {
            // InternalPipelineParser.g:6310:2: ( ( rule__ParameterValue__ValueAlternatives_4_1_0_0 ) )
            // InternalPipelineParser.g:6311:3: ( rule__ParameterValue__ValueAlternatives_4_1_0_0 )
            {
             before(grammarAccess.getParameterValueAccess().getValueAlternatives_4_1_0_0()); 
            // InternalPipelineParser.g:6312:3: ( rule__ParameterValue__ValueAlternatives_4_1_0_0 )
            // InternalPipelineParser.g:6312:4: rule__ParameterValue__ValueAlternatives_4_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__ValueAlternatives_4_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getValueAlternatives_4_1_0_0()); 

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
    // $ANTLR end "rule__ParameterValue__ValueAssignment_4_1_0"


    // $ANTLR start "rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1"
    // InternalPipelineParser.g:6320:1: rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1 : ( ruleParameterValue ) ;
    public final void rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPipelineParser.g:6324:1: ( ( ruleParameterValue ) )
            // InternalPipelineParser.g:6325:2: ( ruleParameterValue )
            {
            // InternalPipelineParser.g:6325:2: ( ruleParameterValue )
            // InternalPipelineParser.g:6326:3: ruleParameterValue
            {
             before(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_1_1_1_0()); 

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
    // $ANTLR end "rule__ParameterValue__SubParameterValuesAssignment_4_1_1_1"

    // Delegated rules


    protected DFA49 dfa49 = new DFA49(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\15\15\uffff";
    static final String dfa_3s = "\1\5\15\uffff";
    static final String dfa_4s = "\1\62\15\uffff";
    static final String dfa_5s = "\1\uffff\14\1\1\2";
    static final String dfa_6s = "\1\0\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\uffff\1\6\2\uffff\1\7\1\5\1\uffff\1\11\1\13\1\3\2\uffff\1\2\3\uffff\1\12\1\uffff\2\14\6\uffff\1\1\1\10\1\uffff\1\4\16\uffff\1\3",
            "",
            "",
            "",
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

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5199:2: ( rule__Pipeline__UnorderedGroup__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_0 = input.LA(1);

                         
                        int index49_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA49_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA49_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA49_0 == WorkingDirectory || LA49_0 == Defaults || LA49_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA49_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA49_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA49_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA49_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA49_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA49_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA49_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA49_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA49_0 >= Extends && LA49_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA49_0==EOF) ) {s = 13;}

                         
                        input.seek(index49_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\1\5\14\uffff";
    static final String dfa_10s = "\1\62\14\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_12s = "\1\0\14\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\uffff\1\6\2\uffff\1\7\1\5\1\uffff\1\11\1\13\1\3\2\uffff\1\2\3\uffff\1\12\1\uffff\2\14\6\uffff\1\1\1\10\1\uffff\1\4\16\uffff\1\3",
            "",
            "",
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

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5213:3: ( ({...}? => ( ( ( rule__Pipeline__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__UnorderedGroup_2 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Pipeline__ExtendedParameterAssignment_11 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_0 = input.LA(1);

                         
                        int index50_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA50_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA50_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA50_0 == WorkingDirectory || LA50_0 == Defaults || LA50_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA50_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA50_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA50_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA50_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA50_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA50_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA50_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA50_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA50_0 >= Extends && LA50_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                         
                        input.seek(index50_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5408:2: ( rule__Pipeline__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_0 = input.LA(1);

                         
                        int index51_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA51_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA51_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA51_0 == WorkingDirectory || LA51_0 == Defaults || LA51_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA51_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA51_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA51_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA51_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA51_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA51_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA51_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA51_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA51_0 >= Extends && LA51_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA51_0==EOF) ) {s = 13;}

                         
                        input.seek(index51_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5420:2: ( rule__Pipeline__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_0 = input.LA(1);

                         
                        int index52_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA52_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA52_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA52_0 == WorkingDirectory || LA52_0 == Defaults || LA52_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA52_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA52_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA52_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA52_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA52_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA52_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA52_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA52_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA52_0 >= Extends && LA52_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA52_0==EOF) ) {s = 13;}

                         
                        input.seek(index52_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5432:2: ( rule__Pipeline__UnorderedGroup__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA53_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA53_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA53_0 == WorkingDirectory || LA53_0 == Defaults || LA53_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA53_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA53_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA53_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA53_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA53_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA53_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA53_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA53_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA53_0 >= Extends && LA53_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA53_0==EOF) ) {s = 13;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5444:2: ( rule__Pipeline__UnorderedGroup__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_0 = input.LA(1);

                         
                        int index54_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA54_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA54_0 == WorkingDirectory || LA54_0 == Defaults || LA54_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA54_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA54_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA54_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA54_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA54_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA54_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA54_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA54_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA54_0 >= Extends && LA54_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA54_0==EOF) ) {s = 13;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5456:2: ( rule__Pipeline__UnorderedGroup__5 )?";
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
                        if ( LA55_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA55_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA55_0 == WorkingDirectory || LA55_0 == Defaults || LA55_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA55_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA55_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA55_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA55_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA55_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA55_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA55_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA55_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA55_0 >= Extends && LA55_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA55_0==EOF) ) {s = 13;}

                         
                        input.seek(index55_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5468:2: ( rule__Pipeline__UnorderedGroup__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_0 = input.LA(1);

                         
                        int index56_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA56_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA56_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA56_0 == WorkingDirectory || LA56_0 == Defaults || LA56_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA56_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA56_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA56_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA56_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA56_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA56_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA56_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA56_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA56_0 >= Extends && LA56_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA56_0==EOF) ) {s = 13;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5480:2: ( rule__Pipeline__UnorderedGroup__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA57_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA57_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA57_0 == WorkingDirectory || LA57_0 == Defaults || LA57_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA57_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA57_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA57_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA57_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA57_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA57_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA57_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA57_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA57_0 >= Extends && LA57_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA57_0==EOF) ) {s = 13;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5492:2: ( rule__Pipeline__UnorderedGroup__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_0 = input.LA(1);

                         
                        int index58_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA58_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA58_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA58_0 == WorkingDirectory || LA58_0 == Defaults || LA58_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA58_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA58_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA58_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA58_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA58_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA58_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA58_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA58_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA58_0 >= Extends && LA58_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA58_0==EOF) ) {s = 13;}

                         
                        input.seek(index58_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5504:2: ( rule__Pipeline__UnorderedGroup__9 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_0 = input.LA(1);

                         
                        int index59_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA59_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA59_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA59_0 == WorkingDirectory || LA59_0 == Defaults || LA59_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA59_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA59_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA59_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA59_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA59_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA59_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA59_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA59_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA59_0 >= Extends && LA59_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA59_0==EOF) ) {s = 13;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5516:2: ( rule__Pipeline__UnorderedGroup__10 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_0 = input.LA(1);

                         
                        int index60_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA60_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA60_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA60_0 == WorkingDirectory || LA60_0 == Defaults || LA60_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA60_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA60_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA60_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA60_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA60_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA60_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA60_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA60_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA60_0 >= Extends && LA60_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA60_0==EOF) ) {s = 13;}

                         
                        input.seek(index60_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5528:2: ( rule__Pipeline__UnorderedGroup__11 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA61_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA61_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( ( LA61_0 == WorkingDirectory || LA61_0 == Defaults || LA61_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA61_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA61_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA61_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA61_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA61_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA61_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA61_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA61_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA61_0 >= Extends && LA61_0 <= Include && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( (LA61_0==EOF) ) {s = 13;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\13\uffff";
    static final String dfa_15s = "\1\4\12\uffff";
    static final String dfa_16s = "\1\5\1\61\1\66\1\62\1\uffff\1\46\1\62\1\0\1\61\1\uffff\1\0";
    static final String dfa_17s = "\1\62\1\61\1\66\1\62\1\uffff\1\46\1\62\1\0\1\61\1\uffff\1\0";
    static final String dfa_18s = "\4\uffff\1\2\4\uffff\1\1\1\uffff";
    static final String dfa_19s = "\7\uffff\1\0\2\uffff\1\1}>";
    static final String[] dfa_20s = {
            "\1\2\1\uffff\1\4\2\uffff\2\4\1\uffff\2\4\1\1\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\3",
            "\1\5",
            "\1\6",
            "\1\7",
            "",
            "\1\10",
            "\1\3",
            "\1\uffff",
            "\1\12",
            "",
            "\1\uffff"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "5611:2: ( rule__Pipeline__UnorderedGroup_2__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_7 = input.LA(1);

                         
                        int index63_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_2()) ) {s = 4;}

                         
                        input.seek(index63_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_10 = input.LA(1);

                         
                        int index63_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_2()) ) {s = 4;}

                         
                        input.seek(index63_10);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\60\uffff";
    static final String dfa_22s = "\1\4\2\uffff\1\2\1\uffff\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4";
    static final String dfa_23s = "\1\5\2\uffff\1\5\1\uffff\52\5\1\62";
    static final String dfa_24s = "\1\62\2\uffff\1\62\1\uffff\53\62";
    static final String dfa_25s = "\1\uffff\2\1\1\uffff\1\2\53\uffff";
    static final String dfa_26s = "\1\16\2\uffff\1\21\2\uffff\1\14\1\uffff\1\26\1\uffff\1\27\1\uffff\1\15\1\uffff\1\17\1\uffff\1\6\1\uffff\1\2\1\uffff\1\20\1\uffff\1\13\1\uffff\1\4\1\uffff\1\23\1\uffff\1\5\1\uffff\1\7\1\uffff\1\22\1\uffff\1\1\1\uffff\1\0\1\uffff\1\11\1\uffff\1\24\1\uffff\1\10\1\uffff\1\12\1\uffff\1\3\1\25}>";
    static final String[] dfa_27s = {
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\2\2\4\6\uffff\2\4\1\uffff\1\4\15\uffff\1\1\1\3",
            "",
            "",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\5",
            "",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\6",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\7",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\10",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\11",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\12",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\13",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\14",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\15",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\16",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\17",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\20",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\21",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\22",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\23",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\24",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\25",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\26",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\27",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\30",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\31",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\32",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\33",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\34",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\35",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\36",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\37",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\40",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\41",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\42",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\43",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\44",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\45",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\46",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\47",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\50",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\51",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\52",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\53",
            "\1\4\1\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\3\uffff\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\4\16\uffff\1\54",
            "\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\2\2\1\uffff\1\2\16\uffff\1\55",
            "\1\4\11\uffff\1\4\42\uffff\1\56",
            "\1\2\11\uffff\1\2\42\uffff\1\57",
            "\1\2"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "5694:2: ( rule__Pipeline__UnorderedGroup_7_1__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_36 = input.LA(1);

                         
                        int index65_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_36==RULE_END) ) {s = 37;}

                        else if ( ( LA65_36 == EOF || LA65_36 == WorkingDirectory || LA65_36 == Concurrency || LA65_36 >= Parameters && LA65_36 <= Permission || LA65_36 >= Resources && LA65_36 <= Defaults || LA65_36 == RunName || LA65_36 == Default || LA65_36 >= Extends && LA65_36 <= Include || LA65_36 >= Name && LA65_36 <= Pool || LA65_36 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_36);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_34 = input.LA(1);

                         
                        int index65_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_34==RULE_END) ) {s = 35;}

                        else if ( ( LA65_34 == EOF || LA65_34 == WorkingDirectory || LA65_34 == Concurrency || LA65_34 >= Parameters && LA65_34 <= Permission || LA65_34 >= Resources && LA65_34 <= Defaults || LA65_34 == RunName || LA65_34 == Default || LA65_34 >= Extends && LA65_34 <= Include || LA65_34 >= Name && LA65_34 <= Pool || LA65_34 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_34);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_18 = input.LA(1);

                         
                        int index65_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_18==RULE_END) ) {s = 19;}

                        else if ( ( LA65_18 == EOF || LA65_18 == WorkingDirectory || LA65_18 == Concurrency || LA65_18 >= Parameters && LA65_18 <= Permission || LA65_18 >= Resources && LA65_18 <= Defaults || LA65_18 == RunName || LA65_18 == Default || LA65_18 >= Extends && LA65_18 <= Include || LA65_18 >= Name && LA65_18 <= Pool || LA65_18 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA65_46 = input.LA(1);

                         
                        int index65_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_46==RULE_END) ) {s = 47;}

                        else if ( ( LA65_46 == EOF || LA65_46 == WorkingDirectory || LA65_46 == Defaults ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_46);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA65_24 = input.LA(1);

                         
                        int index65_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_24==RULE_END) ) {s = 25;}

                        else if ( ( LA65_24 == EOF || LA65_24 == WorkingDirectory || LA65_24 == Concurrency || LA65_24 >= Parameters && LA65_24 <= Permission || LA65_24 >= Resources && LA65_24 <= Defaults || LA65_24 == RunName || LA65_24 == Default || LA65_24 >= Extends && LA65_24 <= Include || LA65_24 >= Name && LA65_24 <= Pool || LA65_24 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_24);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA65_28 = input.LA(1);

                         
                        int index65_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_28==RULE_END) ) {s = 29;}

                        else if ( ( LA65_28 == EOF || LA65_28 == WorkingDirectory || LA65_28 == Concurrency || LA65_28 >= Parameters && LA65_28 <= Permission || LA65_28 >= Resources && LA65_28 <= Defaults || LA65_28 == RunName || LA65_28 == Default || LA65_28 >= Extends && LA65_28 <= Include || LA65_28 >= Name && LA65_28 <= Pool || LA65_28 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_28);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA65_16 = input.LA(1);

                         
                        int index65_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_16==RULE_END) ) {s = 17;}

                        else if ( ( LA65_16 == EOF || LA65_16 == WorkingDirectory || LA65_16 == Concurrency || LA65_16 >= Parameters && LA65_16 <= Permission || LA65_16 >= Resources && LA65_16 <= Defaults || LA65_16 == RunName || LA65_16 == Default || LA65_16 >= Extends && LA65_16 <= Include || LA65_16 >= Name && LA65_16 <= Pool || LA65_16 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_16);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA65_30 = input.LA(1);

                         
                        int index65_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_30==RULE_END) ) {s = 31;}

                        else if ( ( LA65_30 == EOF || LA65_30 == WorkingDirectory || LA65_30 == Concurrency || LA65_30 >= Parameters && LA65_30 <= Permission || LA65_30 >= Resources && LA65_30 <= Defaults || LA65_30 == RunName || LA65_30 == Default || LA65_30 >= Extends && LA65_30 <= Include || LA65_30 >= Name && LA65_30 <= Pool || LA65_30 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_30);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA65_42 = input.LA(1);

                         
                        int index65_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ( LA65_42 == EOF || LA65_42 == WorkingDirectory || LA65_42 == Concurrency || LA65_42 >= Parameters && LA65_42 <= Permission || LA65_42 >= Resources && LA65_42 <= Defaults || LA65_42 == RunName || LA65_42 == Default || LA65_42 >= Extends && LA65_42 <= Include || LA65_42 >= Name && LA65_42 <= Pool || LA65_42 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                        else if ( (LA65_42==RULE_END) ) {s = 43;}

                         
                        input.seek(index65_42);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA65_38 = input.LA(1);

                         
                        int index65_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_38==RULE_END) ) {s = 39;}

                        else if ( ( LA65_38 == EOF || LA65_38 == WorkingDirectory || LA65_38 == Concurrency || LA65_38 >= Parameters && LA65_38 <= Permission || LA65_38 >= Resources && LA65_38 <= Defaults || LA65_38 == RunName || LA65_38 == Default || LA65_38 >= Extends && LA65_38 <= Include || LA65_38 >= Name && LA65_38 <= Pool || LA65_38 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_38);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA65_44 = input.LA(1);

                         
                        int index65_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ( LA65_44 == EOF || LA65_44 == WorkingDirectory || LA65_44 == Concurrency || LA65_44 >= Parameters && LA65_44 <= Permission || LA65_44 >= Resources && LA65_44 <= Defaults || LA65_44 == RunName || LA65_44 == Default || LA65_44 >= Extends && LA65_44 <= Include || LA65_44 >= Name && LA65_44 <= Pool || LA65_44 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                        else if ( (LA65_44==RULE_END) ) {s = 45;}

                         
                        input.seek(index65_44);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA65_22 = input.LA(1);

                         
                        int index65_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_22==RULE_END) ) {s = 23;}

                        else if ( ( LA65_22 == EOF || LA65_22 == WorkingDirectory || LA65_22 == Concurrency || LA65_22 >= Parameters && LA65_22 <= Permission || LA65_22 >= Resources && LA65_22 <= Defaults || LA65_22 == RunName || LA65_22 == Default || LA65_22 >= Extends && LA65_22 <= Include || LA65_22 >= Name && LA65_22 <= Pool || LA65_22 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_22);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA65_6 = input.LA(1);

                         
                        int index65_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_6==RULE_END) ) {s = 7;}

                        else if ( ( LA65_6 == EOF || LA65_6 == WorkingDirectory || LA65_6 == Concurrency || LA65_6 >= Parameters && LA65_6 <= Permission || LA65_6 >= Resources && LA65_6 <= Defaults || LA65_6 == RunName || LA65_6 == Default || LA65_6 >= Extends && LA65_6 <= Include || LA65_6 >= Name && LA65_6 <= Pool || LA65_6 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_6);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA65_12 = input.LA(1);

                         
                        int index65_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ( LA65_12 == EOF || LA65_12 == WorkingDirectory || LA65_12 == Concurrency || LA65_12 >= Parameters && LA65_12 <= Permission || LA65_12 >= Resources && LA65_12 <= Defaults || LA65_12 == RunName || LA65_12 == Default || LA65_12 >= Extends && LA65_12 <= Include || LA65_12 >= Name && LA65_12 <= Pool || LA65_12 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                        else if ( (LA65_12==RULE_END) ) {s = 13;}

                         
                        input.seek(index65_12);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA65_0 = input.LA(1);

                         
                        int index65_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA65_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0) ) {s = 1;}

                        else if ( LA65_0 == Demands && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                        else if ( (LA65_0==RULE_END) ) {s = 3;}

                        else if ( (LA65_0==EOF||LA65_0==WorkingDirectory||LA65_0==Concurrency||(LA65_0>=Parameters && LA65_0<=Permission)||(LA65_0>=Resources && LA65_0<=Defaults)||LA65_0==RunName||LA65_0==Default||(LA65_0>=Extends && LA65_0<=Include)||(LA65_0>=Name && LA65_0<=Pool)||LA65_0==Env) ) {s = 4;}

                         
                        input.seek(index65_0);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA65_14 = input.LA(1);

                         
                        int index65_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_14==RULE_END) ) {s = 15;}

                        else if ( ( LA65_14 == EOF || LA65_14 == WorkingDirectory || LA65_14 == Concurrency || LA65_14 >= Parameters && LA65_14 <= Permission || LA65_14 >= Resources && LA65_14 <= Defaults || LA65_14 == RunName || LA65_14 == Default || LA65_14 >= Extends && LA65_14 <= Include || LA65_14 >= Name && LA65_14 <= Pool || LA65_14 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_14);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA65_20 = input.LA(1);

                         
                        int index65_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_20==RULE_END) ) {s = 21;}

                        else if ( ( LA65_20 == EOF || LA65_20 == WorkingDirectory || LA65_20 == Concurrency || LA65_20 >= Parameters && LA65_20 <= Permission || LA65_20 >= Resources && LA65_20 <= Defaults || LA65_20 == RunName || LA65_20 == Default || LA65_20 >= Extends && LA65_20 <= Include || LA65_20 >= Name && LA65_20 <= Pool || LA65_20 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_20);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA65_3 = input.LA(1);

                         
                        int index65_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_3==RULE_END) ) {s = 5;}

                        else if ( ( LA65_3 == EOF || LA65_3 == WorkingDirectory || LA65_3 == Concurrency || LA65_3 >= Parameters && LA65_3 <= Permission || LA65_3 >= Resources && LA65_3 <= Defaults || LA65_3 == RunName || LA65_3 == Default || LA65_3 >= Extends && LA65_3 <= Include || LA65_3 >= Name && LA65_3 <= Pool || LA65_3 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_3);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA65_32 = input.LA(1);

                         
                        int index65_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_32==RULE_END) ) {s = 33;}

                        else if ( ( LA65_32 == EOF || LA65_32 == WorkingDirectory || LA65_32 == Concurrency || LA65_32 >= Parameters && LA65_32 <= Permission || LA65_32 >= Resources && LA65_32 <= Defaults || LA65_32 == RunName || LA65_32 == Default || LA65_32 >= Extends && LA65_32 <= Include || LA65_32 >= Name && LA65_32 <= Pool || LA65_32 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_32);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA65_26 = input.LA(1);

                         
                        int index65_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_26==RULE_END) ) {s = 27;}

                        else if ( ( LA65_26 == EOF || LA65_26 == WorkingDirectory || LA65_26 == Concurrency || LA65_26 >= Parameters && LA65_26 <= Permission || LA65_26 >= Resources && LA65_26 <= Defaults || LA65_26 == RunName || LA65_26 == Default || LA65_26 >= Extends && LA65_26 <= Include || LA65_26 >= Name && LA65_26 <= Pool || LA65_26 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_26);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA65_40 = input.LA(1);

                         
                        int index65_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_40==RULE_END) ) {s = 41;}

                        else if ( ( LA65_40 == EOF || LA65_40 == WorkingDirectory || LA65_40 == Concurrency || LA65_40 >= Parameters && LA65_40 <= Permission || LA65_40 >= Resources && LA65_40 <= Defaults || LA65_40 == RunName || LA65_40 == Default || LA65_40 >= Extends && LA65_40 <= Include || LA65_40 >= Name && LA65_40 <= Pool || LA65_40 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_40);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA65_47 = input.LA(1);

                         
                        int index65_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_47==EOF) ) {s = 4;}

                        else if ( LA65_47 == RULE_END && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_47);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA65_8 = input.LA(1);

                         
                        int index65_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_8==RULE_END) ) {s = 9;}

                        else if ( ( LA65_8 == EOF || LA65_8 == WorkingDirectory || LA65_8 == Concurrency || LA65_8 >= Parameters && LA65_8 <= Permission || LA65_8 >= Resources && LA65_8 <= Defaults || LA65_8 == RunName || LA65_8 == Default || LA65_8 >= Extends && LA65_8 <= Include || LA65_8 >= Name && LA65_8 <= Pool || LA65_8 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                         
                        input.seek(index65_8);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA65_10 = input.LA(1);

                         
                        int index65_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ( LA65_10 == EOF || LA65_10 == WorkingDirectory || LA65_10 == Concurrency || LA65_10 >= Parameters && LA65_10 <= Permission || LA65_10 >= Resources && LA65_10 <= Defaults || LA65_10 == RunName || LA65_10 == Default || LA65_10 >= Extends && LA65_10 <= Include || LA65_10 >= Name && LA65_10 <= Pool || LA65_10 == Env ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {s = 2;}

                        else if ( (LA65_10==RULE_END) ) {s = 11;}

                         
                        input.seek(index65_10);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_28s = "\32\uffff";
    static final String dfa_29s = "\1\13\31\uffff";
    static final String dfa_30s = "\1\5\1\uffff\1\0\7\uffff\1\0\17\uffff";
    static final String dfa_31s = "\1\63\1\uffff\1\0\7\uffff\1\0\17\uffff";
    static final String dfa_32s = "\1\uffff\1\1\1\uffff\1\1\7\uffff\1\2\16\uffff";
    static final String dfa_33s = "\1\0\1\uffff\1\1\7\uffff\1\2\17\uffff}>";
    static final String[] dfa_34s = {
            "\1\13\1\uffff\1\13\2\uffff\2\13\1\uffff\3\13\2\uffff\1\13\2\uffff\1\3\1\13\1\uffff\2\13\1\3\5\uffff\2\13\1\3\1\13\2\3\2\uffff\1\2\3\uffff\1\3\4\uffff\1\1\1\12\1\3",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = dfa_28;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "5777:2: ( rule__PipelineParameter__UnorderedGroup_1__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA67_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( (LA67_0==HyphenMinus) ) {s = 2;}

                        else if ( ( LA67_0 == WriteAll || LA67_0 == ReadAll || LA67_0 == Write || LA67_0 >= None && LA67_0 <= Read || LA67_0 == RULE_COMPLEX_EXPRESSION || LA67_0 == RULE_ID ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( (LA67_0==RULE_END) ) {s = 10;}

                        else if ( (LA67_0==EOF||LA67_0==WorkingDirectory||LA67_0==Concurrency||(LA67_0>=Parameters && LA67_0<=Permission)||(LA67_0>=Resources && LA67_0<=Defaults)||LA67_0==RunName||LA67_0==Default||(LA67_0>=Extends && LA67_0<=Include)||(LA67_0>=Name && LA67_0<=Pool)||LA67_0==Env) ) {s = 11;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1()) ) {s = 11;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_10 = input.LA(1);

                         
                        int index67_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineParameterAccess().getUnorderedGroup_1()) ) {s = 11;}

                         
                        input.seek(index67_10);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000C010000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0008010000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0008010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0002003404200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000E113504200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0006000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x004BF10000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000010111240L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010111242L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002010000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000C113404200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008113404200002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008113404200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0049F00000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00CBF50000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000003400000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008500000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008500000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0049F80000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000B0344ECA2L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000008022L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0006000000800002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000E113504200002L});

}
