package com.tka.BasicDemo.enity;


public class Employee {

	int id;
	String fname;
	
	public Employee() {
		
	}
	
	public Employee(int id, String fname) {
		super();
		this.id = id;
		this.fname = fname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + "]";
	}
	
	
	
}
