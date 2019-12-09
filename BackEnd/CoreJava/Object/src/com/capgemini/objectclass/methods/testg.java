package com.capgemini.objectclass.methods;

public class testg {
	public static void main(String[] args) throws CloneNotSupportedException {
		marker m=new marker(1, "null");

		System.out.println("id is"+m.id);
		System.out.println("name is"+m.name);
		System.out.println("--------");

		Object b=m.clone();
		marker k=(marker)b;
		System.out.println(k.id);

	}

}
