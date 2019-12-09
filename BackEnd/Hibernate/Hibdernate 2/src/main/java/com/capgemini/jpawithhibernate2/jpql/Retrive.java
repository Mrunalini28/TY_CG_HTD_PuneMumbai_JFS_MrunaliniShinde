package com.capgemini.jpawithhibernate2.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate2.dto.Student;

public class Retrive {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from Student";
		Query query = entityManager.createQuery(jpql);
		List<Student> list = query.getResultList();
		for (Student m : list) {
			System.out.println("id is: " + m.getId());
			System.out.println("name is:" + m.getName());
			System.out.println("percentage is:" + m.getPercentage());
			System.out.println("----------------------------------");
		}
		entityManager.close();
	}

}
