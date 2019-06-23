/**
 */
package WorkflowMM.impl;

import WorkflowMM.Actor;
import WorkflowMM.Begin;
import WorkflowMM.Data;
import WorkflowMM.End;
import WorkflowMM.File;
import WorkflowMM.Information;
import WorkflowMM.Option;
import WorkflowMM.ReceiveMsgTask;
import WorkflowMM.ST_ExternalService;
import WorkflowMM.ST_MakeCalculation;
import WorkflowMM.ST_PrintDocument;
import WorkflowMM.ST_SignDocument;
import WorkflowMM.ST_ValidateData;
import WorkflowMM.SendMsgTask;
import WorkflowMM.ServiceTask;
import WorkflowMM.Task;
import WorkflowMM.TypeOfData;
import WorkflowMM.UserTask;
import WorkflowMM.Workflow;
import WorkflowMM.WorkflowMMFactory;
import WorkflowMM.WorkflowMMPackage;

import WorkflowMM.util.WorkflowMMValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowMMPackageImpl extends EPackageImpl implements WorkflowMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendMsgTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveMsgTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sT_PrintDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sT_SignDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sT_ValidateDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sT_MakeCalculationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sT_ExternalServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeOfDataEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see WorkflowMM.WorkflowMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkflowMMPackageImpl() {
		super(eNS_URI, WorkflowMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WorkflowMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkflowMMPackage init() {
		if (isInited) return (WorkflowMMPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowMMPackage.eNS_URI);

		// Obtain or create and register package
		WorkflowMMPackageImpl theWorkflowMMPackage = (WorkflowMMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkflowMMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkflowMMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWorkflowMMPackage.createPackageContents();

		// Initialize created meta-data
		theWorkflowMMPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWorkflowMMPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WorkflowMMValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWorkflowMMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkflowMMPackage.eNS_URI, theWorkflowMMPackage);
		return theWorkflowMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Actors() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Id() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Name() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Tasks() {
		return (EReference)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Informations() {
		return (EReference)actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Id() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_LinkedTo() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_LinkedFrom() {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTask() {
		return userTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_Requires() {
		return (EReference)userTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTask() {
		return serviceTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTask_Requires() {
		return (EReference)serviceTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTask_Produces() {
		return (EReference)serviceTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendMsgTask() {
		return sendMsgTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMsgTask_Destination() {
		return (EReference)sendMsgTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMsgTask_Requires() {
		return (EReference)sendMsgTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMsgTask_NextTask() {
		return (EReference)sendMsgTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveMsgTask() {
		return receiveMsgTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformation() {
		return informationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Id() {
		return (EAttribute)informationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformation_Options() {
		return (EReference)informationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformation_Files() {
		return (EReference)informationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Type() {
		return (EAttribute)informationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformation_Datas() {
		return (EReference)informationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Name() {
		return (EAttribute)informationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Multiple() {
		return (EAttribute)informationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Id() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Title() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Selected() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Id() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Path() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Title() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBegin() {
		return beginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getST_PrintDocument() {
		return sT_PrintDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getST_SignDocument() {
		return sT_SignDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getST_ValidateData() {
		return sT_ValidateDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getST_MakeCalculation() {
		return sT_MakeCalculationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getST_ExternalService() {
		return sT_ExternalServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Id() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Text() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Name() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeOfData() {
		return typeOfDataEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowMMFactory getWorkflowMMFactory() {
		return (WorkflowMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workflowEClass = createEClass(WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__ACTORS);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__ID);
		createEAttribute(actorEClass, ACTOR__NAME);
		createEReference(actorEClass, ACTOR__TASKS);
		createEReference(actorEClass, ACTOR__INFORMATIONS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__ID);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEReference(taskEClass, TASK__LINKED_TO);
		createEReference(taskEClass, TASK__LINKED_FROM);

		userTaskEClass = createEClass(USER_TASK);
		createEReference(userTaskEClass, USER_TASK__REQUIRES);

		serviceTaskEClass = createEClass(SERVICE_TASK);
		createEReference(serviceTaskEClass, SERVICE_TASK__REQUIRES);
		createEReference(serviceTaskEClass, SERVICE_TASK__PRODUCES);

		sendMsgTaskEClass = createEClass(SEND_MSG_TASK);
		createEReference(sendMsgTaskEClass, SEND_MSG_TASK__DESTINATION);
		createEReference(sendMsgTaskEClass, SEND_MSG_TASK__REQUIRES);
		createEReference(sendMsgTaskEClass, SEND_MSG_TASK__NEXT_TASK);

		receiveMsgTaskEClass = createEClass(RECEIVE_MSG_TASK);

		informationEClass = createEClass(INFORMATION);
		createEAttribute(informationEClass, INFORMATION__ID);
		createEReference(informationEClass, INFORMATION__OPTIONS);
		createEReference(informationEClass, INFORMATION__FILES);
		createEAttribute(informationEClass, INFORMATION__TYPE);
		createEReference(informationEClass, INFORMATION__DATAS);
		createEAttribute(informationEClass, INFORMATION__NAME);
		createEAttribute(informationEClass, INFORMATION__MULTIPLE);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__ID);
		createEAttribute(optionEClass, OPTION__TITLE);
		createEAttribute(optionEClass, OPTION__SELECTED);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__ID);
		createEAttribute(fileEClass, FILE__PATH);
		createEAttribute(fileEClass, FILE__TITLE);

		beginEClass = createEClass(BEGIN);

		endEClass = createEClass(END);

		sT_PrintDocumentEClass = createEClass(ST_PRINT_DOCUMENT);

		sT_SignDocumentEClass = createEClass(ST_SIGN_DOCUMENT);

		sT_ValidateDataEClass = createEClass(ST_VALIDATE_DATA);

		sT_MakeCalculationEClass = createEClass(ST_MAKE_CALCULATION);

		sT_ExternalServiceEClass = createEClass(ST_EXTERNAL_SERVICE);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__ID);
		createEAttribute(dataEClass, DATA__TEXT);
		createEAttribute(dataEClass, DATA__NAME);

		// Create enums
		typeOfDataEEnum = createEEnum(TYPE_OF_DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		userTaskEClass.getESuperTypes().add(this.getTask());
		serviceTaskEClass.getESuperTypes().add(this.getTask());
		sendMsgTaskEClass.getESuperTypes().add(this.getTask());
		receiveMsgTaskEClass.getESuperTypes().add(this.getTask());
		beginEClass.getESuperTypes().add(this.getTask());
		endEClass.getESuperTypes().add(this.getTask());
		sT_PrintDocumentEClass.getESuperTypes().add(this.getServiceTask());
		sT_SignDocumentEClass.getESuperTypes().add(this.getServiceTask());
		sT_ValidateDataEClass.getESuperTypes().add(this.getServiceTask());
		sT_MakeCalculationEClass.getESuperTypes().add(this.getServiceTask());
		sT_ExternalServiceEClass.getESuperTypes().add(this.getServiceTask());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflow_Actors(), this.getActor(), null, "actors", null, 1, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Id(), ecorePackage.getEString(), "id", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Name(), ecorePackage.getEString(), "name", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Tasks(), this.getTask(), null, "tasks", null, 1, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Informations(), this.getInformation(), null, "informations", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Id(), ecorePackage.getEString(), "id", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_LinkedTo(), this.getTask(), this.getTask_LinkedFrom(), "linkedTo", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_LinkedFrom(), this.getTask(), this.getTask_LinkedTo(), "linkedFrom", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTaskEClass, UserTask.class, "UserTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserTask_Requires(), this.getInformation(), null, "requires", null, 1, -1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTaskEClass, ServiceTask.class, "ServiceTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceTask_Requires(), this.getInformation(), null, "requires", null, 1, -1, ServiceTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTask_Produces(), this.getInformation(), null, "produces", null, 1, -1, ServiceTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendMsgTaskEClass, SendMsgTask.class, "SendMsgTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendMsgTask_Destination(), this.getReceiveMsgTask(), null, "destination", null, 1, 1, SendMsgTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendMsgTask_Requires(), this.getInformation(), null, "requires", null, 0, -1, SendMsgTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendMsgTask_NextTask(), this.getTask(), null, "nextTask", null, 1, 1, SendMsgTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiveMsgTaskEClass, ReceiveMsgTask.class, "ReceiveMsgTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informationEClass, Information.class, "Information", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformation_Id(), ecorePackage.getEString(), "id", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformation_Options(), this.getOption(), null, "options", null, 0, -1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformation_Files(), this.getFile(), null, "files", null, 0, -1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformation_Type(), this.getTypeOfData(), "type", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformation_Datas(), this.getData(), null, "datas", null, 0, -1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformation_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Id(), ecorePackage.getEString(), "id", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Title(), ecorePackage.getEString(), "title", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Id(), ecorePackage.getEString(), "id", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Path(), ecorePackage.getEString(), "path", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Title(), ecorePackage.getEString(), "title", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beginEClass, Begin.class, "Begin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sT_PrintDocumentEClass, ST_PrintDocument.class, "ST_PrintDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sT_SignDocumentEClass, ST_SignDocument.class, "ST_SignDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sT_ValidateDataEClass, ST_ValidateData.class, "ST_ValidateData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sT_MakeCalculationEClass, ST_MakeCalculation.class, "ST_MakeCalculation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sT_ExternalServiceEClass, ST_ExternalService.class, "ST_ExternalService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Id(), ecorePackage.getEString(), "id", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Text(), ecorePackage.getEString(), "text", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Name(), ecorePackage.getEString(), "name", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeOfDataEEnum, TypeOfData.class, "TypeOfData");
		addEEnumLiteral(typeOfDataEEnum, TypeOfData.FILL_FORM);
		addEEnumLiteral(typeOfDataEEnum, TypeOfData.SELECT_OPTIONS);
		addEEnumLiteral(typeOfDataEEnum, TypeOfData.UPLOAD_FILES);
		addEEnumLiteral(typeOfDataEEnum, TypeOfData.TEXT);
		addEEnumLiteral(typeOfDataEEnum, TypeOfData.FILE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.label
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
		// gmf.link
		createGmf_5Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnlyOneBeginTag OnlyOneEndTag TaskIdMustBeUnique DataIdMustBeUnique OptionIdMustBeUnique FileIdMustBeUnique"
		   });	
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "constraints", "TaskMustBeLinkedToTheSameActor"
		   });	
		addAnnotation
		  (userTaskEClass, 
		   source, 
		   new String[] {
			 "constraints", "TaskMustBeLinkedFromATask TaskMustBeLinkedToATask"
		   });	
		addAnnotation
		  (serviceTaskEClass, 
		   source, 
		   new String[] {
			 "constraints", "TaskMustBeLinkedFromATask TaskMustBeLinkedToATask"
		   });	
		addAnnotation
		  (sendMsgTaskEClass, 
		   source, 
		   new String[] {
			 "constraints", "SendMsgTaskAndReceiveMsgTaskMustBelongToDifferentUsers"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "OnlyOneBeginTag", "\n\t\t\tself.actors.tasks->select(T:Task| T.oclIsTypeOf(Begin))->size()=1",
			 "OnlyOneEndTag", "\n\t\t\tself.actors.tasks->select(T:Task| T.oclIsTypeOf(End))->size()=1",
			 "TaskIdMustBeUnique", "\n\t\t\tself.actors.tasks->forAll(t1, t2 : Task | t1<>t2 implies t1.id<>t2.id)",
			 "DataIdMustBeUnique", "\n\t\t\tself.actors.informations.datas->forAll(d1, d2 : Data | d1<>d2 implies d1.id<>d2.id)",
			 "OptionIdMustBeUnique", "\n\t\t\tself.actors.informations.options->forAll(o1, o2 : Option | o1<>o2 implies o1.id<>o2.id)",
			 "FileIdMustBeUnique", "\n\t\t\tself.actors.informations.files->forAll(f1, f2 : File | f1<>f2 implies f1.id<>f2.id)"
		   });	
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "TaskMustBeLinkedToTheSameActor", "\n\t\t\tnot self.oclIsTypeOf(SendMsgTask) and not self.oclIsTypeOf(ReceiveMsgTask) and not self.oclIsTypeOf(End) implies self.oclContainer = self.linkedTo.oclContainer"
		   });	
		addAnnotation
		  (userTaskEClass, 
		   source, 
		   new String[] {
			 "TaskMustBeLinkedFromATask", "\n\t\t\tself.linkedFrom->size()=1",
			 "TaskMustBeLinkedToATask", "\n\t\t\tself.linkedTo->size()=1"
		   });	
		addAnnotation
		  (serviceTaskEClass, 
		   source, 
		   new String[] {
			 "TaskMustBeLinkedFromATask", "\n\t\t\tself.linkedFrom->size()=1",
			 "TaskMustBeLinkedToATask", "\n\t\t\tself.linkedTo->size()=1"
		   });	
		addAnnotation
		  (sendMsgTaskEClass, 
		   source, 
		   new String[] {
			 "SendMsgTaskAndReceiveMsgTaskMustBelongToDifferentUsers", "\n\t\t\tself.oclContainer<>self.destination.oclContainer"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "color", "200,200,200"
		   });	
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "color", "255,255,255"
		   });	
		addAnnotation
		  (informationEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "color", "150,200,255"
		   });	
		addAnnotation
		  (optionEClass, 
		   source, 
		   new String[] {
			 "label", "title",
			 "label.icon", "false",
			 "color", "100,150,200"
		   });	
		addAnnotation
		  (fileEClass, 
		   source, 
		   new String[] {
			 "label", "title",
			 "label.icon", "false",
			 "color", "100,150,200"
		   });	
		addAnnotation
		  (beginEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "color", "50,250,50"
		   });	
		addAnnotation
		  (endEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "color", "250,50,50"
		   });	
		addAnnotation
		  (dataEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "color", "100,150,200"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.label</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.label";	
		addAnnotation
		  (getActor_Id(), 
		   source, 
		   new String[] {
			 "label.pattern", "id: {0}"
		   });	
		addAnnotation
		  (getTask_Id(), 
		   source, 
		   new String[] {
			 "label.pattern", "id: {0}"
		   });	
		addAnnotation
		  (getTask_Description(), 
		   source, 
		   new String[] {
			 "label.pattern", "desc: {0}"
		   });	
		addAnnotation
		  (getInformation_Id(), 
		   source, 
		   new String[] {
			 "label.pattern", "id: {0}"
		   });	
		addAnnotation
		  (getInformation_Type(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInformation_Multiple(), 
		   source, 
		   new String[] {
			 "label.pattern", "multiple: {0}"
		   });	
		addAnnotation
		  (getOption_Id(), 
		   source, 
		   new String[] {
			 "label.pattern", "id: {0}"
		   });	
		addAnnotation
		  (getFile_Id(), 
		   source, 
		   new String[] {
			 "label.pattern", "id: {0}"
		   });	
		addAnnotation
		  (getFile_Path(), 
		   source, 
		   new String[] {
			 "label.pattern", "path: {0}"
		   });	
		addAnnotation
		  (getData_Id(), 
		   source, 
		   new String[] {
			 "label.pattern", "id: {0}"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getActor_Tasks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_Informations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInformation_Options(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getInformation_Files(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getInformation_Datas(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_5Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getTask_LinkedTo(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getTask_LinkedFrom(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "color", "255,255,255"
		   });	
		addAnnotation
		  (getUserTask_Requires(), 
		   source, 
		   new String[] {
			 "label", "req",
			 "target.decoration", "arrow",
			 "color", "255,0,0"
		   });	
		addAnnotation
		  (getServiceTask_Requires(), 
		   source, 
		   new String[] {
			 "label", "req",
			 "target.decoration", "arrow",
			 "color", "255,0,0"
		   });	
		addAnnotation
		  (getServiceTask_Produces(), 
		   source, 
		   new String[] {
			 "label", "prod",
			 "target.decoration", "arrow",
			 "color", "0,255,0"
		   });	
		addAnnotation
		  (getSendMsgTask_Destination(), 
		   source, 
		   new String[] {
			 "label", "destination",
			 "target.decoration", "arrow",
			 "color", "255,255,55"
		   });	
		addAnnotation
		  (getSendMsgTask_Requires(), 
		   source, 
		   new String[] {
			 "label", "req",
			 "target.decoration", "arrow",
			 "color", "255,0,0"
		   });	
		addAnnotation
		  (getSendMsgTask_NextTask(), 
		   source, 
		   new String[] {
			 "label", "next task",
			 "target.decoration", "arrow",
			 "color", "0,0,0",
			 "style", "dash"
		   });
	}

} //WorkflowMMPackageImpl
