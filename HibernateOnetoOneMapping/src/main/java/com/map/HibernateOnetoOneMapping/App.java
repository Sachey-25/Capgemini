package com.map.HibernateOnetoOneMapping;

import java.util.ArrayList;
import java.util.List;
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
        q_one.setQuestionId(123);
        q_one.setQuestionName("What is Java?"); 
        //Creating Answers
        Answer ans_one = new Answer();
        ans_one.setAnswerId(321);
        ans_one.setAnswer("Java is programming language.");
        ans_one.setQuestion(q_one);      
        //Creating Answers
        Answer ans_two = new Answer();
        ans_two.setAnswerId(322);
        ans_two.setAnswer("with the help of java we can create softwares");
        ans_two.setQuestion(q_one);        
        //Creating Answers
        Answer ans_three = new Answer();
        ans_three.setAnswerId(320);
        ans_three.setAnswer("Java has different type of frameworks");
        ans_three.setQuestion(q_one);        
        List<Answer> ans = new ArrayList<Answer>();
        ans.add(ans_one);
        ans.add(ans_two);
        ans.add(ans_three);
        q_one.setAnswers(ans);
        
        /* _________________________________
         * 
         */
        
        //Creating another quesion
        //Creating questions
        Question q_two = new Question();
        q_two.setQuestionId(11);
        q_two.setQuestionName("What is Hibernate?");
        //Creating Answers
        Answer first = new Answer();
        first.setAnswerId(10);
        first.setAnswer("Hibernate is an ORM tool.");
        first.setQuestion(q_two);      
        //Creating Answers
        Answer second = new Answer();
        second.setAnswerId(11);
        second.setAnswer("Which connects the database");
        second.setQuestion(q_two);        
        //Creating Answers
        Answer third = new Answer();
        third.setAnswerId(12);
        third.setAnswer("Hibernate is also a frameword");
        third.setQuestion(q_two);        
        List<Answer> list = new ArrayList<Answer>();
        list.add(first);
        list.add(second);
        list.add(third);
        q_one.setAnswers( list);
        //Session
        Session session = factory.openSession();
        //Transaction
        Transaction trans = session.beginTransaction();
        //Save
        session.save(q_one);
        session.save(ans_one);
        session.save(ans_two);
        session.save(ans_three);
        //Saving the second question
        session.save(q_two);
        session.save(first);
        session.save(second);
        session.save(third);
        trans.commit(); //Changes are made // Data is saved to database
        
        //Fetching the data //get() or load()
       Question question = (Question) session.get(Question.class, 123);
        System.out.println(question.getQuestionName());
        
        //Three answers <-- for loop
        for(Answer a: question.getAnswers()) {
        	System.out.println(a.getAnswer());
        }
        System.out.println("********************************");
        
        Question quest = (Question) session.get(Question.class, 11);
        System.out.println(quest.getQuestionName());
        
        //Three answers <-- for loop
        for(Answer b: quest.getAnswers()) {
        	System.out.println(b.getAnswer());
        }
        session.close();
        factory.close();
    }
}
