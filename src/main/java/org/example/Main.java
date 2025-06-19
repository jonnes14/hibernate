package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.setSname("jon");
        s.setAge(21);
        s.setRollNo(4);

        SessionFactory sf=new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Student.class)
                . buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(s);
        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s);

    }
}