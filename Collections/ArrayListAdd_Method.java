package Collections;

import java.util.ArrayList;

public class ArrayListAdd_Method {

	public static void main(String[] args) {
		//String[] array = str({10,20,30,40,"Bangalore","INR","Crypto","ShareMarket",10.0,3.11432});
		//ArrayList ===> Integer, String, and double..!
		ArrayList<Object> array_str = new ArrayList<Object>();
		System.out.println("*******************************************************");
		array_str.add("Wipro");
		array_str.add(60);
		array_str.add("Capgemini");
		array_str.add(70);
		array_str.add("Infosys");
		array_str.add(80);
		array_str.add("TechMahindra");
		array_str.add(90);		
		System.out.println("Elements of Array_str of string type :" + array_str);
		System.out.println("*******************************************************");
		//Create another an array-list
		ArrayList<Integer> array_int = new ArrayList<Integer>();
		array_int.add(10);
		array_int.add(20);
		array_int.add(30);
		array_int.add(40);
		System.out.println("Elements of Array_int of string type : " + array_int);		
		array_str.addAll(array_int);
		System.out.println("Elements after adding the string type and string integer" + array_str);
	}
}
