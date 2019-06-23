/**
 */
package WorkflowMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkflowMM.ServiceTask#getRequires <em>Requires</em>}</li>
 *   <li>{@link WorkflowMM.ServiceTask#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @see WorkflowMM.WorkflowMMPackage#getServiceTask()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TaskMustBeLinkedFromATask TaskMustBeLinkedToATask'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TaskMustBeLinkedFromATask='\n\t\t\tself.linkedFrom->size()=1' TaskMustBeLinkedToATask='\n\t\t\tself.linkedTo->size()=1'"
 * @generated
 */
public interface ServiceTask extends Task {
	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link WorkflowMM.Information}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see WorkflowMM.WorkflowMMPackage#getServiceTask_Requires()
	 * @model required="true"
	 *        annotation="gmf.link label='req' target.decoration='arrow' color='255,0,0'"
	 * @generated
	 */
	EList<Information> getRequires();

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' reference list.
	 * The list contents are of type {@link WorkflowMM.Information}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' reference list.
	 * @see WorkflowMM.WorkflowMMPackage#getServiceTask_Produces()
	 * @model required="true"
	 *        annotation="gmf.link label='prod' target.decoration='arrow' color='0,255,0'"
	 * @generated
	 */
	EList<Information> getProduces();

} // ServiceTask
