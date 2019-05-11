/**
 */
package WorkflowMM.impl;

import WorkflowMM.Information;
import WorkflowMM.ServiceTask;
import WorkflowMM.WorkflowMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WorkflowMM.impl.ServiceTaskImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link WorkflowMM.impl.ServiceTaskImpl#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceTaskImpl extends TaskImpl implements ServiceTask {
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
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> produces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowMMPackage.Literals.SERVICE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<Information>(Information.class, this, WorkflowMMPackage.SERVICE_TASK__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getProduces() {
		if (produces == null) {
			produces = new EObjectResolvingEList<Information>(Information.class, this, WorkflowMMPackage.SERVICE_TASK__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowMMPackage.SERVICE_TASK__REQUIRES:
				return getRequires();
			case WorkflowMMPackage.SERVICE_TASK__PRODUCES:
				return getProduces();
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
			case WorkflowMMPackage.SERVICE_TASK__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Information>)newValue);
				return;
			case WorkflowMMPackage.SERVICE_TASK__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends Information>)newValue);
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
			case WorkflowMMPackage.SERVICE_TASK__REQUIRES:
				getRequires().clear();
				return;
			case WorkflowMMPackage.SERVICE_TASK__PRODUCES:
				getProduces().clear();
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
			case WorkflowMMPackage.SERVICE_TASK__REQUIRES:
				return requires != null && !requires.isEmpty();
			case WorkflowMMPackage.SERVICE_TASK__PRODUCES:
				return produces != null && !produces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceTaskImpl
