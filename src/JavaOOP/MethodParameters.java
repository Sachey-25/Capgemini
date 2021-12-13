package JavaOOP;

public class MethodParameters {
	
	//A method with no parameters
	public void display() {
		System.out.println("Method without pameter");
	}
	//Method with single parameter
	public void display_one(int parameter) {
		System.out.println("Method with a single parameter" + parameter);
	}
	
	//I would like to calculate square of a number using for loop.
	//creating a method
	public static int getSqaure(int number) {
		return number*number;
	}
	//MainMethod
	public static void main(String[] args) {		
		//Create an object
		MethodParameters anyname=new MethodParameters();
		//"Calling the method with no parameter";
		anyname.display();
		//"Calling the method with the single parameter");
		anyname.display_one(24);	
		
		//Implement the loop
		for(int i=0; i<=5; i++) {
		//Method call
		int sqaure=getSqaure(i);
		System.out.println("Sqaure of "+ i +"="+sqaure);		
		}
	}
}