package com.capgemini.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboot.beans.EmployeeInfoBean;
import com.capgemini.springboot.beans.EmployeeResponse;
import com.capgemini.springboot.service.EmployeeService;

//@Controller
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/getEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	public EmployeeResponse getEmployee(int empId) {

		EmployeeInfoBean employeeInfoBean= service.getEmployee(empId);
		EmployeeResponse response=new EmployeeResponse();
		
		if (employeeInfoBean !=null) {
			response.setStatusCode(210);
			response.setMessage("success");
			response.setDescription("Employee Record Found...");
			response.setEmployeeInfoBean(employeeInfoBean);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee Id"+empId+ "Not Found!!");
		}
		return response;
		

	}// End of getEmployee()

	@PutMapping(path = "/addEmployee", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isadded = service.addEmployee(employeeInfoBean);

		EmployeeResponse response = new EmployeeResponse();

		if (isadded) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Employee added successfully...");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Add Employee!!");
		}
		return response;

	}// End of addEmployee()

	@DeleteMapping(path = "/deleteEmployee/{employeeId}",
			produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody
	public EmployeeResponse deleteEmployee(@PathVariable("employeeId") int empId) {
		boolean isdeleted = service.deleteEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();

		if (isdeleted) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Employee deleted successfully...");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to delete Employee!!");
		}
		return response;

	}// End of deleteEmployee()

	@PostMapping(path = "/updateEmployee", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	// @RequestMapping
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isupdate= service.updateEmployee(employeeInfoBean);
		
		EmployeeResponse response = new EmployeeResponse();

		if (isupdate) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Employee update successfully...");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to update Employee!!");
		}
		return response;

	} // End of updateEmployee()

	@GetMapping(path = "/getAll", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	// @RequestMapping
	public EmployeeResponse getAllEmployees() {
		List<EmployeeInfoBean> employeeList= service.getAllEmployees();
		
		EmployeeResponse response= new EmployeeResponse();
		
		if (employeeList !=null && !employeeList.isEmpty()) {
			response.setStatusCode(210);
			response.setMessage("success");
			response.setDescription("Employee Record Found...");
			response.setEmplyeesList(employeeList);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to fetch Employee Records!!");
		}
		return response;
		

	}// End of getAllEmployees()

}// End of class
