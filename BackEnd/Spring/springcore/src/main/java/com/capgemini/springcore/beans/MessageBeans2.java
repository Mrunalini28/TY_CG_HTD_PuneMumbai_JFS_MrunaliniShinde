package com.capgemini.springcore.beans;

public class MessageBeans2 {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("its init phase..");
	}

	public void destroy() {
		System.out.println("its destroy phase..");
	}

}