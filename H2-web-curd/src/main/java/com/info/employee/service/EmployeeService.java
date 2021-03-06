package com.info.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.info.employee.model.Employee;

@Service
public interface EmployeeService  {

	public List<Employee> getAllEmployeeDetails();
	
	public Employee AddEmployeeDetails(Employee employee);
	
}
