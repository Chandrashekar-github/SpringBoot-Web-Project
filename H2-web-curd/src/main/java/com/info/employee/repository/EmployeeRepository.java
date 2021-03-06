package com.info.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
