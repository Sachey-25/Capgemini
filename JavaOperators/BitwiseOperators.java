package JavaOperators;

public class BitwiseOperators {

	public static void main(String[] args) {
		int bitnumber=11 ; // 0000 1011 
		int bitanother=22 ; //000 10110
		
		//12:14 <=== 3 & 4 
		
		int result; 
		result=bitnumber&bitanother;
		System.out.println("Bit wise AND operator performed, and the value is: " + result);
		result=bitnumber|bitanother;
		System.out.println("Bit wise OR operator performed, and the value is: " + result);
		result=bitnumber^bitanother;
		System.out.println("Bit wise XOR operator performed, and the value is: " + result);
		result=~bitnumber;
		System.out.println("Bit wise negation operator performed, and the value is: " + result);
		result=~bitanother;
		System.out.println("Bit wise negation operator performed, and the value is: " + result);
		result=bitnumber<<2;
		System.out.println("Bit wise leftshift operator performed, and the value is: " + result);
		result=bitanother>>2;
		System.out.println("Bit wise rightshift operator performed, and the value is: " + result);
	}
}
