package com.capgemini.fuctionalinterface;

import java.util.function.Consumer;

public class Test4consumer {

	public static void main(String[] args) 
	{
    Consumer<Student> c= (s) ->{
    	
    System.out.println("id is:"+s.id);
    System.out.println("percentage is:"+s.percentage);	
    };
    Student s1=new Student(1,86.5);
    c.accept(s1);
	}
}
