package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);		
		
		SessionFactory factory=config.buildSessionFactory();
		
		Session session= factory.openSession();
		
		Song s=new Song();
		s.setName("Mehbooba mehbooba");
		s.setArtist("R D Burdan");
		
		session.beginTransaction();
		session.persist(s);
		session.getTransaction().commit();
		
		session.close();
		
		
		

	}

}
