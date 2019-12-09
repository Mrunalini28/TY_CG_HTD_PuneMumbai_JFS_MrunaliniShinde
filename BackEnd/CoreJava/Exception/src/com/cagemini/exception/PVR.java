package com.cagemini.exception;

public class PVR {
	void comfirm() 
	{
		System.out.println("con syarted");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException i) {
			System.out.println("exception cought at confirme");
			throw i;
		}
		finally {
			System.out.println("confirme ended");
		}
	}
}
