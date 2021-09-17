package com.UserDao;

import com.user.Laptop;
import com.user.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class UserDao {
    public static void main(String[] args) {
        Laptop lapy = new Laptop();
        lapy.setLid(101);
        lapy.setLname("Dell");
        lapy.setPrice(40000);

        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(lapy);

        tx.commit();

    }
}
