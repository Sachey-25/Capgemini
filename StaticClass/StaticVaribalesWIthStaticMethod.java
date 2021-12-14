package StaticClass;

public class StaticVaribalesWIthStaticMethod {
	// Static variables can be accessed directly in static method.
	static int variable;
	static String variable_one;
	
	//Static Method
	static void display() {
		System.out.println("Integer Variable : " + variable);
		System.out.println("String Variable : " + variable_one);
	}

	public static void main(String[] args) {
		//Invoke the static method
		display();	
	}
}
