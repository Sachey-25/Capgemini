package AggregationInJava;
// Created address and assigned with states of the same
class Address{
	int SteetNum;
	String city;
	String state;
	String country;
	//Parameterized Constructor to initialize the values for variables
	Address(int street, String c,String s, String Coun){
		this.SteetNum=street;
		this.city=c;
		this.state=s;
		this.country=Coun;
	}
}
//Created student class and assigned with states of the same
class Student{
	int rollno;
	String studentName;
	Address studentaddr;
	//Parameterized constructor to initialize the values for variables.
	Student(int roll, String name, Address addr){
		this.rollno=roll;
		this.studentName=name;
		this.studentaddr=addr;
	}
}
public class Aggregation {

	public static void main(String[] args) {
		//we need to create an object for the classes.
		//Object create for Address class
		Address ad = new Address(101,"Bidar","Karnataka","India");
		//Object created for Student class
		Student obj = new Student(101, "Sachin", ad);
		System.out.println("studentROllNum: "+obj.rollno);
		System.out.println("studentName: "+obj.studentName);
		System.out.println("SteetNumber: " +obj.studentaddr.SteetNum);
		System.out.println("CityName: "+obj.studentaddr.city);
		System.out.println("Statename: "+obj.studentaddr.state);
		System.out.println("Country: " +obj.studentaddr.country);	
		}
}