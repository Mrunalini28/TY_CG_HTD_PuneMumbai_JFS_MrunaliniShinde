package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotation.beans.EmployeeBean;
import com.capgemini.springcore.annotation.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		((AbstractApplicationContext) context).registerShutdownHook();

		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		System.out.println("----Employee Info---");
		System.out.println("EmpId = " + employeeBean.getEmpId());
		System.out.println("EmpName = " + employeeBean.getEmpName());
		System.out.println("----Department Info---");
		System.out.println("DeptId = " + employeeBean.getDeptBean().getDeptId());
		System.out.println("DeptName = " + employeeBean.getDeptBean().getDeptName());

		// ((AbstractApplicationContext)context).close();
	}
}