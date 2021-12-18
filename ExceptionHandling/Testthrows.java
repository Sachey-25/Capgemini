package JustCheck;

import java.io.IOException;  //In build Package...!!!! 

public class Testthrows {
	//I am demonstrating the flow of throws clause using try and catch...!!
	//To check the normal flow of exception handling....!
	
	/*Syntax of throws:
		----------------
		return_type method_name() throws exception_Class_name{
		//Method_code
		 * the method code must have throw exception class with an object to the exception_class
	}*/
	void example() throws IOException{
		throw new IOException("This is an example of throws method..!");
	}

	public static void main(String[] args)  {
	try {
		Testthrows thr = new Testthrows();
			thr.example();
		}catch(Exception e){
			System.out.println("Exception handled....!");
			System.out.println("Because throws had given an object to throw clause");
			System.out.println("That's a reason throw block gets an exception, Hence it is");
			System.out.println("Handled........!!!!!!");
		}		
	
		System.out.println("This is the normal flow..");

	}

}
