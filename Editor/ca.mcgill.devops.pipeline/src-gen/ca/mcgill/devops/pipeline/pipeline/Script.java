/**
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.pipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.Script#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.devops.pipeline.pipeline.Script#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.devops.pipeline.pipeline.PipelinePackage#getScript()
 * @model
 * @generated
 */
public interface Script extends Step
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ca.mcgill.devops.pipeline.pipeline.PipelinePackage#getScript_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ca.mcgill.devops.pipeline.pipeline.Script#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' attribute.
   * @see #setCommand(String)
   * @see ca.mcgill.devops.pipeline.pipeline.PipelinePackage#getScript_Command()
   * @model
   * @generated
   */
  String getCommand();

  /**
   * Sets the value of the '{@link ca.mcgill.devops.pipeline.pipeline.Script#getCommand <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' attribute.
   * @see #getCommand()
   * @generated
   */
  void setCommand(String value);

} // Script
