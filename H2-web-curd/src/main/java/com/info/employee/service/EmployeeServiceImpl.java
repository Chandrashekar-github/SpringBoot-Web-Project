package com.info.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.info.employee.model.Employee;
import com.info.employee.repository.EmployeeRepository;
@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployeeDetails() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee AddEmployeeDetails(Employee employee) {
		return employeeRepository.save(employee);
	}

}
