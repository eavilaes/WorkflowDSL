/**
 */
package WorkflowMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see WorkflowMM.WorkflowMMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface WorkflowMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WorkflowMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dmss.es/WorkflowMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "WorkflowMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowMMPackage eINSTANCE = WorkflowMM.impl.WorkflowMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.WorkflowImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ID = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ACTORS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 2;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.ActorImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TASKS = 2;

	/**
	 * The feature id for the '<em><b>Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INFORMATIONS = 3;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.TaskImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LINKED_TO = 3;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LINKED_FROM = 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.UserTaskImpl <em>User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.UserTaskImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getUserTask()
	 * @generated
	 */
	int USER_TASK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__LINKED_TO = TASK__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__LINKED_FROM = TASK__LINKED_FROM;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__REQUIRES = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.ServiceTaskImpl <em>Service Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.ServiceTaskImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getServiceTask()
	 * @generated
	 */
	int SERVICE_TASK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__LINKED_TO = TASK__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__LINKED_FROM = TASK__LINKED_FROM;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__REQUIRES = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__PRODUCES = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.SendMsgTaskImpl <em>Send Msg Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.SendMsgTaskImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getSendMsgTask()
	 * @generated
	 */
	int SEND_MSG_TASK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MSG_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MSG_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MSG_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MSG_TASK__LINKED_TO = TASK__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MSG_TASK__LINKED_FROM = TASK__LINKED_FROM;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MSG_TASK__DESTINATION = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MSG_TASK__REQUIRES = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Msg Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MSG_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Send Msg Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MSG_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.ReceiveMsgTaskImpl <em>Receive Msg Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.ReceiveMsgTaskImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getReceiveMsgTask()
	 * @generated
	 */
	int RECEIVE_MSG_TASK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MSG_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MSG_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MSG_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MSG_TASK__LINKED_TO = TASK__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MSG_TASK__LINKED_FROM = TASK__LINKED_FROM;

	/**
	 * The number of structural features of the '<em>Receive Msg Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MSG_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receive Msg Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MSG_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.InformationImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__FILES = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__DATAS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__NAME = 5;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.OptionImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__TITLE = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.FileImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ID = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.BeginImpl <em>Begin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.BeginImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getBegin()
	 * @generated
	 */
	int BEGIN = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN__LINKED_TO = TASK__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN__LINKED_FROM = TASK__LINKED_FROM;

	/**
	 * The number of structural features of the '<em>Begin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Begin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.EndImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getEnd()
	 * @generated
	 */
	int END = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LINKED_TO = TASK__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LINKED_FROM = TASK__LINKED_FROM;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.ST_PrintDocumentImpl <em>ST Print Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.ST_PrintDocumentImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getST_PrintDocument()
	 * @generated
	 */
	int ST_PRINT_DOCUMENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_PRINT_DOCUMENT__ID = SERVICE_TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_PRINT_DOCUMENT__NAME = SERVICE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_PRINT_DOCUMENT__DESCRIPTION = SERVICE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_PRINT_DOCUMENT__LINKED_TO = SERVICE_TASK__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_PRINT_DOCUMENT__LINKED_FROM = SERVICE_TASK__LINKED_FROM;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_PRINT_DOCUMENT__REQUIRES = SERVICE_TASK__REQUIRES;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_PRINT_DOCUMENT__PRODUCES = SERVICE_TASK__PRODUCES;

	/**
	 * The number of structural features of the '<em>ST Print Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_PRINT_DOCUMENT_FEATURE_COUNT = SERVICE_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ST Print Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_PRINT_DOCUMENT_OPERATION_COUNT = SERVICE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.ST_SignDocumentImpl <em>ST Sign Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.ST_SignDocumentImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getST_SignDocument()
	 * @generated
	 */
	int ST_SIGN_DOCUMENT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_SIGN_DOCUMENT__ID = SERVICE_TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_SIGN_DOCUMENT__NAME = SERVICE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_SIGN_DOCUMENT__DESCRIPTION = SERVICE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_SIGN_DOCUMENT__LINKED_TO = SERVICE_TASK__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_SIGN_DOCUMENT__LINKED_FROM = SERVICE_TASK__LINKED_FROM;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_SIGN_DOCUMENT__REQUIRES = SERVICE_TASK__REQUIRES;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_SIGN_DOCUMENT__PRODUCES = SERVICE_TASK__PRODUCES;

	/**
	 * The number of structural features of the '<em>ST Sign Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_SIGN_DOCUMENT_FEATURE_COUNT = SERVICE_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ST Sign Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_SIGN_DOCUMENT_OPERATION_COUNT = SERVICE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.ST_ValidateDataImpl <em>ST Validate Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.ST_ValidateDataImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getST_ValidateData()
	 * @generated
	 */
	int ST_VALIDATE_DATA = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_VALIDATE_DATA__ID = SERVICE_TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_VALIDATE_DATA__NAME = SERVICE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_VALIDATE_DATA__DESCRIPTION = SERVICE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_VALIDATE_DATA__LINKED_TO = SERVICE_TASK__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_VALIDATE_DATA__LINKED_FROM = SERVICE_TASK__LINKED_FROM;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_VALIDATE_DATA__REQUIRES = SERVICE_TASK__REQUIRES;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_VALIDATE_DATA__PRODUCES = SERVICE_TASK__PRODUCES;

	/**
	 * The number of structural features of the '<em>ST Validate Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_VALIDATE_DATA_FEATURE_COUNT = SERVICE_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ST Validate Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_VALIDATE_DATA_OPERATION_COUNT = SERVICE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.ST_MakeCalculationImpl <em>ST Make Calculation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.ST_MakeCalculationImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getST_MakeCalculation()
	 * @generated
	 */
	int ST_MAKE_CALCULATION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_MAKE_CALCULATION__ID = SERVICE_TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_MAKE_CALCULATION__NAME = SERVICE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_MAKE_CALCULATION__DESCRIPTION = SERVICE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_MAKE_CALCULATION__LINKED_TO = SERVICE_TASK__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_MAKE_CALCULATION__LINKED_FROM = SERVICE_TASK__LINKED_FROM;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_MAKE_CALCULATION__REQUIRES = SERVICE_TASK__REQUIRES;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_MAKE_CALCULATION__PRODUCES = SERVICE_TASK__PRODUCES;

	/**
	 * The number of structural features of the '<em>ST Make Calculation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_MAKE_CALCULATION_FEATURE_COUNT = SERVICE_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ST Make Calculation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_MAKE_CALCULATION_OPERATION_COUNT = SERVICE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.impl.DataImpl
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getData()
	 * @generated
	 */
	int DATA = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WorkflowMM.TypeOfData <em>Type Of Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WorkflowMM.TypeOfData
	 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getTypeOfData()
	 * @generated
	 */
	int TYPE_OF_DATA = 17;


	/**
	 * Returns the meta object for class '{@link WorkflowMM.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see WorkflowMM.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Workflow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WorkflowMM.Workflow#getId()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link WorkflowMM.Workflow#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see WorkflowMM.Workflow#getActors()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Actors();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WorkflowMM.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see WorkflowMM.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Actor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WorkflowMM.Actor#getId()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Id();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WorkflowMM.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WorkflowMM.Actor#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see WorkflowMM.Actor#getTasks()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link WorkflowMM.Actor#getInformations <em>Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informations</em>'.
	 * @see WorkflowMM.Actor#getInformations()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Informations();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see WorkflowMM.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WorkflowMM.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WorkflowMM.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WorkflowMM.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the reference '{@link WorkflowMM.Task#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked To</em>'.
	 * @see WorkflowMM.Task#getLinkedTo()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_LinkedTo();

	/**
	 * Returns the meta object for the reference '{@link WorkflowMM.Task#getLinkedFrom <em>Linked From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked From</em>'.
	 * @see WorkflowMM.Task#getLinkedFrom()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_LinkedFrom();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task</em>'.
	 * @see WorkflowMM.UserTask
	 * @generated
	 */
	EClass getUserTask();

	/**
	 * Returns the meta object for the reference list '{@link WorkflowMM.UserTask#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see WorkflowMM.UserTask#getRequires()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_Requires();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.ServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Task</em>'.
	 * @see WorkflowMM.ServiceTask
	 * @generated
	 */
	EClass getServiceTask();

	/**
	 * Returns the meta object for the reference list '{@link WorkflowMM.ServiceTask#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see WorkflowMM.ServiceTask#getRequires()
	 * @see #getServiceTask()
	 * @generated
	 */
	EReference getServiceTask_Requires();

	/**
	 * Returns the meta object for the reference list '{@link WorkflowMM.ServiceTask#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produces</em>'.
	 * @see WorkflowMM.ServiceTask#getProduces()
	 * @see #getServiceTask()
	 * @generated
	 */
	EReference getServiceTask_Produces();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.SendMsgTask <em>Send Msg Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Msg Task</em>'.
	 * @see WorkflowMM.SendMsgTask
	 * @generated
	 */
	EClass getSendMsgTask();

	/**
	 * Returns the meta object for the reference '{@link WorkflowMM.SendMsgTask#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see WorkflowMM.SendMsgTask#getDestination()
	 * @see #getSendMsgTask()
	 * @generated
	 */
	EReference getSendMsgTask_Destination();

	/**
	 * Returns the meta object for the reference list '{@link WorkflowMM.SendMsgTask#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see WorkflowMM.SendMsgTask#getRequires()
	 * @see #getSendMsgTask()
	 * @generated
	 */
	EReference getSendMsgTask_Requires();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.ReceiveMsgTask <em>Receive Msg Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Msg Task</em>'.
	 * @see WorkflowMM.ReceiveMsgTask
	 * @generated
	 */
	EClass getReceiveMsgTask();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see WorkflowMM.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Information#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WorkflowMM.Information#getId()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link WorkflowMM.Information#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see WorkflowMM.Information#getOptions()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link WorkflowMM.Information#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see WorkflowMM.Information#getFiles()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Files();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Information#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see WorkflowMM.Information#getType()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link WorkflowMM.Information#getDatas <em>Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datas</em>'.
	 * @see WorkflowMM.Information#getDatas()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Datas();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Information#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WorkflowMM.Information#getName()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Name();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see WorkflowMM.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Option#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WorkflowMM.Option#getId()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Id();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Option#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see WorkflowMM.Option#getTitle()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Title();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see WorkflowMM.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.File#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WorkflowMM.File#getId()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Id();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see WorkflowMM.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.Begin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Begin</em>'.
	 * @see WorkflowMM.Begin
	 * @generated
	 */
	EClass getBegin();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see WorkflowMM.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.ST_PrintDocument <em>ST Print Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ST Print Document</em>'.
	 * @see WorkflowMM.ST_PrintDocument
	 * @generated
	 */
	EClass getST_PrintDocument();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.ST_SignDocument <em>ST Sign Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ST Sign Document</em>'.
	 * @see WorkflowMM.ST_SignDocument
	 * @generated
	 */
	EClass getST_SignDocument();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.ST_ValidateData <em>ST Validate Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ST Validate Data</em>'.
	 * @see WorkflowMM.ST_ValidateData
	 * @generated
	 */
	EClass getST_ValidateData();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.ST_MakeCalculation <em>ST Make Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ST Make Calculation</em>'.
	 * @see WorkflowMM.ST_MakeCalculation
	 * @generated
	 */
	EClass getST_MakeCalculation();

	/**
	 * Returns the meta object for class '{@link WorkflowMM.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see WorkflowMM.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Data#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WorkflowMM.Data#getId()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Id();

	/**
	 * Returns the meta object for the attribute '{@link WorkflowMM.Data#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see WorkflowMM.Data#getText()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Text();

	/**
	 * Returns the meta object for enum '{@link WorkflowMM.TypeOfData <em>Type Of Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Of Data</em>'.
	 * @see WorkflowMM.TypeOfData
	 * @generated
	 */
	EEnum getTypeOfData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowMMFactory getWorkflowMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.WorkflowImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__ID = eINSTANCE.getWorkflow_Id();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ACTORS = eINSTANCE.getWorkflow_Actors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.ActorImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ID = eINSTANCE.getActor_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__TASKS = eINSTANCE.getActor_Tasks();

		/**
		 * The meta object literal for the '<em><b>Informations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__INFORMATIONS = eINSTANCE.getActor_Informations();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.TaskImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Linked To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__LINKED_TO = eINSTANCE.getTask_LinkedTo();

		/**
		 * The meta object literal for the '<em><b>Linked From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__LINKED_FROM = eINSTANCE.getTask_LinkedFrom();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.UserTaskImpl <em>User Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.UserTaskImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getUserTask()
		 * @generated
		 */
		EClass USER_TASK = eINSTANCE.getUserTask();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK__REQUIRES = eINSTANCE.getUserTask_Requires();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.ServiceTaskImpl <em>Service Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.ServiceTaskImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getServiceTask()
		 * @generated
		 */
		EClass SERVICE_TASK = eINSTANCE.getServiceTask();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TASK__REQUIRES = eINSTANCE.getServiceTask_Requires();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TASK__PRODUCES = eINSTANCE.getServiceTask_Produces();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.SendMsgTaskImpl <em>Send Msg Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.SendMsgTaskImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getSendMsgTask()
		 * @generated
		 */
		EClass SEND_MSG_TASK = eINSTANCE.getSendMsgTask();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MSG_TASK__DESTINATION = eINSTANCE.getSendMsgTask_Destination();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MSG_TASK__REQUIRES = eINSTANCE.getSendMsgTask_Requires();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.ReceiveMsgTaskImpl <em>Receive Msg Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.ReceiveMsgTaskImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getReceiveMsgTask()
		 * @generated
		 */
		EClass RECEIVE_MSG_TASK = eINSTANCE.getReceiveMsgTask();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.InformationImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__ID = eINSTANCE.getInformation_Id();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__OPTIONS = eINSTANCE.getInformation_Options();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__FILES = eINSTANCE.getInformation_Files();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__TYPE = eINSTANCE.getInformation_Type();

		/**
		 * The meta object literal for the '<em><b>Datas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__DATAS = eINSTANCE.getInformation_Datas();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__NAME = eINSTANCE.getInformation_Name();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.OptionImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__ID = eINSTANCE.getOption_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__TITLE = eINSTANCE.getOption_Title();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.FileImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__ID = eINSTANCE.getFile_Id();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PATH = eINSTANCE.getFile_Path();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.BeginImpl <em>Begin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.BeginImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getBegin()
		 * @generated
		 */
		EClass BEGIN = eINSTANCE.getBegin();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.EndImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.ST_PrintDocumentImpl <em>ST Print Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.ST_PrintDocumentImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getST_PrintDocument()
		 * @generated
		 */
		EClass ST_PRINT_DOCUMENT = eINSTANCE.getST_PrintDocument();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.ST_SignDocumentImpl <em>ST Sign Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.ST_SignDocumentImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getST_SignDocument()
		 * @generated
		 */
		EClass ST_SIGN_DOCUMENT = eINSTANCE.getST_SignDocument();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.ST_ValidateDataImpl <em>ST Validate Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.ST_ValidateDataImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getST_ValidateData()
		 * @generated
		 */
		EClass ST_VALIDATE_DATA = eINSTANCE.getST_ValidateData();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.ST_MakeCalculationImpl <em>ST Make Calculation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.ST_MakeCalculationImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getST_MakeCalculation()
		 * @generated
		 */
		EClass ST_MAKE_CALCULATION = eINSTANCE.getST_MakeCalculation();

		/**
		 * The meta object literal for the '{@link WorkflowMM.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.impl.DataImpl
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__ID = eINSTANCE.getData_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__TEXT = eINSTANCE.getData_Text();

		/**
		 * The meta object literal for the '{@link WorkflowMM.TypeOfData <em>Type Of Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WorkflowMM.TypeOfData
		 * @see WorkflowMM.impl.WorkflowMMPackageImpl#getTypeOfData()
		 * @generated
		 */
		EEnum TYPE_OF_DATA = eINSTANCE.getTypeOfData();

	}

} //WorkflowMMPackage
