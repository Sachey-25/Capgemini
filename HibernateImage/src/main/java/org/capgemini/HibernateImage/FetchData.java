package org.capgemini.HibernateImage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		// Get //Load
		  Configuration conf = new Configuration();
	        conf.configure("hibernate.cnf.xml");
	        //Start the session factory to open the session for database connectivity
	        SessionFactory factory = conf.buildSessionFactory();
	        Session session = factory.openSession();
	        //Get-employee:1
	       /* Address ad = (Address)session.get(Address.class,2);
	        System.out.println(ad.getCity());
	        */
	        Address ad = (Address)session.get(Address.class,2);
	        System.out.println(ad.getStreet() + " : " + ad.getCity());
	        Address add = (Address)session.load(Address.class,2);
	        System.out.println(add.getStreet() + " : " + add.getCity());
	        
	        session.close();
	        factory.close();
	        

	}

}
