package InheritanceWithGetterandSetter;

public class Teacher {
	//in order to use getter and setter method we have take the variable into private
	private String destination="Teacher";
	private String name="JavaProgramming";
	
	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//class method
	void disp() {
		System.out.println("This is Teaching class");
	}
}
