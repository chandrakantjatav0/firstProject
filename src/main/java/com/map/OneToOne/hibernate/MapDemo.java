package com.map.OneToOne.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		System.out.println("Exam Started...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// Creating question object
		Question q1 = new Question();
		q1.setQuestionId(212);
		q1.setQuestion("What is java ? ");

		// creating Answer object
		Answer ans = new Answer();
		ans.setAnswerId(124);
		ans.setAnswer("Java is Programming Language..");
		q1.setAnswer(ans);

		// Creating question object
		Question q2 = new Question();
		q2.setQuestionId(423);
		q2.setQuestion("What is Collection FrameWork ? ");

		// creating Answer object
		Answer ans1 = new Answer();
		ans1.setAnswerId(345);
		ans1.setAnswer("API to Work with Group of Object..");
		q1.setAnswer(ans1);

		// Creating question object
		Question q3 = new Question();
		q3.setQuestionId(678);
		q3.setQuestion("What is Hibernate ? ");

		// creating Answer object
		Answer ans2 = new Answer();
		ans2.setAnswerId(890);
		ans2.setAnswer("Hibernate is a Java Framework, It is a  ORM tool..");
		q3.setAnswer(ans2);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(q3);
		session.save(ans);
		session.save(ans1);
		session.save(ans2);
		tx.commit();
		
		//Fetching.....
		Question newQ = (Question) session.get(Question.class,678);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());

		session.close();
		factory.close();
	}
}
