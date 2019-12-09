package com.capg.corejava.abstraction;

public class ICICI implements ATM {

	@Override
	public void validateard() {
		System.out.println(".......connecting to DB of ICICI");
		System.out.println("validate the dataof ICICI");

	}

	@Override
	public void getinfo() {
		System.out.println(".......connecting to DB of ICICI");
		System.out.println("getting nfo from ICICI");
	}

}
