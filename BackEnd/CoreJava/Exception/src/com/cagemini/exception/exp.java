package com.cagemini.exception;

public class exp {
	public static void main(String[] args) {
		System.out.println("main started");
		int [] a=new int [3];

		try {
			System.out.println(a[7]);

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("dont cross the index");
		}
		System.out.println("main ended");
	}
}

