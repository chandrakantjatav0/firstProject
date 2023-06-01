package com.map.OneToMany.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemmo {
	public static void main(String[] args) {
	
		System.out.println("Person Bank Details...");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Person p1 = new Person();
		p1.setPersonId(101);
		p1.setPersonName("VIJAY MAALAYA");

		Bank bank = new Bank();
		bank.setId(1100);
		bank.setBankAccounts("Bank Of India - BOI");
		bank.setPerson(p1);
		
		Bank bank1 = new Bank();
		bank1.setId(1135);
		bank1.setBankAccounts("Punjab National Bank - PNB");
		bank1.setPerson(p1);

		Bank bank2 = new Bank();
		bank2.setId(1124);
		bank2.setBankAccounts("State Bank Of India - SBI");
		bank2.setPerson(p1);

		List<Bank> list = new ArrayList<Bank>();
		list.add(bank);
		list.add(bank1);
		list.add(bank2);
		p1.setBank(list);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p1);
		session.save(bank);
		session.save(bank1);
		session.save(bank2);
		tx.commit();

		session.close();

		factory.close();
	}
}
