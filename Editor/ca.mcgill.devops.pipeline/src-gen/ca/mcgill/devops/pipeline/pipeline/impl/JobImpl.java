/**
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.pipeline.impl;

import ca.mcgill.devops.pipeline.pipeline.Job;
import ca.mcgill.devops.pipeline.pipeline.JobParameter;
import ca.mcgill.devops.pipeline.pipeline.PipelinePackage;
import ca.mcgill.devops.pipeline.pipeline.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.JobImpl#getNameKW <em>Name KW</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.JobImpl#getJobName <em>Job Name</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.JobImpl#getDependKW <em>Depend KW</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.JobImpl#getReferences <em>References</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.JobImpl#getJobParameterValues <em>Job Parameter Values</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.JobImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job
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
   * The default value of the '{@link #getNameKW() <em>Name KW</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameKW()
   * @generated
   * @ordered
   */
  protected static final String NAME_KW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameKW() <em>Name KW</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameKW()
   * @generated
   * @ordered
   */
  protected String nameKW = NAME_KW_EDEFAULT;

  /**
   * The default value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJobName()
   * @generated
   * @ordered
   */
  protected static final String JOB_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJobName()
   * @generated
   * @ordered
   */
  protected String jobName = JOB_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDependKW() <em>Depend KW</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependKW()
   * @generated
   * @ordered
   */
  protected static final String DEPEND_KW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDependKW() <em>Depend KW</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependKW()
   * @generated
   * @ordered
   */
  protected String dependKW = DEPEND_KW_EDEFAULT;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<Job> references;

  /**
   * The cached value of the '{@link #getJobParameterValues() <em>Job Parameter Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJobParameterValues()
   * @generated
   * @ordered
   */
  protected EList<JobParameter> jobParameterValues;

  /**
   * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSteps()
   * @generated
   * @ordered
   */
  protected EList<Step> steps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JobImpl()
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
    return PipelinePackage.Literals.JOB;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.JOB__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNameKW()
  {
    return nameKW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNameKW(String newNameKW)
  {
    String oldNameKW = nameKW;
    nameKW = newNameKW;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.JOB__NAME_KW, oldNameKW, nameKW));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getJobName()
  {
    return jobName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setJobName(String newJobName)
  {
    String oldJobName = jobName;
    jobName = newJobName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.JOB__JOB_NAME, oldJobName, jobName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDependKW()
  {
    return dependKW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDependKW(String newDependKW)
  {
    String oldDependKW = dependKW;
    dependKW = newDependKW;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.JOB__DEPEND_KW, oldDependKW, dependKW));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Job> getReferences()
  {
    if (references == null)
    {
      references = new EObjectResolvingEList<Job>(Job.class, this, PipelinePackage.JOB__REFERENCES);
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JobParameter> getJobParameterValues()
  {
    if (jobParameterValues == null)
    {
      jobParameterValues = new EObjectContainmentEList<JobParameter>(JobParameter.class, this, PipelinePackage.JOB__JOB_PARAMETER_VALUES);
    }
    return jobParameterValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Step> getSteps()
  {
    if (steps == null)
    {
      steps = new EObjectContainmentEList<Step>(Step.class, this, PipelinePackage.JOB__STEPS);
    }
    return steps;
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
      case PipelinePackage.JOB__JOB_PARAMETER_VALUES:
        return ((InternalEList<?>)getJobParameterValues()).basicRemove(otherEnd, msgs);
      case PipelinePackage.JOB__STEPS:
        return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
      case PipelinePackage.JOB__NAME:
        return getName();
      case PipelinePackage.JOB__NAME_KW:
        return getNameKW();
      case PipelinePackage.JOB__JOB_NAME:
        return getJobName();
      case PipelinePackage.JOB__DEPEND_KW:
        return getDependKW();
      case PipelinePackage.JOB__REFERENCES:
        return getReferences();
      case PipelinePackage.JOB__JOB_PARAMETER_VALUES:
        return getJobParameterValues();
      case PipelinePackage.JOB__STEPS:
        return getSteps();
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
      case PipelinePackage.JOB__NAME:
        setName((String)newValue);
        return;
      case PipelinePackage.JOB__NAME_KW:
        setNameKW((String)newValue);
        return;
      case PipelinePackage.JOB__JOB_NAME:
        setJobName((String)newValue);
        return;
      case PipelinePackage.JOB__DEPEND_KW:
        setDependKW((String)newValue);
        return;
      case PipelinePackage.JOB__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends Job>)newValue);
        return;
      case PipelinePackage.JOB__JOB_PARAMETER_VALUES:
        getJobParameterValues().clear();
        getJobParameterValues().addAll((Collection<? extends JobParameter>)newValue);
        return;
      case PipelinePackage.JOB__STEPS:
        getSteps().clear();
        getSteps().addAll((Collection<? extends Step>)newValue);
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
      case PipelinePackage.JOB__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PipelinePackage.JOB__NAME_KW:
        setNameKW(NAME_KW_EDEFAULT);
        return;
      case PipelinePackage.JOB__JOB_NAME:
        setJobName(JOB_NAME_EDEFAULT);
        return;
      case PipelinePackage.JOB__DEPEND_KW:
        setDependKW(DEPEND_KW_EDEFAULT);
        return;
      case PipelinePackage.JOB__REFERENCES:
        getReferences().clear();
        return;
      case PipelinePackage.JOB__JOB_PARAMETER_VALUES:
        getJobParameterValues().clear();
        return;
      case PipelinePackage.JOB__STEPS:
        getSteps().clear();
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
      case PipelinePackage.JOB__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PipelinePackage.JOB__NAME_KW:
        return NAME_KW_EDEFAULT == null ? nameKW != null : !NAME_KW_EDEFAULT.equals(nameKW);
      case PipelinePackage.JOB__JOB_NAME:
        return JOB_NAME_EDEFAULT == null ? jobName != null : !JOB_NAME_EDEFAULT.equals(jobName);
      case PipelinePackage.JOB__DEPEND_KW:
        return DEPEND_KW_EDEFAULT == null ? dependKW != null : !DEPEND_KW_EDEFAULT.equals(dependKW);
      case PipelinePackage.JOB__REFERENCES:
        return references != null && !references.isEmpty();
      case PipelinePackage.JOB__JOB_PARAMETER_VALUES:
        return jobParameterValues != null && !jobParameterValues.isEmpty();
      case PipelinePackage.JOB__STEPS:
        return steps != null && !steps.isEmpty();
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
    result.append(", nameKW: ");
    result.append(nameKW);
    result.append(", jobName: ");
    result.append(jobName);
    result.append(", dependKW: ");
    result.append(dependKW);
    result.append(')');
    return result.toString();
  }

} //JobImpl