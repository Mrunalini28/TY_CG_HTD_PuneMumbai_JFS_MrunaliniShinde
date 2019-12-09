package com.cagemini.exception;

public class exp3 {

	public static void main(String[] args) 
	{
		System.out.println("main started");

		try {
			System.out.println(10/2);
			System.out.println("hi");
			System.out.println(10/0);
			System.out.println("hello");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Exception handled");
		}
		System.out.println("main ended");
	}
}
