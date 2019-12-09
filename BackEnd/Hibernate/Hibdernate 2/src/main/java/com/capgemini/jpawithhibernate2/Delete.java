package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.capgemini.jpawithhibernate2.dto.Student;

public class Delete {

	public static void main(String[] args)
	{
		EntityTransaction transaction = null;
		EntityManager entityManager =null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Student student = entityManager.find(Student.class, 4);
			entityManager.remove(student);
			System.out.println("data removed");
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();

		}
		entityManager.close();
	}
}
