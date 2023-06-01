package com.HQL.hibernate;

import java.util.List;

import org.hibernate.Query;

//import javax.persistence.Query;



public class School {
	public static void main(String[] args) {
		System.out.println("Lets Starts the Query");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

//		// Creating Object
//		Student std1 = new Student();
//		Student std2 = new Student();
//		Student std3 = new Student();
//		Student std4 = new Student();
//
//		std1.setId(12);
//		std1.setName("Harsh");
//		std1.setCity("Dombivli");
//		std1.setCertificate("Software Testing");
//
//		std2.setId(16);
//		std2.setName("Chandrakant");
//		std2.setCity("Kalyan");
//		std2.setCertificate("Backend Developer");
//
//		std3.setId(31);
//		std3.setName("Nitesh");
//		std3.setCity("Diva");
//		std3.setCertificate("Cyber Security");
//
//		std4.setId(25);
//		std4.setName("Ketan");
//		std4.setCity("Thane");
//		std4.setCertificate("Java Developer");
//
      	Session session = factory.openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(std1);
//		session.save(std2);
//		session.save(std3);
//		session.save(std4);

		System.out.println("And the Query Begin.....");
		// HQL syntax

		String query = "From Student where City ='Dombivli'";

		Query q = session.createQuery(query);
		// single -(Unique)
		// Multiple-list

		List<Student> list = q.list();

		for (Student student : list) {
			System.out.println(student.getName()+" : "+student.getCertificate()+" : "+student.getCity());

//			 tx.commit();
			
		}
		session.close();
		factory.close();
	}
}
