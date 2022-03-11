package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "employee", schema = "public")
public class Employee {
	@Id
	private String empid;
	private String name;
	private String designation;
	private String salary;

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpId(String empid) {
		this.empid = empid;
	}

}