/**
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.pipeline.impl;

import ca.mcgill.devops.pipeline.pipeline.ExtendedParameter;
import ca.mcgill.devops.pipeline.pipeline.ParameterValue;
import ca.mcgill.devops.pipeline.pipeline.PipelinePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.ExtendedParameterImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.impl.ExtendedParameterImpl#getExtendedParameterValues <em>Extended Parameter Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedParameterImpl extends MinimalEObjectImpl.Container implements ExtendedParameter
{
  /**
   * The default value of the '{@link #getTemplate() <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected static final String TEMPLATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTemplate() <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected String template = TEMPLATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getExtendedParameterValues() <em>Extended Parameter Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendedParameterValues()
   * @generated
   * @ordered
   */
  protected EList<ParameterValue> extendedParameterValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendedParameterImpl()
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
    return PipelinePackage.Literals.EXTENDED_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTemplate()
  {
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTemplate(String newTemplate)
  {
    String oldTemplate = template;
    template = newTemplate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.EXTENDED_PARAMETER__TEMPLATE, oldTemplate, template));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ParameterValue> getExtendedParameterValues()
  {
    if (extendedParameterValues == null)
    {
      extendedParameterValues = new EObjectContainmentEList<ParameterValue>(ParameterValue.class, this, PipelinePackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_VALUES);
    }
    return extendedParameterValues;
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
      case PipelinePackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_VALUES:
        return ((InternalEList<?>)getExtendedParameterValues()).basicRemove(otherEnd, msgs);
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
      case PipelinePackage.EXTENDED_PARAMETER__TEMPLATE:
        return getTemplate();
      case PipelinePackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_VALUES:
        return getExtendedParameterValues();
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
      case PipelinePackage.EXTENDED_PARAMETER__TEMPLATE:
        setTemplate((String)newValue);
        return;
      case PipelinePackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_VALUES:
        getExtendedParameterValues().clear();
        getExtendedParameterValues().addAll((Collection<? extends ParameterValue>)newValue);
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
      case PipelinePackage.EXTENDED_PARAMETER__TEMPLATE:
        setTemplate(TEMPLATE_EDEFAULT);
        return;
      case PipelinePackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_VALUES:
        getExtendedParameterValues().clear();
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
      case PipelinePackage.EXTENDED_PARAMETER__TEMPLATE:
        return TEMPLATE_EDEFAULT == null ? template != null : !TEMPLATE_EDEFAULT.equals(template);
      case PipelinePackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_VALUES:
        return extendedParameterValues != null && !extendedParameterValues.isEmpty();
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
    result.append(" (template: ");
    result.append(template);
    result.append(')');
    return result.toString();
  }

} //ExtendedParameterImpl