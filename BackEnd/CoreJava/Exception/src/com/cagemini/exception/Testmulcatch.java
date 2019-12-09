package com.cagemini.exception;

public class Testmulcatch {
	public static void main(String[] args) {
		System.out.println("main started");
		String k=null;
		int a[]= new int[3];
		try {
			System.out.println(k.length());
			System.out.println(a[5]);
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException|ArithmeticException | NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println("main ended");
	}
}