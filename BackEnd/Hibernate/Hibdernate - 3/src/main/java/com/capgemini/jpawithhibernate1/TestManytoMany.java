package com.capgemini.jpawithhibernate1;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.ManytoMany.Course;
import com.capgemini.ManytoMany.Student1;

public class TestManytoMany {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		Course course = new Course();
		course.setCid(2);
		course.setCname("JAVA");

		Course course1 = new Course();
		course1.setCid(1);
		course1.setCname("SQL");

		ArrayList<Course> arraylist = new ArrayList<Course>();
		arraylist.add(course);
		arraylist.add(course1);

		Student1 student = new Student1();
		student.setSid(2);
		student.setSname("Mrunalini");
		student.setCourse(arraylist);

		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			entityManager.persist(student);
			Course course2=entityManager.find(Course.class, 2);
			System.out.println(course2.getStudent().get(0).getSid());
			transaction.begin();
			System.out.println("record saved");
			transaction.commit();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			transaction.rollback();
		}
	}

}
