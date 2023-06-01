package com.chandrakant.hibernate.Hibernate.firstproject02;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App1 {
	public static void main(String[] args) {
		// create configurations
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Startup.class);

		// create session factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// initialize the session object
		Session session = sessionFactory.openSession();
		Startup sup = new Startup();

		sup.setId(8);
		sup.setBusinessName("DaynilGroup");
		sup.setFounderName("Uday");
		sup.setBusinessValuation(12300000f);

		session.beginTransaction();
		session.save(sup);
		session.getTransaction().commit();
		System.out.println("Entries saved... check db..");
	}
}
