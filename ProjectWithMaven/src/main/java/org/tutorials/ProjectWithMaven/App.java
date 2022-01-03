package org.tutorials.ProjectWithMaven;

import java.lang.module.Configuration;

import org.hibernate.*;

import com.mysql.cj.xdevapi.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        //Connection established to the hibernate.
        Configuration cfg = new Configuration();
        cfg.congifure("hibernate.cnf.xml");     
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
    }
}