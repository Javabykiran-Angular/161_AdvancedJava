package com.tha.main;

import com.tha.dao.EmployeeDao;
import com.tha.entity.Employee;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee("Samrath", "Deshmukh", "7895246315");
		
		
		EmployeeDao dao=new EmployeeDao();
		int status=dao.insertData(emp);
		if(status>0) {
			System.out.println("Data is Inserted");
		}else{
			System.out.println("Data is not Inserted");
		}

	}

}
