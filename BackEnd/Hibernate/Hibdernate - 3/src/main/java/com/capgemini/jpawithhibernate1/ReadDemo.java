package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class ReadDemo {

	public static void main(String[] args)
	{
	
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Movie data= entityManager.find(Movie.class, 2);
		
		System.out.println("Id is :"+data.getId());
		System.out.println("Name is: "+data.getName());
		System.out.println("Rating is: "+data.getRating());

	}
}