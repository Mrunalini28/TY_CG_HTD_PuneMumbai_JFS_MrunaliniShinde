package com.capgemimi.corejava.interfaces;

public class testinterface implements interfaceEaxample {



	@Override
	public void add() {
		System.out.println("implemented method add");
	}

	public static void main(String[] args) {

		new testinterface().print();
		new testinterface().add();
		testinterface.sub();
		new testinterface().method();
	}
	public static void sub() {

		System.out.println("sub method");
	}

	@Override
	public void method() {
		System.out.println("abstract method");

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
