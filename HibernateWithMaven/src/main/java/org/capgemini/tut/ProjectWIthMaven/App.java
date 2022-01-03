package org.capgemini.tut.ProjectWIthMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
	System.out.println("Project Starrted..!");
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cnf.xml");
	SessionFactory Factory = cfg.buildSessionFactory();
	//Creating a student object
	
	Student st = new Student();
	st.setId(110);
	st.setName("Rahul");
	st.setCity("Indore");
	System.out.println(st);	
	Session session = Factory.openSession(); //Getting the data saved
	
	Employee emp = new Employee();
	emp.setEmpid(12345);
	emp.setEmpName("Sachin");
	emp.setEmpph(9);
	emp.setEmpdekNum(405);
	System.out.println(emp);
	
	Transaction tx = session.beginTransaction();

	
	session.save(st);
	tx.commit();; //(Entity of a table)Record saved to the database.
	
	session.close();
	
	System.out.println("Record saved successfully into the database..!");
	
	//System.out.println(Factory);
	
	//I would like to check the connection to the database is closed or running
	//System.out.println(Factory.isClosed()); //boolean 
	//System.out.println(Factory.isOpen());
	//System.out.println(Factory.equals(cfg));
	//System.out.println(Factory.getSessionFactory());
	}
}