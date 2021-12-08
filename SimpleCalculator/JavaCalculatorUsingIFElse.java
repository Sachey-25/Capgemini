package SimpleCalculator;
import java.util.Scanner;

public class JavaCalculatorUsingIFElse {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); // This calls in inputs 
		int firstnum, secondnum, ans;
		char choose;
		
		System.out.println("Enter first number");
		firstnum=input.nextInt();
		System.out.println("Enter second number");
		secondnum=input.nextInt();
		System.out.println("Enter an operation");
		choose=input.next().charAt(0);
		input.close();
		
		if(choose=='+') {
			ans=firstnum+secondnum;
			System.out.println(firstnum + " " + choose + " "+secondnum + " = " + ans);
		}
		else if(choose=='-') {
			ans=firstnum-secondnum;
			System.out.println(firstnum + " " + choose + " "+secondnum + " = " + ans);
		}
		else if(choose=='*') {
			ans=firstnum*secondnum;
			System.out.println(firstnum + " " + choose + " "+secondnum + " = " + ans);
		}
		else if(choose=='/') {
			ans=firstnum/secondnum;
			System.out.println(firstnum + " " + choose + " "+secondnum + " = " + ans);
		}
		else if(choose=='%') {
			ans=firstnum%secondnum;
			System.out.println(firstnum + " " + choose + " "+secondnum + " = " + ans);
		}
	}
}
