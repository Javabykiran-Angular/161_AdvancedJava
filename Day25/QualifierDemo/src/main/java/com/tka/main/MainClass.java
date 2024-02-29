package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.config.MyConfiguration;
import com.tka.entity.Person;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Person p= context.getBean(Person.class);
//		System.out.println(p);
		System.out.println(p.getSim1().calling());
		System.out.println(p.getSim2().calling());

	}

}
