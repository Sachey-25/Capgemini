package StaticClass;


public class SingleSttaicBlock {
	static int num;
	static String name;
	
	static {
		num=97;
		name="Sachin, this is staic keyword in Java";
	}

	public static void main(String[] args) {
		// Single Static block
		System.out.println("Value of a number is : " + num);
		System.out.println("Value of a string is : " + name);
	}
}
