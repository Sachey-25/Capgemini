package org.capgemini.HibernateImage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*maven project to display the image and working with other data-types */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started..!" );
        System.out.println("Hibernate getting connected.");
        //I need to configure the hibernate connectivity 
        Configuration conf = new Configuration();
        conf.configure("hibernate.cnf.xml");
        //Start the session factory to open the session for database connectivity
        SessionFactory factory = conf.buildSessionFactory();
        
        //I need to pass the data to the database.
        Address ad = new Address();
        ad.setStreet("Street 1");
        ad.setCity("Pune");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.123);
        //Second Entry
        Address add = new Address();
        add.setStreet("Street 2");
        add.setCity("Mumbai");
        add.setOpen(true);
        add.setAddedDate(new Date());
        add.setX(1234.123);
        //Third Entry
        Address addr = new Address();
        addr.setStreet("Street 2");  //Street 2 is already present || Compare if();
        addr.setCity("Telangana");
        addr.setOpen(true);
        addr.setAddedDate(new Date());
        addr.setX(1234.123);
       
        //Reading an image
       FileInputStream fis = new FileInputStream("src/main/java/pune.jpg");
       //I need to check the image is available or no
       byte[] data = new byte[fis.available()];
       fis.read(data);
       ad.setImage(data);
       FileInputStream fism = new FileInputStream("src/main/java/mumbai.jpg");
       byte[] dat = new byte[fism.available()];
       fism.read(dat);
       ad.setImage(dat);
           
        
        
        //Set a connection to the database
        Session session = factory.openSession();
        //Start the transaction ---> Start the communication between database and JavaApp
        Transaction trans = session.beginTransaction();
        session.save(ad);
        session.save(add);
        session.save(addr);
        trans.commit();
        session.close();
        fis.close();
        fism.close();
        System.out.println("Done..!");
    }
}