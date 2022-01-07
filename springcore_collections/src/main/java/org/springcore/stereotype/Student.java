package org.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Personal")
public class Student {
	@Value("Sachin A")
	private String studentName;
	@Value("Bangalore")
	private String city;
	
	@Value("#{list}")
	private List<String> address;	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	//Getter and setter methods
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
}
