package com.cagemini.collectionframework.list;

import java.util.ArrayList;

public class Teststudent {

	public static void main(String[] args) 
	{
		ArrayList<Student> al =new ArrayList<Student>();

		Student s1=new Student("abc",1,5.5,88.8,20);
		Student s2=new Student("def",2,4.9,66.8,21);
		Student s3=new Student("xyz",3,5.3,74.2,20);
		Student s4=new Student("mnp",4,5.8,64.5,22);
		Student s5=new Student("hgf",5,5.4,91.8,19);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		for (int i=0;i<5;i++) {

			Student s= al.get(i);
			System.out.println("name is:"+s.name);
			System.out.println("id is:"+s.id);
			System.out.println("height is:"+s.height);
			System.out.println("percentage is:"+s.percentage);
			System.out.println("age is:"+s.age);
			System.out.println("----------------------------");
		}

	}

}
