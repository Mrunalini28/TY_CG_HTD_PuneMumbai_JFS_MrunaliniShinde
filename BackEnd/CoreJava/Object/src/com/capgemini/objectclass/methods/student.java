package com.capgemini.objectclass.methods;

public class student {
	int id;
	String name;
	double percentage;
	public student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	public String toString() {
		return "name: "+name+"id:"+id+"percentage:"+percentage;
	}

}
