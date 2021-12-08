package JavaConditionalStatements;

public class LetsPracticeContinue {

	public static void main(String[] args) {
		//Complete program to check positive or negative number		
		int number=14; //Defined the number statically
		// To check whether number is positive
		if(number>0) {
			System.out.println(number + " : Is the positive");
		}
		//To check whether number is negative
		else if(number<0) {
			System.out.println(number + " : Is the negative");
		}
		//To check whether number is zero
		else if(number==0) {
			System.out.println(number + " : is zero");
		}
		//Number invalid
		else {
			System.out.println("Number itself is invalid");
		}
	}
}
