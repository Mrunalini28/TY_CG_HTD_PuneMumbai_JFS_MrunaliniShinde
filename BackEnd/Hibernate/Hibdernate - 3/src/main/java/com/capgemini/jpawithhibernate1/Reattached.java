package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class Reattached {
	public static void main(String[] args) 
	{
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie movie =entityManager.find(Movie.class, 2);
			System.out.println(movie.getId());
			System.out.println(entityManager.contains(movie));
			entityManager.detach(movie);
			System.out.println(entityManager.contains(movie));
			//entityManager.clear();
			Movie movie1=entityManager.merge(movie);
			movie1.setName("Abcd");
			transaction.commit();

		} catch (Exception e) {                   
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}

}
