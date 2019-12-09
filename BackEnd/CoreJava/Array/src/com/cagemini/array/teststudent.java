package com.cagemini.array;

public class teststudent {

	public static void main(String[] args) 
	{
		student st[]=new student[5];
		student s1= new student(1, "anil");
		student s2= new student(2, "ram");
		student s3= new student(3, "priya");
		student s4= new student(4, "mrunal");
		st[1]=s1;
		st[2]=s2;
		st[3]=s3;  
		st[4]=s4;

		receive(st);

	}
	static void receive(student[] st)
	{
		for(student k:st) {
			System.out.println(k.id);
			System.out.println(k.name);
			System.out.println("--------------");
		}

	}
}
