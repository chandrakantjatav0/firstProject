package com.practice2.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
public static void main( String[]args) {
	System.out.println("Fetching Started...");
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();

	Session session = factory.openSession();
	//using get() method
	Bike bk = (Bike)session.get(Bike.class,3);
	System.out.println(bk);
	
	Garage gg = (Garage)session.load(Garage.class,5);
	System.out.println(gg.getStreet()+" : "+gg.getCity());
	
	session.close();
	factory.close();
	System.out.println("Fetching Completed...");
}
}
