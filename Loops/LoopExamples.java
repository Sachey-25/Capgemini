package Loops;

public class LoopExamples {

	public static void main(String[] args) {
		//Program to count the natural numbers using for loop
		//1+.......+n
		
		int num=10, count, total=0;
		//Count will start from 1 and it will go till 10.
		for(count =1; count<=num; count++) {
			total += count; //Updating the counter so as to run till 10 times.
		}
		//total is a variable which store the total value.
		System.out.println("Sum of first 10 natural numbers is : " + total);
	}
}