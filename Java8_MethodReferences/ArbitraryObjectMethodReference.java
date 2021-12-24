package Java8_MethodReferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArbitraryObjectMethodReference {
	public static void main(String[] args) {
		//Create a array list
		Integer [] stringArray = {10,20,30,60,80,90};
		/* Method reference to an instance method of arbitrary
		 * object of a particular type
		 */
		Arrays.sort(stringArray, Integer::compareTo);
		for(Integer temp:stringArray)
			System.out.println(temp);
		//stringArray.forEach(System.out::println);
		
		System.out.println("***********************************************************");
		List<String> numbers = Arrays.asList("Sachin","Sourav","Laxman");
		Collections.sort(numbers, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		numbers.forEach(System.out::println);
		//**Lambda Expression
		Collections.sort(numbers,(o1,o2) -> o1.compareTo(o2));
		//**Method reference
		Collections.sort(numbers,(String::compareTo));
		numbers.forEach(System.out::println);
		
		
		
		
		
		
		
	}
}
