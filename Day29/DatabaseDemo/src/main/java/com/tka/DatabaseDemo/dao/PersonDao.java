package com.tka.DatabaseDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
	
	public String updateData(int id , Person p) {
		Session session= factory.openSession();
		session.beginTransaction();
		
		Person dbRecord= session.get(Person.class,id );
		
		dbRecord.setEmailid(p.getEmailid());
		dbRecord.setFname(p.getFname());
		dbRecord.setMobileno(p.getMobileno());
		
		session.merge(dbRecord);
		
		session.getTransaction().commit();
		session.close();
		
		return "Data is Updatated....";				
		
	}
	
	public String deleteData(int id) {
		
		Session session= factory.openSession();
		session.beginTransaction();
		
		Person p= session.get(Person.class, id);
		session.remove(p);
		session.getTransaction().commit();
		session.close();
		
		return "Record is Deleted Successfully";
		
		
	}
	
	public Person getParticularRecord(int id) {
		
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlQuery="from Person where id=:myid";
		
		Query<Person> query= session.createQuery(hqlQuery,Person.class);
		query.setParameter("myid",id );
		
		Person p= query.uniqueResult();
		session.getTransaction().commit();
		session.close();		
		return p;		
	}
	
	
	public List<Person> getAllRecord() {
		
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlQuery="from Person";
		
		Query<Person> query= session.createQuery(hqlQuery,Person.class);
		
		List<Person> list= query.list();
		session.getTransaction().commit();
		session.close();	
		
		return list;		
		
	}
	
	
	
	

}
