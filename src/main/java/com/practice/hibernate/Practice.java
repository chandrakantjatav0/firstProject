package com.practice.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Practice {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Project Started...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// creating Cars
		Cars car = new Cars();
		car.setId(8);
		car.setCar_Name("Tata Nexon");
		car.setCar_Price(900000f);
		System.out.println(car);

		// Creating address object
		Address ad = new Address();
		ad.setStreet("Gupte rd");
		ad.setCity("Dombivli");
		ad.setAddedDate(new Date());
		ad.setX(87654.876);

//		// reading image
		FileInputStream fis = new FileInputStream("src/main/java/Thar.webp");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);

		//creating session object
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(car);
		session.save(ad);

		tx.commit();
		session.close();
		factory.close();
	}
}