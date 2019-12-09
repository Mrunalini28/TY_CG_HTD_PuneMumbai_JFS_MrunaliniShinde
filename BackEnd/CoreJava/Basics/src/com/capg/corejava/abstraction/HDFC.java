package com.capg.corejava.abstraction;

public class HDFC implements ATM {

	@Override
	public void validateard() {
		System.out.println(".......connecting to DB of HDFC");
		System.out.println("validate the dataof HDFC");
	}

	@Override
	public void getinfo() {
		System.out.println(".......connecting to DB of HDFC");
		System.out.println("getting nfo from HDFC");

	}

}
