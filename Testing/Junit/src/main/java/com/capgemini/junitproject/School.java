package com.capgemini.junitproject;

import java.util.ArrayList;

public class School {

	private ArrayList<Student> al = new ArrayList<Student>();

	public Student registerStudent(Student student) {
		int rollnumber = al.size() + 1;
		student.setId(rollnumber);
		al.add(student);
		return student;
	}

	public Student search(int id) {
		Student res = null;
		for (Student s : al) {
			if (s.getId() == id) {
				res = s;
				break;
			}
		}
		return res;
	}

}
