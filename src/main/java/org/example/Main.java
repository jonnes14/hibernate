package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.management.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import org.hibernate.query.Query;


public class Main {
    public static void main(String[] args) {




        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                . buildSessionFactory();
        Session session=sf.openSession();

       Query query=session.createQuery("from Laptop"); // provide all the details
        List<Laptop> laptops=query.getResultList();



  // used for getting      s2=session.get(Student.class,3) ;
    session.close();
       sf.close();

        //System.out.println(l);
    }
}