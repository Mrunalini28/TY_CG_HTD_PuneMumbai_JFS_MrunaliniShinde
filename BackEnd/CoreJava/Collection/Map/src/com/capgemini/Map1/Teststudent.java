package com.capgemini.Map1;

import java.util.ArrayList;

public class Teststudent {

	public static void main(String[] args) 
	{
		ArrayList<Student> al=new ArrayList<Student>();

		Student s1=new Student(1,"Mrunal",'f',93.5);
		Student s2=new Student(2,"Priya",'f',33.5);
		Student s3=new Student(3,"Divya",'f',21.5);
		Student s4=new Student(4,"Amruta",'f',73.5);
		Student s5=new Student(5,"Sid",'m',85.2);
		Student s6=new Student(6,"Anil",'m',22.2);
		Student s7=new Student(7,"shan",'m',62.5);
		Student s8=new Student(8,"Ram",'m',88.8);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		helper t=new helper();
		//t.displayAll(al);
		t.displayfailed(al);
		//t.displaytopper(al);
		//t.displaypassed(al);
	    //t.displaypassedByG(al,'m');
		//t.displayfailedByG(al, 'f');
	}

}
