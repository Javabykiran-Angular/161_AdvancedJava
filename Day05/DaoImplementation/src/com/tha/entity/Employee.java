package com.tha.entity;

public class Employee {
	
	int id;
	String fname;
	String lname;
	String mobileno;
	
	public Employee( String fname, String lname, String mobileno) {
		super();		
		this.fname = fname;
		this.lname = lname;
		this.mobileno = mobileno;
	}
	
	public Employee() {
		System.out.println("Employee parameter less constructor is called ");
	}
	
	
	public Employee(int id, String fname, String lname, String mobileno) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mobileno = mobileno;
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
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mobileno=" + mobileno + "]";
	}
	
	
	
	
	

}
