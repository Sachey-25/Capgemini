package Capgemini.io.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import Capgemini.io.hibernate.model.Student;
import Capgemini.io.hibernate.util.HibernateUtil;

public class Run {

	public static void main(String[] args) {
		//Create an object to the student class to access the data
		Student student = new Student(1010,"Sachin","A","Sachin@hotmail.com");
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			//Start transaction
			transaction = session.beginTransaction();
			//Save student object
			session.save(student); //Record will be stored in the table.
			//Commit the transaction
			transaction.commit();
			}catch(Exception e) {
				if(transaction != null){
					transaction.rollback();
				}
			}
	}
}
