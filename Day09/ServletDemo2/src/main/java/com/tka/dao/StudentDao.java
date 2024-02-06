package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tka.entity.Student;

public class StudentDao {
	
	final String Driver_Name="com.mysql.cj.jdbc.Driver";
	final String Db_Connection_URL="jdbc:mysql://localhost:3306/161batch";
	final String DB_User="root";
	final String DB_Password="Sumit@123";
	
	Connection con;
	PreparedStatement pst;
	ResultSet rst;
	
	// Step 1 &2 
	public void openDb() {
		try {
		Class.forName(Driver_Name);
		
			con= DriverManager.getConnection(Db_Connection_URL,DB_User,DB_Password);
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	
	public Student checkUser(String username,String password) {
		String query="select * from student where username=? and password=?";
		Student stud=null;
		
		try {
			openDb();
			pst= con.prepareStatement(query);
			
			pst.setString(1, username);
			pst.setString(2,password);
			
			rst=pst.executeQuery();
			
			while(rst.next()) {
				stud=new Student();
				
				stud.setId(rst.getInt("id"));
				stud.setUsername(rst.getString("username"));
				stud.setPassword(rst.getString("password"));
				stud.setFname(rst.getString("fname"));
				
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeDb();
		}
		
		return stud;
		
		
	}
	
	
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
