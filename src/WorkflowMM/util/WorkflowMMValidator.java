/**
 */
package WorkflowMM.util;

import WorkflowMM.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see WorkflowMM.WorkflowMMPackage
 * @generated
 */
public class WorkflowMMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WorkflowMMValidator INSTANCE = new WorkflowMMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "WorkflowMM";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowMMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WorkflowMMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WorkflowMMPackage.WORKFLOW:
				return validateWorkflow((Workflow)value, diagnostics, context);
			case WorkflowMMPackage.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case WorkflowMMPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case WorkflowMMPackage.USER_TASK:
				return validateUserTask((UserTask)value, diagnostics, context);
			case WorkflowMMPackage.SERVICE_TASK:
				return validateServiceTask((ServiceTask)value, diagnostics, context);
			case WorkflowMMPackage.SEND_MSG_TASK:
				return validateSendMsgTask((SendMsgTask)value, diagnostics, context);
			case WorkflowMMPackage.RECEIVE_MSG_TASK:
				return validateReceiveMsgTask((ReceiveMsgTask)value, diagnostics, context);
			case WorkflowMMPackage.INFORMATION:
				return validateInformation((Information)value, diagnostics, context);
			case WorkflowMMPackage.OPTION:
				return validateOption((Option)value, diagnostics, context);
			case WorkflowMMPackage.FILE:
				return validateFile((File)value, diagnostics, context);
			case WorkflowMMPackage.BEGIN:
				return validateBegin((Begin)value, diagnostics, context);
			case WorkflowMMPackage.END:
				return validateEnd((End)value, diagnostics, context);
			case WorkflowMMPackage.ST_PRINT_DOCUMENT:
				return validateST_PrintDocument((ST_PrintDocument)value, diagnostics, context);
			case WorkflowMMPackage.ST_SIGN_DOCUMENT:
				return validateST_SignDocument((ST_SignDocument)value, diagnostics, context);
			case WorkflowMMPackage.ST_VALIDATE_DATA:
				return validateST_ValidateData((ST_ValidateData)value, diagnostics, context);
			case WorkflowMMPackage.ST_MAKE_CALCULATION:
				return validateST_MakeCalculation((ST_MakeCalculation)value, diagnostics, context);
			case WorkflowMMPackage.ST_EXTERNAL_SERVICE:
				return validateST_ExternalService((ST_ExternalService)value, diagnostics, context);
			case WorkflowMMPackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case WorkflowMMPackage.TYPE_OF_DATA:
				return validateTypeOfData((TypeOfData)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workflow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_OnlyOneBeginTag(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_OnlyOneEndTag(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_TaskIdMustBeUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_DataIdMustBeUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_OptionIdMustBeUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_FileIdMustBeUnique(workflow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyOneBeginTag constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__ONLY_ONE_BEGIN_TAG__EEXPRESSION = "\n" +
		"\t\t\tself.actors.tasks->select(T:Task| T.oclIsTypeOf(Begin))->size()=1";

	/**
	 * Validates the OnlyOneBeginTag constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_OnlyOneBeginTag(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnlyOneBeginTag",
				 WORKFLOW__ONLY_ONE_BEGIN_TAG__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OnlyOneEndTag constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__ONLY_ONE_END_TAG__EEXPRESSION = "\n" +
		"\t\t\tself.actors.tasks->select(T:Task| T.oclIsTypeOf(End))->size()=1";

	/**
	 * Validates the OnlyOneEndTag constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_OnlyOneEndTag(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnlyOneEndTag",
				 WORKFLOW__ONLY_ONE_END_TAG__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TaskIdMustBeUnique constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__TASK_ID_MUST_BE_UNIQUE__EEXPRESSION = "\n" +
		"\t\t\tself.actors.tasks->forAll(t1, t2 : Task | t1<>t2 implies t1.id<>t2.id)";

	/**
	 * Validates the TaskIdMustBeUnique constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_TaskIdMustBeUnique(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TaskIdMustBeUnique",
				 WORKFLOW__TASK_ID_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DataIdMustBeUnique constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__DATA_ID_MUST_BE_UNIQUE__EEXPRESSION = "\n" +
		"\t\t\tself.actors.informations.datas->forAll(d1, d2 : Data | d1<>d2 implies d1.id<>d2.id)";

	/**
	 * Validates the DataIdMustBeUnique constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_DataIdMustBeUnique(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DataIdMustBeUnique",
				 WORKFLOW__DATA_ID_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OptionIdMustBeUnique constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__OPTION_ID_MUST_BE_UNIQUE__EEXPRESSION = "\n" +
		"\t\t\tself.actors.informations.options->forAll(o1, o2 : Option | o1<>o2 implies o1.id<>o2.id)";

	/**
	 * Validates the OptionIdMustBeUnique constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_OptionIdMustBeUnique(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OptionIdMustBeUnique",
				 WORKFLOW__OPTION_ID_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the FileIdMustBeUnique constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__FILE_ID_MUST_BE_UNIQUE__EEXPRESSION = "\n" +
		"\t\t\tself.actors.informations.files->forAll(f1, f2 : File | f1<>f2 implies f1.id<>f2.id)";

	/**
	 * Validates the FileIdMustBeUnique constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_FileIdMustBeUnique(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FileIdMustBeUnique",
				 WORKFLOW__FILE_ID_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(task, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TaskMustBeLinkedToTheSameActor constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__TASK_MUST_BE_LINKED_TO_THE_SAME_ACTOR__EEXPRESSION = "\n" +
		"\t\t\tnot self.oclIsTypeOf(SendMsgTask) and not self.oclIsTypeOf(ReceiveMsgTask) and not self.oclIsTypeOf(End) implies self.oclContainer = self.linkedTo.oclContainer";

	/**
	 * Validates the TaskMustBeLinkedToTheSameActor constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_TaskMustBeLinkedToTheSameActor(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TaskMustBeLinkedToTheSameActor",
				 TASK__TASK_MUST_BE_LINKED_TO_THE_SAME_ACTOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserTask(UserTask userTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(userTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateUserTask_TaskMustBeLinkedFromATask(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateUserTask_TaskMustBeLinkedToATask(userTask, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TaskMustBeLinkedFromATask constraint of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String USER_TASK__TASK_MUST_BE_LINKED_FROM_ATASK__EEXPRESSION = "\n" +
		"\t\t\tself.linkedFrom->size()=1";

	/**
	 * Validates the TaskMustBeLinkedFromATask constraint of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserTask_TaskMustBeLinkedFromATask(UserTask userTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.USER_TASK,
				 userTask,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TaskMustBeLinkedFromATask",
				 USER_TASK__TASK_MUST_BE_LINKED_FROM_ATASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TaskMustBeLinkedToATask constraint of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String USER_TASK__TASK_MUST_BE_LINKED_TO_ATASK__EEXPRESSION = "\n" +
		"\t\t\tself.linkedTo->size()=1";

	/**
	 * Validates the TaskMustBeLinkedToATask constraint of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserTask_TaskMustBeLinkedToATask(UserTask userTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.USER_TASK,
				 userTask,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TaskMustBeLinkedToATask",
				 USER_TASK__TASK_MUST_BE_LINKED_TO_ATASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceTask(ServiceTask serviceTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedFromATask(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedToATask(serviceTask, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TaskMustBeLinkedFromATask constraint of '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_TASK__TASK_MUST_BE_LINKED_FROM_ATASK__EEXPRESSION = "\n" +
		"\t\t\tself.linkedFrom->size()=1";

	/**
	 * Validates the TaskMustBeLinkedFromATask constraint of '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceTask_TaskMustBeLinkedFromATask(ServiceTask serviceTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.SERVICE_TASK,
				 serviceTask,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TaskMustBeLinkedFromATask",
				 SERVICE_TASK__TASK_MUST_BE_LINKED_FROM_ATASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TaskMustBeLinkedToATask constraint of '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_TASK__TASK_MUST_BE_LINKED_TO_ATASK__EEXPRESSION = "\n" +
		"\t\t\tself.linkedTo->size()=1";

	/**
	 * Validates the TaskMustBeLinkedToATask constraint of '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceTask_TaskMustBeLinkedToATask(ServiceTask serviceTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.SERVICE_TASK,
				 serviceTask,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TaskMustBeLinkedToATask",
				 SERVICE_TASK__TASK_MUST_BE_LINKED_TO_ATASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendMsgTask(SendMsgTask sendMsgTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sendMsgTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sendMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sendMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sendMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sendMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sendMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(sendMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateSendMsgTask_SendMsgTaskAndReceiveMsgTaskMustBelongToDifferentUsers(sendMsgTask, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SendMsgTaskAndReceiveMsgTaskMustBelongToDifferentUsers constraint of '<em>Send Msg Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEND_MSG_TASK__SEND_MSG_TASK_AND_RECEIVE_MSG_TASK_MUST_BELONG_TO_DIFFERENT_USERS__EEXPRESSION = "\n" +
		"\t\t\tself.oclContainer<>self.destination.oclContainer";

	/**
	 * Validates the SendMsgTaskAndReceiveMsgTaskMustBelongToDifferentUsers constraint of '<em>Send Msg Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendMsgTask_SendMsgTaskAndReceiveMsgTaskMustBelongToDifferentUsers(SendMsgTask sendMsgTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowMMPackage.Literals.SEND_MSG_TASK,
				 sendMsgTask,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SendMsgTaskAndReceiveMsgTaskMustBelongToDifferentUsers",
				 SEND_MSG_TASK__SEND_MSG_TASK_AND_RECEIVE_MSG_TASK_MUST_BELONG_TO_DIFFERENT_USERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceiveMsgTask(ReceiveMsgTask receiveMsgTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(receiveMsgTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(receiveMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(receiveMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(receiveMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(receiveMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(receiveMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(receiveMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(receiveMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(receiveMsgTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(receiveMsgTask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformation(Information information, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(information, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOption(Option option, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(option, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile(File file, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(file, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBegin(Begin begin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(begin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(begin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(begin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(begin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(begin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(begin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(begin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(begin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(begin, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(begin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnd(End end, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(end, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(end, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(end, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateST_PrintDocument(ST_PrintDocument sT_PrintDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sT_PrintDocument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sT_PrintDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sT_PrintDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sT_PrintDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sT_PrintDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sT_PrintDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sT_PrintDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sT_PrintDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sT_PrintDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(sT_PrintDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedFromATask(sT_PrintDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedToATask(sT_PrintDocument, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateST_SignDocument(ST_SignDocument sT_SignDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sT_SignDocument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sT_SignDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sT_SignDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sT_SignDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sT_SignDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sT_SignDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sT_SignDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sT_SignDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sT_SignDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(sT_SignDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedFromATask(sT_SignDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedToATask(sT_SignDocument, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateST_ValidateData(ST_ValidateData sT_ValidateData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sT_ValidateData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sT_ValidateData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sT_ValidateData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sT_ValidateData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sT_ValidateData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sT_ValidateData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sT_ValidateData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sT_ValidateData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sT_ValidateData, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(sT_ValidateData, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedFromATask(sT_ValidateData, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedToATask(sT_ValidateData, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateST_MakeCalculation(ST_MakeCalculation sT_MakeCalculation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sT_MakeCalculation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sT_MakeCalculation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sT_MakeCalculation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sT_MakeCalculation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sT_MakeCalculation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sT_MakeCalculation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sT_MakeCalculation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sT_MakeCalculation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sT_MakeCalculation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(sT_MakeCalculation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedFromATask(sT_MakeCalculation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedToATask(sT_MakeCalculation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateST_ExternalService(ST_ExternalService sT_ExternalService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sT_ExternalService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sT_ExternalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sT_ExternalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sT_ExternalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sT_ExternalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sT_ExternalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sT_ExternalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sT_ExternalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sT_ExternalService, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TaskMustBeLinkedToTheSameActor(sT_ExternalService, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedFromATask(sT_ExternalService, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_TaskMustBeLinkedToATask(sT_ExternalService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfData(TypeOfData typeOfData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WorkflowMMValidator
