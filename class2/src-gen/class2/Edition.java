/**
 */
package class2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link class2.Edition#getName <em>Name</em>}</li>
 *   <li>{@link class2.Edition#getProfessor <em>Professor</em>}</li>
 *   <li>{@link class2.Edition#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see class2.Class2Package#getEdition()
 * @model
 * @generated
 */
public interface Edition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see class2.Class2Package#getEdition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link class2.Edition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Professor</b></em>' containment reference list.
	 * The list contents are of type {@link class2.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professor</em>' containment reference list.
	 * @see class2.Class2Package#getEdition_Professor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Professor> getProfessor();

	/**
	 * Returns the value of the '<em><b>Student</b></em>' containment reference list.
	 * The list contents are of type {@link class2.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' containment reference list.
	 * @see class2.Class2Package#getEdition_Student()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudent();

} // Edition
