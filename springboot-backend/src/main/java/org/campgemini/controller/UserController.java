package org.campgemini.controller;

import java.util.List;

import org.campgemini.model.User;
import org.campgemini.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	//first name, last name, email
	@GetMapping("users")
	public List<User> getUsers(){
		return this.userRepository.findAll();
	}

}
