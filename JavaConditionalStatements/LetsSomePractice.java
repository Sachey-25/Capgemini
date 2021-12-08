package JavaConditionalStatements;
import java.util.Scanner;

public class LetsSomePractice {

	public static void main(String[] args) {
		//Program to check the given is positive or negative
		//Any number is greater then zero -- positive 
		//Any number is lesser then zero -- negative
		int number;
		//we all know know that we can check the condition using if statement
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check possitive or negative : ");
		number=sc.nextInt();
		sc.close();
		//Below line where the condition is being executed
		if(number > 0) {
			System.out.println(number + ": The number is possitive");
		}
		else {
			System.out.println(number + ": The number is negative");
		}
	}
}