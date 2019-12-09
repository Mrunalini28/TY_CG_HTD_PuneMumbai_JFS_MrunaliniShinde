package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotation.beans.Isuzu;
import com.capgemini.springcore.annotation.beans.VolksWagon;
import com.capgemini.springcore.interfaces.Engine;

@Configuration
public class EngineConfig {

	@Bean(name = "isuzu")
	@Primary
	public Engine getIsuzu() {
		return new Isuzu();
	}

	@Bean(name = "VW")
	public Engine getVW() {
		return new VolksWagon();
	}
}
