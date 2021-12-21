package OverrideMethodToString;

import java.util.ArrayList;

public class StudentDetails {

	public static void main(String[] args) {
		//In order to store the student details
		// I will go ahead and create a arrayList
		//Note:
		//1.  Whenever we dealing with the constructor make sure we create an object
		//2. The arrayList should be pointing to the class name if the constructor is
		// present in another class.
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student("Sachin",28,"Bangalore"));
		student.add(new Student("Sourav",44,"Kolkatta"));
		student.add(new Student("Rahul",45,"Indore"));
		student.add(new Student("Yuvraj",39,"Chandigarh"));
		student.add(new Student("Laxman",46,"Hydrabad"));
		student.add(new Student("Shewag",43,"Delhi"));
		student.add(new Student("Kaif",46,"Alahabad"));
		//loop ====> Iterate over the array elements
		for(Student details : student) {
			System.out.println(details);
		}
		
	}
}
