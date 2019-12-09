package com.cagemini.exception;

public class IRCTC {
	void confirmed() {
		System.out.println("confirmed started");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException i) 
		{
			System.out.println("exception cought at confirmed");
		}
		System.out.println("confirmed ended");
	}
}
