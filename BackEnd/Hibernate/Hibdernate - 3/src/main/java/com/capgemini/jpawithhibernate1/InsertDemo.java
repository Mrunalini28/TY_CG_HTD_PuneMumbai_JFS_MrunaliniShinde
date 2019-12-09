package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class InsertDemo {

	public static void main(String[] args)
	{
		Movie movie=new Movie();
		movie.setId(2);
		movie.setName("ABCD");
		movie.setRating("good");
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction =entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(movie);
		System.out.println("Record saved");
		transaction.commit();
	}
}