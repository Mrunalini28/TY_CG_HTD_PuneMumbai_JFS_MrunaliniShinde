package com.capgemini.springcore.beans;

public class EmployeeBean {
	private int empId;
	private String empName;
	private DepartmentBean deptBean;

	// constructor with all arguments

	public EmployeeBean(int empId, String empName, DepartmentBean deptBean) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptBean = deptBean;
	}

	// getter and setter method
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public DepartmentBean getDeptBean() {
		return deptBean;
	}

	public void setDeptBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}

}
