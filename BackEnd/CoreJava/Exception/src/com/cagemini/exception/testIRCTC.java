package com.cagemini.exception;

public class testIRCTC {

	public static void main(String[] args) {
		System.out.println("main started");
		paytm b=new paytm();
		try
		{
		b.book();
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception cought at main");
		}
		
		System.out.println("main ended");
	}
}