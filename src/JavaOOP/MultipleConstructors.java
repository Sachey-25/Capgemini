package JavaOOP;

//Classname Employee
class Employee_all{
	private int variable;
	
	//default constructor
	public Employee_all() {
		this.variable=10;
	}
	//Parameterized Constructor
	public Employee_all(int num) {
		this.variable=num;
	}
	//Method to access the value for integer
	public int getValue() {
		return variable;
	}
}
//Another class created as  - Student
class Student{
	String branch;
	String Usn;
	String semester;
	int rollno;
	String sname;	
	int age;
	String section;
	String contactno;
	//Parameterized constructor
	// With initialized student informations.
	public Student(String branch,String Usn,String semester,int rollno,String sname,int age,String section, String contactno){
		this.branch=branch;
		this.Usn=Usn;
		this.semester=semester;
		this.rollno=rollno;
		this.sname=sname;
		this.age=age;
		this.section=section;
		this.contactno=contactno;
	}
	//declaring the assigned variables with the method 
	void display() {
		System.out.println("Branch:"+ branch +" "+"Usn:" + Usn + " " + 
				"semester:" + semester +" ");
		 System.out.println("Rollno:"+rollno +" "+ "studentname:"+sname+
				 " " + "studentage :" + age+ " ");
		System.out.println("StudentSection:"+ section + " " + "Contactnumber:" + contactno);
	}
}
public class MultipleConstructors {
	public static void main(String[] args) {
		//Create a object for the class and passing the
		//Parameters to the constructor for the class Student
		Student sobj=new Student("CSE","1RE11CS041","7",041,"SACHIN A",28,"A","b848L8505050");
		//Displaying the student information
		sobj.display();
				
		System.out.println("*********************************************");
		System.out.println("*********************************************");
		//Object is created ----- For the class Employee
		Employee_all obj=new Employee_all();
		Employee_all Obj=new Employee_all(100);
		System.out.println(obj.getValue());
		System.out.println(Obj.getValue());
	}
}
