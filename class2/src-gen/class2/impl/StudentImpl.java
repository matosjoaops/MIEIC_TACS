/**
 */
package class2.impl;

import class2.Class2Package;
import class2.Grade;
import class2.Student;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link class2.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link class2.impl.StudentImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link class2.impl.StudentImpl#getAvgScore <em>Avg Score</em>}</li>
 *   <li>{@link class2.impl.StudentImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link class2.impl.StudentImpl#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
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
	 * The default value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTHDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected Date birthdate = BIRTHDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgScore() <em>Avg Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgScore()
	 * @generated
	 * @ordered
	 */
	protected static final float AVG_SCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvgScore() <em>Avg Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgScore()
	 * @generated
	 * @ordered
	 */
	protected float avgScore = AVG_SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected float credits = CREDITS_EDEFAULT;

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
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Class2Package.Literals.STUDENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Class2Package.STUDENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(Date newBirthdate) {
		Date oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Class2Package.STUDENT__BIRTHDATE, oldBirthdate,
					birthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvgScore() {
		return avgScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgScore(float newAvgScore) {
		float oldAvgScore = avgScore;
		avgScore = newAvgScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Class2Package.STUDENT__AVG_SCORE, oldAvgScore,
					avgScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(float newCredits) {
		float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Class2Package.STUDENT__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGrade() {
		if (grade == null) {
			grade = new EObjectContainmentEList(Grade.class, this, Class2Package.STUDENT__GRADE);
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
		case Class2Package.STUDENT__GRADE:
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
		case Class2Package.STUDENT__NAME:
			return getName();
		case Class2Package.STUDENT__BIRTHDATE:
			return getBirthdate();
		case Class2Package.STUDENT__AVG_SCORE:
			return new Float(getAvgScore());
		case Class2Package.STUDENT__CREDITS:
			return new Float(getCredits());
		case Class2Package.STUDENT__GRADE:
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
		case Class2Package.STUDENT__NAME:
			setName((String) newValue);
			return;
		case Class2Package.STUDENT__BIRTHDATE:
			setBirthdate((Date) newValue);
			return;
		case Class2Package.STUDENT__AVG_SCORE:
			setAvgScore(((Float) newValue).floatValue());
			return;
		case Class2Package.STUDENT__CREDITS:
			setCredits(((Float) newValue).floatValue());
			return;
		case Class2Package.STUDENT__GRADE:
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
		case Class2Package.STUDENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Class2Package.STUDENT__BIRTHDATE:
			setBirthdate(BIRTHDATE_EDEFAULT);
			return;
		case Class2Package.STUDENT__AVG_SCORE:
			setAvgScore(AVG_SCORE_EDEFAULT);
			return;
		case Class2Package.STUDENT__CREDITS:
			setCredits(CREDITS_EDEFAULT);
			return;
		case Class2Package.STUDENT__GRADE:
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
		case Class2Package.STUDENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Class2Package.STUDENT__BIRTHDATE:
			return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
		case Class2Package.STUDENT__AVG_SCORE:
			return avgScore != AVG_SCORE_EDEFAULT;
		case Class2Package.STUDENT__CREDITS:
			return credits != CREDITS_EDEFAULT;
		case Class2Package.STUDENT__GRADE:
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
		result.append(", birthdate: ");
		result.append(birthdate);
		result.append(", avgScore: ");
		result.append(avgScore);
		result.append(", credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
