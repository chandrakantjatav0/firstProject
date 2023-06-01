package com.chandrakant.hibernate.Hibernate.firstproject01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.chandrakant.hibernate.Hibernate.Utils.HibernateUtils;

public class UpdateApp2 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		if (sessionFactory != null) {

			Session session = sessionFactory.openSession();

			session.beginTransaction();

			Song song1 = session.get(Song.class, 7);

			System.out.println(song1);

			session.getTransaction().commit();
		}
	}

}
