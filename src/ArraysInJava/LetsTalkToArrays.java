package ArraysInJava;

import java.util.Arrays;

public class LetsTalkToArrays {
	/* 
	 //Looping through the array to access the array's elements
		System.out.println("Array Elements are: ");
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
			}
		//For Each loop <=== array's
		System.out.println("=====>Array Elements using for each Loop are: ");
		for(int sachin : age) {
			System.out.println(sachin);
	 */

	public static void main(String[] args) {
		//creating an array
		int[] age= {12,24,36,5,6,710,10}; //Single dimension array...!!
		//Program to compute sum and average of array elements
		int sum=0; 
		Double average;
		//access all of elements of arrays by looping for each Loop
		for(int result:age) {
			sum +=result;
		}	
		//Get all total number of elements
		int arrayLength=age.length;
		//Calculate average 
		//Convert the average from int to double
		average=((double)sum/(double)arrayLength);
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
		System.out.println("*******************************************************");
		
		//Printing the array, without loop
		String[] names= {"Sachin","Technical","Trainer","Java","Programming"};		
		System.out.println(Arrays.toString(names));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}