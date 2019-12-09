package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeDeptTest {
	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig2.xml");
		EmployeeBean employeeBean = context.getBean("employee", EmployeeBean.class);

		System.out.println("Employee id: " + employeeBean.getEmpId());
		System.out.println("Employee Name: " + employeeBean.getEmpName());
		System.out.println("Dept id: " + employeeBean.getDeptBean().getDeptId());
		System.out.println("Dept id: " + employeeBean.getDeptBean().getDeptName());

	}
}