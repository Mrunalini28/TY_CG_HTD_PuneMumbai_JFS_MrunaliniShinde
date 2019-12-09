package com.capgemini.Map1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class helper
{
	void displayAll(ArrayList<Student> a)
	{
		Iterator<Student> it=a.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("gender is: "+s.gender);
			System.out.println("----------------------");
		}
	}
	void displaypassed(ArrayList<Student> a)
	{ 
		List<Student> li= a.stream().filter(i -> i.percentage >=35 ).collect(Collectors.toList());

		Iterator<Student> it=li.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("gender is: "+s.gender);
			System.out.println("----------------------");
		}
	}
	void displayfailed(ArrayList<Student> a)
	{
		List<Student> li= a.stream().filter(i -> i.percentage < 35 ).collect(Collectors.toList());

		Iterator<Student> it=li.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("gender is: "+s.gender);
			System.out.println("----------------------");
		}
	}
	void displaytopper(ArrayList<Student> a)
	{
		Comparator<Student> li= (i,j) ->{
			Double x= i.percentage;
			Double y= j.percentage;
			return x.compareTo(y);
		};
		Student s=a.stream().max(li).get();
		System.out.println("name is: "+s.name);
		System.out.println("id is: "+s.id);
		System.out.println("percentage is: "+s.percentage);
		System.out.println("gender is: "+s.gender);
		System.out.println("----------------------");
	}
	void displayfailedByG(ArrayList<Student> a,char g)
	{
		List<Student> li= a.stream().filter(i -> (i.percentage <= 35 )&&(i.gender == 'm')).collect(Collectors.toList());

		Iterator<Student> it=a.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("gender is: "+s.gender);
			System.out.println("----------------------");
		}
	}
	void displaypassedByG(ArrayList<Student> a,char g)
	{ 
		List<Student> li= a.stream().filter(i -> (i.percentage >=35 ) &&(i.gender == 'm') ).collect(Collectors.toList());

		Iterator<Student> it=li.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("gender is: "+s.gender);
			System.out.println("----------------------");
		}
	}
}
