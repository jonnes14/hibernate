package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
//        Student s=new Student();
//        s.setSname("kan");
//        s.setAge(21);
//        s.setRollNo(4);
//        Student s2=null;
        Laptop l=new Laptop();
        l.setBrand("dell");
        l.setLid(1);
        l.setRam(16);

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                . buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(s);
        //session.merge(s);
        transaction.commit();
  // used for getting      s2=session.get(Student.class,3) ;
        session.close();
        sf.close(); 

        System.out.println(l);
    }
}