package org.campgemini;

import org.campgemini.model.User;
import org.campgemini.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Sachin","A","Sachin.pratik97@hotmail.com"));
		this.userRepository.save(new User("Tom","Cruise","TomCruise@email.com"));
		this.userRepository.save(new User("Tony","Stark","TonyStark@outlook.com"));
	}
}