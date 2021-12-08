package JavaConditionalStatements;

public class MultipleConditions {

	public static void main(String[] args) {
		// Program to check the greater number out of three given numbers
		int inr=1,euro=3,dollar=2; 
		if(inr<euro && inr>dollar) {
			System.out.println("INR is lesser then dollars and Euro");
		}
		else if(euro>inr && euro>dollar) {
			System.out.println("EURO is greater then dollars and INR");
		}
		else if(dollar>inr && dollar<euro) {
			System.out.println("Dollar is greater then INR and Lesser than Euro");
		}
		//Note : If all the if expressions are true it, the execution takes care 
		//first possible condition
	}
}