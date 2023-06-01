package com.practice.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//using get method
		Cars car =(Cars)session.load(Cars.class,1);
		System.out.println(car);
		
		Address add = (Address)session.get(Address.class,10);
		System.out.println(add.getCity());
		session.close();
		factory.close();
	}

}
