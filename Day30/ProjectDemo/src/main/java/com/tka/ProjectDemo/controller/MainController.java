package com.tka.ProjectDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.ProjectDemo.entity.Country;
import com.tka.ProjectDemo.entity.Employee;
import com.tka.ProjectDemo.service.MainService;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	MainService service;
	//API 1
	@PostMapping("/addcountry")
	public String addCountry(@RequestBody Country c) {
		String msg= service.addCountry(c);
		return msg;
	}
	
	//API 2
	@PutMapping("/updateCountry")
	public String updateCountry(@RequestBody Country c) {
		 String msg= service.updateCountry(c);
		 return msg;		
	}
	
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee e) {
		String msg= service.addEmployee(e);
		return msg;
	}
	
	

}
