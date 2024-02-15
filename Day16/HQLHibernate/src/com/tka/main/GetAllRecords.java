package com.tka.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.tka.entity.Song;

//import jakarta.persistence.Query;

import org.hibernate.query.Query;


public class GetAllRecords {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);		
		
		SessionFactory factory=config.buildSessionFactory();
		
		Session session= factory.openSession();
		
		String hqlQuery="from Song";
		session.beginTransaction();
			
	//	Query  query=  session.createQuery(hqlQuery, Song.class);
		Query  query=  session.createQuery(hqlQuery, Song.class);
		//It is JPA 
//		List<Song> list= query.getResultList();
		
		//It is Hibernate Method
		List<Song> list= query.list();
		
		for (Song song : list) {
			System.out.println(song);
		}
		
		session.getTransaction().commit();
		
			
		
		
		
		
		

	}

}
