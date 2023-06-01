package com.chandrakant.hibernate.Hibernate.firstproject01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.chandrakant.hibernate.Hibernate.Utils.HibernateUtils;
 
public class App {
	public static void main(String[] args) {
//		// create configuration
//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfg.xml");
//		configuration.addAnnotatedClass(Song.class);
//
//		// create session factory
//		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// initialize the session object
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();
		Song song1 = new Song();

		song1.setId(6);
		song1.setSongName("I Wonder");
		song1.setArtist("Kayne West");

		
		session.beginTransaction();
		session.save(song1);
		session.getTransaction().commit();
		System.out.println("Song saved... check db..");
	}
}
