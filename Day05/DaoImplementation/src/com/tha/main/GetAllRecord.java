package com.tha.main;

import java.util.List;

import com.tha.dao.EmployeeDao;
import com.tha.entity.Employee;

public class GetAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao=new EmployeeDao();
		List<Employee> list= dao.getAllRecord();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		

	}

}
