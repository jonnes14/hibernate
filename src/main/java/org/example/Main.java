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
      s.setRollNo(4);
       Student s2=null;

        Laptop l=new Laptop();
        l.setBrand("asus");
        l.setLid(2);
        l.setRam(16);

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                . buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(s);
        session.persist(l);
        transaction.commit();
  // used for getting      s2=session.get(Student.class,3) ;
        session.close();
        sf.close(); 

        System.out.println(l);
    }
}