package org.campgemini.sms.controller;

import org.campgemini.sms.entity.Student;
import org.campgemini.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	//Dependency Injection
	private StudentService studentService;
	
	//Constructor injection
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//Handler method to handle list of students and return mode and view  
	// Also the below info has to go as model (data)
	@RequestMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	@RequestMapping("/students/new")
	public String createStudentForm(Model model) {
		//Create a student object to hold student from data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	
	
	
	
}