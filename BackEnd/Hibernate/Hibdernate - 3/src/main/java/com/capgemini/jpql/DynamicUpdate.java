package com.capgemini.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdate {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "update Movie set name=:nm where id =:mid";

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("nm", "Mom");
		query.setParameter("mid", 1);
		
		int result = query.executeUpdate();
		System.out.println("result" + result);
		transaction.commit();
		entityManager.close();
	}
}

