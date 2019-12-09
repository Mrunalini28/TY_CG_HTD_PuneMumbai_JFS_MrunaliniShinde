package com.capgemimi.corejava.interfaces;

public interface interfaceEaxample {
	 void print();

	abstract void method();

	static void sub() {

	}

	default void add() {
		System.out.println("add method");
	}
}
