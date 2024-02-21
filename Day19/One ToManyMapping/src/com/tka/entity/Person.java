package com.tka.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Person {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		String name;
		String mobileno;
		
		@OneToMany
		@JoinColumn
		List<Address> listAddress;
		
		public Person(){
			
		}
		
		
		
		
		public List<Address> getListAddress() {
			return listAddress;
		}




		public void setListAddress(List<Address> listAddress) {
			this.listAddress = listAddress;
		}




		public Person(int id, String name, String mobileno) {
			super();
			this.id = id;
			this.name = name;
			this.mobileno = mobileno;
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
		public String getMobileno() {
			return mobileno;
		}
		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}




		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", listAddress=" + listAddress
					+ "]";
		}
		
		
		
		
		
	
}
