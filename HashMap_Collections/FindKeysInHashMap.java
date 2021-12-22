package HashMap_Collections;

import java.util.HashMap;

public class FindKeysInHashMap {
	public static void main(String[] args) {
		
		//Check if a particular key exists in HashMap..!
		//Create a HashMap Object
		HashMap <Integer,String> Sports = new HashMap <Integer,String>();
		
		//Adding the elements to the hashmap
		Sports.put(11, "Cricket");
		Sports.put(12, "Football");
		Sports.put(13,"Baseball");
		Sports.put(14, "Hockey");
		Sports.put(15, "Rogby");
		
		//Checking Key Existence
		// Whether 11 is present
		boolean variable = Sports.containsKey(11);
		System.out.println("Key 11 is exists in HashMap ? : " + variable);				
		
		// Whether 12 is present 
		boolean varia= Sports.containsKey(12);
		System.out.println("Key 12 is exists in HashMap ? : " + varia);
		//Whether 14 is present
		boolean var = Sports.containsKey(14);
		System.out.println("Key 14 is exists in HashMap ? : " + var);
		//Whether 18 is present
		boolean va = Sports.containsKey(18);
		System.out.println("Key 18 is exists in HashMap ? : " + va);
		System.out.println("**************************************************");
		//Checking value Existence
		boolean variabl = Sports.containsValue("Cricket");
		System.out.println("Value Cricket is exists in HashMap ? : " + variabl);				
		
		// Whether 12 is present 
		boolean variab= Sports.containsValue("Hockey");
		System.out.println("Value Hockey is exists in HashMap ? : " + variab);
		//Whether 14 is present
		boolean vari = Sports.containsValue("Baseball");
		System.out.println("Value Baseball is exists in HashMap ? : " + vari);
		//Whether 18 is present
		boolean variablee = Sports.containsValue("Football");
		System.out.println("Value Football is exists in HashMap ? : " + variablee);
	}
}
