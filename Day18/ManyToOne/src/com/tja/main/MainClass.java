package com.tja.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tja.entity.Laptop1;
import com.tja.entity.Student1;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Laptop1.class);
		config.addAnnotatedClass(Student1.class);
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session= factory.openSession();
		session.beginTransaction();
		
//		Laptop1 l=new Laptop1("Dell");
//		Laptop1 l1=new Laptop1("Accer");
//		Laptop1 l3=new Laptop1("HP");
		
//		session.persist(l);
//		session.persist(l1);
//		session.persist(l3);
		
//		Laptop1 lapi=(Laptop1) session.get(Laptop1.class, 1);
//		System.out.println(lapi);
//		
//		Student1 s1=new Student1();
//		s1.setName("Spruha");
//		s1.setEmailid("spruha@gmail.com");
//		s1.setLaptop(lapi);
//		
//		session.persist(s1);
		
		
		Student1 stud= (Student1) session.get(Student1.class, 2);	
		
		
		System.out.println(stud);
		
		
		session.getTransaction().commit();
		session.close();
	
		
		

	}

}
