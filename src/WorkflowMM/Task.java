/**
 */
package WorkflowMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkflowMM.Task#getId <em>Id</em>}</li>
 *   <li>{@link WorkflowMM.Task#getName <em>Name</em>}</li>
 *   <li>{@link WorkflowMM.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link WorkflowMM.Task#getLinkedTo <em>Linked To</em>}</li>
 *   <li>{@link WorkflowMM.Task#getLinkedFrom <em>Linked From</em>}</li>
 * </ul>
 *
 * @see WorkflowMM.WorkflowMMPackage#getTask()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TaskMustBeLinkedToTheSameActor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TaskMustBeLinkedToTheSameActor='\n\t\t\tnot self.oclIsTypeOf(SendMsgTask) and not self.oclIsTypeOf(ReceiveMsgTask) and not self.oclIsTypeOf(End) implies self.oclContainer = self.linkedTo.oclContainer'"
 *        annotation="gmf.node label='name' label.icon='false' color='255,255,255'"
 * @generated
 */
public interface Task extends EObject {
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
	 * @see WorkflowMM.WorkflowMMPackage#getTask_Id()
	 * @model required="true"
	 *        annotation="gmf.label label.pattern='id: {0}'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WorkflowMM.Task#getId <em>Id</em>}' attribute.
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
	 * @see WorkflowMM.WorkflowMMPackage#getTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WorkflowMM.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see WorkflowMM.WorkflowMMPackage#getTask_Description()
	 * @model required="true"
	 *        annotation="gmf.label label.pattern='desc: {0}'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link WorkflowMM.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Linked To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link WorkflowMM.Task#getLinkedFrom <em>Linked From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked To</em>' reference.
	 * @see #setLinkedTo(Task)
	 * @see WorkflowMM.WorkflowMMPackage#getTask_LinkedTo()
	 * @see WorkflowMM.Task#getLinkedFrom
	 * @model opposite="linkedFrom"
	 *        annotation="gmf.link target.decoration='arrow' color='0,0,0'"
	 * @generated
	 */
	Task getLinkedTo();

	/**
	 * Sets the value of the '{@link WorkflowMM.Task#getLinkedTo <em>Linked To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked To</em>' reference.
	 * @see #getLinkedTo()
	 * @generated
	 */
	void setLinkedTo(Task value);

	/**
	 * Returns the value of the '<em><b>Linked From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link WorkflowMM.Task#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked From</em>' reference.
	 * @see #setLinkedFrom(Task)
	 * @see WorkflowMM.WorkflowMMPackage#getTask_LinkedFrom()
	 * @see WorkflowMM.Task#getLinkedTo
	 * @model opposite="linkedTo"
	 *        annotation="gmf.link target.decoration='arrow' color='255,255,255'"
	 * @generated
	 */
	Task getLinkedFrom();

	/**
	 * Sets the value of the '{@link WorkflowMM.Task#getLinkedFrom <em>Linked From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked From</em>' reference.
	 * @see #getLinkedFrom()
	 * @generated
	 */
	void setLinkedFrom(Task value);

} // Task
