package com.cg.employee.repository;

import java.util.List;

import com.cg.employee.entity.Employee;

public interface EmployeeDao {
	int addEmployee(Employee Employee);

	Employee updateEmployee(Employee Employee);

	void removeEmployee(int EmployeeId);

	Employee getEmployeeById(int EmployeeId);

	List<Employee> getAllEmployees();
}
