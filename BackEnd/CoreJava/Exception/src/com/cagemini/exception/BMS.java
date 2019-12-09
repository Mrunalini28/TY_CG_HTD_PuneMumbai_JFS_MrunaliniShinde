package com.cagemini.exception;

public class BMS {

	public static void main(String[] args) {
		PVR p=new PVR();
		try {
			p.comfirm();
		} 
		catch(ArithmeticException e) 
		{
			System.out.println("exception cought at BMS");
		}
		System.out.println("main ended");
	}
}
