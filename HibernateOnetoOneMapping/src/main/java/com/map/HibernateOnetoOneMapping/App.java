package com.map.HibernateOnetoOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started...!" );
        //Configure the connectivity
        Configuration conf = new Configuration();
        conf.configure("hibernate.cnf.xml");
        //I need to establish the session
        SessionFactory factory = conf.buildSessionFactory();
        
        //Creating questions
        Question q_one = new Question();
        q_one.setQuestionId(1);
        q_one.setQuestionName("What is JPA?");
        
        //Creating Answers
        Answer ans_one = new Answer();
        ans_one.setAnswerId(1);
        ans_one.setAnswer("JPA is JAVA Persistance API.");
        ans_one.setQuestion(q_one);
        q_one.setAnswer(ans_one);
        
        /*Second question */
        //Creating questions
        Question q_two = new Question();
        q_two.setQuestionId(2);
        q_two.setQuestionName("What is OneToOneMapping?");
        
        //Creating Answers
        Answer ans_two = new Answer();
        ans_two.setAnswerId(2);
        ans_two.setAnswer("f(x)=f(y) one occurance equal to another occurance");
        ans_two.setQuestion(q_two);
        q_two.setAnswer(ans_two);
        
        
        //Session
        Session session = factory.openSession();
        //Transaction
        Transaction trans = session.beginTransaction();
        //Save
        session.save(q_one);
        session.save(q_two);
        session.save(ans_one);
        session.save(ans_two);
        trans.commit();
        session.close();
        factory.close();
    }
}
