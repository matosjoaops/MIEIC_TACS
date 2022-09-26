package class2;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		final Student student = Class2Factory.eINSTANCE.createStudent();
		student.setName("John");
		assertEquals(student.getName(), "John");
	}
	
	@Test
	public void test2() {
		final Faculty faculty = Class2Factory.eINSTANCE.createFaculty();
		Course course = Class2Factory.eINSTANCE.createCourse();
		course.setName("MEIC");
		faculty.getCourse().add(course);
		assertEquals(faculty.getCourse().get(0), "MEIC");
	}

}
