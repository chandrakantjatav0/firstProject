package com.map.ManyToMany.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println("Project Started...");

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		emp1.setEmpId(34);
		emp1.setEmpName("Chandrakant");

		emp2.setEmpId(29);
		emp2.setEmpName("Vivek");

		emp3.setEmpId(39);
		emp3.setEmpName("Aaditya");

		Project pj1 = new Project();
		Project pj2 = new Project();
		Project pj3 = new Project();

		pj1.setProjectId(2221);
		pj1.setProjectName("MyCity");

		pj2.setProjectId(2345);
		pj2.setProjectName("VMS");

		pj3.setProjectId(3456);
		pj3.setProjectName("ChatBot");

		List<Employee> list1 = new ArrayList<Employee>();
		List<Project> list2 = new ArrayList<Project>();

		list1.add(emp1);
		list1.add(emp2);
		list1.add(emp3);

		list2.add(pj1);
		list2.add(pj3);
		list2.add(pj3);

		emp1.setProject(list2);
		pj1.setEmployee(list1);
		emp3.setProject(list2);
		
		Session session = factory.openSession();
		Transaction txt = session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.save(emp2);
		session.save(pj1);
		session.save(pj2);
		session.save(pj3);
		txt.commit();
		session.close();
		factory.close();
	}
}
