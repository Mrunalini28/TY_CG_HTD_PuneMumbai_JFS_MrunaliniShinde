package com.cagemini.exception;

public class exp4 {

	public static void main(String[] args)
	{
		System.out.println("main started");
		int [] a=new int[4];

		try {
			System.out.println(a[1]);
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException i){
			System.out.println("dont cross the boundary");
		}
		catch(ArithmeticException e) {
			System.out.println("dont devide by zero");
		}
		System.out.println("main ended");
	}
}
