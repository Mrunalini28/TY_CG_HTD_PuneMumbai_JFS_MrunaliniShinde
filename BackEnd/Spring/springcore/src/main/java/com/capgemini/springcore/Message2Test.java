package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBeans2;

public class Message2Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		MessageBeans2 messageBeans2 = context.getBean("messageBean2", MessageBeans2.class);

		System.out.println("Message: " + messageBeans2.getMessage());
		
		MessageBeans2 Beans2 = context.getBean("messageBean2", MessageBeans2.class);
		System.out.println("Message: " + Beans2.getMessage());
		
		((AbstractApplicationContext) context).close();
	}
}