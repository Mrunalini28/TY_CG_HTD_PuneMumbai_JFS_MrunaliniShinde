package com.capgemini.objectclass.methods;

public abstract class testA {

	public static void main(String[] args) {
		pen p=new pen();
		int add =p.hashCode();
		System.out.println("address "+add);
		
		System.out.println(p);
		
		pen2 k=new pen2();
		int add2 =k.hashCode();
		System.out.println("address "+add2);
	}
}
