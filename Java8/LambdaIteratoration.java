package Java8;

import java.util.ArrayList;

public class LambdaIteratoration {
	public static void main(String[] args) {
		// Iterating collections using for-each loop
		
		//I would like to create a list
		ArrayList<Integer> value = new ArrayList<Integer>();
		//Adding the elements to the array list
		value.add(10);
		value.add(20);
		value.add(30);
		value.add(40);
		value.add(50);
	//For Each loop
		for(Integer var:value)
			System.out.println(var);
		//Lambda Expression
		System.out.println("Lambda Expression.......");
		value.forEach((numbers) -> System.out.println(numbers));

	}
}
