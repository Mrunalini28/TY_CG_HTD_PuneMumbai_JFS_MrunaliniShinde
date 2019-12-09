package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Student;

public class Read {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student student = entityManager.find(Student.class, 1);
		
		System.out.println("id is: " + student.getId());
		System.out.println("name is: " + student.getName());
		System.out.println("percentage is:" + student.getPercentage());
	}

}
