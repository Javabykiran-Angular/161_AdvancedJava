package com.tka.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	int id;
	String city;
	
	
	public Address() {}
	
	public Address(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + "]";
	}
	
	
	

}
