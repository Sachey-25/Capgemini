package Java8_MethodReferences;

import java.util.function.BiFunction;
class multiplication{
	//static method <--- using the static keyword
	public static int multiply(int num,int numb) {
		return num*numb;
	}	
}
public class MethodReferenceStaticMethod {
	public static void main(String[] args) {
		//BiFunction
		BiFunction<Integer,Integer,Integer> product = multiplication::multiply;
		int prod = product.apply(11, 5);
		System.out.println("Product of given number is : " + prod);		
	}
}
