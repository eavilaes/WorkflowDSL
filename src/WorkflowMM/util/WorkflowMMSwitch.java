/**
 */
package WorkflowMM.util;

import WorkflowMM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see WorkflowMM.WorkflowMMPackage
 * @generated
 */
public class WorkflowMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkflowMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowMMSwitch() {
		if (modelPackage == null) {
			modelPackage = WorkflowMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WorkflowMMPackage.WORKFLOW: {
				Workflow workflow = (Workflow)theEObject;
				T result = caseWorkflow(workflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.USER_TASK: {
				UserTask userTask = (UserTask)theEObject;
				T result = caseUserTask(userTask);
				if (result == null) result = caseTask(userTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.SERVICE_TASK: {
				ServiceTask serviceTask = (ServiceTask)theEObject;
				T result = caseServiceTask(serviceTask);
				if (result == null) result = caseTask(serviceTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.SEND_MSG_TASK: {
				SendMsgTask sendMsgTask = (SendMsgTask)theEObject;
				T result = caseSendMsgTask(sendMsgTask);
				if (result == null) result = caseTask(sendMsgTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.RECEIVE_MSG_TASK: {
				ReceiveMsgTask receiveMsgTask = (ReceiveMsgTask)theEObject;
				T result = caseReceiveMsgTask(receiveMsgTask);
				if (result == null) result = caseTask(receiveMsgTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.INFORMATION: {
				Information information = (Information)theEObject;
				T result = caseInformation(information);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.BEGIN: {
				Begin begin = (Begin)theEObject;
				T result = caseBegin(begin);
				if (result == null) result = caseTask(begin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseTask(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.ST_PRINT_DOCUMENT: {
				ST_PrintDocument sT_PrintDocument = (ST_PrintDocument)theEObject;
				T result = caseST_PrintDocument(sT_PrintDocument);
				if (result == null) result = caseServiceTask(sT_PrintDocument);
				if (result == null) result = caseTask(sT_PrintDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.ST_SIGN_DOCUMENT: {
				ST_SignDocument sT_SignDocument = (ST_SignDocument)theEObject;
				T result = caseST_SignDocument(sT_SignDocument);
				if (result == null) result = caseServiceTask(sT_SignDocument);
				if (result == null) result = caseTask(sT_SignDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.ST_VALIDATE_DATA: {
				ST_ValidateData sT_ValidateData = (ST_ValidateData)theEObject;
				T result = caseST_ValidateData(sT_ValidateData);
				if (result == null) result = caseServiceTask(sT_ValidateData);
				if (result == null) result = caseTask(sT_ValidateData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.ST_MAKE_CALCULATION: {
				ST_MakeCalculation sT_MakeCalculation = (ST_MakeCalculation)theEObject;
				T result = caseST_MakeCalculation(sT_MakeCalculation);
				if (result == null) result = caseServiceTask(sT_MakeCalculation);
				if (result == null) result = caseTask(sT_MakeCalculation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowMMPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow(Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTask(UserTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTask(ServiceTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Msg Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Msg Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendMsgTask(SendMsgTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Msg Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Msg Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveMsgTask(ReceiveMsgTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformation(Information object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBegin(Begin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ST Print Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ST Print Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseST_PrintDocument(ST_PrintDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ST Sign Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ST Sign Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseST_SignDocument(ST_SignDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ST Validate Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ST Validate Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseST_ValidateData(ST_ValidateData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ST Make Calculation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ST Make Calculation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseST_MakeCalculation(ST_MakeCalculation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WorkflowMMSwitch
