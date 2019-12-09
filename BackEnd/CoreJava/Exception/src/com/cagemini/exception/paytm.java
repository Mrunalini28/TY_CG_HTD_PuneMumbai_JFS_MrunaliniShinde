package com.cagemini.exception;

public class paytm {
	void book() {
		System.out.println("book started");
		IRCTC t=new IRCTC();
		try {
			t.confirmed();
		}	
		catch(ArithmeticException s) 
		{
			System.out.println("exception cought at book");
		}

		System.out.println("book ended");
	}

}
