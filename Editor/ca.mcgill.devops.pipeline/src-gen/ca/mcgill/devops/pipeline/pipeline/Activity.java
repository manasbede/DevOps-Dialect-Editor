/**
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.pipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.Activity#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.Activity#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.devops.pipeline.pipeline.PipelinePackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ca.mcgill.devops.pipeline.pipeline.PipelinePackage#getActivity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ca.mcgill.devops.pipeline.pipeline.Activity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Activities</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activities</em>' attribute list.
   * @see ca.mcgill.devops.pipeline.pipeline.PipelinePackage#getActivity_Activities()
   * @model unique="false"
   * @generated
   */
  EList<String> getActivities();

} // Activity
