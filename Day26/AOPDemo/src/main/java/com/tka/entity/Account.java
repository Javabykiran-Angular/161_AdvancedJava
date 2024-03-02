package com.tka.entity;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	public void depoist() {
		System.out.println("U r Amount is Depoisted");
	}
	
	public void depoist1(double amt) {
		System.out.println("U r "+amt +" Amount is Depoisted");
	}
	
	public void withdraw() {
		System.out.println("Amount is withdrwa....");
	}

}
