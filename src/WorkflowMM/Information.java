/**
 */
package WorkflowMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkflowMM.Information#getId <em>Id</em>}</li>
 *   <li>{@link WorkflowMM.Information#getOptions <em>Options</em>}</li>
 *   <li>{@link WorkflowMM.Information#getFiles <em>Files</em>}</li>
 *   <li>{@link WorkflowMM.Information#getType <em>Type</em>}</li>
 *   <li>{@link WorkflowMM.Information#getDatas <em>Datas</em>}</li>
 *   <li>{@link WorkflowMM.Information#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see WorkflowMM.WorkflowMMPackage#getInformation()
 * @model
 * @generated
 */
public interface Information extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see WorkflowMM.WorkflowMMPackage#getInformation_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WorkflowMM.Information#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link WorkflowMM.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see WorkflowMM.WorkflowMMPackage#getInformation_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link WorkflowMM.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see WorkflowMM.WorkflowMMPackage#getInformation_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link WorkflowMM.TypeOfData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see WorkflowMM.TypeOfData
	 * @see #setType(TypeOfData)
	 * @see WorkflowMM.WorkflowMMPackage#getInformation_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeOfData getType();

	/**
	 * Sets the value of the '{@link WorkflowMM.Information#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see WorkflowMM.TypeOfData
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfData value);

	/**
	 * Returns the value of the '<em><b>Datas</b></em>' containment reference list.
	 * The list contents are of type {@link WorkflowMM.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datas</em>' containment reference list.
	 * @see WorkflowMM.WorkflowMMPackage#getInformation_Datas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getDatas();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see WorkflowMM.WorkflowMMPackage#getInformation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WorkflowMM.Information#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Information
