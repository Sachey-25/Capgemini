package org.Springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello to the World from maven spring!" );
        ApplicationContext context =
        		 new ClassPathXmlApplicationContext("config.xml");
        
        //Object created for spring application 
        // I need to connect this with JavaClass.
        Student student1=(Student) context.getBean("student");
        System.out.println(student1);
        Student stud=(Student) context.getBean("stud");
        System.out.println(stud);
    }
}
