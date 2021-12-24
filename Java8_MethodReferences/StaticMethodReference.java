package Java8_MethodReferences;

interface cricket{
	//Interface method
	public boolean checkSingleDigit(int x); //0---9	
}
class Digit{
	//Instance method 
	public static boolean isSingleDigit(int x) {
		return x>-10 && x<10;  // -10 ----  <10 // 0-9
	}
}
public class StaticMethodReference {
	public static void main(String[] args) {
		//Method reference
		cricket ck = Digit::isSingleDigit;
		System.out.println(ck);
		System.out.println("***************************");
		//Implement the lambda expression
		cricket ckt = (x) -> {return x>-10 && x<10;};
		System.out.println(ckt.checkSingleDigit(-10)); //True / false ...!!!!
	}
}
