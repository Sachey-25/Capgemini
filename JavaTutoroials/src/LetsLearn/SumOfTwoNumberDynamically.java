package LetsLearn;
import java.util.Scanner;

public class SumOfTwoNumberDynamically {
	public static void main(String[] args) {
		int number_one, number_two, sum;
		Scanner sc=new Scanner(System.in); //Object has been created for scanner
		System.out.println("Enter first number: ");
		//I want my another number would be in next line // and store that in first
		number_one=sc.nextInt(); 
		System.out.println("Enter second number: ");
		number_two=sc.nextInt();
		//sc.close();
		//summation of two numbers
		sum=number_one+number_two;
		System.out.println("Sum of these numbers is : " + sum);
	}
}