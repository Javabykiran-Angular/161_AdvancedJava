package com.tka.DatabaseDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.DatabaseDemo.entity.Person;
import com.tka.DatabaseDemo.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@PostMapping("/savedata")
	public String saveRecord(@RequestBody Person p) {
		
		String msg= service.InsertData(p);
		
		return msg;
		
	}
	
	@PutMapping("/updatedata/{id}")
	public String UpdateRecors(@PathVariable int id,@RequestBody Person p) {
		
		String msg= service.Updatedata(id, p);
		return msg;
		
	}
	
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable int id) {
		String msg= service.DeleteData(id);
		return msg;
	}
	
	@GetMapping("/getparticulardata/{id}")
	public Person getParticularRecordById(@PathVariable int id) {
		
		Person p= service.getParticularRecord(id);
		return p;		
	}
	
	@GetMapping("/getAll")
	public List<Person> getAllRecord(){
		
		List<Person> list= service.getAllRecord();
		return list;
		
	}
	
	

	
	
	

}
