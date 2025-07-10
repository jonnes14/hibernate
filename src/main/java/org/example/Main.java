package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Laptop l=new Laptop();
        l.setBrand("asus");
        l.setLid(1);
        l.setRam(16);

        Laptop l1=new Laptop();
        l1.setBrand("dell");
        l1.setLid(2);
        l1.setRam(17);


        Student s=new Student();
       s.setSname("jonnes");
       s.setAge(22);
      s.setRollNo(4);

      l.setStudent(s);
      l1.setStudent(s);

      s.setLaptops(Arrays.asList(l,l1));



        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                . buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(s);
        session.persist(l);
        session.persist(l1);
        transaction.commit();
  // used for getting      s2=session.get(Student.class,3) ;
        session.close();
        sf.close(); 

        System.out.println(l);
    }
}