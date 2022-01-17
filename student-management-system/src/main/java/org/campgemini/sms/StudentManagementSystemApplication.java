package org.campgemini.sms;

import org.campgemini.sms.entity.Student;
import org.campgemini.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		//I wanted to store the data to get them on the browser
		//Student class <--- I need to create object
		Student one= new Student(101L,"Sachin","A","sachin.pratik97@hotmail.com");
		studentRepository.save(one);		
		Student two = new Student(102L,"Sourav","Gangully","SouravGan@hotmail.com");
		studentRepository.save(two);	
		Student three = new Student(103L,"Virendra","Shewag","VirendraShew@hotmail.com");
		studentRepository.save(three);	
		Student four = new Student(104L,"Rahul","Dravid","RahulDrav@hotmail.com");
		studentRepository.save(four);	
		Student five = new Student(105L,"Anil","Kumble","Anilkumb@hotmail.com");
		studentRepository.save(five); 
	}
}
