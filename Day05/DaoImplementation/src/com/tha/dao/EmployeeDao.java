package com.tha.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tha.entity.Employee;

public class EmployeeDao {
	
	final String Driver_Name="com.mysql.cj.jdbc.Driver";
	final String Db_Connection_URL="jdbc:mysql://localhost:3306/161batch";
	final String DB_User="root";
	final String DB_Password="Sumit@123";
	
	Connection con;
	PreparedStatement pst;
	ResultSet rst;
	
	//Step 1 &2 
	public void openDb() {
		try{
		Class.forName(Driver_Name);
		con=DriverManager.getConnection(Db_Connection_URL,DB_User,DB_Password);
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	public int insertData(Employee emp) {
		String query="insert into employee(fname,lname,mobileno) values(?,?,?)";
		int status=0;
		try {
			openDb();
		pst=con.prepareStatement(query);
			pst.setString(1, emp.getFname());
			pst.setString(2, emp.getLname());
			pst.setString(3, emp.getMobileno());
			
			status=pst.executeUpdate();
			closeDb();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
		
		
	}
	
	
	public int updatedata(Employee emp) {
		String query="update employee set fname=? where id=?";
		int status=0;
		
		try {
			
			openDb();
			
			pst=con.prepareStatement(query);
			pst.setString(1, emp.getFname());
			pst.setInt(2, emp.getId());
			
			status=pst.executeUpdate();
			
			closeDb();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
		
	}
	
	
	public List<Employee> getAllRecord() {
		String query="select * from employee";
		List<Employee> list=null;
		
		try {
			
			openDb();
			
			pst= con.prepareStatement(query);
			
			rst= pst.executeQuery();
			
			 list=new ArrayList<Employee>();
			
			while(rst.next()) {
				Employee emp=new Employee();
				
				emp.setId(rst.getInt("id"));
				emp.setFname(rst.getString("fname"));
				emp.setLname(rst.getString("lname"));
				emp.setMobileno(rst.getString("mobileno"));
				list.add(emp);
				
				
			}
			closeDb();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
		
	}
	
	public Employee getparticularRecordById(int id) {
		
		String query="select * from employee where id=?";
		Employee emp=null;
		try {
			openDb();
		 pst=con.prepareStatement(query);
		 
		 pst.setInt(1, id);
		 
		 	rst=pst.executeQuery();
		 	while(rst.next()) {
		 		emp=new Employee();
		 		emp.setId(rst.getInt("id"));
		 		emp.setFname(rst.getString("fname"));
		 		emp.setLname(rst.getString("lname"));
		 		emp.setMobileno(rst.getString("mobileno"));
		 		System.out.println(emp);
		 	}
		 	
		 	closeDb();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return emp;
		
	}
	
	
	
	//Step 5
	public void closeDb() {
		
		try {
		if(con!=null) {
			con.close();
			con=null;
			}
		if(pst!=null) {
			pst.close();
			pst=null;
			
		}
		
		if(rst!=null) {
			rst.close();
			rst=null;
		}
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	

}
