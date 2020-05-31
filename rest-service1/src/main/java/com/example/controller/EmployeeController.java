package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.processor.EmployeeProcessor;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setEmplId("123");
		emp.setEmpName("Ram");
		emp.setEmpDesignation("Project manager");
		return emp;
	}
	
	@GetMapping("/employeeDetails")
	public Employee getEmployeeDetails(@RequestParam(value = "empId") String empId) {
		Employee emp = new Employee();
		EmployeeProcessor empPro = new EmployeeProcessor();
		emp = empPro.empData(empId);
		return emp;
	}
}
