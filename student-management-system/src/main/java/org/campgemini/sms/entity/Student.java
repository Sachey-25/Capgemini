package org.campgemini.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	//student info - id, fist-name, last-name and email.
	@Id
	private Long id;
	
	@Column(name="First_name" , nullable=false)	
	private String firstName;
	
	@Column(name="Last_name")
	private String lastName;
	
	@Column(name="Email")
	private String email;
		
	//Default constructor for the class Student
	public Student() {
	
	}
	
	//Parameterized constructor to map the data types
	public Student(Long id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}	
	
	//Getter and setter methods
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}