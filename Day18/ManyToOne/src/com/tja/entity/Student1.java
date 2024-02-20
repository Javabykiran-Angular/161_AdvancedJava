package com.tja.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Student1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(unique = true)
	private String emailid;
	
	@ManyToOne
	@JoinColumn(name = "l_id")
	private Laptop1 laptop;
	
	
	
	
	public Laptop1 getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop1 laptop) {
		this.laptop = laptop;
	}


	public Student1() {
		
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
