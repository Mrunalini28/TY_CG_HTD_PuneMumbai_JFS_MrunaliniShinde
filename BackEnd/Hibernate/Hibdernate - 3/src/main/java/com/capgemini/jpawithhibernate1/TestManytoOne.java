package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.OneToMany.Pencil;
import com.capgemini.OneToMany.PencilBox;

public class TestManytoOne {

	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		PencilBox pencilBox =new PencilBox();
		pencilBox.setBoxid(2);
		pencilBox.setName("Camlin");
		
		Pencil pencil =new Pencil();
		pencil.setPid(12);
		pencil.setColor("Black");
		pencil.setPencilbox(pencilBox);
		
		Pencil pencil1 =new Pencil();
		pencil1.setPid(32);
		pencil1.setColor("Red");
		pencil1.setPencilbox(pencilBox);
		
		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			System.out.println("record saved");
			transaction.commit();
		}
		catch (Exception e) 
		{  
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}

}
