package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Spring Core ");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("springbeans.xml");

//		 Employee e= (Employee)context.getBean("emp");
		
		 Employee e= context.getBean("emp",Employee.class);		
		 
		 System.out.println(e);
		 Employee e1= (Employee)context.getBean("emp");
		 
//		 
		 System.out.println(e1);
		
	}

}
