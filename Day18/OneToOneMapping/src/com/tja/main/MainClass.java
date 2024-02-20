package com.tja.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tja.entity.Laptop;
import com.tja.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Laptop.class);
		config.addAnnotatedClass(Student.class);
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session= factory.openSession();
		session.beginTransaction();
		Laptop l=new Laptop("Accer");
		
		Student s=new Student();
		s.setName("Kiran");
		s.setEmailid("kiran@gmail.com");
		s.setLaptop(l);
		
		session.persist(l);
		session.persist(s);
		session.getTransaction().commit();
		session.close();
		
		
		

	}

}
