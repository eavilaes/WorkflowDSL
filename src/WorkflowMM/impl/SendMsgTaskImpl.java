/**
 */
package WorkflowMM.impl;

import WorkflowMM.Information;
import WorkflowMM.ReceiveMsgTask;
import WorkflowMM.SendMsgTask;
import WorkflowMM.Task;
import WorkflowMM.WorkflowMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Msg Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WorkflowMM.impl.SendMsgTaskImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link WorkflowMM.impl.SendMsgTaskImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link WorkflowMM.impl.SendMsgTaskImpl#getNextTask <em>Next Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendMsgTaskImpl extends TaskImpl implements SendMsgTask {
	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected ReceiveMsgTask destination;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> requires;

	/**
	 * The cached value of the '{@link #getNextTask() <em>Next Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextTask()
	 * @generated
	 * @ordered
	 */
	protected Task nextTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendMsgTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowMMPackage.Literals.SEND_MSG_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMsgTask getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (ReceiveMsgTask)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowMMPackage.SEND_MSG_TASK__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMsgTask basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(ReceiveMsgTask newDestination) {
		ReceiveMsgTask oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.SEND_MSG_TASK__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<Information>(Information.class, this, WorkflowMMPackage.SEND_MSG_TASK__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getNextTask() {
		if (nextTask != null && nextTask.eIsProxy()) {
			InternalEObject oldNextTask = (InternalEObject)nextTask;
			nextTask = (Task)eResolveProxy(oldNextTask);
			if (nextTask != oldNextTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowMMPackage.SEND_MSG_TASK__NEXT_TASK, oldNextTask, nextTask));
			}
		}
		return nextTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetNextTask() {
		return nextTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextTask(Task newNextTask) {
		Task oldNextTask = nextTask;
		nextTask = newNextTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.SEND_MSG_TASK__NEXT_TASK, oldNextTask, nextTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowMMPackage.SEND_MSG_TASK__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case WorkflowMMPackage.SEND_MSG_TASK__REQUIRES:
				return getRequires();
			case WorkflowMMPackage.SEND_MSG_TASK__NEXT_TASK:
				if (resolve) return getNextTask();
				return basicGetNextTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowMMPackage.SEND_MSG_TASK__DESTINATION:
				setDestination((ReceiveMsgTask)newValue);
				return;
			case WorkflowMMPackage.SEND_MSG_TASK__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Information>)newValue);
				return;
			case WorkflowMMPackage.SEND_MSG_TASK__NEXT_TASK:
				setNextTask((Task)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkflowMMPackage.SEND_MSG_TASK__DESTINATION:
				setDestination((ReceiveMsgTask)null);
				return;
			case WorkflowMMPackage.SEND_MSG_TASK__REQUIRES:
				getRequires().clear();
				return;
			case WorkflowMMPackage.SEND_MSG_TASK__NEXT_TASK:
				setNextTask((Task)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkflowMMPackage.SEND_MSG_TASK__DESTINATION:
				return destination != null;
			case WorkflowMMPackage.SEND_MSG_TASK__REQUIRES:
				return requires != null && !requires.isEmpty();
			case WorkflowMMPackage.SEND_MSG_TASK__NEXT_TASK:
				return nextTask != null;
		}
		return super.eIsSet(featureID);
	}

} //SendMsgTaskImpl
