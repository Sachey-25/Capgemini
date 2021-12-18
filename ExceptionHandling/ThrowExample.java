package JustCheck;

public class ThrowExample {
	
	public static void CheckEligilibity(int studentage, int studentweight) {
		if(studentage<12 && studentweight<40) {
			throw new ArithmeticException("Student is not eligible for registration");
		}
		else {
			System.out.println("Student is eligible for registration");
		}
	}
	public static void main(String[] args) {
		CheckEligilibity(10,39);
		System.out.println("Have a nice day...!!!");
	}
}//https://www.eligibilitycheck.com