package com.capgemini.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBeans implements InitializingBean,DisposableBean {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void afterPropertiesSet() throws Exception {
     System.out.println("initialization phase");		
	}

	public void destroy() throws Exception {
    System.out.println("Destroy phase");		
	}
	
	
}