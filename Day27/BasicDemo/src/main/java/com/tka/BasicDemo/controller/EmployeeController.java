package com.tka.BasicDemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.BasicDemo.enity.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@PostMapping("/saveEmp")
	public String SaveRecord(@RequestBody Employee emp) {
		System.out.println(emp);
		return "Record is Received... "+emp;
	}
	
	@PutMapping("/updateemp/{kuchbhi}")
	public String UpdateRecord(@PathVariable("kuchbhi") int id,@RequestBody Employee emp) {
		
		System.out.println("Id is "+id+" Employee data "+emp);
		
		return "Record is Updatated";
	}
	
	@DeleteMapping("/deletApi/{id}")
	public String DeleteRecord(@PathVariable int id) {
		
		System.out.println("Id is "+id);
		return "Record id deleted of Id is "+id;
	}
	
	
	@PutMapping("/updateemp1")
	public String UpdateRecord1(@RequestParam("id") int id,@RequestBody Employee emp) {
		
		System.out.println("Id is "+id+" Employee data "+emp);
		
		return "Record is Updatated";
	}
	
	
	
	
	
	
}
