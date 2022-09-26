/**
 */
package class2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link class2.Grade#getValue <em>Value</em>}</li>
 *   <li>{@link class2.Grade#getEdition <em>Edition</em>}</li>
 *   <li>{@link class2.Grade#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see class2.Class2Package#getGrade()
 * @model
 * @generated
 */
public interface Grade extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see class2.Class2Package#getGrade_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link class2.Grade#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition</em>' reference.
	 * @see #setEdition(Edition)
	 * @see class2.Class2Package#getGrade_Edition()
	 * @model
	 * @generated
	 */
	Edition getEdition();

	/**
	 * Sets the value of the '{@link class2.Grade#getEdition <em>Edition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' reference.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(Edition value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference.
	 * @see #setStudent(Student)
	 * @see class2.Class2Package#getGrade_Student()
	 * @model
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link class2.Grade#getStudent <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

} // Grade
