package org.campgemini.sms.service.impl;

import java.util.List;

import org.campgemini.sms.entity.Student;
import org.campgemini.sms.repository.StudentRepository;
import org.campgemini.sms.service.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService{
	
	//Inject the object of  repository 
	public StudentRepository studentRepository;	
	
	//Constructor is needed to store the values of repository been stored for entity data
	// We implemented Constructor dependency injection
	public StudentServiceImp(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
}