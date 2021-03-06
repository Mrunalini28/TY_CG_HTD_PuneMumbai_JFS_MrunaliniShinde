package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBeans;

public class MessageTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
//		((AbstractApplicationContext)context).registerShutdownHook();
		
		MessageBeans messageBean = (MessageBeans)context.getBean("messageBean");
		
		((AbstractApplicationContext)context).close();
		
		System.out.println(messageBean.getMessage());
	}
}