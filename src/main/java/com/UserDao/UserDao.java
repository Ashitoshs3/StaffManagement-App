package com.UserDao;

import com.user.Laptop;
import com.user.UserMain;
import com.user.UserName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class UserDao {
    public static void main(String[] args) {

        UserName name = new UserName("Shubham","Kumar","Gautam");

        Laptop lapy = new Laptop();
        lapy.setLid(101);
        lapy.setLname("Dell");
        lapy.setPrice(40000);

//
        UserMain u1 = new UserMain();
        u1.setName(name);
        u1.setEmail("skgautam393@gmail.com");
        u1.setNumber(5684);
        u1.setId("S12");


        Configuration conf = new Configuration().configure().addAnnotatedClass(UserMain.class);
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(sr);

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(u1);

        tx.commit();

    }
}





//****************************************** Examples

