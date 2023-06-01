package com.chandrakant.hibernate.Hibernate.test;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;

import com.chandrakant.hibernate.Hibernate.Utils.HibernateUtils;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory1 = HibernateUtils.getSessionFactory();
		SessionFactory sessionFactory2 = HibernateUtils.getSessionFactory();
		 if(sessionFactory1 == sessionFactory2) {
			 System.out.println("Two of the sessionFactory objects are same");
		 }
		System.out.println(sessionFactory1 + " - " + sessionFactory2);
	}

}
