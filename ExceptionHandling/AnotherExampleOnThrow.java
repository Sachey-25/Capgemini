package JustCheck;
import java.util.Scanner;
public class AnotherExampleOnThrow {
	//Method- A person is eligible for vote
	public static void validate() {
		Scanner input = new Scanner(System.in);					
		while(true) {
			System.out.println("Enter an age : ");
			int age = input.nextInt();
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else {
			System.out.println("Person is eligible to vote");
		}
		}
	}
	public static void main(String[] args) {
		//I need to invoke the method always from main function;
		validate();
	}
}