package Loops;

import java.util.Scanner;
public class DoWhileforSumofPositiveNumbers {

	public static void main(String[] args) {
		// Program to find sum of positive numbers
		int sum=0,number;
		//Creating an object for scanner class
		Scanner input=new Scanner(System.in);
		
		//do...while loop implementation
		//until a number is positive
		do {
			//adds only positive number			
			System.out.println("Enter a number");
			number=input.nextInt();
			sum+=number;
			System.out.println("Sum of a number is : " + sum);
			
		}while(number>=0);
		System.out.println("Sum of a number is : " + sum);
		input.close();
	}
}
