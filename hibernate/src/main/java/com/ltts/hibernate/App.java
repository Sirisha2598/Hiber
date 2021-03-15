package com.ltts.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      Configuration cfg=new Configuration();
      cfg.configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      Session session =factory.openSession();
      Transaction t=session.beginTransaction();
      Employee e=new Employee();
      e.setEmpname("sirisha");
      e.setEmpaddress("Tanuku");
    
      session.save(e);
      t.commit();
      factory.close();
      session.close();
     
    }
}
