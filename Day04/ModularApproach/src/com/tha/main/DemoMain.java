package com.tha.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.tha.entity.Employee;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee( "Yash", "Pawaskar", "7895236987");
		System.out.println(emp);
		
		try {
			//Step1 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/161batch","root","Sumit@123");
			
			PreparedStatement pst= 
					con.prepareStatement("insert into employee(fname,lname,mobileno) values(?,?,?)");
			
			pst.setString(1, emp.getFname());
			pst.setString(2, emp.getLname());
			pst.setString(3, emp.getMobileno());
			
			 int status=pst.executeUpdate();
			
			 if(status>0) {
				 
				 System.out.println("Data is Inserted");
				 
			 }else {
				 System.out.println("Data is not Inserted");
			 }
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
