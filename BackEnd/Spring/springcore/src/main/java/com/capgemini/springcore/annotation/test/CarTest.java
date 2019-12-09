package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotation.beans.Car;

public class CarTest {
	
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("carConfig.xml");
		Car car = context.getBean("mycar",Car.class);
		
		System.out.println("Model name : "+car.getModelName());
		System.out.println("Model Num : "+car.getModelNum());
		System.out.println("Engine CC : "+car.getEngine().getCC());
		System.out.println("Engine Type : "+car.getEngine().getType());
		
	}
}
