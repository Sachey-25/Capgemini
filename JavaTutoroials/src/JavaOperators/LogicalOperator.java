package JavaOperators;

public class LogicalOperator {

	public static void main(String[] args) {
		//Logical operator ===> Return boolean value ===> True or False
		//AND logical Operator ----> &&
		//OR Logical Operator -----> ||
		//Not Logical Operator ----> !
		
		/* AND : If both the operands are true it will returns true otherwise it will be false
		 * OR : If any one of the operands are true it will returns true otherwise it will be false
		 Not : Its a Negation or reverse of an operand*/ 
		
		boolean cond_one=true; // <====false=====>
		boolean cond_two=false; // false
		
		
		System.out.println("AND Logical Operator");
		System.out.println(cond_one&&cond_two); //false
		System.out.println("OR Logical Operator");
		System.out.println(cond_one||cond_two); //true
		
		System.out.println("AND Logical Operator");
		System.out.println(cond_one&&cond_two || cond_one && cond_two); //false
		System.out.println("OR Logical Operator");
		System.out.println(cond_one||cond_two && cond_one||cond_two); // true
		System.out.println("AND Logical Operator");
		
		System.out.println(!cond_one&&cond_two || cond_one && cond_two); //false
		System.out.println("OR Logical Operator");
		System.out.println(cond_one||cond_two && !cond_one||cond_two); // true

	}
}
