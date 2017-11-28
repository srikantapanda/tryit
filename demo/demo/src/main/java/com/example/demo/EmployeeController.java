package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping(path="/employee/1")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeId(1);
		employee.setEmployeeName("srikanta panda");
		return employee;
	}
	
	@GetMapping(path="/employees")
	public List<Employee> getEmployees() {
		return null;
	}
	
}
