package com.tka.entity;

import org.springframework.stereotype.Component;

import com.tka.utility.Sim;

@Component("airtel")
public class Airtel implements Sim 
{

	@Override
	public String calling() {
		// TODO Auto-generated method stub
		return "U R calling Airtel";
	}

}
