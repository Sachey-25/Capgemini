package OverrideMethodToString;

public class Student {
	//I would like to store some student details.
	//Best practice in full development in terms of instance variable
	// using them in private access specifier
	private String studentName;
	private int studentAge;
	private String city;
	
	//We need constructor to initialize the value into the instance variable.
	Student(String name, int age, String city){
		this.studentName=name;
		this.studentAge=age;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Student details : [studentName=" + studentName + ", "
				+ "studentAge=" + studentAge + ", "
						+ "city=" + city + "]"; 
	}
}
