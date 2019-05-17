/**
 */
package WorkflowMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkflowMM.Actor#getId <em>Id</em>}</li>
 *   <li>{@link WorkflowMM.Actor#getName <em>Name</em>}</li>
 *   <li>{@link WorkflowMM.Actor#getTasks <em>Tasks</em>}</li>
 *   <li>{@link WorkflowMM.Actor#getInformations <em>Informations</em>}</li>
 * </ul>
 *
 * @see WorkflowMM.WorkflowMMPackage#getActor()
 * @model annotation="gmf.node label='name' label.icon='false' color='200,200,200'"
 * @generated
 */
public interface Actor extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see WorkflowMM.WorkflowMMPackage#getActor_Id()
	 * @model required="true"
	 *        annotation="gmf.label label.pattern='id: {0}'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WorkflowMM.Actor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see WorkflowMM.WorkflowMMPackage#getActor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WorkflowMM.Actor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link WorkflowMM.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see WorkflowMM.WorkflowMMPackage#getActor_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Informations</b></em>' containment reference list.
	 * The list contents are of type {@link WorkflowMM.Information}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informations</em>' containment reference list.
	 * @see WorkflowMM.WorkflowMMPackage#getActor_Informations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Information> getInformations();

} // Actor
