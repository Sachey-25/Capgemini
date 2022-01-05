package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ){
    	//Configure the xml hibernate
       Configuration conf = new Configuration();
       //Map to the xml configured file
       conf.configure("hibernate.cnf.xml");
       //Start session factory
       SessionFactory factory = conf.buildSessionFactory();
       
       //Code implementation for emp class
       emp emp_one = new emp();
       emp emp_two = new emp();
       emp_one.setEid(34);
       emp_one.setName("Ram");
       //From the second object
       emp_two.setEid(36);
       emp_two.setName("Shyam");
       
       //Code implementation for project class
       Project pro_one = new Project();
       Project pro_two = new Project();
       pro_one.setPid(14214);
       pro_one.setProjectName("Library Management");
       //Second object
       pro_two.setPid(12121);
       pro_two.setProjectName("Ecommerse Website");
       
       //I need to collect the emp and project information
       List<emp> list_emp = new ArrayList<emp>();
       List<Project> list_project = new ArrayList<Project>();
       //Adding the information to the emp entity
       list_emp.add(emp_one);
       list_emp.add(emp_two);
       //Adding the information to the project entity
       list_project.add(pro_one);
       list_project.add(pro_two);
       
       //I need to map ManyToMany mechanism
       emp_one.setProjects(list_project);
       pro_two.setEmp(list_emp);
       
       //Session
       Session session = factory.openSession();
       
       //Trasaction
       Transaction trans = session.beginTransaction();
       //Save the data
       session.save(emp_one);
       session.save(emp_two);
       session.save(pro_one);
       session.save(pro_two);
           
       trans.commit();
       session.close();       
       factory.close();
    }
}
