package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class Reference {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		// data= entityManager.find(Movie.class, 2);
		Movie Data=entityManager.getReference(Movie.class, 5);
		System.out.println(Data.getClass());
		/*
		 * System.out.println("Id is :"+Data.getId());
		 * System.out.println("Name is: "+Data.getName());
		 * System.out.println("Rating is: "+Data.getRating());
		 */
		
	}

}
