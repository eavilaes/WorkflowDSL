/**
 */
package WorkflowMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkflowMM.Workflow#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see WorkflowMM.WorkflowMMPackage#getWorkflow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyOneBeginTag OnlyOneEndTag TaskIdMustBeUnique DataIdMustBeUnique OptionIdMustBeUnique FileIdMustBeUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OnlyOneBeginTag='\n\t\t\tself.actors.tasks->select(T:Task| T.oclIsTypeOf(Begin))->size()=1' OnlyOneEndTag='\n\t\t\tself.actors.tasks->select(T:Task| T.oclIsTypeOf(End))->size()=1' TaskIdMustBeUnique='\n\t\t\tself.actors.tasks->forAll(t1, t2 : Task | t1<>t2 implies t1.id<>t2.id)' DataIdMustBeUnique='\n\t\t\tself.actors.informations.datas->forAll(d1, d2 : Data | d1<>d2 implies d1.id<>d2.id)' OptionIdMustBeUnique='\n\t\t\tself.actors.informations.options->forAll(o1, o2 : Option | o1<>o2 implies o1.id<>o2.id)' FileIdMustBeUnique='\n\t\t\tself.actors.informations.files->forAll(f1, f2 : File | f1<>f2 implies f1.id<>f2.id)'"
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link WorkflowMM.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see WorkflowMM.WorkflowMMPackage#getWorkflow_Actors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Actor> getActors();

} // Workflow
