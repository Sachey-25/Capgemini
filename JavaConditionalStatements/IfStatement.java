package JavaConditionalStatements;

public class IfStatement {
	public static void main(String[] args) {
		String name="Sachin";
		int value=10;
		if(name=="Sachin") //true
		{
			System.out.println("Programming is fun");
			System.out.println("Hii.., There!! My name is If statement and I am given true expression");
		}
		System.out.println("=======This is a global Statement=======");
		if(true) {
			System.out.println("If block with boolean value");
			System.out.println("Once again good morning");
		}
		if(value==10) {
			System.out.println("If block with boolean value");
			System.out.println("Once again good morning");
			System.out.println("The value is 10 and this is if block");
		}
		System.out.println("******************************************");
		if(value!=10) {
			System.out.println("If block with boolean value");
			System.out.println("Once again good morning");
			System.out.println("The value is not equal 10 and this is if block");
		}else {
			System.out.println("This else block");
			System.out.println("This being executed due which if block is false");
		}System.out.println("******************************************");
		if(value<=10) {
			System.out.println("If block with boolean value");
			System.out.println("Once again good morning");
			System.out.println("The value is less than equal 10 and this is if block");
		}
		if(value>=10) {
			System.out.println("If block with boolean value");
			System.out.println("Once again good morning");
			System.out.println("The value is greater than equal to 10 and this is if block");
		}
	}
}