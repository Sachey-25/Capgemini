package org.campgemini.sms.service;

import java.util.List;

import org.campgemini.sms.entity.Student;

public interface StudentService {
	//Collections to store the data as per the entity class
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);

}