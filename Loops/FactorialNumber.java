package Loops;

public class FactorialNumber {

	public static void main(String[] args) {
		//program to find he factorial of the number using for loop
		int number=5; //5! = 5*4*3*2*1 ===> 120
		
		//variable to store the final result;
		long factorial=1;
		long another_factorial=1;
		
		//implement into the loop
		for(int i=5;i>=1; --i) // start from 1 -----> 5, 1+1=2, 2+1=3, 3+1=4, 4+1=5 
			{
			factorial=factorial*i; //5*4*3*2*1
			System.out.println("index of loop: " + i);
			}
		System.out.println("Factorial of" +" "+ number + " is : " +factorial);
		for(int i=1;i<=number;i++) {
			another_factorial=another_factorial*i; // 1*2*3*4*5
			System.out.println("index of loop: " + i);
		}
		System.out.println("Factorial of" +" "+ number + " is : " +another_factorial);
	}
}