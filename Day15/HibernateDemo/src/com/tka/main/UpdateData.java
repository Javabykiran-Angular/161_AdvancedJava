package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
	  SessionFactory factory=config.buildSessionFactory();
	  	Session session= factory.openSession();	  
	  	// data coming from FrontEnd
	  	int id=1;
	  	String artistname="R D burban";
	  	
	  	session.beginTransaction();
	  	
	  	// Get particular Record By Id From Database 
	  	 Song s= (Song) session.get(Song.class, id);
	  	 //	  	 System.out.println(s);
	  	
	  	 s.setArtist(artistname);
	  	// session.update(s);
	  	 
	  	 session.merge(s);	  	 
	  	 
	  	 session.getTransaction().commit();
	  	
	  	 System.out.println("Rcord is Updatated....");
	  
		
		

	}

}
