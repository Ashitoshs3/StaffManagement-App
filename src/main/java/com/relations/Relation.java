package com.relations;

import com.relations.tc.LaptopR;
import com.relations.tc.StudentR;
import com.user.UserMain;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

public class Relation {
    public static void main(String[] args) {

        LaptopR laptop1 = new LaptopR();
        LaptopR laptop2 = new LaptopR();
        LaptopR laptop3 = new LaptopR();
        LaptopR laptop4 = new LaptopR();

        StudentR student1 = new StudentR();
        StudentR student2 = new StudentR();

        List<LaptopR> l1 = new ArrayList<>();
        List<LaptopR> l2 = new ArrayList<>();

        laptop1.setLid(1);
        laptop1.setLname("lenovo");
        laptop1.setPrice(40000);

        laptop2.setLid(2);
        laptop2.setLname("dell");
        laptop2.setPrice(30000);

        laptop3.setLid(3);
        laptop3.setLname("hp");
        laptop3.setPrice(42000);

        laptop4.setLid(4);
        laptop4.setLname("asus");
        laptop4.setPrice(36000);

        student1.setFname("Shubham");
        student1.setRollno(47);
        student1.setMarks(98);

        student2.setFname("Gat");
        student2.setRollno(42);
        student2.setMarks(55);

        l1.add(laptop1);
        l1.add(laptop2);

        l2.add(laptop3);
        l2.add(laptop4);

        student1.setLaptops(l1);
        student2.setLaptops(l2);


        Configuration conf = new Configuration().configure().addAnnotatedClass(StudentR.class).addAnnotatedClass(LaptopR.class);
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(sr);

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();



        session.save(student1);
        session.save(student2);

        session.save(laptop1);
        session.save(laptop2);
        session.save(laptop3);
        session.save(laptop4);

        tx.commit();

    }
}


// Data for OneToOne
/*StudentR std1 = new StudentR();
    StudentR std2 = new StudentR();

    LaptopR l1 = new LaptopR();
    LaptopR l2 = new LaptopR();

        l1.setLid(101);
                l1.setLname("lenovo");
                l1.setPrice(40000);

                l2.setLid(201);
                l2.setLname("dell");
                l2.setPrice(36000);

                std1.setRollno(1);
                std1.setFname("Mayank");
                std1.setMarks(88);
                std1.setLaptop(l1);

                std2.setRollno(2);
                std2.setFname("Jatin");
                std2.setMarks(85);
                std2.setLaptop(l2);*/


// Data for OneToMany
/*
    LaptopR laptop1 = new LaptopR();
    LaptopR laptop2 = new LaptopR();
    LaptopR laptop3 = new LaptopR();
    LaptopR laptop4 = new LaptopR();

    StudentR student1 = new StudentR();
    StudentR student2 = new StudentR();

    List<LaptopR> l1 = new ArrayList<>();
    List<LaptopR> l2 = new ArrayList<>();

        laptop1.setLid(1);
                laptop1.setLname("lenovo");
                laptop1.setPrice(40000);

                laptop1.setLid(2);
                laptop1.setLname("dell");
                laptop1.setPrice(30000);

                laptop1.setLid(3);
                laptop1.setLname("hp");
                laptop1.setPrice(42000);

                laptop1.setLid(4);
                laptop1.setLname("asus");
                laptop1.setPrice(36000);

                student1.setFname("Shubham");
                student1.setRollno(47);
                student1.setMarks(98);

                l1.add(laptop1);
                l1.add(laptop2);

                l2.add(laptop3);
                l2.add(laptop4);

                student1.setLlap(l1);
                student2.setLlap(l2);*/
