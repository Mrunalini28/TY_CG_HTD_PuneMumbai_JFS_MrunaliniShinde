package com.capgemini.jpawithhibernate2.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "delete from Student where id =5";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		System.out.println("result" + result);
		transaction.commit();
		entityManager.close();
	}

}
