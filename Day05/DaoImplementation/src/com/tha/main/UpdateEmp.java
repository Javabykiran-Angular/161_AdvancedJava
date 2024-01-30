package com.tha.main;

import com.tha.dao.EmployeeDao;
import com.tha.entity.Employee;

public class UpdateEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		
		emp.setId(3);
		emp.setFname("Spruha123");
		
		
		EmployeeDao dao=new EmployeeDao();
		
		int status=dao.updatedata(emp);
		
				if(status>0) {
					System.out.println("Data is updated");
				}else {
					System.out.println("Data is not updated");
				}
		

	}

}
