package com.example.processor;

import com.example.model.Employee;

public class EmployeeProcessor {
	
	public Employee empData(String empId) {
		Employee emp = new Employee();
		
		emp.setEmplId(empId);
		if(empId.contentEquals("123")) {
			emp.setEmpName("Gang");
			emp.setEmpDesignation("Delivery Manager");
		}
		
		if(empId.contentEquals("456")) {
			emp.setEmpName("Bhasker");
			emp.setEmpDesignation("Delivery Manager");
		}
		return emp;
	}

}

