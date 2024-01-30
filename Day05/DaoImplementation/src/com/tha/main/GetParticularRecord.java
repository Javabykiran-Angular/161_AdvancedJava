package com.tha.main;

import com.tha.dao.EmployeeDao;
import com.tha.entity.Employee;

public class GetParticularRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao=new EmployeeDao();
		Employee emp=  dao.getparticularRecordById(1);
		System.out.println(emp);
		

	}

}
