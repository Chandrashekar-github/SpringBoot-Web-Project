package com.info.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.info.employee.model.Employee;
import com.info.employee.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/home")
	public ModelAndView getEmployeeDetails(ModelAndView  model) {
		
		model.addObject("employee", employeeService.getAllEmployeeDetails());
		model.setViewName("home");
		return model;

	}

	/*
	 * @GetMapping("/employeeAdd") public String insertEmployeeDetails(Model model)
	 * { Employee employee = new Employee();
	 * 
	 * model.addAttribute("employee", employee); return "insert"; }
	 */
	@PostMapping("/employeeAdd")
	public ModelAndView  saveEmployee(@ModelAttribute("employee") Employee employee) {

		employeeService.AddEmployeeDetails(employee);
		return new ModelAndView("redirect:/home");

	}

}
