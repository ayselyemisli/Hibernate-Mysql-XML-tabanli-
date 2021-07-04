package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static final String HIBERNATE_CFG_XML_PATH = "config/hibernate.cfg.xml";

	/**
	 * @return
	 */
	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure(HIBERNATE_CFG_XML_PATH).buildSessionFactory();

		} catch (Throwable e) {
			System.err.println("SessionFactory nesnesi oluþturulamadý");
			throw new ExceptionInInitializerError();
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutDownSessionFactory() {
		getSessionFactory().close();
	}

}
