/**
 */
package WorkflowMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Msg Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkflowMM.SendMsgTask#getDestination <em>Destination</em>}</li>
 *   <li>{@link WorkflowMM.SendMsgTask#getRequires <em>Requires</em>}</li>
 *   <li>{@link WorkflowMM.SendMsgTask#getNextTask <em>Next Task</em>}</li>
 * </ul>
 *
 * @see WorkflowMM.WorkflowMMPackage#getSendMsgTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SendMsgTaskAndReceiveMsgTaskMustBelongToDifferentUsers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SendMsgTaskAndReceiveMsgTaskMustBelongToDifferentUsers='\n\t\t\tself.oclContainer<>self.destination.oclContainer'"
 * @generated
 */
public interface SendMsgTask extends Task {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(ReceiveMsgTask)
	 * @see WorkflowMM.WorkflowMMPackage#getSendMsgTask_Destination()
	 * @model required="true"
	 *        annotation="gmf.link label='destination' target.decoration='arrow' color='255,255,55'"
	 * @generated
	 */
	ReceiveMsgTask getDestination();

	/**
	 * Sets the value of the '{@link WorkflowMM.SendMsgTask#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(ReceiveMsgTask value);

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link WorkflowMM.Information}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see WorkflowMM.WorkflowMMPackage#getSendMsgTask_Requires()
	 * @model annotation="gmf.link label='req' target.decoration='arrow' color='255,0,0'"
	 * @generated
	 */
	EList<Information> getRequires();

	/**
	 * Returns the value of the '<em><b>Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Task</em>' reference.
	 * @see #setNextTask(Task)
	 * @see WorkflowMM.WorkflowMMPackage#getSendMsgTask_NextTask()
	 * @model required="true"
	 *        annotation="gmf.link label='next task' target.decoration='arrow' color='0,0,0' style='dash'"
	 * @generated
	 */
	Task getNextTask();

	/**
	 * Sets the value of the '{@link WorkflowMM.SendMsgTask#getNextTask <em>Next Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Task</em>' reference.
	 * @see #getNextTask()
	 * @generated
	 */
	void setNextTask(Task value);

} // SendMsgTask
