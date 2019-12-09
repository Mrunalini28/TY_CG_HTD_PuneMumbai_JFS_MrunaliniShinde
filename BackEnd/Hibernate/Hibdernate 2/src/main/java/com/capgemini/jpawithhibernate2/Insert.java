package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Student;

public class Insert {

	public static void main(String[] args) 
	{
		Student student=new Student();
		student.setId(5);
		student.setName("Divya");
		student.setPercentage(75.4);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction =entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(student);
		System.out.println("Record saved");
		transaction.commit();
	}

}
