/**
 */
package WorkflowMM.impl;

import WorkflowMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowMMFactoryImpl extends EFactoryImpl implements WorkflowMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkflowMMFactory init() {
		try {
			WorkflowMMFactory theWorkflowMMFactory = (WorkflowMMFactory)EPackage.Registry.INSTANCE.getEFactory(WorkflowMMPackage.eNS_URI);
			if (theWorkflowMMFactory != null) {
				return theWorkflowMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkflowMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WorkflowMMPackage.WORKFLOW: return createWorkflow();
			case WorkflowMMPackage.ACTOR: return createActor();
			case WorkflowMMPackage.USER_TASK: return createUserTask();
			case WorkflowMMPackage.SERVICE_TASK: return createServiceTask();
			case WorkflowMMPackage.SEND_MSG_TASK: return createSendMsgTask();
			case WorkflowMMPackage.RECEIVE_MSG_TASK: return createReceiveMsgTask();
			case WorkflowMMPackage.INFORMATION: return createInformation();
			case WorkflowMMPackage.OPTION: return createOption();
			case WorkflowMMPackage.FILE: return createFile();
			case WorkflowMMPackage.BEGIN: return createBegin();
			case WorkflowMMPackage.END: return createEnd();
			case WorkflowMMPackage.ST_PRINT_DOCUMENT: return createST_PrintDocument();
			case WorkflowMMPackage.ST_SIGN_DOCUMENT: return createST_SignDocument();
			case WorkflowMMPackage.ST_VALIDATE_DATA: return createST_ValidateData();
			case WorkflowMMPackage.ST_MAKE_CALCULATION: return createST_MakeCalculation();
			case WorkflowMMPackage.DATA: return createData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WorkflowMMPackage.TYPE_OF_DATA:
				return createTypeOfDataFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WorkflowMMPackage.TYPE_OF_DATA:
				return convertTypeOfDataToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTask createServiceTask() {
		ServiceTaskImpl serviceTask = new ServiceTaskImpl();
		return serviceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMsgTask createSendMsgTask() {
		SendMsgTaskImpl sendMsgTask = new SendMsgTaskImpl();
		return sendMsgTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMsgTask createReceiveMsgTask() {
		ReceiveMsgTaskImpl receiveMsgTask = new ReceiveMsgTaskImpl();
		return receiveMsgTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Begin createBegin() {
		BeginImpl begin = new BeginImpl();
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST_PrintDocument createST_PrintDocument() {
		ST_PrintDocumentImpl sT_PrintDocument = new ST_PrintDocumentImpl();
		return sT_PrintDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST_SignDocument createST_SignDocument() {
		ST_SignDocumentImpl sT_SignDocument = new ST_SignDocumentImpl();
		return sT_SignDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST_ValidateData createST_ValidateData() {
		ST_ValidateDataImpl sT_ValidateData = new ST_ValidateDataImpl();
		return sT_ValidateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST_MakeCalculation createST_MakeCalculation() {
		ST_MakeCalculationImpl sT_MakeCalculation = new ST_MakeCalculationImpl();
		return sT_MakeCalculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfData createTypeOfDataFromString(EDataType eDataType, String initialValue) {
		TypeOfData result = TypeOfData.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfDataToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowMMPackage getWorkflowMMPackage() {
		return (WorkflowMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkflowMMPackage getPackage() {
		return WorkflowMMPackage.eINSTANCE;
	}

} //WorkflowMMFactoryImpl
