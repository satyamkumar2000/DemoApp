package com.cg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employee.entity.Employee;
import com.cg.employee.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl service;
	@GetMapping("/getEmployee/{eid}")
	public Employee getEmployeeById(@PathVariable("eid") int EmployeeId) {
		return service.getEmployeeById(EmployeeId);
	}
	@PostMapping("/addEmployee")
	public int addEmployee(@RequestBody Employee Employee) {
		return service.addEmployee(Employee);
	}
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee Employee) {
		return service.updateEmployee(Employee);
	}
	@DeleteMapping("/deleteEmployee/{eid}")
	public void deleteEmployee(@PathVariable("eid") int EmployeeId) {
		service.removeEmployee(EmployeeId);
		return;
	}
	@GetMapping("/getAllEmployees")
	public List<Employee> fetchAllEmployees() {
		return service.getAllEmployees();
		
	}
}
