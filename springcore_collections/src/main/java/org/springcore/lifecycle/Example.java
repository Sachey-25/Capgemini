package org.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Implementing the annotation life cycle of bean
public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
	}
	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	//Method lifecycle
	@PostConstruct
	public void start() {
		System.out.println("Starting Method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending Method");
	}
	
}