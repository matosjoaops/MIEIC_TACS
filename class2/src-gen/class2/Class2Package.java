/**
 */
package class2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see class2.Class2Factory
 * @model kind="package"
 * @generated
 */
public interface Class2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "class2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/class2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "class2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Class2Package eINSTANCE = class2.impl.Class2PackageImpl.init();

	/**
	 * The meta object id for the '{@link class2.impl.FacultyImpl <em>Faculty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see class2.impl.FacultyImpl
	 * @see class2.impl.Class2PackageImpl#getFaculty()
	 * @generated
	 */
	int FACULTY = 5;

	/**
	 * The meta object id for the '{@link class2.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see class2.impl.CourseImpl
	 * @see class2.impl.Class2PackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The meta object id for the '{@link class2.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see class2.impl.ProfessorImpl
	 * @see class2.impl.Class2PackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 4;

	/**
	 * The meta object id for the '{@link class2.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see class2.impl.StudentImpl
	 * @see class2.impl.Class2PackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 3;

	/**
	 * The meta object id for the '{@link class2.impl.EditionImpl <em>Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see class2.impl.EditionImpl
	 * @see class2.impl.Class2PackageImpl#getEdition()
	 * @generated
	 */
	int EDITION = 6;

	/**
	 * The meta object id for the '{@link class2.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see class2.impl.UniversityImpl
	 * @see class2.impl.Class2PackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Faculty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__FACULTY = 1;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Curricularunit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CURRICULARUNIT = 2;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link class2.impl.CurricularUnitImpl <em>Curricular Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see class2.impl.CurricularUnitImpl
	 * @see class2.impl.Class2PackageImpl#getCurricularUnit()
	 * @generated
	 */
	int CURRICULAR_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULAR_UNIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULAR_UNIT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULAR_UNIT__EDITION = 2;

	/**
	 * The number of structural features of the '<em>Curricular Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULAR_UNIT_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__BIRTHDATE = 1;

	/**
	 * The feature id for the '<em><b>Avg Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__AVG_SCORE = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__CREDITS = 3;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__BIRTHDATE = 1;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__FIELD = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__COURSE = 2;

	/**
	 * The number of structural features of the '<em>Faculty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Professor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__PROFESSOR = 1;

	/**
	 * The feature id for the '<em><b>Student</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__STUDENT = 2;

	/**
	 * The number of structural features of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link class2.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see class2.impl.GradeImpl
	 * @see class2.impl.Class2PackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__EDITION = 1;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__STUDENT = 2;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = 3;

	/**
	 * Returns the meta object for class '{@link class2.Faculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faculty</em>'.
	 * @see class2.Faculty
	 * @generated
	 */
	EClass getFaculty();

	/**
	 * Returns the meta object for the attribute '{@link class2.Faculty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see class2.Faculty#getName()
	 * @see #getFaculty()
	 * @generated
	 */
	EAttribute getFaculty_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link class2.Faculty#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see class2.Faculty#getCourse()
	 * @see #getFaculty()
	 * @generated
	 */
	EReference getFaculty_Course();

	/**
	 * Returns the meta object for the attribute '{@link class2.Faculty#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see class2.Faculty#getField()
	 * @see #getFaculty()
	 * @generated
	 */
	EAttribute getFaculty_Field();

	/**
	 * Returns the meta object for class '{@link class2.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see class2.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link class2.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see class2.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link class2.Course#getCurricularunit <em>Curricularunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curricularunit</em>'.
	 * @see class2.Course#getCurricularunit()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Curricularunit();

	/**
	 * Returns the meta object for the attribute '{@link class2.Course#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see class2.Course#getDescription()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Description();

	/**
	 * Returns the meta object for class '{@link class2.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see class2.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the attribute '{@link class2.Professor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see class2.Professor#getName()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Name();

	/**
	 * Returns the meta object for the attribute '{@link class2.Professor#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see class2.Professor#getBirthdate()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Birthdate();

	/**
	 * Returns the meta object for class '{@link class2.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see class2.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link class2.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see class2.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the attribute '{@link class2.Student#getAvgScore <em>Avg Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Score</em>'.
	 * @see class2.Student#getAvgScore()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_AvgScore();

	/**
	 * Returns the meta object for the attribute '{@link class2.Student#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see class2.Student#getBirthdate()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link class2.Student#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see class2.Student#getCredits()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Credits();

	/**
	 * Returns the meta object for class '{@link class2.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edition</em>'.
	 * @see class2.Edition
	 * @generated
	 */
	EClass getEdition();

	/**
	 * Returns the meta object for the attribute '{@link class2.Edition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see class2.Edition#getName()
	 * @see #getEdition()
	 * @generated
	 */
	EAttribute getEdition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link class2.Edition#getProfessor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Professor</em>'.
	 * @see class2.Edition#getProfessor()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_Professor();

	/**
	 * Returns the meta object for the containment reference list '{@link class2.Edition#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Student</em>'.
	 * @see class2.Edition#getStudent()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_Student();

	/**
	 * Returns the meta object for class '{@link class2.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see class2.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the containment reference list '{@link class2.University#getFaculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faculty</em>'.
	 * @see class2.University#getFaculty()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Faculty();

	/**
	 * Returns the meta object for the attribute '{@link class2.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see class2.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for class '{@link class2.CurricularUnit <em>Curricular Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curricular Unit</em>'.
	 * @see class2.CurricularUnit
	 * @generated
	 */
	EClass getCurricularUnit();

	/**
	 * Returns the meta object for the attribute '{@link class2.CurricularUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see class2.CurricularUnit#getName()
	 * @see #getCurricularUnit()
	 * @generated
	 */
	EAttribute getCurricularUnit_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link class2.CurricularUnit#getEdition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edition</em>'.
	 * @see class2.CurricularUnit#getEdition()
	 * @see #getCurricularUnit()
	 * @generated
	 */
	EReference getCurricularUnit_Edition();

	/**
	 * Returns the meta object for the attribute '{@link class2.CurricularUnit#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see class2.CurricularUnit#getDescription()
	 * @see #getCurricularUnit()
	 * @generated
	 */
	EAttribute getCurricularUnit_Description();

	/**
	 * Returns the meta object for class '{@link class2.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see class2.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the attribute '{@link class2.Grade#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see class2.Grade#getValue()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_Value();

	/**
	 * Returns the meta object for the reference '{@link class2.Grade#getEdition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edition</em>'.
	 * @see class2.Grade#getEdition()
	 * @see #getGrade()
	 * @generated
	 */
	EReference getGrade_Edition();

	/**
	 * Returns the meta object for the reference '{@link class2.Grade#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Student</em>'.
	 * @see class2.Grade#getStudent()
	 * @see #getGrade()
	 * @generated
	 */
	EReference getGrade_Student();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Class2Factory getClass2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link class2.impl.FacultyImpl <em>Faculty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see class2.impl.FacultyImpl
		 * @see class2.impl.Class2PackageImpl#getFaculty()
		 * @generated
		 */
		EClass FACULTY = eINSTANCE.getFaculty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACULTY__NAME = eINSTANCE.getFaculty_Name();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTY__COURSE = eINSTANCE.getFaculty_Course();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACULTY__FIELD = eINSTANCE.getFaculty_Field();

		/**
		 * The meta object literal for the '{@link class2.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see class2.impl.CourseImpl
		 * @see class2.impl.Class2PackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Curricularunit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__CURRICULARUNIT = eINSTANCE.getCourse_Curricularunit();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__DESCRIPTION = eINSTANCE.getCourse_Description();

		/**
		 * The meta object literal for the '{@link class2.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see class2.impl.ProfessorImpl
		 * @see class2.impl.Class2PackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__NAME = eINSTANCE.getProfessor_Name();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__BIRTHDATE = eINSTANCE.getProfessor_Birthdate();

		/**
		 * The meta object literal for the '{@link class2.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see class2.impl.StudentImpl
		 * @see class2.impl.Class2PackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>Avg Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__AVG_SCORE = eINSTANCE.getStudent_AvgScore();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__BIRTHDATE = eINSTANCE.getStudent_Birthdate();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__CREDITS = eINSTANCE.getStudent_Credits();

		/**
		 * The meta object literal for the '{@link class2.impl.EditionImpl <em>Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see class2.impl.EditionImpl
		 * @see class2.impl.Class2PackageImpl#getEdition()
		 * @generated
		 */
		EClass EDITION = eINSTANCE.getEdition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITION__NAME = eINSTANCE.getEdition_Name();

		/**
		 * The meta object literal for the '<em><b>Professor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__PROFESSOR = eINSTANCE.getEdition_Professor();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__STUDENT = eINSTANCE.getEdition_Student();

		/**
		 * The meta object literal for the '{@link class2.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see class2.impl.UniversityImpl
		 * @see class2.impl.Class2PackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Faculty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__FACULTY = eINSTANCE.getUniversity_Faculty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '{@link class2.impl.CurricularUnitImpl <em>Curricular Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see class2.impl.CurricularUnitImpl
		 * @see class2.impl.Class2PackageImpl#getCurricularUnit()
		 * @generated
		 */
		EClass CURRICULAR_UNIT = eINSTANCE.getCurricularUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRICULAR_UNIT__NAME = eINSTANCE.getCurricularUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Edition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRICULAR_UNIT__EDITION = eINSTANCE.getCurricularUnit_Edition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRICULAR_UNIT__DESCRIPTION = eINSTANCE.getCurricularUnit_Description();

		/**
		 * The meta object literal for the '{@link class2.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see class2.impl.GradeImpl
		 * @see class2.impl.Class2PackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__VALUE = eINSTANCE.getGrade_Value();

		/**
		 * The meta object literal for the '<em><b>Edition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE__EDITION = eINSTANCE.getGrade_Edition();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE__STUDENT = eINSTANCE.getGrade_Student();

	}

} //Class2Package
