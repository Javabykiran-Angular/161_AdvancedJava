package com.tka.DemoMVC.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.DemoMVC.entity.User;

@Repository
public class UserDao {
	
	@Autowired
	SessionFactory factory;

	public User checkUser(User user) {
		Session session=null;
		Transaction tx=null;
		String hqlQuery="from User where username=:username and password=:password";
		User u=null;
		
		try {
			session= factory.openSession();
			tx=session.beginTransaction();
			
			Query<User> query= session.createQuery(hqlQuery,User.class);
			query.setParameter("username", user.getUsername());
			query.setParameter("password", user.getPassword());
			 u= query.uniqueResult();
			 tx.commit();
			
		} catch (Exception e) {
			
			if(tx!=null) {
				tx.rollback();
			}			
			e.printStackTrace();
		}finally {
			
			if(session!=null) {
				session.close();
			}
			
			
		}
		
		return u;
		
		
	}
	

}
