package com.capgemini.junitproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchoolTest {

	private School school;

	@BeforeEach
	public void createObject() {
		school = new School();
	}

	@Test
	public void testRegisterStudent() {
		Student student = new Student("Mrunalini", 88.8, 'F');
		Student stu = school.registerStudent(student);
		assertEquals(1, stu.getId());
	}

	@Test
	public void testRegisterStudentFornull() {
		assertThrows(NullPointerException.class, () -> school.registerStudent(null));
	}
}
