package com.cagemini.exception;

public class exp2 {

	public static void main(String[] args) {
		System.out.println("main started");

		try {
			System.out.println(10/0);

		}
		catch(ArithmeticException e) {
			System.out.println("handled");
		}
		System.out.println("main ended");

	}

}
