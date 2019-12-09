package com.capgemini.fuctionalinterface;

import java.util.function.Function;

public class Testfunctionalinterface {

	public static void main(String[] args) {
		Function<Integer,Student> f= i->{
			Student s=new Student();
			s.id=1;
			return s;	
		};
		Student s=f.apply(10);
		System.out.println("id is:"+s.id);
		System.out.println("percentage is:"+s.percentage);
	}
}
