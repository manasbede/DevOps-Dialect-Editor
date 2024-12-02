/**
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.pipeline.impl;

import ca.mcgill.devops.pipeline.pipeline.Event;
import ca.mcgill.devops.pipeline.pipeline.ExtendedParameter;
import ca.mcgill.devops.pipeline.pipeline.Job;
import ca.mcgill.devops.pipeline.pipeline.Pipeline;
import ca.mcgill.devops.pipeline.pipeline.PipelinePackage;
import ca.mcgill.devops.pipeline.pipeline.PipelineParameter;
import ca.mcgill.devops.pipeline.pipeline.Resource;
import ca.mcgill.devops.pipeline.pipeline.Stage;
import ca.mcgill.devops.pipeline.pipeline.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getRunName <em>Run Name</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getDefaultShellValue <em>Default Shell Value</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getDefaultWDValue <em>Default WD Value</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getAllPermission <em>All Permission</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getIndPermissions <em>Ind Permissions</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getCancelConcurrence <em>Cancel Concurrence</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getPipelineParameters <em>Pipeline Parameters</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getVmName <em>Vm Name</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getVmImage <em>Vm Image</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getVmDemands <em>Vm Demands</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getPplVariables <em>Ppl Variables</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getExtendedParameter <em>Extended Parameter</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getJobOrStageVar <em>Job Or Stage Var</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getStages <em>Stages</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.PipelineImpl#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getRunName() <em>Run Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunName()
   * @generated
   * @ordered
   */
  protected static final String RUN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRunName() <em>Run Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunName()
   * @generated
   * @ordered
   */
  protected String runName = RUN_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultShellValue() <em>Default Shell Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultShellValue()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_SHELL_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultShellValue() <em>Default Shell Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultShellValue()
   * @generated
   * @ordered
   */
  protected String defaultShellValue = DEFAULT_SHELL_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultWDValue() <em>Default WD Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultWDValue()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_WD_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultWDValue() <em>Default WD Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultWDValue()
   * @generated
   * @ordered
   */
  protected String defaultWDValue = DEFAULT_WD_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnv() <em>Env</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnv()
   * @generated
   * @ordered
   */
  protected EList<String> env;

  /**
   * The default value of the '{@link #getAllPermission() <em>All Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllPermission()
   * @generated
   * @ordered
   */
  protected static final String ALL_PERMISSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAllPermission() <em>All Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllPermission()
   * @generated
   * @ordered
   */
  protected String allPermission = ALL_PERMISSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndPermissions() <em>Ind Permissions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndPermissions()
   * @generated
   * @ordered
   */
  protected EList<String> indPermissions;

  /**
   * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected static final String GROUP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected String group = GROUP_EDEFAULT;

  /**
   * The default value of the '{@link #getCancelConcurrence() <em>Cancel Concurrence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCancelConcurrence()
   * @generated
   * @ordered
   */
  protected static final String CANCEL_CONCURRENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCancelConcurrence() <em>Cancel Concurrence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCancelConcurrence()
   * @generated
   * @ordered
   */
  protected String cancelConcurrence = CANCEL_CONCURRENCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPipelineParameters() <em>Pipeline Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPipelineParameters()
   * @generated
   * @ordered
   */
  protected EList<PipelineParameter> pipelineParameters;

  /**
   * The default value of the '{@link #getVmName() <em>Vm Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVmName()
   * @generated
   * @ordered
   */
  protected static final String VM_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVmName() <em>Vm Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVmName()
   * @generated
   * @ordered
   */
  protected String vmName = VM_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVmImage() <em>Vm Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVmImage()
   * @generated
   * @ordered
   */
  protected static final String VM_IMAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVmImage() <em>Vm Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVmImage()
   * @generated
   * @ordered
   */
  protected String vmImage = VM_IMAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getVmDemands() <em>Vm Demands</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVmDemands()
   * @generated
   * @ordered
   */
  protected static final String VM_DEMANDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVmDemands() <em>Vm Demands</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVmDemands()
   * @generated
   * @ordered
   */
  protected String vmDemands = VM_DEMANDS_EDEFAULT;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPplVariables() <em>Ppl Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPplVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> pplVariables;

  /**
   * The cached value of the '{@link #getExtendedParameter() <em>Extended Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendedParameter()
   * @generated
   * @ordered
   */
  protected ExtendedParameter extendedParameter;

  /**
   * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggers()
   * @generated
   * @ordered
   */
  protected EList<Event> triggers;

  /**
   * The default value of the '{@link #getJobOrStageVar() <em>Job Or Stage Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJobOrStageVar()
   * @generated
   * @ordered
   */
  protected static final String JOB_OR_STAGE_VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJobOrStageVar() <em>Job Or Stage Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJobOrStageVar()
   * @generated
   * @ordered
   */
  protected String jobOrStageVar = JOB_OR_STAGE_VAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getStages() <em>Stages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStages()
   * @generated
   * @ordered
   */
  protected EList<Stage> stages;

  /**
   * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJobs()
   * @generated
   * @ordered
   */
  protected EList<Job> jobs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PipelineImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PipelinePackage.Literals.PIPELINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRunName()
  {
    return runName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRunName(String newRunName)
  {
    String oldRunName = runName;
    runName = newRunName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__RUN_NAME, oldRunName, runName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDefaultShellValue()
  {
    return defaultShellValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefaultShellValue(String newDefaultShellValue)
  {
    String oldDefaultShellValue = defaultShellValue;
    defaultShellValue = newDefaultShellValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__DEFAULT_SHELL_VALUE, oldDefaultShellValue, defaultShellValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDefaultWDValue()
  {
    return defaultWDValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefaultWDValue(String newDefaultWDValue)
  {
    String oldDefaultWDValue = defaultWDValue;
    defaultWDValue = newDefaultWDValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__DEFAULT_WD_VALUE, oldDefaultWDValue, defaultWDValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getEnv()
  {
    if (env == null)
    {
      env = new EDataTypeEList<String>(String.class, this, PipelinePackage.PIPELINE__ENV);
    }
    return env;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAllPermission()
  {
    return allPermission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAllPermission(String newAllPermission)
  {
    String oldAllPermission = allPermission;
    allPermission = newAllPermission;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__ALL_PERMISSION, oldAllPermission, allPermission));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getIndPermissions()
  {
    if (indPermissions == null)
    {
      indPermissions = new EDataTypeEList<String>(String.class, this, PipelinePackage.PIPELINE__IND_PERMISSIONS);
    }
    return indPermissions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getGroup()
  {
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGroup(String newGroup)
  {
    String oldGroup = group;
    group = newGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__GROUP, oldGroup, group));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCancelConcurrence()
  {
    return cancelConcurrence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCancelConcurrence(String newCancelConcurrence)
  {
    String oldCancelConcurrence = cancelConcurrence;
    cancelConcurrence = newCancelConcurrence;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__CANCEL_CONCURRENCE, oldCancelConcurrence, cancelConcurrence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PipelineParameter> getPipelineParameters()
  {
    if (pipelineParameters == null)
    {
      pipelineParameters = new EObjectContainmentEList<PipelineParameter>(PipelineParameter.class, this, PipelinePackage.PIPELINE__PIPELINE_PARAMETERS);
    }
    return pipelineParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVmName()
  {
    return vmName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVmName(String newVmName)
  {
    String oldVmName = vmName;
    vmName = newVmName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__VM_NAME, oldVmName, vmName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVmImage()
  {
    return vmImage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVmImage(String newVmImage)
  {
    String oldVmImage = vmImage;
    vmImage = newVmImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__VM_IMAGE, oldVmImage, vmImage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVmDemands()
  {
    return vmDemands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVmDemands(String newVmDemands)
  {
    String oldVmDemands = vmDemands;
    vmDemands = newVmDemands;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__VM_DEMANDS, oldVmDemands, vmDemands));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Resource>(Resource.class, this, PipelinePackage.PIPELINE__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getPplVariables()
  {
    if (pplVariables == null)
    {
      pplVariables = new EObjectContainmentEList<Variable>(Variable.class, this, PipelinePackage.PIPELINE__PPL_VARIABLES);
    }
    return pplVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExtendedParameter getExtendedParameter()
  {
    return extendedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtendedParameter(ExtendedParameter newExtendedParameter, NotificationChain msgs)
  {
    ExtendedParameter oldExtendedParameter = extendedParameter;
    extendedParameter = newExtendedParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__EXTENDED_PARAMETER, oldExtendedParameter, newExtendedParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExtendedParameter(ExtendedParameter newExtendedParameter)
  {
    if (newExtendedParameter != extendedParameter)
    {
      NotificationChain msgs = null;
      if (extendedParameter != null)
        msgs = ((InternalEObject)extendedParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipelinePackage.PIPELINE__EXTENDED_PARAMETER, null, msgs);
      if (newExtendedParameter != null)
        msgs = ((InternalEObject)newExtendedParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipelinePackage.PIPELINE__EXTENDED_PARAMETER, null, msgs);
      msgs = basicSetExtendedParameter(newExtendedParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__EXTENDED_PARAMETER, newExtendedParameter, newExtendedParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Event> getTriggers()
  {
    if (triggers == null)
    {
      triggers = new EObjectContainmentEList<Event>(Event.class, this, PipelinePackage.PIPELINE__TRIGGERS);
    }
    return triggers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getJobOrStageVar()
  {
    return jobOrStageVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setJobOrStageVar(String newJobOrStageVar)
  {
    String oldJobOrStageVar = jobOrStageVar;
    jobOrStageVar = newJobOrStageVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__JOB_OR_STAGE_VAR, oldJobOrStageVar, jobOrStageVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Stage> getStages()
  {
    if (stages == null)
    {
      stages = new EObjectContainmentEList<Stage>(Stage.class, this, PipelinePackage.PIPELINE__STAGES);
    }
    return stages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Job> getJobs()
  {
    if (jobs == null)
    {
      jobs = new EObjectContainmentEList<Job>(Job.class, this, PipelinePackage.PIPELINE__JOBS);
    }
    return jobs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PipelinePackage.PIPELINE__PIPELINE_PARAMETERS:
        return ((InternalEList<?>)getPipelineParameters()).basicRemove(otherEnd, msgs);
      case PipelinePackage.PIPELINE__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
      case PipelinePackage.PIPELINE__PPL_VARIABLES:
        return ((InternalEList<?>)getPplVariables()).basicRemove(otherEnd, msgs);
      case PipelinePackage.PIPELINE__EXTENDED_PARAMETER:
        return basicSetExtendedParameter(null, msgs);
      case PipelinePackage.PIPELINE__TRIGGERS:
        return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
      case PipelinePackage.PIPELINE__STAGES:
        return ((InternalEList<?>)getStages()).basicRemove(otherEnd, msgs);
      case PipelinePackage.PIPELINE__JOBS:
        return ((InternalEList<?>)getJobs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PipelinePackage.PIPELINE__NAME:
        return getName();
      case PipelinePackage.PIPELINE__RUN_NAME:
        return getRunName();
      case PipelinePackage.PIPELINE__DEFAULT_SHELL_VALUE:
        return getDefaultShellValue();
      case PipelinePackage.PIPELINE__DEFAULT_WD_VALUE:
        return getDefaultWDValue();
      case PipelinePackage.PIPELINE__ENV:
        return getEnv();
      case PipelinePackage.PIPELINE__ALL_PERMISSION:
        return getAllPermission();
      case PipelinePackage.PIPELINE__IND_PERMISSIONS:
        return getIndPermissions();
      case PipelinePackage.PIPELINE__GROUP:
        return getGroup();
      case PipelinePackage.PIPELINE__CANCEL_CONCURRENCE:
        return getCancelConcurrence();
      case PipelinePackage.PIPELINE__PIPELINE_PARAMETERS:
        return getPipelineParameters();
      case PipelinePackage.PIPELINE__VM_NAME:
        return getVmName();
      case PipelinePackage.PIPELINE__VM_IMAGE:
        return getVmImage();
      case PipelinePackage.PIPELINE__VM_DEMANDS:
        return getVmDemands();
      case PipelinePackage.PIPELINE__RESOURCES:
        return getResources();
      case PipelinePackage.PIPELINE__VERSION:
        return getVersion();
      case PipelinePackage.PIPELINE__PPL_VARIABLES:
        return getPplVariables();
      case PipelinePackage.PIPELINE__EXTENDED_PARAMETER:
        return getExtendedParameter();
      case PipelinePackage.PIPELINE__TRIGGERS:
        return getTriggers();
      case PipelinePackage.PIPELINE__JOB_OR_STAGE_VAR:
        return getJobOrStageVar();
      case PipelinePackage.PIPELINE__STAGES:
        return getStages();
      case PipelinePackage.PIPELINE__JOBS:
        return getJobs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PipelinePackage.PIPELINE__NAME:
        setName((String)newValue);
        return;
      case PipelinePackage.PIPELINE__RUN_NAME:
        setRunName((String)newValue);
        return;
      case PipelinePackage.PIPELINE__DEFAULT_SHELL_VALUE:
        setDefaultShellValue((String)newValue);
        return;
      case PipelinePackage.PIPELINE__DEFAULT_WD_VALUE:
        setDefaultWDValue((String)newValue);
        return;
      case PipelinePackage.PIPELINE__ENV:
        getEnv().clear();
        getEnv().addAll((Collection<? extends String>)newValue);
        return;
      case PipelinePackage.PIPELINE__ALL_PERMISSION:
        setAllPermission((String)newValue);
        return;
      case PipelinePackage.PIPELINE__IND_PERMISSIONS:
        getIndPermissions().clear();
        getIndPermissions().addAll((Collection<? extends String>)newValue);
        return;
      case PipelinePackage.PIPELINE__GROUP:
        setGroup((String)newValue);
        return;
      case PipelinePackage.PIPELINE__CANCEL_CONCURRENCE:
        setCancelConcurrence((String)newValue);
        return;
      case PipelinePackage.PIPELINE__PIPELINE_PARAMETERS:
        getPipelineParameters().clear();
        getPipelineParameters().addAll((Collection<? extends PipelineParameter>)newValue);
        return;
      case PipelinePackage.PIPELINE__VM_NAME:
        setVmName((String)newValue);
        return;
      case PipelinePackage.PIPELINE__VM_IMAGE:
        setVmImage((String)newValue);
        return;
      case PipelinePackage.PIPELINE__VM_DEMANDS:
        setVmDemands((String)newValue);
        return;
      case PipelinePackage.PIPELINE__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
        return;
      case PipelinePackage.PIPELINE__VERSION:
        setVersion((String)newValue);
        return;
      case PipelinePackage.PIPELINE__PPL_VARIABLES:
        getPplVariables().clear();
        getPplVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case PipelinePackage.PIPELINE__EXTENDED_PARAMETER:
        setExtendedParameter((ExtendedParameter)newValue);
        return;
      case PipelinePackage.PIPELINE__TRIGGERS:
        getTriggers().clear();
        getTriggers().addAll((Collection<? extends Event>)newValue);
        return;
      case PipelinePackage.PIPELINE__JOB_OR_STAGE_VAR:
        setJobOrStageVar((String)newValue);
        return;
      case PipelinePackage.PIPELINE__STAGES:
        getStages().clear();
        getStages().addAll((Collection<? extends Stage>)newValue);
        return;
      case PipelinePackage.PIPELINE__JOBS:
        getJobs().clear();
        getJobs().addAll((Collection<? extends Job>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PipelinePackage.PIPELINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__RUN_NAME:
        setRunName(RUN_NAME_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__DEFAULT_SHELL_VALUE:
        setDefaultShellValue(DEFAULT_SHELL_VALUE_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__DEFAULT_WD_VALUE:
        setDefaultWDValue(DEFAULT_WD_VALUE_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__ENV:
        getEnv().clear();
        return;
      case PipelinePackage.PIPELINE__ALL_PERMISSION:
        setAllPermission(ALL_PERMISSION_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__IND_PERMISSIONS:
        getIndPermissions().clear();
        return;
      case PipelinePackage.PIPELINE__GROUP:
        setGroup(GROUP_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__CANCEL_CONCURRENCE:
        setCancelConcurrence(CANCEL_CONCURRENCE_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__PIPELINE_PARAMETERS:
        getPipelineParameters().clear();
        return;
      case PipelinePackage.PIPELINE__VM_NAME:
        setVmName(VM_NAME_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__VM_IMAGE:
        setVmImage(VM_IMAGE_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__VM_DEMANDS:
        setVmDemands(VM_DEMANDS_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__RESOURCES:
        getResources().clear();
        return;
      case PipelinePackage.PIPELINE__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__PPL_VARIABLES:
        getPplVariables().clear();
        return;
      case PipelinePackage.PIPELINE__EXTENDED_PARAMETER:
        setExtendedParameter((ExtendedParameter)null);
        return;
      case PipelinePackage.PIPELINE__TRIGGERS:
        getTriggers().clear();
        return;
      case PipelinePackage.PIPELINE__JOB_OR_STAGE_VAR:
        setJobOrStageVar(JOB_OR_STAGE_VAR_EDEFAULT);
        return;
      case PipelinePackage.PIPELINE__STAGES:
        getStages().clear();
        return;
      case PipelinePackage.PIPELINE__JOBS:
        getJobs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PipelinePackage.PIPELINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PipelinePackage.PIPELINE__RUN_NAME:
        return RUN_NAME_EDEFAULT == null ? runName != null : !RUN_NAME_EDEFAULT.equals(runName);
      case PipelinePackage.PIPELINE__DEFAULT_SHELL_VALUE:
        return DEFAULT_SHELL_VALUE_EDEFAULT == null ? defaultShellValue != null : !DEFAULT_SHELL_VALUE_EDEFAULT.equals(defaultShellValue);
      case PipelinePackage.PIPELINE__DEFAULT_WD_VALUE:
        return DEFAULT_WD_VALUE_EDEFAULT == null ? defaultWDValue != null : !DEFAULT_WD_VALUE_EDEFAULT.equals(defaultWDValue);
      case PipelinePackage.PIPELINE__ENV:
        return env != null && !env.isEmpty();
      case PipelinePackage.PIPELINE__ALL_PERMISSION:
        return ALL_PERMISSION_EDEFAULT == null ? allPermission != null : !ALL_PERMISSION_EDEFAULT.equals(allPermission);
      case PipelinePackage.PIPELINE__IND_PERMISSIONS:
        return indPermissions != null && !indPermissions.isEmpty();
      case PipelinePackage.PIPELINE__GROUP:
        return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
      case PipelinePackage.PIPELINE__CANCEL_CONCURRENCE:
        return CANCEL_CONCURRENCE_EDEFAULT == null ? cancelConcurrence != null : !CANCEL_CONCURRENCE_EDEFAULT.equals(cancelConcurrence);
      case PipelinePackage.PIPELINE__PIPELINE_PARAMETERS:
        return pipelineParameters != null && !pipelineParameters.isEmpty();
      case PipelinePackage.PIPELINE__VM_NAME:
        return VM_NAME_EDEFAULT == null ? vmName != null : !VM_NAME_EDEFAULT.equals(vmName);
      case PipelinePackage.PIPELINE__VM_IMAGE:
        return VM_IMAGE_EDEFAULT == null ? vmImage != null : !VM_IMAGE_EDEFAULT.equals(vmImage);
      case PipelinePackage.PIPELINE__VM_DEMANDS:
        return VM_DEMANDS_EDEFAULT == null ? vmDemands != null : !VM_DEMANDS_EDEFAULT.equals(vmDemands);
      case PipelinePackage.PIPELINE__RESOURCES:
        return resources != null && !resources.isEmpty();
      case PipelinePackage.PIPELINE__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case PipelinePackage.PIPELINE__PPL_VARIABLES:
        return pplVariables != null && !pplVariables.isEmpty();
      case PipelinePackage.PIPELINE__EXTENDED_PARAMETER:
        return extendedParameter != null;
      case PipelinePackage.PIPELINE__TRIGGERS:
        return triggers != null && !triggers.isEmpty();
      case PipelinePackage.PIPELINE__JOB_OR_STAGE_VAR:
        return JOB_OR_STAGE_VAR_EDEFAULT == null ? jobOrStageVar != null : !JOB_OR_STAGE_VAR_EDEFAULT.equals(jobOrStageVar);
      case PipelinePackage.PIPELINE__STAGES:
        return stages != null && !stages.isEmpty();
      case PipelinePackage.PIPELINE__JOBS:
        return jobs != null && !jobs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", runName: ");
    result.append(runName);
    result.append(", defaultShellValue: ");
    result.append(defaultShellValue);
    result.append(", defaultWDValue: ");
    result.append(defaultWDValue);
    result.append(", env: ");
    result.append(env);
    result.append(", allPermission: ");
    result.append(allPermission);
    result.append(", indPermissions: ");
    result.append(indPermissions);
    result.append(", group: ");
    result.append(group);
    result.append(", cancelConcurrence: ");
    result.append(cancelConcurrence);
    result.append(", vmName: ");
    result.append(vmName);
    result.append(", vmImage: ");
    result.append(vmImage);
    result.append(", vmDemands: ");
    result.append(vmDemands);
    result.append(", version: ");
    result.append(version);
    result.append(", jobOrStageVar: ");
    result.append(jobOrStageVar);
    result.append(')');
    return result.toString();
  }

} //PipelineImpl
