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

        Laptop l2=new Laptop();
        l2.setBrand("mac");
        l2.setLid(3);
        l2.setRam(8);

        Student s=new Student();
        s.setSname("jonnes");
        s.setAge(22);
        s.setRollNo(4);

        Student s1=new Student();
        s1.setSname("kabilan");
        s1.setAge(23);
        s1.setRollNo(5);



        s.setLaptops(Arrays.asList(l,l1));
        s1.setLaptops(Arrays.asList(l2));


        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                . buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(s);
        session.persist(s1);

        session.persist(l);

        session.persist(l1);
        session.persist(l2);
        transaction.commit();
  // used for getting      s2=session.get(Student.class,3) ;
//        session.close();
//        sf.close();
        Session session1=sf.openSession();
        Student s4=session1.get(Student.class,22);
        session1.close();
        sf.close();
        //System.out.println(l);
    }
}