package com.capg.corejava.abstraction;

public class Test {

	public static void main(String[] args) {
		machine m = new machine();
		HDFC h = new HDFC();
		ICICI i = new ICICI();
		m.slot(i);
		m.slot(h);
	}
}
