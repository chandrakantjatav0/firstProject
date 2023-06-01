package com.practice2.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Merge {

	public static void main(String[] args) {
		System.out.println("Project Started...");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating Bike Class Object
		Bike bike = new Bike();
//		 bike.setId(0);
		bike.setBike_Name("Dominar");
		bike.setBike_Price(184000f);
		System.out.println(bike);

		// Creating Bike Showroom Class Object
		Garage gg = new Garage();
		// gg.setId(0);
		gg.setName("CJ Wheels");
		gg.setStreet("GMG Road");
		gg.setCity("Kalyan");
		gg.setOpen(true);
		gg.setAddedDate(new Date());
		System.out.println(gg);

		Session session = factory.openSession();
		session.save(bike);
		session.save(gg);
		session.close();
		factory.close();
		System.out.println("Bikes created");
	}

}
