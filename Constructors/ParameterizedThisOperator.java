package JavaOOP.Constructors;
//Class ----> Constructor ----> methods ---> objects
class Employee{
	//states 
	int empId;
	String empName;	
	
	//Parameterized Constructor with two parameters
	public Employee(int sachin, String Sachin) {
		this.empId=sachin; //101
		this.empName=Sachin;//Sachin		
		//In order to call the states of the class into the constructor we will need this keyword
		// and this keyword which helps to initialize the value to the class property.		
	}
	//Method to get the employee details -- id and name
	void info() {
		System.out.println("Id: "+ empId + "Name: " + empName);
	}
}

public class ParameterizedThisOperator {
	public static void main(String[] args) {
		Employee emp=new Employee(101,"Sachin");
		Employee empl=new Employee(102,"Intel");
		Employee emplo=new Employee(103,"Demon");
		Employee employ=new Employee(104,"Programming");		
		emp.info();
		empl.info();
		emplo.info();
		employ.info();
	}
}
