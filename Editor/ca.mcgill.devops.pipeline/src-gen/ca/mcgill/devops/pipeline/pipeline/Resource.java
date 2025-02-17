/**
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.pipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.Resource#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.Resource#getResourceValues <em>Resource Values</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.devops.pipeline.pipeline.PipelinePackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Name</em>' attribute.
   * @see #setResourceName(String)
   * @see ca.mcgill.devops.pipeline.pipeline.PipelinePackage#getResource_ResourceName()
   * @model
   * @generated
   */
  String getResourceName();

  /**
   * Sets the value of the '{@link ca.mcgill.devops.pipeline.pipeline.Resource#getResourceName <em>Resource Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Name</em>' attribute.
   * @see #getResourceName()
   * @generated
   */
  void setResourceName(String value);

  /**
   * Returns the value of the '<em><b>Resource Values</b></em>' containment reference list.
   * The list contents are of type {@link ca.mcgill.devops.pipeline.pipeline.ParameterValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Values</em>' containment reference list.
   * @see ca.mcgill.devops.pipeline.pipeline.PipelinePackage#getResource_ResourceValues()
   * @model containment="true"
   * @generated
   */
  EList<ParameterValue> getResourceValues();

} // Resource
