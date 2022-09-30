/**
 */
package class2.impl;

import class2.Class2Package;
import class2.Edition;
import class2.Grade;
import class2.Professor;
import class2.Student;

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
 * An implementation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link class2.impl.EditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link class2.impl.EditionImpl#getProfessor <em>Professor</em>}</li>
 *   <li>{@link class2.impl.EditionImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link class2.impl.EditionImpl#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditionImpl extends MinimalEObjectImpl.Container implements Edition {
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
	 * The cached value of the '{@link #getProfessor() <em>Professor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessor()
	 * @generated
	 * @ordered
	 */
	protected EList professor;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList student;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected EList grade;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Class2Package.Literals.EDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Class2Package.EDITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProfessor() {
		if (professor == null) {
			professor = new EObjectContainmentEList(Professor.class, this, Class2Package.EDITION__PROFESSOR);
		}
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStudent() {
		if (student == null) {
			student = new EObjectContainmentEList(Student.class, this, Class2Package.EDITION__STUDENT);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGrade() {
		if (grade == null) {
			grade = new EObjectContainmentEList(Grade.class, this, Class2Package.EDITION__GRADE);
		}
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Class2Package.EDITION__PROFESSOR:
			return ((InternalEList) getProfessor()).basicRemove(otherEnd, msgs);
		case Class2Package.EDITION__STUDENT:
			return ((InternalEList) getStudent()).basicRemove(otherEnd, msgs);
		case Class2Package.EDITION__GRADE:
			return ((InternalEList) getGrade()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Class2Package.EDITION__NAME:
			return getName();
		case Class2Package.EDITION__PROFESSOR:
			return getProfessor();
		case Class2Package.EDITION__STUDENT:
			return getStudent();
		case Class2Package.EDITION__GRADE:
			return getGrade();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Class2Package.EDITION__NAME:
			setName((String) newValue);
			return;
		case Class2Package.EDITION__PROFESSOR:
			getProfessor().clear();
			getProfessor().addAll((Collection) newValue);
			return;
		case Class2Package.EDITION__STUDENT:
			getStudent().clear();
			getStudent().addAll((Collection) newValue);
			return;
		case Class2Package.EDITION__GRADE:
			getGrade().clear();
			getGrade().addAll((Collection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case Class2Package.EDITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Class2Package.EDITION__PROFESSOR:
			getProfessor().clear();
			return;
		case Class2Package.EDITION__STUDENT:
			getStudent().clear();
			return;
		case Class2Package.EDITION__GRADE:
			getGrade().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Class2Package.EDITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Class2Package.EDITION__PROFESSOR:
			return professor != null && !professor.isEmpty();
		case Class2Package.EDITION__STUDENT:
			return student != null && !student.isEmpty();
		case Class2Package.EDITION__GRADE:
			return grade != null && !grade.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EditionImpl
