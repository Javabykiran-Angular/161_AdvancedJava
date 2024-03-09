package com.tka.DatabaseDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String fname;
	@Column(unique = true)
	String emailid;
	String mobileno;
	
	public Person() {
		
	}
	
	public Person(String fname, String emailid, String mobileno) {
		super();
		this.fname = fname;
		this.emailid = emailid;
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", emailid=" + emailid + ", mobileno=" + mobileno + "]";
	}
	
	
	

}
