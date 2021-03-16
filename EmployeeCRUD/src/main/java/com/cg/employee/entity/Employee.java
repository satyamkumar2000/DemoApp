package com.cg.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {
	@Id
	@GeneratedValue
	@Column(length = 10)
	private int EmployeeId;
	@Column(length = 10)
	private String EmployeeName;
	@Column(length = 20)
	private String EmployeeSalary;

	public Employee(int EmployeeId, String EmployeeName, String EmployeeSalary) {
		super();
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		this.EmployeeSalary = EmployeeSalary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}

	public String getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(String EmployeeSalary) {
		this.EmployeeSalary = EmployeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeSalary=" + EmployeeSalary
				+ "]";
	}

	public Employee( String EmployeeName, String EmployeeSalary) {
		super();
		this.EmployeeName = EmployeeName;
		this.EmployeeSalary = EmployeeSalary;
	}

}