package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.annotation.beans.MessageBean;

@Configuration
public class MessageConfig {

	@Bean
	@Scope("prototype")
	public MessageBean getMessageBean() {
		MessageBean messagebean =new MessageBean();
		messagebean.setMessage("Hello world!!");
		return messagebean;
	}
}
