package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cagemini.onetoone.VoterCard;

public class Testpencil {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(person);
			
			VoterCard voterdetails =entityManager.find(VoterCard.class,1234);
			System.out.println(voterdetails.getPerson().getPid());	
			System.out.println(voterdetails.getPerson().getName());
			System.out.println(voterdetails.getVid());
			System.out.println(voterdetails.getAddress());
			
			
			System.out.println("Record saved");
			transaction.commit();
		}
		catch (Exception e) 
		{  

			e.printStackTrace();
		}
		entityManager.close();
	}

}
