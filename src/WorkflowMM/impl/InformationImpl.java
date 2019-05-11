/**
 */
package WorkflowMM.impl;

import WorkflowMM.Data;
import WorkflowMM.File;
import WorkflowMM.Information;
import WorkflowMM.Option;
import WorkflowMM.TypeOfData;
import WorkflowMM.WorkflowMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WorkflowMM.impl.InformationImpl#getId <em>Id</em>}</li>
 *   <li>{@link WorkflowMM.impl.InformationImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link WorkflowMM.impl.InformationImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link WorkflowMM.impl.InformationImpl#getType <em>Type</em>}</li>
 *   <li>{@link WorkflowMM.impl.InformationImpl#getDatas <em>Datas</em>}</li>
 *   <li>{@link WorkflowMM.impl.InformationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationImpl extends MinimalEObjectImpl.Container implements Information {
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
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> options;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeOfData TYPE_EDEFAULT = TypeOfData.FILL_FORM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeOfData type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatas() <em>Datas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> datas;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowMMPackage.Literals.INFORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.INFORMATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Option>(Option.class, this, WorkflowMMPackage.INFORMATION__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, WorkflowMMPackage.INFORMATION__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfData getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeOfData newType) {
		TypeOfData oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.INFORMATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getDatas() {
		if (datas == null) {
			datas = new EObjectContainmentEList<Data>(Data.class, this, WorkflowMMPackage.INFORMATION__DATAS);
		}
		return datas;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowMMPackage.INFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowMMPackage.INFORMATION__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
			case WorkflowMMPackage.INFORMATION__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case WorkflowMMPackage.INFORMATION__DATAS:
				return ((InternalEList<?>)getDatas()).basicRemove(otherEnd, msgs);
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
			case WorkflowMMPackage.INFORMATION__ID:
				return getId();
			case WorkflowMMPackage.INFORMATION__OPTIONS:
				return getOptions();
			case WorkflowMMPackage.INFORMATION__FILES:
				return getFiles();
			case WorkflowMMPackage.INFORMATION__TYPE:
				return getType();
			case WorkflowMMPackage.INFORMATION__DATAS:
				return getDatas();
			case WorkflowMMPackage.INFORMATION__NAME:
				return getName();
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
			case WorkflowMMPackage.INFORMATION__ID:
				setId((String)newValue);
				return;
			case WorkflowMMPackage.INFORMATION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
				return;
			case WorkflowMMPackage.INFORMATION__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case WorkflowMMPackage.INFORMATION__TYPE:
				setType((TypeOfData)newValue);
				return;
			case WorkflowMMPackage.INFORMATION__DATAS:
				getDatas().clear();
				getDatas().addAll((Collection<? extends Data>)newValue);
				return;
			case WorkflowMMPackage.INFORMATION__NAME:
				setName((String)newValue);
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
			case WorkflowMMPackage.INFORMATION__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowMMPackage.INFORMATION__OPTIONS:
				getOptions().clear();
				return;
			case WorkflowMMPackage.INFORMATION__FILES:
				getFiles().clear();
				return;
			case WorkflowMMPackage.INFORMATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WorkflowMMPackage.INFORMATION__DATAS:
				getDatas().clear();
				return;
			case WorkflowMMPackage.INFORMATION__NAME:
				setName(NAME_EDEFAULT);
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
			case WorkflowMMPackage.INFORMATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WorkflowMMPackage.INFORMATION__OPTIONS:
				return options != null && !options.isEmpty();
			case WorkflowMMPackage.INFORMATION__FILES:
				return files != null && !files.isEmpty();
			case WorkflowMMPackage.INFORMATION__TYPE:
				return type != TYPE_EDEFAULT;
			case WorkflowMMPackage.INFORMATION__DATAS:
				return datas != null && !datas.isEmpty();
			case WorkflowMMPackage.INFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InformationImpl
