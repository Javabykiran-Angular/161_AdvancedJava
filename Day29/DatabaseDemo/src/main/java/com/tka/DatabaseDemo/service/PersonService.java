package com.tka.DatabaseDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.DatabaseDemo.dao.PersonDao;
import com.tka.DatabaseDemo.entity.Person;

@Service
public class PersonService {

	@Autowired
	PersonDao dao;
	
	public String InsertData(Person p) {
		
			String msg= dao.insertData(p);
			return msg;
		
	}
	
	
	public String Updatedata(int id,Person p) {
		String msg= dao.updateData(id, p);
		return msg;
		
	}
	
	public String DeleteData(int id) {
		
		String msg= dao.deleteData(id);
		return msg;
		
	}
	
	public Person getParticularRecord(int id) {
		Person p= dao.getParticularRecord(id);
		return p;
	}
	
	
	public List<Person> getAllRecord(){
		 List<Person> list= dao.getAllRecord();
		 return list;
	}
	
	
}
