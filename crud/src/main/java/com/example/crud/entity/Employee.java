package com.example.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//Entity is the class which makes columns and forms tables in Mysql
@Entity
public class Employee {

	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private long empid;
	
	public Employee() {

	// TODO Auto-generated constructor stub
}

	public Employee(long empid, String empname, float empsalary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empsalary = empsalary;
}

	public long getEmpid() {
	return empid;
}

public void setEmpid(long empid) {
	this.empid = empid;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public float getEmpsalary() {
	return empsalary;
}

public void setEmpsalary(float empsalary) {
	this.empsalary = empsalary;
}

	private String empname;
	
	private float empsalary;
	
}
