package util;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Person;

public class Test {

	private static SessionFactory sessionFactory;

	public static void main(String[] args) {

		try {

			sessionFactory = new Configuration().configure("config/hibernate.cfg.xml").buildSessionFactory();

		} catch (Throwable e) {
			System.out.println("Session nesnesi oluþturulamadý " + e);
			throw new ExceptionInInitializerError();

		}

		Test testApp = new Test();
		testApp.addPerson("Ayþe", "Çiçek", "Antalya",new Date(01/10/1989));

	}

	private void addPerson(String name, String lastname, String adress, Date date) {

		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			Person person = new Person(name, lastname, adress, date);
			session.save(person);
			tx.commit();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();

			}
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
