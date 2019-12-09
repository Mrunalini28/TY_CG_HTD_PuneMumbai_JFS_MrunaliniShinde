package com.capgemini.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Testemp1 {

	public static void main(String[] args)
	{
	TreeSet<Employee1> t=new TreeSet<Employee1>();
	
	Employee1 e1=new Employee1(1,"ngb",254.25);
	Employee1 e2=new Employee1(2,"hfb",2524.25);
	Employee1 e3=new Employee1(3,"uyi",24454.25);
	t.add(e1);
	t.add(e2);
	t.add(e3);
	
	Iterator<Employee1> it =t.iterator();
	while(it.hasNext()) 
	{
		Employee1 f=it.next();
		System.out.println("id is :"+f.id);
		System.out.println("name is :"+f.name);
		System.out.println("salary is :"+f.salary);
		System.out.println("--------------");
		
		
	}
	}
}
