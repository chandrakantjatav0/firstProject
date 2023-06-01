package com.chandrakant.hibernate.Hibernate.firstproject01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.chandrakant.hibernate.Hibernate.Utils.HibernateUtils;

public class Delete {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		Song song1 = session.get(Song.class, 2);

		session.beginTransaction();
		session.delete(song1);

		session.getTransaction().commit();
		System.out.println("Deleted... check db..");
	}

}
