package SwitchStatement;
import java.util.Scanner;

public class JavaCalculator {

	public static void main(String[] args) {
		char operator;
		double fnum,snum,result;
		//Create a Scanner object 
		Scanner input=new Scanner(System.in);		
		//Select the operator
		do {
				//Ask the user to enter numbers
				System.out.println("Enter first number");
				fnum=input.nextDouble();
				System.out.println("Choose an operator : +, -, *, / , %");
				operator=input.next().charAt(0);
				System.out.println("Enter second number"); 
				snum=input.nextDouble();			
				//Switch statement
				switch(operator) {
				//perform addition between two numbers
				case '+':
					result=fnum+snum;
					System.out.println("Additon of two numbers");
					System.out.println(fnum + "+" + snum + "=" + result);
					break;
				//perform Subtraction between two numbers
				case '-':
					result=fnum-snum;
					System.out.println("Subtraction of two numbers");
					System.out.println(fnum + "-" + snum + "=" + result);
					break;
				//perform Multiplication between two numbers
				case '*':
					result=fnum*snum;
					System.out.println("Multiplication of two numbers");
					System.out.println(fnum + "*" + snum + "=" + result);
					break;
				//perform Division between two numbers
				case '/':
					result=fnum/snum;
					System.out.println("Division of two numbers");
					System.out.println(fnum + "/" + snum + "=" + result);
					break;
				//perform Modulus between two numbers
				case '%':
					result=fnum%snum;
					System.out.println("Modulos of two numbers");
					System.out.println(fnum + "%" + snum + "=" + result);
					break;
				
				default:
					System.out.println("Operation Invalid");
					
				}
				
		}
				while(true);
	
	}
	
}
