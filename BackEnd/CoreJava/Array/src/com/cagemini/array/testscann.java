package com.cagemini.array;

import java.util.Scanner;

public class testscann {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name ");
		String name=sc.nextLine();
		
		System.out.println("enter the age ");
		int age =sc.nextInt();
		
		System.out.println("enter the height ");
		double height =sc.nextDouble();
		System.out.println("name is:"+name);
		System.out.println("age is"+age);
		System.out.println("height is:"+height);	
		sc.close();
	}
}
