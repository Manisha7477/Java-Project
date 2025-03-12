package bmt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Load Hibernate configuration
        Configuration config = new Configuration().configure(); // Looks for hibernate.cfg.xml
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        System.out.println("Hibernate Session Created Successfully!");

        // Close session and factory
        session.close();
        sessionFactory.close();
    }
}
