package com.tka.ProjectDemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.ProjectDemo.entity.Country;
import com.tka.ProjectDemo.entity.Employee;

@Repository
public class MainDao {
	@Autowired
	SessionFactory factory;

	public String addCountry(Country c) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {		
		 session= factory.openSession();
		 tx=session.beginTransaction();
		 
		 session.persist(c);
		 tx.commit();
		 msg="Data Addedd Succefully..";
		 
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null) {
				tx.rollback();
			}
			
			
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return msg;
	}

	public String updateCountry(Country c) {
		
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {		
		 session= factory.openSession();
		 tx=session.beginTransaction();
		 
		 Country country= session.get(Country.class,c.getCid() );
		 
		 country.setCname(c.getCname());
		 
		 session.merge(country);
		 tx.commit();
		 msg="Data is Updatated Successfully...";		 
		 
		
		}catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
						
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return msg;
	}

	public String addEmployee(Employee e) {
		
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {		
		 session= factory.openSession();
		 tx=session.beginTransaction();
		 
		 session.persist(e);
		 tx.commit();
		 msg="Record is Addedd Successfully";
		 
		 
		}catch (Exception e1) {
			if(tx!=null) {
				tx.rollback();
			}
						
			e1.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return msg;
		
		
	}

	
	
}
