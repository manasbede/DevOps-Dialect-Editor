/*
 * generated by Xtext 2.33.0
 */
lexer grammar InternalPipelineLexer;

@header {
package ca.mcgill.devops.pipeline.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Repository_dispatch : 'repository_dispatch:';

CancelInProgress : 'cancel-in-progress:';

ContinueOnError_1 : 'continue-on-error:';

Workflow_dispatch : 'workflow_dispatch:';

WorkingDirectory : 'working-directory:';

TimeoutInMinutes : 'timeoutInMinutes:';

BranchesIgnore : 'branches-ignore:';

ContainerImage : 'container.image:';

ContinueOnError : 'continueOnError:';

TimeoutMinutes : 'timeout-minutes:';

ReleaseTrigger : 'releaseTrigger:';

Allow_failure : 'allow_failure:';

Before_script : 'before_script:';

DeployTrigger : 'deployTrigger:';

Notifications : 'notifications:';

PullRequests : 'pull-requests:';

Workflow_call : 'workflow_call:';

After_script : 'after_script:';

DefaultsRun : 'defaults.run:';

Dependencies : 'dependencies:';

LockBehavior : 'lockBehavior:';

MaxParallel : 'max-parallel:';

PathsIgnore : 'paths-ignore:';

Pull_request : 'pull_request:';

Repositories : 'repositories:';

Requirements : 'requirements:';

ResourceName : 'resourceName:';

ResourceType : 'resourceType:';

TriggerRules : 'triggerRules:';

Workflow_run : 'workflow_run:';

Concurrency : 'concurrency:';

Credentials : 'credentials:';

Definitions : 'definitions:';

DisplayName : 'displayName:';

Environment : 'environment:';

IsSkippable : 'isSkippable:';

Permissions : 'permissions:';

Provisioner : 'provisioner:';

ReviewStage : 'reviewStage:';

TagsIgnore : 'tags-ignore:';

AutoCancel : 'autoCancel:';

Conditions : 'conditions:';

Containers : 'containers:';

Deployment : 'deployment:';

GetPackage : 'getPackage:';

Parameters : 'parameters:';

Permission : 'permission:';

Powershell : 'powershell:';

Repository : 'repository:';

Approvals : 'approvals:';

Artifacts : 'artifacts:';

Condition : 'condition:';

Container : 'container:';

DependsOn : 'dependsOn:';

Endpoints : 'endpoints:';

Executors : 'executors:';

FailFast : 'fail-fast:';

Pipelines : 'pipelines:';

PostBuild : 'postBuild:';

Resources : 'resources:';

RunPolicy : 'runPolicy:';

Schedules : 'schedules:';

Variables : 'variables:';

Workspace : 'workspace:';

Branches : 'branches:';

Checkout : 'checkout:';

Commands : 'commands:';

Defaults : 'defaults:';

Download : 'download:';

MaxTime : 'max-time:';

Packages : 'packages:';

Parallel : 'parallel:';

Pipeline : 'pipeline:';

PreBuild : 'preBuild:';

Readonly : 'readonly:';

RunName : 'run-name:';

Schedule : 'schedule:';

Services : 'services:';

Snapshot : 'snapshot:';

Strategy : 'strategy:';

Template : 'template:';

Timeouts : 'timeouts:';

Webhooks : 'webhooks:';

Command : 'command:';

Default : 'default:';

Demands : 'demands:';

Exclude : 'exclude:';

Extends : 'extends:';

Filters : 'filters:';

Include : 'include:';

Inherit : 'inherit:';

Outputs : 'outputs:';

Project : 'project:';

Publish : 'publish:';

Release : 'release:';

Retries : 'retries:';

RunsOn : 'runs-on:';

Secrets : 'secrets:';

Storage : 'storage:';

Timeout : 'timeout:';

Trigger : 'trigger:';

Version : 'version:';

VmImage : 'vmImage:';

Always : 'always:';

Builds : 'builds:';

Caches : 'caches:';

Docker : 'docker:';

Drafts : 'drafts:';

Except : 'except:';

Labels : 'labels:';

Matrix : 'matrix:';

Policy : 'policy:';

Queued : 'queued:';

Script : 'script:';

Stages : 'stages:';

Agent : 'agent:';

Batch : 'batch:';

Cache : 'cache:';

Final : 'final:';

Group : 'group:';

Image : 'image:';

Needs : 'needs:';

Paths : 'paths:';

Ports : 'ports:';

Queue : 'queue:';

Rules : 'rules:';

Shell : 'shell:';

Stage : 'stage:';

Steps : 'steps:';

Tasks : 'tasks:';

Types : 'types:';

Value : 'value:';

Auth : 'auth:';

Bash : 'bash:';

Cron : 'cron:';

Jobs : 'jobs:';

Name : 'name:';

Only : 'only:';

Orbs : 'orbs:';

Plan : 'plan:';

Pool : 'pool:';

Push : 'push:';

Pwsh : 'pwsh:';

Step : 'step:';

Tags : 'tags:';

Task : 'task:';

Uses : 'uses:';

When : 'when:';

With : 'with:';

Write : 'write';

Env : 'env:';

Jdk : 'jdk:';

Job : 'job:';

None : 'none';

Read : 'read';

Run : 'run:';

Ssh : 'ssh:';

Id : 'id:';

If : 'if:';

On : 'on:';

GreaterThanSignHyphenMinus : '>-';

Comma : ',';

HyphenMinus : '-';

Colon : ':';

LeftSquareBracket : '[';

RightSquareBracket : ']';

VerticalLine : '|';

RULE_COMPLEX_EXPRESSION : (('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'-')*)? '${{' ( options {greedy=false;} : . )*'}}' ('-${{' ( options {greedy=false;} : . )*'}}')*;

RULE_HEX_INT : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_FLOAT_LITERAL : '-'? RULE_INT '.' RULE_INT;

RULE_VERSION : RULE_INT ('.' RULE_INT)+;

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : ('a'..'z'|'A'..'Z'|'_'|'/'|'@'|'-'|'.'|'\\'|'&') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'/'|'@'|'&'|'-'|'.'|'\\'|'('|')'|'|'|'$')*;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
