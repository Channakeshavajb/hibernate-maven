package com.xworkz.SportsExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SportsDAO {

	public SportsDAO() {
		System.out.println("created.........." + this.getClass().getSimpleName());
	}

	public void save(SportsDTO dto) {
		Configuration cfg = null;
		SessionFactory sf = null;
		Transaction tx = null;
		Session session = null;
		try {
			cfg = new Configuration();
			cfg.configure();
			sf = cfg.buildSessionFactory();
			session = sf.openSession();

			tx = session.beginTransaction();
System.out.println("data save starting................");
			session.save(dto);
			tx.commit();
			System.out.println("data saved successfully");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception created" + e.getMessage());
			tx.rollback();
		}

		finally {
			session.close();
			sf.close();
		}
	}
}
