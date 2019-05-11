/**
 */
package WorkflowMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see WorkflowMM.WorkflowMMPackage
 * @generated
 */
public interface WorkflowMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowMMFactory eINSTANCE = WorkflowMM.impl.WorkflowMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task</em>'.
	 * @generated
	 */
	UserTask createUserTask();

	/**
	 * Returns a new object of class '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Task</em>'.
	 * @generated
	 */
	ServiceTask createServiceTask();

	/**
	 * Returns a new object of class '<em>Send Msg Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Msg Task</em>'.
	 * @generated
	 */
	SendMsgTask createSendMsgTask();

	/**
	 * Returns a new object of class '<em>Receive Msg Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Msg Task</em>'.
	 * @generated
	 */
	ReceiveMsgTask createReceiveMsgTask();

	/**
	 * Returns a new object of class '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information</em>'.
	 * @generated
	 */
	Information createInformation();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Begin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Begin</em>'.
	 * @generated
	 */
	Begin createBegin();

	/**
	 * Returns a new object of class '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End</em>'.
	 * @generated
	 */
	End createEnd();

	/**
	 * Returns a new object of class '<em>ST Print Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ST Print Document</em>'.
	 * @generated
	 */
	ST_PrintDocument createST_PrintDocument();

	/**
	 * Returns a new object of class '<em>ST Sign Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ST Sign Document</em>'.
	 * @generated
	 */
	ST_SignDocument createST_SignDocument();

	/**
	 * Returns a new object of class '<em>ST Validate Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ST Validate Data</em>'.
	 * @generated
	 */
	ST_ValidateData createST_ValidateData();

	/**
	 * Returns a new object of class '<em>ST Make Calculation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ST Make Calculation</em>'.
	 * @generated
	 */
	ST_MakeCalculation createST_MakeCalculation();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkflowMMPackage getWorkflowMMPackage();

} //WorkflowMMFactory
