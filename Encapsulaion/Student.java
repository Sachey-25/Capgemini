package Encapsulaion;

//Employee ===> name, designation, salary(double), city, pin, project

class Student_info{
	//usn, stfname, stlname, stmarks, stdept, stcity;
	//Student information as the declared instance variables.
	private int stUsn;
	private String stFname;
	private String stLname;
	private int stMarks;
	private String stDept;
	private String stCity;
	//We need to create getter and setter methods
	public int getStUsn() {
		return stUsn;
	}
	public void setStUsn(int stUsn) {
		this.stUsn = stUsn;
	}
	public String getStFname() {
		return stFname;
	}
	public void setStFname(String stFname) {
		this.stFname = stFname;
	}
	public String getStLname() {
		return stLname;
	}
	public void setStLname(String stLname) {
		this.stLname = stLname;
	}
	public int getStMarks() {
		return stMarks;
	}
	public void setStMarks(int stMarks) {
		this.stMarks = stMarks;
	}
	public String getStDept() {
		return stDept;
	}
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	public String getStCity() {
		return stCity;
	}
	public void setStCity(String stCity) {
		this.stCity = stCity;
	}
}

public class Student {
	public static void main(String[] args) {
		//We need to create an object <===== Class <--- Object
		Student_info stob = new Student_info();
		stob.setStUsn(1010);
		stob.setStFname("Sachin");
		stob.setStLname("A");
		stob.setStMarks(34);
		stob.setStDept("CSE");
		stob.setStCity("Bangalore");
		System.out.println("Student Usn: " +stob.getStUsn());
		System.out.println("Student Firstname: "+ stob.getStFname());
		System.out.println("Student Lastname: "+stob.getStLname());
		System.out.println("Student Marks: "+ stob.getStMarks());
		System.out.println("Student Department: "+stob.getStDept());
		System.out.println("Student city: "+ stob.getStCity());
	}
}
