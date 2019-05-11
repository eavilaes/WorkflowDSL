/**
 */
package WorkflowMM.impl;

import WorkflowMM.Task;
import WorkflowMM.WorkflowMMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WorkflowMM.impl.TaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link WorkflowMM.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link WorkflowMM.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link WorkflowMM.impl.TaskImpl#getLinkedTo <em>Linked To</em>}</li>
 *   <li>{@link WorkflowMM.impl.TaskImpl#getLinkedFrom <em>Linked From</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkedTo() <em>Linked To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedTo()
	 * @generated
	 * @ordered
	 */
	protected Task linkedTo;

	/**
	 * The cached value of the '{@link #getLinkedFrom() <em>Linked From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedFrom()
	 * @generated
	 * @ordered
	 */
	protected Task linkedFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowMMPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.TASK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getLinkedTo() {
		if (linkedTo != null && linkedTo.eIsProxy()) {
			InternalEObject oldLinkedTo = (InternalEObject)linkedTo;
			linkedTo = (Task)eResolveProxy(oldLinkedTo);
			if (linkedTo != oldLinkedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowMMPackage.TASK__LINKED_TO, oldLinkedTo, linkedTo));
			}
		}
		return linkedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetLinkedTo() {
		return linkedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkedTo(Task newLinkedTo, NotificationChain msgs) {
		Task oldLinkedTo = linkedTo;
		linkedTo = newLinkedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.TASK__LINKED_TO, oldLinkedTo, newLinkedTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedTo(Task newLinkedTo) {
		if (newLinkedTo != linkedTo) {
			NotificationChain msgs = null;
			if (linkedTo != null)
				msgs = ((InternalEObject)linkedTo).eInverseRemove(this, WorkflowMMPackage.TASK__LINKED_FROM, Task.class, msgs);
			if (newLinkedTo != null)
				msgs = ((InternalEObject)newLinkedTo).eInverseAdd(this, WorkflowMMPackage.TASK__LINKED_FROM, Task.class, msgs);
			msgs = basicSetLinkedTo(newLinkedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.TASK__LINKED_TO, newLinkedTo, newLinkedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getLinkedFrom() {
		if (linkedFrom != null && linkedFrom.eIsProxy()) {
			InternalEObject oldLinkedFrom = (InternalEObject)linkedFrom;
			linkedFrom = (Task)eResolveProxy(oldLinkedFrom);
			if (linkedFrom != oldLinkedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowMMPackage.TASK__LINKED_FROM, oldLinkedFrom, linkedFrom));
			}
		}
		return linkedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetLinkedFrom() {
		return linkedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkedFrom(Task newLinkedFrom, NotificationChain msgs) {
		Task oldLinkedFrom = linkedFrom;
		linkedFrom = newLinkedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.TASK__LINKED_FROM, oldLinkedFrom, newLinkedFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedFrom(Task newLinkedFrom) {
		if (newLinkedFrom != linkedFrom) {
			NotificationChain msgs = null;
			if (linkedFrom != null)
				msgs = ((InternalEObject)linkedFrom).eInverseRemove(this, WorkflowMMPackage.TASK__LINKED_TO, Task.class, msgs);
			if (newLinkedFrom != null)
				msgs = ((InternalEObject)newLinkedFrom).eInverseAdd(this, WorkflowMMPackage.TASK__LINKED_TO, Task.class, msgs);
			msgs = basicSetLinkedFrom(newLinkedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.TASK__LINKED_FROM, newLinkedFrom, newLinkedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowMMPackage.TASK__LINKED_TO:
				if (linkedTo != null)
					msgs = ((InternalEObject)linkedTo).eInverseRemove(this, WorkflowMMPackage.TASK__LINKED_FROM, Task.class, msgs);
				return basicSetLinkedTo((Task)otherEnd, msgs);
			case WorkflowMMPackage.TASK__LINKED_FROM:
				if (linkedFrom != null)
					msgs = ((InternalEObject)linkedFrom).eInverseRemove(this, WorkflowMMPackage.TASK__LINKED_TO, Task.class, msgs);
				return basicSetLinkedFrom((Task)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowMMPackage.TASK__LINKED_TO:
				return basicSetLinkedTo(null, msgs);
			case WorkflowMMPackage.TASK__LINKED_FROM:
				return basicSetLinkedFrom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowMMPackage.TASK__ID:
				return getId();
			case WorkflowMMPackage.TASK__NAME:
				return getName();
			case WorkflowMMPackage.TASK__DESCRIPTION:
				return getDescription();
			case WorkflowMMPackage.TASK__LINKED_TO:
				if (resolve) return getLinkedTo();
				return basicGetLinkedTo();
			case WorkflowMMPackage.TASK__LINKED_FROM:
				if (resolve) return getLinkedFrom();
				return basicGetLinkedFrom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowMMPackage.TASK__ID:
				setId((String)newValue);
				return;
			case WorkflowMMPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case WorkflowMMPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkflowMMPackage.TASK__LINKED_TO:
				setLinkedTo((Task)newValue);
				return;
			case WorkflowMMPackage.TASK__LINKED_FROM:
				setLinkedFrom((Task)newValue);
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
			case WorkflowMMPackage.TASK__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowMMPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowMMPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkflowMMPackage.TASK__LINKED_TO:
				setLinkedTo((Task)null);
				return;
			case WorkflowMMPackage.TASK__LINKED_FROM:
				setLinkedFrom((Task)null);
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
			case WorkflowMMPackage.TASK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WorkflowMMPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowMMPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkflowMMPackage.TASK__LINKED_TO:
				return linkedTo != null;
			case WorkflowMMPackage.TASK__LINKED_FROM:
				return linkedFrom != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
