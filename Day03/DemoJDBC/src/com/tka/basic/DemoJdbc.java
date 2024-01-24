package com.tka.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		
		// Step 1 load & register 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// Step 2 Get JDBC connection 
		 con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/161batch", "root", "Sumit@123");
			
		// Step 3 Create JDBC statement
			
		Statement stmt= con.createStatement();
		
		//Step 4 Execute Query 
		//int status=stmt.executeUpdate("insert into employee(fname,lname,mobileno) values('Spruha','Raokhande','7854123697')");
		
//		if(status>0) {
//			System.out.println("Record is inserted Successfully ");
//		}else {
//			System.out.println("Record is not inserted Successfully ");
//		}
		
		
//		int status1=stmt.executeUpdate("update employee set fname='sumit' where id=1");
//		if(status1>0) {
//			System.out.println("Record is update Successfully ");
//		}else {
//			System.out.println("Record is not update Successfully ");
//		}
		
		
		ResultSet rst= stmt.executeQuery("select * from employee");
		
		while(rst.next()) {
			
			int id=	rst.getInt("id");
			String fname= rst.getString("fname");
			String lname= rst.getString("lname");
			String mobileNo= rst.getString("mobileno");
			
			System.out.println("Id => "+id+" First name "+fname +" Last name :: "+lname+" Mobile No "+mobileNo);
			
			
		}
		
		rst.close();
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}finally {
			try {
				
	//Step 5 close Connection			
				con.close();
				con=null;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
