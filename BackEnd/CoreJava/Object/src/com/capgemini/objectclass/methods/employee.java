package com.capgemini.objectclass.methods;

public class employee {
	int id;
	String name;
	double sal;
	char gender;
	
	public employee(int id, String name, double sal, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", sal=" + sal + ", gender=" + gender + "]";
	}

}
