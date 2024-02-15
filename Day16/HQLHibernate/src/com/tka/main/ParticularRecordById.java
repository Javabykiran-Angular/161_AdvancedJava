package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.entity.Song;

public class ParticularRecordById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);		
		
		SessionFactory factory=config.buildSessionFactory();
		
		Session session= factory.openSession();
		
		session.beginTransaction();

		int id=5;
		String HqlQuery="from Song where id=:myid";
		
		Query<Song> query= session.createQuery(HqlQuery,Song.class);
		query.setParameter("myid", id);
		//Song song=(Song) query.getSingleResult();
		
		// Hibernate Method 
		Song song= query.uniqueResult();
		
		System.out.println(song);
		session.getTransaction().commit();
		session.close();

	}

}
