package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.tka.entity.Song;

public class UpdateAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);		
		
		SessionFactory factory=config.buildSessionFactory();
		
		Session session= factory.openSession();
		session.beginTransaction();
		
		String HqlQuery="update Song set name=:myname where id=:id";
		
		
		MutationQuery query= session.createMutationQuery(HqlQuery);
		 
		 query.setParameter("myname", "xyz apana");
		 query.setParameter("id", 2);
		 
		 query.executeUpdate();
		 session.getTransaction().commit();
		 
		 System.out.println("Record Updatated");
		 session.close();
		
		

	}

}
