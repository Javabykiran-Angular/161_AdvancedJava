package com.tka.DatabaseDemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.DatabaseDemo.entity.Person;

@Repository
public class PersonDao {
	@Autowired
	SessionFactory factory;
	
	public String insertData(Person p) {
		
			Session session= factory.openSession();
			session.beginTransaction();
			session.persist(p);
			session.getTransaction().commit();
			session.close();
			return "Record is Saved";
		
		
	}
	
	

}
