package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;

import com.capgemini.springcore.annotation.beans.DepartmentBean;

public class DepartmentConfig {

	@Bean(name = "Dev")
	public DepartmentBean getDevelopmentDept() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(901);
		departmentBean.setDeptName("Dev");
		return departmentBean;
	}

	@Bean(name = "Testing")
//	@Primary
	public DepartmentBean getTestingDept() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(902);
		departmentBean.setDeptName("Testing");
		return departmentBean;
	}

	@Bean(name = "HR")
	public DepartmentBean getHRDept() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(903);
		departmentBean.setDeptName("HR");
		return departmentBean;
	}
}
