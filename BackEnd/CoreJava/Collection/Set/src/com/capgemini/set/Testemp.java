package com.capgemini.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Testemp {

	public static void main(String[] args) 
	{
		Employee e1=new Employee(1,"Mrunal",33330.2);
		Employee e2=new Employee(2,"Priya",23330.35);
		Employee e3=new Employee(3,"Riya",23420.2);
		Employee e4=new Employee(1,"Mrunal",33330.2);
		

		/*
		 * LinkedHashSet<Employee> hs=new LinkedHashSet<Employee>(); hs.add(e1);
		 * hs.add(e2); hs.add(e3); hs.add(e4);
		 * 
		 * for (Employee object : hs) { Employee s1 = object;
		 * System.out.println("Name is :"+s1.name); System.out.println("ID is :"+s1.id);
		 * System.out.println("Name is :"+s1.salary);
		 * System.out.println("---------------------");
		 * 
		 * }
		 */
		HashSet <Employee>h =new HashSet<Employee>();
		h.add(e1);
		h.add(e2);
		h.add(e3);

		for (Employee object : h)
		{
			Employee s1 = object;
			System.out.println("Name is :"+s1.name);
			System.out.println("ID is :"+s1.id);
			System.out.println("Name is :"+s1.salary);
			System.out.println("----------------------");

		}




	}

}
