package com.cagemini.exp2;

import java.util.Scanner;

public class scan1 
{
    public static void main(String[] args) 
	{
		try(Scanner c=new Scanner(System.in)) //try resource
		{
			System.out.println("enter the age");
			int age=c.nextInt();
			System.out.println("age is"+age);
		}
	}
}