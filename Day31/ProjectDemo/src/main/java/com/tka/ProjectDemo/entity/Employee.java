package com.tka.ProjectDemo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	private String name;
	private String phoneno;
	private String department;
	private String status;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createddtm;
	
	private String createdby;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateddtm;
	
	private String updatedby;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cid")
	private Country country;
	
	public Employee() {
		
	}

	public Employee(String name, String phoneno, String department, String status, Date createddtm, String createdby,
			Date updateddtm, String updatedby, Country country) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.department = department;
		this.status = status;
		this.createddtm = createddtm;
		this.createdby = createdby;
		this.updateddtm = updateddtm;
		this.updatedby = updatedby;
		this.country = country;
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

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateddtm() {
		return createddtm;
	}

	public void setCreateddtm(Date createddtm) {
		this.createddtm = createddtm;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getUpdateddtm() {
		return updateddtm;
	}

	public void setUpdateddtm(Date updateddtm) {
		this.updateddtm = updateddtm;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", department=" + department
				+ ", status=" + status + ", createddtm=" + createddtm + ", createdby=" + createdby + ", updateddtm="
				+ updateddtm + ", updatedby=" + updatedby + ", country=" + country + "]";
	}
	
	
	
	
	
	

}
