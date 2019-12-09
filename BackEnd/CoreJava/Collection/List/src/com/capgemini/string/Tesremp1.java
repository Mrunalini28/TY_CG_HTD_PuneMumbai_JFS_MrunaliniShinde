package com.capgemini.string;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Tesremp1 {

	public static void main(String[] args) 
	{
		Comparator<Employee> com = (e1,e2)->
		{
			if(e1.id > e2.id) {
				return 1;
			}
			 else if(e1.id < e2.id)
			{
				return -1;
			}else 
			{
				return 0 ;
			}
			};
		TreeSet<Employee> t=new TreeSet<Employee>(com);

		Employee e1=new Employee(1,"mrunal",5.5);
		Employee e2=new Employee(2,"Riya",5.1);
		Employee e3=new Employee(3,"Amruta",4.5);

		t.add(e1);
		t.add(e2);
		t.add(e3);

		Iterator<Employee> it=t.iterator();
		while(it.hasNext()) 
		{
			Employee e=it.next();
			System.out.println("id is: "+e.id);
			System.out.println("name is: "+e.name);
			System.out.println("height is: "+e.height);
			System.out.println("-------------------------");
		}
	}

}
