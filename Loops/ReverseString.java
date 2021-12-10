package Loops;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Program a to reverse a string if string = SACHIN reversed = NIHCAS
		
		String original_string, reverse_string=" ";
		System.out.println("Enter the string to be reversed: ");
		//Creating an object to the scanner class
		Scanner string=new Scanner(System.in);// is responsible to capture an input
		//Capturing the input from the user
		original_string=string.nextLine();
		
		//Note: Whenever we are dealing with string make sure will look for the 
		//length of the string!!!!!! 
		int length=original_string.length(); 
		//loop to traverse complete length of the string given
		for(int i=length-1;i>=0;i--) {  
			//SACHIN ===> i=6-1:N; i=6-2:I; i=6-3:H, i=6-4:C, i=6-5:A, i:6-6:S
			reverse_string = reverse_string+original_string.charAt(i);
		}
		System.out.println(reverse_string);
		string.close();
		
	}

}
