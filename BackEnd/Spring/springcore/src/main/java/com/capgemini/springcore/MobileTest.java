package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Mobile;

public class MobileTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mobile = context.getBean("mobile", Mobile.class);

		System.out.println("Mobile Brand Name: " + mobile.getBrandName());
		System.out.println("Mobile Model Name: " + mobile.getModelName());
		System.out.println("Mobile price: " + mobile.getPrice());
		System.out.println("Mobile Display Size: " + mobile.getMobileDisplay().getDisplaySize());
		System.out.println("Mobile Resolution: " + mobile.getMobileDisplay().getResolution());
	}

}
