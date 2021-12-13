package JavaOOP;
//Program : Create a java method and add two number statically. 10+20=30

public class JavaMethods { 	
	//We can actually declare the other methods
	//Creating a method <<< Without Static reference
	public int addNumbers(int number_one,int number_two) {
		int addition=number_one+number_two;
		//returning a value <==== coming back to the screen after addition operation
		return addition;
	}
	//Creating a method <<< with Static reference
	public static int square(int num) {
		//2*2, 3*3, 14*14
		return num*num;
	}
	
	public static void main(String[] args) {
		//Main function/method <=== This from where the program execution takes place.		
		// a few functionality to be called here in main method		
		int number_one=10;
		int number_two=20;
		// I need to create an object <=== a referencing point for the method created.
		JavaMethods object=new JavaMethods();
		int result = object.addNumbers(number_one,number_two);
		System.out.println("Sum od 10 and 20 is:"+ result);
		
		//Implementation for the second method
		int res;
		//I don't need to create an object explicitly
		res=square(14);
		System.out.println("Square of the 14 is : " + res);
	}
}
