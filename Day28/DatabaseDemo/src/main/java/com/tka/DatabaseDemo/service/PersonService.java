package com.tka.DatabaseDemo.service;

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
	
}
