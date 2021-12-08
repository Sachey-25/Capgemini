package JavaOperators;

public class IncrementAndDecrementOperators {
	public static void main(String[] args) {
		// ++ and -- 
		// lets say Currency++ //Post increment Currency-- //Post Decrement
		// ++Currency //Pre-increment --Currency //Pre-decrement
		int let=10;
		int say=20;
		//Printing before increment operator
		System.out.println(let); //10
		System.out.println(say); //20
		let++;
		say++;
		//Printing after increment Operator
		System.out.println(let);//11
		System.out.println(say);//21
		let++;
		say++;
		System.out.println(let); //12
		System.out.println(say); //22
		System.out.println("=================SACHIN IS AN INTELLIGENT======================");
		++let;
		++say;
		System.out.println(let);
		System.out.println(say);
	}
}
