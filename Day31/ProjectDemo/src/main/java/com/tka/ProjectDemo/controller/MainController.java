package com.tka.ProjectDemo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.ProjectDemo.entity.Country;
import com.tka.ProjectDemo.entity.Employee;
import com.tka.ProjectDemo.entity.User;
import com.tka.ProjectDemo.service.MainService;

@CrossOrigin
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
	
	@PutMapping("/updateEmp")
	public String updateEmployee(@RequestBody Employee e) {
		
		String msg= service.updateEmployee(e);
		
		return msg;
		
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmployee(@PathVariable int id) {
		
		String msg= service.deletEmployee(id);
		return msg;
		
	}
	
	@GetMapping("/getparticularEmp/{id}")
	public Employee getParticularEmployeeById(@PathVariable int id) {
		
		Employee emp= service.getParticularEmpByID(id);
		return emp;
		
	}
	
	@GetMapping("/getallEmp")
	public List<Employee> getAllEmployee(){
		
		List<Employee> empList= service.getAllEmp();
		
		return empList;
		
	}
	
	@GetMapping("/getByStatus/{status}")
	public List<Employee> getAllEmpByStatus(@PathVariable String status) {
		
		List<Employee> list= service.getAllEmpByStatus(status);
		return list;
		
	}
	
	@PostMapping("/loginApi")
	public HashMap checkUser(@RequestBody Employee emp) {
		
		HashMap map= service.checkUser(emp);
		return map;
		
	}
	
	
	@PostMapping("/loginuser")
	public HashMap loginUser(@RequestBody User user) {
		
		HashMap map= service.loginUser(user);
		return map;
		
	}
	
	
	
	

}
