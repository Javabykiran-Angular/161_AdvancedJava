package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.demo.Address;
import com.tka.entity.Country;
import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigConfiguration.class);
		
		Employee e= context.getBean(Employee.class);
		System.out.println(e);
		
//		Employee e1= context.getBean("empObj",Employee.class);
//		System.out.println(e1);
		
		Employee e2= context.getBean("emp",Employee.class);
		System.out.println(e2);
		
		Country c= context.getBean(Country.class);
		System.out.println(c);
		
		Address a= context.getBean(Address.class);
		System.out.println(a);

	}

}
