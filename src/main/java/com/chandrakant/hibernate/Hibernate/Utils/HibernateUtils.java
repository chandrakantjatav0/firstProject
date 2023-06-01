package com.chandrakant.hibernate.Hibernate.Utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.chandrakant.hibernate.Hibernate.firstproject01.Song;

public class HibernateUtils {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(Song.class);

			sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}
}
