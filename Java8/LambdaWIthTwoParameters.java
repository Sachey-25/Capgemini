package Java8;

interface StringCont{
	//Method denoting for lambda expression	
	public String sconcat(String a, String b);
}
interface InterConcat{
	public int intconcat(int a, int b);
}
interface multiple{
	public int multi(int a, int b);
}
public class LambdaWIthTwoParameters {
	public static void main(String[] args) {
		//Lambda expression with multiple arguments
		StringCont sc = (a,b) -> a+b;
		System.out.println("Result: " + sc.sconcat("My Name", "Is Sachin"));
		//Lambda expression with multiple arguments
		InterConcat ic = (num_one,num_two) -> num_one+num_two;
		System.out.println("Result on 20 + 25 : " + ic.intconcat(20, 25));
		//Lambda Expression with multiply the numbers
		multiple mi = (a,b) -> a*b;
		System.out.println("Product of 24 and 67 : " + mi.multi(24, 67));

	}
}
