package com.tja.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(unique = true)
	private String emailid;
	
	@OneToOne
	private Laptop laptop;
	
	
	
	
	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	public Student() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", emailid=" + emailid + ", laptop=" + laptop + "]";
	}
	
	
	
	

}
