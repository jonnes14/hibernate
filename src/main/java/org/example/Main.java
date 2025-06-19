package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.setSname("jonnes");
        s.setAge(22);
        s.setRollNo(1);
        Configuration cf=new Configuration();
        cf.addAnnotatedClass(org.example.Student.class);
        cf.configure();

        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(s);
        transaction.commit();
        System.out.println(s);
    }
}