/*
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.serializer;

import ca.mcgill.devops.pipeline.pipeline.Activity;
import ca.mcgill.devops.pipeline.pipeline.Branch;
import ca.mcgill.devops.pipeline.pipeline.Configurations;
import ca.mcgill.devops.pipeline.pipeline.Event;
import ca.mcgill.devops.pipeline.pipeline.Job;
import ca.mcgill.devops.pipeline.pipeline.ParameterValue;
import ca.mcgill.devops.pipeline.pipeline.Pipeline;
import ca.mcgill.devops.pipeline.pipeline.PipelinePackage;
import ca.mcgill.devops.pipeline.pipeline.Resource;
import ca.mcgill.devops.pipeline.pipeline.Script;
import ca.mcgill.devops.pipeline.pipeline.Stage;
import ca.mcgill.devops.pipeline.pipeline.TriggerSchedule;
import ca.mcgill.devops.pipeline.pipeline.Variable;
import ca.mcgill.devops.pipeline.services.PipelineGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class PipelineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PipelineGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PipelinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PipelinePackage.ACTION:
				sequence_Action(context, (ca.mcgill.devops.pipeline.pipeline.Action) semanticObject); 
				return; 
			case PipelinePackage.ACTIVITY:
				sequence_Activity(context, (Activity) semanticObject); 
				return; 
			case PipelinePackage.BRANCH:
				sequence_Branch(context, (Branch) semanticObject); 
				return; 
			case PipelinePackage.CONFIGURATIONS:
				sequence_Configurations(context, (Configurations) semanticObject); 
				return; 
			case PipelinePackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case PipelinePackage.JOB:
				sequence_Job(context, (Job) semanticObject); 
				return; 
			case PipelinePackage.PARAMETER_VALUE:
				sequence_ParameterValue(context, (ParameterValue) semanticObject); 
				return; 
			case PipelinePackage.PIPELINE:
				sequence_Pipeline(context, (Pipeline) semanticObject); 
				return; 
			case PipelinePackage.RESOURCE:
				sequence_Resource(context, (Resource) semanticObject); 
				return; 
			case PipelinePackage.SCRIPT:
				sequence_Script(context, (Script) semanticObject); 
				return; 
			case PipelinePackage.STAGE:
				sequence_Stage(context, (Stage) semanticObject); 
				return; 
			case PipelinePackage.TRIGGER_SCHEDULE:
				sequence_TriggerSchedule(context, (TriggerSchedule) semanticObject); 
				return; 
			case PipelinePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns Action
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (
	 *         (actionName=UnquotedString | ((actionKeyword=PipelineKeyword | otherKeyword=ID) (actionValue=AnyData | actionValue=HyphenValues)?)) 
	 *         subSteps+=Action? 
	 *         (subSteps+=Script? subSteps+=Action?)*
	 *     )
	 * </pre>
	 */
	protected void sequence_Action(ISerializationContext context, ca.mcgill.devops.pipeline.pipeline.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Activity returns Activity
	 *
	 * Constraint:
	 *     (name=AnyData | name=HyphenValues | name=ArrayList | ((name='inputs:' | name='outputs:' | name='secrets:') activities+=ParameterValue+))
	 * </pre>
	 */
	protected void sequence_Activity(ISerializationContext context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Branch returns Branch
	 *
	 * Constraint:
	 *     (name=ID | name=STRING)
	 * </pre>
	 */
	protected void sequence_Branch(ISerializationContext context, Branch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Configurations returns Configurations
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             name=UnquotedString | 
	 *             runName=UnquotedString | 
	 *             defaultShellValue=STRING | 
	 *             defaultShellValue=ID | 
	 *             defaultWDValue=STRING | 
	 *             defaultWDValue=ID | 
	 *             env+=KeyValue | 
	 *             allPermission=ID | 
	 *             indPermissions+=IndPermissionValue | 
	 *             concurrency=AnyData | 
	 *             concurrency=ArrayList | 
	 *             vmDemands=AnyData | 
	 *             vmDemands=HyphenValues | 
	 *             resources+=Resource | 
	 *             version=VERSION | 
	 *             pplVariables+=Variable | 
	 *             parameterValues+=ParameterValue
	 *         )? 
	 *         (vmName=ID (vmImage=ID | vmImage=STRING)?)? 
	 *         ((extendOrInclude='extends:' | extendOrInclude='include:') extendedParameters+=ParameterValue+)? 
	 *         ((group=ID | group=COMPLEX_EXPRESSION) (cancelConcurrence=ID | cancelConcurrence=COMPLEX_EXPRESSION))?
	 *     )+
	 * </pre>
	 */
	protected void sequence_Configurations(ISerializationContext context, Configurations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (name=PipelineEventKeyword | simpleEvent=ID) 
	 *             includedBranches+=Branch* 
	 *             includedBranches+=Branch? 
	 *             (
	 *                 (
	 *                     activities+=Activity | 
	 *                     batch=ID | 
	 *                     autoCancel=ID | 
	 *                     workflows=ArrayList | 
	 *                     workflows=HyphenValues | 
	 *                     workflows=ID | 
	 *                     drafts=ID | 
	 *                     (includedBranches+=Branch includedBranches+=Branch*) | 
	 *                     includedBranches+=Branch | 
	 *                     includedBranches+=Branch | 
	 *                     excludedBranches+=Branch | 
	 *                     excludedBranches+=Branch | 
	 *                     (excludedBranches+=Branch excludedBranches+=Branch*) | 
	 *                     excludedBranches+=Branch | 
	 *                     includedPaths=HyphenValues | 
	 *                     includedPaths=HyphenValues | 
	 *                     excludedPaths=HyphenValues | 
	 *                     excludedPaths=HyphenValues | 
	 *                     includedTags=HyphenValues | 
	 *                     includedTags=HyphenValues | 
	 *                     excludedTags=HyphenValues | 
	 *                     excludedTags=HyphenValues
	 *                 )? 
	 *                 includedBranches+=Branch?
	 *             )*
	 *         ) | 
	 *         ((scheduleNameKW='schedules:' | scheduleNameKW='schedule:') triggerSchedules+=TriggerSchedule*) | 
	 *         (workflowTypeKW='workflow_call:'? workFlowActivities+=Activity*)
	 *     )
	 * </pre>
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Job returns Job
	 *
	 * Constraint:
	 *     (
	 *         (name=ID | name=STRING) 
	 *         jobParameterValues+=ParameterValue* 
	 *         ((dependKW='needs:' | dependKW='dependsOn:') (references+=[Job|ID] | (references+=[Job|ID] references+=[Job|ID]*))?)? 
	 *         steps+=Step*
	 *     )
	 * </pre>
	 */
	protected void sequence_Job(ISerializationContext context, Job semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ParameterValue returns ParameterValue
	 *
	 * Constraint:
	 *     (
	 *         (name=PipelineKeyword | otherName=ID | otherName=COMPLEX_EXPRESSION) 
	 *         (
	 *             ((value=AnyData | value=ArrayList | value=HyphenValues) subParameters+=ParameterValue*) | 
	 *             subParameters+=ParameterValue+ | 
	 *             subParameters+=ParameterValue+
	 *         )?
	 *     )
	 * </pre>
	 */
	protected void sequence_ParameterValue(ISerializationContext context, ParameterValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Pipeline returns Pipeline
	 *
	 * Constraint:
	 *     (
	 *         pipelineConfiguration=Configurations 
	 *         ((triggers+=Event* (triggers+=Event | (triggers+=Event triggers+=Event*))?) | triggers+=Event+)? 
	 *         (jobOrStageVar='stages:' | jobOrStageVar='jobs:') 
	 *         (stages+=Stage+ | jobs+=Job+)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Pipeline(ISerializationContext context, Pipeline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Resource returns Resource
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             resourceName='builds:' | 
	 *             resourceName='containers:' | 
	 *             resourceName='pipelines:' | 
	 *             resourceName='repositories:' | 
	 *             resourceName='webhooks:' | 
	 *             resourceName='packages:'
	 *         ) 
	 *         (resourceValues+=ParameterValue+ | resourceValues+=ParameterValue+)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Resource(ISerializationContext context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns Script
	 *     Script returns Script
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             name='run:' | 
	 *             name='script:' | 
	 *             name='bash:' | 
	 *             name='pwsh:' | 
	 *             name='powershell:' | 
	 *             name='checkout:' | 
	 *             name='download:' | 
	 *             name='getPackage:' | 
	 *             name='publish:' | 
	 *             name='task:'
	 *         ) 
	 *         (command=AnyData | command=AnyData) 
	 *         (subSteps+=Action | subSteps+=Script)*
	 *     )
	 * </pre>
	 */
	protected void sequence_Script(ISerializationContext context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Stage returns Stage
	 *
	 * Constraint:
	 *     (
	 *         name=AnyData 
	 *         (
	 *             displayName=STRING | 
	 *             poolValue=AnyData | 
	 *             vmName=ID | 
	 *             vmImage=ID | 
	 *             vmImage=STRING | 
	 *             vmDemands=AnyData | 
	 *             vmDemands=HyphenValues | 
	 *             conditionValue=AnyData | 
	 *             isSkippable=ID | 
	 *             stageVariables+=Variable | 
	 *             dependsOn+=[Stage|ID] | 
	 *             jobs+=Job
	 *         )*
	 *     )
	 * </pre>
	 */
	protected void sequence_Stage(ISerializationContext context, Stage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TriggerSchedule returns TriggerSchedule
	 *
	 * Constraint:
	 *     (
	 *         (cronValue=STRING | cronValue=STRING) 
	 *         displayName=UnquotedString? 
	 *         includedBranches+=Branch* 
	 *         excludedBranches+=Branch* 
	 *         batch=ID? 
	 *         (always=ID? batch=ID?)*
	 *     )
	 * </pre>
	 */
	protected void sequence_TriggerSchedule(ISerializationContext context, TriggerSchedule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (
	 *         (variableKey=ID (variableValue=ID | variableValue=STRING | variableValue=COMPLEX_EXPRESSION)) | 
	 *         (name=AnyData (value=AnyData readonly=ID?)?) | 
	 *         (name=ID variables+=KeyValue+)
	 *     )
	 * </pre>
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
