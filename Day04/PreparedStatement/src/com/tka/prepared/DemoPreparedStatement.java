package com.tka.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DemoPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		//Step1 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/161batch","root","Sumit@123");
		
//PreparedStatement  pst= 
//con.prepareStatement("insert into employee(fname,lname,mobileno) values(?,?,?)");
//
//
//	
//		pst.setString(1, "Akash");
//		pst.setString(2, "Shinde");
//		pst.setString(3, "7894561239");
//	
//		
//		int status=pst.executeUpdate();
//		
//		if(status>0) {
//			
//			System.out.println("Row is inserted...");
//			
//		}else {
//			System.out.println("Row is not inserted...");
//		}
		
//		PreparedStatement pst=con.prepareStatement("update employee set fname=?, mobileno=? where id=?");
//		
//		pst.setString(1, "Ashok");
//		pst.setString(2, "7894563258");
//		pst.setInt(3, 4);
//		
//		int status1=pst.executeUpdate();
//		
//		if(status1>0) {
////			
//			System.out.println("Row is Updatated...");
//			
//		}else {
//			System.out.println("Row is not Updatated...");
//		}
		
//		PreparedStatement pst=con.prepareStatement("select * from employee");
//		
//		ResultSet rst= pst.executeQuery();
//			
//		while(rst.next()) {
//			int id= rst.getInt("id");
//			String fname= rst.getString("fname");
//			String lname= rst.getString("lname");
//			String mobileno= rst.getString("mobileno");
//			System.out.println("id=> "+id+" First name => "+fname+" Last name> "+lname+" Mobile No=> "+mobileno);
//			
//		}
//		rst.close();
		
		PreparedStatement pst=con.prepareStatement("select * from employee where fname=? and id=?");
		pst.setString(1, "Ashok");
		pst.setInt(2, 4);
		
		ResultSet rst= pst.executeQuery();
		
		while(rst.next()) {
			int id= rst.getInt("id");
			String fname= rst.getString("fname");
			String lname= rst.getString("lname");
			String mobileno= rst.getString("mobileno");
			System.out.println("id=> "+id+" First name => "+fname+" Last name> "+lname+" Mobile No=> "+mobileno);
		}
		
		
		
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}

	}

}
