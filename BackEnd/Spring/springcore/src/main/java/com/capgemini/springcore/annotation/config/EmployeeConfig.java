package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.capgemini.springcore.annotation.beans.EmployeeBean;

@Import(DepartmentConfig.class)

@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(101);
		employeeBean.setEmpName("Mrunalini");
		return employeeBean;
	}// end of getemployeeBean
}