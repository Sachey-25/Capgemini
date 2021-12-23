package JavaStrings;

public class StringMethods {

	public static void main(String[] args) {
	//CharAt() method
		//CharAt method returns the character at the specified index in a string.
		//Create a String
		
		String strange="Avergers went into past to get the infinity stones";
		//Lets utilize charAt() method <-- Index position
		//Check for the first letter in the string
		char firstchar = strange.charAt(0);
		//Check for the 6th letter
		char sixthchar = strange.charAt(5);
		//Check for the 11th letter
		char eleventhchar = strange.charAt(10);
		//check for the 20th letter
		char twentythchar = strange.charAt(19);
		
		System.out.println("Charecter at 0 index is : " + firstchar);
		System.out.println("Charecter at 6th index is : " + sixthchar);
		System.out.println("Charecter at 11th index is : " + eleventhchar);
		System.out.println("Charecter at 20th index is : " + twentythchar);
	//equals()
		String fchar = new String("A");
		String schar = new String("B");
		System.out.println("Checking fchar and schar are equal:" + fchar.equals(schar));
	//equalsIgnoreCase()
		//---> Comparing the two strings : Boolean value : true / false!
		System.out.println("Checking fchar and schar are equalortoignore:" + fchar.equalsIgnoreCase(schar));
	//Compare
	//----->The compare method is used for comparing two strings lexicographically [0 or 1]
	// Each character of the both the string is converted into a Unicode value for comparison
		String str="String method compareTo";
		String compare="CompareTo";
		String comp ="CompareTo method";
		
		int variable = compare.compareTo(comp);
		System.out.println("Comparing the string 1 and string 2: " + variable);
		// Using the compare to method i can check length of a string
		 // This is going to print negative number
		System.out.println(compare.compareTo(comp));
		
		// This is also prints positive number
		System.out.println(comp.compareTo(compare)); 
		System.out.println("************************************************");
		System.out.println(str.compareTo(compare)); 
		
		
		/*Note: If the comparator string has more characters than 
		on camparable string then i will get positive numbers
		and if the comparator string has less characters than on 
		comparable string then i will get negative number
		and also if the strings are equal it will return 0 */
		
		//String split method()
		//It splits the string and returns he array of substrings that matches the 
		//given regular expression. limit is a result threshold here (length)
		String original = "Sachin Github";
		System.out.println("Before splitting the string is: " + original);
		//String object and place split method.
		String splittest[] = original.split("c");	
		System.out.println("String splitted at @ and current string is :");
		for(String temp : splittest)
			System.out.println(temp);
	}

}
