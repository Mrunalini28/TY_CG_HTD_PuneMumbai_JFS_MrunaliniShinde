package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class InsertDemo2 {

	public static void main(String[] args) 
	{ 
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		Movie movie = new Movie();
		movie.setId(2);
		movie.setName("ABCD2");
		movie.setRating("vgood");
		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("Record saved");
			transaction.commit();
		} 
		catch (Exception e) 
		{  
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}

}
