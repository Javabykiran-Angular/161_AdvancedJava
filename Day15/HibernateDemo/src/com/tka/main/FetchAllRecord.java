package com.tka.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.tka.entity.Song;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);		
		
		SessionFactory factory=config.buildSessionFactory();
		
		Session session= factory.openSession();
		
		CriteriaBuilder cb= session.getCriteriaBuilder();
		
		CriteriaQuery<Song> cq= cb.createQuery(Song.class);
		
		
		Root<Song> root= cq.from(Song.class);
		cq.select(root);
		
		Query query= session.createQuery(cq);
		List<Song> list= query.getResultList();
		
		for (Song song : list) {
			System.out.println(song);	
		}
		 

	}

}
