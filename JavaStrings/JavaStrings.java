package JavaStrings;

public class JavaStrings {
	public static void main(String[] args) {
		
		//Literals //new object <---- Strings in java
		
		String abc = "This is an example of string";
		System.out.println(abc);
		
		//With using new operator we can create strings in java
		String firstname = new String("My first name is Sachin");
		String city = new String("I belong to Bidar Karnataka");
		String designation = new String("I am a freelance technical trainer");
		System.out.println(firstname);
		System.out.println(city);
		System.out.println(designation);
		//How to check the type of String
		System.out.println(abc.getClass().getSimpleName());
		System.out.println(firstname.getClass().getSimpleName());
	}
}
