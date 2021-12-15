package Inheritance;

//Base class 
public class InheritanceExample {
	//Parent class data members
	String fname="Sachin";
	String lname="A";
	String city="Bangalore";	
	//One base Method
	void person_info() {
		System.out.println("Firstname:" + fname + "LastName"+lname +"City:"+ city );
	}
	public static void main(String[] args) {
		Inheritance object = new Inheritance(); //Object created for child class
		object.person_info();
		System.out.println(object.another_person + " " +object.value + " "+object.data);
	}
}	
	/* I would like to utilize these data to derived class */
//Creating a derived class to make use of base class data.
	class Inheritance extends InheritanceExample{
		String another_person="Programming";
		String value="Java Programming";
		String data="Cricket";
}