package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.config.MyConfiguration;
import com.tka.entity.Account;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Account acc= context.getBean(Account.class);
		
		acc.depoist();
		
//		acc.depoist1(2000);
		
		acc.withdraw();
		

	}

}
