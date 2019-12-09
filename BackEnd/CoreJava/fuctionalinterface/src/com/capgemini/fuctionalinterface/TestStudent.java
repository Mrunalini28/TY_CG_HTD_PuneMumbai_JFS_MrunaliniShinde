package com.capgemini.fuctionalinterface;

import java.util.function.Predicate;

public class TestStudent {

	public static void main(String[] args) 
	{
		
		Predicate<Student> p= k-> 
		{
			if(k.percentage >= 35) 
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		
		Student s1=new Student(1,22.5);
		Student s2=new Student(2,92.5);
		boolean res=p.test(s1);
		System.out.println("result is: "+res);
	}

}
