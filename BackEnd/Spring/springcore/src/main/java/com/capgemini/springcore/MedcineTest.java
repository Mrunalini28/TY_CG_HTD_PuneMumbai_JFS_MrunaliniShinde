package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Medicine;

public class MedcineTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("medicineConfig.xml");
		Medicine medicine = context.getBean("medicine", Medicine.class);
		System.out.println("Medicine Name: " + medicine.getName());
		System.out.println("Medicine Price: " + medicine.getPrice());
		System.out.println("Medicine Type: " + medicine.getType());
//		System.out.println("Medicine Drugs: " + medicine.getDrugs());
		System.out.println("Drugs content: "+medicine.getDrugsSet());

	}// End of main()
}// End of class