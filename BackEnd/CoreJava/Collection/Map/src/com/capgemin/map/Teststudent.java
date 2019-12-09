package com.capgemin.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Teststudent {

	public static void main(String[] args)
	{

		Student s1=new Student(1,"Mrunal",63.5);
		Student s2=new Student(2,"Priya",63.5);
		Student s3=new Student(3,"Divya",52.5);
		Student s4=new Student(4,"Amruta",73.5);
		Student s5=new Student(5,"Riya",85.2);
		Student s6=new Student(6,"Anil",75.2);
		Student s7=new Student(7,"sakshi",62.5);
		Student s8=new Student(8,"Ram",88.8);
		Student s9=new Student(9,"Chinnu",91.5);

		ArrayList<Student> al1=new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);

		ArrayList<Student> al2=new ArrayList<Student>();
		al2.add(s4);
		al2.add(s5);


		ArrayList<Student> al3=new ArrayList<Student>();
		al3.add(s6);
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);

		LinkedHashMap<String,ArrayList> hm =new LinkedHashMap<String,ArrayList>();

		hm.put("first", al1);
		hm.put("second", al2);
		hm.put("third", al3);

		ArrayList<Student> al= hm.get("first");
		Iterator<Student> it =al.iterator();
		while(it.hasNext()) {
			Student s =it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("-------------------------------");

		}

	}
}
