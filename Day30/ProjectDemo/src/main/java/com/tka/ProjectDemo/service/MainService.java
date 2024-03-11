package com.tka.ProjectDemo.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.ProjectDemo.dao.MainDao;
import com.tka.ProjectDemo.entity.Country;
import com.tka.ProjectDemo.entity.Employee;

@Service
public class MainService {
	
	@Autowired
	MainDao dao;

	public String addCountry(Country c) {
		String msg= dao.addCountry(c);
		
		if(Objects.isNull(msg)) {
			msg="Data is not Addedd Succefully..";
		}
		
		return msg;
	}

	public String updateCountry(Country c) {
		String msg= dao.updateCountry(c);
		
		if(Objects.isNull(msg)) {
			msg="Data is Not Updatated...";
		}
		
		return msg;
		
	}

	public String addEmployee(Employee e) {
			String msg= dao.addEmployee(e);
			
			if(Objects.isNull(msg)) {
				msg="Record is not be Added...";
			}
			
		return msg;
	}

	
	
}
