package Loops;

import java.util.Scanner;

public class SumofNumbersUsingWhileLoop {

	public static void main(String[] args) {
		// program to find the sum of positive numbers
		
		int sum=0;
		//create an object to the Scanner class
		Scanner input=new Scanner(System.in);
		//capture the input from an user
		System.out.println("Enter a number : ");
		int number = input.nextInt();
		
		//Calling the while loop
		while(number>=0) {
			sum=sum+number;			
			number--;
		}
		System.out.println("sum of entered number is : " + sum);
		

	}

}
