package com.chandrakant.hibernate.Hibernate.firstproject01;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.chandrakant.hibernate.Hibernate.Utils.HibernateUtils;

import org.hibernate.Session;

public class UpdateApp {
	public static void main(String[] args) {

//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfg.xml");
//		configuration.addAnnotatedClass(Song.class);
//
//		SessionFactory sessionFactory = configuration.buildSessionFactory();

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();

		Song song2 = new Song();
	
 
		 song2 = session.get(Song.class,4);
 
		session.beginTransaction();
		//song2.setId(5);
		
//		session.update(song2);

		song2.setSongName("TUM HOO");
		session.getTransaction().commit();
		System.out.println("updated... check db..");
	}
}
